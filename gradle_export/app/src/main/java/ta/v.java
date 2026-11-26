package ta;

import java.util.ArrayList;

public final class v extends u {

    public final u.e f14497a;

    public final w f14498b;

    public v(w wVar, u.e eVar) {
        this.f14498b = wVar;
        this.f14497a = eVar;
    }

    @Override
    public final void d(t tVar) {
        ((ArrayList) this.f14497a.get(this.f14498b.B)).remove(tVar);
        tVar.D(this);
    }
}
