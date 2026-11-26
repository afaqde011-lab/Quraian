package g4;

import android.view.View;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import h4.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class e {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final d H;
    public final d I;
    public final d J;
    public final d K;
    public final d L;
    public final d M;
    public final d N;
    public final d O;
    public final d[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public e S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    public int f6124a0;

    public h4.c f6125b;

    public int f6126b0;

    public h4.c f6127c;

    public float f6128c0;

    public float f6130d0;

    public View f6132e0;

    public int f6134f0;

    public String f6136g0;

    public int f6138h0;

    public int f6140i0;

    public boolean f6141j;

    public final float[] f6142j0;

    public boolean f6143k;

    public final e[] f6144k0;
    public boolean l;

    public final e[] f6145l0;
    public boolean m;

    public int f6146m0;

    public int f6147n;

    public int f6148n0;

    public int f6149o;

    public final int[] f6150o0;

    public int f6151p;

    public int f6152q;

    public int f6153r;

    public final int[] f6154s;

    public int f6155t;

    public int f6156u;

    public float f6157v;

    public int f6158w;

    public int f6159x;

    public float f6160y;

    public int f6161z;

    public boolean f6123a = false;

    public h4.j f6129d = null;

    public l f6131e = null;

    public final boolean[] f6133f = {true, true};

    public boolean f6135g = true;

    public int f6137h = -1;

    public int f6139i = -1;

    public e() {
        new HashMap();
        this.f6141j = false;
        this.f6143k = false;
        this.l = false;
        this.m = false;
        this.f6147n = -1;
        this.f6149o = -1;
        this.f6151p = 0;
        this.f6152q = 0;
        this.f6153r = 0;
        this.f6154s = new int[2];
        this.f6155t = 0;
        this.f6156u = 0;
        this.f6157v = 1.0f;
        this.f6158w = 0;
        this.f6159x = 0;
        this.f6160y = 1.0f;
        this.f6161z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        d dVar = new d(this, 2);
        this.H = dVar;
        d dVar2 = new d(this, 3);
        this.I = dVar2;
        d dVar3 = new d(this, 4);
        this.J = dVar3;
        d dVar4 = new d(this, 5);
        this.K = dVar4;
        d dVar5 = new d(this, 6);
        this.L = dVar5;
        d dVar6 = new d(this, 8);
        this.M = dVar6;
        d dVar7 = new d(this, 9);
        this.N = dVar7;
        d dVar8 = new d(this, 7);
        this.O = dVar8;
        this.P = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.f6150o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f6128c0 = 0.5f;
        this.f6130d0 = 0.5f;
        this.f6134f0 = 0;
        this.f6136g0 = null;
        this.f6138h0 = 0;
        this.f6140i0 = 0;
        this.f6142j0 = new float[]{-1.0f, -1.0f};
        this.f6144k0 = new e[]{null, null};
        this.f6145l0 = new e[]{null, null};
        this.f6146m0 = -1;
        this.f6148n0 = -1;
        arrayList.add(dVar);
        arrayList.add(dVar2);
        arrayList.add(dVar3);
        arrayList.add(dVar4);
        arrayList.add(dVar6);
        arrayList.add(dVar7);
        arrayList.add(dVar8);
        arrayList.add(dVar5);
    }

    public final void A() {
        e eVar = this.S;
        if (eVar != null && (eVar instanceof f)) {
            ((f) eVar).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((d) arrayList.get(i10)).j();
        }
    }

    public final void B() {
        this.f6141j = false;
        this.f6143k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            dVar.f6116c = false;
            dVar.f6115b = 0;
        }
    }

    public void C(a1.i iVar) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i10) {
        this.Z = i10;
        this.D = i10 > 0;
    }

    public final void E(int i10, int i11) {
        if (this.f6141j) {
            return;
        }
        this.H.l(i10);
        this.J.l(i11);
        this.X = i10;
        this.T = i11 - i10;
        this.f6141j = true;
    }

    public final void F(int i10, int i11) {
        if (this.f6143k) {
            return;
        }
        this.I.l(i10);
        this.K.l(i11);
        this.Y = i10;
        this.U = i11 - i10;
        if (this.D) {
            this.L.l(i10 + this.Z);
        }
        this.f6143k = true;
    }

    public final void G(int i10) {
        this.U = i10;
        int i11 = this.f6126b0;
        if (i10 < i11) {
            this.U = i11;
        }
    }

    public final void H(int i10) {
        this.f6150o0[0] = i10;
    }

    public final void I(int i10) {
        this.f6150o0[1] = i10;
    }

    public final void J(int i10) {
        this.T = i10;
        int i11 = this.f6124a0;
        if (i10 < i11) {
            this.T = i11;
        }
    }

    public void K(boolean z10, boolean z11) {
        int i10;
        int i11;
        h4.j jVar = this.f6129d;
        boolean z12 = z10 & jVar.f6604g;
        l lVar = this.f6131e;
        boolean z13 = z11 & lVar.f6604g;
        int i12 = jVar.f6605h.f6582g;
        int i13 = lVar.f6605h.f6582g;
        int i14 = jVar.f6606i.f6582g;
        int i15 = lVar.f6606i.f6582g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i15 = 0;
            i12 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (z12) {
            this.X = i12;
        }
        if (z13) {
            this.Y = i13;
        }
        if (this.f6134f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f6150o0;
        if (z12) {
            if (iArr[0] == 1 && i17 < (i11 = this.T)) {
                i17 = i11;
            }
            this.T = i17;
            int i19 = this.f6124a0;
            if (i17 < i19) {
                this.T = i19;
            }
        }
        if (z13) {
            if (iArr[1] == 1 && i18 < (i10 = this.U)) {
                i18 = i10;
            }
            this.U = i18;
            int i20 = this.f6126b0;
            if (i18 < i20) {
                this.U = i20;
            }
        }
    }

    public void L(e4.c cVar, boolean z10) {
        int i10;
        int i11;
        l lVar;
        h4.j jVar;
        cVar.getClass();
        int iN = e4.c.n(this.H);
        int iN2 = e4.c.n(this.I);
        int iN3 = e4.c.n(this.J);
        int iN4 = e4.c.n(this.K);
        if (z10 && (jVar = this.f6129d) != null) {
            h4.e eVar = jVar.f6605h;
            if (eVar.f6585j) {
                h4.e eVar2 = jVar.f6606i;
                if (eVar2.f6585j) {
                    iN = eVar.f6582g;
                    iN3 = eVar2.f6582g;
                }
            }
        }
        if (z10 && (lVar = this.f6131e) != null) {
            h4.e eVar3 = lVar.f6605h;
            if (eVar3.f6585j) {
                h4.e eVar4 = lVar.f6606i;
                if (eVar4.f6585j) {
                    iN2 = eVar3.f6582g;
                    iN4 = eVar4.f6582g;
                }
            }
        }
        int i12 = iN4 - iN2;
        if (iN3 - iN < 0 || i12 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i13 = iN3 - iN;
        int i14 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f6134f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.f6150o0;
        int i15 = iArr[0];
        if (i15 == 1 && i13 < (i11 = this.T)) {
            i13 = i11;
        }
        if (iArr[1] == 1 && i14 < (i10 = this.U)) {
            i14 = i10;
        }
        this.T = i13;
        this.U = i14;
        int i16 = this.f6126b0;
        if (i14 < i16) {
            this.U = i16;
        }
        int i17 = this.f6124a0;
        if (i13 < i17) {
            this.T = i17;
        }
        int i18 = this.f6156u;
        if (i18 > 0 && i15 == 3) {
            this.T = Math.min(this.T, i18);
        }
        int i19 = this.f6159x;
        if (i19 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i19);
        }
        int i20 = this.T;
        if (i13 != i20) {
            this.f6137h = i20;
        }
        int i21 = this.U;
        if (i14 != i21) {
            this.f6139i = i21;
        }
    }

    public final void a(f fVar, e4.c cVar, HashSet hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.b(fVar, cVar, this);
            hashSet.remove(this);
            b(cVar, fVar.R(64));
        }
        if (i10 == 0) {
            HashSet hashSet2 = this.H.f6114a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).f6117d.a(fVar, cVar, hashSet, i10, true);
                }
            }
            HashSet hashSet3 = this.J.f6114a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).f6117d.a(fVar, cVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.f6114a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).f6117d.a(fVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet5 = this.K.f6114a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((d) it4.next()).f6117d.a(fVar, cVar, hashSet, i10, true);
            }
        }
        HashSet hashSet6 = this.L.f6114a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((d) it5.next()).f6117d.a(fVar, cVar, hashSet, i10, true);
            }
        }
    }

    public void b(e4.c cVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean[] zArr;
        int i14;
        int i15;
        boolean z11;
        HashSet hashSet;
        e eVar;
        f fVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        e eVar2;
        f fVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        d dVar;
        boolean[] zArr3;
        boolean z12;
        boolean z13;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr;
        int i21;
        boolean z14;
        int i22;
        boolean z15;
        float f3;
        int i23;
        int i24;
        d dVar2;
        int i25;
        int i26;
        int i27;
        boolean z16;
        int i28;
        boolean z17;
        boolean z18;
        d dVar3;
        int i29;
        d dVar4;
        e4.g gVar;
        e4.g gVar2;
        e4.g gVar3;
        boolean z19;
        ?? r4;
        ?? r7;
        int i30;
        e4.g gVar4;
        e4.g gVar5;
        e4.g gVar6;
        int i31;
        int i32;
        boolean z20;
        int i33;
        e4.g gVar7;
        d dVar5;
        ?? r27;
        l lVar;
        boolean z21;
        h4.j jVar;
        int i34;
        int i35;
        boolean zU;
        int i36;
        boolean zV;
        h4.j jVar2;
        l lVar2;
        boolean z22;
        ArrayList arrayList;
        int size;
        int i37;
        HashSet hashSet2;
        e4.c cVar2 = cVar;
        d dVar6 = this.H;
        e4.g gVarK = cVar2.k(dVar6);
        d dVar7 = this.J;
        e4.g gVarK2 = cVar2.k(dVar7);
        d dVar8 = this.I;
        e4.g gVarK3 = cVar2.k(dVar8);
        d dVar9 = this.K;
        e4.g gVarK4 = cVar2.k(dVar9);
        d dVar10 = this.L;
        e4.g gVarK5 = cVar2.k(dVar10);
        e eVar3 = this.S;
        if (eVar3 != null) {
            int[] iArr2 = eVar3.f6150o0;
            i10 = 0;
            i12 = iArr2[0] == 2 ? 1 : 0;
            int i38 = iArr2[1] == 2 ? 1 : 0;
            int i39 = this.f6151p;
            if (i39 != 1) {
                if (i39 == 2) {
                    i12 = 0;
                } else if (i39 != 3) {
                }
                i11 = i38;
            } else {
                i11 = 0;
            }
            i13 = this.f6134f0;
            zArr = this.R;
            i14 = i11;
            if (i13 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i15 = i12;
                i37 = i10;
                while (true) {
                    if (i37 < size) {
                        if (!zArr[i10] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i40 = size;
                    hashSet2 = ((d) arrayList.get(i37)).f6114a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i37++;
                    size = i40;
                }
            } else {
                i15 = i12;
            }
            z11 = this.f6141j;
            if (z11 || this.f6143k) {
                if (z11) {
                    cVar2.d(gVarK, this.X);
                    cVar2.d(gVarK2, this.X + this.T);
                    if (i15 != 0 && (eVar2 = this.S) != null) {
                        fVar2 = (f) eVar2;
                        weakReference3 = fVar2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || dVar6.d() > ((d) fVar2.G0.get()).d()) {
                            fVar2.G0 = new WeakReference(dVar6);
                        }
                        weakReference4 = fVar2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || dVar7.d() > ((d) fVar2.I0.get()).d()) {
                            fVar2.I0 = new WeakReference(dVar7);
                        }
                    }
                }
                if (this.f6143k) {
                    cVar2.d(gVarK3, this.Y);
                    cVar2.d(gVarK4, this.Y + this.U);
                    hashSet = dVar10.f6114a;
                    if (hashSet != null && hashSet.size() > 0) {
                        cVar2.d(gVarK5, this.Y + this.Z);
                    }
                    if (i14 != 0 && (eVar = this.S) != null) {
                        fVar = (f) eVar;
                        weakReference = fVar.F0;
                        if (weakReference != null || weakReference.get() == null || dVar8.d() > ((d) fVar.F0.get()).d()) {
                            fVar.F0 = new WeakReference(dVar8);
                        }
                        weakReference2 = fVar.H0;
                        if (weakReference2 != null || weakReference2.get() == null || dVar9.d() > ((d) fVar.H0.get()).d()) {
                            fVar.H0 = new WeakReference(dVar9);
                        }
                    }
                }
                if (this.f6141j && this.f6143k) {
                    ?? r12 = i10;
                    this.f6141j = r12;
                    this.f6143k = r12;
                    return;
                }
            }
            zArr2 = this.f6133f;
            if (z10 || (jVar2 = this.f6129d) == null || (lVar2 = this.f6131e) == null) {
                dVar = dVar10;
                zArr3 = zArr2;
            } else {
                dVar = dVar10;
                h4.e eVar4 = jVar2.f6605h;
                zArr3 = zArr2;
                if (eVar4.f6585j && jVar2.f6606i.f6585j && lVar2.f6605h.f6585j && lVar2.f6606i.f6585j) {
                    cVar2.d(gVarK, eVar4.f6582g);
                    cVar2.d(gVarK2, this.f6129d.f6606i.f6582g);
                    cVar2.d(gVarK3, this.f6131e.f6605h.f6582g);
                    cVar2.d(gVarK4, this.f6131e.f6606i.f6582g);
                    cVar2.d(gVarK5, this.f6131e.f6591k.f6582g);
                    if (this.S == null) {
                        z22 = false;
                    } else {
                        if (i15 != 0 && zArr3[0] && !u()) {
                            cVar2.f(cVar2.k(this.S.J), gVarK2, 0, 8);
                        }
                        if (i14 == 0 || !zArr3[1] || v()) {
                            z22 = false;
                        } else {
                            z22 = false;
                            cVar2.f(cVar2.k(this.S.K), gVarK4, 0, 8);
                        }
                    }
                    this.f6141j = z22;
                    this.f6143k = z22;
                    return;
                }
            }
            if (this.S != null) {
                if (t(0)) {
                    ((f) this.S).M(this, 0);
                    zU = true;
                    i36 = 1;
                } else {
                    zU = u();
                    i36 = 1;
                }
                if (t(i36)) {
                    ((f) this.S).M(this, i36);
                    zV = true;
                } else {
                    zV = v();
                }
                if (zU && i15 != 0 && this.f6134f0 != 8 && dVar6.f6119f == null && dVar7.f6119f == null) {
                    cVar2.f(cVar2.k(this.S.J), gVarK2, 0, 1);
                }
                if (!zV && i14 != 0 && this.f6134f0 != 8 && dVar8.f6119f == null && dVar9.f6119f == null && dVar == null) {
                    cVar2.f(cVar2.k(this.S.K), gVarK4, 0, 1);
                }
                z13 = zV;
                z12 = zU;
            } else {
                dVar6 = dVar6;
                z12 = false;
                z13 = false;
            }
            i16 = this.T;
            i17 = this.f6124a0;
            if (i16 >= i17) {
                i17 = i16;
            }
            i18 = this.U;
            i19 = this.f6126b0;
            if (i18 < i19) {
                i20 = i19;
            } else {
                i20 = i18;
            }
            iArr = this.f6150o0;
            i21 = iArr[0];
            if (i21 != 3) {
                z14 = true;
            } else {
                z14 = false;
            }
            i22 = iArr[1];
            if (i22 != 3) {
                z15 = true;
            } else {
                z15 = false;
            }
            int i41 = this.W;
            this.f6161z = i41;
            f3 = this.V;
            this.A = f3;
            i23 = this.f6152q;
            i24 = this.f6153r;
            if (f3 > 0.0f) {
                dVar2 = dVar9;
                if (this.f6134f0 != 8) {
                    if (i21 == 3 || i23 != 0) {
                        i26 = i23;
                    } else {
                        i26 = 3;
                    }
                    if (i22 == 3 || i24 != 0) {
                        i35 = i24;
                    } else {
                        i35 = 3;
                    }
                    if (i21 == 3 || i22 != 3 || i26 != 3 || i35 != 3) {
                        if (i21 != 3 && i26 == 3) {
                            this.f6161z = 0;
                            i17 = (int) (f3 * i18);
                            if (i22 != 3) {
                                dVar = dVar;
                                i25 = i20;
                                i26 = 4;
                                z16 = false;
                            }
                            i27 = i35;
                            int[] iArr3 = this.f6154s;
                            iArr3[0] = i26;
                            iArr3[1] = i27;
                            if (z16) {
                                int i42 = this.f6161z;
                                i28 = -1;
                                if (i42 != 0) {
                                }
                                if (z16) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                if (iArr[0] == 2) {
                                    z18 = false;
                                } else {
                                    z18 = false;
                                }
                                if (z18) {
                                    i17 = 0;
                                }
                                dVar3 = this.O;
                                boolean z23 = !dVar3.h();
                                char c10 = '\b';
                                boolean z24 = zArr[0];
                                boolean z25 = zArr[1];
                                i29 = this.f6147n;
                                int[] iArr4 = this.B;
                                if (i29 != 2) {
                                    dVar4 = dVar;
                                    gVar = gVarK;
                                    gVar2 = gVarK2;
                                    gVar3 = gVarK5;
                                    z19 = z12;
                                    r4 = i15;
                                    r7 = i14;
                                    i30 = i26;
                                } else {
                                    dVar4 = dVar;
                                    gVar = gVarK;
                                    gVar2 = gVarK2;
                                    gVar3 = gVarK5;
                                    z19 = z12;
                                    r4 = i15;
                                    r7 = i14;
                                    i30 = i26;
                                }
                                if (z10) {
                                    gVar4 = r33;
                                    gVar5 = gVarK4;
                                    gVar6 = gVar3;
                                    i31 = 0;
                                    i32 = 8;
                                    z20 = true;
                                    i33 = 1;
                                } else {
                                    gVar4 = r33;
                                    gVar5 = gVarK4;
                                    gVar6 = gVar3;
                                    i31 = 0;
                                    i32 = 8;
                                    z20 = true;
                                    i33 = 1;
                                }
                                if (this.f6149o == 2) {
                                    i33 = i31;
                                }
                                if (i33 != 0) {
                                    gVar7 = gVar4;
                                } else {
                                    gVar7 = gVar4;
                                }
                                if (z16) {
                                    if (this.f6161z == 1) {
                                        float f10 = this.A;
                                        e4.b bVarL = cVar2.l();
                                        bVarL.f5064d.g(gVar5, -1.0f);
                                        bVarL.f5064d.g(gVar7, 1.0f);
                                        bVarL.f5064d.g(gVar2, f10);
                                        bVarL.f5064d.g(gVar, -f10);
                                        cVar2.c(bVarL);
                                    } else {
                                        float f11 = this.A;
                                        e4.b bVarL2 = cVar2.l();
                                        bVarL2.f5064d.g(gVar2, -1.0f);
                                        bVarL2.f5064d.g(gVar, 1.0f);
                                        bVarL2.f5064d.g(gVar5, f11);
                                        bVarL2.f5064d.g(gVar7, -f11);
                                        cVar2.c(bVarL2);
                                    }
                                }
                                if (dVar3.h()) {
                                    e eVar5 = dVar3.f6119f.f6117d;
                                    float radians = (float) Math.toRadians(this.C + 90.0f);
                                    int iE = dVar3.e();
                                    e4.g gVarK6 = cVar2.k(i(2));
                                    e4.g gVarK7 = cVar2.k(i(3));
                                    e4.g gVarK8 = cVar2.k(i(4));
                                    e4.g gVarK9 = cVar2.k(i(5));
                                    e4.g gVarK10 = cVar2.k(eVar5.i(2));
                                    e4.g gVarK11 = cVar2.k(eVar5.i(3));
                                    e4.g gVarK12 = cVar2.k(eVar5.i(4));
                                    e4.g gVarK13 = cVar2.k(eVar5.i(5));
                                    e4.b bVarL3 = cVar2.l();
                                    double d3 = radians;
                                    double dSin = Math.sin(d3);
                                    double d5 = iE;
                                    bVarL3.f5064d.g(gVarK11, 0.5f);
                                    bVarL3.f5064d.g(gVarK13, 0.5f);
                                    bVarL3.f5064d.g(gVarK7, -0.5f);
                                    bVarL3.f5064d.g(gVarK9, -0.5f);
                                    bVarL3.f5062b = -((float) (dSin * d5));
                                    cVar2.c(bVarL3);
                                    e4.b bVarL4 = cVar2.l();
                                    float fCos = (float) (Math.cos(d3) * d5);
                                    bVarL4.f5064d.g(gVarK10, 0.5f);
                                    bVarL4.f5064d.g(gVarK12, 0.5f);
                                    bVarL4.f5064d.g(gVarK6, -0.5f);
                                    bVarL4.f5064d.g(gVarK8, -0.5f);
                                    bVarL4.f5062b = -fCos;
                                    cVar2.c(bVarL4);
                                }
                                this.f6141j = false;
                                this.f6143k = false;
                            }
                            i28 = -1;
                            if (z16) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            if (iArr[0] == 2) {
                                z18 = false;
                            } else {
                                z18 = false;
                            }
                            if (z18) {
                                i17 = 0;
                            }
                            dVar3 = this.O;
                            boolean z26 = !dVar3.h();
                            char c11 = '\b';
                            boolean z27 = zArr[0];
                            boolean z28 = zArr[1];
                            i29 = this.f6147n;
                            int[] iArr5 = this.B;
                            if (i29 != 2) {
                                dVar4 = dVar;
                                gVar = gVarK;
                                gVar2 = gVarK2;
                                gVar3 = gVarK5;
                                z19 = z12;
                                r4 = i15;
                                r7 = i14;
                                i30 = i26;
                            } else {
                                dVar4 = dVar;
                                gVar = gVarK;
                                gVar2 = gVarK2;
                                gVar3 = gVarK5;
                                z19 = z12;
                                r4 = i15;
                                r7 = i14;
                                i30 = i26;
                            }
                            if (z10) {
                                gVar4 = r33;
                                gVar5 = gVarK4;
                                gVar6 = gVar3;
                                i31 = 0;
                                i32 = 8;
                                z20 = true;
                                i33 = 1;
                            } else {
                                gVar4 = r33;
                                gVar5 = gVarK4;
                                gVar6 = gVar3;
                                i31 = 0;
                                i32 = 8;
                                z20 = true;
                                i33 = 1;
                            }
                            if (this.f6149o == 2) {
                                i33 = i31;
                            }
                            if (i33 != 0) {
                                gVar7 = gVar4;
                            } else {
                                gVar7 = gVar4;
                            }
                            if (z16) {
                                if (this.f6161z == 1) {
                                    float f12 = this.A;
                                    e4.b bVarL5 = cVar2.l();
                                    bVarL5.f5064d.g(gVar5, -1.0f);
                                    bVarL5.f5064d.g(gVar7, 1.0f);
                                    bVarL5.f5064d.g(gVar2, f12);
                                    bVarL5.f5064d.g(gVar, -f12);
                                    cVar2.c(bVarL5);
                                } else {
                                    float f13 = this.A;
                                    e4.b bVarL6 = cVar2.l();
                                    bVarL6.f5064d.g(gVar2, -1.0f);
                                    bVarL6.f5064d.g(gVar, 1.0f);
                                    bVarL6.f5064d.g(gVar5, f13);
                                    bVarL6.f5064d.g(gVar7, -f13);
                                    cVar2.c(bVarL6);
                                }
                            }
                            if (dVar3.h()) {
                                e eVar6 = dVar3.f6119f.f6117d;
                                float radians2 = (float) Math.toRadians(this.C + 90.0f);
                                int iE2 = dVar3.e();
                                e4.g gVarK14 = cVar2.k(i(2));
                                e4.g gVarK15 = cVar2.k(i(3));
                                e4.g gVarK16 = cVar2.k(i(4));
                                e4.g gVarK17 = cVar2.k(i(5));
                                e4.g gVarK18 = cVar2.k(eVar6.i(2));
                                e4.g gVarK19 = cVar2.k(eVar6.i(3));
                                e4.g gVarK110 = cVar2.k(eVar6.i(4));
                                e4.g gVarK111 = cVar2.k(eVar6.i(5));
                                e4.b bVarL7 = cVar2.l();
                                double d10 = radians2;
                                double dSin2 = Math.sin(d10);
                                double d11 = iE2;
                                bVarL7.f5064d.g(gVarK19, 0.5f);
                                bVarL7.f5064d.g(gVarK111, 0.5f);
                                bVarL7.f5064d.g(gVarK15, -0.5f);
                                bVarL7.f5064d.g(gVarK17, -0.5f);
                                bVarL7.f5062b = -((float) (dSin2 * d11));
                                cVar2.c(bVarL7);
                                e4.b bVarL8 = cVar2.l();
                                float fCos2 = (float) (Math.cos(d10) * d11);
                                bVarL8.f5064d.g(gVarK18, 0.5f);
                                bVarL8.f5064d.g(gVarK110, 0.5f);
                                bVarL8.f5064d.g(gVarK14, -0.5f);
                                bVarL8.f5064d.g(gVarK16, -0.5f);
                                bVarL8.f5062b = -fCos2;
                                cVar2.c(bVarL8);
                            }
                            this.f6141j = false;
                            this.f6143k = false;
                        }
                        if (i22 != 3 && i35 == 3) {
                            this.f6161z = 1;
                            if (i41 == -1) {
                                this.A = 1.0f / f3;
                            }
                            i25 = (int) (this.A * i16);
                            if (i21 != 3) {
                                i26 = i26;
                                i27 = 4;
                            }
                        }
                        z16 = true;
                        i27 = i35;
                        int[] iArr6 = this.f6154s;
                        iArr6[0] = i26;
                        iArr6[1] = i27;
                        if (z16) {
                            int i43 = this.f6161z;
                            i28 = -1;
                            boolean z29 = i43 != 0 || i43 == -1;
                            if (z16 || !((i34 = this.f6161z) == 1 || i34 == i28)) {
                                z17 = false;
                            } else {
                                z17 = true;
                            }
                            if (iArr[0] == 2 || !(this instanceof f)) {
                                z18 = false;
                            } else {
                                z18 = true;
                            }
                            if (z18) {
                                i17 = 0;
                            }
                            dVar3 = this.O;
                            boolean z210 = !dVar3.h();
                            char c12 = '\b';
                            boolean z211 = zArr[0];
                            boolean z212 = zArr[1];
                            i29 = this.f6147n;
                            int[] iArr7 = this.B;
                            if (i29 != 2 || this.f6141j) {
                                dVar4 = dVar;
                                gVar = gVarK;
                                gVar2 = gVarK2;
                                gVar3 = gVarK5;
                                z19 = z12;
                                r4 = i15;
                                r7 = i14;
                                i30 = i26;
                            } else {
                                if (z10 && (jVar = this.f6129d) != null) {
                                    h4.e eVar7 = jVar.f6605h;
                                    if (eVar7.f6585j && jVar.f6606i.f6585j) {
                                        if (z10) {
                                            cVar2.d(gVarK, eVar7.f6582g);
                                            cVar2.d(gVarK2, this.f6129d.f6606i.f6582g);
                                            if (this.S != null && i15 != 0 && zArr3[0] && !u()) {
                                                cVar2.f(cVar2.k(this.S.J), gVarK2, 0, 8);
                                            }
                                        }
                                        dVar4 = dVar;
                                        gVar = gVarK;
                                        gVar2 = gVarK2;
                                        gVar3 = gVarK5;
                                        z19 = z12;
                                        r4 = i15;
                                        r7 = i14;
                                        i30 = i26;
                                    } else {
                                        c12 = '\b';
                                    }
                                }
                                e eVar8 = this.S;
                                e4.g gVarK20 = eVar8 != null ? cVar2.k(eVar8.J) : null;
                                e eVar9 = this.S;
                                e4.g gVarK21 = eVar9 != null ? cVar2.k(eVar9.H) : null;
                                ?? r10 = i15;
                                i30 = i26;
                                z19 = z12;
                                boolean z30 = z29;
                                gVar = gVarK;
                                ?? r11 = i14;
                                gVar2 = gVarK2;
                                dVar4 = dVar;
                                gVar3 = gVarK5;
                                cVar2 = cVar;
                                d(cVar2, true, r10, r11, zArr3[0], gVarK21, gVarK20, iArr[0], z18, this.H, this.J, this.X, i17, this.f6124a0, iArr7[0], this.f6128c0, z30, iArr[1] == 3, z19, z13, z211, i30, i27, this.f6155t, this.f6156u, this.f6157v, z210);
                                r4 = r10;
                                r7 = r11;
                            }
                            if (z10 || (lVar = this.f6131e) == null) {
                                gVar4 = r33;
                                gVar5 = gVarK4;
                                gVar6 = gVar3;
                                i31 = 0;
                                i32 = 8;
                                z20 = true;
                                i33 = 1;
                            } else {
                                h4.e eVar10 = lVar.f6605h;
                                if (eVar10.f6585j && lVar.f6606i.f6585j) {
                                    int i44 = eVar10.f6582g;
                                    gVar4 = gVarK3;
                                    cVar2.d(gVar4, i44);
                                    gVar5 = gVarK4;
                                    cVar2.d(gVar5, this.f6131e.f6606i.f6582g);
                                    gVar6 = gVar3;
                                    cVar2.d(gVar6, this.f6131e.f6591k.f6582g);
                                    e eVar11 = this.S;
                                    if (eVar11 == null || z13 || r7 == 0) {
                                        i31 = 0;
                                        i32 = 8;
                                        z21 = true;
                                    } else {
                                        z21 = true;
                                        z21 = true;
                                        if (zArr3[1]) {
                                            i31 = 0;
                                            i32 = 8;
                                            cVar2.f(cVar2.k(eVar11.K), gVar5, 0, 8);
                                        } else {
                                            i31 = 0;
                                            i32 = 8;
                                        }
                                    }
                                    i33 = i31;
                                    z20 = z21;
                                } else {
                                    gVar4 = r33;
                                    gVar5 = gVarK4;
                                    gVar6 = gVar3;
                                    i31 = 0;
                                    i32 = 8;
                                    z20 = true;
                                    i33 = 1;
                                }
                            }
                            if (this.f6149o == 2) {
                                i33 = i31;
                            }
                            if (i33 != 0 || this.f6143k) {
                                gVar7 = gVar4;
                            } else {
                                int i45 = (iArr[z20 ? 1 : 0] == 2 && (this instanceof f)) ? z20 ? 1 : 0 : i31;
                                int i46 = i45 != 0 ? i31 : i25;
                                e eVar12 = this.S;
                                e4.g gVarK22 = eVar12 != null ? cVar2.k(eVar12.K) : null;
                                e eVar13 = this.S;
                                e4.g gVarK23 = eVar13 != null ? cVar2.k(eVar13.I) : null;
                                int i47 = this.Z;
                                if (i47 <= 0) {
                                    r27 = z210;
                                    if (this.f6134f0 == i32) {
                                        dVar5 = dVar4;
                                        if (dVar5.f6119f != null) {
                                            cVar2.e(gVar6, gVar4, i47, i32);
                                            cVar2.e(gVar6, cVar2.k(dVar5.f6119f), dVar5.e(), i32);
                                            if (r7 != 0) {
                                                cVar2.f(gVarK22, cVar2.k(dVar2), i31, 5);
                                            }
                                            r27 = i31;
                                        } else if (this.f6134f0 == i32) {
                                            cVar2.e(gVar6, gVar4, dVar5.e(), i32);
                                            r27 = z210;
                                        } else {
                                            cVar2.e(gVar6, gVar4, i47, i32);
                                            r27 = z210;
                                        }
                                    }
                                } else {
                                    dVar5 = dVar4;
                                    if (dVar5.f6119f != null) {
                                        cVar2.e(gVar6, gVar4, i47, i32);
                                        cVar2.e(gVar6, cVar2.k(dVar5.f6119f), dVar5.e(), i32);
                                        if (r7 != 0) {
                                            cVar2.f(gVarK22, cVar2.k(dVar2), i31, 5);
                                        }
                                        r27 = i31;
                                    } else if (this.f6134f0 == i32) {
                                        cVar2.e(gVar6, gVar4, dVar5.e(), i32);
                                        r27 = z210;
                                    } else {
                                        cVar2.e(gVar6, gVar4, i47, i32);
                                        r27 = z210;
                                    }
                                }
                                boolean z31 = zArr3[z20 ? 1 : 0];
                                int i48 = i31;
                                int i49 = iArr[z20 ? 1 : 0];
                                int i50 = this.Y;
                                int i51 = this.f6126b0;
                                int i52 = iArr7[z20 ? 1 : 0];
                                float f14 = this.f6130d0;
                                int i53 = iArr[i48];
                                boolean z32 = z20 ? 1 : 0;
                                ?? r18 = z20;
                                if (i53 != 3) {
                                    r18 = i48;
                                }
                                gVar7 = gVar4;
                                cVar2 = cVar;
                                d(cVar2, false, r7, r4, z31, gVarK23, gVarK22, i49, i45, this.I, this.K, i50, i46, i51, i52, f14, z17, r18, z13, z19, z212, i27, i30, this.f6158w, this.f6159x, this.f6160y, r27);
                            }
                            if (z16) {
                                if (this.f6161z == 1) {
                                    float f15 = this.A;
                                    e4.b bVarL9 = cVar2.l();
                                    bVarL9.f5064d.g(gVar5, -1.0f);
                                    bVarL9.f5064d.g(gVar7, 1.0f);
                                    bVarL9.f5064d.g(gVar2, f15);
                                    bVarL9.f5064d.g(gVar, -f15);
                                    cVar2.c(bVarL9);
                                } else {
                                    float f16 = this.A;
                                    e4.b bVarL10 = cVar2.l();
                                    bVarL10.f5064d.g(gVar2, -1.0f);
                                    bVarL10.f5064d.g(gVar, 1.0f);
                                    bVarL10.f5064d.g(gVar5, f16);
                                    bVarL10.f5064d.g(gVar7, -f16);
                                    cVar2.c(bVarL10);
                                }
                            }
                            if (dVar3.h()) {
                                e eVar14 = dVar3.f6119f.f6117d;
                                float radians3 = (float) Math.toRadians(this.C + 90.0f);
                                int iE3 = dVar3.e();
                                e4.g gVarK112 = cVar2.k(i(2));
                                e4.g gVarK113 = cVar2.k(i(3));
                                e4.g gVarK114 = cVar2.k(i(4));
                                e4.g gVarK115 = cVar2.k(i(5));
                                e4.g gVarK116 = cVar2.k(eVar14.i(2));
                                e4.g gVarK117 = cVar2.k(eVar14.i(3));
                                e4.g gVarK118 = cVar2.k(eVar14.i(4));
                                e4.g gVarK119 = cVar2.k(eVar14.i(5));
                                e4.b bVarL11 = cVar2.l();
                                double d12 = radians3;
                                double dSin3 = Math.sin(d12);
                                double d13 = iE3;
                                bVarL11.f5064d.g(gVarK117, 0.5f);
                                bVarL11.f5064d.g(gVarK119, 0.5f);
                                bVarL11.f5064d.g(gVarK113, -0.5f);
                                bVarL11.f5064d.g(gVarK115, -0.5f);
                                bVarL11.f5062b = -((float) (dSin3 * d13));
                                cVar2.c(bVarL11);
                                e4.b bVarL12 = cVar2.l();
                                float fCos3 = (float) (Math.cos(d12) * d13);
                                bVarL12.f5064d.g(gVarK116, 0.5f);
                                bVarL12.f5064d.g(gVarK118, 0.5f);
                                bVarL12.f5064d.g(gVarK112, -0.5f);
                                bVarL12.f5064d.g(gVarK114, -0.5f);
                                bVarL12.f5062b = -fCos3;
                                cVar2.c(bVarL12);
                            }
                            this.f6141j = false;
                            this.f6143k = false;
                        }
                        i28 = -1;
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (iArr[0] == 2) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i17 = 0;
                        }
                        dVar3 = this.O;
                        boolean z213 = !dVar3.h();
                        char c13 = '\b';
                        boolean z214 = zArr[0];
                        boolean z215 = zArr[1];
                        i29 = this.f6147n;
                        int[] iArr8 = this.B;
                        if (i29 != 2) {
                            dVar4 = dVar;
                            gVar = gVarK;
                            gVar2 = gVarK2;
                            gVar3 = gVarK5;
                            z19 = z12;
                            r4 = i15;
                            r7 = i14;
                            i30 = i26;
                        } else {
                            dVar4 = dVar;
                            gVar = gVarK;
                            gVar2 = gVarK2;
                            gVar3 = gVarK5;
                            z19 = z12;
                            r4 = i15;
                            r7 = i14;
                            i30 = i26;
                        }
                        if (z10) {
                            gVar4 = r33;
                            gVar5 = gVarK4;
                            gVar6 = gVar3;
                            i31 = 0;
                            i32 = 8;
                            z20 = true;
                            i33 = 1;
                        } else {
                            gVar4 = r33;
                            gVar5 = gVarK4;
                            gVar6 = gVar3;
                            i31 = 0;
                            i32 = 8;
                            z20 = true;
                            i33 = 1;
                        }
                        if (this.f6149o == 2) {
                            i33 = i31;
                        }
                        if (i33 != 0) {
                            gVar7 = gVar4;
                        } else {
                            gVar7 = gVar4;
                        }
                        if (z16) {
                            if (this.f6161z == 1) {
                                float f17 = this.A;
                                e4.b bVarL13 = cVar2.l();
                                bVarL13.f5064d.g(gVar5, -1.0f);
                                bVarL13.f5064d.g(gVar7, 1.0f);
                                bVarL13.f5064d.g(gVar2, f17);
                                bVarL13.f5064d.g(gVar, -f17);
                                cVar2.c(bVarL13);
                            } else {
                                float f18 = this.A;
                                e4.b bVarL14 = cVar2.l();
                                bVarL14.f5064d.g(gVar2, -1.0f);
                                bVarL14.f5064d.g(gVar, 1.0f);
                                bVarL14.f5064d.g(gVar5, f18);
                                bVarL14.f5064d.g(gVar7, -f18);
                                cVar2.c(bVarL14);
                            }
                        }
                        if (dVar3.h()) {
                            e eVar15 = dVar3.f6119f.f6117d;
                            float radians4 = (float) Math.toRadians(this.C + 90.0f);
                            int iE4 = dVar3.e();
                            e4.g gVarK1110 = cVar2.k(i(2));
                            e4.g gVarK1111 = cVar2.k(i(3));
                            e4.g gVarK1112 = cVar2.k(i(4));
                            e4.g gVarK1113 = cVar2.k(i(5));
                            e4.g gVarK1114 = cVar2.k(eVar15.i(2));
                            e4.g gVarK1115 = cVar2.k(eVar15.i(3));
                            e4.g gVarK1116 = cVar2.k(eVar15.i(4));
                            e4.g gVarK1117 = cVar2.k(eVar15.i(5));
                            e4.b bVarL15 = cVar2.l();
                            double d14 = radians4;
                            double dSin4 = Math.sin(d14);
                            double d15 = iE4;
                            bVarL15.f5064d.g(gVarK1115, 0.5f);
                            bVarL15.f5064d.g(gVarK1117, 0.5f);
                            bVarL15.f5064d.g(gVarK1111, -0.5f);
                            bVarL15.f5064d.g(gVarK1113, -0.5f);
                            bVarL15.f5062b = -((float) (dSin4 * d15));
                            cVar2.c(bVarL15);
                            e4.b bVarL16 = cVar2.l();
                            float fCos4 = (float) (Math.cos(d14) * d15);
                            bVarL16.f5064d.g(gVarK1114, 0.5f);
                            bVarL16.f5064d.g(gVarK1116, 0.5f);
                            bVarL16.f5064d.g(gVarK1110, -0.5f);
                            bVarL16.f5064d.g(gVarK1112, -0.5f);
                            bVarL16.f5062b = -fCos4;
                            cVar2.c(bVarL16);
                        }
                        this.f6141j = false;
                        this.f6143k = false;
                    }
                    if (i41 == -1) {
                        if (z14 && !z15) {
                            this.f6161z = 0;
                        } else if (!z14 && z15) {
                            this.f6161z = 1;
                            if (i41 == -1) {
                                this.A = 1.0f / f3;
                            }
                        }
                    }
                    if (this.f6161z == 0 && (!dVar8.h() || !dVar2.h())) {
                        this.f6161z = 1;
                    } else if (this.f6161z == 1 && (!dVar6.h() || !dVar7.h())) {
                        this.f6161z = 0;
                    }
                    if (this.f6161z == -1 && (!dVar8.h() || !dVar2.h() || !dVar6.h() || !dVar7.h())) {
                        if (dVar8.h() && dVar2.h()) {
                            this.f6161z = 0;
                        } else if (dVar6.h() && dVar7.h()) {
                            this.A = 1.0f / this.A;
                            this.f6161z = 1;
                        }
                    }
                    if (this.f6161z == -1) {
                        int i54 = this.f6155t;
                        if (i54 > 0 && this.f6158w == 0) {
                            this.f6161z = 0;
                        } else if (i54 == 0 && this.f6158w > 0) {
                            this.A = 1.0f / this.A;
                            this.f6161z = 1;
                        }
                    }
                    i25 = i20;
                    z16 = true;
                    i27 = i35;
                    int[] iArr9 = this.f6154s;
                    iArr9[0] = i26;
                    iArr9[1] = i27;
                    if (z16) {
                        int i410 = this.f6161z;
                        i28 = -1;
                        if (i410 != 0) {
                        }
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        if (iArr[0] == 2) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i17 = 0;
                        }
                        dVar3 = this.O;
                        boolean z216 = !dVar3.h();
                        char c14 = '\b';
                        boolean z217 = zArr[0];
                        boolean z218 = zArr[1];
                        i29 = this.f6147n;
                        int[] iArr10 = this.B;
                        if (i29 != 2) {
                            dVar4 = dVar;
                            gVar = gVarK;
                            gVar2 = gVarK2;
                            gVar3 = gVarK5;
                            z19 = z12;
                            r4 = i15;
                            r7 = i14;
                            i30 = i26;
                        } else {
                            dVar4 = dVar;
                            gVar = gVarK;
                            gVar2 = gVarK2;
                            gVar3 = gVarK5;
                            z19 = z12;
                            r4 = i15;
                            r7 = i14;
                            i30 = i26;
                        }
                        if (z10) {
                            gVar4 = r33;
                            gVar5 = gVarK4;
                            gVar6 = gVar3;
                            i31 = 0;
                            i32 = 8;
                            z20 = true;
                            i33 = 1;
                        } else {
                            gVar4 = r33;
                            gVar5 = gVarK4;
                            gVar6 = gVar3;
                            i31 = 0;
                            i32 = 8;
                            z20 = true;
                            i33 = 1;
                        }
                        if (this.f6149o == 2) {
                            i33 = i31;
                        }
                        if (i33 != 0) {
                            gVar7 = gVar4;
                        } else {
                            gVar7 = gVar4;
                        }
                        if (z16) {
                            if (this.f6161z == 1) {
                                float f19 = this.A;
                                e4.b bVarL17 = cVar2.l();
                                bVarL17.f5064d.g(gVar5, -1.0f);
                                bVarL17.f5064d.g(gVar7, 1.0f);
                                bVarL17.f5064d.g(gVar2, f19);
                                bVarL17.f5064d.g(gVar, -f19);
                                cVar2.c(bVarL17);
                            } else {
                                float f110 = this.A;
                                e4.b bVarL18 = cVar2.l();
                                bVarL18.f5064d.g(gVar2, -1.0f);
                                bVarL18.f5064d.g(gVar, 1.0f);
                                bVarL18.f5064d.g(gVar5, f110);
                                bVarL18.f5064d.g(gVar7, -f110);
                                cVar2.c(bVarL18);
                            }
                        }
                        if (dVar3.h()) {
                            e eVar16 = dVar3.f6119f.f6117d;
                            float radians5 = (float) Math.toRadians(this.C + 90.0f);
                            int iE5 = dVar3.e();
                            e4.g gVarK1118 = cVar2.k(i(2));
                            e4.g gVarK1119 = cVar2.k(i(3));
                            e4.g gVarK11110 = cVar2.k(i(4));
                            e4.g gVarK11111 = cVar2.k(i(5));
                            e4.g gVarK11112 = cVar2.k(eVar16.i(2));
                            e4.g gVarK11113 = cVar2.k(eVar16.i(3));
                            e4.g gVarK11114 = cVar2.k(eVar16.i(4));
                            e4.g gVarK11115 = cVar2.k(eVar16.i(5));
                            e4.b bVarL19 = cVar2.l();
                            double d16 = radians5;
                            double dSin5 = Math.sin(d16);
                            double d17 = iE5;
                            bVarL19.f5064d.g(gVarK11113, 0.5f);
                            bVarL19.f5064d.g(gVarK11115, 0.5f);
                            bVarL19.f5064d.g(gVarK1119, -0.5f);
                            bVarL19.f5064d.g(gVarK11111, -0.5f);
                            bVarL19.f5062b = -((float) (dSin5 * d17));
                            cVar2.c(bVarL19);
                            e4.b bVarL110 = cVar2.l();
                            float fCos5 = (float) (Math.cos(d16) * d17);
                            bVarL110.f5064d.g(gVarK11112, 0.5f);
                            bVarL110.f5064d.g(gVarK11114, 0.5f);
                            bVarL110.f5064d.g(gVarK1118, -0.5f);
                            bVarL110.f5064d.g(gVarK11110, -0.5f);
                            bVarL110.f5062b = -fCos5;
                            cVar2.c(bVarL110);
                        }
                        this.f6141j = false;
                        this.f6143k = false;
                    }
                    i28 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (iArr[0] == 2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i17 = 0;
                    }
                    dVar3 = this.O;
                    boolean z219 = !dVar3.h();
                    char c15 = '\b';
                    boolean z2110 = zArr[0];
                    boolean z2111 = zArr[1];
                    i29 = this.f6147n;
                    int[] iArr11 = this.B;
                    if (i29 != 2) {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    } else {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    }
                    if (z10) {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    } else {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    }
                    if (this.f6149o == 2) {
                        i33 = i31;
                    }
                    if (i33 != 0) {
                        gVar7 = gVar4;
                    } else {
                        gVar7 = gVar4;
                    }
                    if (z16) {
                        if (this.f6161z == 1) {
                            float f111 = this.A;
                            e4.b bVarL111 = cVar2.l();
                            bVarL111.f5064d.g(gVar5, -1.0f);
                            bVarL111.f5064d.g(gVar7, 1.0f);
                            bVarL111.f5064d.g(gVar2, f111);
                            bVarL111.f5064d.g(gVar, -f111);
                            cVar2.c(bVarL111);
                        } else {
                            float f112 = this.A;
                            e4.b bVarL112 = cVar2.l();
                            bVarL112.f5064d.g(gVar2, -1.0f);
                            bVarL112.f5064d.g(gVar, 1.0f);
                            bVarL112.f5064d.g(gVar5, f112);
                            bVarL112.f5064d.g(gVar7, -f112);
                            cVar2.c(bVarL112);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar17 = dVar3.f6119f.f6117d;
                        float radians6 = (float) Math.toRadians(this.C + 90.0f);
                        int iE6 = dVar3.e();
                        e4.g gVarK11116 = cVar2.k(i(2));
                        e4.g gVarK11117 = cVar2.k(i(3));
                        e4.g gVarK11118 = cVar2.k(i(4));
                        e4.g gVarK11119 = cVar2.k(i(5));
                        e4.g gVarK111110 = cVar2.k(eVar17.i(2));
                        e4.g gVarK111111 = cVar2.k(eVar17.i(3));
                        e4.g gVarK111112 = cVar2.k(eVar17.i(4));
                        e4.g gVarK111113 = cVar2.k(eVar17.i(5));
                        e4.b bVarL113 = cVar2.l();
                        double d18 = radians6;
                        double dSin6 = Math.sin(d18);
                        double d19 = iE6;
                        bVarL113.f5064d.g(gVarK111111, 0.5f);
                        bVarL113.f5064d.g(gVarK111113, 0.5f);
                        bVarL113.f5064d.g(gVarK11117, -0.5f);
                        bVarL113.f5064d.g(gVarK11119, -0.5f);
                        bVarL113.f5062b = -((float) (dSin6 * d19));
                        cVar2.c(bVarL113);
                        e4.b bVarL114 = cVar2.l();
                        float fCos6 = (float) (Math.cos(d18) * d19);
                        bVarL114.f5064d.g(gVarK111110, 0.5f);
                        bVarL114.f5064d.g(gVarK111112, 0.5f);
                        bVarL114.f5064d.g(gVarK11116, -0.5f);
                        bVarL114.f5064d.g(gVarK11118, -0.5f);
                        bVarL114.f5062b = -fCos6;
                        cVar2.c(bVarL114);
                    }
                    this.f6141j = false;
                    this.f6143k = false;
                }
                z16 = false;
                int[] iArr12 = this.f6154s;
                iArr12[0] = i26;
                iArr12[1] = i27;
                if (z16) {
                    int i411 = this.f6161z;
                    i28 = -1;
                    if (i411 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (iArr[0] == 2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i17 = 0;
                    }
                    dVar3 = this.O;
                    boolean z2112 = !dVar3.h();
                    char c16 = '\b';
                    boolean z2113 = zArr[0];
                    boolean z2114 = zArr[1];
                    i29 = this.f6147n;
                    int[] iArr13 = this.B;
                    if (i29 != 2) {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    } else {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    }
                    if (z10) {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    } else {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    }
                    if (this.f6149o == 2) {
                        i33 = i31;
                    }
                    if (i33 != 0) {
                        gVar7 = gVar4;
                    } else {
                        gVar7 = gVar4;
                    }
                    if (z16) {
                        if (this.f6161z == 1) {
                            float f113 = this.A;
                            e4.b bVarL115 = cVar2.l();
                            bVarL115.f5064d.g(gVar5, -1.0f);
                            bVarL115.f5064d.g(gVar7, 1.0f);
                            bVarL115.f5064d.g(gVar2, f113);
                            bVarL115.f5064d.g(gVar, -f113);
                            cVar2.c(bVarL115);
                        } else {
                            float f114 = this.A;
                            e4.b bVarL116 = cVar2.l();
                            bVarL116.f5064d.g(gVar2, -1.0f);
                            bVarL116.f5064d.g(gVar, 1.0f);
                            bVarL116.f5064d.g(gVar5, f114);
                            bVarL116.f5064d.g(gVar7, -f114);
                            cVar2.c(bVarL116);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar18 = dVar3.f6119f.f6117d;
                        float radians7 = (float) Math.toRadians(this.C + 90.0f);
                        int iE7 = dVar3.e();
                        e4.g gVarK111114 = cVar2.k(i(2));
                        e4.g gVarK111115 = cVar2.k(i(3));
                        e4.g gVarK111116 = cVar2.k(i(4));
                        e4.g gVarK111117 = cVar2.k(i(5));
                        e4.g gVarK111118 = cVar2.k(eVar18.i(2));
                        e4.g gVarK111119 = cVar2.k(eVar18.i(3));
                        e4.g gVarK1111110 = cVar2.k(eVar18.i(4));
                        e4.g gVarK1111111 = cVar2.k(eVar18.i(5));
                        e4.b bVarL117 = cVar2.l();
                        double d110 = radians7;
                        double dSin7 = Math.sin(d110);
                        double d111 = iE7;
                        bVarL117.f5064d.g(gVarK111119, 0.5f);
                        bVarL117.f5064d.g(gVarK1111111, 0.5f);
                        bVarL117.f5064d.g(gVarK111115, -0.5f);
                        bVarL117.f5064d.g(gVarK111117, -0.5f);
                        bVarL117.f5062b = -((float) (dSin7 * d111));
                        cVar2.c(bVarL117);
                        e4.b bVarL118 = cVar2.l();
                        float fCos7 = (float) (Math.cos(d110) * d111);
                        bVarL118.f5064d.g(gVarK111118, 0.5f);
                        bVarL118.f5064d.g(gVarK1111110, 0.5f);
                        bVarL118.f5064d.g(gVarK111114, -0.5f);
                        bVarL118.f5064d.g(gVarK111116, -0.5f);
                        bVarL118.f5062b = -fCos7;
                        cVar2.c(bVarL118);
                    }
                    this.f6141j = false;
                    this.f6143k = false;
                }
                i28 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (iArr[0] == 2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i17 = 0;
                }
                dVar3 = this.O;
                boolean z2115 = !dVar3.h();
                char c17 = '\b';
                boolean z2116 = zArr[0];
                boolean z2117 = zArr[1];
                i29 = this.f6147n;
                int[] iArr14 = this.B;
                if (i29 != 2) {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                } else {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                }
                if (z10) {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                } else {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                }
                if (this.f6149o == 2) {
                    i33 = i31;
                }
                if (i33 != 0) {
                    gVar7 = gVar4;
                } else {
                    gVar7 = gVar4;
                }
                if (z16) {
                    if (this.f6161z == 1) {
                        float f115 = this.A;
                        e4.b bVarL119 = cVar2.l();
                        bVarL119.f5064d.g(gVar5, -1.0f);
                        bVarL119.f5064d.g(gVar7, 1.0f);
                        bVarL119.f5064d.g(gVar2, f115);
                        bVarL119.f5064d.g(gVar, -f115);
                        cVar2.c(bVarL119);
                    } else {
                        float f116 = this.A;
                        e4.b bVarL1110 = cVar2.l();
                        bVarL1110.f5064d.g(gVar2, -1.0f);
                        bVarL1110.f5064d.g(gVar, 1.0f);
                        bVarL1110.f5064d.g(gVar5, f116);
                        bVarL1110.f5064d.g(gVar7, -f116);
                        cVar2.c(bVarL1110);
                    }
                }
                if (dVar3.h()) {
                    e eVar19 = dVar3.f6119f.f6117d;
                    float radians8 = (float) Math.toRadians(this.C + 90.0f);
                    int iE8 = dVar3.e();
                    e4.g gVarK1111112 = cVar2.k(i(2));
                    e4.g gVarK1111113 = cVar2.k(i(3));
                    e4.g gVarK1111114 = cVar2.k(i(4));
                    e4.g gVarK1111115 = cVar2.k(i(5));
                    e4.g gVarK1111116 = cVar2.k(eVar19.i(2));
                    e4.g gVarK1111117 = cVar2.k(eVar19.i(3));
                    e4.g gVarK1111118 = cVar2.k(eVar19.i(4));
                    e4.g gVarK1111119 = cVar2.k(eVar19.i(5));
                    e4.b bVarL1111 = cVar2.l();
                    double d112 = radians8;
                    double dSin8 = Math.sin(d112);
                    double d113 = iE8;
                    bVarL1111.f5064d.g(gVarK1111117, 0.5f);
                    bVarL1111.f5064d.g(gVarK1111119, 0.5f);
                    bVarL1111.f5064d.g(gVarK1111113, -0.5f);
                    bVarL1111.f5064d.g(gVarK1111115, -0.5f);
                    bVarL1111.f5062b = -((float) (dSin8 * d113));
                    cVar2.c(bVarL1111);
                    e4.b bVarL1112 = cVar2.l();
                    float fCos8 = (float) (Math.cos(d112) * d113);
                    bVarL1112.f5064d.g(gVarK1111116, 0.5f);
                    bVarL1112.f5064d.g(gVarK1111118, 0.5f);
                    bVarL1112.f5064d.g(gVarK1111112, -0.5f);
                    bVarL1112.f5064d.g(gVarK1111114, -0.5f);
                    bVarL1112.f5062b = -fCos8;
                    cVar2.c(bVarL1112);
                }
                this.f6141j = false;
                this.f6143k = false;
            }
            dVar2 = dVar9;
            gVarK4 = gVarK4;
            i25 = i20;
            i26 = i23;
            i27 = i24;
            z16 = false;
            int[] iArr15 = this.f6154s;
            iArr15[0] = i26;
            iArr15[1] = i27;
            if (z16) {
                int i412 = this.f6161z;
                i28 = -1;
                if (i412 != 0) {
                }
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (iArr[0] == 2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i17 = 0;
                }
                dVar3 = this.O;
                boolean z2118 = !dVar3.h();
                char c18 = '\b';
                boolean z2119 = zArr[0];
                boolean z21110 = zArr[1];
                i29 = this.f6147n;
                int[] iArr16 = this.B;
                if (i29 != 2) {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                } else {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                }
                if (z10) {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                } else {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                }
                if (this.f6149o == 2) {
                    i33 = i31;
                }
                if (i33 != 0) {
                    gVar7 = gVar4;
                } else {
                    gVar7 = gVar4;
                }
                if (z16) {
                    if (this.f6161z == 1) {
                        float f117 = this.A;
                        e4.b bVarL1113 = cVar2.l();
                        bVarL1113.f5064d.g(gVar5, -1.0f);
                        bVarL1113.f5064d.g(gVar7, 1.0f);
                        bVarL1113.f5064d.g(gVar2, f117);
                        bVarL1113.f5064d.g(gVar, -f117);
                        cVar2.c(bVarL1113);
                    } else {
                        float f118 = this.A;
                        e4.b bVarL1114 = cVar2.l();
                        bVarL1114.f5064d.g(gVar2, -1.0f);
                        bVarL1114.f5064d.g(gVar, 1.0f);
                        bVarL1114.f5064d.g(gVar5, f118);
                        bVarL1114.f5064d.g(gVar7, -f118);
                        cVar2.c(bVarL1114);
                    }
                }
                if (dVar3.h()) {
                    e eVar110 = dVar3.f6119f.f6117d;
                    float radians9 = (float) Math.toRadians(this.C + 90.0f);
                    int iE9 = dVar3.e();
                    e4.g gVarK11111110 = cVar2.k(i(2));
                    e4.g gVarK11111111 = cVar2.k(i(3));
                    e4.g gVarK11111112 = cVar2.k(i(4));
                    e4.g gVarK11111113 = cVar2.k(i(5));
                    e4.g gVarK11111114 = cVar2.k(eVar110.i(2));
                    e4.g gVarK11111115 = cVar2.k(eVar110.i(3));
                    e4.g gVarK11111116 = cVar2.k(eVar110.i(4));
                    e4.g gVarK11111117 = cVar2.k(eVar110.i(5));
                    e4.b bVarL1115 = cVar2.l();
                    double d114 = radians9;
                    double dSin9 = Math.sin(d114);
                    double d115 = iE9;
                    bVarL1115.f5064d.g(gVarK11111115, 0.5f);
                    bVarL1115.f5064d.g(gVarK11111117, 0.5f);
                    bVarL1115.f5064d.g(gVarK11111111, -0.5f);
                    bVarL1115.f5064d.g(gVarK11111113, -0.5f);
                    bVarL1115.f5062b = -((float) (dSin9 * d115));
                    cVar2.c(bVarL1115);
                    e4.b bVarL1116 = cVar2.l();
                    float fCos9 = (float) (Math.cos(d114) * d115);
                    bVarL1116.f5064d.g(gVarK11111114, 0.5f);
                    bVarL1116.f5064d.g(gVarK11111116, 0.5f);
                    bVarL1116.f5064d.g(gVarK11111110, -0.5f);
                    bVarL1116.f5064d.g(gVarK11111112, -0.5f);
                    bVarL1116.f5062b = -fCos9;
                    cVar2.c(bVarL1116);
                }
                this.f6141j = false;
                this.f6143k = false;
            }
            i28 = -1;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (iArr[0] == 2) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i17 = 0;
            }
            dVar3 = this.O;
            boolean z21111 = !dVar3.h();
            char c19 = '\b';
            boolean z21112 = zArr[0];
            boolean z21113 = zArr[1];
            i29 = this.f6147n;
            int[] iArr17 = this.B;
            if (i29 != 2) {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            } else {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            }
            if (z10) {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            } else {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            }
            if (this.f6149o == 2) {
                i33 = i31;
            }
            if (i33 != 0) {
                gVar7 = gVar4;
            } else {
                gVar7 = gVar4;
            }
            if (z16) {
                if (this.f6161z == 1) {
                    float f119 = this.A;
                    e4.b bVarL1117 = cVar2.l();
                    bVarL1117.f5064d.g(gVar5, -1.0f);
                    bVarL1117.f5064d.g(gVar7, 1.0f);
                    bVarL1117.f5064d.g(gVar2, f119);
                    bVarL1117.f5064d.g(gVar, -f119);
                    cVar2.c(bVarL1117);
                } else {
                    float f1110 = this.A;
                    e4.b bVarL1118 = cVar2.l();
                    bVarL1118.f5064d.g(gVar2, -1.0f);
                    bVarL1118.f5064d.g(gVar, 1.0f);
                    bVarL1118.f5064d.g(gVar5, f1110);
                    bVarL1118.f5064d.g(gVar7, -f1110);
                    cVar2.c(bVarL1118);
                }
            }
            if (dVar3.h()) {
                e eVar111 = dVar3.f6119f.f6117d;
                float radians10 = (float) Math.toRadians(this.C + 90.0f);
                int iE10 = dVar3.e();
                e4.g gVarK11111118 = cVar2.k(i(2));
                e4.g gVarK11111119 = cVar2.k(i(3));
                e4.g gVarK111111110 = cVar2.k(i(4));
                e4.g gVarK111111111 = cVar2.k(i(5));
                e4.g gVarK111111112 = cVar2.k(eVar111.i(2));
                e4.g gVarK111111113 = cVar2.k(eVar111.i(3));
                e4.g gVarK111111114 = cVar2.k(eVar111.i(4));
                e4.g gVarK111111115 = cVar2.k(eVar111.i(5));
                e4.b bVarL1119 = cVar2.l();
                double d116 = radians10;
                double dSin10 = Math.sin(d116);
                double d117 = iE10;
                bVarL1119.f5064d.g(gVarK111111113, 0.5f);
                bVarL1119.f5064d.g(gVarK111111115, 0.5f);
                bVarL1119.f5064d.g(gVarK11111119, -0.5f);
                bVarL1119.f5064d.g(gVarK111111111, -0.5f);
                bVarL1119.f5062b = -((float) (dSin10 * d117));
                cVar2.c(bVarL1119);
                e4.b bVarL11110 = cVar2.l();
                float fCos10 = (float) (Math.cos(d116) * d117);
                bVarL11110.f5064d.g(gVarK111111112, 0.5f);
                bVarL11110.f5064d.g(gVarK111111114, 0.5f);
                bVarL11110.f5064d.g(gVarK11111118, -0.5f);
                bVarL11110.f5064d.g(gVarK111111110, -0.5f);
                bVarL11110.f5062b = -fCos10;
                cVar2.c(bVarL11110);
            }
            this.f6141j = false;
            this.f6143k = false;
        }
        i10 = 0;
        i11 = i10;
        i12 = i11;
        i13 = this.f6134f0;
        zArr = this.R;
        i14 = i11;
        if (i13 == 8) {
            arrayList = this.Q;
            size = arrayList.size();
            i15 = i12;
            i37 = i10;
            while (true) {
                if (i37 < size) {
                    if (!zArr[i10]) {
                        break;
                    } else {
                        return;
                    }
                }
                int i413 = size;
                hashSet2 = ((d) arrayList.get(i37)).f6114a;
                if (hashSet2 != null) {
                    break;
                    break;
                }
                i37++;
                size = i413;
            }
        } else {
            i15 = i12;
        }
        z11 = this.f6141j;
        if (z11) {
            if (z11) {
                cVar2.d(gVarK, this.X);
                cVar2.d(gVarK2, this.X + this.T);
                if (i15 != 0) {
                    fVar2 = (f) eVar2;
                    weakReference3 = fVar2.G0;
                    if (weakReference3 != null) {
                        fVar2.G0 = new WeakReference(dVar6);
                    } else {
                        fVar2.G0 = new WeakReference(dVar6);
                    }
                    weakReference4 = fVar2.I0;
                    if (weakReference4 != null) {
                        fVar2.I0 = new WeakReference(dVar7);
                    } else {
                        fVar2.I0 = new WeakReference(dVar7);
                    }
                }
            }
            if (this.f6143k) {
                cVar2.d(gVarK3, this.Y);
                cVar2.d(gVarK4, this.Y + this.U);
                hashSet = dVar10.f6114a;
                if (hashSet != null) {
                    cVar2.d(gVarK5, this.Y + this.Z);
                }
                if (i14 != 0) {
                    fVar = (f) eVar;
                    weakReference = fVar.F0;
                    if (weakReference != null) {
                        fVar.F0 = new WeakReference(dVar8);
                    } else {
                        fVar.F0 = new WeakReference(dVar8);
                    }
                    weakReference2 = fVar.H0;
                    if (weakReference2 != null) {
                        fVar.H0 = new WeakReference(dVar9);
                    } else {
                        fVar.H0 = new WeakReference(dVar9);
                    }
                }
            }
            if (this.f6141j) {
                ?? r13 = i10;
                this.f6141j = r13;
                this.f6143k = r13;
                return;
            }
        } else {
            if (z11) {
                cVar2.d(gVarK, this.X);
                cVar2.d(gVarK2, this.X + this.T);
                if (i15 != 0) {
                    fVar2 = (f) eVar2;
                    weakReference3 = fVar2.G0;
                    if (weakReference3 != null) {
                        fVar2.G0 = new WeakReference(dVar6);
                    } else {
                        fVar2.G0 = new WeakReference(dVar6);
                    }
                    weakReference4 = fVar2.I0;
                    if (weakReference4 != null) {
                        fVar2.I0 = new WeakReference(dVar7);
                    } else {
                        fVar2.I0 = new WeakReference(dVar7);
                    }
                }
            }
            if (this.f6143k) {
                cVar2.d(gVarK3, this.Y);
                cVar2.d(gVarK4, this.Y + this.U);
                hashSet = dVar10.f6114a;
                if (hashSet != null) {
                    cVar2.d(gVarK5, this.Y + this.Z);
                }
                if (i14 != 0) {
                    fVar = (f) eVar;
                    weakReference = fVar.F0;
                    if (weakReference != null) {
                        fVar.F0 = new WeakReference(dVar8);
                    } else {
                        fVar.F0 = new WeakReference(dVar8);
                    }
                    weakReference2 = fVar.H0;
                    if (weakReference2 != null) {
                        fVar.H0 = new WeakReference(dVar9);
                    } else {
                        fVar.H0 = new WeakReference(dVar9);
                    }
                }
            }
            if (this.f6141j) {
                ?? r14 = i10;
                this.f6141j = r14;
                this.f6143k = r14;
                return;
            }
        }
        zArr2 = this.f6133f;
        if (z10) {
            dVar = dVar10;
            zArr3 = zArr2;
        } else {
            dVar = dVar10;
            zArr3 = zArr2;
        }
        if (this.S != null) {
            if (t(0)) {
                ((f) this.S).M(this, 0);
                zU = true;
                i36 = 1;
            } else {
                zU = u();
                i36 = 1;
            }
            if (t(i36)) {
                ((f) this.S).M(this, i36);
                zV = true;
            } else {
                zV = v();
            }
            if (zU) {
            }
            if (!zV) {
                cVar2.f(cVar2.k(this.S.K), gVarK4, 0, 1);
            }
            z13 = zV;
            z12 = zU;
        } else {
            dVar6 = dVar6;
            z12 = false;
            z13 = false;
        }
        i16 = this.T;
        i17 = this.f6124a0;
        if (i16 >= i17) {
            i17 = i16;
        }
        i18 = this.U;
        i19 = this.f6126b0;
        if (i18 < i19) {
            i20 = i19;
        } else {
            i20 = i18;
        }
        iArr = this.f6150o0;
        i21 = iArr[0];
        if (i21 != 3) {
            z14 = true;
        } else {
            z14 = false;
        }
        i22 = iArr[1];
        if (i22 != 3) {
            z15 = true;
        } else {
            z15 = false;
        }
        int i414 = this.W;
        this.f6161z = i414;
        f3 = this.V;
        this.A = f3;
        i23 = this.f6152q;
        i24 = this.f6153r;
        if (f3 > 0.0f) {
            dVar2 = dVar9;
            if (this.f6134f0 != 8) {
                if (i21 == 3) {
                    i26 = i23;
                } else {
                    i26 = i23;
                }
                if (i22 == 3) {
                    i35 = i24;
                } else {
                    i35 = i24;
                }
                if (i21 == 3) {
                    if (i21 != 3) {
                        if (i22 != 3) {
                            i25 = i20;
                        } else {
                            i25 = i20;
                        }
                        z16 = true;
                    } else {
                        if (i22 != 3) {
                            i25 = i20;
                        } else {
                            i25 = i20;
                        }
                        z16 = true;
                    }
                } else if (i21 != 3) {
                    if (i22 != 3) {
                        i25 = i20;
                    } else {
                        i25 = i20;
                    }
                    z16 = true;
                } else {
                    if (i22 != 3) {
                        i25 = i20;
                    } else {
                        i25 = i20;
                    }
                    z16 = true;
                }
                i27 = i35;
                int[] iArr18 = this.f6154s;
                iArr18[0] = i26;
                iArr18[1] = i27;
                if (z16) {
                    int i415 = this.f6161z;
                    i28 = -1;
                    if (i415 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    if (iArr[0] == 2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i17 = 0;
                    }
                    dVar3 = this.O;
                    boolean z21114 = !dVar3.h();
                    char c110 = '\b';
                    boolean z21115 = zArr[0];
                    boolean z21116 = zArr[1];
                    i29 = this.f6147n;
                    int[] iArr19 = this.B;
                    if (i29 != 2) {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    } else {
                        dVar4 = dVar;
                        gVar = gVarK;
                        gVar2 = gVarK2;
                        gVar3 = gVarK5;
                        z19 = z12;
                        r4 = i15;
                        r7 = i14;
                        i30 = i26;
                    }
                    if (z10) {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    } else {
                        gVar4 = r33;
                        gVar5 = gVarK4;
                        gVar6 = gVar3;
                        i31 = 0;
                        i32 = 8;
                        z20 = true;
                        i33 = 1;
                    }
                    if (this.f6149o == 2) {
                        i33 = i31;
                    }
                    if (i33 != 0) {
                        gVar7 = gVar4;
                    } else {
                        gVar7 = gVar4;
                    }
                    if (z16) {
                        if (this.f6161z == 1) {
                            float f1111 = this.A;
                            e4.b bVarL11111 = cVar2.l();
                            bVarL11111.f5064d.g(gVar5, -1.0f);
                            bVarL11111.f5064d.g(gVar7, 1.0f);
                            bVarL11111.f5064d.g(gVar2, f1111);
                            bVarL11111.f5064d.g(gVar, -f1111);
                            cVar2.c(bVarL11111);
                        } else {
                            float f1112 = this.A;
                            e4.b bVarL11112 = cVar2.l();
                            bVarL11112.f5064d.g(gVar2, -1.0f);
                            bVarL11112.f5064d.g(gVar, 1.0f);
                            bVarL11112.f5064d.g(gVar5, f1112);
                            bVarL11112.f5064d.g(gVar7, -f1112);
                            cVar2.c(bVarL11112);
                        }
                    }
                    if (dVar3.h()) {
                        e eVar112 = dVar3.f6119f.f6117d;
                        float radians11 = (float) Math.toRadians(this.C + 90.0f);
                        int iE11 = dVar3.e();
                        e4.g gVarK111111116 = cVar2.k(i(2));
                        e4.g gVarK111111117 = cVar2.k(i(3));
                        e4.g gVarK111111118 = cVar2.k(i(4));
                        e4.g gVarK111111119 = cVar2.k(i(5));
                        e4.g gVarK1111111110 = cVar2.k(eVar112.i(2));
                        e4.g gVarK1111111111 = cVar2.k(eVar112.i(3));
                        e4.g gVarK1111111112 = cVar2.k(eVar112.i(4));
                        e4.g gVarK1111111113 = cVar2.k(eVar112.i(5));
                        e4.b bVarL11113 = cVar2.l();
                        double d118 = radians11;
                        double dSin11 = Math.sin(d118);
                        double d119 = iE11;
                        bVarL11113.f5064d.g(gVarK1111111111, 0.5f);
                        bVarL11113.f5064d.g(gVarK1111111113, 0.5f);
                        bVarL11113.f5064d.g(gVarK111111117, -0.5f);
                        bVarL11113.f5064d.g(gVarK111111119, -0.5f);
                        bVarL11113.f5062b = -((float) (dSin11 * d119));
                        cVar2.c(bVarL11113);
                        e4.b bVarL11114 = cVar2.l();
                        float fCos11 = (float) (Math.cos(d118) * d119);
                        bVarL11114.f5064d.g(gVarK1111111110, 0.5f);
                        bVarL11114.f5064d.g(gVarK1111111112, 0.5f);
                        bVarL11114.f5064d.g(gVarK111111116, -0.5f);
                        bVarL11114.f5064d.g(gVarK111111118, -0.5f);
                        bVarL11114.f5062b = -fCos11;
                        cVar2.c(bVarL11114);
                    }
                    this.f6141j = false;
                    this.f6143k = false;
                }
                i28 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (iArr[0] == 2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i17 = 0;
                }
                dVar3 = this.O;
                boolean z21117 = !dVar3.h();
                char c111 = '\b';
                boolean z21118 = zArr[0];
                boolean z21119 = zArr[1];
                i29 = this.f6147n;
                int[] iArr110 = this.B;
                if (i29 != 2) {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                } else {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                }
                if (z10) {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                } else {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                }
                if (this.f6149o == 2) {
                    i33 = i31;
                }
                if (i33 != 0) {
                    gVar7 = gVar4;
                } else {
                    gVar7 = gVar4;
                }
                if (z16) {
                    if (this.f6161z == 1) {
                        float f1113 = this.A;
                        e4.b bVarL11115 = cVar2.l();
                        bVarL11115.f5064d.g(gVar5, -1.0f);
                        bVarL11115.f5064d.g(gVar7, 1.0f);
                        bVarL11115.f5064d.g(gVar2, f1113);
                        bVarL11115.f5064d.g(gVar, -f1113);
                        cVar2.c(bVarL11115);
                    } else {
                        float f1114 = this.A;
                        e4.b bVarL11116 = cVar2.l();
                        bVarL11116.f5064d.g(gVar2, -1.0f);
                        bVarL11116.f5064d.g(gVar, 1.0f);
                        bVarL11116.f5064d.g(gVar5, f1114);
                        bVarL11116.f5064d.g(gVar7, -f1114);
                        cVar2.c(bVarL11116);
                    }
                }
                if (dVar3.h()) {
                    e eVar113 = dVar3.f6119f.f6117d;
                    float radians12 = (float) Math.toRadians(this.C + 90.0f);
                    int iE12 = dVar3.e();
                    e4.g gVarK1111111114 = cVar2.k(i(2));
                    e4.g gVarK1111111115 = cVar2.k(i(3));
                    e4.g gVarK1111111116 = cVar2.k(i(4));
                    e4.g gVarK1111111117 = cVar2.k(i(5));
                    e4.g gVarK1111111118 = cVar2.k(eVar113.i(2));
                    e4.g gVarK1111111119 = cVar2.k(eVar113.i(3));
                    e4.g gVarK11111111110 = cVar2.k(eVar113.i(4));
                    e4.g gVarK11111111111 = cVar2.k(eVar113.i(5));
                    e4.b bVarL11117 = cVar2.l();
                    double d1110 = radians12;
                    double dSin12 = Math.sin(d1110);
                    double d1111 = iE12;
                    bVarL11117.f5064d.g(gVarK1111111119, 0.5f);
                    bVarL11117.f5064d.g(gVarK11111111111, 0.5f);
                    bVarL11117.f5064d.g(gVarK1111111115, -0.5f);
                    bVarL11117.f5064d.g(gVarK1111111117, -0.5f);
                    bVarL11117.f5062b = -((float) (dSin12 * d1111));
                    cVar2.c(bVarL11117);
                    e4.b bVarL11118 = cVar2.l();
                    float fCos12 = (float) (Math.cos(d1110) * d1111);
                    bVarL11118.f5064d.g(gVarK1111111118, 0.5f);
                    bVarL11118.f5064d.g(gVarK11111111110, 0.5f);
                    bVarL11118.f5064d.g(gVarK1111111114, -0.5f);
                    bVarL11118.f5064d.g(gVarK1111111116, -0.5f);
                    bVarL11118.f5062b = -fCos12;
                    cVar2.c(bVarL11118);
                }
                this.f6141j = false;
                this.f6143k = false;
            }
            z16 = false;
            int[] iArr111 = this.f6154s;
            iArr111[0] = i26;
            iArr111[1] = i27;
            if (z16) {
                int i416 = this.f6161z;
                i28 = -1;
                if (i416 != 0) {
                }
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                if (iArr[0] == 2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i17 = 0;
                }
                dVar3 = this.O;
                boolean z211110 = !dVar3.h();
                char c112 = '\b';
                boolean z211111 = zArr[0];
                boolean z211112 = zArr[1];
                i29 = this.f6147n;
                int[] iArr112 = this.B;
                if (i29 != 2) {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                } else {
                    dVar4 = dVar;
                    gVar = gVarK;
                    gVar2 = gVarK2;
                    gVar3 = gVarK5;
                    z19 = z12;
                    r4 = i15;
                    r7 = i14;
                    i30 = i26;
                }
                if (z10) {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                } else {
                    gVar4 = r33;
                    gVar5 = gVarK4;
                    gVar6 = gVar3;
                    i31 = 0;
                    i32 = 8;
                    z20 = true;
                    i33 = 1;
                }
                if (this.f6149o == 2) {
                    i33 = i31;
                }
                if (i33 != 0) {
                    gVar7 = gVar4;
                } else {
                    gVar7 = gVar4;
                }
                if (z16) {
                    if (this.f6161z == 1) {
                        float f1115 = this.A;
                        e4.b bVarL11119 = cVar2.l();
                        bVarL11119.f5064d.g(gVar5, -1.0f);
                        bVarL11119.f5064d.g(gVar7, 1.0f);
                        bVarL11119.f5064d.g(gVar2, f1115);
                        bVarL11119.f5064d.g(gVar, -f1115);
                        cVar2.c(bVarL11119);
                    } else {
                        float f1116 = this.A;
                        e4.b bVarL111110 = cVar2.l();
                        bVarL111110.f5064d.g(gVar2, -1.0f);
                        bVarL111110.f5064d.g(gVar, 1.0f);
                        bVarL111110.f5064d.g(gVar5, f1116);
                        bVarL111110.f5064d.g(gVar7, -f1116);
                        cVar2.c(bVarL111110);
                    }
                }
                if (dVar3.h()) {
                    e eVar114 = dVar3.f6119f.f6117d;
                    float radians13 = (float) Math.toRadians(this.C + 90.0f);
                    int iE13 = dVar3.e();
                    e4.g gVarK11111111112 = cVar2.k(i(2));
                    e4.g gVarK11111111113 = cVar2.k(i(3));
                    e4.g gVarK11111111114 = cVar2.k(i(4));
                    e4.g gVarK11111111115 = cVar2.k(i(5));
                    e4.g gVarK11111111116 = cVar2.k(eVar114.i(2));
                    e4.g gVarK11111111117 = cVar2.k(eVar114.i(3));
                    e4.g gVarK11111111118 = cVar2.k(eVar114.i(4));
                    e4.g gVarK11111111119 = cVar2.k(eVar114.i(5));
                    e4.b bVarL111111 = cVar2.l();
                    double d1112 = radians13;
                    double dSin13 = Math.sin(d1112);
                    double d1113 = iE13;
                    bVarL111111.f5064d.g(gVarK11111111117, 0.5f);
                    bVarL111111.f5064d.g(gVarK11111111119, 0.5f);
                    bVarL111111.f5064d.g(gVarK11111111113, -0.5f);
                    bVarL111111.f5064d.g(gVarK11111111115, -0.5f);
                    bVarL111111.f5062b = -((float) (dSin13 * d1113));
                    cVar2.c(bVarL111111);
                    e4.b bVarL111112 = cVar2.l();
                    float fCos13 = (float) (Math.cos(d1112) * d1113);
                    bVarL111112.f5064d.g(gVarK11111111116, 0.5f);
                    bVarL111112.f5064d.g(gVarK11111111118, 0.5f);
                    bVarL111112.f5064d.g(gVarK11111111112, -0.5f);
                    bVarL111112.f5064d.g(gVarK11111111114, -0.5f);
                    bVarL111112.f5062b = -fCos13;
                    cVar2.c(bVarL111112);
                }
                this.f6141j = false;
                this.f6143k = false;
            }
            i28 = -1;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (iArr[0] == 2) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i17 = 0;
            }
            dVar3 = this.O;
            boolean z211113 = !dVar3.h();
            char c113 = '\b';
            boolean z211114 = zArr[0];
            boolean z211115 = zArr[1];
            i29 = this.f6147n;
            int[] iArr113 = this.B;
            if (i29 != 2) {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            } else {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            }
            if (z10) {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            } else {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            }
            if (this.f6149o == 2) {
                i33 = i31;
            }
            if (i33 != 0) {
                gVar7 = gVar4;
            } else {
                gVar7 = gVar4;
            }
            if (z16) {
                if (this.f6161z == 1) {
                    float f1117 = this.A;
                    e4.b bVarL111113 = cVar2.l();
                    bVarL111113.f5064d.g(gVar5, -1.0f);
                    bVarL111113.f5064d.g(gVar7, 1.0f);
                    bVarL111113.f5064d.g(gVar2, f1117);
                    bVarL111113.f5064d.g(gVar, -f1117);
                    cVar2.c(bVarL111113);
                } else {
                    float f1118 = this.A;
                    e4.b bVarL111114 = cVar2.l();
                    bVarL111114.f5064d.g(gVar2, -1.0f);
                    bVarL111114.f5064d.g(gVar, 1.0f);
                    bVarL111114.f5064d.g(gVar5, f1118);
                    bVarL111114.f5064d.g(gVar7, -f1118);
                    cVar2.c(bVarL111114);
                }
            }
            if (dVar3.h()) {
                e eVar115 = dVar3.f6119f.f6117d;
                float radians14 = (float) Math.toRadians(this.C + 90.0f);
                int iE14 = dVar3.e();
                e4.g gVarK111111111110 = cVar2.k(i(2));
                e4.g gVarK111111111111 = cVar2.k(i(3));
                e4.g gVarK111111111112 = cVar2.k(i(4));
                e4.g gVarK111111111113 = cVar2.k(i(5));
                e4.g gVarK111111111114 = cVar2.k(eVar115.i(2));
                e4.g gVarK111111111115 = cVar2.k(eVar115.i(3));
                e4.g gVarK111111111116 = cVar2.k(eVar115.i(4));
                e4.g gVarK111111111117 = cVar2.k(eVar115.i(5));
                e4.b bVarL111115 = cVar2.l();
                double d1114 = radians14;
                double dSin14 = Math.sin(d1114);
                double d1115 = iE14;
                bVarL111115.f5064d.g(gVarK111111111115, 0.5f);
                bVarL111115.f5064d.g(gVarK111111111117, 0.5f);
                bVarL111115.f5064d.g(gVarK111111111111, -0.5f);
                bVarL111115.f5064d.g(gVarK111111111113, -0.5f);
                bVarL111115.f5062b = -((float) (dSin14 * d1115));
                cVar2.c(bVarL111115);
                e4.b bVarL111116 = cVar2.l();
                float fCos14 = (float) (Math.cos(d1114) * d1115);
                bVarL111116.f5064d.g(gVarK111111111114, 0.5f);
                bVarL111116.f5064d.g(gVarK111111111116, 0.5f);
                bVarL111116.f5064d.g(gVarK111111111110, -0.5f);
                bVarL111116.f5064d.g(gVarK111111111112, -0.5f);
                bVarL111116.f5062b = -fCos14;
                cVar2.c(bVarL111116);
            }
            this.f6141j = false;
            this.f6143k = false;
        }
        dVar2 = dVar9;
        gVarK4 = gVarK4;
        i25 = i20;
        i26 = i23;
        i27 = i24;
        z16 = false;
        int[] iArr114 = this.f6154s;
        iArr114[0] = i26;
        iArr114[1] = i27;
        if (z16) {
            int i417 = this.f6161z;
            i28 = -1;
            if (i417 != 0) {
            }
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            if (iArr[0] == 2) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i17 = 0;
            }
            dVar3 = this.O;
            boolean z211116 = !dVar3.h();
            char c114 = '\b';
            boolean z211117 = zArr[0];
            boolean z211118 = zArr[1];
            i29 = this.f6147n;
            int[] iArr115 = this.B;
            if (i29 != 2) {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            } else {
                dVar4 = dVar;
                gVar = gVarK;
                gVar2 = gVarK2;
                gVar3 = gVarK5;
                z19 = z12;
                r4 = i15;
                r7 = i14;
                i30 = i26;
            }
            if (z10) {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            } else {
                gVar4 = r33;
                gVar5 = gVarK4;
                gVar6 = gVar3;
                i31 = 0;
                i32 = 8;
                z20 = true;
                i33 = 1;
            }
            if (this.f6149o == 2) {
                i33 = i31;
            }
            if (i33 != 0) {
                gVar7 = gVar4;
            } else {
                gVar7 = gVar4;
            }
            if (z16) {
                if (this.f6161z == 1) {
                    float f1119 = this.A;
                    e4.b bVarL111117 = cVar2.l();
                    bVarL111117.f5064d.g(gVar5, -1.0f);
                    bVarL111117.f5064d.g(gVar7, 1.0f);
                    bVarL111117.f5064d.g(gVar2, f1119);
                    bVarL111117.f5064d.g(gVar, -f1119);
                    cVar2.c(bVarL111117);
                } else {
                    float f11110 = this.A;
                    e4.b bVarL111118 = cVar2.l();
                    bVarL111118.f5064d.g(gVar2, -1.0f);
                    bVarL111118.f5064d.g(gVar, 1.0f);
                    bVarL111118.f5064d.g(gVar5, f11110);
                    bVarL111118.f5064d.g(gVar7, -f11110);
                    cVar2.c(bVarL111118);
                }
            }
            if (dVar3.h()) {
                e eVar116 = dVar3.f6119f.f6117d;
                float radians15 = (float) Math.toRadians(this.C + 90.0f);
                int iE15 = dVar3.e();
                e4.g gVarK111111111118 = cVar2.k(i(2));
                e4.g gVarK111111111119 = cVar2.k(i(3));
                e4.g gVarK1111111111110 = cVar2.k(i(4));
                e4.g gVarK1111111111111 = cVar2.k(i(5));
                e4.g gVarK1111111111112 = cVar2.k(eVar116.i(2));
                e4.g gVarK1111111111113 = cVar2.k(eVar116.i(3));
                e4.g gVarK1111111111114 = cVar2.k(eVar116.i(4));
                e4.g gVarK1111111111115 = cVar2.k(eVar116.i(5));
                e4.b bVarL111119 = cVar2.l();
                double d1116 = radians15;
                double dSin15 = Math.sin(d1116);
                double d1117 = iE15;
                bVarL111119.f5064d.g(gVarK1111111111113, 0.5f);
                bVarL111119.f5064d.g(gVarK1111111111115, 0.5f);
                bVarL111119.f5064d.g(gVarK111111111119, -0.5f);
                bVarL111119.f5064d.g(gVarK1111111111111, -0.5f);
                bVarL111119.f5062b = -((float) (dSin15 * d1117));
                cVar2.c(bVarL111119);
                e4.b bVarL1111110 = cVar2.l();
                float fCos15 = (float) (Math.cos(d1116) * d1117);
                bVarL1111110.f5064d.g(gVarK1111111111112, 0.5f);
                bVarL1111110.f5064d.g(gVarK1111111111114, 0.5f);
                bVarL1111110.f5064d.g(gVarK111111111118, -0.5f);
                bVarL1111110.f5064d.g(gVarK1111111111110, -0.5f);
                bVarL1111110.f5062b = -fCos15;
                cVar2.c(bVarL1111110);
            }
            this.f6141j = false;
            this.f6143k = false;
        }
        i28 = -1;
        if (z16) {
            z17 = false;
        } else {
            z17 = false;
        }
        if (iArr[0] == 2) {
            z18 = false;
        } else {
            z18 = false;
        }
        if (z18) {
            i17 = 0;
        }
        dVar3 = this.O;
        boolean z211119 = !dVar3.h();
        char c115 = '\b';
        boolean z2111110 = zArr[0];
        boolean z2111111 = zArr[1];
        i29 = this.f6147n;
        int[] iArr116 = this.B;
        if (i29 != 2) {
            dVar4 = dVar;
            gVar = gVarK;
            gVar2 = gVarK2;
            gVar3 = gVarK5;
            z19 = z12;
            r4 = i15;
            r7 = i14;
            i30 = i26;
        } else {
            dVar4 = dVar;
            gVar = gVarK;
            gVar2 = gVarK2;
            gVar3 = gVarK5;
            z19 = z12;
            r4 = i15;
            r7 = i14;
            i30 = i26;
        }
        if (z10) {
            gVar4 = r33;
            gVar5 = gVarK4;
            gVar6 = gVar3;
            i31 = 0;
            i32 = 8;
            z20 = true;
            i33 = 1;
        } else {
            gVar4 = r33;
            gVar5 = gVarK4;
            gVar6 = gVar3;
            i31 = 0;
            i32 = 8;
            z20 = true;
            i33 = 1;
        }
        if (this.f6149o == 2) {
            i33 = i31;
        }
        if (i33 != 0) {
            gVar7 = gVar4;
        } else {
            gVar7 = gVar4;
        }
        if (z16) {
            if (this.f6161z == 1) {
                float f11111 = this.A;
                e4.b bVarL1111111 = cVar2.l();
                bVarL1111111.f5064d.g(gVar5, -1.0f);
                bVarL1111111.f5064d.g(gVar7, 1.0f);
                bVarL1111111.f5064d.g(gVar2, f11111);
                bVarL1111111.f5064d.g(gVar, -f11111);
                cVar2.c(bVarL1111111);
            } else {
                float f11112 = this.A;
                e4.b bVarL1111112 = cVar2.l();
                bVarL1111112.f5064d.g(gVar2, -1.0f);
                bVarL1111112.f5064d.g(gVar, 1.0f);
                bVarL1111112.f5064d.g(gVar5, f11112);
                bVarL1111112.f5064d.g(gVar7, -f11112);
                cVar2.c(bVarL1111112);
            }
        }
        if (dVar3.h()) {
            e eVar117 = dVar3.f6119f.f6117d;
            float radians16 = (float) Math.toRadians(this.C + 90.0f);
            int iE16 = dVar3.e();
            e4.g gVarK1111111111116 = cVar2.k(i(2));
            e4.g gVarK1111111111117 = cVar2.k(i(3));
            e4.g gVarK1111111111118 = cVar2.k(i(4));
            e4.g gVarK1111111111119 = cVar2.k(i(5));
            e4.g gVarK11111111111110 = cVar2.k(eVar117.i(2));
            e4.g gVarK11111111111111 = cVar2.k(eVar117.i(3));
            e4.g gVarK11111111111112 = cVar2.k(eVar117.i(4));
            e4.g gVarK11111111111113 = cVar2.k(eVar117.i(5));
            e4.b bVarL1111113 = cVar2.l();
            double d1118 = radians16;
            double dSin16 = Math.sin(d1118);
            double d1119 = iE16;
            bVarL1111113.f5064d.g(gVarK11111111111111, 0.5f);
            bVarL1111113.f5064d.g(gVarK11111111111113, 0.5f);
            bVarL1111113.f5064d.g(gVarK1111111111117, -0.5f);
            bVarL1111113.f5064d.g(gVarK1111111111119, -0.5f);
            bVarL1111113.f5062b = -((float) (dSin16 * d1119));
            cVar2.c(bVarL1111113);
            e4.b bVarL1111114 = cVar2.l();
            float fCos16 = (float) (Math.cos(d1118) * d1119);
            bVarL1111114.f5064d.g(gVarK11111111111110, 0.5f);
            bVarL1111114.f5064d.g(gVarK11111111111112, 0.5f);
            bVarL1111114.f5064d.g(gVarK1111111111116, -0.5f);
            bVarL1111114.f5064d.g(gVarK1111111111118, -0.5f);
            bVarL1111114.f5062b = -fCos16;
            cVar2.c(bVarL1111114);
        }
        this.f6141j = false;
        this.f6143k = false;
    }

    public boolean c() {
        return this.f6134f0 != 8;
    }

    public final void d(e4.c cVar, boolean z10, boolean z11, boolean z12, boolean z13, e4.g gVar, e4.g gVar2, int i10, boolean z14, d dVar, d dVar2, int i11, int i12, int i13, int i14, float f3, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, int i15, int i16, int i17, int i18, float f10, boolean z20) {
        boolean z21;
        boolean z22;
        int iMin;
        boolean z23;
        int i19;
        int i20;
        boolean z24;
        e4.g gVarK;
        e4.g gVarK2;
        d dVar3;
        e4.g gVar3;
        int i21;
        int i22;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        e eVar;
        boolean z29;
        int iMin2;
        boolean z30;
        int i23;
        int iE;
        int i24;
        int i25;
        HashSet hashSet;
        boolean z31;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z32;
        boolean z33;
        int i31;
        cVar = cVar;
        int i32 = i17;
        int i33 = i18;
        e4.g gVarK3 = cVar.k(dVar);
        e4.g gVarK4 = cVar.k(dVar2);
        e4.g gVarK5 = cVar.k(dVar.f6119f);
        e4.g gVarK6 = cVar.k(dVar2.f6119f);
        boolean zH = dVar.h();
        boolean zH2 = dVar2.h();
        boolean zH3 = this.O.h();
        int i34 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
        if (zH3) {
            i34++;
        }
        int i35 = i34;
        int i36 = z15 ? 3 : i15;
        int iB = e4.f.b(i10);
        boolean z34 = (iB == 0 || iB == 1 || iB != 2 || i36 == 4) ? false : true;
        int i37 = this.f6137h;
        if (i37 == -1 || !z10) {
            i37 = i12;
            z21 = z34;
        } else {
            this.f6137h = -1;
            z21 = false;
        }
        int i38 = this.f6139i;
        if (i38 == -1 || z10) {
            z22 = z21;
        } else {
            this.f6139i = -1;
            i37 = i38;
            z22 = false;
        }
        boolean z35 = z22;
        if (this.f6134f0 == 8) {
            z23 = false;
            iMin = 0;
        } else {
            iMin = i37;
            z23 = z35;
        }
        if (z20) {
            if (!zH && !zH2 && !zH3) {
                cVar.d(gVarK3, i11);
            } else if (zH && !zH2) {
                i19 = 8;
                cVar.e(gVarK3, gVarK5, dVar.e(), 8);
            }
            i19 = 8;
        } else {
            i19 = 8;
        }
        if (z23 != 0) {
            if (i35 == 2 || z15 || !(i36 == 1 || i36 == 0)) {
                if (i32 == -2) {
                    i32 = iMin;
                }
                if (i33 == -2) {
                    i33 = iMin;
                }
                if (iMin > 0 && i36 != 1) {
                    iMin = 0;
                }
                if (i32 > 0) {
                    cVar.f(gVarK4, gVarK3, i32, 8);
                    iMin = Math.max(iMin, i32);
                }
                if (i33 > 0) {
                    if (!z11 || i36 != 1) {
                        cVar.g(gVarK4, gVarK3, i33, 8);
                    }
                    iMin = Math.min(iMin, i33);
                }
                if (i36 == 1) {
                    if (z11) {
                        cVar.e(gVarK4, gVarK3, iMin, 8);
                    } else if (z17) {
                        cVar.e(gVarK4, gVarK3, iMin, 5);
                        cVar.g(gVarK4, gVarK3, iMin, 8);
                    } else {
                        cVar.e(gVarK4, gVarK3, iMin, 5);
                        cVar.g(gVarK4, gVarK3, iMin, 8);
                    }
                } else if (i36 == 2) {
                    int i39 = dVar.f6118e;
                    if (i39 == 3 || i39 == 5) {
                        gVarK = cVar.k(this.S.i(3));
                        gVarK2 = cVar.k(this.S.i(5));
                    } else {
                        gVarK = cVar.k(this.S.i(2));
                        gVarK2 = cVar.k(this.S.i(4));
                    }
                    e4.b bVarL = cVar.l();
                    int i40 = i32;
                    bVarL.f5064d.g(gVarK4, -1.0f);
                    bVarL.f5064d.g(gVarK3, 1.0f);
                    bVarL.f5064d.g(gVarK2, f10);
                    bVarL.f5064d.g(gVarK, -f10);
                    cVar.c(bVarL);
                    if (z11) {
                        z23 = false;
                    }
                    z24 = z13;
                    i20 = i40;
                } else {
                    i20 = i32;
                    z24 = true;
                }
            } else {
                int iMax = Math.max(i32, iMin);
                if (i33 > 0) {
                    iMax = Math.min(i33, iMax);
                }
                cVar.e(gVarK4, gVarK3, iMax, 8);
                z24 = z13;
                i20 = i32;
                z23 = false;
            }
            if (z20 || z17) {
                boolean z36 = z24;
                if (i35 >= 2 && z11 && z36) {
                    cVar.f(gVarK3, gVar, 0, 8);
                    d dVar4 = this.L;
                    boolean z37 = z10 || dVar4.f6119f == null;
                    if (!z10 && (dVar3 = dVar4.f6119f) != null) {
                        e eVar2 = dVar3.f6117d;
                        if (eVar2.V != 0.0f) {
                            int[] iArr = eVar2.f6150o0;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z37 = true;
                            } else {
                                z37 = false;
                            }
                        } else {
                            z37 = false;
                        }
                    }
                    if (z37) {
                        cVar.f(gVar2, gVarK4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zH || zH2 || zH3) {
                if (zH && !zH2) {
                    dVar2 = dVar2;
                    gVarK4 = gVarK4;
                    z24 = z24;
                    gVar3 = gVarK6;
                    z29 = z11;
                    i31 = (z11 && (dVar.f6119f.f6117d instanceof a)) ? 8 : 5;
                } else if (zH || !zH2) {
                    gVar3 = gVarK6;
                    if (zH && zH2) {
                        e eVar3 = dVar.f6119f.f6117d;
                        e eVar4 = dVar2.f6119f.f6117d;
                        z24 = z24;
                        e eVar5 = this.S;
                        int i41 = 6;
                        if (z23) {
                            if (i36 == 0) {
                                if (i33 != 0 || i20 != 0) {
                                    i29 = 5;
                                    i30 = 5;
                                    z32 = true;
                                    z33 = false;
                                    z26 = true;
                                } else if (gVarK5.F && gVar3.F) {
                                    cVar.e(gVarK3, gVarK5, dVar.e(), 8);
                                    cVar.e(gVarK4, gVar3, -dVar2.e(), 8);
                                    return;
                                } else {
                                    i29 = 8;
                                    i30 = 8;
                                    z32 = false;
                                    z33 = true;
                                    z26 = false;
                                }
                                if ((eVar3 instanceof a) || (eVar4 instanceof a)) {
                                    cVar = cVar;
                                    i36 = i36;
                                    gVarK3 = gVarK3;
                                    gVarK4 = gVarK4;
                                    z27 = z33;
                                    gVar2 = gVar2;
                                    i21 = i29;
                                    gVarK5 = gVarK5;
                                    i41 = 6;
                                    z25 = z32;
                                    i22 = 4;
                                } else {
                                    cVar = cVar;
                                    gVarK3 = gVarK3;
                                    gVarK4 = gVarK4;
                                    z27 = z33;
                                    i21 = i29;
                                    gVarK5 = gVarK5;
                                    i41 = 6;
                                    z25 = z32;
                                    i22 = i30;
                                    i36 = i36;
                                    gVar2 = gVar2;
                                }
                            } else {
                                if (i36 == 2) {
                                    if ((eVar3 instanceof a) || (eVar4 instanceof a)) {
                                        i21 = 5;
                                    } else {
                                        cVar = cVar;
                                        i36 = i36;
                                        gVarK3 = gVarK3;
                                        gVarK4 = gVarK4;
                                        gVarK5 = gVarK5;
                                        i41 = 6;
                                        i21 = 5;
                                        i22 = 5;
                                    }
                                    z25 = true;
                                    z26 = true;
                                    z27 = false;
                                    gVar2 = gVar2;
                                } else if (i36 == 1) {
                                    i21 = 8;
                                } else if (i36 == 3) {
                                    i36 = i36;
                                    if (this.f6161z != -1) {
                                        if (z15) {
                                            if (i16 == 2 || i16 == 1) {
                                                i27 = 5;
                                                i28 = 4;
                                            } else {
                                                i27 = 8;
                                                i28 = 5;
                                            }
                                            i22 = i28;
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                        } else {
                                            if (i33 > 0) {
                                                cVar = cVar;
                                                gVar2 = gVar2;
                                                gVarK3 = gVarK3;
                                                gVarK4 = gVarK4;
                                                gVarK5 = gVarK5;
                                                i41 = 6;
                                                i21 = 5;
                                            } else if (i33 != 0 || i20 != 0) {
                                                cVar = cVar;
                                                gVar2 = gVar2;
                                                gVarK3 = gVarK3;
                                                gVarK4 = gVarK4;
                                                gVarK5 = gVarK5;
                                                i41 = 6;
                                                i21 = 5;
                                                i22 = 4;
                                            } else if (z18) {
                                                i27 = (eVar3 == eVar5 || eVar4 == eVar5) ? 5 : 4;
                                                i22 = 4;
                                                z25 = true;
                                                z26 = true;
                                                z27 = true;
                                            } else {
                                                cVar = cVar;
                                                gVar2 = gVar2;
                                                gVarK3 = gVarK3;
                                                gVarK4 = gVarK4;
                                                gVarK5 = gVarK5;
                                                i41 = 6;
                                                i21 = 5;
                                                i22 = 8;
                                            }
                                            z25 = true;
                                            z26 = true;
                                            z27 = true;
                                        }
                                        i21 = i27;
                                        cVar = cVar;
                                    } else if (z18) {
                                        cVar = cVar;
                                        gVar2 = gVar2;
                                        gVarK3 = gVarK3;
                                        gVarK4 = gVarK4;
                                        gVarK5 = gVarK5;
                                        i21 = 8;
                                        i41 = z11 ? 5 : 4;
                                    } else {
                                        cVar = cVar;
                                        gVar2 = gVar2;
                                        gVarK3 = gVarK3;
                                        gVarK4 = gVarK4;
                                        gVarK5 = gVarK5;
                                        i21 = 8;
                                        i41 = 8;
                                    }
                                    i22 = 5;
                                    z25 = true;
                                    z26 = true;
                                    z27 = true;
                                } else {
                                    i21 = 5;
                                    i22 = 4;
                                    z25 = false;
                                    z26 = false;
                                }
                                i22 = 4;
                                z25 = true;
                                z26 = true;
                                z27 = false;
                                gVar2 = gVar2;
                            }
                            if (z26 || gVarK5 != gVar3 || eVar3 == eVar5) {
                                z28 = true;
                            } else {
                                z26 = false;
                                z28 = false;
                            }
                            if (z25) {
                                if (z23 && !z16 && !z18 && gVarK5 == gVar && gVar3 == gVar2) {
                                    i41 = 8;
                                    z29 = false;
                                    i26 = 8;
                                    z31 = false;
                                } else {
                                    z29 = z11;
                                    z31 = z28;
                                    i26 = i21;
                                }
                                e4.g gVar4 = gVarK5;
                                eVar = eVar4;
                                cVar.b(gVarK3, gVar4, dVar.e(), f3, gVar3, gVarK4, dVar2.e(), i41);
                                gVarK5 = gVar4;
                                i21 = i26;
                                z28 = z31;
                            } else {
                                eVar = eVar4;
                                z29 = z11;
                            }
                            if (this.f6134f0 != 8 && ((hashSet = dVar2.f6114a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z26) {
                                if (z29 && gVarK5 != gVar3 && !z23 && ((eVar3 instanceof a) || (eVar instanceof a))) {
                                    i21 = 6;
                                }
                                cVar.f(gVarK3, gVarK5, dVar.e(), i21);
                                cVar.g(gVarK4, gVar3, -dVar2.e(), i21);
                            }
                            if (z29 || !z19 || (eVar3 instanceof a) || (eVar instanceof a) || eVar == eVar5) {
                                iMin2 = i22;
                                z30 = z28;
                            } else {
                                iMin2 = 6;
                                i21 = 6;
                                z30 = true;
                            }
                            if (z30) {
                                if (z27 && (!z18 || z12)) {
                                    if (eVar3 != eVar5 && eVar != eVar5) {
                                        i41 = iMin2;
                                    }
                                    if ((eVar3 instanceof i) || (eVar instanceof i)) {
                                        i41 = 5;
                                    }
                                    if ((eVar3 instanceof a) || (eVar instanceof a)) {
                                        i41 = 5;
                                    }
                                    if (z18) {
                                        i25 = 5;
                                    } else {
                                        i25 = i41;
                                    }
                                    iMin2 = Math.max(i25, iMin2);
                                }
                                if (z29) {
                                    iMin2 = Math.min(i21, iMin2);
                                    if (z15 || z18 || !(eVar3 == eVar5 || eVar == eVar5)) {
                                        i24 = iMin2;
                                    } else {
                                        i24 = 4;
                                    }
                                } else {
                                    i24 = iMin2;
                                }
                                cVar.e(gVarK3, gVarK5, dVar.e(), i24);
                                cVar.e(gVarK4, gVar3, -dVar2.e(), i24);
                            }
                            if (z29) {
                                if (gVar == gVarK5) {
                                    iE = dVar.e();
                                } else {
                                    iE = 0;
                                }
                                if (gVarK5 != gVar) {
                                    cVar.f(gVarK3, gVar, iE, 5);
                                }
                            }
                            if (z29 || !z23 || i13 != 0 || i20 != 0) {
                                i23 = 5;
                            } else if (z23 && i36 == 3) {
                                cVar.f(gVarK4, gVarK3, 0, 8);
                                i23 = 5;
                            } else {
                                i23 = 5;
                                cVar.f(gVarK4, gVarK3, 0, 5);
                            }
                        } else {
                            if (gVarK5.F && gVar3.F) {
                                cVar.b(gVarK3, gVarK5, dVar.e(), f3, gVar3, gVarK4, dVar2.e(), 8);
                                if (z11 && z24) {
                                    int iE2 = dVar2.f6119f != null ? dVar2.e() : 0;
                                    if (gVar3 != gVar2) {
                                        cVar.f(gVar2, gVarK4, iE2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i21 = 5;
                            i22 = 4;
                            z25 = true;
                            z26 = true;
                        }
                        z27 = false;
                        if (z26) {
                            z28 = true;
                        } else {
                            z28 = true;
                        }
                        if (z25) {
                            if (z23) {
                                z29 = z11;
                                z31 = z28;
                                i26 = i21;
                            } else {
                                z29 = z11;
                                z31 = z28;
                                i26 = i21;
                            }
                            e4.g gVar5 = gVarK5;
                            eVar = eVar4;
                            cVar.b(gVarK3, gVar5, dVar.e(), f3, gVar3, gVarK4, dVar2.e(), i41);
                            gVarK5 = gVar5;
                            i21 = i26;
                            z28 = z31;
                        } else {
                            eVar = eVar4;
                            z29 = z11;
                        }
                        if (this.f6134f0 != 8) {
                        }
                        if (z26) {
                            if (z29) {
                                i21 = 6;
                            }
                            cVar.f(gVarK3, gVarK5, dVar.e(), i21);
                            cVar.g(gVarK4, gVar3, -dVar2.e(), i21);
                        }
                        if (z29) {
                            iMin2 = i22;
                            z30 = z28;
                        } else {
                            iMin2 = i22;
                            z30 = z28;
                        }
                        if (z30) {
                            if (z27) {
                                if (eVar3 != eVar5) {
                                    i41 = iMin2;
                                }
                                if (eVar3 instanceof i) {
                                    i41 = 5;
                                } else {
                                    i41 = 5;
                                }
                                if (eVar3 instanceof a) {
                                    i41 = 5;
                                } else {
                                    i41 = 5;
                                }
                                if (z18) {
                                    i25 = 5;
                                } else {
                                    i25 = i41;
                                }
                                iMin2 = Math.max(i25, iMin2);
                            }
                            if (z29) {
                                iMin2 = Math.min(i21, iMin2);
                                if (z15) {
                                    i24 = iMin2;
                                } else {
                                    i24 = iMin2;
                                }
                            } else {
                                i24 = iMin2;
                            }
                            cVar.e(gVarK3, gVarK5, dVar.e(), i24);
                            cVar.e(gVarK4, gVar3, -dVar2.e(), i24);
                        }
                        if (z29) {
                            if (gVar == gVarK5) {
                                iE = dVar.e();
                            } else {
                                iE = 0;
                            }
                            if (gVarK5 != gVar) {
                                cVar.f(gVarK3, gVar, iE, 5);
                            }
                        }
                        if (z29) {
                            i23 = 5;
                        } else {
                            i23 = 5;
                        }
                    }
                    i31 = i23;
                } else {
                    gVar3 = gVarK6;
                    cVar.e(gVarK4, gVar3, -dVar2.e(), 8);
                    if (z11) {
                        cVar.f(gVarK3, gVar, 0, 5);
                        dVar2 = dVar2;
                        i23 = 5;
                        gVarK4 = gVarK4;
                        z24 = z24;
                    }
                    z29 = z11;
                    i31 = i23;
                }
                if (z29 || !z24) {
                    return;
                }
                int iE3 = dVar2.f6119f != null ? dVar2.e() : 0;
                if (gVar3 != gVar2) {
                    cVar.f(gVar2, gVarK4, iE3, i31);
                    return;
                }
                return;
            }
            gVar3 = gVarK6;
            i23 = 5;
            z29 = z11;
            i31 = i23;
            if (z29) {
                return;
            } else {
                return;
            }
        }
        if (z14) {
            cVar.e(gVarK4, gVarK3, 0, 3);
            if (i13 > 0) {
                cVar.f(gVarK4, gVarK3, i13, i19);
            }
            if (i14 < Integer.MAX_VALUE) {
                cVar.g(gVarK4, gVarK3, i14, i19);
            }
        } else {
            cVar.e(gVarK4, gVarK3, iMin, i19);
        }
        z24 = z13;
        i20 = i32;
        if (z20) {
        }
        boolean z38 = z24;
        if (i35 >= 2) {
        }
    }

    public final void e(int i10, e eVar, int i11, int i12) {
        boolean z10;
        if (i10 == 7) {
            if (i11 != 7) {
                if (i11 == 2 || i11 == 4) {
                    e(2, eVar, i11, 0);
                    e(4, eVar, i11, 0);
                    i(7).a(eVar.i(i11), 0);
                    return;
                } else {
                    if (i11 == 3 || i11 == 5) {
                        e(3, eVar, i11, 0);
                        e(5, eVar, i11, 0);
                        i(7).a(eVar.i(i11), 0);
                        return;
                    }
                    return;
                }
            }
            d dVarI = i(2);
            d dVarI2 = i(4);
            d dVarI3 = i(3);
            d dVarI4 = i(5);
            boolean z11 = true;
            if ((dVarI == null || !dVarI.h()) && (dVarI2 == null || !dVarI2.h())) {
                e(2, eVar, 2, 0);
                e(4, eVar, 4, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((dVarI3 == null || !dVarI3.h()) && (dVarI4 == null || !dVarI4.h())) {
                e(3, eVar, 3, 0);
                e(5, eVar, 5, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                i(7).a(eVar.i(7), 0);
                return;
            } else if (z10) {
                i(8).a(eVar.i(8), 0);
                return;
            } else {
                if (z11) {
                    i(9).a(eVar.i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i10 == 8 && (i11 == 2 || i11 == 4)) {
            d dVarI5 = i(2);
            d dVarI6 = eVar.i(i11);
            d dVarI7 = i(4);
            dVarI5.a(dVarI6, 0);
            dVarI7.a(dVarI6, 0);
            i(8).a(dVarI6, 0);
            return;
        }
        if (i10 == 9 && (i11 == 3 || i11 == 5)) {
            d dVarI8 = eVar.i(i11);
            i(3).a(dVarI8, 0);
            i(5).a(dVarI8, 0);
            i(9).a(dVarI8, 0);
            return;
        }
        if (i10 == 8 && i11 == 8) {
            i(2).a(eVar.i(2), 0);
            i(4).a(eVar.i(4), 0);
            i(8).a(eVar.i(i11), 0);
            return;
        }
        if (i10 == 9 && i11 == 9) {
            i(3).a(eVar.i(3), 0);
            i(5).a(eVar.i(5), 0);
            i(9).a(eVar.i(i11), 0);
            return;
        }
        d dVarI9 = i(i10);
        d dVarI10 = eVar.i(i11);
        if (dVarI9.i(dVarI10)) {
            if (i10 == 6) {
                d dVarI11 = i(3);
                d dVarI12 = i(5);
                if (dVarI11 != null) {
                    dVarI11.j();
                }
                if (dVarI12 != null) {
                    dVarI12.j();
                }
            } else if (i10 == 3 || i10 == 5) {
                d dVarI13 = i(6);
                if (dVarI13 != null) {
                    dVarI13.j();
                }
                d dVarI14 = i(7);
                if (dVarI14.f6119f != dVarI10) {
                    dVarI14.j();
                }
                d dVarF = i(i10).f();
                d dVarI15 = i(9);
                if (dVarI15.h()) {
                    dVarF.j();
                    dVarI15.j();
                }
            } else if (i10 == 2 || i10 == 4) {
                d dVarI16 = i(7);
                if (dVarI16.f6119f != dVarI10) {
                    dVarI16.j();
                }
                d dVarF2 = i(i10).f();
                d dVarI17 = i(8);
                if (dVarI17.h()) {
                    dVarF2.j();
                    dVarI17.j();
                }
            }
            dVarI9.a(dVarI10, i12);
        }
    }

    public final void f(d dVar, d dVar2, int i10) {
        if (dVar.f6117d == this) {
            e(dVar.f6118e, dVar2.f6117d, dVar2.f6118e, i10);
        }
    }

    public final void g(e4.c cVar) {
        cVar.k(this.H);
        cVar.k(this.I);
        cVar.k(this.J);
        cVar.k(this.K);
        if (this.Z > 0) {
            cVar.k(this.L);
        }
    }

    public final void h() {
        if (this.f6129d == null) {
            h4.j jVar = new h4.j(this);
            jVar.f6605h.f6580e = 4;
            jVar.f6606i.f6580e = 5;
            jVar.f6603f = 0;
            this.f6129d = jVar;
        }
        if (this.f6131e == null) {
            l lVar = new l(this);
            h4.e eVar = new h4.e(lVar);
            lVar.f6591k = eVar;
            lVar.l = null;
            lVar.f6605h.f6580e = 6;
            lVar.f6606i.f6580e = 7;
            eVar.f6580e = 8;
            lVar.f6603f = 1;
            this.f6131e = lVar;
        }
    }

    public d i(int i10) {
        switch (e4.f.b(i10)) {
            case 0:
                return null;
            case 1:
                return this.H;
            case 2:
                return this.I;
            case 3:
                return this.J;
            case 4:
                return this.K;
            case 5:
                return this.L;
            case 6:
                return this.O;
            case 7:
                return this.M;
            case 8:
                return this.N;
            default:
                throw new AssertionError(c.s(i10));
        }
    }

    public final int j(int i10) {
        int[] iArr = this.f6150o0;
        if (i10 == 0) {
            return iArr[0];
        }
        if (i10 == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int k() {
        if (this.f6134f0 == 8) {
            return 0;
        }
        return this.U;
    }

    public final e l(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.K).f6119f) != null && dVar2.f6119f == dVar) {
                return dVar2.f6117d;
            }
            return null;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f6119f;
        if (dVar4 == null || dVar4.f6119f != dVar3) {
            return null;
        }
        return dVar4.f6117d;
    }

    public final e m(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 == 1 && (dVar2 = (dVar = this.I).f6119f) != null && dVar2.f6119f == dVar) {
                return dVar2.f6117d;
            }
            return null;
        }
        d dVar3 = this.H;
        d dVar4 = dVar3.f6119f;
        if (dVar4 == null || dVar4.f6119f != dVar3) {
            return null;
        }
        return dVar4.f6117d;
    }

    public final int n() {
        if (this.f6134f0 == 8) {
            return 0;
        }
        return this.T;
    }

    public final int o() {
        e eVar = this.S;
        return (eVar == null || !(eVar instanceof f)) ? this.X : ((f) eVar).f6169w0 + this.X;
    }

    public final int p() {
        e eVar = this.S;
        return (eVar == null || !(eVar instanceof f)) ? this.Y : ((f) eVar).f6170x0 + this.Y;
    }

    public final boolean q(int i10) {
        if (i10 == 0) {
            if ((this.H.f6119f != null ? 1 : 0) + (this.J.f6119f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.I.f6119f != null ? 1 : 0) + (this.K.f6119f != null ? 1 : 0) + (this.L.f6119f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    public final boolean r(int i10, int i11) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        if (i10 == 0) {
            d dVar5 = this.H;
            d dVar6 = dVar5.f6119f;
            if (dVar6 == null || !dVar6.f6116c || (dVar4 = (dVar3 = this.J).f6119f) == null || !dVar4.f6116c) {
                return false;
            }
            return (dVar4.d() - dVar3.e()) - (dVar5.e() + dVar5.f6119f.d()) >= i11;
        }
        d dVar7 = this.I;
        d dVar8 = dVar7.f6119f;
        if (dVar8 == null || !dVar8.f6116c || (dVar2 = (dVar = this.K).f6119f) == null || !dVar2.f6116c) {
            return false;
        }
        return (dVar2.d() - dVar.e()) - (dVar7.e() + dVar7.f6119f.d()) >= i11;
    }

    public final void s(int i10, int i11, int i12, int i13, e eVar) {
        i(i10).b(eVar.i(i11), i12, i13, true);
    }

    public final boolean t(int i10) {
        d dVar;
        d dVar2;
        int i11 = i10 * 2;
        d[] dVarArr = this.P;
        d dVar3 = dVarArr[i11];
        d dVar4 = dVar3.f6119f;
        return (dVar4 == null || dVar4.f6119f == dVar3 || (dVar2 = (dVar = dVarArr[i11 + 1]).f6119f) == null || dVar2.f6119f != dVar) ? false : true;
    }

    public String toString() {
        String strN = RuntimeVersion.SUFFIX;
        StringBuilder sbQ = x5.q(RuntimeVersion.SUFFIX);
        if (this.f6136g0 != null) {
            strN = x5.n(new StringBuilder("id: "), this.f6136g0, " ");
        }
        sbQ.append(strN);
        sbQ.append("(");
        sbQ.append(this.X);
        sbQ.append(", ");
        sbQ.append(this.Y);
        sbQ.append(") - (");
        sbQ.append(this.T);
        sbQ.append(" x ");
        return c.g(this.U, ")", sbQ);
    }

    public final boolean u() {
        d dVar = this.H;
        d dVar2 = dVar.f6119f;
        if (dVar2 != null && dVar2.f6119f == dVar) {
            return true;
        }
        d dVar3 = this.J;
        d dVar4 = dVar3.f6119f;
        return dVar4 != null && dVar4.f6119f == dVar3;
    }

    public final boolean v() {
        d dVar = this.I;
        d dVar2 = dVar.f6119f;
        if (dVar2 != null && dVar2.f6119f == dVar) {
            return true;
        }
        d dVar3 = this.K;
        d dVar4 = dVar3.f6119f;
        return dVar4 != null && dVar4.f6119f == dVar3;
    }

    public final boolean w() {
        return this.f6135g && this.f6134f0 != 8;
    }

    public boolean x() {
        if (this.f6141j) {
            return true;
        }
        return this.H.f6116c && this.J.f6116c;
    }

    public boolean y() {
        if (this.f6143k) {
            return true;
        }
        return this.I.f6116c && this.K.f6116c;
    }

    public void z() {
        this.H.j();
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.S = null;
        this.C = 0.0f;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.f6124a0 = 0;
        this.f6126b0 = 0;
        this.f6128c0 = 0.5f;
        this.f6130d0 = 0.5f;
        int[] iArr = this.f6150o0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f6132e0 = null;
        this.f6134f0 = 0;
        this.f6138h0 = 0;
        this.f6140i0 = 0;
        float[] fArr = this.f6142j0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6147n = -1;
        this.f6149o = -1;
        int[] iArr2 = this.B;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f6152q = 0;
        this.f6153r = 0;
        this.f6157v = 1.0f;
        this.f6160y = 1.0f;
        this.f6156u = Integer.MAX_VALUE;
        this.f6159x = Integer.MAX_VALUE;
        this.f6155t = 0;
        this.f6158w = 0;
        this.f6161z = -1;
        this.A = 1.0f;
        boolean[] zArr = this.f6133f;
        zArr[0] = true;
        zArr[1] = true;
        this.E = false;
        boolean[] zArr2 = this.R;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6135g = true;
        int[] iArr3 = this.f6154s;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f6137h = -1;
        this.f6139i = -1;
    }
}
