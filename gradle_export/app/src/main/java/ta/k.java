package ta;

import java.util.ArrayList;

public final class k extends u {

    public final Object f14464a;

    public final ArrayList f14465b;

    public final Object f14466c;

    public final ArrayList f14467d;

    public final m f14468e;

    public k(m mVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f14468e = mVar;
        this.f14464a = obj;
        this.f14465b = arrayList;
        this.f14466c = obj2;
        this.f14467d = arrayList2;
    }

    @Override
    public final void c(t tVar) {
        m mVar = this.f14468e;
        Object obj = this.f14464a;
        if (obj != null) {
            mVar.z(obj, this.f14465b, null);
        }
        Object obj2 = this.f14466c;
        if (obj2 != null) {
            mVar.z(obj2, this.f14467d, null);
        }
    }

    @Override
    public final void d(t tVar) {
        tVar.D(this);
    }
}
