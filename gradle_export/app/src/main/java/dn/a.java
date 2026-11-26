package dn;

public final class a {
    public static final hb.f E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a[] I;
    public final float A;
    public final float B;
    public final float C;
    public final float D;

    static {
        a aVar = new a("SMALL", 0, 152, 230, 55, -72);
        F = aVar;
        float f = 232;
        a aVar2 = new a("MEDIUM", 1, 162, f, 37, -80);
        G = aVar2;
        a aVar3 = new a("LARGE", 2, f, 244, 63, -63);
        H = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        I = aVarArr;
        f50.c.v(aVarArr);
        E = new hb.f();
    }

    public a(String str, int i, float f, float f2, float f3, float f4) {
        super(str, i);
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.D = f4;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) I.clone();
    }
}
