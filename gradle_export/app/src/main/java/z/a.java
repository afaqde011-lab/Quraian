package z;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

public final class a implements u00.a {
    public final int A;
    public final h B;

    public a(h hVar, int i10) {
        this.A = i10;
        this.B = hVar;
    }

    public final Object invoke() throws NoWhenBranchMatchedException, KotlinNothingValueException {
        b3.k kVar;
        switch (this.A) {
            case 0:
                l1.t tVar = s0.f16964a;
                h hVar = this.B;
                v0 v0Var = (v0) b3.m.h(hVar, tVar);
                if (v0Var == null) {
                    g0.a.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + v0Var);
                }
                v0 v0Var2 = hVar.Y;
                hVar.Y = v0Var;
                if (v0Var2 != null && !kotlin.jvm.internal.m.a(v0Var, v0Var2) && ((kVar = hVar.f16917a0) != null || !hVar.f16924h0)) {
                    if (kVar != null) {
                        hVar.C1(kVar);
                    }
                    hVar.f16917a0 = null;
                    hVar.L1();
                }
                return g00.b0.a;
            default:
                this.B.W.invoke();
                return Boolean.TRUE;
        }
    }
}
