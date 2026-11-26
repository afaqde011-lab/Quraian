package p30;

import a10.x;
import e30.j0;
import e30.l0;

public final class p extends j0 {
    public final l a;

    public p(l lVar) {
        this.a = lVar;
    }

    @Override
    public final h30.h F(l0 state, h30.g type) {
        kotlin.jvm.internal.m.e(state, "state");
        kotlin.jvm.internal.m.e(type, "type");
        x xVar = this.a.a((x) q.A.y0(type)).b;
        kotlin.jvm.internal.m.c(xVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.types.AbstractKType");
        return (a) xVar;
    }
}
