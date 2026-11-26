package o20;

public class l0 {
    public static final l0 C;
    public static final l0 D;
    public static final i0 E;
    public static final j0 F;
    public static final l0 G;
    public static final l0[] H;
    public final m0 A;
    public final int B;

    l0 EF0;

    l0 EF1;

    l0 EF2;

    static {
        l0 l0Var = new l0("DOUBLE", 0, m0.DOUBLE, 1);
        l0 l0Var2 = new l0("FLOAT", 1, m0.FLOAT, 5);
        m0 m0Var = m0.LONG;
        l0 l0Var3 = new l0("INT64", 2, m0Var, 0);
        l0 l0Var4 = new l0("UINT64", 3, m0Var, 0);
        m0 m0Var2 = m0.INT;
        l0 l0Var5 = new l0("INT32", 4, m0Var2, 0);
        C = l0Var5;
        l0 l0Var6 = new l0("FIXED64", 5, m0Var, 1);
        l0 l0Var7 = new l0("FIXED32", 6, m0Var2, 5);
        l0 l0Var8 = new l0("BOOL", 7, m0.BOOLEAN, 0);
        D = l0Var8;
        h0 h0Var = new h0("STRING", 8, m0.STRING, 2);
        m0 m0Var3 = m0.MESSAGE;
        i0 i0Var = new i0("GROUP", 9, m0Var3, 3);
        E = i0Var;
        j0 j0Var = new j0("MESSAGE", 10, m0Var3, 2);
        F = j0Var;
        k0 k0Var = new k0("BYTES", 11, m0.BYTE_STRING, 2);
        l0 l0Var9 = new l0("UINT32", 12, m0Var2, 0);
        l0 l0Var10 = new l0("ENUM", 13, m0.ENUM, 0);
        G = l0Var10;
        H = new l0[]{l0Var, l0Var2, l0Var3, l0Var4, l0Var5, l0Var6, l0Var7, l0Var8, h0Var, i0Var, j0Var, k0Var, l0Var9, l0Var10, new l0("SFIXED32", 14, m0Var2, 5), new l0("SFIXED64", 15, m0Var, 1), new l0("SINT32", 16, m0Var2, 0), new l0("SINT64", 17, m0Var, 0)};
    }

    public l0(String str, int i, m0 m0Var, int i2) {
        super(str, i);
        this.A = m0Var;
        this.B = i2;
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) H.clone();
    }

    public boolean a() {
        return !(this instanceof h0);
    }
}
