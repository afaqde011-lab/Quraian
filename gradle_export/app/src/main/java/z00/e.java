package z00;

public final class e extends c implements b {
    public static final e D = new e(1, 0, 1);

    @Override
    public final Comparable a() {
        return Integer.valueOf(this.A);
    }

    @Override
    public final Comparable c() {
        return Integer.valueOf(this.B);
    }

    public final boolean e(int i) {
        return this.A <= i && i <= this.B;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (isEmpty() && ((e) obj).isEmpty()) {
            return true;
        }
        e eVar = (e) obj;
        return this.A == eVar.A && this.B == eVar.B;
    }

    @Override
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A * 31) + this.B;
    }

    @Override
    public final boolean isEmpty() {
        return this.A > this.B;
    }

    @Override
    public final String toString() {
        return this.A + ".." + this.B;
    }
}
