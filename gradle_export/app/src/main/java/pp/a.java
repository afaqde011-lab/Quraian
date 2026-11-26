package pp;

import g00.b0;
import l1.z0;

public final class a implements u00.a {
    public final int A;
    public final boolean B;
    public final z0 C;

    public a(boolean z, z0 z0Var, int i) {
        this.A = i;
        this.B = z;
        this.C = z0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                if (this.B) {
                    this.C.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (this.B) {
                    this.C.setValue(Boolean.TRUE);
                }
                break;
        }
        return b0.a;
    }
}
