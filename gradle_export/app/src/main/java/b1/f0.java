package b1;

import d0.n3;
import d0.t1;

public final class f0 extends m00.i implements u00.n {
    public final int A = 1;
    public int B;
    public Object C;
    public final long D;
    public final Object E;
    public final Object F;
    public final Object G;

    public f0(d0.i iVar, n3 n3Var, d0.c cVar, long j9, k00.c cVar2) {
        super(2, cVar2);
        this.E = iVar;
        this.F = n3Var;
        this.G = cVar;
        this.D = j9;
    }

    public f0(t1 t1Var, e0 e0Var, long j9, f0.i iVar, k00.c cVar) {
        super(2, cVar);
        this.E = t1Var;
        this.F = e0Var;
        this.D = j9;
        this.G = iVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                f0 f0Var = new f0((t1) this.E, (e0) this.F, this.D, (f0.i) this.G, cVar);
                f0Var.C = obj;
                return f0Var;
            default:
                f0 f0Var2 = new f0((d0.i) this.E, (n3) this.F, (d0.c) this.G, this.D, cVar);
                f0Var2.C = obj;
                return f0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: b1.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
