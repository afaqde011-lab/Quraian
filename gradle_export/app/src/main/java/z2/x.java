package z2;

public final class x {
    public static final x A;
    public static final x B;
    public static final x[] C;

    static {
        x xVar = new x("Min", 0);
        A = xVar;
        x xVar2 = new x("Max", 1);
        B = xVar2;
        x[] xVarArr = {xVar, xVar2};
        C = xVarArr;
        f50.c.v(xVarArr);
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) C.clone();
    }
}
