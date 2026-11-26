package k0;

public final class i extends l0.q {

    public static final jk.c f8469f = new jk.c(4);

    public final c50.f f8470c = new c50.f(this);

    public final c50.h f8471d = new c50.h(13, (byte) 0);

    public boolean f8472e;

    public i(u00.k kVar) {
        kVar.invoke(this);
    }

    public static void p(i iVar, String str, u00.k kVar, v1.c cVar, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            kVar = null;
        }
        iVar.f8471d.a(1, new h(str != null ? new hv.b(str, 2) : null, kVar != null ? new bs.e(5, kVar) : f8469f, new hx.t(19), new v1.c(new j0.g(cVar, 1), -291643851, true)));
        if (kVar != null) {
            iVar.f8472e = true;
        }
    }

    @Override
    public final c50.h k() {
        return this.f8471d;
    }

    public final void q(int i10, u00.k kVar, u00.k kVar2, v1.c cVar) {
        this.f8471d.a(i10, new h(kVar, f8469f, kVar2, cVar));
    }
}
