package ab;

import a40.f1;
import androidx.work.impl.WorkerStoppedException;
import java.util.concurrent.CancellationException;
import ri.t1;

public final class j0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final l0 C;

    public j0(l0 l0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = l0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j0(this.C, cVar, 0);
            default:
                return new j0(this.C, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object e0Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                this.B = 1;
                Object objA = l0.a(this.C, this);
                return objA == aVar ? aVar : objA;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                l0 l0Var = this.C;
                try {
                    if (i11 == 0) {
                        t1.O(obj);
                        f1 f1Var = l0Var.m;
                        j0 j0Var = new j0(l0Var, null, 0);
                        this.B = 1;
                        obj = a40.c0.J(j0Var, f1Var, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    e0Var = (h0) obj;
                    break;
                } catch (WorkerStoppedException e3) {
                    e0Var = new g0(e3.A);
                } catch (CancellationException unused) {
                    e0Var = new e0();
                } catch (Throwable th2) {
                    za.v.d().c(m0.f398a, "Unexpected error in WorkerWrapper", th2);
                    e0Var = new e0();
                }
                Object objO = l0Var.f393h.o(new a1.z(new i0(e0Var, l0Var, 0), 13));
                kotlin.jvm.internal.m.d(objO, "runInTransaction(...)");
                return objO;
        }
    }
}
