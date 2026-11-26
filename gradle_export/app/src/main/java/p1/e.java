package p1;

import l1.z1;

public final class e extends k20.d {

    public static final e f12263d = new e(0, 2, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        o1.b bVar = (o1.b) kVar.d(0);
        Object objD = kVar.d(1);
        if (objD instanceof z1) {
            iVar.h((z1) objD);
        }
        if (kVar2.f11501n != 0) {
            l1.l.a("Can only append a slot if not current inserting");
        }
        int i10 = kVar2.f11498i;
        int i11 = kVar2.f11499j;
        int iC = kVar2.c(bVar);
        int iG = kVar2.g(kVar2.f11491b, kVar2.r(iC + 1));
        kVar2.f11498i = iG;
        kVar2.f11499j = iG;
        kVar2.x(1, iC);
        if (i10 >= iG) {
            i10++;
            i11++;
        }
        kVar2.f11492c[iG] = objD;
        kVar2.f11498i = i10;
        kVar2.f11499j = i11;
    }
}
