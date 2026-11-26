package b00;

import a1.d;
import a40.z;
import d40.o;
import d40.p1;
import g00.b0;
import m00.i;
import ri.t1;
import u00.n;
import uu.w;

public final class a extends i implements n {
    public final int A;
    public int B;
    public final c C;

    public a(c cVar, k00.c cVar2, int i) {
        super(2, cVar2);
        this.A = i;
        this.C = cVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a(this.C, cVar, 0);
            case 1:
                return new a(this.C, cVar, 1);
            default:
                return new a(this.C, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((a) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    c cVar = this.C;
                    p1 p1Var = cVar.h;
                    d dVar = new d(cVar, (k00.c) null, 10);
                    this.B = 1;
                    if (o.i(p1Var, dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.a(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    c cVar2 = this.C;
                    p1 p1Var2 = ((w) cVar2.b).G;
                    ab.o oVar = new ab.o(cVar2, (k00.c) null, 2);
                    this.B = 1;
                    if (o.i(p1Var2, oVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
