package z;

public final class d1 extends m00.i implements u00.n {
    public j40.a A;
    public Object B;
    public Object C;
    public e1 D;
    public int E;
    public Object F;
    public final b1 G;
    public final e1 H;
    public final m00.i I;
    public final Object J;

    public d1(b1 b1Var, e1 e1Var, u00.n nVar, Object obj, k00.c cVar) {
        super(2, cVar);
        this.G = b1Var;
        this.H = e1Var;
        this.I = (m00.i) nVar;
        this.J = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        d1 d1Var = new d1(this.G, this.H, this.I, this.J, cVar);
        d1Var.F = obj;
        return d1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        c1 c1Var;
        e1 e1Var;
        j40.a aVar;
        u00.n nVar;
        Object obj2;
        e1 e1Var2;
        Throwable th2;
        c1 c1Var2;
        j40.a aVar2;
        l00.a aVar3 = l00.a.A;
        ?? r4 = this.E;
        try {
            try {
                if (r4 == 0) {
                    ri.t1.O(obj);
                    a40.e1 e1Var3 = ((a40.z) this.F).A().get(a40.w.B);
                    kotlin.jvm.internal.m.b(e1Var3);
                    c1Var = new c1(this.G, e1Var3);
                    e1Var = this.H;
                    e1.a(e1Var, c1Var);
                    aVar = e1Var.f16912b;
                    this.F = c1Var;
                    this.A = aVar;
                    nVar = this.I;
                    this.B = nVar;
                    Object obj3 = this.J;
                    this.C = obj3;
                    this.D = e1Var;
                    this.E = 1;
                    if (aVar.l(this) != aVar3) {
                        obj2 = obj3;
                    }
                    return aVar3;
                }
                if (r4 != 1) {
                    if (r4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1Var2 = (e1) this.B;
                    aVar2 = this.A;
                    c1Var2 = (c1) this.F;
                    try {
                        ri.t1.O(obj);
                        e1Var2.f16911a.compareAndSet(c1Var2, null);
                        aVar2.i((Object) null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        e1Var2.f16911a.compareAndSet(c1Var2, null);
                        throw th2;
                    }
                }
                e1 e1Var4 = this.D;
                obj2 = this.C;
                u00.n nVar2 = (u00.n) this.B;
                j40.a aVar4 = this.A;
                c1 c1Var3 = (c1) this.F;
                ri.t1.O(obj);
                nVar = nVar2;
                aVar = aVar4;
                e1Var = e1Var4;
                c1Var = c1Var3;
                this.F = c1Var;
                this.A = aVar;
                this.B = e1Var;
                this.C = null;
                this.D = null;
                this.E = 2;
                Object objInvoke = nVar.invoke(obj2, this);
                if (objInvoke != aVar3) {
                    e1Var2 = e1Var;
                    obj = objInvoke;
                    c1Var2 = c1Var;
                    aVar2 = aVar;
                    e1Var2.f16911a.compareAndSet(c1Var2, null);
                    aVar2.i((Object) null);
                    return obj;
                }
                return aVar3;
            } catch (Throwable th4) {
                e1Var2 = e1Var;
                th2 = th4;
                c1Var2 = c1Var;
                e1Var2.f16911a.compareAndSet(c1Var2, null);
                throw th2;
            }
        } catch (Throwable th5) {
            r4.i((Object) null);
            throw th5;
        }
    }
}
