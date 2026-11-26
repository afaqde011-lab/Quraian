package sd;

public final class d {
    public static final d A;
    public static final d B;
    public static final d[] C;

    static {
        d dVar = new d("all", 0);
        A = dVar;
        d dVar2 = new d("aural", 1);
        d dVar3 = new d("braille", 2);
        d dVar4 = new d("embossed", 3);
        d dVar5 = new d("handheld", 4);
        d dVar6 = new d("print", 5);
        d dVar7 = new d("projection", 6);
        d dVar8 = new d("screen", 7);
        B = dVar8;
        C = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new d("speech", 8), new d("tty", 9), new d("tv", 10)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) C.clone();
    }
}
