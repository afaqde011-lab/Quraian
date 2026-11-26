package mc;

import android.graphics.Color;
import android.graphics.PointF;

public final class f implements d0 {
    public static final f B = new f(0);
    public static final f C = new f(1);
    public static final f D = new f(2);
    public static final f E = new f(3);
    public static final f F = new f(4);
    public static final f G = new f(5);
    public final int A;

    public f(int i10) {
        this.A = i10;
    }

    @Override
    public final Object e(nc.c cVar, float f3) {
        switch (this.A) {
            case 0:
                boolean z10 = cVar.O() == 1;
                if (z10) {
                    cVar.a();
                }
                double dF = cVar.F();
                double dF2 = cVar.F();
                double dF3 = cVar.F();
                double dF4 = cVar.O() == 7 ? cVar.F() : 1.0d;
                if (z10) {
                    cVar.l();
                }
                if (dF <= 1.0d && dF2 <= 1.0d && dF3 <= 1.0d) {
                    dF *= 255.0d;
                    dF2 *= 255.0d;
                    dF3 *= 255.0d;
                    if (dF4 <= 1.0d) {
                        dF4 *= 255.0d;
                    }
                }
                return Integer.valueOf(Color.argb((int) dF4, (int) dF, (int) dF2, (int) dF3));
            case 1:
                return Float.valueOf(n.d(cVar) * f3);
            case 2:
                return Integer.valueOf(Math.round(n.d(cVar) * f3));
            case 3:
                return n.b(cVar, f3);
            case 4:
                int iO = cVar.O();
                if (iO != 1 && iO != 3) {
                    if (iO != 7) {
                        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(g4.c.v(iO)));
                    }
                    PointF pointF = new PointF(((float) cVar.F()) * f3, ((float) cVar.F()) * f3);
                    while (cVar.x()) {
                        cVar.f0();
                    }
                    return pointF;
                }
                return n.b(cVar, f3);
            default:
                boolean z11 = cVar.O() == 1;
                if (z11) {
                    cVar.a();
                }
                float F2 = (float) cVar.F();
                float F3 = (float) cVar.F();
                while (cVar.x()) {
                    cVar.f0();
                }
                if (z11) {
                    cVar.l();
                }
                return new pc.b((F2 / 100.0f) * f3, (F3 / 100.0f) * f3);
        }
    }
}
