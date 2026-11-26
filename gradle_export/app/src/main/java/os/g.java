package os;

import g00.b0;

public final class g extends m00.i implements u00.k {
    public ss.v A;
    public int B;
    public final x C;
    public final int D;

    public g(int i, k00.c cVar, x xVar) {
        super(1, cVar);
        this.C = xVar;
        this.D = i;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new g(this.D, cVar, this.C);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((g) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        throw new UnsupportedOperationException("Method not decompiled: os.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
