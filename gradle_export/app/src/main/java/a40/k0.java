package a40;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

public abstract class k0 extends h40.i {
    public int C;

    public k0(int i) {
        super(false, 0L);
        this.C = i;
    }

    public void a(CancellationException cancellationException) {
    }

    public abstract k00.c c();

    public Throwable d(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void i(Throwable th) {
        c0.t(new b0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    @Override
    public final void run() {
        try {
            k00.c cVarC = c();
            kotlin.jvm.internal.m.c(cVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            f40.e eVar = (f40.e) cVarC;
            m00.c cVar = eVar.E;
            Object obj = eVar.G;
            k00.i context = cVar.getContext();
            Object objN = f40.a.n(context, obj);
            e1 e1Var = null;
            c2 c2VarI = objN != f40.a.d ? c0.I(cVar, context, objN) : null;
            try {
                k00.i context2 = cVar.getContext();
                Object objJ = j();
                Throwable thD = d(objJ);
                if (thD == null) {
                    int i = this.C;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        e1Var = (e1) context2.get(w.B);
                    }
                }
                if (e1Var != null && !e1Var.a()) {
                    CancellationException cancellationExceptionX = e1Var.x();
                    a(cancellationExceptionX);
                    cVar.resumeWith(ri.t1.s(cancellationExceptionX));
                } else if (thD != null) {
                    cVar.resumeWith(ri.t1.s(thD));
                } else {
                    cVar.resumeWith(f(objJ));
                }
            } finally {
                if (c2VarI == null || c2VarI.l0()) {
                    f40.a.g(context, objN);
                }
            }
        } catch (DispatchException e) {
            c0.t(e.A, c().getContext());
        } catch (Throwable th) {
            i(th);
        }
    }
}
