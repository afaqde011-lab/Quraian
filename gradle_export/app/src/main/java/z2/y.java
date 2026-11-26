package z2;

public final class y {
    public static final y A;
    public static final y B;
    public static final y[] C;

    static {
        y yVar = new y("Width", 0);
        A = yVar;
        y yVar2 = new y("Height", 1);
        B = yVar2;
        y[] yVarArr = {yVar, yVar2};
        C = yVarArr;
        f50.c.v(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) C.clone();
    }
}
