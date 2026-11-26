package f30;

import e30.a0;
import e30.a1;
import e30.j0;
import e30.l0;
import e30.u0;
import e30.w;

public final class a extends j0 {
    public final b a;
    public final u0 b;

    public a(b bVar, u0 u0Var) {
        this.a = bVar;
        this.b = u0Var;
    }

    @Override
    public final h30.h F(l0 state, h30.g type) {
        kotlin.jvm.internal.m.e(state, "state");
        kotlin.jvm.internal.m.e(type, "type");
        b bVar = this.a;
        a0 a0VarG0 = bVar.G0(this.b.g((w) bVar.y0(type), a1.C));
        kotlin.jvm.internal.m.b(a0VarG0);
        return a0VarG0;
    }
}
