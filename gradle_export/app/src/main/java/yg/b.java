package yg;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import dh.y;
import s10.w0;
import xf.n;

public final class b {

    public final g f16868a;

    public final k f16869b;

    public b(g gVar, k kVar) {
        this.f16868a = gVar;
        this.f16869b = kVar;
    }

    public final Task a(l lVar) {
        if (!TextUtils.isEmpty(null)) {
            try {
                return Tasks.d(new j(this.f16869b, lVar.f16886a, Long.parseLong(null)));
            } catch (NumberFormatException e3) {
                return Tasks.c(e3);
            }
        }
        long j9 = lVar.f16886a;
        Object[] objArr = {Long.valueOf(j9)};
        g gVar = this.f16868a;
        gVar.f16875a.b("warmUpIntegrityToken(%s)", objArr);
        xf.g gVar2 = new xf.g();
        c cVar = new c(gVar, gVar2, j9, gVar2);
        dh.c cVar2 = gVar.f16879e;
        cVar2.getClass();
        cVar2.a().post(new y(cVar2, gVar2, gVar2, cVar));
        w0 w0Var = new w0(this, lVar, 17);
        n nVar = gVar2.f16565a;
        nVar.getClass();
        jb.a aVar = xf.h.f16566a;
        n nVar2 = new n();
        nVar.f16569b.m(new xf.l(aVar, w0Var, nVar2));
        nVar.v();
        return nVar2;
    }
}
