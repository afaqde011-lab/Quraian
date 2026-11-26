package d10;

import java.util.ArrayList;
import java.util.Collection;

public final class n1 implements u00.a {
    public final int A;
    public final o1 B;
    public final p1 C;

    public n1(o1 o1Var, p1 p1Var, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = p1Var;
    }

    @Override
    public final Object invoke() {
        String str;
        switch (this.A) {
            case 0:
                x1 x1Var = this.B.c;
                a10.w wVar = o1.f[0];
                o10.c cVar = (o10.c) x1Var.invoke();
                if (cVar != null) {
                    d50.g gVar = cVar.b;
                    str = (String) gVar.h;
                    if (((h20.a) gVar.c) != h20.a.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                return this.C.B.getClassLoader().loadClass(r30.r.u0(str, '/', '.'));
            default:
                qj.c i1Var = new i1(this.C, 1);
                x1 x1Var2 = this.B.d;
                a10.w wVar2 = o1.f[1];
                Object objInvoke = x1Var2.invoke();
                kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
                Collection<j10.k> collectionC = k00.f.C((x20.n) objInvoke, null, 3);
                ArrayList arrayList = new ArrayList();
                for (j10.k kVar : collectionC) {
                    j jVar = kVar instanceof j10.c ? (j) kVar.G(i1Var, g00.b0.a) : null;
                    if (jVar != null) {
                        arrayList.add(jVar);
                    }
                }
                return h00.q.n1(arrayList);
        }
    }
}
