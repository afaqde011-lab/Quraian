package mc;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import c3.s0;

public abstract class o {

    public static final LinearInterpolator f10851a = new LinearInterpolator();

    public static final h7.b f10852b = h7.b.t("t", "s", "e", "o", "i", "h", "to", "ti");

    public static final h7.b f10853c = h7.b.t("x", "y");

    public static BaseInterpolator a(PointF pointF, PointF pointF2) {
        pointF.x = oc.d.b(pointF.x, -1.0f, 1.0f);
        pointF.y = oc.d.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = oc.d.b(pointF2.x, -1.0f, 1.0f);
        float fB = oc.d.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        s0 s0Var = oc.e.f11922a;
        try {
            return new PathInterpolator(pointF.x, pointF.y, pointF2.x, fB);
        } catch (IllegalArgumentException e3) {
            return "The Path cannot loop back on itself.".equals(e3.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
    }

    public static pc.a b(nc.c cVar, cc.a aVar, float f3, d0 d0Var, boolean z10, boolean z11) {
        Object obj;
        BaseInterpolator baseInterpolatorA;
        BaseInterpolator baseInterpolatorA2;
        BaseInterpolator baseInterpolatorA3;
        Object obj2;
        pc.a aVar2;
        h7.b bVar;
        h7.b bVar2;
        PointF pointF;
        h7.b bVar3 = f10852b;
        LinearInterpolator linearInterpolator = f10851a;
        if (!z10 || !z11) {
            h7.b bVar4 = bVar3;
            if (!z10) {
                return new pc.a(d0Var.e(cVar, f3));
            }
            cVar.i();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z12 = false;
            Object objE = null;
            float F = 0.0f;
            Object objE2 = null;
            while (cVar.x()) {
                bVar4 = bVar4;
                switch (cVar.Z(bVar4)) {
                    case 0:
                        F = (float) cVar.F();
                        continue;
                    case 1:
                        objE = d0Var.e(cVar, f3);
                        break;
                    case 2:
                        objE2 = d0Var.e(cVar, f3);
                        break;
                    case 3:
                        pointFB4 = n.b(cVar, 1.0f);
                        break;
                    case 4:
                        pointFB = n.b(cVar, 1.0f);
                        break;
                    case 5:
                        z12 = cVar.G() == 1;
                        break;
                    case 6:
                        pointFB2 = n.b(cVar, f3);
                        break;
                    case 7:
                        pointFB3 = n.b(cVar, f3);
                        break;
                    default:
                        cVar.f0();
                        break;
                }
            }
            cVar.r();
            if (!z12) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objE2;
                } else {
                    baseInterpolatorA = a(pointFB4, pointFB);
                    obj = objE2;
                }
                pc.a aVar3 = new pc.a(aVar, objE, obj, baseInterpolatorA, F, (Float) null);
                aVar3.f12486o = pointFB2;
                aVar3.f12487p = pointFB3;
                return aVar3;
            }
            obj = objE;
            baseInterpolatorA = linearInterpolator;
            pc.a aVar4 = new pc.a(aVar, objE, obj, baseInterpolatorA, F, (Float) null);
            aVar4.f12486o = pointFB2;
            aVar4.f12487p = pointFB3;
            return aVar4;
        }
        cVar.i();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z13 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objE3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float F2 = 0.0f;
        Object objE4 = null;
        while (cVar.x()) {
            int iZ = cVar.Z(bVar3);
            h7.b bVar5 = f10853c;
            linearInterpolator = linearInterpolator;
            switch (iZ) {
                case 0:
                    bVar = bVar3;
                    F2 = (float) cVar.F();
                    bVar3 = bVar;
                    break;
                case 1:
                    bVar = bVar3;
                    objE3 = d0Var.e(cVar, f3);
                    bVar3 = bVar;
                    break;
                case 2:
                    bVar = bVar3;
                    objE4 = d0Var.e(cVar, f3);
                    bVar3 = bVar;
                    break;
                case 3:
                    bVar = bVar3;
                    boolean z14 = z13;
                    Object obj3 = objE3;
                    PointF pointF6 = pointF4;
                    if (cVar.O() == 3) {
                        cVar.i();
                        float F3 = 0.0f;
                        float F4 = 0.0f;
                        float F5 = 0.0f;
                        float F6 = 0.0f;
                        while (cVar.x()) {
                            int iZ2 = cVar.Z(bVar5);
                            if (iZ2 != 0) {
                                if (iZ2 != 1) {
                                    cVar.f0();
                                } else if (cVar.O() == 7) {
                                    F6 = (float) cVar.F();
                                    F4 = F6;
                                } else {
                                    cVar.a();
                                    F4 = (float) cVar.F();
                                    F6 = cVar.O() == 7 ? (float) cVar.F() : F4;
                                    cVar.l();
                                }
                            } else if (cVar.O() == 7) {
                                F5 = (float) cVar.F();
                                F3 = F5;
                            } else {
                                cVar.a();
                                F3 = (float) cVar.F();
                                F5 = cVar.O() == 7 ? (float) cVar.F() : F3;
                                cVar.l();
                            }
                        }
                        PointF pointF7 = new PointF(F3, F4);
                        pointF4 = new PointF(F5, F6);
                        cVar.r();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = n.b(cVar, f3);
                        pointF4 = pointF6;
                    }
                    z13 = z14;
                    objE3 = obj3;
                    bVar3 = bVar;
                    break;
                case 4:
                    boolean z15 = z13;
                    if (cVar.O() == 3) {
                        cVar.i();
                        float F7 = 0.0f;
                        float F8 = 0.0f;
                        float F9 = 0.0f;
                        float F10 = 0.0f;
                        while (cVar.x()) {
                            Object obj4 = objE3;
                            int iZ3 = cVar.Z(bVar5);
                            if (iZ3 != 0) {
                                bVar2 = bVar3;
                                if (iZ3 != 1) {
                                    cVar.f0();
                                } else if (cVar.O() == 7) {
                                    F10 = (float) cVar.F();
                                    pointF4 = pointF4;
                                    F8 = F10;
                                } else {
                                    pointF = pointF4;
                                    cVar.a();
                                    F8 = (float) cVar.F();
                                    F10 = cVar.O() == 7 ? (float) cVar.F() : F8;
                                    cVar.l();
                                    pointF4 = pointF;
                                }
                            } else {
                                bVar2 = bVar3;
                                pointF = pointF4;
                                if (cVar.O() == 7) {
                                    F9 = (float) cVar.F();
                                    pointF4 = pointF;
                                    F7 = F9;
                                } else {
                                    cVar.a();
                                    F7 = (float) cVar.F();
                                    F9 = cVar.O() == 7 ? (float) cVar.F() : F7;
                                    cVar.l();
                                    pointF4 = pointF;
                                }
                            }
                            objE3 = obj4;
                            bVar3 = bVar2;
                        }
                        bVar = bVar3;
                        PointF pointF8 = new PointF(F7, F8);
                        pointF2 = new PointF(F9, F10);
                        cVar.r();
                        pointF5 = pointF8;
                    } else {
                        bVar = bVar3;
                        pointFB8 = n.b(cVar, f3);
                    }
                    z13 = z15;
                    bVar3 = bVar;
                    break;
                case 5:
                    z13 = cVar.G() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = n.b(cVar, f3);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = n.b(cVar, f3);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    cVar.f0();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        BaseInterpolator baseInterpolatorA4 = linearInterpolator;
        boolean z16 = z13;
        Object obj5 = objE3;
        PointF pointF9 = pointF4;
        cVar.r();
        if (z16) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    baseInterpolatorA2 = a(pointF3, pointF5);
                    baseInterpolatorA3 = a(pointF9, pointF2);
                    obj2 = objE4;
                    baseInterpolatorA4 = null;
                }
                if (baseInterpolatorA2 != null || baseInterpolatorA3 == null) {
                    aVar2 = new pc.a(aVar, obj5, obj2, baseInterpolatorA4, F2, (Float) null);
                } else {
                    aVar2 = new pc.a(aVar, obj5, obj2, baseInterpolatorA2, baseInterpolatorA3, F2);
                }
                aVar2.f12486o = pointFB5;
                aVar2.f12487p = pointFB6;
                return aVar2;
            }
            baseInterpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objE4;
        }
        baseInterpolatorA2 = null;
        baseInterpolatorA3 = null;
        if (baseInterpolatorA2 != null) {
            aVar2 = new pc.a(aVar, obj5, obj2, baseInterpolatorA4, F2, (Float) null);
        } else {
            aVar2 = new pc.a(aVar, obj5, obj2, baseInterpolatorA4, F2, (Float) null);
        }
        aVar2.f12486o = pointFB5;
        aVar2.f12487p = pointFB6;
        return aVar2;
    }
}
