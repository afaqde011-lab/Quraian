package nb;

import a40.c0;
import b3.j0;
import ri.t1;

public final class d implements h {

    public final o f11200a;

    public final wb.l f11201b;

    public final j40.e f11202c;

    public final k f11203d;

    public d(o oVar, wb.l lVar, j40.i iVar, k kVar) {
        this.f11200a = oVar;
        this.f11201b = lVar;
        this.f11202c = iVar;
        this.f11203d = kVar;
    }

    @Override
    public final Object a(k00.c cVar) throws Throwable {
        c cVar2;
        j40.e eVar;
        Throwable th2;
        j40.e eVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.E = i10 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, (m00.c) cVar);
            }
        } else {
            cVar2 = new c(this, (m00.c) cVar);
        }
        Object obj = cVar2.C;
        l00.a aVar = l00.a.A;
        int i11 = cVar2.E;
        try {
            if (i11 == 0) {
                t1.O(obj);
                cVar2.A = this;
                eVar = this.f11202c;
                cVar2.B = eVar;
                cVar2.E = 1;
                if (((j40.h) eVar).b(cVar2) != aVar) {
                }
                return aVar;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar2 = (j40.e) cVar2.A;
                try {
                    t1.O(obj);
                    f fVar = (f) obj;
                    ((j40.h) eVar2).d();
                    return fVar;
                } catch (Throwable th3) {
                    th2 = th3;
                    ((j40.h) eVar2).d();
                    throw th2;
                }
            }
            j40.e eVar3 = cVar2.B;
            d dVar = (d) cVar2.A;
            t1.O(obj);
            eVar = eVar3;
            this = dVar;
            j0 j0Var = new j0(this, 19);
            cVar2.A = eVar;
            cVar2.B = null;
            cVar2.E = 2;
            Object objJ = c0.J(new a1.c0(j0Var, (k00.c) null), k00.j.A, cVar2);
            if (objJ != aVar) {
                j40.e eVar4 = eVar;
                obj = objJ;
                eVar2 = eVar4;
                f fVar2 = (f) obj;
                ((j40.h) eVar2).d();
                return fVar2;
            }
            return aVar;
        } catch (Throwable th4) {
            j40.e eVar5 = eVar;
            th2 = th4;
            eVar2 = eVar5;
            ((j40.h) eVar2).d();
            throw th2;
        }
    }
}
