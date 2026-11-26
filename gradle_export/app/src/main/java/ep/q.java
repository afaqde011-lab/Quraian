package ep;

public final class q {
    PURCHASE("purchase"),
    RESTORE("restore");

    public final String A;

    static {
        f50.c.v(qVarArr);
    }

    public q(String str) {
        super(str, i);
        this.A = str;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) D.clone();
    }
}
