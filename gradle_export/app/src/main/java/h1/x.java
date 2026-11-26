package h1;

import android.view.autofill.AutofillValue;
import b3.o2;
import kotlin.NoWhenBranchMatchedException;

public final class x implements u00.k {
    public final int A;
    public final j3.a0 B;

    public x(j3.a0 a0Var, int i10) {
        this.A = i10;
        this.B = a0Var;
    }

    public final Object invoke(Object obj) throws NoWhenBranchMatchedException {
        boolean z10;
        switch (this.A) {
            case 0:
                o2 o2Var = (o2) obj;
                kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                q0 q0Var = (q0) o2Var;
                q0Var.P = true;
                q0Var.O.invoke(this.B);
                b3.m.o(q0Var);
                return Boolean.FALSE;
            default:
                AutofillValue autofillValue = ((c2.f) obj).f2612a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    j3.y.n(this.B, boolValueOf.booleanValue() ? l3.a.A : l3.a.B);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
        }
    }
}
