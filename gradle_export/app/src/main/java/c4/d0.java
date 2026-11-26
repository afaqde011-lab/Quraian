package c4;

public final class d0 {
    public static final d0 A;
    public static final d0 B;
    public static final d0[] C;

    static {
        d0 d0Var = new d0("Inherit", 0);
        A = d0Var;
        d0 d0Var2 = new d0("SecureOn", 1);
        B = d0Var2;
        d0[] d0VarArr = {d0Var, d0Var2, new d0("SecureOff", 2)};
        C = d0VarArr;
        f50.c.v(d0VarArr);
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) C.clone();
    }
}
