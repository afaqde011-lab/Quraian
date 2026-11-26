package androidx.datastore.preferences.protobuf;

public class p1 {
    public static final l1 C;
    public static final m1 D;
    public static final n1 E;
    public static final p1[] F;
    public final q1 A;
    public final int B;

    p1 EF0;

    p1 EF1;

    p1 EF2;

    static {
        p1 p1Var = new p1("DOUBLE", 0, q1.D, 1);
        p1 p1Var2 = new p1("FLOAT", 1, q1.C, 5);
        q1 q1Var = q1.B;
        p1 p1Var3 = new p1("INT64", 2, q1Var, 0);
        p1 p1Var4 = new p1("UINT64", 3, q1Var, 0);
        q1 q1Var2 = q1.A;
        p1 p1Var5 = new p1("INT32", 4, q1Var2, 0);
        p1 p1Var6 = new p1("FIXED64", 5, q1Var, 1);
        p1 p1Var7 = new p1("FIXED32", 6, q1Var2, 5);
        p1 p1Var8 = new p1("BOOL", 7, q1.E, 0);
        l1 l1Var = new l1("STRING", 8, q1.F, 2);
        C = l1Var;
        q1 q1Var3 = q1.I;
        m1 m1Var = new m1("GROUP", 9, q1Var3, 3);
        D = m1Var;
        n1 n1Var = new n1("MESSAGE", 10, q1Var3, 2);
        E = n1Var;
        F = new p1[]{p1Var, p1Var2, p1Var3, p1Var4, p1Var5, p1Var6, p1Var7, p1Var8, l1Var, m1Var, n1Var, new o1("BYTES", 11, q1.G, 2), new p1("UINT32", 12, q1Var2, 0), new p1("ENUM", 13, q1.H, 0), new p1("SFIXED32", 14, q1Var2, 5), new p1("SFIXED64", 15, q1Var, 1), new p1("SINT32", 16, q1Var2, 0), new p1("SINT64", 17, q1Var, 0)};
    }

    public p1(String str, int i10, q1 q1Var, int i11) {
        super(str, i10);
        this.A = q1Var;
        this.B = i11;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) F.clone();
    }
}
