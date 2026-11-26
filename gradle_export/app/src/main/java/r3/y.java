package r3;

public final class y {
    public static final y A;
    public static final y B;
    public static final y C;
    public static final y D;
    public static final y[] E;

    static {
        y yVar = new y("StartInput", 0);
        A = yVar;
        y yVar2 = new y("StopInput", 1);
        B = yVar2;
        y yVar3 = new y("ShowKeyboard", 2);
        C = yVar3;
        y yVar4 = new y("HideKeyboard", 3);
        D = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        E = yVarArr;
        f50.c.v(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) E.clone();
    }
}
