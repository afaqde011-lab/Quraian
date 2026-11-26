package h1;

import com.google.protobuf.RuntimeVersion;

public final class a0 {

    public final String f6488a;

    public final char f6489b;

    public final String f6490c;

    public a0(String str, char c10) {
        this.f6488a = str;
        this.f6489b = c10;
        this.f6490c = r30.r.v0(str, String.valueOf(c10), RuntimeVersion.SUFFIX);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return kotlin.jvm.internal.m.a(this.f6488a, a0Var.f6488a) && this.f6489b == a0Var.f6489b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f6489b) + (this.f6488a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f6488a + ", delimiter=" + this.f6489b + ')';
    }
}
