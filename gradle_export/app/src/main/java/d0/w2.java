package d0;

public final class w2 extends m00.h implements u00.n {
    public final int B = 1;
    public int C;
    public Object D;
    public long E;
    public final Object F;

    public w2(long j9, kotlin.jvm.internal.y yVar, k00.c cVar) {
        super(2, cVar);
        this.E = j9;
        this.F = yVar;
    }

    public w2(v2.s sVar, k00.c cVar) {
        super(2, cVar);
        this.F = sVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                w2 w2Var = new w2((v2.s) this.F, cVar);
                w2Var.D = obj;
                return w2Var;
            default:
                w2 w2Var2 = new w2(this.E, (kotlin.jvm.internal.y) this.F, cVar);
                w2Var2.D = obj;
                return w2Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        v2.i0 i0Var = (v2.i0) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.B) {
            case 0:
                break;
        }
        return create(i0Var, cVar).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: d0.w2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
