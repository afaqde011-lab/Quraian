package rb;

import a40.z;
import g00.b0;
import java.util.List;
import u00.n;
import wb.l;

public final class f extends m00.i implements n {
    public List A;
    public l B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final g G;
    public final a H;
    public final l I;
    public final List J;
    public final lb.c K;
    public final wb.i L;

    public f(g gVar, a aVar, l lVar, List list, lb.c cVar, wb.i iVar, k00.c cVar2) {
        super(2, cVar2);
        this.G = gVar;
        this.H = aVar;
        this.I = lVar;
        this.J = list;
        this.K = cVar;
        this.L = iVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        f fVar = new f(this.G, this.H, this.I, this.J, this.K, this.L, cVar);
        fVar.F = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((z) obj, (k00.c) obj2).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: rb.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
