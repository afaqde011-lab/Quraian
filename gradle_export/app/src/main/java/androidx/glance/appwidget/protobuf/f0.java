package androidx.glance.appwidget.protobuf;

public final class f0 {
    public static final f0 A;
    public static final f0 B;
    public static final f0 C;
    public static final f0 D;
    public static final f0 E;
    public static final f0 F;
    public static final f0 G;
    public static final f0 H;
    public static final f0 I;
    public static final f0 J;
    public static final f0[] K;

    static {
        f0 f0Var = new f0("VOID", 0);
        A = f0Var;
        f0 f0Var2 = new f0("INT", 1);
        B = f0Var2;
        f0 f0Var3 = new f0("LONG", 2);
        C = f0Var3;
        f0 f0Var4 = new f0("FLOAT", 3);
        D = f0Var4;
        f0 f0Var5 = new f0("DOUBLE", 4);
        E = f0Var5;
        f0 f0Var6 = new f0("BOOLEAN", 5);
        F = f0Var6;
        f0 f0Var7 = new f0("STRING", 6);
        G = f0Var7;
        h hVar = i.B;
        f0 f0Var8 = new f0("BYTE_STRING", 7);
        H = f0Var8;
        f0 f0Var9 = new f0("ENUM", 8);
        I = f0Var9;
        f0 f0Var10 = new f0("MESSAGE", 9);
        J = f0Var10;
        K = new f0[]{f0Var, f0Var2, f0Var3, f0Var4, f0Var5, f0Var6, f0Var7, f0Var8, f0Var9, f0Var10};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) K.clone();
    }
}
