package d0;

import com.google.android.gms.cast.Cast;

public abstract class r0 {

    public static final q0 f4499a;

    public static final q0 f4500b;

    static {
        int i10 = 3;
        k00.c cVar = null;
        f4499a = new q0(i10, cVar, 0);
        f4500b = new q0(i10, cVar, 1);
    }

    public static b2.r a(b2.r rVar, h1.l lVar, q1 q1Var, boolean z10, f0.i iVar, boolean z11, u00.o oVar, boolean z12, int i10) {
        if ((i10 & 8) != 0) {
            iVar = null;
        }
        return rVar.V(new p0(lVar, q1Var, z10, iVar, z11, f4499a, oVar, (i10 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? false : z12));
    }

    public static final long b(long j9) {
        return p30.f.U(Float.isNaN(y3.q.b(j9)) ? 0.0f : y3.q.b(j9), Float.isNaN(y3.q.c(j9)) ? 0.0f : y3.q.c(j9));
    }
}
