package e4;

import a1.i;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;

public class b {

    public final a f5064d;

    public g f5061a = null;

    public float f5062b = 0.0f;

    public final ArrayList f5063c = new ArrayList();

    public boolean f5065e = false;

    public b(i iVar) {
        this.f5064d = new a(this, iVar);
    }

    public final void a(c cVar, int i10) {
        this.f5064d.g(cVar.j(i10), 1.0f);
        this.f5064d.g(cVar.j(i10), -1.0f);
    }

    public final void b(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f5062b = i10;
        }
        if (z10) {
            this.f5064d.g(gVar, 1.0f);
            this.f5064d.g(gVar2, -1.0f);
            this.f5064d.g(gVar3, -1.0f);
        } else {
            this.f5064d.g(gVar, -1.0f);
            this.f5064d.g(gVar2, 1.0f);
            this.f5064d.g(gVar3, 1.0f);
        }
    }

    public final void c(g gVar, g gVar2, g gVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f5062b = i10;
        }
        if (z10) {
            this.f5064d.g(gVar, 1.0f);
            this.f5064d.g(gVar2, -1.0f);
            this.f5064d.g(gVar3, 1.0f);
        } else {
            this.f5064d.g(gVar, -1.0f);
            this.f5064d.g(gVar2, 1.0f);
            this.f5064d.g(gVar3, -1.0f);
        }
    }

    public g d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f5061a == null && this.f5062b == 0.0f && this.f5064d.d() == 0;
    }

    public final g f(boolean[] zArr, g gVar) {
        int i10;
        int iD = this.f5064d.d();
        g gVar2 = null;
        float f3 = 0.0f;
        for (int i11 = 0; i11 < iD; i11++) {
            float f10 = this.f5064d.f(i11);
            if (f10 < 0.0f) {
                g gVarE = this.f5064d.e(i11);
                if ((zArr == null || !zArr[gVarE.B]) && gVarE != gVar && (((i10 = gVarE.L) == 3 || i10 == 4) && f10 < f3)) {
                    f3 = f10;
                    gVar2 = gVarE;
                }
            }
        }
        return gVar2;
    }

    public final void g(g gVar) {
        g gVar2 = this.f5061a;
        if (gVar2 != null) {
            this.f5064d.g(gVar2, -1.0f);
            this.f5061a.C = -1;
            this.f5061a = null;
        }
        float fH = this.f5064d.h(gVar, true) * (-1.0f);
        this.f5061a = gVar;
        if (fH == 1.0f) {
            return;
        }
        this.f5062b /= fH;
        a aVar = this.f5064d;
        int i10 = aVar.f5058h;
        for (int i11 = 0; i10 != -1 && i11 < aVar.f5051a; i11++) {
            float[] fArr = aVar.f5057g;
            fArr[i10] = fArr[i10] / fH;
            i10 = aVar.f5056f[i10];
        }
    }

    public final void h(c cVar, g gVar, boolean z10) {
        if (gVar.F) {
            float fC = this.f5064d.c(gVar);
            this.f5062b = (gVar.E * fC) + this.f5062b;
            this.f5064d.h(gVar, z10);
            if (z10) {
                gVar.b(this);
            }
            if (this.f5064d.d() == 0) {
                this.f5065e = true;
                cVar.f5068a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        a aVar = this.f5064d;
        aVar.getClass();
        float fC = aVar.c(bVar.f5061a);
        aVar.h(bVar.f5061a, z10);
        a aVar2 = bVar.f5064d;
        int iD = aVar2.d();
        for (int i10 = 0; i10 < iD; i10++) {
            g gVarE = aVar2.e(i10);
            aVar.a(gVarE, aVar2.c(gVarE) * fC, z10);
        }
        this.f5062b = (bVar.f5062b * fC) + this.f5062b;
        if (z10) {
            bVar.f5061a.b(this);
        }
        if (this.f5061a == null || this.f5064d.d() != 0) {
            return;
        }
        this.f5065e = true;
        cVar.f5068a = true;
    }

    public String toString() {
        boolean z10;
        String strJ = w.c.j(this.f5061a == null ? "0" : RuntimeVersion.SUFFIX + this.f5061a, " = ");
        if (this.f5062b != 0.0f) {
            StringBuilder sbQ = x5.q(strJ);
            sbQ.append(this.f5062b);
            strJ = sbQ.toString();
            z10 = true;
        } else {
            z10 = false;
        }
        int iD = this.f5064d.d();
        for (int i10 = 0; i10 < iD; i10++) {
            g gVarE = this.f5064d.e(i10);
            if (gVarE != null) {
                float f3 = this.f5064d.f(i10);
                if (f3 != 0.0f) {
                    String string = gVarE.toString();
                    if (z10) {
                        if (f3 > 0.0f) {
                            strJ = w.c.j(strJ, " + ");
                        } else {
                            strJ = w.c.j(strJ, " - ");
                            f3 *= -1.0f;
                        }
                    } else if (f3 < 0.0f) {
                        strJ = w.c.j(strJ, "- ");
                        f3 *= -1.0f;
                    }
                    strJ = f3 == 1.0f ? w.c.j(strJ, string) : strJ + f3 + " " + string;
                    z10 = true;
                }
            }
        }
        return !z10 ? w.c.j(strJ, "0.0") : strJ;
    }
}
