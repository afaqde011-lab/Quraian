package xa;

import android.graphics.Rect;
import kotlin.jvm.internal.m;

public final class a {

    public final wa.a f16504a;

    public final float f16505b;

    public a(Rect rect, float f3) {
        this.f16504a = new wa.a(rect.left, rect.top, rect.right, rect.bottom);
        this.f16505b = f3;
    }

    public final Rect a() {
        wa.a aVar = this.f16504a;
        aVar.getClass();
        return new Rect(aVar.f15890a, aVar.f15891b, aVar.f15892c, aVar.f15893d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        a aVar = (a) obj;
        return m.a(this.f16504a, aVar.f16504a) && this.f16505b == aVar.f16505b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16505b) + (this.f16504a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f16504a);
        sb2.append(", density=");
        return w.c.k(sb2, this.f16505b, ')');
    }
}
