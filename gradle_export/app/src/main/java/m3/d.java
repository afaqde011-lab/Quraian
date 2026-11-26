package m3;

import com.google.protobuf.RuntimeVersion;

public final class d {

    public final Object f10419a;

    public final int f10420b;

    public int f10421c;

    public final String f10422d;

    public d(int i10, int i11, Object obj, String str) {
        this.f10419a = obj;
        this.f10420b = i10;
        this.f10421c = i11;
        this.f10422d = str;
    }

    public d(c cVar, int i10, int i11, int i12) {
        this(i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, cVar, RuntimeVersion.SUFFIX);
    }

    public final f a(int i10) {
        int i11 = this.f10421c;
        if (i11 != Integer.MIN_VALUE) {
            i10 = i11;
        }
        if (!(i10 != Integer.MIN_VALUE)) {
            s3.a.b("Item.end should be set first");
        }
        return new f(this.f10420b, i10, this.f10419a, this.f10422d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.m.a(this.f10419a, dVar.f10419a) && this.f10420b == dVar.f10420b && this.f10421c == dVar.f10421c && kotlin.jvm.internal.m.a(this.f10422d, dVar.f10422d);
    }

    public final int hashCode() {
        Object obj = this.f10419a;
        return this.f10422d.hashCode() + w.c.d(this.f10421c, w.c.d(this.f10420b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f10419a);
        sb2.append(", start=");
        sb2.append(this.f10420b);
        sb2.append(", end=");
        sb2.append(this.f10421c);
        sb2.append(", tag=");
        return g4.c.k(sb2, this.f10422d, ')');
    }
}
