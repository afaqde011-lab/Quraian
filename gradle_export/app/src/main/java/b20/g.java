package b20;

import j10.r0;
import java.util.ArrayList;

public final class g implements u00.a {
    public final int A;
    public final i B;

    public g(i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                i iVar = this.B;
                if (u20.d.f(iVar) == null) {
                    return null;
                }
                ((a20.b) iVar.G.B).w.getClass();
                return null;
            case 1:
                i iVar2 = this.B;
                p10.o oVar = iVar2.H;
                ArrayList<p10.c0> typeParameters = oVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(h00.r.q0(typeParameters, 10));
                for (p10.c0 c0Var : typeParameters) {
                    r0 r0VarA = ((a20.h) iVar2.J.C).a(c0Var);
                    if (r0VarA == null) {
                        throw new AssertionError("Parameter " + c0Var + " surely belongs to class " + oVar + ", so it must be resolved");
                    }
                    arrayList.add(r0VarA);
                }
                return arrayList;
            default:
                return j10.w.c(this.B);
        }
    }
}
