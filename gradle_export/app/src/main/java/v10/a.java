package v10;

import k20.f;
import kotlin.jvm.internal.m;

public final class a implements Comparable {
    public final int A;
    public final int B;
    public final int C;

    static {
        new a(f.g.a);
        new a(f.h.a);
    }

    public a(int i, int i2, int i3) {
        this.A = i;
        this.B = i2;
        this.C = i3;
        if (i < 0) {
            throw new IllegalArgumentException("Major version should be not less than 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Minor version should be not less than 0");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Patch version should be not less than 0");
        }
    }

    public a(int[] intArray) {
        this(intArray[0], intArray[1], intArray[2]);
        m.e(intArray, "intArray");
    }

    @Override
    public final int compareTo(a other) {
        m.e(other, "other");
        int iF = m.f(this.A, other.A);
        if (iF != 0) {
            return iF;
        }
        int iF2 = m.f(this.B, other.B);
        return iF2 != 0 ? iF2 : m.f(this.C, other.C);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type kotlin.metadata.jvm.JvmMetadataVersion");
        a aVar = (a) obj;
        return this.A == aVar.A && this.B == aVar.B && this.C == aVar.C;
    }

    public final int hashCode() {
        return (((this.A * 31) + this.B) * 31) + this.C;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A);
        sb.append('.');
        sb.append(this.B);
        sb.append('.');
        sb.append(this.C);
        return sb.toString();
    }
}
