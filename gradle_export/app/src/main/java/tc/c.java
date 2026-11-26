package tc;

import android.view.View;
import com.google.android.gms.internal.measurement.x5;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

public final class c {

    public final Object f14511a;

    public final String f14512b;

    public final String f14513c;

    public final String f14514d;

    public final String f14515e;

    public final String f14516f;

    public final String f14517g;

    public final boolean f14518h;

    public final boolean f14519i;

    public c(View view, String str, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11) {
        this.f14511a = view;
        this.f14512b = str;
        this.f14513c = str2;
        this.f14514d = str3;
        this.f14515e = str4;
        this.f14516f = str5;
        this.f14517g = str6;
        this.f14518h = z10;
        this.f14519i = z11;
        new WeakReference(view);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return m.a(this.f14511a, cVar.f14511a) && m.a(this.f14512b, cVar.f14512b) && m.a(this.f14513c, cVar.f14513c) && m.a(this.f14514d, cVar.f14514d) && m.a(this.f14515e, cVar.f14515e) && m.a(this.f14516f, cVar.f14516f) && m.a(this.f14517g, cVar.f14517g) && this.f14518h == cVar.f14518h && this.f14519i == cVar.f14519i;
    }

    public final int hashCode() {
        Object obj = this.f14511a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        String str = this.f14512b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14513c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14514d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14515e;
        int iE = x5.e((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, this.f14516f, 31);
        String str5 = this.f14517g;
        return Boolean.hashCode(this.f14519i) + w.c.e((iE + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.f14518h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ViewTarget(_view=");
        sb2.append(this.f14511a);
        sb2.append(", className=");
        sb2.append(this.f14512b);
        sb2.append(", resourceName=");
        sb2.append(this.f14513c);
        sb2.append(", tag=");
        sb2.append(this.f14514d);
        sb2.append(", text=");
        sb2.append(this.f14515e);
        sb2.append(", source=");
        sb2.append(this.f14516f);
        sb2.append(", hierarchy=");
        sb2.append(this.f14517g);
        sb2.append(", ampIgnoreRageClick=");
        sb2.append(this.f14518h);
        sb2.append(", ampIgnoreDeadClick=");
        return x5.o(sb2, this.f14519i, ')');
    }
}
