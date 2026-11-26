package com.google.protobuf;

import com.google.android.gms.cast.Cast;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import w.c;

final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final Processor processor;

    public static class DecodeUtil {
        private DecodeUtil() {
        }

        public static void handleFourBytes(byte b7, byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!isNotTrailingByte(b10)) {
                if ((((b10 + 112) + (b7 << 28)) >> 30) == 0 && !isNotTrailingByte(b11) && !isNotTrailingByte(b12)) {
                    int iTrailingByteValue = ((b7 & 7) << 18) | (trailingByteValue(b10) << 12) | (trailingByteValue(b11) << 6) | trailingByteValue(b12);
                    cArr[i10] = highSurrogate(iTrailingByteValue);
                    cArr[i10 + 1] = lowSurrogate(iTrailingByteValue);
                    return;
                }
            }
            throw InvalidProtocolBufferException.invalidUtf8();
        }

        public static void handleOneByte(byte b7, char[] cArr, int i10) {
            cArr[i10] = (char) b7;
        }

        public static void handleThreeBytes(byte b7, byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (isNotTrailingByte(b10) || ((b7 == -32 && b10 < -96) || ((b7 == -19 && b10 >= -96) || isNotTrailingByte(b11)))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i10] = (char) (((b7 & 15) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11));
        }

        public static void handleTwoBytes(byte b7, byte b10, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (b7 < -62 || isNotTrailingByte(b10)) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            cArr[i10] = (char) (((b7 & 31) << 6) | trailingByteValue(b10));
        }

        private static char highSurrogate(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b7) {
            return b7 > -65;
        }

        public static boolean isOneByte(byte b7) {
            return b7 >= 0;
        }

        public static boolean isThreeBytes(byte b7) {
            return b7 < -16;
        }

        public static boolean isTwoBytes(byte b7) {
            return b7 < -32;
        }

        private static char lowSurrogate(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b7) {
            return b7 & 63;
        }
    }

    public static abstract class Processor {
        private static int partialIsValidUtf8(ByteBuffer byteBuffer, int i10, int i11) {
            int iEstimateConsecutiveAscii = i10 + Utf8.estimateConsecutiveAscii(byteBuffer, i10, i11);
            while (iEstimateConsecutiveAscii < i11) {
                int i12 = iEstimateConsecutiveAscii + 1;
                byte b7 = byteBuffer.get(iEstimateConsecutiveAscii);
                if (b7 >= 0) {
                    iEstimateConsecutiveAscii = i12;
                } else if (b7 < -32) {
                    if (i12 >= i11) {
                        return b7;
                    }
                    if (b7 < -62 || byteBuffer.get(i12) > -65) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 2;
                } else {
                    if (b7 >= -16) {
                        if (i12 >= i11 - 2) {
                            return Utf8.incompleteStateFor(byteBuffer, b7, i12, i11 - i12);
                        }
                        int i13 = iEstimateConsecutiveAscii + 2;
                        byte b10 = byteBuffer.get(i12);
                        if (b10 <= -65) {
                            if ((((b10 + 112) + (b7 << 28)) >> 30) == 0) {
                                int i14 = iEstimateConsecutiveAscii + 3;
                                if (byteBuffer.get(i13) <= -65) {
                                    iEstimateConsecutiveAscii += 4;
                                    if (byteBuffer.get(i14) > -65) {
                                    }
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return Utf8.incompleteStateFor(byteBuffer, b7, i12, i11 - i12);
                    }
                    int i15 = iEstimateConsecutiveAscii + 2;
                    byte b11 = byteBuffer.get(i12);
                    if (b11 > -65 || ((b7 == -32 && b11 < -96) || ((b7 == -19 && b11 >= -96) || byteBuffer.get(i15) > -65))) {
                        return -1;
                    }
                    iEstimateConsecutiveAscii += 3;
                }
            }
            return 0;
        }

        public final String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return decodeUtf8(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
            }
            return byteBuffer.isDirect() ? decodeUtf8Direct(byteBuffer, i10, i11) : decodeUtf8Default(byteBuffer, i10, i11);
        }

        public abstract String decodeUtf8(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        public final String decodeUtf8Default(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b7 = byteBuffer.get(i10);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                i10++;
                DecodeUtil.handleOneByte(b7, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = byteBuffer.get(i10);
                if (DecodeUtil.isOneByte(b10)) {
                    int i16 = i14 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = byteBuffer.get(i17);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i17++;
                        DecodeUtil.handleOneByte(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i10 += 2;
                    DecodeUtil.handleTwoBytes(b10, byteBuffer.get(i15), cArr, i14);
                    i14++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    DecodeUtil.handleThreeBytes(b10, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = byteBuffer.get(i15);
                    int i19 = i10 + 3;
                    byte b13 = byteBuffer.get(i10 + 2);
                    i10 += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        public abstract String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException;

        public abstract int encodeUtf8(String str, byte[] bArr, int i10, int i11);

        public final void encodeUtf8(String str, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int iArrayOffset = byteBuffer.arrayOffset();
                Java8Compatibility.position(byteBuffer, Utf8.encode(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            } else if (byteBuffer.isDirect()) {
                encodeUtf8Direct(str, byteBuffer);
            } else {
                encodeUtf8Default(str, byteBuffer);
            }
        }

        public final void encodeUtf8Default(String str, ByteBuffer byteBuffer) {
            int length = str.length();
            int iPosition = byteBuffer.position();
            int i10 = 0;
            while (i10 < length) {
                try {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt >= 128) {
                        break;
                    }
                    byteBuffer.put(iPosition + i10, (byte) cCharAt);
                    i10++;
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            if (i10 == length) {
                Java8Compatibility.position(byteBuffer, iPosition + i10);
                return;
            }
            iPosition += i10;
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    byteBuffer.put(iPosition, (byte) cCharAt2);
                } else if (cCharAt2 < 2048) {
                    int i11 = iPosition + 1;
                    try {
                        byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                        byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                        iPosition = i11;
                    } catch (IndexOutOfBoundsException unused2) {
                        iPosition = i11;
                    }
                } else {
                    if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                        int i12 = i10 + 1;
                        if (i12 != length) {
                            try {
                                char cCharAt3 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    int i13 = iPosition + 1;
                                    try {
                                        byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                        int i14 = iPosition + 2;
                                        try {
                                            byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                            iPosition += 3;
                                            byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                            byteBuffer.put(iPosition, (byte) ((codePoint & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                            i10 = i12;
                                        } catch (IndexOutOfBoundsException unused3) {
                                            i10 = i12;
                                            iPosition = i14;
                                        }
                                    } catch (IndexOutOfBoundsException unused4) {
                                        iPosition = i13;
                                        i10 = i12;
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                            }
                            i10 = i12;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(i10) + " at index " + (Math.max(i10, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                        }
                        throw new UnpairedSurrogateException(i10, length);
                    }
                    int i15 = iPosition + 1;
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                    iPosition += 2;
                    byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                }
                i10++;
                iPosition++;
            }
            Java8Compatibility.position(byteBuffer, iPosition);
        }

        public abstract void encodeUtf8Direct(String str, ByteBuffer byteBuffer);

        public final boolean isValidUtf8(ByteBuffer byteBuffer, int i10, int i11) {
            return partialIsValidUtf8(0, byteBuffer, i10, i11) == 0;
        }

        public final boolean isValidUtf8(byte[] bArr, int i10, int i11) {
            return partialIsValidUtf8(0, bArr, i10, i11) == 0;
        }

        public final int partialIsValidUtf8(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? partialIsValidUtf8Direct(i10, byteBuffer, i11, i12) : partialIsValidUtf8Default(i10, byteBuffer, i11, i12);
            }
            int iArrayOffset = byteBuffer.arrayOffset();
            return partialIsValidUtf8(i10, byteBuffer.array(), i11 + iArrayOffset, iArrayOffset + i12);
        }

        public abstract int partialIsValidUtf8(int i10, byte[] bArr, int i11, int i12);

        public final int partialIsValidUtf8Default(int r6, java.nio.ByteBuffer r7, int r8, int r9) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.Processor.partialIsValidUtf8Default(int, java.nio.ByteBuffer, int, int):int");
        }

        public abstract int partialIsValidUtf8Direct(int i10, ByteBuffer byteBuffer, int i11, int i12);
    }

    public static final class SafeProcessor extends Processor {
        private static int partialIsValidUtf8(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return partialIsValidUtf8NonAscii(bArr, i10, i11);
        }

        private static int partialIsValidUtf8NonAscii(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b7 = bArr[i10];
                if (b7 < 0) {
                    if (b7 < -32) {
                        if (i12 >= i11) {
                            return b7;
                        }
                        if (b7 >= -62) {
                            i10 += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b7 < -16) {
                        if (i12 >= i11 - 1) {
                            return Utf8.incompleteStateFor(bArr, i12, i11);
                        }
                        int i13 = i10 + 2;
                        byte b10 = bArr[i12];
                        if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                            i10 += 3;
                            if (bArr[i13] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 2) {
                        return Utf8.incompleteStateFor(bArr, i12, i11);
                    }
                    int i14 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 <= -65) {
                        if ((((b11 + 112) + (b7 << 28)) >> 30) == 0) {
                            int i15 = i10 + 3;
                            if (bArr[i14] <= -65) {
                                i10 += 4;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override
        public String decodeUtf8(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b7 = bArr[i10];
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                i10++;
                DecodeUtil.handleOneByte(b7, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (DecodeUtil.isOneByte(b10)) {
                    int i16 = i14 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = bArr[i17];
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        i17++;
                        DecodeUtil.handleOneByte(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (i15 >= i12) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    i10 += 2;
                    DecodeUtil.handleTwoBytes(b10, bArr[i15], cArr, i14);
                    i14++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (i15 >= i12 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    DecodeUtil.handleThreeBytes(b10, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b13 = bArr[i10 + 2];
                    i10 += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            return decodeUtf8Default(byteBuffer, i10, i11);
        }

        @Override
        public int encodeUtf8(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new UnpairedSurrogateException(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new UnpairedSurrogateException(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH);
                }
                i15++;
            }
            return i16;
        }

        @Override
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            encodeUtf8Default(str, byteBuffer);
        }

        @Override
        public int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.SafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override
        public int partialIsValidUtf8Direct(int i10, ByteBuffer byteBuffer, int i11, int i12) {
            return partialIsValidUtf8Default(i10, byteBuffer, i11, i12);
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i10, int i11) {
            super(c.h(i10, i11, "Unpaired surrogate at index ", " of "));
        }
    }

    public static final class UnsafeProcessor extends Processor {
        public static boolean isAvailable() {
            return UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations();
        }

        private static int partialIsValidUtf8(long j9, int i10) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j9, i10);
            long j10 = j9 + ((long) iUnsafeEstimateConsecutiveAscii);
            int i11 = i10 - iUnsafeEstimateConsecutiveAscii;
            while (true) {
                byte b7 = 0;
                while (i11 > 0) {
                    long j11 = j10 + 1;
                    b7 = UnsafeUtil.getByte(j10);
                    if (b7 < 0) {
                        j10 = j11;
                        break;
                    }
                    i11--;
                    j10 = j11;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (b7 < -32) {
                    if (i12 == 0) {
                        return b7;
                    }
                    i11 -= 2;
                    if (b7 >= -62) {
                        long j12 = 1 + j10;
                        if (UnsafeUtil.getByte(j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i12 < 2) {
                        return unsafeIncompleteStateFor(j10, b7, i12);
                    }
                    i11 -= 3;
                    long j13 = 1 + j10;
                    byte b10 = UnsafeUtil.getByte(j10);
                    if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                        j10 += 2;
                        if (UnsafeUtil.getByte(j13) > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 < 3) {
                    return unsafeIncompleteStateFor(j10, b7, i12);
                }
                i11 -= 4;
                long j14 = 1 + j10;
                byte b11 = UnsafeUtil.getByte(j10);
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b7 << 28)) >> 30) == 0) {
                        long j15 = 2 + j10;
                        if (UnsafeUtil.getByte(j14) <= -65) {
                            j10 += 3;
                            if (UnsafeUtil.getByte(j15) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }

        private static int partialIsValidUtf8(byte[] bArr, long j9, int i10) {
            int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j9, i10);
            int i11 = i10 - iUnsafeEstimateConsecutiveAscii;
            long j10 = j9 + ((long) iUnsafeEstimateConsecutiveAscii);
            while (true) {
                byte b7 = 0;
                while (i11 > 0) {
                    long j11 = j10 + 1;
                    b7 = UnsafeUtil.getByte(bArr, j10);
                    if (b7 < 0) {
                        j10 = j11;
                        break;
                    }
                    i11--;
                    j10 = j11;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (b7 < -32) {
                    if (i12 == 0) {
                        return b7;
                    }
                    i11 -= 2;
                    if (b7 >= -62) {
                        long j12 = 1 + j10;
                        if (UnsafeUtil.getByte(bArr, j10) <= -65) {
                            j10 = j12;
                        }
                    }
                    return -1;
                }
                if (b7 < -16) {
                    if (i12 < 2) {
                        return unsafeIncompleteStateFor(bArr, b7, j10, i12);
                    }
                    i11 -= 3;
                    long j13 = 1 + j10;
                    byte b10 = UnsafeUtil.getByte(bArr, j10);
                    if (b10 <= -65 && ((b7 != -32 || b10 >= -96) && (b7 != -19 || b10 < -96))) {
                        j10 += 2;
                        if (UnsafeUtil.getByte(bArr, j13) > -65) {
                        }
                    }
                    return -1;
                }
                if (i12 < 3) {
                    return unsafeIncompleteStateFor(bArr, b7, j10, i12);
                }
                i11 -= 4;
                long j14 = 1 + j10;
                byte b11 = UnsafeUtil.getByte(bArr, j10);
                if (b11 <= -65) {
                    if ((((b11 + 112) + (b7 << 28)) >> 30) == 0) {
                        long j15 = 2 + j10;
                        if (UnsafeUtil.getByte(bArr, j14) <= -65) {
                            j10 += 3;
                            if (UnsafeUtil.getByte(bArr, j15) > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
        }

        private static int unsafeEstimateConsecutiveAscii(long j9, int i10) {
            if (i10 < 16) {
                return 0;
            }
            int i11 = (int) ((-j9) & 7);
            int i12 = i11;
            while (i12 > 0) {
                long j10 = 1 + j9;
                if (UnsafeUtil.getByte(j9) < 0) {
                    return i11 - i12;
                }
                i12--;
                j9 = j10;
            }
            int i13 = i10 - i11;
            while (i13 >= 8 && (UnsafeUtil.getLong(j9) & Utf8.ASCII_MASK_LONG) == 0) {
                j9 += 8;
                i13 -= 8;
            }
            return i10 - i13;
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j9, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j9) & 7);
            while (i11 < i12) {
                long j10 = 1 + j9;
                if (UnsafeUtil.getByte(bArr, j9) < 0) {
                    return i11;
                }
                i11++;
                j9 = j10;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (UnsafeUtil.getLong((Object) bArr, UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + j9) & Utf8.ASCII_MASK_LONG) != 0) {
                    break;
                }
                j9 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j11 = j9 + 1;
                if (UnsafeUtil.getByte(bArr, j9) < 0) {
                    return i11;
                }
                i11++;
                j9 = j11;
            }
            return i10;
        }

        private static int unsafeIncompleteStateFor(long j9, int i10, int i11) {
            if (i11 == 0) {
                return Utf8.incompleteStateFor(i10);
            }
            if (i11 == 1) {
                return Utf8.incompleteStateFor(i10, UnsafeUtil.getByte(j9));
            }
            if (i11 == 2) {
                return Utf8.incompleteStateFor(i10, UnsafeUtil.getByte(j9), UnsafeUtil.getByte(j9 + 1));
            }
            throw new AssertionError();
        }

        private static int unsafeIncompleteStateFor(byte[] bArr, int i10, long j9, int i11) {
            if (i11 == 0) {
                return Utf8.incompleteStateFor(i10);
            }
            if (i11 == 1) {
                return Utf8.incompleteStateFor(i10, UnsafeUtil.getByte(bArr, j9));
            }
            if (i11 == 2) {
                return Utf8.incompleteStateFor(i10, UnsafeUtil.getByte(bArr, j9), UnsafeUtil.getByte(bArr, j9 + 1));
            }
            throw new AssertionError();
        }

        @Override
        public String decodeUtf8(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            Charset charset = Internal.UTF_8;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            return str;
        }

        @Override
        public String decodeUtf8Direct(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer) + ((long) i10);
            long j9 = ((long) i11) + jAddressOffset;
            char[] cArr = new char[i11];
            int i12 = 0;
            while (jAddressOffset < j9) {
                byte b7 = UnsafeUtil.getByte(jAddressOffset);
                if (!DecodeUtil.isOneByte(b7)) {
                    break;
                }
                jAddressOffset++;
                DecodeUtil.handleOneByte(b7, cArr, i12);
                i12++;
            }
            int i13 = i12;
            while (jAddressOffset < j9) {
                long j10 = jAddressOffset + 1;
                byte b10 = UnsafeUtil.getByte(jAddressOffset);
                if (DecodeUtil.isOneByte(b10)) {
                    int i14 = i13 + 1;
                    DecodeUtil.handleOneByte(b10, cArr, i13);
                    long j11 = j10;
                    while (j11 < j9) {
                        byte b11 = UnsafeUtil.getByte(j11);
                        if (!DecodeUtil.isOneByte(b11)) {
                            break;
                        }
                        j11++;
                        DecodeUtil.handleOneByte(b11, cArr, i14);
                        i14++;
                    }
                    i13 = i14;
                    jAddressOffset = j11;
                } else if (DecodeUtil.isTwoBytes(b10)) {
                    if (j10 >= j9) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    jAddressOffset += 2;
                    DecodeUtil.handleTwoBytes(b10, UnsafeUtil.getByte(j10), cArr, i13);
                    i13++;
                } else if (DecodeUtil.isThreeBytes(b10)) {
                    if (j10 >= j9 - 1) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    long j12 = 2 + jAddressOffset;
                    jAddressOffset += 3;
                    DecodeUtil.handleThreeBytes(b10, UnsafeUtil.getByte(j10), UnsafeUtil.getByte(j12), cArr, i13);
                    i13++;
                } else {
                    if (j10 >= j9 - 2) {
                        throw InvalidProtocolBufferException.invalidUtf8();
                    }
                    byte b12 = UnsafeUtil.getByte(j10);
                    long j13 = jAddressOffset + 3;
                    byte b13 = UnsafeUtil.getByte(2 + jAddressOffset);
                    jAddressOffset += 4;
                    DecodeUtil.handleFourBytes(b10, b12, b13, UnsafeUtil.getByte(j13), cArr, i13);
                    i13 += 2;
                }
            }
            return new String(cArr, 0, i13);
        }

        @Override
        public int encodeUtf8(String str, byte[] bArr, int i10, int i11) {
            long j9;
            long j10;
            long j11;
            int i12;
            char cCharAt;
            long j12 = i10;
            long j13 = ((long) i11) + j12;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j9 = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(bArr, j12, (byte) cCharAt);
                i13++;
                j12 = 1 + j12;
            }
            if (i13 == length) {
                return (int) j12;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j12 < j13) {
                    UnsafeUtil.putByte(bArr, j12, (byte) cCharAt2);
                    j11 = j13;
                    j10 = j9;
                    j12 += j9;
                } else if (cCharAt2 >= 2048 || j12 > j13 - 2) {
                    j10 = j9;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j12 > j13 - 3) {
                        j11 = j13;
                        if (j12 > j11 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new UnpairedSurrogateException(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j12);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                UnsafeUtil.putByte(bArr, j12, (byte) ((codePoint >>> 18) | 240));
                                UnsafeUtil.putByte(bArr, j12 + j10, (byte) (((codePoint >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                long j14 = j12 + 3;
                                UnsafeUtil.putByte(bArr, j12 + 2, (byte) (((codePoint >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                j12 += 4;
                                UnsafeUtil.putByte(bArr, j14, (byte) ((codePoint & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new UnpairedSurrogateException(i13 - 1, length);
                    }
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j15 = j12 + 2;
                    j11 = j13;
                    UnsafeUtil.putByte(bArr, j12 + j10, (byte) (((cCharAt2 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                    j12 += 3;
                    UnsafeUtil.putByte(bArr, j15, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                } else {
                    j10 = j9;
                    long j16 = j12 + j10;
                    UnsafeUtil.putByte(bArr, j12, (byte) ((cCharAt2 >>> 6) | 960));
                    j12 += 2;
                    UnsafeUtil.putByte(bArr, j16, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                    j11 = j13;
                }
                i13++;
                j9 = j10;
                j13 = j11;
            }
            return (int) j12;
        }

        @Override
        public void encodeUtf8Direct(String str, ByteBuffer byteBuffer) {
            long j9;
            char c10;
            long j10;
            int i10;
            char c11;
            char cCharAt;
            long jAddressOffset = UnsafeUtil.addressOffset(byteBuffer);
            long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
            long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
            int length = str.length();
            if (length > jLimit - jPosition) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
            }
            int i11 = 0;
            while (true) {
                j9 = 1;
                c10 = 128;
                if (i11 >= length || (cCharAt = str.charAt(i11)) >= 128) {
                    break;
                }
                UnsafeUtil.putByte(jPosition, (byte) cCharAt);
                i11++;
                jPosition = 1 + jPosition;
            }
            if (i11 == length) {
                Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
                return;
            }
            while (i11 < length) {
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 >= c10 || jPosition >= jLimit) {
                    j10 = j9;
                    if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                        long j11 = jPosition + j10;
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        UnsafeUtil.putByte(j11, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                    } else {
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            jAddressOffset = jAddressOffset;
                            jLimit = jLimit;
                            if (jPosition > jLimit - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                                    throw new UnpairedSurrogateException(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt3 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    UnsafeUtil.putByte(jPosition, (byte) ((codePoint >>> 18) | 240));
                                    c11 = 128;
                                    UnsafeUtil.putByte(jPosition + j10, (byte) (((codePoint >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                    long j12 = jPosition + 3;
                                    UnsafeUtil.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                    jPosition += 4;
                                    UnsafeUtil.putByte(j12, (byte) ((codePoint & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new UnpairedSurrogateException(i11 - 1, length);
                        }
                        UnsafeUtil.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                        long j13 = jPosition + 2;
                        UnsafeUtil.putByte(jPosition + j10, (byte) (((cCharAt2 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                        jPosition += 3;
                        UnsafeUtil.putByte(j13, (byte) ((cCharAt2 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                    }
                    c11 = 128;
                } else {
                    UnsafeUtil.putByte(jPosition, (byte) cCharAt2);
                    jAddressOffset = jAddressOffset;
                    jLimit = jLimit;
                    c11 = c10;
                    jPosition += j9;
                    j10 = j9;
                }
                i11++;
                c10 = c11;
                j9 = j10;
                jAddressOffset = jAddressOffset;
                jLimit = jLimit;
            }
            Java8Compatibility.position(byteBuffer, (int) (jPosition - jAddressOffset));
        }

        @Override
        public int partialIsValidUtf8(int r10, byte[] r11, int r12, int r13) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8(int, byte[], int, int):int");
        }

        @Override
        public int partialIsValidUtf8Direct(int r9, java.nio.ByteBuffer r10, int r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.Utf8.UnsafeProcessor.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        processor = (!UnsafeProcessor.isAvailable() || Android.isOnAndroidDevice()) ? new SafeProcessor() : new UnsafeProcessor();
    }

    private Utf8() {
    }

    public static String decodeUtf8(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(byteBuffer, i10, i11);
    }

    public static String decodeUtf8(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        return processor.decodeUtf8(bArr, i10, i11);
    }

    public static int encode(String str, byte[] bArr, int i10, int i11) {
        return processor.encodeUtf8(str, bArr, i10, i11);
    }

    public static void encodeUtf8(String str, ByteBuffer byteBuffer) {
        processor.encodeUtf8(str, byteBuffer);
    }

    public static int encodedLength(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iEncodedLengthGeneral = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                iEncodedLengthGeneral += encodedLengthGeneral(str, i10);
                break;
            }
            iEncodedLengthGeneral += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iEncodedLengthGeneral >= length) {
            return iEncodedLengthGeneral;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iEncodedLengthGeneral) + 4294967296L));
    }

    private static int encodedLengthGeneral(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new UnpairedSurrogateException(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static int estimateConsecutiveAscii(ByteBuffer byteBuffer, int i10, int i11) {
        int i12 = i11 - 7;
        int i13 = i10;
        while (i13 < i12 && (byteBuffer.getLong(i13) & ASCII_MASK_LONG) == 0) {
            i13 += 8;
        }
        return i13 - i10;
    }

    public static int incompleteStateFor(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    public static int incompleteStateFor(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int incompleteStateFor(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static int incompleteStateFor(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            return incompleteStateFor(i10);
        }
        if (i12 == 1) {
            return incompleteStateFor(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return incompleteStateFor(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    public static int incompleteStateFor(byte[] bArr, int i10, int i11) {
        byte b7 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return incompleteStateFor(b7);
        }
        if (i12 == 1) {
            return incompleteStateFor(b7, bArr[i10]);
        }
        if (i12 == 2) {
            return incompleteStateFor(b7, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean isValidUtf8(ByteBuffer byteBuffer) {
        return processor.isValidUtf8(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return processor.isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i10, int i11) {
        return processor.isValidUtf8(bArr, i10, i11);
    }

    public static int partialIsValidUtf8(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        return processor.partialIsValidUtf8(i10, byteBuffer, i11, i12);
    }

    public static int partialIsValidUtf8(int i10, byte[] bArr, int i11, int i12) {
        return processor.partialIsValidUtf8(i10, bArr, i11, i12);
    }
}
