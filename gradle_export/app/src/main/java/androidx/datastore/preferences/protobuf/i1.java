package androidx.datastore.preferences.protobuf;

import com.google.android.gms.cast.Cast;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class i1 extends ze.d {

    public final int f630c;

    public i1(int i10) {
        this.f630c = i10;
    }

    @Override
    public final String s(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
        int i12;
        byte b7;
        int i13;
        byte b10;
        byte b11;
        byte b12;
        switch (this.f630c) {
            case 0:
                if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                int i14 = i10 + i11;
                char[] cArr = new char[i11];
                int i15 = 0;
                while (i10 < i14) {
                    byte b13 = bArr[i10];
                    if (b13 < 0) {
                        while (i10 < i14) {
                            i12 = i10 + 1;
                            b7 = bArr[i10];
                            if (b7 < 0) {
                                i13 = i15 + 1;
                                cArr[i15] = (char) b7;
                                while (i12 < i14) {
                                    b10 = bArr[i12];
                                    if (b10 >= 0) {
                                        i12++;
                                        cArr[i13] = (char) b10;
                                        i13++;
                                    } else {
                                        i15 = i13;
                                        i10 = i12;
                                    }
                                }
                                i15 = i13;
                                i10 = i12;
                            } else if (b7 < -32) {
                                if (i12 < i14) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i10 += 2;
                                byte b14 = bArr[i12];
                                int i16 = i15 + 1;
                                if (b7 >= -62 || ta.c0.K(b14)) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i15] = (char) ((b14 & 63) | ((b7 & 31) << 6));
                                i15 = i16;
                            } else {
                                if (b7 >= -16) {
                                    if (i12 < i14 - 2) {
                                        throw InvalidProtocolBufferException.a();
                                    }
                                    b12 = bArr[i12];
                                    int i17 = i10 + 3;
                                    byte b15 = bArr[i10 + 2];
                                    i10 += 4;
                                    byte b16 = bArr[i17];
                                    int i18 = i15 + 1;
                                    if (!ta.c0.K(b12)) {
                                        if ((((b12 + 112) + (b7 << 28)) >> 30) != 0 && !ta.c0.K(b15) && !ta.c0.K(b16)) {
                                            int i19 = ((b12 & 63) << 12) | ((b7 & 7) << 18) | ((b15 & 63) << 6) | (b16 & 63);
                                            cArr[i15] = (char) ((i19 >>> 10) + 55232);
                                            cArr[i18] = (char) ((i19 & 1023) + 56320);
                                            i15 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.a();
                                }
                                if (i12 < i14 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i20 = i10 + 2;
                                b11 = bArr[i12];
                                i10 += 3;
                                byte b17 = bArr[i20];
                                int i21 = i15 + 1;
                                if (!ta.c0.K(b11) || ((b7 == -32 && b11 < -96) || ((b7 == -19 && b11 >= -96) || ta.c0.K(b17)))) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                cArr[i15] = (char) (((b11 & 63) << 6) | ((b7 & 15) << 12) | (b17 & 63));
                                i15 = i21;
                            }
                        }
                        return new String(cArr, 0, i15);
                    }
                    i10++;
                    cArr[i15] = (char) b13;
                    i15++;
                }
                while (i10 < i14) {
                    i12 = i10 + 1;
                    b7 = bArr[i10];
                    if (b7 < 0) {
                        if (b7 < -32) {
                            if (i12 < i14) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i10 += 2;
                            byte b18 = bArr[i12];
                            int i110 = i15 + 1;
                            if (b7 >= -62) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (b7 >= -16) {
                            if (i12 < i14 - 1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            int i22 = i10 + 2;
                            b11 = bArr[i12];
                            i10 += 3;
                            byte b19 = bArr[i22];
                            int i23 = i15 + 1;
                            if (ta.c0.K(b11)) {
                            }
                            throw InvalidProtocolBufferException.a();
                        }
                        if (i12 < i14 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        b12 = bArr[i12];
                        int i111 = i10 + 3;
                        byte b110 = bArr[i10 + 2];
                        i10 += 4;
                        byte b111 = bArr[i111];
                        int i112 = i15 + 1;
                        if (!ta.c0.K(b12)) {
                            if ((((b12 + 112) + (b7 << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.a();
                    }
                    i13 = i15 + 1;
                    cArr[i15] = (char) b7;
                    while (i12 < i14) {
                        b10 = bArr[i12];
                        if (b10 >= 0) {
                            i12++;
                            cArr[i13] = (char) b10;
                            i13++;
                        } else {
                            i15 = i13;
                            i10 = i12;
                        }
                    }
                    i15 = i13;
                    i10 = i12;
                }
                return new String(cArr, 0, i15);
            default:
                Charset charset = x.f684a;
                String str = new String(bArr, i10, i11, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                    throw InvalidProtocolBufferException.a();
                }
                return str;
        }
    }

    @Override
    public final int t(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j9;
        long j10;
        long j11;
        int i14;
        char cCharAt2;
        switch (this.f630c) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | Cast.MAX_NAMESPACE_LENGTH);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new j1(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | Cast.MAX_NAMESPACE_LENGTH);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new j1(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | Cast.MAX_NAMESPACE_LENGTH);
                    }
                    i16++;
                }
                return i17;
            default:
                long j12 = i10;
                long j13 = ((long) i11) + j12;
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j9 = 1;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        h1.j(bArr, j12, (byte) cCharAt2);
                        i22++;
                        j12 = 1 + j12;
                    }
                }
                if (i22 != length2) {
                    while (i22 < length2) {
                        char cCharAt5 = str.charAt(i22);
                        if (cCharAt5 < 128 && j12 < j13) {
                            h1.j(bArr, j12, (byte) cCharAt5);
                            j11 = j13;
                            j10 = j9;
                            j12 += j9;
                        } else if (cCharAt5 >= 2048 || j12 > j13 - 2) {
                            j10 = j9;
                            if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j12 > j13 - 3) {
                                j11 = j13;
                                if (j12 > j11 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                        throw new j1(i22, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j12);
                                }
                                int i23 = i22 + 1;
                                if (i23 != length2) {
                                    char cCharAt6 = str.charAt(i23);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        h1.j(bArr, j12, (byte) ((codePoint2 >>> 18) | 240));
                                        h1.j(bArr, j12 + j10, (byte) (((codePoint2 >>> 12) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                        long j14 = j12 + 3;
                                        h1.j(bArr, j12 + 2, (byte) (((codePoint2 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                        j12 += 4;
                                        h1.j(bArr, j14, (byte) ((codePoint2 & 63) | Cast.MAX_NAMESPACE_LENGTH));
                                        i22 = i23;
                                    } else {
                                        i22 = i23;
                                    }
                                }
                                throw new j1(i22 - 1, length2);
                            }
                            h1.j(bArr, j12, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j15 = j12 + 2;
                            j11 = j13;
                            h1.j(bArr, j12 + j10, (byte) (((cCharAt5 >>> 6) & 63) | Cast.MAX_NAMESPACE_LENGTH));
                            j12 += 3;
                            h1.j(bArr, j15, (byte) ((cCharAt5 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                        } else {
                            j10 = j9;
                            long j16 = j12 + j10;
                            h1.j(bArr, j12, (byte) ((cCharAt5 >>> 6) | 960));
                            j12 += 2;
                            h1.j(bArr, j16, (byte) ((cCharAt5 & '?') | Cast.MAX_NAMESPACE_LENGTH));
                            j11 = j13;
                        }
                        i22++;
                        j9 = j10;
                        j13 = j11;
                    }
                }
                return (int) j12;
        }
    }
}
