package ns;

import a40.c0;
import a40.z;
import g00.b0;
import ri.t1;
import u00.n;

public final class i extends m00.i implements n {
    public final int A;
    public int B;
    public final j C;

    public i(j jVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = jVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new i(this.C, cVar, 0);
            case 1:
                return new i(this.C, cVar, 1);
            case 2:
                return new i(this.C, cVar, 2);
            case 3:
                return new i(this.C, cVar, 3);
            default:
                return new i(this.C, cVar, 4);
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
            case 2:
                break;
            case 3:
                break;
        }
        return ((i) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return b0.a;
                }
                t1.O(obj);
                this.B = 1;
                if (c0.l(3000L, this) == aVar) {
                    return aVar;
                }
                this.B = 2;
                if (this.C.j(this) == aVar) {
                    return aVar;
                }
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.j(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (j.c(this.C, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (j.a(this.C, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0.a;
                }
                t1.O(obj);
                this.B = 1;
                j.b(this.C, this);
                return aVar5;
        }
    }
}
