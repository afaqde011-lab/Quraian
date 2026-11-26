package m3;

public final class x {

    public static final x f10548c = new x(0, false);

    public final boolean f10549a;

    public final int f10550b;

    public x() {
        this.f10549a = false;
        this.f10550b = 0;
    }

    public x(int i10, boolean z10) {
        this.f10549a = z10;
        this.f10550b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f10549a == xVar.f10549a && this.f10550b == xVar.f10550b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10550b) + (Boolean.hashCode(this.f10549a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f10549a + ", emojiSupportMatch=" + ((Object) l.a(this.f10550b)) + ')';
    }
}
