package b1;

import a40.l1;
import d0.g3;
import ri.t1;

public final class b0 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public final e0 C;
    public final v2.v D;
    public final boolean E;

    public b0(e0 e0Var, v2.v vVar, boolean z10, k00.c cVar) {
        super(2, cVar);
        this.C = e0Var;
        this.D = vVar;
        this.E = z10;
    }

    public b0(v2.v vVar, e0 e0Var, boolean z10, k00.c cVar) {
        super(2, cVar);
        this.D = vVar;
        this.C = e0Var;
        this.E = z10;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b0(this.D, this.C, this.E, cVar);
            default:
                return new b0(this.C, this.D, this.E, cVar);
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
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i10 == 0) {
                    t1.O(obj);
                    boolean z10 = this.E;
                    e0 e0Var = this.C;
                    androidx.media3.common.q qVar = new androidx.media3.common.q(e0Var, z10, 2);
                    j jVar = new j(e0Var, 3);
                    this.B = 1;
                    Object objE = g3.e(this.D, new l1(qVar, jVar, (k00.c) null, 1), this);
                    if (objE != aVar) {
                        objE = b0Var;
                    }
                    if (objE == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (e0.b(this.C, this.D, this.E, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
