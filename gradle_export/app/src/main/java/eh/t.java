package eh;

public abstract class t implements n {
    public static final p A;
    public static final t[] B;

    static {
        p pVar = new p();
        A = pVar;
        B = new t[]{pVar, new t() {
            @Override
            public final boolean apply(Object obj) {
                return false;
            }

            @Override
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new t() {
            @Override
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new t() {
            @Override
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) B.clone();
    }
}
