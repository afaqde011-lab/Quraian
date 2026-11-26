package x10;

public class d0 {
    public static final d0 B;
    public static final d0 C;
    public static final d0 D;
    public static final c0 E;
    public static final d0[] F;
    public final Object A;

    static {
        d0 d0Var = new d0("NULL", 0, null);
        B = d0Var;
        d0 d0Var2 = new d0("INDEX", 1, -1);
        C = d0Var2;
        d0 d0Var3 = new d0("FALSE", 2, Boolean.FALSE);
        D = d0Var3;
        c0 c0Var = new c0("MAP_GET_OR_DEFAULT", 3, null);
        E = c0Var;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3, c0Var};
        F = d0VarArr;
        f50.c.v(d0VarArr);
    }

    public d0(String str, int i, Object obj) {
        super(str, i);
        this.A = obj;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) F.clone();
    }
}
