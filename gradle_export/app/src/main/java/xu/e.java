package xu;

import a40.z;
import bt.i2;
import d40.o;
import d40.p1;
import d40.u0;
import g00.b0;
import m00.i;
import ri.t1;
import u00.n;
import vp.x;

public final class e extends i implements n {
    public final int A;
    public int B;
    public final f C;

    public e(f fVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = fVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e(this.C, cVar, 0);
            default:
                return new e(this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((e) create(zVar, cVar)).invokeSuspend(b0.a);
            default:
                ((e) create(zVar, cVar)).invokeSuspend(b0.a);
                return l00.a.A;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    f fVar = this.C;
                    x xVar = fVar.c;
                    d40.i iVarO = o.o(new u0(xVar.c, xVar.k, new i2(3, null, 3)));
                    d dVar = new d(fVar, 0);
                    this.B = 1;
                    if (iVarO.collect(dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw a1.b.t(obj);
                }
                t1.O(obj);
                f fVar2 = this.C;
                p1 p1Var = fVar2.d.b;
                d dVar2 = new d(fVar2, 1);
                this.B = 1;
                p1Var.collect(dVar2, this);
                return aVar2;
        }
    }
}
