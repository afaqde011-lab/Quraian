package e6;

public final class b {
    public static final b A;
    public static final b B;
    public static final b[] C;

    b EF0;

    static {
        b bVar = new b("ACTIVITY", 0);
        b bVar2 = new b("BROADCAST", 1);
        A = bVar2;
        b bVar3 = new b("SERVICE", 2);
        b bVar4 = new b("FOREGROUND_SERVICE", 3);
        b bVar5 = new b("CALLBACK", 4);
        B = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        C = bVarArr;
        f50.c.v(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) C.clone();
    }
}
