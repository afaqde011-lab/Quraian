package e1;

public final class s {
    public static final s A;
    public static final s[] B;

    static {
        s sVar = new s("EditableText", 0);
        A = sVar;
        s[] sVarArr = {sVar, new s("StaticText", 1)};
        B = sVarArr;
        f50.c.v(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) B.clone();
    }
}
