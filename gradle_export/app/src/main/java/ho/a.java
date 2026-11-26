package ho;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final b f;
    public final List g;
    public final int h;

    public a(int i, String str, String str2, String str3, String str4, b bVar, List list, int i2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = bVar;
        this.g = list;
        this.h = i2;
    }

    public static a a(a aVar, ArrayList arrayList) {
        int i = aVar.a;
        String str = aVar.b;
        String str2 = aVar.c;
        String str3 = aVar.d;
        String str4 = aVar.e;
        b bVar = aVar.f;
        int i2 = aVar.h;
        aVar.getClass();
        return new a(i, str, str2, str3, str4, bVar, arrayList, i2);
    }

    public final g b() {
        Object obj;
        Object next;
        List list = this.g;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((g) next).c());
        g gVar = (g) next;
        if (gVar != null) {
            return gVar;
        }
        for (Object obj2 : list) {
            if (!((g) obj2).l) {
                obj = obj2;
                break;
            }
        }
        return (g) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && kotlin.jvm.internal.m.a(this.b, aVar.b) && kotlin.jvm.internal.m.a(this.c, aVar.c) && kotlin.jvm.internal.m.a(this.d, aVar.d) && kotlin.jvm.internal.m.a(this.e, aVar.e) && kotlin.jvm.internal.m.a(this.f, aVar.f) && kotlin.jvm.internal.m.a(this.g, aVar.g) && this.h == aVar.h;
    }

    public final int hashCode() {
        int iE = x5.e(x5.e(Integer.hashCode(this.a) * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.f;
        return Integer.hashCode(this.h) + g4.c.a((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbM = g4.c.m("AudioStory(id=", this.a, ", slug=", this.b, ", title=");
        a1.b.z(sbM, this.c, ", description=", this.d, ", coverUrl=");
        sbM.append(this.e);
        sbM.append(", author=");
        sbM.append(this.f);
        sbM.append(", episodes=");
        sbM.append(this.g);
        sbM.append(", version=");
        sbM.append(this.h);
        sbM.append(")");
        return sbM.toString();
    }
}
