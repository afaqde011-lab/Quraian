package o1;

import a1.c1;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import h00.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import l1.j0;
import l1.n1;
import l1.z1;
import u.d0;
import u.v;
import u.w;
import u.x;

public final class k {

    public final h f11490a;

    public int[] f11491b;

    public Object[] f11492c;

    public ArrayList f11493d;

    public HashMap f11494e;

    public w f11495f;

    public int f11496g;

    public int f11497h;

    public int f11498i;

    public int f11499j;

    public int f11500k;
    public int l;
    public int m;

    public int f11501n;

    public int f11502o;

    public final c1 f11503p;

    public final c1 f11504q;

    public final c1 f11505r;

    public w f11506s;

    public int f11507t;

    public int f11508u;

    public int f11509v;

    public boolean f11510w;

    public v f11511x;

    public k(h hVar) {
        this.f11490a = hVar;
        int[] iArr = hVar.A;
        this.f11491b = iArr;
        Object[] objArr = hVar.C;
        this.f11492c = objArr;
        this.f11493d = hVar.I;
        this.f11494e = hVar.J;
        this.f11495f = hVar.K;
        int i10 = hVar.B;
        this.f11496g = i10;
        this.f11497h = (iArr.length / 5) - i10;
        int i11 = hVar.D;
        this.f11500k = i11;
        this.l = objArr.length - i11;
        this.m = i10;
        this.f11503p = new c1(2, false);
        this.f11504q = new c1(2, false);
        this.f11505r = new c1(2, false);
        this.f11508u = i10;
        this.f11509v = -1;
    }

    public static int i(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static void z(k kVar) {
        int i10 = kVar.f11509v;
        int iR = kVar.r(i10);
        int[] iArr = kVar.f11491b;
        int i11 = (iR * 5) + 1;
        int i12 = iArr[i11];
        if ((i12 & 134217728) != 0) {
            return;
        }
        int i13 = (i12 & (-134217729)) | 134217728;
        iArr[i11] = i13;
        if ((67108864 & i13) != 0) {
            return;
        }
        kVar.W(kVar.G(iArr, i10));
    }

    public final void A(h hVar, int i10) {
        if (this.f11501n <= 0) {
            l1.l.a("Check failed");
        }
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i10 == 0 && this.f11507t == 0 && this.f11490a.B == 0) {
            int[] iArr = hVar.A;
            int i11 = iArr[(i10 * 5) + 3];
            int i12 = hVar.B;
            if (i11 == i12) {
                int[] iArr2 = this.f11491b;
                Object[] objArr3 = this.f11492c;
                ArrayList arrayList = this.f11493d;
                HashMap map = this.f11494e;
                w wVar = this.f11495f;
                Object[] objArr4 = hVar.C;
                int i13 = hVar.D;
                HashMap map2 = hVar.J;
                w wVar2 = hVar.K;
                this.f11491b = iArr;
                this.f11492c = objArr4;
                this.f11493d = hVar.I;
                this.f11496g = i12;
                this.f11497h = (iArr.length / 5) - i12;
                this.f11500k = i13;
                this.l = objArr4.length - i13;
                this.m = i12;
                this.f11494e = map2;
                this.f11495f = wVar2;
                hVar.A = iArr2;
                hVar.B = objArr2 == true ? 1 : 0;
                hVar.C = objArr3;
                hVar.D = objArr == true ? 1 : 0;
                hVar.I = arrayList;
                hVar.J = map;
                hVar.K = wVar;
                return;
            }
        }
        k kVarK = hVar.k();
        try {
            g4.W(kVarK, i10, this, true, true, false);
            boolean z11 = true;
        } finally {
            kVarK.e(z10);
        }
    }

