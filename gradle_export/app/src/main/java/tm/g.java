package tm;

import a40.z;
import g00.b0;
import ri.t1;
import u00.k;
import u00.n;
import x.b1;

public final class g extends m00.i implements n {
    public final int A;
    public int B;
    public final i C;

    public g(i iVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = iVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.C, cVar, 0);
            case 1:
                return new g(this.C, cVar, 1);
            case 2:
                return new g(this.C, cVar, 2);
            case 3:
                return new g(this.C, cVar, 3);
            case 4:
                return new g(this.C, cVar, 4);
            default:
                return new g(this.C, cVar, 5);
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
            case 4:
                break;
        }
        return ((g) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    i iVar = this.C;
                    x.b bVar = iVar.e;
                    Float f = new Float(1.0f);
                    b1 b1Var = iVar.c;
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
                    i iVar2 = this.C;
                    x.b bVar2 = iVar2.f;
                    h2.b bVar3 = new h2.b(iVar2.g);
                    this.B = 1;
                    if (bVar2.f(bVar3, this) == aVar2) {
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
                    i iVar3 = this.C;
                    x.b bVar4 = iVar3.e;
                    Float f2 = new Float(0.0f);
                    b1 b1Var2 = iVar3.c;
                    this.B = 1;
                    if (x.b.c(bVar4, f2, b1Var2, (k) null, this, 12) == aVar3) {
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
                    i iVar4 = this.C;
                    x.b bVar5 = iVar4.f;
                    h2.b bVar6 = new h2.b(iVar4.g);
                    b1 b1Var3 = iVar4.d;
                    this.B = 1;
                    if (x.b.c(bVar5, bVar6, b1Var3, (k) null, this, 12) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    i iVar5 = this.C;
                    x.b bVar7 = iVar5.e;
                    Float f3 = new Float(0.0f);
                    b1 b1Var4 = iVar5.c;
                    this.B = 1;
                    if (x.b.c(bVar7, f3, b1Var4, (k) null, this, 12) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    i iVar6 = this.C;
                    x.b bVar8 = iVar6.f;
                    h2.b bVar9 = new h2.b(iVar6.g);
                    b1 b1Var5 = iVar6.d;
                    this.B = 1;
                    if (x.b.c(bVar8, bVar9, b1Var5, (k) null, this, 12) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
