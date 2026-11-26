package xf;

import com.google.android.gms.common.internal.d0;
import wb.o;

public final class g {

    public final n f16565a = new n();

    public g() {
    }

    public g(o oVar) {
        wi.b bVar = new wi.b(this, 8);
        oVar.getClass();
        ((n) oVar.A).f(h.f16566a, new o(oVar, bVar));
    }

    public final void a(Exception exc) {
        this.f16565a.s(exc);
    }

    public final void b(Object obj) {
        this.f16565a.q(obj);
    }

    public final boolean c(Exception exc) {
        n nVar = this.f16565a;
        nVar.getClass();
        d0.i(exc, "Exception must not be null");
        synchronized (nVar.f16568a) {
            try {
                if (nVar.f16570c) {
                    return false;
                }
                nVar.f16570c = true;
                nVar.f16573f = exc;
                nVar.f16569b.o(nVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Object obj) {
        this.f16565a.r(obj);
    }
}
