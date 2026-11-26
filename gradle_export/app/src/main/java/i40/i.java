package i40;

public final class i {
    public static final i A;
    public static final i B;
    public static final i C;
    public static final i D;
    public static final i[] E;

    static {
        i iVar = new i("SUCCESSFUL", 0);
        A = iVar;
        i iVar2 = new i("REREGISTER", 1);
        B = iVar2;
        i iVar3 = new i("CANCELLED", 2);
        C = iVar3;
        i iVar4 = new i("ALREADY_SELECTED", 3);
        D = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        E = iVarArr;
        f50.c.v(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) E.clone();
    }
}
