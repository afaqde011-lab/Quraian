package sg;

public final class p extends t {

    public final r f14193a;

    public final float f14194b;

    public final float f14195c;

    public p(r rVar, float f3, float f10) {
        this.f14193a = rVar;
        this.f14194b = f3;
        this.f14195c = f10;
    }

    public final float a() {
        r rVar = this.f14193a;
        return (float) Math.toDegrees(Math.atan((rVar.f14204c - this.f14195c) / (rVar.f14203b - this.f14194b)));
    }
}
