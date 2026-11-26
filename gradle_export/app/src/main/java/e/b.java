package e;

import kotlin.jvm.internal.m;

public final class b extends s9.g {

    public final Object f4930a;

    public final long f4931b;

    public b(Object obj, long j9) {
        this.f4930a = obj;
        this.f4931b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f4930a, bVar.f4930a) && this.f4931b == bVar.f4931b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4931b) + (this.f4930a.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f4930a + ", compositeKey=" + this.f4931b + ')';
    }
}
