package gz;

import g1.m6;
import ri.t1;

public final class d1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m6 C;
    public final m1 D;

    public d1(m6 m6Var, m1 m1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m6Var;
        this.D = m1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d1(this.C, this.D, cVar, 0);
            case 1:
                return new d1(this.C, this.D, cVar, 1);
            case 2:
                return new d1(this.C, this.D, cVar, 2);
            case 3:
                return new d1(this.C, this.D, cVar, 3);
            case 4:
                return new d1(this.C, this.D, cVar, 4);
            default:
                return new d1(this.C, this.D, cVar, 5);
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
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((d1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(k.a);
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(j.a);
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(v.a);
                return g00.b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(i.a);
                return g00.b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(f.a);
                return g00.b0.a;
            default:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.l(h0.a);
                return g00.b0.a;
        }
    }
}
