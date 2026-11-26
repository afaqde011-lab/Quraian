package androidx.datastore.preferences.protobuf;

public final class q1 {
    public static final q1 A;
    public static final q1 B;
    public static final q1 C;
    public static final q1 D;
    public static final q1 E;
    public static final q1 F;
    public static final q1 G;
    public static final q1 H;
    public static final q1 I;
    public static final q1[] J;

    static {
        q1 q1Var = new q1("INT", 0);
        A = q1Var;
        q1 q1Var2 = new q1("LONG", 1);
        B = q1Var2;
        q1 q1Var3 = new q1("FLOAT", 2);
        C = q1Var3;
        q1 q1Var4 = new q1("DOUBLE", 3);
        D = q1Var4;
        q1 q1Var5 = new q1("BOOLEAN", 4);
        E = q1Var5;
        q1 q1Var6 = new q1("STRING", 5);
        F = q1Var6;
        g gVar = g.C;
        q1 q1Var7 = new q1("BYTE_STRING", 6);
        G = q1Var7;
        q1 q1Var8 = new q1("ENUM", 7);
        H = q1Var8;
        q1 q1Var9 = new q1("MESSAGE", 8);
        I = q1Var9;
        J = new q1[]{q1Var, q1Var2, q1Var3, q1Var4, q1Var5, q1Var6, q1Var7, q1Var8, q1Var9};
    }

    public static q1 valueOf(String str) {
        return (q1) Enum.valueOf(q1.class, str);
    }

    public static q1[] values() {
        return (q1[]) J.clone();
    }
}