    public final void B(int i10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        int i13;
        int i14 = this.f11497h;
        int i15 = this.f11496g;
        if (i15 != i10) {
            if (!this.f11493d.isEmpty()) {
                int iO = o() - this.f11497h;
                if (i15 < i10) {
                    for (int iA = j.a(this.f11493d, i15, iO); iA < this.f11493d.size() && (i12 = (bVar2 = (b) this.f11493d.get(iA)).f11470a) < 0 && (i13 = i12 + iO) < i10; iA++) {
                        bVar2.f11470a = i13;
                    }
                } else {
                    for (int iA2 = j.a(this.f11493d, i10, iO); iA2 < this.f11493d.size() && (i11 = (bVar = (b) this.f11493d.get(iA2)).f11470a) >= 0; iA2++) {
                        bVar.f11470a = -(iO - i11);
                    }
                }
            }
            if (i14 > 0) {
                int[] iArr = this.f11491b;
                int i16 = i10 * 5;
                int i17 = i14 * 5;
                int i18 = i15 * 5;
                if (i10 < i15) {
                    n.p0(i17 + i16, i16, i18, iArr, iArr);
                } else {
                    n.p0(i18, i18 + i17, i16 + i17, iArr, iArr);
                }
            }
            if (i10 < i15) {
                i15 = i10 + i14;
            }
            int iO2 = o();
            if (i15 >= iO2) {
                l1.l.a("Check failed");
            }
            while (i15 < iO2) {
                int i19 = (i15 * 5) + 2;
                int i20 = this.f11491b[i19];
                int iP = i20 > -2 ? i20 : (p() + i20) - (-2);
                if (iP >= i10) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i20) {
                    this.f11491b[i19] = iP;
                }
                i15++;
                if (i15 == i10) {
                    i15 += i14;
                }
            }
        }
        this.f11496g = i10;
    }

    public final void C(int i10, int i11) {
        int i12 = this.l;
        int i13 = this.f11500k;
        int i14 = this.m;
        if (i13 != i10) {
            Object[] objArr = this.f11492c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, p());
        if (i14 != iMin) {
            int length = this.f11492c.length - i12;
            if (iMin < i14) {
                int iR = r(iMin);
                int iR2 = r(i14);
                int i16 = this.f11496g;
                while (iR < iR2) {
                    int i17 = (iR * 5) + 4;
                    int i18 = this.f11491b[i17];
                    if (!(i18 >= 0)) {
                        l1.l.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f11491b[i17] = -((length - i18) + 1);
                    iR++;
                    if (iR == i16) {
                        iR += this.f11497h;
                    }
                }
            } else {
                int iR3 = r(i14);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i19 = (iR3 * 5) + 4;
                    int i20 = this.f11491b[i19];
                    if (!(i20 < 0)) {
                        l1.l.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f11491b[i19] = i20 + length + 1;
                    iR3++;
                    if (iR3 == this.f11496g) {
                        iR3 += this.f11497h;
                    }
                }
            }
            this.m = iMin;
        }
        this.f11500k = i10;
    }

    public final List D(b bVar, k kVar) {
        if (kVar.f11501n <= 0) {
            l1.l.a("Check failed");
        }
        if (this.f11501n != 0) {
            l1.l.a("Check failed");
        }
        if (!bVar.a()) {
            l1.l.a("Check failed");
        }
        int iC = c(bVar) + 1;
        int i10 = this.f11507t;
        if (i10 > iC || iC >= this.f11508u) {
            l1.l.a("Check failed");
        }
        int iG = G(this.f11491b, iC);
        int iU = u(iC);
        int iF = y(iC) ? 1 : F(iC);
        List listW = g4.W(this, iC, kVar, false, false, true);
        W(iG);
        boolean z10 = iF > 0;
        while (iG >= i10) {
            int iR = r(iG);
            int[] iArr = this.f11491b;
            int i11 = iR * 5;
            int i12 = i11 + 3;
            iArr[i12] = iArr[i12] - iU;
            if (z10) {
                int i13 = iArr[i11 + 1];
                if ((1073741824 & i13) != 0) {
                    z10 = false;
                } else {
                    j.c(iArr, iR, (i13 & 67108863) - iF);
                }
            }
            iG = G(this.f11491b, iG);
        }
        if (z10) {
            if (this.f11502o < iF) {
                l1.l.a("Check failed");
            }
            this.f11502o -= iF;
        }
        return listW;
    }

    public final Object E(int i10) {
        int iR = r(i10);
        int[] iArr = this.f11491b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.f11492c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int F(int i10) {
        return this.f11491b[(r(i10) * 5) + 1] & 67108863;
    }

    public final int G(int[] iArr, int i10) {
        int i11 = iArr[(r(i10) * 5) + 2];
        return i11 > -2 ? i11 : (p() + i11) - (-2);
    }

    public final Object H(Object obj) {
        if (this.f11501n > 0) {
            x(1, this.f11509v);
        }
        Object[] objArr = this.f11492c;
        int i10 = this.f11498i;
        this.f11498i = i10 + 1;
        Object obj2 = objArr[h(i10)];
        if (this.f11498i > this.f11499j) {
            l1.l.a("Writing to an invalid slot");
        }
        this.f11492c[h(this.f11498i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i10;
        v vVar = this.f11511x;
        if (vVar != null) {
            while (vVar.f14904b != 0) {
                int iV = z3.V(vVar);
                int iR = r(iV);
                int iU = iV + 1;
                int iU2 = u(iV) + iV;
                while (true) {
                    if (iU >= iU2) {
                        i10 = 0;
                        break;
                    } else {
                        if ((this.f11491b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.f11491b;
                int i11 = (iR * 5) + 1;
                int i12 = iArr[i11];
                if (((67108864 & i12) != 0 ? 1 : 0) != i10) {
                    iArr[i11] = (i10 << 26) | ((-67108865) & i12);
                    int iG = G(iArr, iV);
                    if (iG >= 0) {
                        z3.o(vVar, iG);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (!(this.f11501n == 0)) {
            l1.l.a("Cannot remove group while inserting");
        }
        int i10 = this.f11507t;
        int i11 = this.f11498i;
        int iG = g(this.f11491b, r(i10));
        int iN = N();
        Q(this.f11509v);
        v vVar = this.f11511x;
        if (vVar != null) {
            while (true) {
                int i12 = vVar.f14904b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    v.a.e("IntList is empty.");
                    throw null;
                }
                if (vVar.f14903a[0] < i10) {
                    break;
                }
                z3.V(vVar);
            }
        }
        boolean zK = K(i10, this.f11507t - i10);
        L(iG, this.f11498i - iG, i10 - 1);
        this.f11507t = i10;
        this.f11498i = i11;
        this.f11502o -= iN;
        return zK;
    }

    public final boolean K(int i10, int i11) {
        boolean z10 = false;
        if (i11 > 0) {
            ArrayList arrayList = this.f11493d;
            B(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f11494e;
                int i12 = i10 + i11;
                int iA = j.a(this.f11493d, i12, o() - this.f11497h);
                if (iA >= this.f11493d.size()) {
                    iA--;
                }
                int i13 = iA + 1;
                int i14 = 0;
                while (iA >= 0) {
                    b bVar = (b) this.f11493d.get(iA);
                    int iC = c(bVar);
                    if (iC < i10) {
                        break;
                    }
                    if (iC < i12) {
                        bVar.f11470a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iA + 1;
                        }
                        i13 = iA;
                    }
                    iA--;
                }
                z10 = i13 < i14;
                if (z10) {
                    this.f11493d.subList(i13, i14).clear();
                }
            }
            this.f11496g = i10;
            this.f11497h += i11;
            int i15 = this.m;
            if (i15 > i10) {
                this.m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f11508u;
            if (i16 >= this.f11496g) {
                this.f11508u = i16 - i11;
            }
            int i17 = this.f11509v;
            if (i17 >= 0 && (this.f11491b[(r(i17) * 5) + 1] & 67108864) != 0) {
                W(i17);
            }
        }
        return z10;
    }

    public final void L(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.l;
            int i14 = i10 + i11;
            C(i14, i12);
            this.f11500k = i10;
            this.l = i13 + i11;
            n.y0(i10, i14, (Object) null, this.f11492c);
            int i15 = this.f11499j;
            if (i15 >= i10) {
                this.f11499j = i15 - i11;
            }
        }
    }

    public final Object M(int i10, int i11, Object obj) {
        int iP = P(this.f11491b, r(i10));
        int iG = g(this.f11491b, r(i10 + 1));
        int i12 = iP + i11;
        if (i12 < iP || i12 >= iG) {
            l1.l.a("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        int iH = h(i12);
        Object[] objArr = this.f11492c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int N() {
        int iR = r(this.f11507t);
        int i10 = this.f11507t;
        int[] iArr = this.f11491b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 3] + i10;
        this.f11507t = i12;
        this.f11498i = g(iArr, r(i12));
        int i13 = this.f11491b[i11 + 1];
        if ((1073741824 & i13) != 0) {
            return 1;
        }
        return i13 & 67108863;
    }

    public final void O() {
        int i10 = this.f11508u;
        this.f11507t = i10;
        this.f11498i = g(this.f11491b, r(i10));
    }

    public final int P(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f11492c.length - this.l;
        }
        int iB = j.b(iArr, i10);
        return iB < 0 ? (this.f11492c.length - this.l) + iB + 1 : iB;
    }

    public final c Q(int i10) {
        b bVarT;
        HashMap map = this.f11494e;
        if (map == null || (bVarT = T(i10)) == null) {
            return null;
        }
        return (c) map.get(bVarT);
    }

    public final void R() {
        if (this.f11501n != 0) {
            l1.l.a("Key must be supplied when inserting");
        }
        l1.c cVar = l1.i.f9868a;
        S(0, cVar, cVar, false);
    }

    public final void S(int i10, Object obj, Object obj2, boolean z10) {
        int i11;
        int i12 = this.f11509v;
        Object[] objArr = this.f11501n > 0;
        this.f11505r.e(this.f11502o);
        l1.c cVar = l1.i.f9868a;
        if (objArr == true) {
            int i13 = this.f11507t;
            int iG = g(this.f11491b, r(i13));
            w(1);
            this.f11498i = iG;
            this.f11499j = iG;
            int iR = r(i13);
            int i14 = obj != cVar ? 1 : 0;
            int i15 = (z10 || obj2 == cVar) ? 0 : 1;
            int i16 = i(iG, this.f11500k, this.l, this.f11492c.length);
            if (i16 >= 0 && this.m < i13) {
                i16 = -(((this.f11492c.length - this.l) - i16) + 1);
            }
            int[] iArr = this.f11491b;
            int i17 = this.f11509v;
            int i18 = iR * 5;
            iArr[i18] = i10;
            iArr[i18 + 1] = ((z10 ? 1 : 0) << 30) | (i14 << 29) | (i15 << 28);
            iArr[i18 + 2] = i17;
            iArr[i18 + 3] = 0;
            iArr[i18 + 4] = i16;
            int i19 = (z10 ? 1 : 0) + i14 + i15;
            if (i19 > 0) {
                x(i19, i13);
                Object[] objArr2 = this.f11492c;
                int i20 = this.f11498i;
                if (z10) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                if (i14 != 0) {
                    objArr2[i20] = obj;
                    i20++;
                }
                if (i15 != 0) {
                    objArr2[i20] = obj2;
                    i20++;
                }
                this.f11498i = i20;
            }
            this.f11502o = 0;
            i11 = i13 + 1;
            this.f11509v = i13;
            this.f11507t = i11;
            if (i12 >= 0) {
                Q(i12);
            }
        } else {
            this.f11503p.e(i12);
            this.f11504q.e((o() - this.f11497h) - this.f11508u);
            int i21 = this.f11507t;
            int iR2 = r(i21);
            if (!kotlin.jvm.internal.m.a(obj2, cVar)) {
                if (z10) {
                    X(this.f11507t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.f11498i = P(this.f11491b, iR2);
            this.f11499j = g(this.f11491b, r(this.f11507t + 1));
            int[] iArr2 = this.f11491b;
            int i22 = iR2 * 5;
            this.f11502o = iArr2[i22 + 1] & 67108863;
            this.f11509v = i21;
            this.f11507t = i21 + 1;
            i11 = i21 + iArr2[i22 + 3];
        }
        this.f11508u = i11;
    }

    public final b T(int i10) {
        ArrayList arrayList;
        int iE;
        if (i10 < 0 || i10 >= p() || (iE = j.e((arrayList = this.f11493d), i10, p())) < 0) {
            return null;
        }
        return (b) arrayList.get(iE);
    }

    public final void U(Object obj) {
        if (this.f11501n <= 0 || this.f11498i == this.f11500k) {
            H(obj);
            return;
        }
        w wVar = this.f11506s;
        if (wVar == null) {
            wVar = new w();
        }
        this.f11506s = wVar;
        int i10 = this.f11509v;
        Object objB = wVar.b(i10);
        if (objB == null) {
            objB = new d0();
            wVar.i(i10, objB);
        }
        ((d0) objB).a(obj);
    }

    public final void V(Object obj) {
        int iR = r(this.f11507t);
        int i10 = (iR * 5) + 1;
        if ((this.f11491b[i10] & 268435456) == 0) {
            l1.l.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f11492c;
        int[] iArr = this.f11491b;
        objArr[h(Integer.bitCount(iArr[i10] >> 29) + g(iArr, iR))] = obj;
    }

    public final void W(int i10) {
        if (i10 >= 0) {
            v vVar = this.f11511x;
            if (vVar == null) {
                vVar = new v();
                this.f11511x = vVar;
            }
            z3.o(vVar, i10);
        }
    }

    public final void X(int i10, Object obj) {
        boolean z10;
        int iR = r(i10);
        int[] iArr = this.f11491b;
        if (iR < iArr.length) {
            z10 = (iArr[(iR * 5) + 1] & 1073741824) != 0;
        }
        if (!z10) {
            l1.l.a("Updating the node of a group at " + i10 + " that was not created with as a node group");
        }
        this.f11492c[h(g(this.f11491b, iR))] = obj;
    }

    public final void a(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            l1.l.a("Cannot seek backwards");
        }
        if (!(this.f11501n <= 0)) {
            n1.b("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f11507t + i10;
        if (i11 >= this.f11509v && i11 <= this.f11508u) {
            z10 = true;
        }
        if (!z10) {
            l1.l.a("Cannot seek outside the current group (" + this.f11509v + '-' + this.f11508u + ')');
        }
        this.f11507t = i11;
        int iG = g(this.f11491b, r(i11));
        this.f11498i = iG;
        this.f11499j = iG;
    }

    public final b b(int i10) {
        ArrayList arrayList = this.f11493d;
        int iE = j.e(arrayList, i10, p());
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        if (i10 > this.f11496g) {
            i10 = -(p() - i10);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final int c(b bVar) {
        int i10 = bVar.f11470a;
        return i10 < 0 ? p() + i10 : i10;
    }

    public final void d() {
        int i10 = this.f11501n;
        this.f11501n = i10 + 1;
        if (i10 == 0) {
            this.f11504q.e((o() - this.f11497h) - this.f11508u);
        }
    }

    public final void e(boolean z10) {
        this.f11510w = true;
        if (z10 && this.f11503p.f28b == 0) {
            B(p());
            C(this.f11492c.length - this.l, this.f11496g);
            int i10 = this.f11500k;
            Arrays.fill(this.f11492c, i10, this.l + i10, (Object) null);
            I();
        }
        int[] iArr = this.f11491b;
        int i11 = this.f11496g;
        Object[] objArr = this.f11492c;
        int i12 = this.f11500k;
        ArrayList arrayList = this.f11493d;
        HashMap map = this.f11494e;
        w wVar = this.f11495f;
        h hVar = this.f11490a;
        if (!hVar.G) {
            n1.a("Unexpected writer close()");
        }
        hVar.G = false;
        hVar.A = iArr;
        hVar.B = i11;
        hVar.C = objArr;
        hVar.D = i12;
        hVar.I = arrayList;
        hVar.J = map;
        hVar.K = wVar;
    }

    public final int f(int i10) {
        return g(this.f11491b, r(i10));
    }

    public final int g(int[] iArr, int i10) {
        if (i10 >= o()) {
            return this.f11492c.length - this.l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f11492c.length - this.l) + i11 + 1 : i11;
    }

    public final int h(int i10) {
        return (this.l * (i10 < this.f11500k ? 0 : 1)) + i10;
    }

    public final void j() {
        d0 d0Var;
        boolean z10 = this.f11501n > 0;
        int i10 = this.f11507t;
        int i11 = this.f11508u;
        int i12 = this.f11509v;
        int iR = r(i12);
        int i13 = this.f11502o;
        int i14 = i10 - i12;
        int i15 = iR * 5;
        int i16 = i15 + 1;
        boolean z11 = (this.f11491b[i16] & 1073741824) != 0;
        c1 c1Var = this.f11505r;
        if (z10) {
            w wVar = this.f11506s;
            if (wVar != null && (d0Var = (d0) wVar.b(i12)) != null) {
                Object[] objArr = d0Var.f14837a;
                int i17 = d0Var.f14838b;
                for (int i18 = 0; i18 < i17; i18++) {
                    H(objArr[i18]);
                }
            }
            int[] iArr = this.f11491b;
            iArr[i15 + 3] = i14;
            j.c(iArr, iR, i13);
            int iD = c1Var.d();
            if (z11) {
                i13 = 1;
            }
            this.f11502o = iD + i13;
            int iG = G(this.f11491b, i12);
            this.f11509v = iG;
            int iP = iG < 0 ? p() : r(iG + 1);
            int iG2 = iP >= 0 ? g(this.f11491b, iP) : 0;
            this.f11498i = iG2;
            this.f11499j = iG2;
            return;
        }
        if (i10 != i11) {
            l1.l.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f11491b;
        int i19 = i15 + 3;
        int i20 = iArr2[i19];
        int i21 = iArr2[i16] & 67108863;
        iArr2[i19] = i14;
        j.c(iArr2, iR, i13);
        int iD2 = this.f11503p.d();
        this.f11508u = (o() - this.f11497h) - this.f11504q.d();
        this.f11509v = iD2;
        int iG3 = G(this.f11491b, i12);
        int iD3 = c1Var.d();
        this.f11502o = iD3;
        if (iG3 == iD2) {
            this.f11502o = iD3 + (z11 ? 0 : i13 - i21);
            return;
        }
        int i22 = i14 - i20;
        int i23 = z11 ? 0 : i13 - i21;
        if (i22 != 0 || i23 != 0) {
            while (iG3 != 0 && iG3 != iD2 && (i23 != 0 || i22 != 0)) {
                int iR2 = r(iG3);
                if (i22 != 0) {
                    int[] iArr3 = this.f11491b;
                    int i24 = (iR2 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i22;
                }
                if (i23 != 0) {
                    int[] iArr4 = this.f11491b;
                    j.c(iArr4, iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i23);
                }
                int[] iArr5 = this.f11491b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i23 = 0;
                }
                iG3 = G(iArr5, iG3);
            }
        }
        this.f11502o += i23;
    }

    public final void k() {
        if (this.f11501n <= 0) {
            n1.b("Unbalanced begin/end insert");
        }
        int i10 = this.f11501n - 1;
        this.f11501n = i10;
        if (i10 == 0) {
            if (this.f11505r.f28b != this.f11503p.f28b) {
                l1.l.a("startGroup/endGroup mismatch while inserting");
            }
            this.f11508u = (o() - this.f11497h) - this.f11504q.d();
        }
    }

    public final void l(int i10) {
        boolean z10 = false;
        if (!(this.f11501n <= 0)) {
            l1.l.a("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f11509v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f11508u) {
                z10 = true;
            }
            if (!z10) {
                l1.l.a("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f11507t;
            int i13 = this.f11498i;
            int i14 = this.f11499j;
            this.f11507t = i10;
            R();
            this.f11507t = i12;
            this.f11498i = i13;
            this.f11499j = i14;
        }
    }

    public final void m(int i10, int i11, int i12) {
        if (i10 >= this.f11496g) {
            i10 = -((p() - i10) + 2);
        }
        while (i12 < i11) {
            this.f11491b[(r(i12) * 5) + 2] = i10;
            int i13 = this.f11491b[(r(i12) * 5) + 3] + i12;
            m(i12, i13, i12 + 1);
            i12 = i13;
        }
    }

    public final void n(int i10, u00.n nVar) throws KotlinNothingValueException {
        int i11;
        int i12;
        int i13;
        int iG = G(this.f11491b, i10);
        int iP = p();
        int iU = u(i10) + i10;
        int i14 = i10;
        x xVar = null;
        v vVar = null;
        while (i14 < iU) {
            int iF = f(i14);
            int i15 = i14 + 1;
            int iF2 = f(i15);
            while (iF < iF2) {
                Object obj = this.f11492c[h(iF)];
                if (obj instanceof z1) {
                    z1 z1Var = (z1) obj;
                    j0 j0Var = z1Var instanceof j0 ? (j0) z1Var : null;
                    if (j0Var == null) {
                        l1.l.b("Inconsistent composition");
                        throw new KotlinNothingValueException();
                    }
                    int i16 = j0Var.f9877b;
                    if (i16 >= 0) {
                        int iU2 = u(i14) + i14;
                        int i17 = i15;
                        int i18 = 0;
                        while (i17 < iU2 && i18 < i16) {
                            int iR = r(i17);
                            int i19 = iG;
                            int[] iArr = this.f11491b;
                            int i20 = iR * 5;
                            i17 = iArr[i20 + 3] + i17;
                            if (i17 < iU2 && (iArr[i20 + 1] & 536870912) == 0) {
                                i18++;
                            }
                            iG = i19;
                        }
                        i13 = iG;
                        if (xVar == null) {
                            int[] iArr2 = u.n.f14878a;
                            xVar = new x();
                        }
                        if (vVar == null) {
                            vVar = new v();
                        }
                        xVar.a(i17);
                        vVar.a(i17);
                        vVar.a(iF);
                    }
                    iF++;
                    iG = i13;
                }
                i13 = iG;
                nVar.invoke(Integer.valueOf(iF), obj);
                iF++;
                iG = i13;
            }
            int i21 = iG;
            iG = i15 < iP ? G(this.f11491b, i15) : -1;
            if (iG != i14) {
                int iG2 = i21;
                while (true) {
                    if (vVar == null || xVar == null || !xVar.g(i14)) {
                        i11 = iP;
                    } else {
                        int i22 = vVar.f14904b;
                        int i23 = i22 / 2;
                        int i24 = 0;
                        int i25 = 0;
                        while (i24 < i23) {
                            int i26 = i24 * 2;
                            int i27 = iP;
                            int iC = vVar.c(i26);
                            if (iC == i14) {
                                int iC2 = vVar.c(i26 + 1);
                                nVar.invoke(Integer.valueOf(iC2), this.f11492c[h(iC2)]);
                            } else if (i26 != i25) {
                                int i28 = i25 + 1;
                                vVar.f(i25, iC);
                                i25 += 2;
                                vVar.f(i28, vVar.c(i26 + 1));
                            } else {
                                i25 += 2;
                            }
                            i24++;
                            nVar = nVar;
                            iP = i27;
                        }
                        i11 = iP;
                        if (i25 != i22) {
                            if (i25 < 0 || i25 > (i12 = vVar.f14904b) || i22 < 0 || i22 > i12) {
                                v.a.d("Index must be between 0 and size");
                                throw null;
                            }
                            if (i22 < i25) {
                                v.a.c("The end index must be < start index");
                                throw null;
                            }
                            if (i22 != i25) {
                                if (i22 < i12) {
                                    int[] iArr3 = vVar.f14903a;
                                    n.p0(i25, i22, i12, iArr3, iArr3);
                                }
                                vVar.f14904b -= i22 - i25;
                            }
                        }
                    }
                    if (i14 == i10 || iG2 == iG) {
                        break;
                    }
                    i14 = iG2;
                    iP = i11;
                    iG2 = G(this.f11491b, iG2);
                    nVar = nVar;
                }
            } else {
                i11 = iP;
            }
            i14 = i15;
            iP = i11;
        }
    }

    public final int o() {
        return this.f11491b.length / 5;
    }

    public final int p() {
        return o() - this.f11497h;
    }

    public final Object q(int i10) {
        int iR = r(i10);
        int[] iArr = this.f11491b;
        int i11 = (iR * 5) + 1;
        if ((iArr[i11] & 268435456) == 0) {
            return l1.i.f9868a;
        }
        return this.f11492c[Integer.bitCount(iArr[i11] >> 29) + g(iArr, iR)];
    }

    public final int r(int i10) {
        return (this.f11497h * (i10 < this.f11496g ? 0 : 1)) + i10;
    }

    public final int s(int i10) {
        return this.f11491b[r(i10) * 5];
    }

    public final Object t(int i10) {
        int iR = r(i10);
        int[] iArr = this.f11491b;
        int i11 = iR * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f11492c[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f11507t + " end=" + this.f11508u + " size = " + p() + " gap=" + this.f11496g + '-' + (this.f11496g + this.f11497h) + ')';
    }

    public final int u(int i10) {
        return this.f11491b[(r(i10) * 5) + 3];
    }

    public final boolean v(int i10, int i11) {
        int iO;
        int iU;
        if (i11 == this.f11509v) {
            iO = this.f11508u;
        } else {
            c1 c1Var = this.f11503p;
            if (i11 > c1Var.c(0)) {
                iU = u(i11);
            } else {
                int[] iArr = c1Var.f27a;
                int iMin = Math.min(iArr.length, c1Var.f28b);
                int i12 = 0;
                while (true) {
                    if (i12 >= iMin) {
                        i12 = -1;
                        break;
                    }
                    if (iArr[i12] == i11) {
                        break;
                    }
                    i12++;
                }
                if (i12 < 0) {
                    iU = u(i11);
                } else {
                    iO = (o() - this.f11497h) - this.f11504q.f27a[i12];
                }
            }
            iO = iU + i11;
        }
        return i10 > i11 && i10 < iO;
    }

    public final void w(int i10) {
        if (i10 > 0) {
            int i11 = this.f11507t;
            B(i11);
            int i12 = this.f11496g;
            int i13 = this.f11497h;
            int[] iArr = this.f11491b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                n.p0(0, 0, i12 * 5, iArr, iArr2);
                n.p0((i12 + i15) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f11491b = iArr2;
                i13 = i15;
            }
            int i16 = this.f11508u;
            if (i16 >= i12) {
                this.f11508u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f11496g = i17;
            this.f11497h = i13 - i10;
            int i18 = i(i14 > 0 ? f(i11 + i10) : 0, this.m >= i12 ? this.f11500k : 0, this.l, this.f11492c.length);
            for (int i19 = i12; i19 < i17; i19++) {
                this.f11491b[(i19 * 5) + 4] = i18;
            }
            int i20 = this.m;
            if (i20 >= i12) {
                this.m = i20 + i10;
            }
        }
    }

    public final void x(int i10, int i11) {
        if (i10 > 0) {
            C(this.f11498i, i11);
            int i12 = this.f11500k;
            int i13 = this.l;
            if (i13 < i10) {
                Object[] objArr = this.f11492c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f11492c = objArr2;
                i13 = i16;
            }
            int i18 = this.f11499j;
            if (i18 >= i12) {
                this.f11499j = i18 + i10;
            }
            this.f11500k = i12 + i10;
            this.l = i13 - i10;
        }
    }

    public final boolean y(int i10) {
        return (this.f11491b[(r(i10) * 5) + 1] & 1073741824) != 0;
    }
}
