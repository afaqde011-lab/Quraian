package i40;

import a40.o0;
import eh.l;
import f40.q;
import u00.o;

public final class c {
    public final Object a;
    public final o b;
    public final o c;
    public final Object d;
    public final m00.i e;
    public final o f;
    public Object g;
    public int h = -1;
    public final e i;

    public c(e eVar, Object obj, o oVar, o oVar2, l lVar, m00.i iVar, o oVar3) {
        this.i = eVar;
        this.a = obj;
        this.b = oVar;
        this.c = oVar2;
        this.d = lVar;
        this.e = iVar;
        this.f = oVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof q) {
            ((q) obj).h(this.h, this.i.A);
            return;
        }
        o0 o0Var = obj instanceof o0 ? (o0) obj : null;
        if (o0Var != null) {
            o0Var.dispose();
        }
    }
}
