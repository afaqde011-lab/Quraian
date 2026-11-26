package g10;

import j10.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m10.a0;
import m10.w;
import m10.z;

public final class l implements u00.a {
    public final int A;
    public final a0 B;

    public l(a0 a0Var, int i) {
        this.A = i;
        this.B = a0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return ((w) this.B.f0(p.i)).H;
            case 1:
                return new i10.i(this.B);
            default:
                a0 a0Var = this.B;
                z zVar = a0Var.H;
                if (zVar == null) {
                    StringBuilder sb = new StringBuilder("Dependencies of module ");
                    String str = a0Var.getName().A;
                    kotlin.jvm.internal.m.d(str, "toString(...)");
                    sb.append(str);
                    sb.append(" were not set before querying module content");
                    throw new AssertionError(sb.toString());
                }
                List list = zVar.A;
                a0Var.X0();
                list.contains(a0Var);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((a0) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h0 h0Var = ((a0) it2.next()).I;
                    kotlin.jvm.internal.m.b(h0Var);
                    arrayList.add(h0Var);
                }
                return new m10.l(arrayList, "CompositeProvider@ModuleDescriptor for " + a0Var.getName());
        }
    }
}
