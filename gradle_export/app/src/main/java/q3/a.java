package q3;

public final class a implements z {
    public final int A;

    public a(int i10) {
        this.A = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.A == ((a) obj).A;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.A, ')');
    }
}
