package f20;

public final class q {
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q[] D;

    static {
        q qVar = new q("FLEXIBLE_LOWER", 0);
        A = qVar;
        q qVar2 = new q("FLEXIBLE_UPPER", 1);
        B = qVar2;
        q qVar3 = new q("INFLEXIBLE", 2);
        C = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        D = qVarArr;
        f50.c.v(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) D.clone();
    }
}
