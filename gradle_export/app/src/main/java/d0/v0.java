package d0;

public final class v0 extends m00.h implements u00.n {
    public final int B;
    public Object C;
    public int D;
    public Object E;
    public final Object F;

    public v0(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.B = i10;
        this.F = obj;
    }

    public v0(u00.n nVar, k00.i iVar, k00.c cVar) {
        super(2, cVar);
        this.B = 0;
        this.E = iVar;
        this.F = (m00.h) nVar;
    }

    public v0(v2.l lVar, kotlin.jvm.internal.z zVar, k00.c cVar) {
        super(2, cVar);
        this.B = 2;
        this.E = lVar;
        this.F = zVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                v0 v0Var = new v0((u00.n) this.F, (k00.i) this.E, cVar);
                v0Var.C = obj;
                return v0Var;
            case 1:
                v0 v0Var2 = new v0((u00.a) this.F, cVar, 1);
                v0Var2.E = obj;
                return v0Var2;
            case 2:
                v0 v0Var3 = new v0((v2.l) this.E, (kotlin.jvm.internal.z) this.F, cVar);
                v0Var3.C = obj;
                return v0Var3;
            default:
                v0 v0Var4 = new v0((q0.r1) this.F, cVar, 3);
                v0Var4.C = obj;
                return v0Var4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: d0.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
