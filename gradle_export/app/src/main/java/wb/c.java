package wb;

import a40.m0;
import a40.v;
import android.graphics.Bitmap;

public final class c {

    public final v f15894a;

    public final v f15895b;

    public final v f15896c;

    public final v f15897d;

    public final ac.c f15898e;

    public final xb.d f15899f;

    public final Bitmap.Config f15900g;

    public final boolean f15901h;

    public final b f15902i;

    public final b f15903j;

    public final b f15904k;

    public c() {
        h40.e eVar = m0.a;
        b40.c cVar = f40.m.a.F;
        h40.d dVar = h40.d.C;
        xb.d dVar2 = xb.d.C;
        Bitmap.Config config = bc.d.f2481b;
        b bVar = b.ENABLED;
        this.f15894a = cVar;
        this.f15895b = dVar;
        this.f15896c = dVar;
        this.f15897d = dVar;
        this.f15898e = ac.e.f434a;
        this.f15899f = dVar2;
        this.f15900g = config;
        this.f15901h = true;
        this.f15902i = bVar;
        this.f15903j = bVar;
        this.f15904k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f15894a, cVar.f15894a) && kotlin.jvm.internal.m.a(this.f15895b, cVar.f15895b) && kotlin.jvm.internal.m.a(this.f15896c, cVar.f15896c) && kotlin.jvm.internal.m.a(this.f15897d, cVar.f15897d) && kotlin.jvm.internal.m.a(this.f15898e, cVar.f15898e) && this.f15899f == cVar.f15899f && this.f15900g == cVar.f15900g && this.f15901h == cVar.f15901h && this.f15902i == cVar.f15902i && this.f15903j == cVar.f15903j && this.f15904k == cVar.f15904k;
    }

    public final int hashCode() {
        int iHashCode = (this.f15897d.hashCode() + ((this.f15896c.hashCode() + ((this.f15895b.hashCode() + (this.f15894a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f15898e.getClass();
        return this.f15904k.hashCode() + ((this.f15903j.hashCode() + ((this.f15902i.hashCode() + w.c.e(w.c.e((this.f15900g.hashCode() + ((this.f15899f.hashCode() + ((ac.c.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f15901h), 923521, false)) * 31)) * 31);
    }
}
