package m3;

import com.google.protobuf.RuntimeVersion;

public final class f {

    public final Object f10423a;

    public final int f10424b;

    public final int f10425c;

    public final String f10426d;

    public f(int i10, int i11, Object obj, String str) {
        this.f10423a = obj;
        this.f10424b = i10;
        this.f10425c = i11;
        this.f10426d = str;
        if (i10 <= i11) {
            return;
        }
        s3.a.a("Reversed range is not supported");
    }

    public f(Object obj, int i10, int i11) {
        this(i10, i11, obj, RuntimeVersion.SUFFIX);
    }

    public static f a(f fVar, c cVar, int i10, int i11, int i12) {
        Object obj = cVar;
        if ((i12 & 1) != 0) {
            obj = fVar.f10423a;
        }
        if ((i12 & 2) != 0) {
            i10 = fVar.f10424b;
        }
        if ((i12 & 4) != 0) {
            i11 = fVar.f10425c;
        }
        String str = fVar.f10426d;
        fVar.getClass();
        return new f(i10, i11, obj, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(this.f10423a, fVar.f10423a) && this.f10424b == fVar.f10424b && this.f10425c == fVar.f10425c && kotlin.jvm.internal.m.a(this.f10426d, fVar.f10426d);
    }

    public final int hashCode() {
        Object obj = this.f10423a;
        return this.f10426d.hashCode() + w.c.d(this.f10425c, w.c.d(this.f10424b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f10423a);
        sb2.append(", start=");
        sb2.append(this.f10424b);
        sb2.append(", end=");
        sb2.append(this.f10425c);
        sb2.append(", tag=");
        return g4.c.k(sb2, this.f10426d, ')');
    }
}
