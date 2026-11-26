package tm;

import a40.z;
import g00.b0;
import ri.t1;
import u00.k;
import u00.n;
import x.b1;

public final class a extends m00.i implements n {
    public final int A;
    public int B;
    public final e C;
    public final float D;

    public a(e eVar, float f, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = eVar;
        this.D = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a(this.C, this.D, cVar, 0);
            case 1:
                return new a(this.C, this.D, cVar, 1);
            default:
                return new a(this.C, this.D, cVar, 2);
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
                    e eVar = this.C;
                    x.b bVar = eVar.m;
                    Float f = new Float(this.D);
                    b1 b1Var = eVar.h;
                    this.B = 1;
                    if (x.b.c(bVar, f, b1Var, (k) null, this, 12) == aVar) {
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
                    e eVar2 = this.C;
                    x.b bVar2 = eVar2.m;
                    Float f2 = new Float(this.D);
                    b1 b1Var2 = eVar2.h;
                    sm.e eVar3 = new sm.e(eVar2, 13);
                    this.B = 1;
                    if (x.b.c(bVar2, f2, b1Var2, eVar3, this, 4) == aVar2) {
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
                    e eVar4 = this.C;
                    x.b bVar3 = eVar4.n;
                    Float f3 = new Float(this.D);
                    b1 b1Var3 = eVar4.k;
                    this.B = 1;
                    if (x.b.c(bVar3, f3, b1Var3, (k) null, this, 12) == aVar3) {
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
