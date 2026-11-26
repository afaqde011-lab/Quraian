package os;

import a40.z;
import g00.b0;

public final class t extends m00.i implements u00.n {
    public x A;
    public j40.a B;
    public j40.c C;
    public int D;
    public int E;
    public int F;
    public Object G;
    public final x H;

    public t(x xVar, k00.c cVar) {
        super(2, cVar);
        this.H = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        t tVar = new t(this.H, cVar);
        tVar.G = obj;
        return tVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: os.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
