package gc;

import a40.z;
import d0.y1;
import g00.b0;
import l1.z0;
import m0.w;

public final class a extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final int C;
    public final float D;
    public Object E;
    public final Object F;
    public final Object G;

    public a(g gVar, cc.a aVar, float f3, int i10, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.E = gVar;
        this.F = aVar;
        this.D = f3;
        this.C = i10;
        this.G = z0Var;
    }

    public a(w wVar, int i10, float f3, x.i iVar, k00.c cVar) {
        super(2, cVar);
        this.F = wVar;
        this.C = i10;
        this.D = f3;
        this.G = iVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a((g) this.E, (cc.a) this.F, this.D, this.C, (z0) this.G, cVar);
            default:
                a aVar = new a((w) this.F, this.C, this.D, (x.i) this.G, cVar);
                aVar.E = obj;
                return aVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((z) obj, (k00.c) obj2).invokeSuspend(b0.a);
            default:
                return create((y1) obj, (k00.c) obj2).invokeSuspend(b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: gc.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
