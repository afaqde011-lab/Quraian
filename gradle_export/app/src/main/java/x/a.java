package x;

import java.util.concurrent.CancellationException;

public final class a extends m00.i implements u00.k {
    public j A;
    public kotlin.jvm.internal.v B;
    public int C;
    public final b D;
    public final Object E;
    public final h1 F;
    public final long G;
    public final u00.k H;

    public a(b bVar, Object obj, h1 h1Var, long j9, u00.k kVar, k00.c cVar) {
        super(1, cVar);
        this.D = bVar;
        this.E = obj;
        this.F = h1Var;
        this.G = j9;
        this.H = kVar;
    }

    public final k00.c create(k00.c cVar) {
        return new a(this.D, this.E, this.F, this.G, this.H, cVar);
    }

    public final Object invoke(Object obj) {
        return create((k00.c) obj).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        j jVar;
        kotlin.jvm.internal.v vVar;
        h1 h1Var = this.F;
        l00.a aVar = l00.a.A;
        int i10 = this.C;
        b bVar = this.D;
        try {
            if (i10 == 0) {
                ri.t1.O(obj);
                bVar.f16234c.C = (o) bVar.f16232a.f16363a.invoke(this.E);
                bVar.f16236e.setValue(h1Var.f16295c);
                bVar.f16235d.setValue(Boolean.TRUE);
                j jVar2 = bVar.f16234c;
                j jVar3 = new j(jVar2.A, jVar2.B.getValue(), c.k(jVar2.C), jVar2.D, Long.MIN_VALUE, jVar2.F);
                kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                long j9 = this.G;
                az.k kVar = new az.k(bVar, jVar3, this.H, vVar2);
                this.A = jVar3;
                this.B = vVar2;
                this.C = 1;
                if (c.e(jVar3, h1Var, j9, kVar, this) == aVar) {
                    return aVar;
                }
                jVar = jVar3;
                vVar = vVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = this.B;
                jVar = this.A;
                ri.t1.O(obj);
            }
            f fVar = vVar.A ? f.A : f.B;
            b.b(bVar);
            return new g(jVar, fVar);
        } catch (CancellationException e3) {
            b.b(bVar);
            throw e3;
        }
    }
}
