package j6;

import java.util.ArrayList;
import java.util.Iterator;

public final class k extends b6.j {

    public b6.m f8183c;

    public int f8184d;

    public int f8185e;

    public k() {
        super(0, 3);
        this.f8183c = b6.k.f2179a;
        this.f8184d = 0;
        this.f8185e = 0;
    }

    @Override
    public final b6.h a() {
        k kVar = new k();
        kVar.f8183c = this.f8183c;
        kVar.f8184d = this.f8184d;
        kVar.f8185e = this.f8185e;
        ArrayList arrayList = this.f2178b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b6.h) it.next()).a());
        }
        kVar.f2178b.addAll(arrayList2);
        return kVar;
    }

    @Override
    public final b6.m b() {
        return this.f8183c;
    }

    @Override
    public final void c(b6.m mVar) {
        this.f8183c = mVar;
    }

    public final String toString() {
        return "EmittableRow(modifier=" + this.f8183c + ", horizontalAlignment=" + ((Object) a.b(this.f8184d)) + ", verticalAlignment=" + ((Object) b.b(this.f8185e)) + ", children=[\n" + d() + "\n])";
    }
}
