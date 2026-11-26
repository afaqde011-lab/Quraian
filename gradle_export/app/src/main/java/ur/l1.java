package ur;

import ri.t1;

public final class l1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final r1 C;
    public final boolean D;

    public l1(r1 r1Var, boolean z, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = r1Var;
        this.D = z;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l1(this.C, this.D, cVar, 0);
            case 1:
                return new l1(this.C, this.D, cVar, 1);
            default:
                return new l1(this.C, this.D, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((l1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    vr.c cVar = this.C.D;
                    this.B = 1;
                    if (cVar.a(this.D, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i2 == 0) {
                    t1.O(obj);
                    or.b bVar = this.C.B;
                    this.B = 1;
                    Object objF = bVar.a.f(this.D, this);
                    if (objF != aVar2) {
                        objF = b0Var;
                    }
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    xw.d dVar = this.C.A;
                    this.B = 1;
                    if (dVar.b(this.D, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
