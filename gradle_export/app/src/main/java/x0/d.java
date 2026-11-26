package x0;

import g00.b0;
import kotlin.KotlinNothingValueException;
import l1.z0;
import z2.a0;

public final class d implements u00.a {
    public final int A;
    public final z0 B;

    public d(z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public final Object invoke() throws KotlinNothingValueException {
        int i10 = this.A;
        z0 z0Var = this.B;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) z0Var.getValue();
                if (a0Var != null) {
                    return a0Var;
                }
                g0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                z0Var.setValue(Boolean.FALSE);
                break;
            default:
                z0Var.setValue(Boolean.FALSE);
                break;
        }
        return b0.a;
    }
}
