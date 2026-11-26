package qr;

public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b[] E;

    static {
        b bVar = new b("SignIn", 0);
        A = bVar;
        b bVar2 = new b("UpcomingReciter", 1);
        B = bVar2;
        b bVar3 = new b("PublishedReciter", 2);
        C = bVar3;
        b bVar4 = new b("ChangesLog", 3);
        D = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        E = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) E.clone();
    }
}
