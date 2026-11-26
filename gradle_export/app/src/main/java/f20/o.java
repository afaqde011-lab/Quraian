package f20;

import e30.w;
import e30.z0;
import g00.b0;
import m10.u;

public final class o implements u00.k {
    public static final o B = new o(0);
    public static final o C = new o(1);
    public static final o D = new o(2);
    public static final o E = new o(3);
    public final int A;

    public o(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                j10.c it = (j10.c) obj;
                kotlin.jvm.internal.m.e(it, "it");
                u uVarX = it.X();
                kotlin.jvm.internal.m.b(uVarX);
                return uVarX.getType();
            case 1:
                j10.c it2 = (j10.c) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                w returnType = it2.getReturnType();
                kotlin.jvm.internal.m.b(returnType);
                return returnType;
            case 2:
                z0 it3 = (z0) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return Boolean.valueOf(it3 instanceof c20.i);
            case 3:
                j10.h hVarG = ((z0) obj).m0().g();
                if (hVarG == null) {
                    return Boolean.FALSE;
                }
                n20.e name = hVarG.getName();
                n20.c cVar = i10.d.f;
                return Boolean.valueOf(kotlin.jvm.internal.m.a(name, cVar.a.g()) && kotlin.jvm.internal.m.a(u20.d.c(hVarG), cVar));
            default:
                p function = (p) obj;
                kotlin.jvm.internal.m.e(function, "$this$function");
                String strConcat = "java/util/".concat("Spliterator");
                e eVar = m.b;
                function.b(strConcat, eVar, eVar);
                q20.l lVar = q20.l.A;
                return b0.a;
        }
    }
}
