package z00;

import ca.v;
import java.util.Iterator;

public class c implements Iterable, v00.a {
    public final int A;
    public final int B;
    public final int C;

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.A = i;
        this.B = v.y(i, i2, i3);
        this.C = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.A == cVar.A && this.B == cVar.B && this.C == cVar.C;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.A * 31) + this.B) * 31) + this.C;
    }

    public boolean isEmpty() {
        int i = this.C;
        int i2 = this.B;
        int i3 = this.A;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override
    public final Iterator iterator() {
        return new d(this.A, this.B, this.C);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.B;
        int i2 = this.A;
        int i3 = this.C;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            i3 = -i3;
        }
        sb.append(i3);
        return sb.toString();
    }
}
