package sd;

import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;

public final class q0 implements Cloneable {
    public long A = 0;
    public z0 B;
    public Float C;
    public z0 D;
    public Float E;
    public c0 F;
    public Float G;
    public c0[] H;
    public c0 I;
    public Float J;
    public t K;
    public ArrayList L;
    public c0 M;
    public Integer N;
    public Boolean O;
    public p10.a P;
    public String Q;
    public String R;
    public String S;
    public Boolean T;
    public Boolean U;
    public z0 V;
    public Float W;
    public String X;
    public String Y;
    public z0 Z;

    public Float f14048a0;

    public z0 f14049b0;

    public Float f14050c0;

    public int f14051d0;

    public int f14052e0;

    public int f14053f0;

    public int f14054g0;

    public int f14055h0;

    public int f14056i0;

    public int f14057j0;

    public int f14058k0;

    public int f14059l0;

    public int f14060m0;

    public static q0 a() {
        q0 q0Var = new q0();
        q0Var.A = -1L;
        t tVar = t.B;
        q0Var.B = tVar;
        q0Var.f14051d0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        q0Var.C = fValueOf;
        q0Var.D = null;
        q0Var.E = fValueOf;
        q0Var.F = new c0(1.0f);
        q0Var.f14052e0 = 1;
        q0Var.f14053f0 = 1;
        q0Var.G = Float.valueOf(4.0f);
        q0Var.H = null;
        q0Var.I = new c0(0.0f);
        q0Var.J = fValueOf;
        q0Var.K = tVar;
        q0Var.L = null;
        q0Var.M = new c0(12.0f, 7);
        q0Var.N = Integer.valueOf(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN);
        q0Var.f14054g0 = 1;
        q0Var.f14055h0 = 1;
        q0Var.f14056i0 = 1;
        q0Var.f14057j0 = 1;
        Boolean bool = Boolean.TRUE;
        q0Var.O = bool;
        q0Var.P = null;
        q0Var.Q = null;
        q0Var.R = null;
        q0Var.S = null;
        q0Var.T = bool;
        q0Var.U = bool;
        q0Var.V = tVar;
        q0Var.W = fValueOf;
        q0Var.X = null;
        q0Var.f14058k0 = 1;
        q0Var.Y = null;
        q0Var.Z = null;
        q0Var.f14048a0 = fValueOf;
        q0Var.f14049b0 = null;
        q0Var.f14050c0 = fValueOf;
        q0Var.f14059l0 = 1;
        q0Var.f14060m0 = 1;
        return q0Var;
    }

    public final Object clone() {
        q0 q0Var = (q0) super.clone();
        c0[] c0VarArr = this.H;
        if (c0VarArr != null) {
            q0Var.H = (c0[]) c0VarArr.clone();
        }
        return q0Var;
    }
}
