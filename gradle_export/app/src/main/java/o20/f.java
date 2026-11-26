package o20;

import com.google.android.gms.internal.play_billing.q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public final class f {
    public int c;
    public final InputStream e;
    public int f;
    public int i;
    public int h = Integer.MAX_VALUE;
    public final byte[] a = new byte[4096];
    public int b = 0;
    public int d = 0;
    public int g = 0;

    public f(InputStream inputStream) {
        this.e = inputStream;
    }

    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.f != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final void b() throws InvalidProtocolBufferException {
        if (this.i >= 64) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
    }

    public final int c() {
        int i = this.h;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.g + this.d);
    }

    public final void d(int i) {
        this.h = i;
        p();
    }

    public final int e(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g + this.d + i;
        int i3 = this.h;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.b();
        }
        this.h = i2;
        p();
        return i3;
    }

    public final t f() {
        int iL = l();
        int i = this.b;
        int i2 = this.d;
        if (iL > i - i2 || iL <= 0) {
            return iL == 0 ? e.A : new t(i(iL));
        }
        byte[] bArr = new byte[iL];
        System.arraycopy(this.a, i2, bArr, 0, iL);
        t tVar = new t(bArr);
        this.d += iL;
        return tVar;
    }

    public final int g() {
        return l();
    }

    public final b h(v vVar, h hVar) throws InvalidProtocolBufferException {
        int iL = l();
        b();
        int iE = e(iL);
        this.i++;
        b bVar = (b) vVar.a(this, hVar);
        a(0);
        this.i--;
        d(iE);
        return bVar;
    }

    public final byte[] i(int i) throws IOException {
        if (i <= 0) {
            if (i == 0) {
                return q.a;
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.g;
        int i3 = this.d;
        int i4 = i2 + i3 + i;
        int i5 = this.h;
        if (i4 > i5) {
            s((i5 - i2) - i3);
            throw InvalidProtocolBufferException.b();
        }
        byte[] bArr = this.a;
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i6 = this.b - i3;
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            this.d = this.b;
            int i7 = i - i6;
            if (i7 > 0) {
                q(i7);
            }
            System.arraycopy(bArr, 0, bArr2, i6, i7);
            this.d = i7;
            return bArr2;
        }
        int i8 = this.b;
        this.g = i2 + i8;
        this.d = 0;
        this.b = 0;
        int length = i8 - i3;
        int i9 = i - length;
        ArrayList<byte[]> arrayList = new ArrayList();
        while (i9 > 0) {
            int iMin = Math.min(i9, 4096);
            byte[] bArr3 = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.e.read(bArr3, i11, iMin - i11);
                if (i12 == -1) {
                    throw InvalidProtocolBufferException.b();
                }
                this.g += i12;
                i11 += i12;
            }
            i9 -= iMin;
            arrayList.add(bArr3);
        }
        byte[] bArr4 = new byte[i];
        System.arraycopy(bArr, i3, bArr4, 0, length);
        for (byte[] bArr5 : arrayList) {
            System.arraycopy(bArr5, 0, bArr4, length, bArr5.length);
            length += bArr5.length;
        }
        return bArr4;
    }

    public final int j() throws InvalidProtocolBufferException {
        int i = this.d;
        if (this.b - i < 4) {
            q(4);
            i = this.d;
        }
        this.d = i + 4;
        byte[] bArr = this.a;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long k() throws InvalidProtocolBufferException {
        int i = this.d;
        if (this.b - i < 8) {
            q(8);
            i = this.d;
        }
        this.d = i + 8;
        byte[] bArr = this.a;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int l() {
        int i;
        int i2 = this.d;
        int i3 = this.b;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.a;
            byte b = bArr[i2];
            if (b >= 0) {
                this.d = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                long j = i6;
                if (j < 0) {
                    i = (int) ((-128) ^ j);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    long j2 = i8;
                    if (j2 >= 0) {
                        i = (int) (16256 ^ j2);
                    } else {
                        int i9 = i2 + 4;
                        int i11 = i8 ^ (bArr[i7] << 21);
                        long j3 = i11;
                        if (j3 < 0) {
                            i = (int) ((-2080896) ^ j3);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i12 = (int) (((long) (i11 ^ (b2 << 28))) ^ 266354560);
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i13 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i13;
                                                    i = i12;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i12;
                            }
                            i = i12;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.d = i5;
                return i;
            }
        }
        return (int) n();
    }

    public final long m() {
        throw new UnsupportedOperationException("Method not decompiled: o20.f.m():long");
    }

    public final long n() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.d == this.b) {
                q(1);
            }
            int i2 = this.d;
            this.d = i2 + 1;
            byte b = this.a[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public final int o() throws InvalidProtocolBufferException {
        if (this.d == this.b && !t(1)) {
            this.f = 0;
            return 0;
        }
        int iL = l();
        this.f = iL;
        if ((iL >>> 3) != 0) {
            return iL;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void p() {
        int i = this.b + this.c;
        this.b = i;
        int i2 = this.g + i;
        int i3 = this.h;
        if (i2 <= i3) {
            this.c = 0;
            return;
        }
        int i4 = i2 - i3;
        this.c = i4;
        this.b = i - i4;
    }

    public final void q(int i) throws InvalidProtocolBufferException {
        if (!t(i)) {
            throw InvalidProtocolBufferException.b();
        }
    }

    public final boolean r(int i, q1 q1Var) throws InvalidProtocolBufferException {
        boolean zR;
        int i2 = i & 7;
        if (i2 == 0) {
            long jM = m();
            q1Var.n0(i);
            q1Var.o0(jM);
            return true;
        }
        if (i2 == 1) {
            long jK = k();
            q1Var.n0(i);
            q1Var.m0(jK);
            return true;
        }
        if (i2 == 2) {
            t tVarF = f();
            q1Var.n0(i);
            q1Var.n0(tVarF.size());
            q1Var.j0(tVarF);
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
            }
            int iJ = j();
            q1Var.n0(i);
            q1Var.l0(iJ);
            return true;
        }
        q1Var.n0(i);
        do {
            int iO = o();
            if (iO == 0) {
                break;
            }
            b();
            this.i++;
            zR = r(iO, q1Var);
            this.i--;
        } while (zR);
        int i3 = ((i >>> 3) << 3) | 4;
        a(i3);
        q1Var.n0(i3);
        return true;
    }

    public final void s(int i) throws InvalidProtocolBufferException {
        int i2 = this.b;
        int i3 = this.d;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.d = i3 + i;
            return;
        }
        if (i < 0) {
            throw new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.g;
        int i6 = i5 + i3 + i;
        int i7 = this.h;
        if (i6 > i7) {
            s((i7 - i5) - i3);
            throw InvalidProtocolBufferException.b();
        }
        this.d = i2;
        q(1);
        while (true) {
            int i8 = i - i4;
            int i9 = this.b;
            if (i8 <= i9) {
                this.d = i8;
                return;
            } else {
                i4 += i9;
                this.d = i9;
                q(1);
            }
        }
    }

    public final boolean t(int i) throws IOException {
        InputStream inputStream;
        int i2 = this.d;
        int i3 = i2 + i;
        int i4 = this.b;
        if (i3 <= i4) {
            throw new IllegalStateException(g4.c.i("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
        if (this.g + i2 + i <= this.h && (inputStream = this.e) != null) {
            byte[] bArr = this.a;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.g += i2;
                this.b -= i2;
                this.d = 0;
            }
            int i5 = this.b;
            int i6 = inputStream.read(bArr, i5, bArr.length - i5);
            if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                throw new IllegalStateException(g4.c.i("InputStream#read(byte[]) returned invalid result: ", i6, "\nThe InputStream implementation is buggy."));
            }
            if (i6 > 0) {
                this.b += i6;
                if ((this.g + i) - 67108864 > 0) {
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
                p();
                if (this.b >= i) {
                    return true;
                }
                return t(i);
            }
        }
        return false;
    }
}
