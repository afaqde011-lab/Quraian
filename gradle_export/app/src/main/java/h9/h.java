package h9;

import a8.l0;
import androidx.media3.common.x0;
import g1.c3;
import java.util.Collections;
import java.util.List;

public final class h implements i {

    public final int f6744a;

    public boolean f6745b;

    public long f6746c;

    public int f6747d;

    public int f6748e;

    public final Object f6749f;

    public Object f6750g;

    public h() {
        this.f6744a = 1;
        this.f6749f = new e7.u(10);
        this.f6746c = -9223372036854775807L;
    }

    public h(List list) {
        this.f6744a = 0;
        this.f6749f = list;
        this.f6750g = new l0[list.size()];
        this.f6746c = -9223372036854775807L;
    }

    @Override
    public final void a() {
        switch (this.f6744a) {
            case 0:
                this.f6745b = false;
                this.f6746c = -9223372036854775807L;
                break;
            default:
                this.f6745b = false;
                this.f6746c = -9223372036854775807L;
                break;
        }
    }

    @Override
    public final void b(e7.u uVar) {
        boolean z10;
        boolean z11;
        switch (this.f6744a) {
            case 0:
                if (this.f6745b) {
                    if (this.f6747d == 2) {
                        if (uVar.a() == 0) {
                            z11 = false;
                        } else {
                            if (uVar.A() != 32) {
                                this.f6745b = false;
                            }
                            this.f6747d--;
                            z11 = this.f6745b;
                        }
                        if (!z11) {
                        }
                    }
                    if (this.f6747d == 1) {
                        if (uVar.a() == 0) {
                            z10 = false;
                        } else {
                            if (uVar.A() != 0) {
                                this.f6745b = false;
                            }
                            this.f6747d--;
                            z10 = this.f6745b;
                        }
                        if (!z10) {
                        }
                    }
                    int i10 = uVar.f5183b;
                    int iA = uVar.a();
                    for (l0 l0Var : (l0[]) this.f6750g) {
                        uVar.N(i10);
                        l0Var.g(iA, uVar);
                    }
                    this.f6748e += iA;
                }
                break;
            default:
                e7.u uVar2 = (e7.u) this.f6749f;
                ((l0) this.f6750g).getClass();
                if (this.f6745b) {
                    int iA2 = uVar.a();
                    int i11 = this.f6748e;
                    if (i11 < 10) {
                        int iMin = Math.min(iA2, 10 - i11);
                        System.arraycopy(uVar.f5182a, uVar.f5183b, uVar2.f5182a, this.f6748e, iMin);
                        if (this.f6748e + iMin == 10) {
                            uVar2.N(0);
                            if (73 == uVar2.A() && 68 == uVar2.A() && 51 == uVar2.A()) {
                                uVar2.O(3);
                                this.f6747d = uVar2.z() + 10;
                            } else {
                                e7.a.m("Id3Reader", "Discarding invalid ID3 tag");
                                this.f6745b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f6747d - this.f6748e);
                    ((l0) this.f6750g).g(iMin2, uVar);
                    this.f6748e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override
    public final void c(a8.s sVar, c3 c3Var) {
        switch (this.f6744a) {
            case 0:
                l0[] l0VarArr = (l0[]) this.f6750g;
                for (int i10 = 0; i10 < l0VarArr.length; i10++) {
                    f0 f0Var = (f0) ((List) this.f6749f).get(i10);
                    c3Var.a();
                    c3Var.b();
                    l0 l0VarW = sVar.w(c3Var.C, 3);
                    androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                    c3Var.b();
                    sVar2.f1491a = (String) c3Var.E;
                    sVar2.l = x0.n("video/mp2t");
                    sVar2.m = x0.n("application/dvbsubs");
                    sVar2.f1504p = Collections.singletonList(f0Var.f6728b);
                    sVar2.f1494d = f0Var.f6727a;
                    oi.k.w(sVar2, l0VarW);
                    l0VarArr[i10] = l0VarW;
                }
                break;
            default:
                c3Var.a();
                c3Var.b();
                l0 l0VarW2 = sVar.w(c3Var.C, 5);
                this.f6750g = l0VarW2;
                androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                c3Var.b();
                sVar3.f1491a = (String) c3Var.E;
                sVar3.l = x0.n("video/mp2t");
                sVar3.m = x0.n("application/id3");
                oi.k.w(sVar3, l0VarW2);
                break;
        }
    }

    @Override
    public final void d(boolean z10) {
        int i10;
        switch (this.f6744a) {
            case 0:
                if (this.f6745b) {
                    ta.c0.A(this.f6746c != -9223372036854775807L);
                    for (l0 l0Var : (l0[]) this.f6750g) {
                        l0Var.d(this.f6746c, 1, this.f6748e, 0, null);
                    }
                    this.f6745b = false;
                }
                break;
            default:
                ((l0) this.f6750g).getClass();
                if (this.f6745b && (i10 = this.f6747d) != 0 && this.f6748e == i10) {
                    ta.c0.A(this.f6746c != -9223372036854775807L);
                    ((l0) this.f6750g).d(this.f6746c, 1, this.f6747d, 0, null);
                    this.f6745b = false;
                    break;
                }
                break;
        }
    }

    @Override
    public final void e(int i10, long j9) {
        switch (this.f6744a) {
            case 0:
                if ((i10 & 4) != 0) {
                    this.f6745b = true;
                    this.f6746c = j9;
                    this.f6748e = 0;
                    this.f6747d = 2;
                    break;
                }
                break;
            default:
                if ((i10 & 4) != 0) {
                    this.f6745b = true;
                    this.f6746c = j9;
                    this.f6747d = 0;
                    this.f6748e = 0;
                    break;
                }
                break;
        }
    }
}
