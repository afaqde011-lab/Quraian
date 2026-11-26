package e4;

import a1.i;
import com.google.android.gms.cast.Cast;
import java.util.ArrayList;
import java.util.Arrays;
import l9.f0;

public final class c {

    public static boolean f5066p = false;

    public static int f5067q = 1000;

    public final e f5070c;

    public b[] f5073f;
    public final i l;

    public b f5080o;

    public boolean f5068a = false;

    public int f5069b = 0;

    public int f5071d = 32;

    public int f5072e = 32;

    public boolean f5074g = false;

    public boolean[] f5075h = new boolean[32];

    public int f5076i = 1;

    public int f5077j = 0;

    public int f5078k = 32;
    public g[] m = new g[f5067q];

    public int f5079n = 0;

    public c() {
        this.f5073f = null;
        this.f5073f = new b[32];
        s();
        i iVar = new i(13, false);
        iVar.B = new d();
        iVar.C = new d();
        iVar.D = new g[32];
        this.l = iVar;
        e eVar = new e(iVar);
        eVar.f5083f = new g[Cast.MAX_NAMESPACE_LENGTH];
        eVar.f5084g = new g[Cast.MAX_NAMESPACE_LENGTH];
        eVar.f5085h = 0;
        eVar.f5086i = new f0(eVar);
        this.f5070c = eVar;
        this.f5080o = new b(iVar);
    }

    public static int n(Object obj) {
        g gVar = ((g4.d) obj).f6122i;
        if (gVar != null) {
            return (int) (gVar.E + 0.5f);
        }
        return 0;
    }

    public final g a(int i10) {
        d dVar = (d) this.l.C;
        int i11 = dVar.f5082b;
        Object obj = null;
        if (i11 > 0) {
            int i12 = i11 - 1;
            Object[] objArr = dVar.f5081a;
            Object obj2 = objArr[i12];
            objArr[i12] = null;
            dVar.f5082b = i12;
            obj = obj2;
        }
        g gVar = (g) obj;
        if (gVar == null) {
            gVar = new g(i10);
            gVar.L = i10;
        } else {
            gVar.c();
            gVar.L = i10;
        }
        int i13 = this.f5079n;
        int i14 = f5067q;
        if (i13 >= i14) {
            int i15 = i14 * 2;
            f5067q = i15;
            this.m = (g[]) Arrays.copyOf(this.m, i15);
        }
        g[] gVarArr = this.m;
        int i16 = this.f5079n;
        this.f5079n = i16 + 1;
        gVarArr[i16] = gVar;
        return gVar;
    }

    public final void b(g gVar, g gVar2, int i10, float f3, g gVar3, g gVar4, int i11, int i12) {
        b bVarL = l();
        if (gVar2 == gVar3) {
            bVarL.f5064d.g(gVar, 1.0f);
            bVarL.f5064d.g(gVar4, 1.0f);
            bVarL.f5064d.g(gVar2, -2.0f);
        } else if (f3 == 0.5f) {
            bVarL.f5064d.g(gVar, 1.0f);
            bVarL.f5064d.g(gVar2, -1.0f);
            bVarL.f5064d.g(gVar3, -1.0f);
            bVarL.f5064d.g(gVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                bVarL.f5062b = (-i10) + i11;
            }
        } else if (f3 <= 0.0f) {
            bVarL.f5064d.g(gVar, -1.0f);
            bVarL.f5064d.g(gVar2, 1.0f);
            bVarL.f5062b = i10;
        } else if (f3 >= 1.0f) {
            bVarL.f5064d.g(gVar4, -1.0f);
            bVarL.f5064d.g(gVar3, 1.0f);
            bVarL.f5062b = -i11;
        } else {
            float f10 = 1.0f - f3;
            bVarL.f5064d.g(gVar, f10 * 1.0f);
            bVarL.f5064d.g(gVar2, f10 * (-1.0f));
            bVarL.f5064d.g(gVar3, (-1.0f) * f3);
            bVarL.f5064d.g(gVar4, 1.0f * f3);
            if (i10 > 0 || i11 > 0) {
                bVarL.f5062b = (i11 * f3) + ((-i10) * f10);
            }
        }
        if (i12 != 8) {
            bVarL.a(this, i12);
        }
        c(bVarL);
    }

