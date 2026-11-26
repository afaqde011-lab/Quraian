package androidx.media3.common;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.UUID;

public final class h0 {

    public boolean f1219a;

    public boolean f1220b;

    public boolean f1221c;

    public Object f1222d;

    public Object f1223e;

    public Object f1224f;

    public Serializable f1225g;

    public Cloneable f1226h;

    public h0() {
        this.f1224f = fh.i2.G;
        this.f1220b = true;
        fh.r0 r0Var = fh.t0.B;
        this.f1225g = fh.d2.E;
    }

    public h0(ia.g gVar, g1.l0 l0Var) {
        this.f1222d = gVar;
        this.f1223e = l0Var;
        this.f1224f = new gj.e(19);
        this.f1225g = new LinkedHashMap();
        this.f1221c = true;
    }

    public h0(UUID uuid) {
        this();
        this.f1222d = uuid;
    }

    public void a() {
        ia.g gVar = (ia.g) this.f1222d;
        if (gVar.getLifecycle().b() != androidx.lifecycle.p.B) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f1219a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((g1.l0) this.f1223e).invoke();
        gVar.getLifecycle().a(new androidx.lifecycle.l(this, 6));
        this.f1219a = true;
    }
}
