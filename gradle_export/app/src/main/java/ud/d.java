package ud;

public final class d {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d[] D;

    static {
        d dVar = new d("DEFAULT", 0);
        A = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        B = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        C = dVar3;
        D = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) D.clone();
    }
}
