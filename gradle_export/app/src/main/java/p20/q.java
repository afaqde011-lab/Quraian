package p20;

public final class q {
    public static final q A;
    public static final q B;
    public static final q[] C;

    q EF0;

    static {
        q qVar = new q("PRETTY", 0);
        q qVar2 = new q("DEBUG", 1);
        A = qVar2;
        q qVar3 = new q("NONE", 2);
        B = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        C = qVarArr;
        f50.c.v(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) C.clone();
    }
}
