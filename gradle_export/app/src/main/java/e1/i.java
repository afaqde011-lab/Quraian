package e1;

public final class i {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final i[] D;

    static {
        i iVar = new i("CROSSED", 0);
        A = iVar;
        i iVar2 = new i("NOT_CROSSED", 1);
        B = iVar2;
        i iVar3 = new i("COLLAPSED", 2);
        C = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        D = iVarArr;
        f50.c.v(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) D.clone();
    }
}
