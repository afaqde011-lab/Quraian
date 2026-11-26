package l0;

public final class i0 {

    public final y1.c f9748a;

    public final ct.k f9749b;

    public final u.i0 f9750c;

    public i0(y1.c cVar, ct.k kVar) {
        this.f9748a = cVar;
        this.f9749b = kVar;
        long[] jArr = u.q0.f14885a;
        this.f9750c = new u.i0();
    }

    public final u00.n a(int i10, Object obj, Object obj2) {
        u.i0 i0Var = this.f9750c;
        h0 h0Var = (h0) i0Var.g(obj);
        if (h0Var != null && h0Var.f9745c == i10 && kotlin.jvm.internal.m.a(h0Var.f9744b, obj2)) {
            v1.c cVar = h0Var.f9746d;
            if (cVar != null) {
                return cVar;
            }
            v1.c cVar2 = new v1.c(new g0(h0Var.f9747e, h0Var, 0), 818252804, true);
            h0Var.f9746d = cVar2;
            return cVar2;
        }
        h0 h0Var2 = new h0(this, i10, obj, obj2);
        i0Var.m(obj, h0Var2);
        v1.c cVar3 = h0Var2.f9746d;
        if (cVar3 != null) {
            return cVar3;
        }
        v1.c cVar4 = new v1.c(new g0(this, h0Var2, 0), 818252804, true);
        h0Var2.f9746d = cVar4;
        return cVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        h0 h0Var = (h0) this.f9750c.g(obj);
        if (h0Var != null) {
            return h0Var.f9744b;
        }
        j0 j0Var = (j0) this.f9749b.invoke();
        int iE = j0Var.e(obj);
        if (iE != -1) {
            return j0Var.c(iE);
        }
        return null;
    }
}
