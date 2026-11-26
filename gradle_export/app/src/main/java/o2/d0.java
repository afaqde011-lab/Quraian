package o2;

public final class d0 extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final e0 B;

    public d0(e0 e0Var, int i10) {
        super(1);
        this.A = i10;
        this.B = e0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                e0 e0Var = this.B;
                e0Var.f11562d = true;
                e0Var.f11564f.invoke();
                return g00.b0.a;
            default:
                k2.d dVar = (k2.d) obj;
                e0 e0Var2 = this.B;
                c cVar = e0Var2.f11560b;
                float f3 = e0Var2.f11569k;
                float f10 = e0Var2.l;
                a1.i iVarG0 = dVar.G0();
                long jQ = iVarG0.q();
                iVarG0.n().i();
                try {
                    ((hf.c) iVarG0.B).H(f3, f10, 0L);
                    cVar.a(dVar);
                    return g00.b0.a;
                } finally {
                    w.c.t(iVarG0, jQ);
                }
        }
    }
}
