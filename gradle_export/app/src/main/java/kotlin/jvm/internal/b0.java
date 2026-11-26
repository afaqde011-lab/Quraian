package kotlin.jvm.internal;

import java.util.List;

public class b0 {
    public a10.g a(i iVar) {
        return iVar;
    }

    public a10.d b(Class cls) {
        return new e(cls);
    }

    public a10.f c(Class cls) {
        return new r(cls);
    }

    public a10.x d(a10.x xVar) {
        e0 e0Var = (e0) xVar;
        a10.e eVarS = xVar.s();
        List listR = xVar.r();
        e0Var.getClass();
        return new e0(eVarS, listR, e0Var.C | 2);
    }

    public a10.j e(o oVar) {
        return oVar;
    }

    public a10.l f(p pVar) {
        return pVar;
    }

    public a10.r g(f40.h hVar) {
        return hVar;
    }

    public a10.t h(s sVar) {
        return sVar;
    }

    public a10.v i(t tVar) {
        return tVar;
    }

    public String j(h hVar) {
        String string = hVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String k(n nVar) {
        return j(nVar);
    }

    public a10.x l(a10.d classifier, List arguments, boolean z) {
        m.e(classifier, "classifier");
        m.e(arguments, "arguments");
        return new e0(classifier, arguments, z ? 1 : 0);
    }
}
