package mu;

import g00.b0;
import l1.z0;

public final class e implements u00.a {
    public final int A;
    public final boolean B;
    public final int C;
    public final u00.k D;
    public final z0 E;
    public final z0 F;
    public final z0 G;

    public e(boolean z, int i, u00.k kVar, z0 z0Var, z0 z0Var2, z0 z0Var3, int i2) {
        this.A = i2;
        this.B = z;
        this.C = i;
        this.D = kVar;
        this.E = z0Var;
        this.F = z0Var2;
        this.G = z0Var3;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                d.f(this.B, this.C, this.D, this.E, this.F, this.G, -60);
                break;
            case 1:
                d.f(this.B, this.C, this.D, this.E, this.F, this.G, 60);
                break;
            case 2:
                d.f(this.B, this.C, this.D, this.E, this.F, this.G, -60);
                break;
            default:
                d.f(this.B, this.C, this.D, this.E, this.F, this.G, 60);
                break;
        }
        return b0.a;
    }
}
