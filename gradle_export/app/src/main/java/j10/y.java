package j10;

public final class y {
    public static final o0 A;
    public static final y B;
    public static final y C;
    public static final y D;
    public static final y E;
    public static final y[] F;

    static {
        y yVar = new y("FINAL", 0);
        B = yVar;
        y yVar2 = new y("SEALED", 1);
        C = yVar2;
        y yVar3 = new y("OPEN", 2);
        D = yVar3;
        y yVar4 = new y("ABSTRACT", 3);
        E = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        F = yVarArr;
        f50.c.v(yVarArr);
        A = new o0(5);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) F.clone();
    }
}
