package sm;

import ri.t1;
import x.b1;

public final class k extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final tm.e C;

    public k(tm.e eVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = eVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                k kVar = new k(this.C, cVar, 0);
                kVar.B = ((Number) obj).intValue();
                return kVar;
            case 1:
                return new k(this.C, cVar, 1);
            case 2:
                return new k(this.C, cVar, 2);
            case 3:
                return new k(this.C, cVar, 3);
            case 4:
                return new k(this.C, cVar, 4);
            case 5:
                return new k(this.C, cVar, 5);
            case 6:
                return new k(this.C, cVar, 6);
            default:
                return new k(this.C, cVar, 7);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                k kVar = (k) create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                kVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 6:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((k) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        tm.e eVar = this.C;
        switch (i) {
            case 0:
                int i2 = this.B;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                eVar.a(i2);
                return b0Var;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar = eVar.n;
                Float f = new Float(0.0f);
                b1 b1Var = eVar.k;
                this.B = 1;
                return x.b.c(bVar, f, b1Var, (u00.k) null, this, 12) == aVar2 ? aVar2 : b0Var;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar2 = eVar.o;
                Float f2 = new Float(1.0f);
                b1 b1Var2 = eVar.l;
                this.B = 1;
                return x.b.c(bVar2, f2, b1Var2, (u00.k) null, this, 12) == aVar3 ? aVar3 : b0Var;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i5 = this.B;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar3 = eVar.p;
                Float f3 = new Float(eVar.c);
                b1 b1Var3 = eVar.i;
                this.B = 1;
                return x.b.c(bVar3, f3, b1Var3, (u00.k) null, this, 12) == aVar4 ? aVar4 : b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar4 = eVar.q;
                Float f4 = new Float(eVar.c);
                b1 b1Var4 = eVar.j;
                this.B = 1;
                return x.b.c(bVar4, f4, b1Var4, (u00.k) null, this, 12) == aVar5 ? aVar5 : b0Var;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i7 = this.B;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar5 = eVar.o;
                Float f5 = new Float(0.0f);
                b1 b1Var5 = eVar.l;
                this.B = 1;
                return x.b.c(bVar5, f5, b1Var5, (u00.k) null, this, 12) == aVar6 ? aVar6 : b0Var;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i8 = this.B;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar6 = eVar.p;
                Float f6 = new Float(1.0f);
                b1 b1Var6 = eVar.i;
                this.B = 1;
                return x.b.c(bVar6, f6, b1Var6, (u00.k) null, this, 12) == aVar7 ? aVar7 : b0Var;
            default:
                l00.a aVar8 = l00.a.A;
                int i9 = this.B;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                x.b bVar7 = eVar.q;
                Float f7 = new Float(1.0f);
                b1 b1Var7 = eVar.j;
                this.B = 1;
                return x.b.c(bVar7, f7, b1Var7, (u00.k) null, this, 12) == aVar8 ? aVar8 : b0Var;
        }
    }
}
