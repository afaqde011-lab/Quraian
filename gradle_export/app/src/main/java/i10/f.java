package i10;

import j10.z;
import java.util.ArrayList;
import java.util.List;
import m10.w;

public final class f implements u00.k {
    public static final f B = new f();
    public final int A = 0;

    public f() {
    }

    public f(o oVar) {
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z = false;
        switch (this.A) {
            case 0:
                z module = (z) obj;
                e eVar = g.d;
                kotlin.jvm.internal.m.e(module, "module");
                List list = (List) ze.d.A(((w) module.f0(g.f)).F, w.I[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof b30.c) {
                        arrayList.add(obj2);
                    }
                }
                return (j10.k) h00.q.L0(arrayList);
            default:
                j10.c cVar = (j10.c) obj;
                if (cVar.getKind() == 1) {
                    j10.k kVarL = cVar.l();
                    kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.a;
                    if (d.j.containsKey(q20.d.f((j10.e) kVarL))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
