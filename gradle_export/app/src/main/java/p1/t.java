package p1;

public final class t extends k20.d {

    public static final t f12294d = new t(0, 3, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        h1.l lVar;
        o1.h hVar = (o1.h) kVar.d(1);
        o1.b bVar = (o1.b) kVar.d(0);
        c cVar = (c) kVar.d(2);
        o1.k kVarK = hVar.k();
        if (k0Var != null) {
            try {
                lVar = new h1.l(k0Var, kVar2, false);
            } catch (Throwable th2) {
                kVarK.e(false);
                throw th2;
            }
        } else {
            lVar = null;
        }
        if (!cVar.f12259b.l0()) {
            l1.l.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar.f12258a.k0(aVar, kVarK, iVar, lVar);
        kVarK.e(true);
        kVar2.d();
        bVar.getClass();
        kVar2.A(hVar, hVar.a(bVar));
        kVar2.k();
    }
}
