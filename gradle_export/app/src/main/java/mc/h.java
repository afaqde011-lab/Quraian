package mc;

import android.graphics.PointF;

public final class h implements d0 {
    public static final h A = new h();
    public static final h7.b B = h7.b.t("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override
    public final Object e(nc.c cVar, float f3) {
        cVar.i();
        String strI = null;
        float F = 0.0f;
        float F2 = 0.0f;
        float F3 = 0.0f;
        float F4 = 0.0f;
        int iG = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zA = true;
        int i10 = 3;
        String strI2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (cVar.x()) {
            switch (cVar.Z(B)) {
                case 0:
                    strI = cVar.I();
                    break;
                case 1:
                    strI2 = cVar.I();
                    break;
                case 2:
                    F = (float) cVar.F();
                    break;
                case 3:
                    int iG2 = cVar.G();
                    i10 = (iG2 <= 2 && iG2 >= 0) ? e4.f.c(3)[iG2] : 3;
                    break;
                case 4:
                    iG = cVar.G();
                    break;
                case 5:
                    F2 = (float) cVar.F();
                    break;
                case 6:
                    F3 = (float) cVar.F();
                    break;
                case 7:
                    iA = n.a(cVar);
                    break;
                case 8:
                    iA2 = n.a(cVar);
                    break;
                case 9:
                    F4 = (float) cVar.F();
                    break;
                case 10:
                    zA = cVar.A();
                    break;
                case 11:
                    cVar.a();
                    pointF = new PointF(((float) cVar.F()) * f3, ((float) cVar.F()) * f3);
                    cVar.l();
                    break;
                case 12:
                    cVar.a();
                    pointF = pointF;
                    pointF2 = new PointF(((float) cVar.F()) * f3, ((float) cVar.F()) * f3);
                    cVar.l();
                    break;
                default:
                    cVar.b0();
                    cVar.f0();
                    break;
            }
        }
        cVar.r();
        ic.b bVar = new ic.b();
        bVar.f7586a = strI;
        bVar.f7587b = strI2;
        bVar.f7588c = F;
        bVar.f7589d = i10;
        bVar.f7590e = iG;
        bVar.f7591f = F2;
        bVar.f7592g = F3;
        bVar.f7593h = iA;
        bVar.f7594i = iA2;
        bVar.f7595j = F4;
        bVar.f7596k = zA;
        bVar.l = pointF;
        bVar.m = pointF2;
        return bVar;
    }
}
