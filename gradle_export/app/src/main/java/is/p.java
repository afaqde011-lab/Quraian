package is;

public final class p extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final y C;

    public p(y yVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = yVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new p(this.C, cVar, 0);
            default:
                return new p(this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((p) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        throw new UnsupportedOperationException("Method not decompiled: is.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
