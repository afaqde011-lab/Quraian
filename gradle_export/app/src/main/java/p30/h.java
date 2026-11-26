package p30;

import a10.a0;
import a10.z;
import e30.p0;
import e30.w;
import g00.b0;
import h00.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class h implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public h(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final Object invoke() {
        z zVarI;
        z zVar;
        int i = this.A;
        Object obj = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                i iVar = (i) obj2;
                u00.a aVar = (u00.a) obj;
                List listE0 = iVar.B.e0();
                if (listE0.isEmpty()) {
                    return x.A;
                }
                ArrayList arrayList = new ArrayList(h00.r.q0(listE0, 10));
                int i2 = 0;
                int i3 = 0;
                for (Object obj3 : listE0) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        va.a.k0();
                        throw null;
                    }
                    p0 p0Var = (p0) obj3;
                    d10.f fVar = aVar == null ? null : new d10.f(new g(iVar, 1), i3, i2);
                    if (p0Var.c()) {
                        zVarI = z.c;
                    } else {
                        w wVarB = p0Var.b();
                        kotlin.jvm.internal.m.d(wVarB, "getType(...)");
                        i iVar2 = new i(wVarB, fVar);
                        int iOrdinal = p0Var.a().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                z zVar2 = z.c;
                                zVar = new z(a0.B, iVar2);
                            } else {
                                if (iOrdinal != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z zVar3 = z.c;
                                zVar = new z(a0.C, iVar2);
                            }
                            zVarI = zVar;
                        } else {
                            z zVar4 = z.c;
                            zVarI = a.a.I(iVar2);
                        }
                    }
                    arrayList.add(zVarI);
                    i3 = i4;
                }
                return arrayList;
            case 1:
                ((u00.k) obj2).invoke(new qt.e((ot.o) obj));
                return b0.a;
            case 2:
                e60.a aVar2 = t50.a.c().c.d;
                a10.d dVarB = kotlin.jvm.internal.a0.a.b(x40.w.class);
                aVar2.getClass();
                return aVar2.f(dVarB, null, (b60.b) obj);
            default:
                e30.a0 a0VarN = ((a20.b) ((oj.q) obj2).B).o.d().j(((y10.b) obj).a).n();
                kotlin.jvm.internal.m.d(a0VarN, "getDefaultType(...)");
                return a0VarN;
        }
    }
}
