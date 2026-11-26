package q0;

import kotlin.KotlinNothingValueException;

public final class b1 implements u00.a {
    public final int A;
    public final c1 B;

    public b1(c1 c1Var, int i10) {
        this.A = i10;
        this.B = c1Var;
    }

    public final Object invoke() throws KotlinNothingValueException {
        int i10 = this.A;
        c1 c1Var = this.B;
        switch (i10) {
            case 0:
                q3.h0 h0Var = c1Var.V;
                if (h0Var == null) {
                    throw g4.c.o("Font resolution state is not set.");
                }
                h0Var.getValue();
                break;
                break;
            default:
                q3.h0 h0Var2 = c1Var.V;
                if (h0Var2 == null) {
                    throw g4.c.o("Font resolution state is not set.");
                }
                h0Var2.getValue();
                break;
                break;
        }
        return g00.b0.a;
    }
}
