package lo;

public final class s {
    public static final s A;
    public static final s B;
    public static final s C;
    public static final s[] D;

    static {
        s sVar = new s("START", 0);
        A = sVar;
        s sVar2 = new s("CONTINUE", 1);
        B = sVar2;
        s sVar3 = new s("PAUSE", 2);
        C = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        D = sVarArr;
        f50.c.v(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) D.clone();
    }
}
