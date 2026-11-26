package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

public final class x {

    public p f1013a;

    public u f1014b;

    public final void a(w wVar, o oVar) throws NoWhenBranchMatchedException {
        p pVarA = oVar.a();
        p pVar = this.f1013a;
        kotlin.jvm.internal.m.e(pVar, "state1");
        if (pVarA.compareTo(pVar) < 0) {
            pVar = pVarA;
        }
        this.f1013a = pVar;
        this.f1014b.a(wVar, oVar);
        this.f1013a = pVarA;
    }
}
