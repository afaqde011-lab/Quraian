package ha;

import a40.z;
import ca.t;
import g00.b0;
import ri.t1;
import u00.k;
import u00.n;

public final class c extends m00.i implements n {
    public final int A = 0;
    public int B;
    public final t C;
    public final boolean D;
    public final boolean E;
    public final k F;

    public c(t tVar, boolean z10, boolean z11, k kVar, k00.c cVar) {
        super(2, cVar);
        this.C = tVar;
        this.D = z10;
        this.E = z11;
        this.F = kVar;
    }

    public c(k00.c cVar, t tVar, boolean z10, boolean z11, k kVar) {
        super(2, cVar);
        this.C = tVar;
        this.D = z10;
        this.E = z11;
        this.F = kVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c(this.C, this.D, this.E, this.F, cVar);
            default:
                return new c(cVar, this.C, this.D, this.E, this.F);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
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
                t tVar = this.C;
                boolean z10 = !(tVar.k() && tVar.l()) && this.D;
                boolean z11 = this.E;
                t tVar2 = this.C;
                b bVar = new b(z10, z11, tVar2, null, this.F, 0);
                this.B = 1;
                Object objQ = tVar2.q(z11, bVar, this);
                return objQ == aVar ? aVar : objQ;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                k kVar = this.F;
                boolean z12 = this.E;
                boolean z13 = this.D;
                t tVar3 = this.C;
                b bVar2 = new b(z12, z13, tVar3, null, kVar, 1);
                this.B = 1;
                Object objQ2 = tVar3.q(z13, bVar2, this);
                return objQ2 == aVar2 ? aVar2 : objQ2;
        }
    }
}
