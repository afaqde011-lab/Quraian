package zk;

import g00.b0;
import m00.h;
import u00.n;
import v2.i0;
import v2.s;

public final class e extends h implements n {
    public s B;
    public int C;
    public Object D;
    public final float E;
    public final u00.a F;

    public e(float f, u00.a aVar, k00.c cVar) {
        super(2, cVar);
        this.E = f;
        this.F = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        e eVar = new e(this.E, this.F, cVar);
        eVar.D = obj;
        return eVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((i0) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: zk.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
