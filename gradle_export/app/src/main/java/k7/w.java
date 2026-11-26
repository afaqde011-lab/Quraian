package k7;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public final class w extends c7.n {

    public int[] f9181i;

    public int[] f9182j;

    @Override
    public final void d(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int[] iArr = this.f9182j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.f2926b.f2922d) * this.f2927c.f2922d);
        while (iPosition < iLimit) {
            for (int i14 : iArr) {
                int iP = (e7.i0.p(this.f2926b.f2921c) * i14) + iPosition;
                int i15 = this.f2926b.f2921c;
                if (i15 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iP));
                } else if (i15 == 3) {
                    byteBufferL.put(byteBuffer.get(iP));
                } else if (i15 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iP));
                } else if (i15 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iP;
                    } else {
                        i10 = iP + 2;
                    }
                    byte b7 = byteBuffer.get(i10);
                    byte b10 = byteBuffer.get(iP + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iP += 2;
                    }
                    i11 = ((((b7 << 24) & (-16777216)) | ((b10 << 16) & 16711680)) | ((byteBuffer.get(iP) << 8) & 65280)) >> 8;
                    if ((i11 & (-16777216)) != 0 || (i11 & (-8388608)) == -8388608) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ta.c0.t(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                    ta.c0.s(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i12 = (i11 & 16711680) >> 16;
                    } else {
                        i12 = i11 & 255;
                    }
                    byte b11 = (byte) i12;
                    byte b12 = (byte) ((i11 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i13 = i11 & 255;
                    } else {
                        i13 = (i11 & 16711680) >> 16;
                    }
                    byteBufferL.put(b11).put(b12).put((byte) i13);
                } else {
                    if (i15 != 22) {
                        if (i15 == 268435456) {
                            byteBufferL.putShort(byteBuffer.getShort(iP));
                        } else if (i15 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i10 = iP;
                            } else {
                                i10 = iP + 2;
                            }
                            byte b13 = byteBuffer.get(i10);
                            byte b14 = byteBuffer.get(iP + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iP += 2;
                            }
                            i11 = ((((b13 << 24) & (-16777216)) | ((b14 << 16) & 16711680)) | ((byteBuffer.get(iP) << 8) & 65280)) >> 8;
                            if ((i11 & (-16777216)) != 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            ta.c0.t(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                            ta.c0.s(byteBufferL.remaining() >= 3);
                            if (byteBufferL.order() == byteOrder) {
                                i12 = (i11 & 16711680) >> 16;
                            } else {
                                i12 = i11 & 255;
                            }
                            byte b15 = (byte) i12;
                            byte b16 = (byte) ((i11 & 65280) >> 8);
                            if (byteBufferL.order() == byteOrder) {
                                i13 = i11 & 255;
                            } else {
                                i13 = (i11 & 16711680) >> 16;
                            }
                            byteBufferL.put(b15).put(b16).put((byte) i13);
                        } else if (i15 != 1610612736) {
                            throw new IllegalStateException("Unexpected encoding: " + this.f2926b.f2921c);
                        }
                    }
                    byteBufferL.putInt(byteBuffer.getInt(iP));
                }
            }
            iPosition += this.f2926b.f2922d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override
    public final c7.k h(c7.k kVar) throws AudioProcessor$UnhandledAudioFormatException {
        int i10 = kVar.f2921c;
        int[] iArr = this.f9181i;
        if (iArr == null) {
            return c7.k.f2918e;
        }
        int i11 = kVar.f2920b;
        if (!e7.i0.D(i10)) {
            throw new AudioProcessor$UnhandledAudioFormatException(kVar);
        }
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (i12 < iArr.length) {
            int i13 = iArr[i12];
            if (i13 >= i11) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", kVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
        return z10 ? new c7.k(kVar.f2919a, iArr.length, i10) : c7.k.f2918e;
    }

    @Override
    public final void i() {
        this.f9182j = this.f9181i;
    }

    @Override
    public final void k() {
        this.f9182j = null;
        this.f9181i = null;
    }
}
