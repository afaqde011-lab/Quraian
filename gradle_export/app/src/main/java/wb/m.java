package wb;

public final class m {

    public final Integer f15973a;

    public final String f15974b;

    public m(Integer num, String str) {
        this.f15973a = num;
        this.f15974b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f15973a.equals(mVar.f15973a) && kotlin.jvm.internal.m.a(this.f15974b, mVar.f15974b);
    }

    public final int hashCode() {
        int iHashCode = this.f15973a.hashCode() * 31;
        String str = this.f15974b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Entry(value=");
        sb2.append(this.f15973a);
        sb2.append(", memoryCacheKey=");
        return g4.c.k(sb2, this.f15974b, ')');
    }
}
