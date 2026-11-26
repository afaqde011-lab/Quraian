package h9;

import a8.l0;
import a8.n0;
import androidx.media3.common.ParserException;
import androidx.media3.common.x0;
import g1.c3;
import java.util.Collections;

public final class t implements i {

    public final String f6864a;

    public final int f6865b;

    public final e7.u f6866c;

    public final n0 f6867d;

    public l0 f6868e;

    public String f6869f;

    public androidx.media3.common.t f6870g;

    public int f6871h;

    public int f6872i;

    public int f6873j;

    public int f6874k;
    public long l;
    public boolean m;

    public int f6875n;

    public int f6876o;

    public int f6877p;

    public boolean f6878q;

    public long f6879r;

    public int f6880s;

    public long f6881t;

    public int f6882u;

    public String f6883v;

    public t(String str, int i10) {
        this.f6864a = str;
        this.f6865b = i10;
        e7.u uVar = new e7.u(1024);
        this.f6866c = uVar;
        byte[] bArr = uVar.f5182a;
        this.f6867d = new n0(bArr.length, bArr);
        this.l = -9223372036854775807L;
    }

    @Override
    public final void a() {
        this.f6871h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override
    public final void b(e7.u uVar) throws ParserException {
        int i10;
        boolean zH;
        this.f6868e.getClass();
        while (uVar.a() > 0) {
            int i11 = this.f6871h;
            if (i11 != 0) {
                if (i11 != 1) {
                    e7.u uVar2 = this.f6866c;
                    n0 n0Var = this.f6867d;
                    if (i11 == 2) {
                        int iA = ((this.f6874k & (-225)) << 8) | uVar.A();
                        this.f6873j = iA;
                        if (iA > uVar2.f5182a.length) {
                            uVar2.K(iA);
                            byte[] bArr = uVar2.f5182a;
                            n0Var.getClass();
                            n0Var.o(bArr.length, bArr);
                        }
                        this.f6872i = 0;
                        this.f6871h = 3;
                    } else {
                        if (i11 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(uVar.a(), this.f6873j - this.f6872i);
                        uVar.k(this.f6872i, iMin, n0Var.f300b);
                        int i12 = this.f6872i + iMin;
                        this.f6872i = i12;
                        if (i12 == this.f6873j) {
                            n0Var.q(0);
                            if (n0Var.h()) {
                                if (this.m) {
                                }
                                this.f6871h = 0;
                            } else {
                                this.m = true;
                                int i13 = n0Var.i(1);
                                int i14 = i13 == 1 ? n0Var.i(1) : 0;
                                this.f6875n = i14;
                                if (i14 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i13 == 1) {
                                    n0Var.i((n0Var.i(2) + 1) * 8);
                                }
                                if (!n0Var.h()) {
                                    throw ParserException.a(null, null);
                                }
                                this.f6876o = n0Var.i(6);
                                int i15 = n0Var.i(4);
                                int i16 = n0Var.i(3);
                                if (i15 != 0 || i16 != 0) {
                                    throw ParserException.a(null, null);
                                }
                                if (i13 == 0) {
                                    int iG = n0Var.g();
                                    int iB = n0Var.b();
                                    a8.a aVarP = a8.b.p(n0Var, true);
                                    this.f6883v = aVarP.f193a;
                                    this.f6880s = aVarP.f194b;
                                    this.f6882u = aVarP.f195c;
                                    int iB2 = iB - n0Var.b();
                                    n0Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    n0Var.j(iB2, bArr2);
                                    androidx.media3.common.s sVar = new androidx.media3.common.s();
                                    sVar.f1491a = this.f6869f;
                                    sVar.l = x0.n("video/mp2t");
                                    sVar.m = x0.n("audio/mp4a-latm");
                                    sVar.f1500j = this.f6883v;
                                    sVar.E = this.f6882u;
                                    sVar.F = this.f6880s;
                                    sVar.f1504p = Collections.singletonList(bArr2);
                                    sVar.f1494d = this.f6864a;
                                    sVar.f1496f = this.f6865b;
                                    androidx.media3.common.t tVar = new androidx.media3.common.t(sVar);
                                    if (!tVar.equals(this.f6870g)) {
                                        this.f6870g = tVar;
                                        this.f6881t = 1024000000 / ((long) tVar.G);
                                        this.f6868e.f(tVar);
                                    }
                                } else {
                                    int i17 = n0Var.i((n0Var.i(2) + 1) * 8);
                                    int iB3 = n0Var.b();
                                    a8.a aVarP2 = a8.b.p(n0Var, true);
                                    this.f6883v = aVarP2.f193a;
                                    this.f6880s = aVarP2.f194b;
                                    this.f6882u = aVarP2.f195c;
                                    n0Var.t(i17 - (iB3 - n0Var.b()));
                                }
                                int i18 = n0Var.i(3);
                                this.f6877p = i18;
                                if (i18 == 0) {
                                    n0Var.t(8);
                                } else if (i18 == 1) {
                                    n0Var.t(9);
                                } else if (i18 == 3 || i18 == 4 || i18 == 5) {
                                    n0Var.t(6);
                                } else {
                                    if (i18 != 6 && i18 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    n0Var.t(1);
                                }
                                boolean zH2 = n0Var.h();
                                this.f6878q = zH2;
                                this.f6879r = 0L;
                                if (zH2) {
                                    if (i13 == 1) {
                                        this.f6879r = n0Var.i((n0Var.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = n0Var.h();
                                            this.f6879r = (this.f6879r << 8) + ((long) n0Var.i(8));
                                        } while (zH);
                                    }
                                }
                                if (n0Var.h()) {
                                    n0Var.t(8);
                                }
                            }
                            if (this.f6875n != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f6876o != 0) {
                                throw ParserException.a(null, null);
                            }
                            if (this.f6877p != 0) {
                                throw ParserException.a(null, null);
                            }
                            int i19 = 0;
                            do {
                                i10 = n0Var.i(8);
                                i19 += i10;
                            } while (i10 == 255);
                            int iG2 = n0Var.g();
                            if ((iG2 & 7) == 0) {
                                uVar2.N(iG2 >> 3);
                            } else {
                                n0Var.j(i19 * 8, uVar2.f5182a);
                                uVar2.N(0);
                            }
                            this.f6868e.g(i19, uVar2);
                            ta.c0.A(this.l != -9223372036854775807L);
                            this.f6868e.d(this.l, 1, i19, 0, null);
                            this.l += this.f6881t;
                            if (this.f6878q) {
                                n0Var.t((int) this.f6879r);
                            }
                            this.f6871h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iA2 = uVar.A();
                    if ((iA2 & 224) == 224) {
                        this.f6874k = iA2;
                        this.f6871h = 2;
                    } else if (iA2 != 86) {
                        this.f6871h = 0;
                    }
                }
            } else if (uVar.A() == 86) {
                this.f6871h = 1;
            }
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        c3Var.a();
        c3Var.b();
        this.f6868e = sVar.w(c3Var.C, 1);
        c3Var.b();
        this.f6869f = (String) c3Var.E;
    }

    @Override
    public final void d(boolean z10) {
    }

    @Override
    public final void e(int i10, long j9) {
        this.l = j9;
    }
}
