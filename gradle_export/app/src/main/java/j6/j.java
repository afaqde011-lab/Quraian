package j6;

import java.util.ArrayList;
import java.util.Iterator;

public final class j extends b6.j {

    public b6.m f8180c;

    public int f8181d;

    public int f8182e;

    public j() {
        super(0, 3);
        this.f8180c = b6.k.f2179a;
        this.f8181d = 0;
        this.f8182e = 0;
    }

    @Override
    public final b6.h a() {
        j jVar = new j();
        jVar.f8180c = this.f8180c;
        jVar.f8181d = this.f8181d;
        jVar.f8182e = this.f8182e;
        ArrayList arrayList = this.f2178b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b6.h) it.next()).a());
        }
        jVar.f2178b.addAll(arrayList2);
        return jVar;
    }

    @Override
    public final b6.m b() {
        return this.f8180c;
    }

    @Override
    public final void c(b6.m mVar) {
        this.f8180c = mVar;
    }

    public final String toString() {
        return "EmittableColumn(modifier=" + this.f8180c + ", verticalAlignment=" + ((Object) b.b(this.f8181d)) + ", horizontalAlignment=" + ((Object) a.b(this.f8182e)) + ", children=[\n" + d() + "\n])";
    }
}
