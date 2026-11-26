package p1;

import java.util.ArrayList;

public final class u extends k20.d {

    public static final u f12295d = new u(1, 0, 2);

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        o1.b bVar;
        int iC;
        int iC2 = kVar.c(0);
        if (kVar2.f11501n != 0) {
            l1.l.a("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            l1.l.a("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i10 = kVar2.f11507t;
        int i11 = kVar2.f11509v;
        int i12 = kVar2.f11508u;
        int i13 = i10;
        while (iC2 > 0) {
            i13 += kVar2.f11491b[(kVar2.r(i13) * 5) + 3];
            if (i13 > i12) {
                l1.l.a("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i14 = kVar2.f11491b[(kVar2.r(i13) * 5) + 3];
        int iG = kVar2.g(kVar2.f11491b, kVar2.r(kVar2.f11507t));
        int iG2 = kVar2.g(kVar2.f11491b, kVar2.r(i13));
        int i15 = i13 + i14;
        int iG3 = kVar2.g(kVar2.f11491b, kVar2.r(i15));
        int i16 = iG3 - iG2;
        kVar2.x(i16, Math.max(kVar2.f11507t - 1, 0));
        kVar2.w(i14);
        int[] iArr = kVar2.f11491b;
        int iR = kVar2.r(i15) * 5;
        h00.n.p0(kVar2.r(i10) * 5, iR, (i14 * 5) + iR, iArr, iArr);
        if (i16 > 0) {
            Object[] objArr = kVar2.f11492c;
            int iH = kVar2.h(iG2 + i16);
            System.arraycopy(objArr, iH, objArr, iG, kVar2.h(iG3 + i16) - iH);
        }
        int i17 = iG2 + i16;
        int i18 = i17 - iG;
        int i19 = kVar2.f11500k;
        int i20 = kVar2.l;
        int length = kVar2.f11492c.length;
        int i21 = kVar2.m;
        int i22 = i10 + i14;
        int i23 = i10;
        while (i23 < i22) {
            int iR2 = kVar2.r(i23);
            int i24 = i18;
            int[] iArr2 = iArr;
            iArr2[(iR2 * 5) + 4] = o1.k.i(o1.k.i(kVar2.g(iArr, iR2) - i24, i21 < iR2 ? 0 : i19, i20, length), kVar2.f11500k, kVar2.l, kVar2.f11492c.length);
            i23++;
            i18 = i24;
            iArr = iArr2;
            i19 = i19;
        }
        int i25 = i15 + i14;
        int iP = kVar2.p();
        int iA = o1.j.a(kVar2.f11493d, i15, iP);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < kVar2.f11493d.size() && (iC = kVar2.c((bVar = (o1.b) kVar2.f11493d.get(iA)))) >= i15 && iC < i25) {
                arrayList.add(bVar);
            }
        }
        int i26 = i10 - i15;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            o1.b bVar2 = (o1.b) arrayList.get(i27);
            int iC3 = kVar2.c(bVar2) + i26;
            if (iC3 >= kVar2.f11496g) {
                bVar2.f11470a = -(iP - iC3);
            } else {
                bVar2.f11470a = iC3;
            }
            kVar2.f11493d.add(o1.j.a(kVar2.f11493d, iC3, iP), bVar2);
        }
        if (kVar2.K(i15, i14)) {
            l1.l.a("Unexpectedly removed anchors");
        }
        kVar2.m(i11, kVar2.f11508u, i10);
        if (i16 > 0) {
            kVar2.L(i17, i16, i15 - 1);
        }
    }
}
