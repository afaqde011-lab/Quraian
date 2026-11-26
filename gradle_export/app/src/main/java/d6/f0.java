package d6;

import java.util.ArrayList;
import java.util.Iterator;

public final class f0 extends b6.j {

    public long f4626c;

    public f2 f4627d;

    public f0() {
        super(0, 3);
        this.f4626c = 9205357640488583168L;
        this.f4627d = e2.f4625a;
    }

    @Override
    public final b6.h a() {
        f0 f0Var = new f0();
        f0Var.f4626c = this.f4626c;
        f0Var.f4627d = this.f4627d;
        ArrayList arrayList = this.f2178b;
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((b6.h) it.next()).a());
        }
        f0Var.f2178b.addAll(arrayList2);
        return f0Var;
    }

    @Override
    public final b6.m b() {
        b6.m mVarB;
        b6.h hVar = (b6.h) h00.q.f1(this.f2178b);
        return (hVar == null || (mVarB = hVar.b()) == null) ? ze.d.u(b6.k.f2179a) : mVarB;
    }

    @Override
    public final void c(b6.m mVar) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        return "EmittableSizeBox(size=" + ((Object) y3.h.c(this.f4626c)) + ", sizeMode=" + this.f4627d + ", children=[\n" + d() + "\n])";
    }
}
