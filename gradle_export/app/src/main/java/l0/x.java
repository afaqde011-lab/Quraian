package l0;

import ri.t1;

public final class x extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final z C;

    public x(z zVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = zVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new x(this.C, cVar, 0);
            case 1:
                return new x(this.C, cVar, 1);
            case 2:
                return new x(this.C, cVar, 2);
            case 3:
                return new x(this.C, cVar, 3);
            default:
                return new x(this.C, cVar, 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        z zVar = this.C;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                int i11 = this.B;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar = zVar.f9821p;
                Float f3 = new Float(1.0f);
                this.B = 1;
                return bVar.f(f3, this) == aVar ? aVar : b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    x.b bVar2 = zVar.f9820o;
                    y3.j jVar = new y3.j(0L);
                    this.B = 1;
                    if (bVar2.f(jVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                int i13 = z.f9807t;
                zVar.g(0L);
                zVar.f(false);
                return b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i14 = this.B;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar3 = zVar.f9820o;
                this.B = 1;
                return bVar3.g(this) == aVar3 ? aVar3 : b0Var;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i15 = this.B;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar4 = zVar.f9821p;
                this.B = 1;
                return bVar4.g(this) == aVar4 ? aVar4 : b0Var;
            default:
                l00.a aVar5 = l00.a.A;
                int i16 = this.B;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar5 = zVar.f9821p;
                this.B = 1;
                return bVar5.g(this) == aVar5 ? aVar5 : b0Var;
        }
    }
}
