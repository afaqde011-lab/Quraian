package androidx.datastore.preferences.protobuf;

public final class y {
    public static final y A;
    public static final y B;
    public static final y C;
    public static final y D;
    public static final y E;
    public static final y F;
    public static final y G;
    public static final y H;
    public static final y I;
    public static final y J;
    public static final y[] K;

    static {
        y yVar = new y("VOID", 0);
        A = yVar;
        y yVar2 = new y("INT", 1);
        B = yVar2;
        y yVar3 = new y("LONG", 2);
        C = yVar3;
        y yVar4 = new y("FLOAT", 3);
        D = yVar4;
        y yVar5 = new y("DOUBLE", 4);
        E = yVar5;
        y yVar6 = new y("BOOLEAN", 5);
        F = yVar6;
        y yVar7 = new y("STRING", 6);
        G = yVar7;
        g gVar = g.C;
        y yVar8 = new y("BYTE_STRING", 7);
        H = yVar8;
        y yVar9 = new y("ENUM", 8);
        I = yVar9;
        y yVar10 = new y("MESSAGE", 9);
        J = yVar10;
        K = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, yVar8, yVar9, yVar10};
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) K.clone();
    }
}
