package eq;

import g00.b0;
import l1.z0;
import z2.a0;

public final class h implements u00.k {
    public final int A;
    public final z0 B;
    public final z0 C;

    public h(z0 z0Var, z0 z0Var2, int i) {
        this.A = i;
        this.B = z0Var;
        this.C = z0Var2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                a0 iconCoordinates = (a0) obj;
                kotlin.jvm.internal.m.e(iconCoordinates, "iconCoordinates");
                a0 a0Var = (a0) this.B.getValue();
                if (a0Var != null) {
                    this.C.setValue(new h2.b(a0Var.V(iconCoordinates, (((long) Float.floatToRawIntBits(((int) (iconCoordinates.p() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((int) (iconCoordinates.p() & 4294967295L)) / 2.0f)) & 4294967295L))));
                }
                return b0.a;
            case 1:
                this.B.setValue(new h2.b(((h2.b) obj).a));
                this.C.setValue(Boolean.TRUE);
                break;
            default:
                this.B.setValue(new h2.b(((h2.b) obj).a));
                this.C.setValue(Boolean.TRUE);
                break;
        }
        return b0.a;
    }
}
