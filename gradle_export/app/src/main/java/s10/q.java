package s10;

public final class q {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    OBJECT(5),
    COMPANION_OBJECT(6);

    public static final n00.b J;
    public final t10.h A;

    static {
        J = f50.c.v(qVarArr);
    }

    public q(int i) {
        super(str, i);
        k20.c CLASS_KIND = k20.e.f;
        kotlin.jvm.internal.m.d(CLASS_KIND, "CLASS_KIND");
        this.A = new t10.h(CLASS_KIND, i);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) I.clone();
    }
}
