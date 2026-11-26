package e40;

import a1.y1;
import a40.c0;
import g00.b0;

public final class p extends m00.c implements d40.j {
    public final d40.j A;
    public final k00.i B;
    public final int C;
    public k00.i D;
    public k00.c E;

    public p(d40.j jVar, k00.i iVar) {
        super(n.A, k00.j.A);
        this.A = jVar;
        this.B = iVar;
        this.C = ((Number) iVar.fold(0, new dm.a(18))).intValue();
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        try {
            Object objI = i(cVar, obj);
            return objI == l00.a.A ? objI : b0.a;
        } catch (Throwable th) {
            this.D = new l(th, cVar.getContext());
            throw th;
        }
    }

    @Override
    public final m00.d getCallerFrame() {
        k00.c cVar = this.E;
        if (cVar instanceof m00.d) {
            return (m00.d) cVar;
        }
        return null;
    }

    @Override
    public final k00.i getContext() {
        k00.i iVar = this.D;
        return iVar == null ? k00.j.A : iVar;
    }

    @Override
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(k00.c cVar, Object obj) {
        k00.i context = cVar.getContext();
        c0.m(context);
        k00.i iVar = this.D;
        if (iVar != context) {
            if (iVar instanceof l) {
                throw new IllegalStateException(r30.l.j0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((l) iVar).B + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new y1(this, 13))).intValue() != this.C) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.B + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.D = context;
        }
        this.E = cVar;
        u00.o oVar = r.a;
        d40.j jVar = this.A;
        kotlin.jvm.internal.m.c(jVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = oVar.invoke(jVar, obj, this);
        if (!kotlin.jvm.internal.m.a(objInvoke, l00.a.A)) {
            this.E = null;
        }
        return objInvoke;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Throwable thA = g00.n.a(obj);
        if (thA != null) {
            this.D = new l(thA, getContext());
        }
        k00.c cVar = this.E;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return l00.a.A;
    }
}
