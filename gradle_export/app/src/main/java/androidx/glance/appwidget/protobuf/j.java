package androidx.glance.appwidget.protobuf;

import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;

public final class j extends androidx.datastore.preferences.protobuf.j {

    public final byte[] f899c;

    public int f900d;

    public int f901e;

    public int f902f;

    public final int f903g;

    public int f904h;

    public int f905i = Integer.MAX_VALUE;

    public j(byte[] bArr, int i10, int i11, boolean z10) {
        this.f899c = bArr;
        this.f900d = i11 + i10;
        this.f902f = i10;
        this.f903g = i10;
    }

    @Override
    public final long A() {
        return L();
    }

    @Override
    public final int B() {
        return androidx.datastore.preferences.protobuf.j.d(M());
    }

    @Override
    public final long C() {
        return androidx.datastore.preferences.protobuf.j.f(N());
    }

    @Override
    public final String D() throws InvalidProtocolBufferException {
        int iM = M();
        if (iM > 0) {
            int i10 = this.f900d;
            int i11 = this.f902f;
            if (iM <= i10 - i11) {
                String str = new String(this.f899c, i11, iM, e0.f885a);
                this.f902f += iM;
                return str;
            }
        }
        if (iM == 0) {
            return RuntimeVersion.SUFFIX;
        }
        if (iM < 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override
    public final String E() throws InvalidProtocolBufferException {
        int iM = M();
        if (iM > 0) {
            int i10 = this.f900d;
            int i11 = this.f902f;
            if (iM <= i10 - i11) {
                String strZ = l1.f922a.z(this.f899c, i11, iM);
                this.f902f += iM;
                return strZ;
            }
        }
        if (iM == 0) {
            return RuntimeVersion.SUFFIX;
        }
        if (iM <= 0) {
            throw InvalidProtocolBufferException.e();
        }
        throw InvalidProtocolBufferException.g();
    }

    @Override
    public final int F() throws InvalidProtocolBufferException {
        if (i()) {
            this.f904h = 0;
            return 0;
        }
        int iM = M();
        this.f904h = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override
    public final int G() {
        return M();
    }

    @Override
    public final long H() {
        return N();
    }

    public final int K() throws InvalidProtocolBufferException {
        int i10 = this.f902f;
        if (this.f900d - i10 < 4) {
            throw InvalidProtocolBufferException.g();
        }
        this.f902f = i10 + 4;
        byte[] bArr = this.f899c;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long L() throws InvalidProtocolBufferException {
        int i10 = this.f902f;
        if (this.f900d - i10 < 8) {
            throw InvalidProtocolBufferException.g();
        }
        this.f902f = i10 + 8;
        byte[] bArr = this.f899c;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int M() {
        int i10;
        int i11 = this.f902f;
        int i12 = this.f900d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f899c;
            byte b7 = bArr[i11];
            if (b7 >= 0) {
                this.f902f = i13;
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
                this.f902f = i14;
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
        int i10 = this.f902f;
        int i11 = this.f900d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f899c;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.f902f = i12;
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
                this.f902f = i13;
                return j9;
            }
        }
        return O();
    }

    public final long O() throws InvalidProtocolBufferException {
        long j9 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f902f;
            if (i11 == this.f900d) {
                throw InvalidProtocolBufferException.g();
            }
            this.f902f = i11 + 1;
            byte b7 = this.f899c[i11];
            j9 |= ((long) (b7 & 127)) << i10;
            if ((b7 & 128) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void P() {
        int i10 = this.f900d + this.f901e;
        this.f900d = i10;
        int i11 = i10 - this.f903g;
        int i12 = this.f905i;
        if (i11 <= i12) {
            this.f901e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f901e = i13;
        this.f900d = i10 - i13;
    }

    @Override
    public final void b(int i10) throws InvalidProtocolBufferException {
        if (this.f904h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override
    public final int h() {
        return this.f902f - this.f903g;
    }

    @Override
    public final boolean i() {
        return this.f902f == this.f900d;
    }

    @Override
    public final void l(int i10) {
        this.f905i = i10;
        P();
    }

    @Override
    public final int n(int i10) {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int iH = h() + i10;
        if (iH < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i11 = this.f905i;
        if (iH > i11) {
            throw InvalidProtocolBufferException.g();
        }
        this.f905i = iH;
        P();
        return i11;
    }

    @Override
    public final boolean o() {
        return N() != 0;
    }

    @Override
    public final h q() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iM = M();
        byte[] bArr = this.f899c;
        if (iM > 0) {
            int i10 = this.f900d;
            int i11 = this.f902f;
            if (iM <= i10 - i11) {
                h hVarC = i.c(i11, iM, bArr);
                this.f902f += iM;
                return hVarC;
            }
        }
        if (iM == 0) {
            return i.B;
        }
        if (iM > 0) {
            int i12 = this.f900d;
            int i13 = this.f902f;
            if (iM <= i12 - i13) {
                int i14 = iM + i13;
                this.f902f = i14;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i13, i14);
            } else {
                if (iM <= 0) {
                    throw InvalidProtocolBufferException.g();
                }
                if (iM == 0) {
                    throw InvalidProtocolBufferException.e();
                }
                bArrCopyOfRange = e0.f886b;
            }
        } else {
            if (iM <= 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (iM == 0) {
                throw InvalidProtocolBufferException.e();
            }
            bArrCopyOfRange = e0.f886b;
        }
        h hVar = i.B;
        return new h(bArrCopyOfRange);
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
