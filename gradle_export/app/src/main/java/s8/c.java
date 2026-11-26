package s8;

import java.util.Objects;

public final class c implements Comparable {
    public final long A;
    public final long B;
    public final long C;

    public c(long j9, long j10, long j11) {
        this.A = j9;
        this.B = j10;
        this.C = j11;
    }

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.A, ((c) obj).A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.A == cVar.A && this.B == cVar.B && this.C == cVar.C;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.A), Long.valueOf(this.B), Long.valueOf(this.C));
    }
}
