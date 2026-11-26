package a40;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;

public abstract class a extends m1 implements k00.c, z {
    public final k00.i C;

    public a(k00.i iVar, boolean z) {
        super(z);
        N((e1) iVar.get(w.B));
        this.C = iVar.plus(this);
    }

    @Override
    public final k00.i A() {
        return this.C;
    }

    @Override
    public final void M(CompletionHandlerException completionHandlerException) {
        c0.t(completionHandlerException, this.C);
    }

    @Override
    public final void X(Object obj) {
        if (!(obj instanceof s)) {
            i0(obj);
        } else {
            s sVar = (s) obj;
            h0(sVar.a, s.b.get(sVar) == 1);
        }
    }

    @Override
    public final k00.i getContext() {
        return this.C;
    }

    public void h0(Throwable th, boolean z) {
    }

    public void i0(Object obj) {
    }

    public final void j0(a0 a0Var, a aVar, u00.n nVar) {
        Object objInvoke;
        int iOrdinal = a0Var.ordinal();
        g00.b0 b0Var = g00.b0.a;
        if (iOrdinal == 0) {
            try {
                f40.a.h(b0Var, qd.s0.j0(qd.s0.Z(aVar, this, nVar)));
                return;
            } catch (Throwable th) {
                th = th;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).A;
                }
                resumeWith(ri.t1.s(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                kotlin.jvm.internal.m.e(nVar, "<this>");
                qd.s0.j0(qd.s0.Z(aVar, this, nVar)).resumeWith(b0Var);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                k00.i iVar = this.C;
                Object objN = f40.a.n(iVar, null);
                try {
                    if (nVar instanceof m00.a) {
                        kotlin.jvm.internal.d0.d(2, nVar);
                        objInvoke = nVar.invoke(aVar, this);
                    } else {
                        objInvoke = qd.s0.u0(nVar, aVar, this);
                    }
                    f40.a.g(iVar, objN);
                    if (objInvoke != l00.a.A) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    f40.a.g(iVar, objN);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                if (th instanceof DispatchException) {
                    th = ((DispatchException) th).A;
                }
                resumeWith(ri.t1.s(th));
            }
        }
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thA = g00.n.a(obj);
        if (thA != null) {
            obj = new s(thA, false);
        }
        Object objT = T(obj);
        if (objT == c0.e) {
            return;
        }
        o(objT);
    }

    @Override
    public final String w() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
