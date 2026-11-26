package e1;

public final class p0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final v0 C;

    public p0(v0 v0Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = v0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                p0 p0Var = new p0(this.C, cVar, 0);
                long j9 = ((h2.b) obj).f6544a;
                return p0Var;
            case 1:
                return new p0(this.C, cVar, 1);
            default:
                return new p0(this.C, cVar, 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                long j9 = ((h2.b) obj).f6544a;
                return new p0(this.C, (k00.c) obj2, 0).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r46) {
        throw new UnsupportedOperationException("Method not decompiled: e1.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
