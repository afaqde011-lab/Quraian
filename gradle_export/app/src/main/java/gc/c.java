package gc;

import a40.c0;
import a40.q1;
import ev.x;
import g00.b0;
import kotlin.NoWhenBranchMatchedException;
import l1.i1;
import ri.t1;

public final class c extends m00.i implements u00.k {
    public int A;
    public final g B;
    public final int C;
    public final float D;
    public final cc.a E;
    public final float F;
    public final int G;

    public c(g gVar, int i10, float f3, cc.a aVar, float f10, int i11, k00.c cVar) {
        super(1, cVar);
        this.B = gVar;
        this.C = i10;
        this.D = f3;
        this.E = aVar;
        this.F = f10;
        this.G = i11;
    }

    public final k00.c create(k00.c cVar) {
        return new c(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    public final Object invoke(Object obj) {
        return create((k00.c) obj).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        q1 q1Var;
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        b0 b0Var = b0.a;
        g gVar = this.B;
        try {
            if (i10 == 0) {
                t1.O(obj);
                gVar.g(this.C);
                i1 i1Var = gVar.A;
                gVar.C.setValue(Integer.MAX_VALUE);
                i1 i1Var2 = gVar.D;
                Boolean bool = Boolean.FALSE;
                i1Var2.setValue(bool);
                i1 i1Var3 = gVar.F;
                float f3 = this.D;
                i1Var3.setValue(Float.valueOf(f3));
                gVar.E.setValue(null);
                i1 i1Var4 = gVar.I;
                cc.a aVar2 = this.E;
                i1Var4.setValue(aVar2);
                gVar.h(this.F);
                gVar.G.setValue(bool);
                gVar.L.setValue(Long.MIN_VALUE);
                if (aVar2 == null) {
                    i1Var.setValue(bool);
                    return b0Var;
                }
                if (Float.isInfinite(f3)) {
                    gVar.h(gVar.e());
                    i1Var.setValue(bool);
                    gVar.g(Integer.MAX_VALUE);
                    return b0Var;
                }
                i1Var.setValue(Boolean.TRUE);
                int iB = e4.f.b(this.G);
                if (iB == 0) {
                    q1Var = k00.j.A;
                } else {
                    if (iB != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    q1Var = q1.B;
                }
                x xVar = new x(this.G, c0.r(getContext()), this.C, this.B, (k00.c) null);
                this.A = 1;
                if (c0.J(xVar, q1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            c0.m(getContext());
            g.c(gVar, false);
            return b0Var;
        } catch (Throwable th2) {
            g.c(gVar, false);
            throw th2;
        }
    }
}
