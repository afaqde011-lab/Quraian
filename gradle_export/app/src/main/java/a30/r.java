package a30;

import e7.l0;
import java.util.ArrayList;
import java.util.List;

public final class r implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final int D;

    public r(Object obj, Object obj2, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.C = obj2;
        this.D = i;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                u uVar = (u) this.B;
                o20.b bVar = (o20.b) this.C;
                k kVar = uVar.a;
                x xVarA = uVar.a((j10.k) kVar.c);
                List listN1 = xVarA != null ? h00.q.n1(((i) kVar.a).e.f(xVarA, bVar, this.D)) : null;
                return listN1 == null ? h00.x.A : listN1;
            case 1:
                u uVar2 = (u) this.B;
                o20.b bVar2 = (o20.b) this.C;
                k kVar2 = uVar2.a;
                x xVarA2 = uVar2.a((j10.k) kVar2.c);
                List listJ = xVarA2 != null ? ((i) kVar2.a).e.j(xVarA2, bVar2, this.D) : null;
                return listJ == null ? h00.x.A : listJ;
            default:
                l0 l0Var = (l0) this.B;
                f20.b bVar3 = (f20.b) ((ArrayList) this.C).get(this.D);
                boolean z = bVar3.c == null;
                x10.a aVar = (x10.a) l0Var.e;
                boolean z2 = aVar == x10.a.TYPE_PARAMETER_BOUNDS;
                if (!z && !z2) {
                    aVar = x10.a.TYPE_USE;
                }
                x10.s sVar = bVar3.b;
                if (sVar != null) {
                    return (x10.m) sVar.a.get(aVar);
                }
                return null;
        }
    }
}
