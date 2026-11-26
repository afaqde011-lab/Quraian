package s10;

public final class u0 {
    public static final u0[] A;

    u0 EF5;

    static {
        u0[] u0VarArr = {new u0("AT_MOST_ONCE", 0), new u0("EXACTLY_ONCE", 1), new u0("AT_LEAST_ONCE", 2)};
        A = u0VarArr;
        f50.c.v(u0VarArr);
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) A.clone();
    }
}
