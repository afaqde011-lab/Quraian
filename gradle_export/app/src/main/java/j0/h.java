package j0;

public final class h extends l0.q {

    public final c50.h f7754c = new c50.h(13, (byte) 0);

    public u.v f7755d;

    public h(u00.k kVar) {
        kVar.invoke(this);
    }

    public static void q(h hVar, Object obj, u00.o oVar, int i10) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        hVar.p(obj, null, oVar);
    }

    public static void s(h hVar, int i10, e6.c cVar, v1.c cVar2, int i11) {
        if ((i11 & 2) != 0) {
            cVar = null;
        }
        hVar.r(i10, cVar, p.A, cVar2);
    }

    @Override
    public final c50.h k() {
        return this.f7754c;
    }

    public final void p(Object obj, String str, u00.o oVar) {
        this.f7754c.a(1, new e(obj != null ? new hv.b(obj, 2) : null, new hv.b(str, 2), new v1.c(new g(oVar, 0), -857469575, true)));
    }

    public final void r(int i10, u00.k kVar, u00.k kVar2, v1.c cVar) {
        this.f7754c.a(i10, new e(kVar, kVar2, cVar));
    }
}
