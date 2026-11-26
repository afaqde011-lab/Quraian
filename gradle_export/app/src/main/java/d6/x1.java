package d6;

import java.util.ArrayList;
import java.util.Iterator;

public final class x1 extends b6.j {

    public final int f4713c;

    public b6.m f4714d;

    public x1(int i10) {
        super(i10, 2);
        this.f4713c = i10;
        this.f4714d = b6.k.f2179a;
    }

    @Override
    public final b6.h a() {
        x1 x1Var = new x1(this.f4713c);
        x1Var.f4714d = this.f4714d;
        ArrayList arrayList = this.f2178b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b6.h) it.next()).a());
        }
        x1Var.f2178b.addAll(arrayList2);
        return x1Var;
    }

    @Override
    public final b6.m b() {
        return this.f4714d;
    }

    @Override
    public final void c(b6.m mVar) {
        this.f4714d = mVar;
    }

    public final String toString() {
        return "RemoteViewsRoot(modifier=" + this.f4714d + ", children=[\n" + d() + "\n])";
    }
}
