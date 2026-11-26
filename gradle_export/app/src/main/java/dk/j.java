package dk;

public final class j extends Number {
    public final String A;

    public j(String str) {
        this.A = str;
    }

    @Override
    public final double doubleValue() {
        return Double.parseDouble(this.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.A.equals(((j) obj).A);
        }
        return false;
    }

    @Override
    public final float floatValue() {
        return Float.parseFloat(this.A);
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final int intValue() {
        String str = this.A;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return h.i(str).intValue();
        }
    }

    @Override
    public final long longValue() {
        String str = this.A;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return h.i(str).longValue();
        }
    }

    public final String toString() {
        return this.A;
    }
}
