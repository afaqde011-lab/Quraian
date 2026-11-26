package lp;

import a40.z;
import g00.b0;
import jp.x;
import ri.t1;
import u00.n;

public final class j extends m00.i implements n {
    public final int A;
    public int B;
    public final x C;
    public final q2.a D;
    public final xk.d E;

    public j(x xVar, q2.a aVar, xk.d dVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
        this.D = aVar;
        this.E = dVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j(this.C, this.D, this.E, cVar, 0);
            case 1:
                return new j(this.C, this.D, this.E, cVar, 1);
            case 2:
                return new j(this.C, this.D, this.E, cVar, 2);
            case 3:
                return new j(this.C, this.D, this.E, cVar, 3);
            default:
                return new j(this.C, this.D, this.E, cVar, 4);
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
        return ((j) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    if (this.C.e != null) {
                        this.D.a(0);
                        this.B = 1;
                        if (xk.d.a(this.E, this) == aVar) {
                            return aVar;
                        }
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
                    if (this.C.o) {
                        this.D.a(0);
                        this.B = 1;
                        if (xk.d.a(this.E, this) == aVar2) {
                            return aVar2;
                        }
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
                    if (this.C.x > 0) {
                        this.D.a(0);
                        this.B = 1;
                        if (xk.d.a(this.E, this) == aVar3) {
                            return aVar3;
                        }
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
                    if (this.C.g != null) {
                        this.D.a(0);
                        this.B = 1;
                        if (xk.d.a(this.E, this) == aVar4) {
                            return aVar4;
                        }
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
                if (i5 == 0) {
                    t1.O(obj);
                    if (this.C.t != null) {
                        this.D.a(0);
                        this.B = 1;
                        if (xk.d.a(this.E, this) == aVar5) {
                            return aVar5;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
