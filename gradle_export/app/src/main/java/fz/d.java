package fz;

import g00.b0;
import l1.z0;

public final class d implements u00.a {
    public final int A;
    public final u00.a B;
    public final z0 C;

    public d(u00.a aVar, z0 z0Var, int i) {
        this.A = i;
        this.B = aVar;
        this.C = z0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                if (((Boolean) this.C.getValue()).booleanValue()) {
                    this.B.invoke();
                }
                return b0.a;
            case 1:
                this.C.setValue(Boolean.FALSE);
                this.B.invoke();
                break;
            case 2:
                this.C.setValue(Boolean.FALSE);
                this.B.invoke();
                break;
            default:
                this.C.setValue(Boolean.FALSE);
                this.B.invoke();
                break;
        }
        return b0.a;
    }
}
