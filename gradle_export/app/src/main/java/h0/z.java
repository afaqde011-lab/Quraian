package h0;

public final class z {
    public static final z A;
    public static final z B;
    public static final z C;
    public static final z[] D;

    static {
        z zVar = new z("Vertical", 0);
        A = zVar;
        z zVar2 = new z("Horizontal", 1);
        B = zVar2;
        z zVar3 = new z("Both", 2);
        C = zVar3;
        z[] zVarArr = {zVar, zVar2, zVar3};
        D = zVarArr;
        f50.c.v(zVarArr);
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) D.clone();
    }
}
