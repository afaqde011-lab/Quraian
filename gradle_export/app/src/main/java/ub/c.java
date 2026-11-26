package ub;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class c {

    public final Bitmap f15234a;

    public final Map f15235b;

    public c(Bitmap bitmap, Map map) {
        this.f15234a = bitmap;
        this.f15235b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f15234a, cVar.f15234a) && m.a(this.f15235b, cVar.f15235b);
    }

    public final int hashCode() {
        return this.f15235b.hashCode() + (this.f15234a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Value(bitmap=");
        sb2.append(this.f15234a);
        sb2.append(", extras=");
        return w.c.m(sb2, this.f15235b, ')');
    }
}
