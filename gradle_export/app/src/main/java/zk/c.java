package zk;

import g00.b0;
import m00.h;
import u00.n;
import v2.i0;
import v2.s;

public final class c extends h implements n {
    public int B;
    public Object C;
    public final s D;
    public final float E;

    public c(s sVar, float f, k00.c cVar) {
        super(2, cVar);
        this.D = sVar;
        this.E = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        c cVar2 = new c(this.D, this.E, cVar);
        cVar2.C = obj;
        return cVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((i0) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: zk.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
