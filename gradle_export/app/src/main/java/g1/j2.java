package g1;

public final class j2 implements u00.k {
    public final int A;
    public final b3 B;

    public j2(b3 b3Var, int i10) {
        this.A = i10;
        this.B = b3Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                b3 b3Var = this.B;
                h1.v vVar = b3Var.f5730c;
                int i10 = ((i3) obj).f5841a;
                Long lB = b3Var.b();
                if (lB != null) {
                    h1.w wVarA = vVar.a(vVar.a(lB.longValue()).f6538e);
                    if (b3Var.f5728a.e(wVarA.f6534a)) {
                        b3Var.f5732e.setValue(wVarA);
                    }
                }
                b3Var.f5734g.setValue(new i3(i10));
                break;
            case 1:
                Long l = (Long) obj;
                b3 b3Var2 = this.B;
                l1.i1 i1Var = b3Var2.f5733f;
                if (l != null) {
                    h1.s sVarD = b3Var2.f5730c.d(l.longValue());
                    i1Var.setValue(b3Var2.f5728a.e(sVarD.A) ? sVarD : null);
                } else {
                    i1Var.setValue(null);
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                b3 b3Var3 = this.B;
                h1.w wVarA2 = b3Var3.f5730c.a(jLongValue);
                if (b3Var3.f5728a.e(wVarA2.f6534a)) {
                    b3Var3.f5732e.setValue(wVarA2);
                }
                break;
        }
        return g00.b0.a;
    }
}
