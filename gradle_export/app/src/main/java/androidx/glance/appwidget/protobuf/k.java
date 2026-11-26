package androidx.glance.appwidget.protobuf;

import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public final class k extends androidx.datastore.preferences.protobuf.j {

    public final InputStream f908c;

    public final byte[] f909d;

    public int f910e;

    public int f911f;

    public int f912g;

    public int f913h;

    public int f914i;

    public int f915j = Integer.MAX_VALUE;

    public k(InputStream inputStream) {
        e0.a(inputStream, "input");
        this.f908c = inputStream;
        this.f909d = new byte[4096];
        this.f910e = 0;
        this.f912g = 0;
        this.f914i = 0;
    }

    @Override
    public final long A() {
        return O();
    }

    @Override
    public final int B() {
        return androidx.datastore.preferences.protobuf.j.d(P());
    }

    @Override
    public final long C() {
        return androidx.datastore.preferences.protobuf.j.f(Q());
    }

    @Override
    public final String D() throws InvalidProtocolBufferException {
        int iP = P();
        byte[] bArr = this.f909d;
        if (iP > 0) {
            int i10 = this.f910e;
            int i11 = this.f912g;
            if (iP <= i10 - i11) {
                String str = new String(bArr, i11, iP, e0.f885a);
                this.f912g += iP;
                return str;
            }
        }
        if (iP == 0) {
            return RuntimeVersion.SUFFIX;
        }
        if (iP < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (iP > this.f910e) {
            return new String(K(iP), e0.f885a);
        }
        T(iP);
        String str2 = new String(bArr, this.f912g, iP, e0.f885a);
        this.f912g += iP;
        return str2;
    }

    @Override
    public final String E() throws IOException {
        int iP = P();
        int i10 = this.f912g;
        int i11 = this.f910e;
        int i12 = i11 - i10;
        byte[] bArrK = this.f909d;
        if (iP <= i12 && iP > 0) {
            this.f912g = i10 + iP;
        } else {
            if (iP == 0) {
                return RuntimeVersion.SUFFIX;
            }
            if (iP < 0) {
                throw InvalidProtocolBufferException.e();
            }
            i10 = 0;
            if (iP <= i11) {
                T(iP);
                this.f912g = iP;
            } else {
                bArrK = K(iP);
            }
        }
        return l1.f922a.z(bArrK, i10, iP);
    }

    @Override
    public final int F() throws InvalidProtocolBufferException {
        if (i()) {
            this.f913h = 0;
            return 0;
        }
        int iP = P();
        this.f913h = iP;
        if ((iP >>> 3) != 0) {
            return iP;
        }
        throw InvalidProtocolBufferException.a();
    }

    @Override
    public final int G() {
        return P();
    }

    @Override
    public final long H() {
        return Q();
    }

    public final byte[] K(int i10) throws IOException {
        byte[] bArrL = L(i10);
        if (bArrL != null) {
            return bArrL;
        }
        int i11 = this.f912g;
        int i12 = this.f910e;
        int length = i12 - i11;
        this.f914i += i12;
        this.f912g = 0;
        this.f910e = 0;
        ArrayList<byte[]> arrayListM = M(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f909d, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListM) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] L(int i10) throws IOException {
        if (i10 == 0) {
            return e0.f886b;
        }
        if (i10 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i11 = this.f914i;
        int i12 = this.f912g;
        int i13 = i11 + i12 + i10;
        if (i13 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f915j;
        if (i13 > i14) {
            U((i14 - i11) - i12);
            throw InvalidProtocolBufferException.g();
        }
        int i15 = this.f910e - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f908c;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e3) {
                e3.A = true;
                throw e3;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f909d, this.f912g, bArr, 0, i15);
        this.f914i += this.f910e;
        this.f912g = 0;
        this.f910e = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f914i += i17;
                i15 += i17;
            } catch (InvalidProtocolBufferException e10) {
                e10.A = true;
                throw e10;
            }
        }
        return bArr;
    }

    public final ArrayList M(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f908c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.g();
                }
                this.f914i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int N() throws InvalidProtocolBufferException {
        int i10 = this.f912g;
        if (this.f910e - i10 < 4) {
            T(4);
            i10 = this.f912g;
        }
        this.f912g = i10 + 4;
        byte[] bArr = this.f909d;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long O() throws InvalidProtocolBufferException {
        int i10 = this.f912g;
        if (this.f910e - i10 < 8) {
            T(8);
            i10 = this.f912g;
        }
        this.f912g = i10 + 8;
        byte[] bArr = this.f909d;
        return ((((long) bArr[i10 + 1]) & 255) << 8) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public final int P() {
        int i10;
        int i11 = this.f912g;
        int i12 = this.f910e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f909d;
            byte b7 = bArr[i11];
            if (b7 >= 0) {
                this.f912g = i13;
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
                this.f912g = i14;
                return i10;
            }
        }
        return (int) R();
    }

    public final long Q() {
        long j9;
        long j10;
        long j11;
        long j12;
        int i10 = this.f912g;
        int i11 = this.f910e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f909d;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                this.f912g = i12;
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
                this.f912g = i13;
                return j9;
            }
        }
        return R();
    }

    public final long R() throws InvalidProtocolBufferException {
        long j9 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f912g == this.f910e) {
                T(1);
            }
            int i11 = this.f912g;
            this.f912g = i11 + 1;
            byte b7 = this.f909d[i11];
            j9 |= ((long) (b7 & 127)) << i10;
            if ((b7 & 128) == 0) {
                return j9;
            }
        }
        throw InvalidProtocolBufferException.d();
    }

    public final void S() {
        int i10 = this.f910e + this.f911f;
        this.f910e = i10;
        int i11 = this.f914i + i10;
        int i12 = this.f915j;
        if (i11 <= i12) {
            this.f911f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f911f = i13;
        this.f910e = i10 - i13;
    }

    public final void T(int i10) throws InvalidProtocolBufferException {
        if (V(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f914i) - this.f912g) {
            throw InvalidProtocolBufferException.g();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void U(int i10) throws InvalidProtocolBufferException {
        int i11 = this.f910e;
        int i12 = this.f912g;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.f912g = i12 + i10;
            return;
        }
        InputStream inputStream = this.f908c;
        if (i10 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i13 = this.f914i;
        int i14 = i13 + i12;
        int i15 = i14 + i10;
        int i16 = this.f915j;
        if (i15 > i16) {
            U((i16 - i13) - i12);
            throw InvalidProtocolBufferException.g();
        }
        this.f914i = i14;
        int i17 = i11 - i12;
        this.f910e = 0;
        this.f912g = 0;
        while (i17 < i10) {
            long j9 = i10 - i17;
            try {
                try {
                    long jSkip = inputStream.skip(j9);
                    if (jSkip < 0 || jSkip > j9) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i17 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e3) {
                    e3.A = true;
                    throw e3;
                }
            } catch (Throwable th2) {
                this.f914i += i17;
                S();
                throw th2;
            }
        }
        this.f914i += i17;
        S();
        if (i17 >= i10) {
            return;
        }
        int i18 = this.f910e;
        int i19 = i18 - this.f912g;
        this.f912g = i18;
        T(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f910e;
            if (i20 <= i21) {
                this.f912g = i20;
                return;
            } else {
                i19 += i21;
                this.f912g = i21;
                T(1);
            }
        }
    }

    public final boolean V(int i10) throws IOException {
        InputStream inputStream = this.f908c;
        int i11 = this.f912g;
        int i12 = i11 + i10;
        int i13 = this.f910e;
        if (i12 <= i13) {
            throw new IllegalStateException(g4.c.i("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f914i;
        if (i10 <= (Integer.MAX_VALUE - i14) - i11 && i14 + i11 + i10 <= this.f915j) {
            byte[] bArr = this.f909d;
            if (i11 > 0) {
                if (i13 > i11) {
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.f914i += i11;
                this.f910e -= i11;
                this.f912g = 0;
            }
            int i15 = this.f910e;
            try {
                int i16 = inputStream.read(bArr, i15, Math.min(bArr.length - i15, (Integer.MAX_VALUE - this.f914i) - i15));
                if (i16 == 0 || i16 < -1 || i16 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i16 + "\nThe InputStream implementation is buggy.");
                }
                if (i16 > 0) {
                    this.f910e += i16;
                    S();
                    if (this.f910e >= i10) {
                        return true;
                    }
                    return V(i10);
                }
            } catch (InvalidProtocolBufferException e3) {
                e3.A = true;
                throw e3;
            }
        }
        return false;
    }

    @Override
    public final void b(int i10) throws InvalidProtocolBufferException {
        if (this.f913h != i10) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override
    public final int h() {
        return this.f914i + this.f912g;
    }

    @Override
    public final boolean i() {
        return this.f912g == this.f910e && !V(1);
    }

    @Override
    public final void l(int i10) {
        this.f915j = i10;
        S();
    }

    @Override
    public final int n(int i10) throws InvalidProtocolBufferException {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        int i11 = this.f914i + this.f912g + i10;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int i12 = this.f915j;
        if (i11 > i12) {
            throw InvalidProtocolBufferException.g();
        }
        this.f915j = i11;
        S();
        return i12;
    }

    @Override
    public final boolean o() {
        return Q() != 0;
    }

    @Override
    public final h q() throws IOException {
        int iP = P();
        int i10 = this.f910e;
        int i11 = this.f912g;
        int i12 = i10 - i11;
        byte[] bArr = this.f909d;
        if (iP <= i12 && iP > 0) {
            h hVarC = i.c(i11, iP, bArr);
            this.f912g += iP;
            return hVarC;
        }
        if (iP == 0) {
            return i.B;
        }
        if (iP < 0) {
            throw InvalidProtocolBufferException.e();
        }
        byte[] bArrL = L(iP);
        if (bArrL != null) {
            return i.c(0, bArrL.length, bArrL);
        }
        int i13 = this.f912g;
        int i14 = this.f910e;
        int length = i14 - i13;
        this.f914i += i14;
        this.f912g = 0;
        this.f910e = 0;
        ArrayList<byte[]> arrayListM = M(iP - length);
        byte[] bArr2 = new byte[iP];
        System.arraycopy(bArr, i13, bArr2, 0, length);
        for (byte[] bArr3 : arrayListM) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        h hVar = i.B;
        return new h(bArr2);
    }

    @Override
    public final double s() {
        return Double.longBitsToDouble(O());
    }

    @Override
    public final int t() {
        return P();
    }

    @Override
    public final int u() {
        return N();
    }

    @Override
    public final long v() {
        return O();
    }

    @Override
    public final float w() {
        return Float.intBitsToFloat(N());
    }

    @Override
    public final int x() {
        return P();
    }

    @Override
    public final long y() {
        return Q();
    }

    @Override
    public final int z() {
        return N();
    }
}
