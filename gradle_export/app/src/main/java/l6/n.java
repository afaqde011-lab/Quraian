package l6;

import androidx.glance.session.SessionWorker;
import ri.t1;

public final class n implements h {

    public final Class f10039a;

    public final jk.c f10040b;

    public final w f10041c;

    public final j40.c f10042d;

    public final m f10043e;

    public n() {
        jk.c cVar = new jk.c(19);
        this.f10039a = SessionWorker.class;
        this.f10040b = cVar;
        this.f10041c = b0.f10036a;
        this.f10042d = j40.d.a();
        this.f10043e = new m(this);
    }

    public static Object a(n nVar, u00.n nVar2, m00.c cVar) {
        i iVar;
        j40.a aVar;
        j40.a aVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.F = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(nVar, cVar);
            }
        } else {
            iVar = new i(nVar, cVar);
        }
        Object obj = iVar.D;
        l00.a aVar3 = l00.a.A;
        int i11 = iVar.F;
        try {
            if (i11 == 0) {
                t1.O(obj);
                aVar = nVar.f10042d;
                iVar.A = nVar;
                iVar.B = (m00.i) nVar2;
                iVar.C = aVar;
                iVar.F = 1;
                if (aVar.l(iVar) != aVar3) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (j40.a) iVar.A;
                try {
                    t1.O(obj);
                    aVar2.i((Object) null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2.i((Object) null);
                    throw th;
                }
            }
            j40.a aVar4 = iVar.C;
            nVar2 = (u00.n) iVar.B;
            n nVar3 = (n) iVar.A;
            t1.O(obj);
            aVar = aVar4;
            nVar = nVar3;
            m mVar = nVar.f10043e;
            iVar.A = aVar;
            iVar.B = null;
            iVar.C = null;
            iVar.F = 2;
            Object objInvoke = nVar2.invoke(mVar, iVar);
            if (objInvoke != aVar3) {
                j40.a aVar5 = aVar;
                obj = objInvoke;
                aVar2 = aVar5;
                aVar2.i((Object) null);
                return obj;
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.i((Object) null);
            throw th;
        }
    }
}
