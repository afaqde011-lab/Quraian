package q0;

public final class r0 implements u00.k {
    public final int A;
    public final j1 B;

    public r0(j1 j1Var, int i10) {
        this.A = i10;
        this.B = j1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z2.a0 a0Var = (z2.a0) obj;
                e2 e2VarD = this.B.d();
                if (e2VarD != null) {
                    e2VarD.f12610c = a0Var;
                }
                return g00.b0.a;
            case 1:
                j1 j1Var = this.B;
                l1.i1 i1Var = j1Var.f12655t;
                r3.w wVar = (r3.w) obj;
                String str = wVar.f13099a.B;
                m3.h hVar = j1Var.f12647j;
                if (!kotlin.jvm.internal.m.a(str, hVar != null ? hVar.B : null)) {
                    j1Var.f12648k.setValue(z0.A);
                    if (((Boolean) i1Var.getValue()).booleanValue()) {
                        i1Var.setValue(Boolean.FALSE);
                    } else {
                        j1Var.f12654s.setValue(Boolean.FALSE);
                    }
                }
                long j9 = m3.q0.f10518b;
                j1Var.f(j9);
                j1Var.e(j9);
                j1Var.f12656u.invoke(wVar);
                l1.r1 r1Var = j1Var.f12639b;
                l1.s1 s1Var = r1Var.f9918a;
                if (s1Var != null) {
                    s1Var.a(r1Var, null);
                }
                return g00.b0.a;
            case 2:
                this.B.f12653r.b(((r3.i) obj).f13071a);
                return g00.b0.a;
            case 3:
                return Boolean.valueOf(this.B.f12653r.b(((r3.i) obj).f13071a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.B.f12652q.setValue(bool);
                return g00.b0.a;
        }
    }
}
