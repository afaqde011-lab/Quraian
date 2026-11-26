package h3;

import kotlin.jvm.internal.m;
import o2.f;
import oi.k;

public final class a {

    public final f f6559a;

    public final int f6560b;

    public a(f fVar, int i10) {
        this.f6559a = fVar;
        this.f6560b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f6559a, aVar.f6559a) && this.f6560b == aVar.f6560b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6560b) + (this.f6559a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageVectorEntry(imageVector=");
        sb2.append(this.f6559a);
        sb2.append(", configFlags=");
        return k.l(sb2, this.f6560b, ')');
    }
}
