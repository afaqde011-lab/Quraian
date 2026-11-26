package s9;

public final class k extends l {

    public final b f13938a;

    public final int f13939b;

    public k(b bVar, int i10) {
        kotlin.jvm.internal.m.e(bVar, "latestEvent");
        this.f13938a = bVar;
        this.f13939b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f13939b == kVar.f13939b && kotlin.jvm.internal.m.a(this.f13938a, kVar.f13938a);
    }

    public final int hashCode() {
        return this.f13938a.hashCode() + (this.f13939b * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InProgress(latestEvent=");
        sb2.append(this.f13938a);
        sb2.append(", direction=");
        return oi.k.l(sb2, this.f13939b, ')');
    }
}
