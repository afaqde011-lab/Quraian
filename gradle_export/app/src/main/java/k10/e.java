package k10;

import g10.o;
import h00.d0;
import s20.x;

public abstract class e {
    public static final n20.e a = n20.e.e("message");
    public static final n20.e b = n20.e.e("replaceWith");
    public static final n20.e c = n20.e.e("level");
    public static final n20.e d = n20.e.e("expression");
    public static final n20.e e = n20.e.e("imports");

    public static final j a(g10.i iVar, String message, String replaceWith, String str) {
        kotlin.jvm.internal.m.e(iVar, "<this>");
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(replaceWith, "replaceWith");
        j jVar = new j(iVar, o.o, d0.R(new g00.k(d, new x(replaceWith)), new g00.k(e, new s20.b(new g10.g(iVar, 1), h00.x.A))));
        n20.c cVar = o.m;
        g00.k kVar = new g00.k(a, new x(message));
        g00.k kVar2 = new g00.k(b, new s20.a((Object) jVar));
        n20.c topLevelFqName = o.n;
        kotlin.jvm.internal.m.e(topLevelFqName, "topLevelFqName");
        return new j(iVar, cVar, d0.R(kVar, kVar2, new g00.k(c, new s20.i(new n20.b(topLevelFqName.b(), topLevelFqName.a.g()), n20.e.e(str)))));
    }
}
