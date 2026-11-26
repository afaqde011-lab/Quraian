package s10;

public final class l1 {
    FINAL(0),
    OPEN(1),
    ABSTRACT(2),
    SEALED(3);

    public static final n00.b G;
    public final t10.h A;

    static {
        G = f50.c.v(l1VarArr);
    }

    public l1(int i) {
        super(str, i);
        k20.c MODALITY = k20.e.e;
        kotlin.jvm.internal.m.d(MODALITY, "MODALITY");
        this.A = new t10.h(MODALITY, i);
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) F.clone();
    }
}
