package k1;

public final class q {
    public static final q A;
    public static final q B;
    public static final q C;
    public static final q D;
    public static final q E;
    public static final q[] F;

    static {
        q qVar = new q("DefaultSpatial", 0);
        A = qVar;
        q qVar2 = new q("FastSpatial", 1);
        B = qVar2;
        q qVar3 = new q("SlowSpatial", 2);
        q qVar4 = new q("DefaultEffects", 3);
        C = qVar4;
        q qVar5 = new q("FastEffects", 4);
        D = qVar5;
        q qVar6 = new q("SlowEffects", 5);
        E = qVar6;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6};
        F = qVarArr;
        f50.c.v(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) F.clone();
    }
}
