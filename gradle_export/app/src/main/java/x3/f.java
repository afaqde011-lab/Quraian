package x3;

public final class f {

    public static final float f16406b;

    public static final float f16407c;

    public static final float f16408d;

    public final float f16409a;

    static {
        a(0.0f);
        a(0.5f);
        f16406b = 0.5f;
        a(-1.0f);
        f16407c = -1.0f;
        a(1.0f);
        f16408d = 1.0f;
    }

    public static void a(float f3) {
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            s3.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f3) {
        if (f3 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f3 == f16406b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f3 == f16407c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f3 == f16408d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f3 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f16409a, ((f) obj).f16409a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16409a);
    }

    public final String toString() {
        return b(this.f16409a);
    }
}
