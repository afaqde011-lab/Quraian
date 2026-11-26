package com.google.crypto.tink.shaded.protobuf;

public final class c0 {
    public static final c0 A;
    public static final c0 B;
    public static final c0 C;
    public static final c0 D;
    public static final c0 E;
    public static final c0 F;
    public static final c0 G;
    public static final c0 H;
    public static final c0 I;
    public static final c0 J;
    public static final c0[] K;

    static {
        c0 c0Var = new c0("VOID", 0);
        A = c0Var;
        c0 c0Var2 = new c0("INT", 1);
        B = c0Var2;
        c0 c0Var3 = new c0("LONG", 2);
        C = c0Var3;
        c0 c0Var4 = new c0("FLOAT", 3);
        D = c0Var4;
        c0 c0Var5 = new c0("DOUBLE", 4);
        E = c0Var5;
        c0 c0Var6 = new c0("BOOLEAN", 5);
        F = c0Var6;
        c0 c0Var7 = new c0("STRING", 6);
        G = c0Var7;
        h hVar = i.B;
        c0 c0Var8 = new c0("BYTE_STRING", 7);
        H = c0Var8;
        c0 c0Var9 = new c0("ENUM", 8);
        I = c0Var9;
        c0 c0Var10 = new c0("MESSAGE", 9);
        J = c0Var10;
        K = new c0[]{c0Var, c0Var2, c0Var3, c0Var4, c0Var5, c0Var6, c0Var7, c0Var8, c0Var9, c0Var10};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) K.clone();
    }
}
