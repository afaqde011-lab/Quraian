package androidx.datastore.preferences.protobuf;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;

public final class h extends j {

    public final byte[] f606c;

    public int f607d;

    public int f608e;

    public int f609f;

    public final int f610g;

    public int f611h;

    public int f612i = Integer.MAX_VALUE;

    public h(byte[] bArr, int i10, int i11, boolean z10) {
        this.f606c = bArr;
        this.f607d = i11 + i10;
        this.f609f = i10;
        this.f610g = i10;
    }

    @Override
    public final long A() {
        return L();
    }

    @Override
    public final int B() {
        int iM = M();
        return (-(iM & 1)) ^ (iM >>> 1);
    }

    @Override
    public final long C() {
        long jN = N();
        return (-(jN & 1)) ^ (jN >>> 1);
    }

    @Override
    public final String D() throws InvalidProtocolBufferException {
        int iM = M();
        if (iM > 0) {
            int i10 = this.f607d;
            int i11 = this.f609f;
            if (iM <= i10 - i11) {
                String str = new String(this.f606c, i11, iM, x.f684a);
                this.f609f += iM;
                return str;
            }
        }
        if (iM == 0) {
            return RuntimeVersion.SUFFIX;
        }
        if (iM < 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override
    public final String E() throws InvalidProtocolBufferException {
        int iM = M();
        if (iM > 0) {
            int i10 = this.f607d;
            int i11 = this.f609f;
            if (iM <= i10 - i11) {
                String strS = k1.f638a.s(this.f606c, i11, iM);
                this.f609f += iM;
                return strS;
            }
        }
        if (iM == 0) {
            return RuntimeVersion.SUFFIX;
        }
        if (iM <= 0) {
            throw InvalidProtocolBufferException.d();
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override
    public final int F() throws InvalidProtocolBufferException {
        if (i()) {
            this.f611h = 0;
            return 0;
        }
        int iM = M();
        this.f611h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    @Override
    public final int G() {
        return M();
    }

    @Override
    public final long H() {
        return N();
    }

    @Override
    public final boolean I(int i10) throws InvalidProtocolBufferException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                Q(8);
                return true;
            }
            if (i11 == 2) {
                Q(M());
                return true;
            }
            if (i11 == 3) {
                J();
                b(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            Q(4);
            return true;
        }
        int i13 = this.f607d - this.f609f;
        byte[] bArr = this.f606c;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f609f;
                this.f609f = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw InvalidProtocolBufferException.c();
        }
        while (i12 < 10) {
            int i15 = this.f609f;
            if (i15 == this.f607d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f609f = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw InvalidProtocolBufferException.c();
        return true;
    }

    public final int K() throws InvalidProtocolBufferException {
        int i10 = this.f609f;
        if (this.f607d - i10 < 4) {
            throw InvalidProtocolBufferException.e();
        }
        this.f609f = i10 + 4;
        byte[] bArr = this.f606c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long L() throws InvalidProtocolBufferException {
        int i10 = this.f609f;
        if (this.f607d - i10 < 8) {
            throw InvalidProtocolBufferException.e();
        }
        this.f609f = i10 + 8;
        byte[] bArr = this.f606c;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int M() {
        int i10;
        int i11 = this.f609f;
        int i12 = this.f607d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f606c;
            byte b7 = bArr[i11];
            if (b7 >= 0) {
                this.f609f = i13;
                return b7;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b7;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f609f = i14;
                return i10;
            }
        }
        return (int) O();
    }

    public final long N() {
        long j9;
        long j10;
        long j11;
        long j12;
        int i10 = this.f609f;
        int i11 = this.f607d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f606c;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.f609f = i12;
                return b7;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b7;
                if (i14 < 0) {
                    j9 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j9 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j12 = (-2080896) ^ i18;
                        } else {
                            long j13 = i18;
                            i13 = i10 + 5;
                            long j14 = j13 ^ (((long) bArr[i17]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i13]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i17]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i13]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i17]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j9 = j16;
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                            }
                            j9 = j11 ^ j14;
                        }
                        i13 = i17;
                        j9 = j12;
                    }
                }
                this.f609f = i13;
                return j9;
            }
        }
        return O();
    }

    public final long O() throws InvalidProtocolBufferException {
        long j9 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f609f;
            if (i11 == this.f607d) {
                throw InvalidProtocolBufferException.e();
            }
            this.f609f = i11 + 1;
            byte b7 = this.f606c[i11];
            j9 |= ((long) (b7 & 127)) << i10;
            if ((b7 & 128) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void P() {
        int i10 = this.f607d + this.f608e;
        this.f607d = i10;
        int i11 = i10 - this.f610g;
        int i12 = this.f612i;
        if (i11 <= i12) {
            this.f608e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f608e = i13;
        this.f607d = i10 - i13;
    }

    public final void Q(int i10) throws InvalidProtocolBufferException {
        if (i10 >= 0) {
            int i11 = this.f607d;
            int i12 = this.f609f;
            if (i10 <= i11 - i12) {
                this.f609f = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.d();
    }

    @Override
    public final void b(int i10) throws InvalidProtocolBufferException {
        if (this.f611h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override
    public final int h() {
        return this.f609f - this.f610g;
    }

    @Override
    public final boolean i() {
        return this.f609f == this.f607d;
    }

    @Override
    public final void l(int i10) {
        this.f612i = i10;
        P();
    }

    @Override
    public final int n(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int iH = h() + i10;
        if (iH < 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int i11 = this.f612i;
        if (iH > i11) {
            throw InvalidProtocolBufferException.e();
        }
        this.f612i = iH;
        P();
        return i11;
    }

    @Override
    public final boolean o() {
        return N() != 0;
    }

    @Override
    public final g p() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM = M();
        byte[] bArr = this.f606c;
        if (iM > 0) {
            int i10 = this.f607d;
            int i11 = this.f609f;
            if (iM <= i10 - i11) {
                g gVarC = g.c(i11, iM, bArr);
                this.f609f += iM;
                return gVarC;
            }
        }
        if (iM == 0) {
            return g.C;
        }
        if (iM > 0) {
            int i12 = this.f607d;
            int i13 = this.f609f;
            if (iM <= i12 - i13) {
                int i14 = iM + i13;
                this.f609f = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iM <= 0) {
                    throw InvalidProtocolBufferException.e();
                }
                if (iM == 0) {
                    throw InvalidProtocolBufferException.d();
                }
                bArrCopyOfRange = x.f685b;
            }
        } else {
            if (iM <= 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (iM == 0) {
                throw InvalidProtocolBufferException.d();
            }
            bArrCopyOfRange = x.f685b;
        }
        g gVar = g.C;
        return new g(bArrCopyOfRange);
    }

    @Override
    public final double s() {
        return Double.longBitsToDouble(L());
    }

    @Override
    public final int t() {
        return M();
    }

    @Override
    public final int u() {
        return K();
    }

    @Override
    public final long v() {
        return L();
    }

    @Override
    public final float w() {
        return Float.intBitsToFloat(K());
    }

    @Override
    public final int x() {
        return M();
    }

    @Override
    public final long y() {
        return N();
    }

    @Override
    public final int z() {
        return K();
    }
}
