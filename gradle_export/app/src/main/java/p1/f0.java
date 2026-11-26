package p1;

import l1.r1;
import l1.z1;

public final class f0 extends k20.d {

    public static final f0 f12266d = new f0(1, 0, 2);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        int iC = kVar.c(0);
        int i10 = kVar2.f11509v;
        int iP = kVar2.P(kVar2.f11491b, kVar2.r(i10));
        int iG = kVar2.g(kVar2.f11491b, kVar2.r(i10 + 1));
        for (int iMax = Math.max(iP, iG - iC); iMax < iG; iMax++) {
            Object obj = kVar2.f11492c[kVar2.h(iMax)];
            if (obj instanceof z1) {
                iVar.e((z1) obj);
            } else if (obj instanceof r1) {
                ((r1) obj).d();
            }
        }
        if (iC <= 0) {
            l1.l.a("Check failed");
        }
        int i11 = kVar2.f11509v;
        int iP2 = kVar2.P(kVar2.f11491b, kVar2.r(i11));
        int iG2 = kVar2.g(kVar2.f11491b, kVar2.r(i11 + 1)) - iC;
        if (iG2 < iP2) {
            l1.l.a("Check failed");
        }
        kVar2.L(iG2, iC, i11);
        int i12 = kVar2.f11498i;
        if (i12 >= iP2) {
            kVar2.f11498i = i12 - iC;
        }
    }
}
