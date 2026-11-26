package ta;

import android.view.ViewGroup;

public final class d extends u {

    public boolean f14432a = false;

    public final ViewGroup f14433b;

    public d(ViewGroup viewGroup) {
        this.f14433b = viewGroup;
    }

    @Override
    public final void a() {
        this.f14433b.suppressLayout(false);
    }

    @Override
    public final void b(t tVar) {
        this.f14433b.suppressLayout(false);
        this.f14432a = true;
    }

    @Override
    public final void d(t tVar) {
        if (!this.f14432a) {
            this.f14433b.suppressLayout(false);
        }
        tVar.D(this);
    }

    @Override
    public final void e() {
        this.f14433b.suppressLayout(true);
    }
}
