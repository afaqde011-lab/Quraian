package ej;

public final class d {
    public static final d A;
    public static final d[] B;

    static {
        d dVar = new d("DEFAULT", 0);
        A = dVar;
        B = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) B.clone();
    }
}
