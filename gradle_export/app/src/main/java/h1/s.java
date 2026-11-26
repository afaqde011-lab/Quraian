package h1;

public final class s implements Comparable {
    public final int A;
    public final int B;
    public final int C;
    public final long D;

    public s(int i10, int i11, int i12, long j9) {
        this.A = i10;
        this.B = i11;
        this.C = i12;
        this.D = j9;
    }

    @Override
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.m.g(this.D, ((s) obj).D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.A == sVar.A && this.B == sVar.B && this.C == sVar.C && this.D == sVar.D;
    }

    public final int hashCode() {
        return Long.hashCode(this.D) + w.c.d(this.C, w.c.d(this.B, Integer.hashCode(this.A) * 31, 31), 31);
    }

    public final String toString() {
        return "CalendarDate(year=" + this.A + ", month=" + this.B + ", dayOfMonth=" + this.C + ", utcTimeMillis=" + this.D + ')';
    }
}
