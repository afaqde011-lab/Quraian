package nn;

import g00.b0;
import java.util.List;

public final class h extends m00.i implements u00.k {
    public boolean A;
    public List B;
    public int C;
    public final j D;
    public final int E;

    public h(j jVar, int i, k00.c cVar) {
        super(1, cVar);
        this.D = jVar;
        this.E = i;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new h(this.D, this.E, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        return ((h) create((k00.c) obj)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        throw new UnsupportedOperationException("Method not decompiled: nn.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
