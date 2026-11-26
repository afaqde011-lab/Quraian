package m3;

public final class l {

    public final int f10477a;

    public static String a(int i10) {
        if (i10 == 0) {
            return "EmojiSupportMatch.Default";
        }
        if (i10 == 1) {
            return "EmojiSupportMatch.None";
        }
        return i10 == 2 ? "EmojiSupportMatch.All" : oi.k.h("Invalid(value=", i10, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f10477a == ((l) obj).f10477a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10477a);
    }

    public final String toString() {
        return a(this.f10477a);
    }
}
