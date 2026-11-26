package e40;

import a40.z;
import g00.b0;

public final class k extends m00.i implements u00.n {
    public c40.l A;
    public byte[] B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final d40.i[] G;
    public final u00.a H;
    public final m00.i I;
    public final d40.j J;

    public k(d40.j jVar, k00.c cVar, u00.a aVar, u00.o oVar, d40.i[] iVarArr) {
        super(2, cVar);
        this.G = iVarArr;
        this.H = aVar;
        this.I = (m00.i) oVar;
        this.J = jVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        k kVar = new k(this.J, cVar, this.H, this.I, this.G);
        kVar.F = obj;
        return kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: e40.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
