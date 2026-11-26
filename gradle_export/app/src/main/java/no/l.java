package no;

import d40.p1;
import g00.b0;
import h00.d0;
import h00.r;
import ho.p;
import i7.z;
import java.util.LinkedHashMap;
import java.util.List;

public final class l implements d40.j {
    public final int A;
    public final n B;

    public l(n nVar, int i) {
        this.A = i;
        this.B = nVar;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        Object value;
        p pVar;
        switch (this.A) {
            case 0:
                this.B.v = (ho.c) obj;
                break;
            case 1:
                List list = (List) obj;
                int iP = d0.P(r.q0(list, 10));
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (Object obj2 : list) {
                    ho.d dVar = (ho.d) obj2;
                    linkedHashMap.put(new g00.k(new Integer(dVar.a), dVar.b), obj2);
                }
                n nVar = this.B;
                nVar.w = linkedHashMap;
                n.c(nVar);
                break;
            case 2:
                ((Boolean) obj).booleanValue();
                n.c(this.B);
                break;
            case 3:
                if (((ru.a) obj) != ru.a.B) {
                    n nVar2 = this.B;
                    z zVar = nVar2.b.b;
                    if (zVar != null) {
                        d dVar2 = nVar2.m;
                        long currentPosition = zVar.getCurrentPosition();
                        if (currentPosition < 0) {
                            currentPosition = 0;
                        }
                        dVar2.getClass();
                        dVar2.a(ho.l.STOP, currentPosition);
                    }
                    nVar2.u(ru.d.OFF);
                    nVar2.y = null;
                    nVar2.z = false;
                }
                break;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    n nVar3 = this.B;
                    o oVar = nVar3.y;
                    if (oVar != null) {
                        nVar3.x(oVar.a, oVar.b, oVar.c, false);
                    } else if (nVar3.z) {
                        nVar3.r();
                    }
                    nVar3.z = false;
                }
                break;
            default:
                ((Boolean) obj).getClass();
                n nVar4 = this.B;
                nVar4.f();
                if (nVar4.s != null) {
                    nVar4.n();
                } else {
                    p1 p1Var = nVar4.r;
                    do {
                        value = p1Var.getValue();
                        pVar = (p) value;
                    } while (!p1Var.i(value, p.a(pVar, null, null, false, 0L, 0L, 0.0f, null, pVar.b != null && nVar4.h(pVar.d), 127)));
                }
                break;
        }
        return b0.a;
    }
}
