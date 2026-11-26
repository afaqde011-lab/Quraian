package d0;

public final class n0 extends m00.i implements u00.n {
    public final int A = 1;
    public kotlin.jvm.internal.z B;
    public kotlin.jvm.internal.z C;
    public int D;
    public Object E;
    public final o0 F;

    public n0(o0 o0Var, k00.c cVar) {
        super(2, cVar);
        this.F = o0Var;
    }

    public n0(kotlin.jvm.internal.z zVar, o0 o0Var, k00.c cVar) {
        super(2, cVar);
        this.C = zVar;
        this.F = o0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                n0 n0Var = new n0(this.C, this.F, cVar);
                n0Var.E = obj;
                return n0Var;
            default:
                n0 n0Var2 = new n0(this.F, cVar);
                n0Var2.E = obj;
                return n0Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return create((u00.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: d0.n0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
