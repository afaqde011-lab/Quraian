package g4;

import ca.p;
import com.google.android.gms.cast.Cast;
import h4.m;
import h4.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class f extends e {
    public b[] A0;
    public b[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final h4.b K0;

    public ArrayList f6162p0 = new ArrayList();

    public final a1.i f6163q0 = new a1.i(this);

    public final p f6164r0;

    public int f6165s0;

    public j4.f f6166t0;

    public boolean f6167u0;

    public final e4.c f6168v0;

    public int f6169w0;

    public int f6170x0;

    public int f6171y0;

    public int f6172z0;

    public f() {
        p pVar = new p();
        pVar.f3065b = true;
        pVar.f3066c = true;
        pVar.f3069f = new ArrayList();
        new ArrayList();
        pVar.f3070g = null;
        pVar.f3071h = new h4.b();
        pVar.f3072i = new ArrayList();
        pVar.f3067d = this;
        pVar.f3068e = this;
        this.f6164r0 = pVar;
        this.f6166t0 = null;
        this.f6167u0 = false;
        this.f6168v0 = new e4.c();
        this.f6171y0 = 0;
        this.f6172z0 = 0;
        this.A0 = new b[4];
        this.B0 = new b[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new h4.b();
    }

    public static void Q(e eVar, j4.f fVar, h4.b bVar) {
        int i10;
        int i11;
        if (fVar == null) {
            return;
        }
        int i12 = eVar.f6134f0;
        int[] iArr = eVar.f6154s;
        if (i12 == 8 || (eVar instanceof i) || (eVar instanceof a)) {
            bVar.f6569e = 0;
            bVar.f6570f = 0;
            return;
        }
        int[] iArr2 = eVar.f6150o0;
        bVar.f6565a = iArr2[0];
        bVar.f6566b = iArr2[1];
        bVar.f6567c = eVar.n();
        bVar.f6568d = eVar.k();
        bVar.f6573i = false;
        bVar.f6574j = 0;
        boolean z10 = bVar.f6565a == 3;
        boolean z11 = bVar.f6566b == 3;
        boolean z12 = z10 && eVar.V > 0.0f;
        boolean z13 = z11 && eVar.V > 0.0f;
        if (z10 && eVar.q(0) && eVar.f6152q == 0 && !z12) {
            bVar.f6565a = 2;
            if (z11 && eVar.f6153r == 0) {
                bVar.f6565a = 1;
            }
            z10 = false;
        }
        if (z11 && eVar.q(1) && eVar.f6153r == 0 && !z13) {
            bVar.f6566b = 2;
            if (z10 && eVar.f6152q == 0) {
                bVar.f6566b = 1;
            }
            z11 = false;
        }
        if (eVar.x()) {
            bVar.f6565a = 1;
            z10 = false;
        }
        if (eVar.y()) {
            bVar.f6566b = 1;
            z11 = false;
        }
        if (z12) {
            if (iArr[0] == 4) {
                bVar.f6565a = 1;
            } else if (!z11) {
                if (bVar.f6566b == 1) {
                    i11 = bVar.f6568d;
                } else {
                    bVar.f6565a = 2;
                    fVar.b(eVar, bVar);
                    i11 = bVar.f6570f;
                }
                bVar.f6565a = 1;
                bVar.f6567c = (int) (eVar.V * i11);
            }
        }
        if (z13) {
            if (iArr[1] == 4) {
                bVar.f6566b = 1;
            } else if (!z10) {
                if (bVar.f6565a == 1) {
                    i10 = bVar.f6567c;
                } else {
                    bVar.f6566b = 2;
                    fVar.b(eVar, bVar);
                    i10 = bVar.f6569e;
                }
                bVar.f6566b = 1;
                if (eVar.W == -1) {
                    bVar.f6568d = (int) (i10 / eVar.V);
                } else {
                    bVar.f6568d = (int) (eVar.V * i10);
                }
            }
        }
        fVar.b(eVar, bVar);
        eVar.J(bVar.f6569e);
        eVar.G(bVar.f6570f);
        eVar.D = bVar.f6572h;
        eVar.D(bVar.f6571g);
        bVar.f6574j = 0;
    }

    @Override
    public final void C(a1.i iVar) {
        super.C(iVar);
        int size = this.f6162p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f6162p0.get(i10)).C(iVar);
        }
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        super.K(z10, z11);
        int size = this.f6162p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f6162p0.get(i10)).K(z10, z11);
        }
    }

    public final void M(e eVar, int i10) {
        if (i10 == 0) {
            int i11 = this.f6171y0 + 1;
            b[] bVarArr = this.B0;
            if (i11 >= bVarArr.length) {
                this.B0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            b[] bVarArr2 = this.B0;
            int i12 = this.f6171y0;
            bVarArr2[i12] = new b(eVar, 0, this.f6167u0);
            this.f6171y0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f6172z0 + 1;
            b[] bVarArr3 = this.A0;
            if (i13 >= bVarArr3.length) {
                this.A0 = (b[]) Arrays.copyOf(bVarArr3, bVarArr3.length * 2);
            }
            b[] bVarArr4 = this.A0;
            int i14 = this.f6172z0;
            bVarArr4[i14] = new b(eVar, 1, this.f6167u0);
            this.f6172z0 = i14 + 1;
        }
    }

    public final void N(e4.c cVar) {
        f fVar;
        e4.c cVar2;
        boolean zR = R(64);
        b(cVar, zR);
        int size = this.f6162p0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) this.f6162p0.get(i10);
            boolean[] zArr = eVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = (e) this.f6162p0.get(i11);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i12 = 0; i12 < aVar.f6206q0; i12++) {
                        e eVar3 = aVar.f6205p0[i12];
                        if (aVar.f6096s0 || eVar3.c()) {
                            int i13 = aVar.f6095r0;
                            if (i13 == 0 || i13 == 1) {
                                eVar3.R[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                eVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            e eVar4 = (e) this.f6162p0.get(i14);
            eVar4.getClass();
            boolean z11 = eVar4 instanceof h;
            if (z11 || (eVar4 instanceof i)) {
                if (z11) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.b(cVar, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                h hVar = (h) ((e) it.next());
                for (int i15 = 0; i15 < hVar.f6206q0; i15++) {
                    if (hashSet.contains(hVar.f6205p0[i15])) {
                        hVar.b(cVar, zR);
                        hashSet.remove(hVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).b(cVar, zR);
                }
                hashSet.clear();
            }
        }
        if (e4.c.f5066p) {
            HashSet<e> hashSet2 = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                e eVar5 = (e) this.f6162p0.get(i16);
                eVar5.getClass();
                if (!(eVar5 instanceof h) && !(eVar5 instanceof i)) {
                    hashSet2.add(eVar5);
                }
            }
            fVar = this;
            cVar2 = cVar;
            fVar.a(this, cVar2, hashSet2, this.f6150o0[0] == 2 ? 0 : 1, false);
            for (e eVar6 : hashSet2) {
                k.b(fVar, cVar2, eVar6);
                eVar6.b(cVar2, zR);
            }
        } else {
            fVar = this;
            cVar2 = cVar;
            for (int i17 = 0; i17 < size; i17++) {
                e eVar7 = (e) fVar.f6162p0.get(i17);
                if (eVar7 instanceof f) {
                    int[] iArr = eVar7.f6150o0;
                    int i18 = iArr[0];
                    int i19 = iArr[1];
                    if (i18 == 2) {
                        eVar7.H(1);
                    }
                    if (i19 == 2) {
                        eVar7.I(1);
                    }
                    eVar7.b(cVar2, zR);
                    if (i18 == 2) {
                        eVar7.H(i18);
                    }
                    if (i19 == 2) {
                        eVar7.I(i19);
                    }
                } else {
                    k.b(fVar, cVar2, eVar7);
                    if (!(eVar7 instanceof h) && !(eVar7 instanceof i)) {
                        eVar7.b(cVar2, zR);
                    }
                }
            }
        }
        if (fVar.f6171y0 > 0) {
            k.a(fVar, cVar2, null, 0);
        }
        if (fVar.f6172z0 > 0) {
            k.a(fVar, cVar2, null, 1);
        }
    }

    public final boolean O(int i10, boolean z10) {
        boolean z11;
        p pVar = this.f6164r0;
        ArrayList<n> arrayList = (ArrayList) pVar.f3069f;
        f fVar = (f) pVar.f3067d;
        boolean z12 = false;
        int iJ = fVar.j(0);
        int[] iArr = fVar.f6150o0;
        int iJ2 = fVar.j(1);
        int iO = fVar.o();
        int iP = fVar.p();
        if (z10 && (iJ == 2 || iJ2 == 2)) {
            for (n nVar : arrayList) {
                if (nVar.f6603f == i10 && !nVar.k()) {
                    z10 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z10 && iJ == 2) {
                    fVar.H(1);
                    fVar.J(pVar.e(fVar, 0));
                    fVar.f6129d.f6602e.d(fVar.n());
                }
            } else if (z10 && iJ2 == 2) {
                fVar.I(1);
                fVar.G(pVar.e(fVar, 1));
                fVar.f6131e.f6602e.d(fVar.k());
            }
        }
        if (i10 == 0) {
            int i11 = iArr[0];
            if (i11 == 1 || i11 == 4) {
                int iN = fVar.n() + iO;
                fVar.f6129d.f6606i.d(iN);
                fVar.f6129d.f6602e.d(iN - iO);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            int i12 = iArr[1];
            if (i12 == 1 || i12 == 4) {
                int iK = fVar.k() + iP;
                fVar.f6131e.f6606i.d(iK);
                fVar.f6131e.f6602e.d(iK - iP);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        pVar.i();
        for (n nVar2 : arrayList) {
            if (nVar2.f6603f == i10 && (nVar2.f6599b != fVar || nVar2.f6604g)) {
                nVar2.e();
            }
        }
        for (n nVar3 : arrayList) {
            if (nVar3.f6603f == i10 && (z11 || nVar3.f6599b != fVar)) {
                if (!nVar3.f6605h.f6585j || !nVar3.f6606i.f6585j || (!(nVar3 instanceof h4.c) && !nVar3.f6602e.f6585j)) {
                    fVar.H(iJ);
                    fVar.I(iJ2);
                    return z12;
                }
            }
        }
        z12 = true;
        fVar.H(iJ);
        fVar.I(iJ2);
        return z12;
    }

    public final void P() {
        ?? r22;
        d dVar;
        int i10;
        boolean z10;
        boolean z11;
        char c10;
        boolean z12;
        int i11;
        boolean zR;
        ?? r13;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        boolean z15;
        boolean[] zArr;
        boolean[] zArr2;
        int i14;
        boolean z16;
        int iMax;
        ?? r7;
        ?? r18;
        boolean z17;
        int iMax2;
        ?? r14;
        boolean z18;
        boolean z19;
        ?? r15;
        ?? r16;
        int i15;
        boolean z20;
        boolean z21;
        boolean z22;
        ?? r17;
        int i16;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zR2;
        int size;
        int i17;
        boolean z23;
        e eVar;
        boolean z24;
        int i18;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        d dVar2;
        e eVar2;
        m mVar;
        m mVar2;
        int iB;
        int i19;
        m mVar3;
        m mVar4;
        boolean z25;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i20;
        boolean z26;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size2 = this.f6162p0.size();
        int iMax7 = Math.max(0, n());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.f6150o0;
        int i21 = iArr[1];
        int i22 = iArr[0];
        int i23 = this.f6165s0;
        d dVar3 = this.I;
        d dVar4 = this.H;
        if (i23 == 0 && k.c(this.C0, 1)) {
            j4.f fVar = this.f6166t0;
            int i24 = iArr[0];
            int i25 = iArr[1];
            B();
            ArrayList arrayList3 = this.f6162p0;
            int size3 = arrayList3.size();
            for (int i26 = 0; i26 < size3; i26++) {
                ((e) arrayList3.get(i26)).B();
            }
            boolean z27 = this.f6167u0;
            if (i24 == 1) {
                E(0, n());
            } else {
                dVar4.l(0);
                this.X = 0;
            }
            int i27 = 0;
            boolean z28 = false;
            boolean z29 = false;
            while (i27 < size3) {
                int[] iArr2 = iArr;
                e eVar3 = (e) arrayList3.get(i27);
                int i28 = i27;
                if (eVar3 instanceof i) {
                    i iVar = (i) eVar3;
                    z26 = z28;
                    if (iVar.f6203t0 == 1) {
                        int i29 = iVar.f6200q0;
                        if (i29 != -1) {
                            iVar.M(i29);
                        } else if (iVar.f6201r0 != -1 && x()) {
                            iVar.M(n() - iVar.f6201r0);
                        } else if (x()) {
                            iVar.M((int) ((iVar.f6199p0 * n()) + 0.5f));
                        }
                        z26 = true;
                    }
                } else {
                    z26 = z28;
                    if ((eVar3 instanceof a) && ((a) eVar3).P() == 0) {
                        z28 = z26;
                        z29 = true;
                    }
                    i27 = i28 + 1;
                    iArr = iArr2;
                }
                z28 = z26;
                i27 = i28 + 1;
                iArr = iArr2;
            }
            r22 = iArr;
            if (z28) {
                for (int i30 = 0; i30 < size3; i30 = i20 + 1) {
                    e eVar4 = (e) arrayList3.get(i30);
                    if (eVar4 instanceof i) {
                        i iVar2 = (i) eVar4;
                        i20 = i30;
                        if (iVar2.f6203t0 == 1) {
                            h4.g.c(0, iVar2, fVar, z27);
                        }
                    } else {
                        i20 = i30;
                    }
                }
            }
            h4.g.c(0, this, fVar, z27);
            if (z29) {
                for (int i31 = 0; i31 < size3; i31++) {
                    e eVar5 = (e) arrayList3.get(i31);
                    if (eVar5 instanceof a) {
                        a aVar = (a) eVar5;
                        if (aVar.P() == 0 && aVar.O()) {
                            h4.g.c(1, aVar, fVar, z27);
                        }
                    }
                }
            }
            if (i25 == 1) {
                F(0, k());
            } else {
                dVar3.l(0);
                this.Y = 0;
            }
            int i32 = 0;
            boolean z30 = false;
            boolean z31 = false;
            while (i32 < size3) {
                e eVar6 = (e) arrayList3.get(i32);
                int i33 = i32;
                if (eVar6 instanceof i) {
                    i iVar3 = (i) eVar6;
                    if (iVar3.f6203t0 == 0) {
                        int i34 = iVar3.f6200q0;
                        if (i34 != -1) {
                            iVar3.M(i34);
                        } else if (iVar3.f6201r0 != -1 && y()) {
                            iVar3.M(k() - iVar3.f6201r0);
                        } else if (y()) {
                            iVar3.M((int) ((iVar3.f6199p0 * k()) + 0.5f));
                        }
                        z30 = true;
                    }
                } else if ((eVar6 instanceof a) && ((a) eVar6).P() == 1) {
                    z31 = true;
                }
                i32 = i33 + 1;
            }
            if (z30) {
                for (int i35 = 0; i35 < size3; i35++) {
                    e eVar7 = (e) arrayList3.get(i35);
                    if (eVar7 instanceof i) {
                        i iVar4 = (i) eVar7;
                        if (iVar4.f6203t0 == 0) {
                            h4.g.i(1, iVar4, fVar);
                        }
                    }
                }
            }
            h4.g.i(0, this, fVar);
            if (z31) {
                for (int i36 = 0; i36 < size3; i36++) {
                    e eVar8 = (e) arrayList3.get(i36);
                    if (eVar8 instanceof a) {
                        a aVar2 = (a) eVar8;
                        if (aVar2.P() == 1 && aVar2.O()) {
                            h4.g.i(1, aVar2, fVar);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size3; i37++) {
                e eVar9 = (e) arrayList3.get(i37);
                if (eVar9.w() && h4.g.a(eVar9)) {
                    Q(eVar9, fVar, h4.g.f6587a);
                    if (!(eVar9 instanceof i)) {
                        h4.g.c(0, eVar9, fVar, z27);
                        h4.g.i(0, eVar9, fVar);
                    } else if (((i) eVar9).f6203t0 == 0) {
                        h4.g.i(0, eVar9, fVar);
                    } else {
                        h4.g.c(0, eVar9, fVar, z27);
                    }
                }
            }
            for (int i38 = 0; i38 < size2; i38++) {
                e eVar10 = (e) this.f6162p0.get(i38);
                if (eVar10.w() && !(eVar10 instanceof i) && !(eVar10 instanceof a) && !(eVar10 instanceof h) && !eVar10.E) {
                    int iJ = eVar10.j(0);
                    int iJ2 = eVar10.j(1);
                    if (iJ != 3 || eVar10.f6152q == 1 || iJ2 != 3 || eVar10.f6153r == 1) {
                        Q(eVar10, this.f6166t0, new h4.b());
                    }
                }
            }
        } else {
            r22 = iArr;
        }
        e4.c cVar = this.f6168v0;
        if (size2 > 2 && ((i22 == 2 || i21 == 2) && k.c(this.C0, 1024))) {
            j4.f fVar2 = this.f6166t0;
            ArrayList arrayList4 = this.f6162p0;
            int size4 = arrayList4.size();
            int i39 = 0;
            while (true) {
                if (i39 >= size4) {
                    dVar = dVar4;
                    int i40 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i40 < size4) {
                        int i41 = i40;
                        e eVar11 = (e) arrayList4.get(i40);
                        ArrayList arrayList11 = arrayList5;
                        ?? r10 = r22[0];
                        ArrayList arrayList12 = arrayList6;
                        ?? r11 = r22[1];
                        ArrayList arrayList13 = arrayList7;
                        int[] iArr3 = eVar11.f6150o0;
                        ArrayList arrayList14 = arrayList8;
                        if (!h4.g.h(r10, r11, iArr3[0], iArr3[1])) {
                            Q(eVar11, fVar2, this.K0);
                        }
                        boolean z32 = eVar11 instanceof i;
                        if (z32) {
                            i iVar5 = (i) eVar11;
                            if (iVar5.f6203t0 == 0) {
                                arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList7.add(iVar5);
                            } else {
                                arrayList7 = arrayList13;
                            }
                            z25 = z32;
                            if (iVar5.f6203t0 == 1) {
                                arrayList = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList.add(iVar5);
                            } else {
                                arrayList = arrayList11;
                            }
                        } else {
                            z25 = z32;
                            arrayList = arrayList11;
                            arrayList7 = arrayList13;
                        }
                        if (eVar11 instanceof j) {
                            if (eVar11 instanceof a) {
                                a aVar3 = (a) eVar11;
                                if (aVar3.P() == 0) {
                                    arrayList2 = arrayList12 == null ? new ArrayList() : arrayList12;
                                    arrayList2.add(aVar3);
                                } else {
                                    arrayList2 = arrayList12;
                                }
                                if (aVar3.P() == 1) {
                                    ArrayList arrayList15 = arrayList14 == null ? new ArrayList() : arrayList14;
                                    arrayList15.add(aVar3);
                                    arrayList14 = arrayList15;
                                }
                                arrayList6 = arrayList2;
                            } else {
                                arrayList = arrayList;
                                fVar2 = fVar2;
                                j jVar = (j) eVar11;
                                arrayList6 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList6.add(jVar);
                                arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                                arrayList8.add(jVar);
                            }
                            if (eVar11.H.f6119f == null && eVar11.J.f6119f == null && !z25 && !(eVar11 instanceof a)) {
                                if (arrayList9 == null) {
                                    arrayList9 = new ArrayList();
                                }
                                ArrayList arrayList16 = arrayList9;
                                arrayList16.add(eVar11);
                                arrayList9 = arrayList16;
                            }
                            if (eVar11.I.f6119f != null && eVar11.K.f6119f == null && eVar11.L.f6119f == null && !z25 && !(eVar11 instanceof a)) {
                                if (arrayList10 == null) {
                                    arrayList10 = new ArrayList();
                                }
                                ArrayList arrayList17 = arrayList10;
                                arrayList17.add(eVar11);
                                arrayList10 = arrayList17;
                            }
                            i40 = i41 + 1;
                            arrayList5 = arrayList;
                            fVar2 = fVar2;
                        } else {
                            arrayList6 = arrayList12;
                        }
                        arrayList8 = arrayList14;
                        if (eVar11.H.f6119f == null) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList18 = arrayList9;
                            arrayList18.add(eVar11);
                            arrayList9 = arrayList18;
                        }
                        if (eVar11.I.f6119f != null) {
                        }
                        i40 = i41 + 1;
                        arrayList5 = arrayList;
                        fVar2 = fVar2;
                    }
                    ArrayList arrayList19 = arrayList5;
                    ArrayList<j> arrayList20 = arrayList6;
                    ArrayList arrayList21 = arrayList7;
                    ArrayList<j> arrayList22 = arrayList8;
                    ArrayList<m> arrayList23 = new ArrayList();
                    if (arrayList19 != null) {
                        Iterator it = arrayList19.iterator();
                        while (it.hasNext()) {
                            h4.g.b((i) it.next(), 0, arrayList23, null);
                        }
                    }
                    m mVar5 = null;
                    int i42 = 0;
                    if (arrayList20 != null) {
                        for (j jVar2 : arrayList20) {
                            m mVarB = h4.g.b(jVar2, i42, arrayList23, mVar5);
                            jVar2.M(i42, mVarB, arrayList23);
                            mVarB.a(arrayList23);
                            mVar5 = null;
                            i42 = 0;
                        }
                    }
                    HashSet hashSet = i(2).f6114a;
                    if (hashSet != null) {
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            h4.g.b(((d) it2.next()).f6117d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet2 = i(4).f6114a;
                    if (hashSet2 != null) {
                        Iterator it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            h4.g.b(((d) it3.next()).f6117d, 0, arrayList23, null);
                        }
                    }
                    HashSet hashSet3 = i(7).f6114a;
                    if (hashSet3 != null) {
                        Iterator it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            h4.g.b(((d) it4.next()).f6117d, 0, arrayList23, null);
                        }
                    }
                    m mVar6 = null;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        while (it5.hasNext()) {
                            h4.g.b((e) it5.next(), 0, arrayList23, null);
                        }
                    }
                    if (arrayList21 != null) {
                        Iterator it6 = arrayList21.iterator();
                        while (it6.hasNext()) {
                            h4.g.b((i) it6.next(), 1, arrayList23, null);
                        }
                    }
                    int i43 = 1;
                    if (arrayList22 != null) {
                        for (j jVar3 : arrayList22) {
                            m mVarB2 = h4.g.b(jVar3, i43, arrayList23, mVar6);
                            jVar3.M(i43, mVarB2, arrayList23);
                            mVarB2.a(arrayList23);
                            mVar6 = null;
                            i43 = 1;
                        }
                    }
                    HashSet hashSet4 = i(3).f6114a;
                    if (hashSet4 != null) {
                        Iterator it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            h4.g.b(((d) it7.next()).f6117d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet5 = i(6).f6114a;
                    if (hashSet5 != null) {
                        Iterator it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            h4.g.b(((d) it8.next()).f6117d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet6 = i(5).f6114a;
                    if (hashSet6 != null) {
                        Iterator it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            h4.g.b(((d) it9.next()).f6117d, 1, arrayList23, null);
                        }
                    }
                    HashSet hashSet7 = i(7).f6114a;
                    if (hashSet7 != null) {
                        Iterator it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            h4.g.b(((d) it10.next()).f6117d, 1, arrayList23, null);
                        }
                    }
                    boolean z33 = true;
                    if (arrayList10 != null) {
                        Iterator it11 = arrayList10.iterator();
                        while (it11.hasNext()) {
                            h4.g.b((e) it11.next(), 1, arrayList23, null);
                        }
                    }
                    int i44 = 0;
                    while (i44 < size4) {
                        e eVar12 = (e) arrayList4.get(i44);
                        int[] iArr4 = eVar12.f6150o0;
                        boolean z34 = z33;
                        if (iArr4[0] == 3 && iArr4[z34 ? 1 : 0] == 3) {
                            int i45 = eVar12.f6146m0;
                            int size5 = arrayList23.size();
                            int i46 = 0;
                            while (true) {
                                if (i46 >= size5) {
                                    i19 = i44;
                                    mVar3 = null;
                                    break;
                                }
                                i19 = i44;
                                mVar3 = (m) arrayList23.get(i46);
                                int i47 = size5;
                                if (i45 == mVar3.f6594b) {
                                    break;
                                }
                                i46++;
                                size5 = i47;
                                i44 = i19;
                            }
                            int i48 = eVar12.f6148n0;
                            int size6 = arrayList23.size();
                            int i49 = 0;
                            while (true) {
                                if (i49 >= size6) {
                                    mVar4 = null;
                                    break;
                                }
                                mVar4 = (m) arrayList23.get(i49);
                                int i50 = size6;
                                if (i48 == mVar4.f6594b) {
                                    break;
                                }
                                i49++;
                                size6 = i50;
                            }
                            if (mVar3 != null && mVar4 != null) {
                                mVar3.c(0, mVar4);
                                mVar4.f6595c = 2;
                                arrayList23.remove(mVar3);
                            }
                        } else {
                            i19 = i44;
                        }
                        i44 = i19 + 1;
                        z33 = true;
                    }
                    if (arrayList23.size() <= 1) {
                        break;
                    }
                    int i51 = 0;
                    if (r22[0] == 2) {
                        int i52 = 0;
                        mVar = null;
                        for (m mVar7 : arrayList23) {
                            if (mVar7.f6595c != 1) {
                                int iB2 = mVar7.b(cVar, i51);
                                if (iB2 > i52) {
                                    mVar = mVar7;
                                    i52 = iB2;
                                }
                                i51 = 0;
                            }
                        }
                        if (mVar != null) {
                            H(1);
                            J(i52);
                        } else {
                            mVar = null;
                        }
                    } else {
                        mVar = null;
                    }
                    if (r22[1] == 2) {
                        int i53 = 0;
                        mVar2 = null;
                        for (m mVar8 : arrayList23) {
                            if (mVar8.f6595c != 0 && (iB = mVar8.b(cVar, 1)) > i53) {
                                mVar2 = mVar8;
                                i53 = iB;
                            }
                        }
                        if (mVar2 != null) {
                            I(1);
                            G(i53);
                        } else {
                            mVar2 = null;
                        }
                    } else {
                        mVar2 = null;
                    }
                    if (mVar != null || mVar2 != null) {
                        if (i22 == 2) {
                            if (iMax7 >= n() || iMax7 <= 0) {
                                iMax7 = n();
                            } else {
                                J(iMax7);
                                this.D0 = true;
                            }
                        }
                        if (i21 == 2) {
                            if (iMax8 >= k() || iMax8 <= 0) {
                                iMax8 = k();
                            } else {
                                G(iMax8);
                                this.E0 = true;
                            }
                        }
                        i10 = iMax7;
                        z10 = true;
                        break;
                    }
                } else {
                    e eVar13 = (e) arrayList4.get(i39);
                    ?? r12 = r22[0];
                    ?? r19 = r22[1];
                    int i54 = i39;
                    int[] iArr5 = eVar13.f6150o0;
                    dVar = dVar4;
                    if (h4.g.h(r12, r19, iArr5[0], iArr5[1]) && !(eVar13 instanceof h)) {
                        i39 = i54 + 1;
                        dVar4 = dVar;
                    }
                }
            }
            if (!R(64) || R(Cast.MAX_NAMESPACE_LENGTH)) {
                z11 = true;
            } else {
                z11 = false;
            }
            cVar.getClass();
            cVar.f5074g = false;
            if (this.C0 == 0 && z11) {
                c10 = 1;
                cVar.f5074g = true;
            } else {
                c10 = 1;
            }
            ArrayList arrayList24 = this.f6162p0;
            if (r22[0] != 2 || r22[c10] == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f6171y0 = 0;
            this.f6172z0 = 0;
            for (i11 = 0; i11 < size2; i11++) {
                eVar2 = (e) this.f6162p0.get(i11);
                if (eVar2 instanceof f) {
                    ((f) eVar2).P();
                }
            }
            zR = R(64);
            r13 = z10;
            i12 = 0;
            z13 = true;
            while (z13) {
                i13 = i12 + 1;
                try {
                    cVar.t();
                    this.f6171y0 = 0;
                    this.f6172z0 = 0;
                    g(cVar);
                    for (i18 = 0; i18 < size2; i18++) {
                        ((e) this.f6162p0.get(i18)).g(cVar);
                    }
                    N(cVar);
                    try {
                        weakReference = this.F0;
                        if (weakReference != null || weakReference.get() == null) {
                            z14 = z12;
                        } else {
                            z14 = z12;
                            try {
                                cVar.f(cVar.k((d) this.F0.get()), cVar.k(dVar3), 0, 5);
                                this.F0 = null;
                            } catch (Exception e3) {
                                e = e3;
                                z24 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z15 = z24;
                                zArr = k.f6207a;
                                if (z15) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar, zR2);
                                    size = this.f6162p0.size();
                                    i17 = 0;
                                    z23 = false;
                                    while (i17 < size) {
                                        eVar = (e) this.f6162p0.get(i17);
                                        eVar.L(cVar, zR2);
                                        boolean[] zArr3 = zArr;
                                        boolean z35 = zR2;
                                        if (eVar.f6137h == -1) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        i17++;
                                        zArr = zArr3;
                                        zR2 = z35;
                                        z23 = z23;
                                    }
                                    zArr2 = zArr;
                                    z16 = z23;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar, zR);
                                    for (i14 = 0; i14 < size2; i14++) {
                                        ((e) this.f6162p0.get(i14)).L(cVar, zR);
                                    }
                                    z16 = false;
                                }
                                if (z14) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    for (i16 = 0; i16 < size2; i16++) {
                                        e eVar14 = (e) this.f6162p0.get(i16);
                                        iMax3 = Math.max(iMax3, eVar14.n() + eVar14.X);
                                        iMax4 = Math.max(iMax4, eVar14.k() + eVar14.Y);
                                    }
                                    iMax5 = Math.max(this.f6124a0, iMax3);
                                    iMax6 = Math.max(this.f6126b0, iMax4);
                                    r13 = r13;
                                    z16 = z16;
                                    if (i22 == 2) {
                                        r13 = r13;
                                        z16 = z16;
                                        if (n() < iMax5) {
                                            J(iMax5);
                                            r22[0] = 2;
                                            r13 = 1;
                                            z16 = true;
                                        }
                                    }
                                    if (i21 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z16 = true;
                                    }
                                }
                                iMax = Math.max(this.f6124a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r7 = 1;
                                    r22[0] = 1;
                                    z17 = true;
                                    r18 = 1;
                                } else {
                                    r7 = 1;
                                    r18 = r13;
                                    z17 = z16;
                                }
                                iMax2 = Math.max(this.f6126b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r7] = r7;
                                    ?? r110 = r7;
                                    z18 = r110 == true ? 1 : 0;
                                    r14 = r110;
                                } else {
                                    r14 = r18;
                                    z18 = z17;
                                }
                                if (r14 == 0) {
                                    r17 = r14;
                                    r17 = r14;
                                    z22 = z18;
                                    z22 = z18;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z22 = z18;
                                        if (n() > i10) {
                                            this.D0 = r7;
                                            r22[0] = r7;
                                            J(i10);
                                            ?? r111 = r7;
                                            z22 = r111 == true ? 1 : 0;
                                            r17 = r111;
                                        }
                                    }
                                    r15 = r17;
                                    r15 = r17;
                                    z19 = z22;
                                    z19 = z22;
                                    if (r22[r7] != 2) {
                                    }
                                    if (i13 > i15) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    i12 = i13;
                                    z12 = z14;
                                    dVar3 = dVar3;
                                    r13 = r16;
                                    z13 = z21;
                                } else {
                                    r15 = r14;
                                    z19 = z18;
                                }
                                r16 = r15;
                                i15 = 8;
                                z20 = z19;
                                if (i13 > i15) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                i12 = i13;
                                z12 = z14;
                                dVar3 = dVar3;
                                r13 = r16;
                                z13 = z21;
                            }
                        }
                        weakReference2 = this.H0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            cVar.f(cVar.k(this.K), cVar.k((d) this.H0.get()), 0, 5);
                            this.H0 = null;
                        }
                        weakReference3 = this.G0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            dVar2 = dVar;
                            try {
                                dVar = dVar2;
                                cVar.f(cVar.k((d) this.G0.get()), cVar.k(dVar2), 0, 5);
                                this.G0 = null;
                            } catch (Exception e10) {
                                e = e10;
                                dVar = dVar2;
                                z24 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                z15 = z24;
                                zArr = k.f6207a;
                                if (z15) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(cVar, zR2);
                                    size = this.f6162p0.size();
                                    i17 = 0;
                                    z23 = false;
                                    while (i17 < size) {
                                        eVar = (e) this.f6162p0.get(i17);
                                        eVar.L(cVar, zR2);
                                        boolean[] zArr4 = zArr;
                                        boolean z36 = zR2;
                                        if (eVar.f6137h == -1) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        i17++;
                                        zArr = zArr4;
                                        zR2 = z36;
                                        z23 = z23;
                                    }
                                    zArr2 = zArr;
                                    z16 = z23;
                                } else {
                                    zArr2 = zArr;
                                    L(cVar, zR);
                                    while (i14 < size2) {
                                        ((e) this.f6162p0.get(i14)).L(cVar, zR);
                                    }
                                    z16 = false;
                                }
                                if (z14) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i16 < size2) {
                                        e eVar15 = (e) this.f6162p0.get(i16);
                                        iMax3 = Math.max(iMax3, eVar15.n() + eVar15.X);
                                        iMax4 = Math.max(iMax4, eVar15.k() + eVar15.Y);
                                    }
                                    iMax5 = Math.max(this.f6124a0, iMax3);
                                    iMax6 = Math.max(this.f6126b0, iMax4);
                                    r13 = r13;
                                    z16 = z16;
                                    if (i22 == 2) {
                                        r13 = r13;
                                        z16 = z16;
                                        if (n() < iMax5) {
                                            J(iMax5);
                                            r22[0] = 2;
                                            r13 = 1;
                                            z16 = true;
                                        }
                                    }
                                    if (i21 == 2) {
                                        G(iMax6);
                                        r22[1] = 2;
                                        r13 = 1;
                                        z16 = true;
                                    }
                                }
                                iMax = Math.max(this.f6124a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r7 = 1;
                                    r22[0] = 1;
                                    z17 = true;
                                    r18 = 1;
                                } else {
                                    r7 = 1;
                                    r18 = r13;
                                    z17 = z16;
                                }
                                iMax2 = Math.max(this.f6126b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r22[r7] = r7;
                                    ?? r112 = r7;
                                    z18 = r112 == true ? 1 : 0;
                                    r14 = r112;
                                } else {
                                    r14 = r18;
                                    z18 = z17;
                                }
                                if (r14 == 0) {
                                    r17 = r14;
                                    r17 = r14;
                                    z22 = z18;
                                    z22 = z18;
                                    if (r22[0] == 2) {
                                        r17 = r14;
                                        z22 = z18;
                                        if (n() > i10) {
                                            this.D0 = r7;
                                            r22[0] = r7;
                                            J(i10);
                                            ?? r113 = r7;
                                            z22 = r113 == true ? 1 : 0;
                                            r17 = r113;
                                        }
                                    }
                                    r15 = r17;
                                    r15 = r17;
                                    z19 = z22;
                                    z19 = z22;
                                    if (r22[r7] != 2) {
                                    }
                                    if (i13 > i15) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    i12 = i13;
                                    z12 = z14;
                                    dVar3 = dVar3;
                                    r13 = r16;
                                    z13 = z21;
                                } else {
                                    r15 = r14;
                                    z19 = z18;
                                }
                                r16 = r15;
                                i15 = 8;
                                z20 = z19;
                                if (i13 > i15) {
                                    z21 = false;
                                } else {
                                    z21 = z20;
                                }
                                i12 = i13;
                                z12 = z14;
                                dVar3 = dVar3;
                                r13 = r16;
                                z13 = z21;
                            }
                        }
                        weakReference4 = this.I0;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            try {
                                try {
                                    cVar.f(cVar.k(this.J), cVar.k((d) this.I0.get()), 0, 5);
                                    try {
                                        this.I0 = null;
                                    } catch (Exception e11) {
                                        e = e11;
                                        z24 = true;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        z15 = z24;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    z24 = true;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    z15 = z24;
                                    zArr = k.f6207a;
                                    if (z15) {
                                        zArr[2] = false;
                                        zR2 = R(64);
                                        L(cVar, zR2);
                                        size = this.f6162p0.size();
                                        i17 = 0;
                                        z23 = false;
                                        while (i17 < size) {
                                            eVar = (e) this.f6162p0.get(i17);
                                            eVar.L(cVar, zR2);
                                            boolean[] zArr5 = zArr;
                                            boolean z37 = zR2;
                                            if (eVar.f6137h == -1) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            i17++;
                                            zArr = zArr5;
                                            zR2 = z37;
                                            z23 = z23;
                                        }
                                        zArr2 = zArr;
                                        z16 = z23;
                                    } else {
                                        zArr2 = zArr;
                                        L(cVar, zR);
                                        while (i14 < size2) {
                                            ((e) this.f6162p0.get(i14)).L(cVar, zR);
                                        }
                                        z16 = false;
                                    }
                                    if (z14) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        while (i16 < size2) {
                                            e eVar16 = (e) this.f6162p0.get(i16);
                                            iMax3 = Math.max(iMax3, eVar16.n() + eVar16.X);
                                            iMax4 = Math.max(iMax4, eVar16.k() + eVar16.Y);
                                        }
                                        iMax5 = Math.max(this.f6124a0, iMax3);
                                        iMax6 = Math.max(this.f6126b0, iMax4);
                                        r13 = r13;
                                        z16 = z16;
                                        if (i22 == 2) {
                                            r13 = r13;
                                            z16 = z16;
                                            if (n() < iMax5) {
                                                J(iMax5);
                                                r22[0] = 2;
                                                r13 = 1;
                                                z16 = true;
                                            }
                                        }
                                        if (i21 == 2) {
                                            G(iMax6);
                                            r22[1] = 2;
                                            r13 = 1;
                                            z16 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f6124a0, n());
                                    if (iMax > n()) {
                                        J(iMax);
                                        r7 = 1;
                                        r22[0] = 1;
                                        z17 = true;
                                        r18 = 1;
                                    } else {
                                        r7 = 1;
                                        r18 = r13;
                                        z17 = z16;
                                    }
                                    iMax2 = Math.max(this.f6126b0, k());
                                    if (iMax2 > k()) {
                                        G(iMax2);
                                        r22[r7] = r7;
                                        ?? r114 = r7;
                                        z18 = r114 == true ? 1 : 0;
                                        r14 = r114;
                                    } else {
                                        r14 = r18;
                                        z18 = z17;
                                    }
                                    if (r14 == 0) {
                                        r17 = r14;
                                        r17 = r14;
                                        z22 = z18;
                                        z22 = z18;
                                        if (r22[0] == 2) {
                                            r17 = r14;
                                            z22 = z18;
                                            if (n() > i10) {
                                                this.D0 = r7;
                                                r22[0] = r7;
                                                J(i10);
                                                ?? r115 = r7;
                                                z22 = r115 == true ? 1 : 0;
                                                r17 = r115;
                                            }
                                        }
                                        r15 = r17;
                                        r15 = r17;
                                        z19 = z22;
                                        z19 = z22;
                                        if (r22[r7] != 2) {
                                        }
                                        if (i13 > i15) {
                                            z21 = false;
                                        } else {
                                            z21 = z20;
                                        }
                                        i12 = i13;
                                        z12 = z14;
                                        dVar3 = dVar3;
                                        r13 = r16;
                                        z13 = z21;
                                    } else {
                                        r15 = r14;
                                        z19 = z18;
                                    }
                                    r16 = r15;
                                    i15 = 8;
                                    z20 = z19;
                                    if (i13 > i15) {
                                        z21 = false;
                                    } else {
                                        z21 = z20;
                                    }
                                    i12 = i13;
                                    z12 = z14;
                                    dVar3 = dVar3;
                                    r13 = r16;
                                    z13 = z21;
                                }
                            } catch (Exception e13) {
                                e = e13;
                            }
                        }
                        cVar.p();
                        z15 = true;
                    } catch (Exception e14) {
                        e = e14;
                        z14 = z12;
                    }
                } catch (Exception e15) {
                    e = e15;
                    z14 = z12;
                    z24 = z13;
                }
                zArr = k.f6207a;
                if (z15) {
                    zArr[2] = false;
                    zR2 = R(64);
                    L(cVar, zR2);
                    size = this.f6162p0.size();
                    i17 = 0;
                    z23 = false;
                    while (i17 < size) {
                        eVar = (e) this.f6162p0.get(i17);
                        eVar.L(cVar, zR2);
                        boolean[] zArr6 = zArr;
                        boolean z38 = zR2;
                        if (eVar.f6137h == -1 || eVar.f6139i != -1) {
                            z23 = true;
                        }
                        i17++;
                        zArr = zArr6;
                        zR2 = z38;
                        z23 = z23;
                    }
                    zArr2 = zArr;
                    z16 = z23;
                } else {
                    zArr2 = zArr;
                    L(cVar, zR);
                    while (i14 < size2) {
                        ((e) this.f6162p0.get(i14)).L(cVar, zR);
                    }
                    z16 = false;
                }
                if (z14 && i13 < 8 && zArr2[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i16 < size2) {
                        e eVar17 = (e) this.f6162p0.get(i16);
                        iMax3 = Math.max(iMax3, eVar17.n() + eVar17.X);
                        iMax4 = Math.max(iMax4, eVar17.k() + eVar17.Y);
                    }
                    iMax5 = Math.max(this.f6124a0, iMax3);
                    iMax6 = Math.max(this.f6126b0, iMax4);
                    r13 = r13;
                    z16 = z16;
                    if (i22 == 2) {
                        r13 = r13;
                        z16 = z16;
                        if (n() < iMax5) {
                            J(iMax5);
                            r22[0] = 2;
                            r13 = 1;
                            z16 = true;
                        }
                    }
                    if (i21 == 2 && k() < iMax6) {
                        G(iMax6);
                        r22[1] = 2;
                        r13 = 1;
                        z16 = true;
                    }
                }
                iMax = Math.max(this.f6124a0, n());
                if (iMax > n()) {
                    J(iMax);
                    r7 = 1;
                    r22[0] = 1;
                    z17 = true;
                    r18 = 1;
                } else {
                    r7 = 1;
                    r18 = r13;
                    z17 = z16;
                }
                iMax2 = Math.max(this.f6126b0, k());
                if (iMax2 > k()) {
                    G(iMax2);
                    r22[r7] = r7;
                    ?? r116 = r7;
                    z18 = r116 == true ? 1 : 0;
                    r14 = r116;
                } else {
                    r14 = r18;
                    z18 = z17;
                }
                if (r14 == 0) {
                    r17 = r14;
                    r17 = r14;
                    z22 = z18;
                    z22 = z18;
                    if (r22[0] == 2 && i10 > 0) {
                        r17 = r14;
                        z22 = z18;
                        if (n() > i10) {
                            this.D0 = r7;
                            r22[0] = r7;
                            J(i10);
                            ?? r117 = r7;
                            z22 = r117 == true ? 1 : 0;
                            r17 = r117;
                        }
                    }
                    r15 = r17;
                    r15 = r17;
                    z19 = z22;
                    z19 = z22;
                    if (r22[r7] != 2 && iMax8 > 0) {
                        r15 = r17;
                        z19 = z22;
                        if (k() > iMax8) {
                            this.E0 = r7;
                            r22[r7] = r7;
                            G(iMax8);
                            i15 = 8;
                            r16 = 1;
                            z20 = true;
                        }
                    }
                    if (i13 > i15) {
                        z21 = false;
                    } else {
                        z21 = z20;
                    }
                    i12 = i13;
                    z12 = z14;
                    dVar3 = dVar3;
                    r13 = r16;
                    z13 = z21;
                } else {
                    r15 = r14;
                    z19 = z18;
                }
                r16 = r15;
                i15 = 8;
                z20 = z19;
                if (i13 > i15) {
                    z21 = false;
                } else {
                    z21 = z20;
                }
                i12 = i13;
                z12 = z14;
                dVar3 = dVar3;
                r13 = r16;
                z13 = z21;
            }
            this.f6162p0 = arrayList24;
            if (r13 != 0) {
                r22[0] = i22;
                r22[1] = i21;
            }
            C(cVar.l);
        }
        dVar = dVar4;
        i10 = iMax7;
        z10 = false;
        if (R(64)) {
            z11 = true;
        } else {
            z11 = true;
        }
        cVar.getClass();
        cVar.f5074g = false;
        if (this.C0 == 0) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        ArrayList arrayList25 = this.f6162p0;
        if (r22[0] != 2) {
            z12 = true;
        } else {
            z12 = true;
        }
        this.f6171y0 = 0;
        this.f6172z0 = 0;
        while (i11 < size2) {
            eVar2 = (e) this.f6162p0.get(i11);
            if (eVar2 instanceof f) {
                ((f) eVar2).P();
            }
        }
        zR = R(64);
        r13 = z10;
        i12 = 0;
        z13 = true;
        while (z13) {
            i13 = i12 + 1;
            cVar.t();
            this.f6171y0 = 0;
            this.f6172z0 = 0;
            g(cVar);
            while (i18 < size2) {
                ((e) this.f6162p0.get(i18)).g(cVar);
            }
            N(cVar);
            weakReference = this.F0;
            if (weakReference != null) {
                z14 = z12;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar.f(cVar.k(this.K), cVar.k((d) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    cVar.f(cVar.k((d) this.G0.get()), cVar.k(dVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar.p();
                z15 = true;
            } else {
                z14 = z12;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    cVar.f(cVar.k(this.K), cVar.k((d) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    dVar2 = dVar;
                    dVar = dVar2;
                    cVar.f(cVar.k((d) this.G0.get()), cVar.k(dVar2), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                cVar.p();
                z15 = true;
            }
            zArr = k.f6207a;
            if (z15) {
                zArr[2] = false;
                zR2 = R(64);
                L(cVar, zR2);
                size = this.f6162p0.size();
                i17 = 0;
                z23 = false;
                while (i17 < size) {
                    eVar = (e) this.f6162p0.get(i17);
                    eVar.L(cVar, zR2);
                    boolean[] zArr7 = zArr;
                    boolean z39 = zR2;
                    if (eVar.f6137h == -1) {
                        z23 = true;
                    } else {
                        z23 = true;
                    }
                    i17++;
                    zArr = zArr7;
                    zR2 = z39;
                    z23 = z23;
                }
                zArr2 = zArr;
                z16 = z23;
            } else {
                zArr2 = zArr;
                L(cVar, zR);
                while (i14 < size2) {
                    ((e) this.f6162p0.get(i14)).L(cVar, zR);
                }
                z16 = false;
            }
            if (z14) {
                iMax3 = 0;
                iMax4 = 0;
                while (i16 < size2) {
                    e eVar18 = (e) this.f6162p0.get(i16);
                    iMax3 = Math.max(iMax3, eVar18.n() + eVar18.X);
                    iMax4 = Math.max(iMax4, eVar18.k() + eVar18.Y);
                }
                iMax5 = Math.max(this.f6124a0, iMax3);
                iMax6 = Math.max(this.f6126b0, iMax4);
                r13 = r13;
                z16 = z16;
                if (i22 == 2) {
                    r13 = r13;
                    z16 = z16;
                    if (n() < iMax5) {
                        J(iMax5);
                        r22[0] = 2;
                        r13 = 1;
                        z16 = true;
                    }
                }
                if (i21 == 2) {
                    G(iMax6);
                    r22[1] = 2;
                    r13 = 1;
                    z16 = true;
                }
            }
            iMax = Math.max(this.f6124a0, n());
            if (iMax > n()) {
                J(iMax);
                r7 = 1;
                r22[0] = 1;
                z17 = true;
                r18 = 1;
            } else {
                r7 = 1;
                r18 = r13;
                z17 = z16;
            }
            iMax2 = Math.max(this.f6126b0, k());
            if (iMax2 > k()) {
                G(iMax2);
                r22[r7] = r7;
                ?? r118 = r7;
                z18 = r118 == true ? 1 : 0;
                r14 = r118;
            } else {
                r14 = r18;
                z18 = z17;
            }
            if (r14 == 0) {
                r17 = r14;
                r17 = r14;
                z22 = z18;
                z22 = z18;
                if (r22[0] == 2) {
                    r17 = r14;
                    z22 = z18;
                    if (n() > i10) {
                        this.D0 = r7;
                        r22[0] = r7;
                        J(i10);
                        ?? r119 = r7;
                        z22 = r119 == true ? 1 : 0;
                        r17 = r119;
                    }
                }
                r15 = r17;
                r15 = r17;
                z19 = z22;
                z19 = z22;
                if (r22[r7] != 2) {
                }
                if (i13 > i15) {
                    z21 = false;
                } else {
                    z21 = z20;
                }
                i12 = i13;
                z12 = z14;
                dVar3 = dVar3;
                r13 = r16;
                z13 = z21;
            } else {
                r15 = r14;
                z19 = z18;
            }
            r16 = r15;
            i15 = 8;
            z20 = z19;
            if (i13 > i15) {
                z21 = false;
            } else {
                z21 = z20;
            }
            i12 = i13;
            z12 = z14;
            dVar3 = dVar3;
            r13 = r16;
            z13 = z21;
        }
        this.f6162p0 = arrayList25;
        if (r13 != 0) {
            r22[0] = i22;
            r22[1] = i21;
        }
        C(cVar.l);
    }

    public final boolean R(int i10) {
        return (this.C0 & i10) == i10;
    }

    @Override
    public final void z() {
        this.f6168v0.t();
        this.f6169w0 = 0;
        this.f6170x0 = 0;
        this.f6162p0.clear();
        super.z();
    }
}
