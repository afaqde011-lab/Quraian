package nn;

import g00.b0;

public final class i extends m00.i implements u00.k {
    public int A;
    public final j B;
    public final Integer C;
    public final int D;
    public final int E;
    public final Long F;

    public i(j jVar, Integer num, int i, int i2, Long l, k00.c cVar) {
        super(1, cVar);
        this.B = jVar;
        this.C = num;
        this.D = i;
        this.E = i2;
        this.F = l;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new i(this.B, this.C, this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((i) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: nn.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
