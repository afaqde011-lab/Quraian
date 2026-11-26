package e30;

public final class t extends s0 {
    public final j10.r0[] b;
    public final p0[] c;
    public final boolean d;

    public t(j10.r0[] parameters, p0[] arguments, boolean z) {
        kotlin.jvm.internal.m.e(parameters, "parameters");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        this.b = parameters;
        this.c = arguments;
        this.d = z;
    }

    @Override
    public final boolean b() {
        return this.d;
    }

    @Override
    public final p0 d(w wVar) {
        j10.h hVarG = wVar.m0().g();
        j10.r0 r0Var = hVarG instanceof j10.r0 ? (j10.r0) hVarG : null;
        if (r0Var != null) {
            int index = r0Var.getIndex();
            j10.r0[] r0VarArr = this.b;
            if (index < r0VarArr.length && kotlin.jvm.internal.m.a(r0VarArr[index].f(), r0Var.f())) {
                return this.c[index];
            }
        }
        return null;
    }

    @Override
    public final boolean e() {
        return this.c.length == 0;
    }
}
