package d4;

import com.google.android.gms.internal.play_billing.j1;

public final class h {

    public Object f4609a;

    public k f4610b;

    public m f4611c;

    public boolean f4612d;

    public final void a(Object obj) {
        this.f4612d = true;
        k kVar = this.f4610b;
        if (kVar == null || !kVar.B.k(obj)) {
            return;
        }
        this.f4609a = null;
        this.f4610b = null;
        this.f4611c = null;
    }

    public final void b() {
        this.f4612d = true;
        k kVar = this.f4610b;
        if (kVar == null || !kVar.B.cancel(true)) {
            return;
        }
        this.f4609a = null;
        this.f4610b = null;
        this.f4611c = null;
    }

    public final void c(Throwable th2) {
        this.f4612d = true;
        k kVar = this.f4610b;
        if (kVar == null || !kVar.B.l(th2)) {
            return;
        }
        this.f4609a = null;
        this.f4610b = null;
        this.f4611c = null;
    }

    public final void finalize() {
        m mVar;
        k kVar = this.f4610b;
        if (kVar != null) {
            j jVar = kVar.B;
            if (!jVar.isDone()) {
                jVar.l(new j1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f4609a, 3));
            }
        }
        if (this.f4612d || (mVar = this.f4611c) == null) {
            return;
        }
        mVar.k(null);
    }
}
