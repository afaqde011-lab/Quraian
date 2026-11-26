package gc;

import l1.i1;

public final class e extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final g B;

    public e(g gVar, int i10) {
        super(0);
        this.A = i10;
        this.B = gVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                g gVar = this.B;
                i1 i1Var = gVar.E;
                float f3 = 0.0f;
                if (((cc.a) gVar.I.getValue()) != null) {
                    if (((Number) gVar.F.getValue()).floatValue() < 0.0f) {
                        if (i1Var.getValue() != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (i1Var.getValue() != null) {
                            throw new ClassCastException();
                        }
                        f3 = 1.0f;
                    }
                }
                return Float.valueOf(f3);
            case 1:
                g gVar2 = this.B;
                i1 i1Var2 = gVar2.F;
                return Float.valueOf((((Boolean) gVar2.D.getValue()).booleanValue() && gVar2.f() % 2 == 0) ? -((Number) i1Var2.getValue()).floatValue() : ((Number) i1Var2.getValue()).floatValue());
            default:
                g gVar3 = this.B;
                return Boolean.valueOf(gVar3.f() == ((Number) gVar3.C.getValue()).intValue() && ((Number) gVar3.K.getValue()).floatValue() == gVar3.e());
        }
    }
}
