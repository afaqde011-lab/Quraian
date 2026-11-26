package du;

public final class o0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final t0 C;

    public o0(t0 t0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new o0(this.C, cVar, 0);
            case 1:
                return new o0(this.C, cVar, 1);
            case 2:
                return new o0(this.C, cVar, 2);
            case 3:
                return new o0(this.C, cVar, 3);
            case 4:
                return new o0(this.C, cVar, 4);
            case 5:
                return new o0(this.C, cVar, 5);
            case 6:
                return new o0(this.C, cVar, 6);
            case 7:
                return new o0(this.C, cVar, 7);
            case 8:
                return new o0(this.C, cVar, 8);
            case 9:
                return new o0(this.C, cVar, 9);
            case 10:
                return new o0(this.C, cVar, 10);
            default:
                return new o0(this.C, cVar, 11);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 1:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 2:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 3:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 4:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 5:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 6:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 7:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 8:
                ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 9:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 10:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            default:
                return ((o0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        throw new UnsupportedOperationException("Method not decompiled: du.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
