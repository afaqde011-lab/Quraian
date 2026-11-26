package oo;

public final class h1 {
    public static final h1 E;
    public static final h1 F;
    public static final h1[] G;
    public final float A;
    public final float B;
    public final float C;
    public final float D;

    static {
        float f = 20;
        float f2 = 16;
        h1 h1Var = new h1("Portrait", 0, f, f2, 24, f2);
        E = h1Var;
        float f3 = 12;
        h1 h1Var2 = new h1("Landscape", 1, f3, 8, f3, f);
        F = h1Var2;
        h1[] h1VarArr = {h1Var, h1Var2};
        G = h1VarArr;
        f50.c.v(h1VarArr);
    }

    public h1(String str, int i, float f, float f2, float f3, float f4) {
        super(str, i);
        this.A = f;
        this.B = f2;
        this.C = f3;
        this.D = f4;
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) G.clone();
    }
}
