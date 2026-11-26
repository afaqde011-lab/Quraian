package j6;

import java.util.ArrayList;
import java.util.Iterator;

public final class i extends b6.j {

    public b6.m f8178c;

    public c f8179d;

    public i() {
        super(0, 3);
        this.f8178c = b6.k.f2179a;
        this.f8179d = c.f8172c;
    }

    @Override
    public final b6.h a() {
        i iVar = new i();
        iVar.f8178c = this.f8178c;
        iVar.f8179d = this.f8179d;
        ArrayList arrayList = this.f2178b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b6.h) it.next()).a());
        }
        iVar.f2178b.addAll(arrayList2);
        return iVar;
    }

    @Override
    public final b6.m b() {
        return this.f8178c;
    }

    @Override
    public final void c(b6.m mVar) {
        this.f8178c = mVar;
    }

    public final String toString() {
        return "EmittableBox(modifier=" + this.f8178c + ", contentAlignment=" + this.f8179d + "children=[\n" + d() + "\n])";
    }
}
