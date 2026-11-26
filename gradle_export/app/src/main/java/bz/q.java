package bz;

import a40.z;
import ca.t;
import g00.b0;
import uu.w;

public final class q extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final boolean C;
    public final boolean D;
    public Object E;
    public Object F;
    public final Object G;

    public q(s sVar, String str, String str2, boolean z, boolean z2, k00.c cVar) {
        super(2, cVar);
        this.E = sVar;
        this.F = str;
        this.G = str2;
        this.C = z;
        this.D = z2;
    }

    public q(k00.i iVar, t tVar, boolean z, boolean z2, u00.k kVar, k00.c cVar) {
        super(2, cVar);
        this.E = iVar;
        this.F = tVar;
        this.C = z;
        this.D = z2;
        this.G = kVar;
    }

    public q(boolean z, w wVar, boolean z2, k00.c cVar) {
        super(2, cVar);
        this.C = z;
        this.G = wVar;
        this.D = z2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new q((s) this.E, (String) this.F, (String) this.G, this.C, this.D, cVar);
            case 1:
                return new q((k00.i) this.E, (t) this.F, this.C, this.D, (u00.k) this.G, cVar);
            default:
                q qVar = new q(this.C, (w) this.G, this.D, cVar);
                qVar.F = obj;
                return qVar;
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
        }
        return ((q) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: bz.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
