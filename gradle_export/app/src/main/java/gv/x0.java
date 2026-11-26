package gv;

public final class x0 implements u00.k {
    public final int A = 0;
    public final boolean B;
    public final float C;
    public final float D;
    public final Object E;
    public final Object F;
    public final Object G;

    public x0(float f, boolean z, z00.a aVar, float f2, l1.z0 z0Var, l1.z0 z0Var2) {
        this.C = f;
        this.B = z;
        this.E = aVar;
        this.D = f2;
        this.F = z0Var;
        this.G = z0Var2;
    }

    public x0(z2.l1 l1Var, j1.r rVar, boolean z, float f, float f2, i2.t0 t0Var) {
        this.E = l1Var;
        this.F = rVar;
        this.B = z;
        this.C = f;
        this.D = f2;
        this.G = t0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z00.a aVar = (z00.a) this.E;
                l1.z0 z0Var = (l1.z0) this.F;
                l1.z0 z0Var2 = (l1.z0) this.G;
                float fI = p.I(Float.intBitsToFloat((int) (((h2.b) obj).a >> 32)), this.C, this.B, aVar, this.D);
                ((u00.k) z0Var.getValue()).invoke(Float.valueOf(fI));
                ((u00.k) z0Var2.getValue()).invoke(Float.valueOf(fI));
                break;
            default:
                z2.k1.s((z2.k1) obj, (z2.l1) this.E, 0, 0, new j1.d((j1.r) this.F, this.B, this.C, this.D, (i2.t0) this.G), 4);
                break;
        }
        return g00.b0.a;
    }
}
