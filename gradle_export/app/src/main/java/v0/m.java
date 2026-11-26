package v0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import b2.o;
import b2.r;
import c3.o0;
import g00.b0;
import h0.z1;
import l1.g0;
import l1.q;
import l1.r1;

public final class m {

    public static final m f15329a = new m();

    public final void a(Drawable drawable, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(257732500);
        int i11 = (g0Var.i(drawable) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            r rVarM = z1.m(o.A, c0.e.f2592j);
            boolean zI = g0Var.i(drawable);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new q0.a(drawable, 15);
                g0Var.n0(objN);
            }
            h0.o.a(f2.h.e(rVarM, (u00.k) objN), g0Var, 0);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l0.g0(this, drawable, i10, 28);
        }
    }

    public final void b(final Icon icon, l1.j jVar, final int i10) {
        r1 r1VarT;
        u00.n nVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2116504409);
        int i11 = (g0Var.i(icon) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            Context context = (Context) g0Var.k(o0.f2722b);
            boolean zG = g0Var.g(icon) | g0Var.g(context);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = icon.loadDrawable(context);
                g0Var.n0(objN);
            }
            Drawable drawable = (Drawable) objN;
            if (drawable == null) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                }
                final int i12 = 0;
                nVar = new u00.n(this, icon, i10, i12) {
                    public final int A;
                    public final m B;
                    public final Icon C;

                    {
                        this.A = i12;
                        this.B = this;
                    }

                    public final Object invoke(Object obj, Object obj2) {
                        int i13 = this.A;
                        l1.j jVar2 = (l1.j) obj;
                        ((Integer) obj2).getClass();
                        switch (i13) {
                            case 0:
                                this.B.b(this.C, jVar2, q.K(49));
                                break;
                            default:
                                this.B.b(this.C, jVar2, q.K(49));
                                break;
                        }
                        return b0.a;
                    }
                };
            } else {
                a(drawable, g0Var, 48);
            }
            r1VarT.f9921d = nVar;
        }
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i13 = 1;
            nVar = new u00.n(this, icon, i10, i13) {
                public final int A;
                public final m B;
                public final Icon C;

                {
                    this.A = i13;
                    this.B = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    int i14 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i14) {
                        case 0:
                            this.B.b(this.C, jVar2, q.K(49));
                            break;
                        default:
                            this.B.b(this.C, jVar2, q.K(49));
                            break;
                    }
                    return b0.a;
                }
            };
            r1VarT.f9921d = nVar;
        }
    }
}
