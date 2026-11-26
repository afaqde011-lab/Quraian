package mc;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

public abstract class n {

    public static final h7.b f10850a = h7.b.t("x", "y");

    public static int a(nc.c cVar) {
        cVar.a();
        int iF = (int) (cVar.F() * 255.0d);
        int iF2 = (int) (cVar.F() * 255.0d);
        int iF3 = (int) (cVar.F() * 255.0d);
        while (cVar.x()) {
            cVar.f0();
        }
        cVar.l();
        return Color.argb(255, iF, iF2, iF3);
    }

    public static PointF b(nc.c cVar, float f3) {
        int iB = e4.f.b(cVar.O());
        if (iB == 0) {
            cVar.a();
            float F = (float) cVar.F();
            float F2 = (float) cVar.F();
            while (cVar.O() != 2) {
                cVar.f0();
            }
            cVar.l();
            return new PointF(F * f3, F2 * f3);
        }
        if (iB != 2) {
            if (iB != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(g4.c.v(cVar.O())));
            }
            float F3 = (float) cVar.F();
            float F4 = (float) cVar.F();
            while (cVar.x()) {
                cVar.f0();
            }
            return new PointF(F3 * f3, F4 * f3);
        }
        cVar.i();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (cVar.x()) {
            int iZ = cVar.Z(f10850a);
            if (iZ == 0) {
                fD = d(cVar);
            } else if (iZ != 1) {
                cVar.b0();
                cVar.f0();
            } else {
                fD2 = d(cVar);
            }
        }
        cVar.r();
        return new PointF(fD * f3, fD2 * f3);
    }

    public static ArrayList c(nc.c cVar, float f3) {
        ArrayList arrayList = new ArrayList();
        cVar.a();
        while (cVar.O() == 1) {
            cVar.a();
            arrayList.add(b(cVar, f3));
            cVar.l();
        }
        cVar.l();
        return arrayList;
    }

    public static float d(nc.c cVar) {
        int iO = cVar.O();
        int iB = e4.f.b(iO);
        if (iB != 0) {
            if (iB == 6) {
                return (float) cVar.F();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(g4.c.v(iO)));
        }
        cVar.a();
        float F = (float) cVar.F();
        while (cVar.x()) {
            cVar.f0();
        }
        cVar.l();
        return F;
    }
}
