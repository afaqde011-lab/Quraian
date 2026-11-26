package l6;

import a40.c0;
import qd.s0;
import ri.t1;

public final class e extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final f C;

    public e(f fVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = fVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e(this.C, cVar, 0);
            default:
                return new e(this.C, cVar, 1);
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
                if (i10 == 0) {
                    t1.O(obj);
                    this.C.b();
                    f fVar = this.C;
                    this.B = 1;
                    a40.k kVar = new a40.k(1, s0.j0(this));
                    kVar.r();
                    synchronized (fVar.D) {
                        fVar.E = 20;
                        fVar.G = kVar;
                    }
                    kVar.u(new a20.d(fVar, 20));
                    if (kVar.q() == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    f fVar2 = this.C;
                    this.B = 1;
                    fVar2.getClass();
                    if (c0.L(5000L, new e(fVar2, null, 0), this) == aVar2) {
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
