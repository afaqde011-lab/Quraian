package s10;

public final class k1 {
    DECLARATION(0),
    FAKE_OVERRIDE(1),
    DELEGATION(2),
    SYNTHESIZED(3);

    public static final n00.b C;
    public final t10.h A;

    static {
        C = f50.c.v(k1VarArr);
    }

    public k1(int i) {
        super(str, i);
        k20.c MEMBER_KIND = k20.e.p;
        kotlin.jvm.internal.m.d(MEMBER_KIND, "MEMBER_KIND");
        this.A = new t10.h(MEMBER_KIND, i);
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) B.clone();
    }
}
