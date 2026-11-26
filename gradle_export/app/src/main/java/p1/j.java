package p1;

public final class j extends k20.d {

    public static final j f12273d = new j(0, 2, 1);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        int i10;
        v1.e eVar = (v1.e) kVar.d(0);
        int iC = kVar2.c((o1.b) kVar.d(1));
        if (kVar2.f11507t >= iC) {
            l1.l.a("Check failed");
        }
        k00.f.N(kVar2, aVar, iC);
        int i11 = kVar2.f11507t;
        int iG = kVar2.f11509v;
        while (iG >= 0 && !kVar2.y(iG)) {
            iG = kVar2.G(kVar2.f11491b, iG);
        }
        int iU = iG + 1;
        int iN = 0;
        while (iU < i11) {
            if (kVar2.v(i11, iU)) {
                if (kVar2.y(iU)) {
                    iN = 0;
                }
                iU++;
            } else {
                iN += kVar2.y(iU) ? 1 : kVar2.F(iU);
                iU += kVar2.u(iU);
            }
        }
        while (true) {
            i10 = kVar2.f11507t;
            if (i10 >= iC) {
                break;
            }
            if (kVar2.v(iC, i10)) {
                int i12 = kVar2.f11507t;
                if (i12 < kVar2.f11508u && (kVar2.f11491b[(kVar2.r(i12) * 5) + 1] & 1073741824) != 0) {
                    aVar.e(kVar2.E(kVar2.f11507t));
                    iN = 0;
                }
                kVar2.R();
            } else {
                iN += kVar2.N();
            }
        }
        if (i10 != iC) {
            l1.l.a("Check failed");
        }
        eVar.f15334a = iN;
    }
}
