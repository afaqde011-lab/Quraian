package qr;

public final class u {
    public static final u A;
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u[] E;

    static {
        u uVar = new u("COMPLETE", 0);
        A = uVar;
        u uVar2 = new u("MISSED", 1);
        B = uVar2;
        u uVar3 = new u("CURRENT", 2);
        C = uVar3;
        u uVar4 = new u("FUTURE", 3);
        D = uVar4;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4};
        E = uVarArr;
        f50.c.v(uVarArr);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) E.clone();
    }
}
