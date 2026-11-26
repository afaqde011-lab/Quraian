package f40;

import a40.c0;
import a40.k0;
import a40.w0;
import a40.x1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

public final class e extends k0 implements m00.d, k00.c {
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final a40.v D;
    public final m00.c E;
    public Object F;
    public final Object G;
    private volatile Object _reusableCancellableContinuation$volatile;

    public e(a40.v vVar, m00.c cVar) {
        super(-1);
        this.D = vVar;
        this.E = cVar;
        this.F = a.b;
        this.G = a.m(cVar.getContext());
    }

    @Override
    public final k00.c c() {
        return this;
    }

    @Override
    public final m00.d getCallerFrame() {
        return this.E;
    }

    @Override
    public final k00.i getContext() {
        return this.E.getContext();
    }

    @Override
    public final Object j() {
        Object obj = this.F;
        this.F = a.b;
        return obj;
    }

    @Override
    public final void resumeWith(Object obj) throws DispatchException {
        Throwable thA = g00.n.a(obj);
        Object sVar = thA == null ? obj : new a40.s(thA, false);
        m00.c cVar = this.E;
        k00.i context = cVar.getContext();
        a40.v vVar = this.D;
        if (a.j(vVar, context)) {
            this.F = sVar;
            this.C = 0;
            a.i(vVar, cVar.getContext(), this);
            return;
        }
        w0 w0VarA = x1.a();
        if (w0VarA.C >= 4294967296L) {
            this.F = sVar;
            this.C = 0;
            w0VarA.s0(this);
            return;
        }
        w0VarA.u0(true);
        try {
            k00.i context2 = cVar.getContext();
            Object objN = a.n(context2, this.G);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objN);
                while (w0VarA.w0()) {
                }
            } catch (Throwable th) {
                a.g(context2, objN);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                i(th2);
            } finally {
                w0VarA.r0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.D + ", " + c0.F(this.E) + ']';
    }
}
