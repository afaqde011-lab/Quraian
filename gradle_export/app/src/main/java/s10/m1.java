package s10;

public final class m1 {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    PRIVATE_TO_THIS(4),
    LOCAL(5);

    public static final n00.b D;
    public final t10.h A;

    static {
        D = f50.c.v(m1VarArr);
    }

    public m1(int i) {
        super(str, i);
        k20.c VISIBILITY = k20.e.d;
        kotlin.jvm.internal.m.d(VISIBILITY, "VISIBILITY");
        this.A = new t10.h(VISIBILITY, i);
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) C.clone();
    }
}
