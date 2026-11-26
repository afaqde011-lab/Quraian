package k9;

import android.view.Surface;
import java.util.List;

public final class d0 implements p0, e7.h, n3 {
    public final int A;
    public final Object B;
    public final int C;
    public final int D;
    public final Object E;

    public d0(int i10, int i11, String str, e1 e1Var) {
        this.A = 3;
        this.B = str;
        this.C = i10;
        this.D = i11;
        this.E = e1Var;
    }

    public d0(Object obj, Object obj2, int i10, int i11, int i12) {
        this.A = i12;
        this.B = obj;
        this.E = obj2;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public void accept(Object obj) {
        p3 p3Var = (p3) this.B;
        Surface surface = (Surface) this.E;
        v3 v3Var = (v3) obj;
        ((s1) p3Var.f9383e.get()).getClass();
        if (surface == null) {
            v3Var.setVideoSurfaceHolder(null);
            p3Var.f9388j = null;
        } else {
            o3 o3Var = new o3(surface, this.C, this.D);
            p3Var.f9388j = o3Var;
            v3Var.setVideoSurfaceHolder(o3Var);
        }
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                t0 t0Var = (t0) this.B;
                mVar.f2(t0Var.f9440c, i10, (Surface) this.E, this.C, this.D);
                break;
            default:
                t0 t0Var2 = (t0) this.B;
                List list = (List) this.E;
                d1 d1Var = t0Var2.f9440c;
                fh.q0 q0VarM = fh.t0.m();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    q0VarM.c(((androidx.media3.common.q0) list.get(i11)).c(true));
                }
                androidx.media3.common.g gVar = new androidx.media3.common.g(q0VarM.g());
                f4 f4Var = t0Var2.f9449n;
                f4Var.getClass();
                int iF = f4Var.f9293a.f();
                int i12 = this.C;
                int i13 = this.D;
                if (iF >= 2) {
                    mVar.W0(t0Var2.f9440c, i10, i12, i13, gVar);
                } else {
                    mVar.S0(d1Var, i10, i13, gVar);
                    mVar.W(d1Var, i10, i12, i13);
                }
                break;
        }
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        return s1Var.v(a2Var, (String) this.B, this.C, this.D, (e1) this.E);
    }
}
