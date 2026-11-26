package a2;

public final class c {

    public final int f157a;

    public final o f158b;

    public final Integer f159c;

    public c(int i10, o oVar, Integer num) {
        this.f157a = i10;
        this.f158b = oVar;
        this.f159c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f157a == cVar.f157a && kotlin.jvm.internal.m.a(this.f158b, cVar.f158b) && kotlin.jvm.internal.m.a(this.f159c, cVar.f159c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f157a) * 31;
        o oVar = this.f158b;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Integer num = this.f159c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.f157a + ", sourceInfo=" + this.f158b + ", groupOffset=" + this.f159c + ')';
    }
}