    public final void c(b bVar) {
        boolean z10;
        boolean z11;
        g gVarF;
        if (this.f5077j + 1 >= this.f5078k || this.f5076i + 1 >= this.f5072e) {
            o();
        }
        if (bVar.f5065e) {
            z10 = false;
        } else {
            ArrayList arrayList = bVar.f5063c;
            if (this.f5073f.length != 0) {
                boolean z12 = false;
                while (!z12) {
                    int iD = bVar.f5064d.d();
                    for (int i10 = 0; i10 < iD; i10++) {
                        g gVarE = bVar.f5064d.e(i10);
                        if (gVarE.C != -1 || gVarE.F) {
                            arrayList.add(gVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i11 = 0; i11 < size; i11++) {
                            g gVar = (g) arrayList.get(i11);
                            if (gVar.F) {
                                bVar.h(this, gVar, true);
                            } else {
                                bVar.i(this, this.f5073f[gVar.C], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z12 = true;
                    }
                }
                if (bVar.f5061a != null && bVar.f5064d.d() == 0) {
                    bVar.f5065e = true;
                    this.f5068a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f3 = bVar.f5062b;
            float f10 = 0.0f;
            if (f3 < 0.0f) {
                bVar.f5062b = f3 * (-1.0f);
                a aVar = bVar.f5064d;
                int i12 = aVar.f5058h;
                for (int i13 = 0; i12 != -1 && i13 < aVar.f5051a; i13++) {
                    float[] fArr = aVar.f5057g;
                    fArr[i12] = fArr[i12] * (-1.0f);
                    i12 = aVar.f5056f[i12];
                }
            }
            int iD2 = bVar.f5064d.d();
            float f11 = 0.0f;
            float f12 = 0.0f;
            g gVar2 = null;
            g gVar3 = null;
            int i14 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i14 < iD2) {
                float f13 = bVar.f5064d.f(i14);
                g gVarE2 = bVar.f5064d.e(i14);
                float f14 = f10;
                if (gVarE2.L == 1) {
                    if (gVar2 == null) {
                        if (gVarE2.K <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        gVar2 = gVarE2;
                        f11 = f13;
                    } else {
                        if (f11 > f13) {
                            if (gVarE2.K > 1) {
                                z13 = false;
                            }
                            gVar2 = gVarE2;
                            f11 = f13;
                        } else if (z13 || gVarE2.K > 1) {
                        }
                        z13 = true;
                        gVar2 = gVarE2;
                        f11 = f13;
                    }
                } else if (gVar2 == null && f13 < f14) {
                    if (gVar3 == null) {
                        if (gVarE2.K <= 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        gVar3 = gVarE2;
                        f12 = f13;
                    } else {
                        if (f12 > f13) {
                            if (gVarE2.K > 1) {
                                z14 = false;
                            }
                            gVar3 = gVarE2;
                            f12 = f13;
                        } else if (z14 || gVarE2.K > 1) {
                        }
                        z14 = true;
                        gVar3 = gVarE2;
                        f12 = f13;
                    }
                }
                i14++;
                f10 = f14;
            }
            float f15 = f10;
            if (gVar2 == null) {
                gVar2 = gVar3;
            }
            if (gVar2 == null) {
                z11 = true;
            } else {
                bVar.g(gVar2);
                z11 = false;
            }
            if (bVar.f5064d.d() == 0) {
                bVar.f5065e = true;
            }
            if (z11) {
                if (this.f5076i + 1 >= this.f5072e) {
                    o();
                }
                g gVarA = a(3);
                int i15 = this.f5069b + 1;
                this.f5069b = i15;
                this.f5076i++;
                gVarA.B = i15;
                i iVar = this.l;
                ((g[]) iVar.D)[i15] = gVarA;
                bVar.f5061a = gVarA;
                int i16 = this.f5077j;
                h(bVar);
                if (this.f5077j == i16 + 1) {
                    b bVar2 = this.f5080o;
                    bVar2.f5061a = null;
                    bVar2.f5064d.b();
                    for (int i17 = 0; i17 < bVar.f5064d.d(); i17++) {
                        bVar2.f5064d.a(bVar.f5064d.e(i17), bVar.f5064d.f(i17), true);
                    }
                    r(this.f5080o);
                    if (gVarA.C == -1) {
                        if (bVar.f5061a == gVarA && (gVarF = bVar.f(null, gVarA)) != null) {
                            bVar.g(gVarF);
                        }
                        if (!bVar.f5065e) {
                            bVar.f5061a.e(this, bVar);
                        }
                        ((d) iVar.B).b(bVar);
                        this.f5077j--;
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            g gVar4 = bVar.f5061a;
            if (gVar4 == null) {
                return;
            }
            if (gVar4.L != 1 && bVar.f5062b < f15) {
                return;
            }
        }
        if (z10) {
            return;
        }
        h(bVar);
    }

    public final void d(g gVar, int i10) {
        int i11 = gVar.C;
        if (i11 == -1) {
            gVar.d(this, i10);
            for (int i12 = 0; i12 < this.f5069b + 1; i12++) {
                g gVar2 = ((g[]) this.l.D)[i12];
            }
            return;
        }
        if (i11 == -1) {
            b bVarL = l();
            bVarL.f5061a = gVar;
            float f3 = i10;
            gVar.E = f3;
            bVarL.f5062b = f3;
            bVarL.f5065e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f5073f[i11];
        if (bVar.f5065e) {
            bVar.f5062b = i10;
            return;
        }
        if (bVar.f5064d.d() == 0) {
            bVar.f5065e = true;
            bVar.f5062b = i10;
            return;
        }
        b bVarL2 = l();
        if (i10 < 0) {
            bVarL2.f5062b = i10 * (-1);
            bVarL2.f5064d.g(gVar, 1.0f);
        } else {
            bVarL2.f5062b = i10;
            bVarL2.f5064d.g(gVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(g gVar, g gVar2, int i10, int i11) {
        if (i11 == 8 && gVar2.F && gVar.C == -1) {
            gVar.d(this, gVar2.E + i10);
            return;
        }
        b bVarL = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            bVarL.f5062b = i10;
        }
        if (z10) {
            bVarL.f5064d.g(gVar, 1.0f);
            bVarL.f5064d.g(gVar2, -1.0f);
        } else {
            bVarL.f5064d.g(gVar, -1.0f);
            bVarL.f5064d.g(gVar2, 1.0f);
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    public final void f(g gVar, g gVar2, int i10, int i11) {
        b bVarL = l();
        g gVarM = m();
        gVarM.D = 0;
        bVarL.b(gVar, gVar2, gVarM, i10);
        if (i11 != 8) {
            bVarL.f5064d.g(j(i11), (int) (bVarL.f5064d.c(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(g gVar, g gVar2, int i10, int i11) {
        b bVarL = l();
        g gVarM = m();
        gVarM.D = 0;
        bVarL.c(gVar, gVar2, gVarM, i10);
        if (i11 != 8) {
            bVarL.f5064d.g(j(i11), (int) (bVarL.f5064d.c(gVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f5065e) {
            bVar.f5061a.d(this, bVar.f5062b);
        } else {
            b[] bVarArr = this.f5073f;
            int i11 = this.f5077j;
            bVarArr[i11] = bVar;
            g gVar = bVar.f5061a;
            gVar.C = i11;
            this.f5077j = i11 + 1;
            gVar.e(this, bVar);
        }
        if (this.f5068a) {
            int i12 = 0;
            while (i12 < this.f5077j) {
                if (this.f5073f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f5073f[i12];
                if (bVar2 != null && bVar2.f5065e) {
                    bVar2.f5061a.d(this, bVar2.f5062b);
                    ((d) this.l.B).b(bVar2);
                    this.f5073f[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f5077j;
                        if (i13 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f5073f;
                        int i15 = i13 - 1;
                        b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        g gVar2 = bVar3.f5061a;
                        if (gVar2.C == i13) {
                            gVar2.C = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f5073f[i14] = null;
                    }
                    this.f5077j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f5068a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f5077j; i10++) {
            b bVar = this.f5073f[i10];
            bVar.f5061a.E = bVar.f5062b;
        }
    }

    public final g j(int i10) {
        if (this.f5076i + 1 >= this.f5072e) {
            o();
        }
        g gVarA = a(4);
        float[] fArr = gVarA.H;
        int i11 = this.f5069b + 1;
        this.f5069b = i11;
        this.f5076i++;
        gVarA.B = i11;
        gVarA.D = i10;
        ((g[]) this.l.D)[i11] = gVarA;
        e eVar = this.f5070c;
        eVar.f5086i.B = gVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[gVarA.D] = 1.0f;
        eVar.j(gVarA);
        return gVarA;
    }

    public final g k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f5076i + 1 >= this.f5072e) {
            o();
        }
        if (!(obj instanceof g4.d)) {
            return null;
        }
        g4.d dVar = (g4.d) obj;
        g gVar = dVar.f6122i;
        if (gVar == null) {
            dVar.k();
            gVar = dVar.f6122i;
        }
        int i10 = gVar.B;
        i iVar = this.l;
        if (i10 != -1 && i10 <= this.f5069b && ((g[]) iVar.D)[i10] != null) {
            return gVar;
        }
        if (i10 != -1) {
            gVar.c();
        }
        int i11 = this.f5069b + 1;
        this.f5069b = i11;
        this.f5076i++;
        gVar.B = i11;
        gVar.L = 1;
        ((g[]) iVar.D)[i11] = gVar;
        return gVar;
    }

    public final b l() {
        Object obj;
        i iVar = this.l;
        d dVar = (d) iVar.B;
        int i10 = dVar.f5082b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = dVar.f5081a;
            obj = objArr[i11];
            objArr[i11] = null;
            dVar.f5082b = i11;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(iVar);
        }
        bVar.f5061a = null;
        bVar.f5064d.b();
        bVar.f5062b = 0.0f;
        bVar.f5065e = false;
        return bVar;
    }

    public final g m() {
        if (this.f5076i + 1 >= this.f5072e) {
            o();
        }
        g gVarA = a(3);
        int i10 = this.f5069b + 1;
        this.f5069b = i10;
        this.f5076i++;
        gVarA.B = i10;
        ((g[]) this.l.D)[i10] = gVarA;
        return gVarA;
    }

    public final void o() {
        int i10 = this.f5071d * 2;
        this.f5071d = i10;
        this.f5073f = (b[]) Arrays.copyOf(this.f5073f, i10);
        i iVar = this.l;
        iVar.D = (g[]) Arrays.copyOf((g[]) iVar.D, this.f5071d);
        int i11 = this.f5071d;
        this.f5075h = new boolean[i11];
        this.f5072e = i11;
        this.f5078k = i11;
    }

    public final void p() {
        e eVar = this.f5070c;
        if (eVar.e()) {
            i();
            return;
        }
        if (!this.f5074g) {
            q(eVar);
            return;
        }
        for (int i10 = 0; i10 < this.f5077j; i10++) {
            if (!this.f5073f[i10].f5065e) {
                q(eVar);
                return;
            }
        }
        i();
    }

    public final void q(e eVar) {
        for (int i10 = 0; i10 < this.f5077j; i10++) {
            b bVar = this.f5073f[i10];
            int i11 = 1;
            if (bVar.f5061a.L != 1) {
                float f3 = 0.0f;
                if (bVar.f5062b < 0.0f) {
                    boolean z10 = false;
                    int i12 = 0;
                    while (!z10) {
                        i12 += i11;
                        float f10 = Float.MAX_VALUE;
                        int i13 = -1;
                        int i14 = -1;
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < this.f5077j) {
                            b bVar2 = this.f5073f[i15];
                            if (bVar2.f5061a.L != i11 && !bVar2.f5065e && bVar2.f5062b < f3) {
                                int iD = bVar2.f5064d.d();
                                int i17 = 0;
                                while (i17 < iD) {
                                    g gVarE = bVar2.f5064d.e(i17);
                                    float fC = bVar2.f5064d.c(gVarE);
                                    if (fC > f3) {
                                        for (int i18 = 0; i18 < 9; i18++) {
                                            float f11 = gVarE.G[i18] / fC;
                                            if ((f11 < f10 && i18 == i16) || i18 > i16) {
                                                i16 = i18;
                                                i14 = gVarE.B;
                                                i13 = i15;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i17++;
                                    f3 = 0.0f;
                                }
                            }
                            i15++;
                            f3 = 0.0f;
                            i11 = 1;
                        }
                        if (i13 != -1) {
                            b bVar3 = this.f5073f[i13];
                            bVar3.f5061a.C = -1;
                            bVar3.g(((g[]) this.l.D)[i14]);
                            g gVar = bVar3.f5061a;
                            gVar.C = i13;
                            gVar.e(this, bVar3);
                        } else {
                            z10 = true;
                        }
                        if (i12 > this.f5076i / 2) {
                            z10 = true;
                        }
                        f3 = 0.0f;
                        i11 = 1;
                    }
                    break;
                }
            }
        }
        r(eVar);
        i();
    }

    public final void r(b bVar) {
        boolean z10;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f5076i; i11++) {
            this.f5075h[i11] = false;
        }
        boolean z11 = false;
        int i12 = 0;
        while (!z11) {
            int i13 = 1;
            i12++;
            if (i12 >= this.f5076i * 2) {
                return;
            }
            g gVar = bVar.f5061a;
            if (gVar != null) {
                this.f5075h[gVar.B] = true;
            }
            g gVarD = bVar.d(this.f5075h);
            if (gVarD != null) {
                boolean[] zArr = this.f5075h;
                int i14 = gVarD.B;
                if (zArr[i14]) {
                    return;
                } else {
                    zArr[i14] = true;
                }
            }
            if (gVarD != null) {
                float f3 = Float.MAX_VALUE;
                int i15 = i10;
                int i16 = -1;
                while (i15 < this.f5077j) {
                    b bVar2 = this.f5073f[i15];
                    if (bVar2.f5061a.L != i13 && !bVar2.f5065e) {
                        a aVar = bVar2.f5064d;
                        int i17 = aVar.f5058h;
                        if (i17 == -1) {
                            z10 = false;
                            break;
                        }
                        int i18 = 0;
                        while (true) {
                            if (i17 == -1 || i18 >= aVar.f5051a) {
                                z10 = false;
                                break;
                            } else if (aVar.f5055e[i17] == gVarD.B) {
                                z10 = true;
                                break;
                            } else {
                                i17 = aVar.f5056f[i17];
                                i18++;
                            }
                        }
                        if (z10) {
                            float fC = bVar2.f5064d.c(gVarD);
                            if (fC < 0.0f) {
                                float f10 = (-bVar2.f5062b) / fC;
                                if (f10 < f3) {
                                    f3 = f10;
                                    i16 = i15;
                                }
                            }
                        }
                    }
                    i15++;
                    i13 = 1;
                }
                if (i16 > -1) {
                    b bVar3 = this.f5073f[i16];
                    bVar3.f5061a.C = -1;
                    bVar3.g(gVarD);
                    g gVar2 = bVar3.f5061a;
                    gVar2.C = i16;
                    gVar2.e(this, bVar3);
                }
            } else {
                z11 = true;
            }
            i10 = 0;
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f5077j; i10++) {
            b bVar = this.f5073f[i10];
            if (bVar != null) {
                ((d) this.l.B).b(bVar);
            }
            this.f5073f[i10] = null;
        }
    }

    public final void t() {
        i iVar;
        int i10 = 0;
        while (true) {
            iVar = this.l;
            g[] gVarArr = (g[]) iVar.D;
            if (i10 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i10];
            if (gVar != null) {
                gVar.c();
            }
            i10++;
        }
        d dVar = (d) iVar.C;
        g[] gVarArr2 = this.m;
        int length = this.f5079n;
        dVar.getClass();
        if (length > gVarArr2.length) {
            length = gVarArr2.length;
        }
        for (int i11 = 0; i11 < length; i11++) {
            g gVar2 = gVarArr2[i11];
            int i12 = dVar.f5082b;
            Object[] objArr = dVar.f5081a;
            if (i12 < objArr.length) {
                objArr[i12] = gVar2;
                dVar.f5082b = i12 + 1;
            }
        }
        this.f5079n = 0;
        Arrays.fill((g[]) iVar.D, (Object) null);
        this.f5069b = 0;
        e eVar = this.f5070c;
        eVar.f5085h = 0;
        eVar.f5062b = 0.0f;
        this.f5076i = 1;
        for (int i13 = 0; i13 < this.f5077j; i13++) {
            b bVar = this.f5073f[i13];
        }
        s();
        this.f5077j = 0;
        this.f5080o = new b(iVar);
    }
}
