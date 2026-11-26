package tm;

import a40.z;
import ab.a0;
import g00.b0;
import h00.n;
import lu.w;
import ri.t1;
import ta.c0;
import u00.k;

public final class b extends m00.i implements k {
    public final e A;
    public final float B;
    public final z C;

    public b(e eVar, float f, z zVar, k00.c cVar) {
        super(1, cVar);
        this.A = eVar;
        this.B = f;
        this.C = zVar;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new b(this.A, this.B, this.C, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        b bVar = (b) create((k00.c) obj);
        b0 b0Var = b0.a;
        bVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        e eVar = this.A;
        e5.g gVar = (e5.g) eVar.s.B;
        w2.c cVar = (w2.c) gVar.c;
        w2.a[] aVarArr = cVar.d;
        n.y0(0, aVarArr.length, null, aVarArr);
        cVar.e = 0;
        w2.c cVar2 = (w2.c) gVar.a;
        w2.a[] aVarArr2 = cVar2.d;
        n.y0(0, aVarArr2.length, null, aVarArr2);
        cVar2.e = 0;
        gVar.b = 0L;
        c0.M(eVar.a, (k00.i) null, (u00.n) null, (k) null, new w(eVar, null, 15), 31);
        c0.M(this.C, (k00.i) null, (u00.n) null, (k) null, new a(eVar, ((Number) a0.E(new Float(this.B), eVar.b)).floatValue(), null, 0), 31);
        if (((Number) eVar.n.d()).floatValue() != 0.0f) {
            c0.M(this.C, (k00.i) null, (u00.n) null, (k) null, new sm.k(eVar, null, 1), 31);
        }
        eVar.f();
        return b0.a;
    }
}
