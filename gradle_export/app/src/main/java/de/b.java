package de;

import java.util.Set;

public final class b {

    public final long f4871a;

    public final long f4872b;

    public final Set f4873c;

    public b(long j9, long j10, Set set) {
        this.f4871a = j9;
        this.f4872b = j10;
        this.f4873c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f4871a == bVar.f4871a && this.f4872b == bVar.f4872b && this.f4873c.equals(bVar.f4873c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j9 = this.f4871a;
        int i10 = (((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f4872b;
        return this.f4873c.hashCode() ^ ((i10 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f4871a + ", maxAllowedDelay=" + this.f4872b + ", flags=" + this.f4873c + "}";
    }
}
