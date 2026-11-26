package jp;

public final class a0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e0 C;

    public a0(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a0(this.C, cVar, 0);
            case 1:
                a0 a0Var = new a0(this.C, cVar, 1);
                a0Var.B = ((Number) obj).intValue();
                return a0Var;
            case 2:
                return new a0(this.C, cVar, 2);
            case 3:
                return new a0(this.C, cVar, 3);
            case 4:
                return new a0(this.C, cVar, 4);
            case 5:
                return new a0(this.C, cVar, 5);
            default:
                return new a0(this.C, cVar, 6);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                a0 a0Var = (a0) create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                a0Var.invokeSuspend(b0Var);
                return b0Var;
            case 2:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((a0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        throw new UnsupportedOperationException("Method not decompiled: jp.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
