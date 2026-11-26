package p2;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import hf.c;
import kotlin.jvm.internal.m;
import oi.k;
import org.xmlpull.v1.XmlPullParser;

public final class a {

    public final XmlPullParser f12301a;

    public int f12302b = 0;

    public final c f12303c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f12301a = xmlResourceParser;
        c cVar = new c(28, false);
        cVar.B = new float[64];
        this.f12303c = cVar;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f3) {
        if (p4.a.d(this.f12301a, str)) {
            f3 = typedArray.getFloat(i10, f3);
        }
        b(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void b(int i10) {
        this.f12302b = i10 | this.f12302b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f12301a, aVar.f12301a) && this.f12302b == aVar.f12302b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12302b) + (this.f12301a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f12301a);
        sb2.append(", config=");
        return k.l(sb2, this.f12302b, ')');
    }
}
