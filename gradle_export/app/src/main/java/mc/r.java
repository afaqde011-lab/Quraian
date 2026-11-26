package mc;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import u.t0;

public abstract class r {

    public static final h7.b f10858a = h7.b.t("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    public static final h7.b f10859b = h7.b.t("id", "layers", "w", "h", "p", "u");

    public static final h7.b f10860c = h7.b.t("list");

    public static final h7.b f10861d = h7.b.t("cm", "tm", "dr");

    public static cc.a a(nc.d dVar) {
        float f3;
        ArrayList arrayList;
        t0 t0Var;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float fC = oc.e.c();
        u.q qVar = new u.q((Object) null);
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        t0 t0Var2 = new t0(0);
        cc.a aVar = new cc.a();
        dVar.i();
        float F = 0.0f;
        int iG = 0;
        int iG2 = 0;
        float F2 = 0.0f;
        float F3 = 0.0f;
        while (dVar.x()) {
            int i10 = 1;
            switch (dVar.Z(f10858a)) {
                case 0:
                    iG = dVar.G();
                    break;
                case 1:
                    iG2 = dVar.G();
                    break;
                case 2:
                    F = (float) dVar.F();
                    arrayList3 = arrayList3;
                    map3 = map3;
                    break;
                case 3:
                    f3 = fC;
                    F2 = ((float) dVar.F()) - 0.01f;
                    arrayList3 = arrayList3;
                    map3 = map3;
                    fC = f3;
                    break;
                case 4:
                    F3 = (float) dVar.F();
                    arrayList3 = arrayList3;
                    map3 = map3;
                    break;
                case 5:
                    f3 = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    String[] strArrSplit = dVar.I().split("\\.");
                    int i11 = Integer.parseInt(strArrSplit[0]);
                    int i12 = Integer.parseInt(strArrSplit[1]);
                    int i13 = Integer.parseInt(strArrSplit[2]);
                    if (i11 < 4 || (i11 <= 4 && (i12 < 4 || (i12 <= 4 && i13 < 0)))) {
                        aVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                case 6:
                    f3 = fC;
                    map3 = map3;
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    dVar.a();
                    int i14 = 0;
                    while (dVar.x()) {
                        lc.e eVarA = q.a(dVar, aVar);
                        if (eVarA.f10243e == 3) {
                            i14++;
                        }
                        arrayList2.add(eVarA);
                        qVar.e(eVarA, eVarA.f10242d);
                        if (i14 > 4) {
                            oc.b.a("You have " + i14 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    dVar.l();
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                case 7:
                    f3 = fC;
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    dVar.a();
                    while (dVar.x()) {
                        ArrayList arrayList4 = new ArrayList();
                        String strI = null;
                        u.q qVar2 = new u.q((Object) null);
                        dVar.i();
                        HashMap map4 = map3;
                        String strI2 = null;
                        int iG3 = 0;
                        int iG4 = 0;
                        while (dVar.x()) {
                            F3 = F3;
                            int iZ = dVar.Z(f10859b);
                            if (iZ != 0) {
                                float f15 = F2;
                                if (iZ != 1) {
                                    if (iZ == 2) {
                                        iG3 = dVar.G();
                                    } else if (iZ == 3) {
                                        iG4 = dVar.G();
                                    } else if (iZ == 4) {
                                        strI = dVar.I();
                                    } else if (iZ != 5) {
                                        dVar.b0();
                                        dVar.f0();
                                        f13 = F;
                                    } else {
                                        dVar.I();
                                    }
                                    F2 = f15;
                                } else {
                                    dVar.a();
                                    while (dVar.x()) {
                                        lc.e eVarA2 = q.a(dVar, aVar);
                                        qVar2.e(eVarA2, eVarA2.f10242d);
                                        arrayList4.add(eVarA2);
                                        F = F;
                                    }
                                    f13 = F;
                                    dVar.l();
                                }
                                F = f13;
                                F2 = f15;
                            } else {
                                strI2 = dVar.I();
                            }
                        }
                        float f16 = F;
                        float f17 = F2;
                        float f18 = F3;
                        dVar.r();
                        if (strI != null) {
                            map2.put(strI2, new cc.j(iG3, iG4, strI2, strI));
                        } else {
                            map.put(strI2, arrayList4);
                        }
                        F = f16;
                        map3 = map4;
                        F3 = f18;
                        F2 = f17;
                    }
                    map3 = map3;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    dVar.l();
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                case 8:
                    f3 = fC;
                    dVar.i();
                    while (dVar.x()) {
                        if (dVar.Z(f10860c) != 0) {
                            dVar.b0();
                            dVar.f0();
                        } else {
                            dVar.a();
                            while (dVar.x()) {
                                h7.b bVar = k.f10844a;
                                dVar.i();
                                String strI3 = null;
                                String strI4 = null;
                                String strI5 = null;
                                while (dVar.x()) {
                                    arrayList3 = arrayList3;
                                    int iZ2 = dVar.Z(k.f10844a);
                                    if (iZ2 != 0) {
                                        t0 t0Var3 = t0Var2;
                                        if (iZ2 == 1) {
                                            strI4 = dVar.I();
                                        } else if (iZ2 == 2) {
                                            strI5 = dVar.I();
                                        } else if (iZ2 != 3) {
                                            dVar.b0();
                                            dVar.f0();
                                        } else {
                                            dVar.F();
                                        }
                                        t0Var2 = t0Var3;
                                    } else {
                                        strI3 = dVar.I();
                                    }
                                }
                                dVar.r();
                                map3.put(strI4, new ic.c(strI3, strI4, strI5));
                                arrayList3 = arrayList3;
                            }
                            dVar.l();
                        }
                    }
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    dVar.r();
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                case 9:
                    dVar.a();
                    while (dVar.x()) {
                        h7.b bVar2 = j.f10842a;
                        ArrayList arrayList5 = new ArrayList();
                        dVar.i();
                        double dF = 0.0d;
                        char cCharAt = 0;
                        String strI6 = null;
                        String strI7 = null;
                        while (dVar.x()) {
                            int iZ3 = dVar.Z(j.f10842a);
                            if (iZ3 != 0) {
                                f14 = fC;
                                if (iZ3 == 1) {
                                    dVar.F();
                                } else if (iZ3 == 2) {
                                    dF = dVar.F();
                                } else if (iZ3 == 3) {
                                    strI6 = dVar.I();
                                } else if (iZ3 == 4) {
                                    strI7 = dVar.I();
                                } else if (iZ3 != 5) {
                                    dVar.b0();
                                    dVar.f0();
                                } else {
                                    dVar.i();
                                    while (dVar.x()) {
                                        if (dVar.Z(j.f10843b) != 0) {
                                            dVar.b0();
                                            dVar.f0();
                                        } else {
                                            dVar.a();
                                            while (dVar.x()) {
                                                arrayList5.add((kc.m) g.a(dVar, aVar));
                                            }
                                            dVar.l();
                                        }
                                    }
                                    dVar.r();
                                }
                            } else {
                                f14 = fC;
                                cCharAt = dVar.I().charAt(0);
                            }
                            fC = f14;
                        }
                        dVar.r();
                        ic.d dVar2 = new ic.d(arrayList5, cCharAt, dF, strI6, strI7);
                        t0Var2.e(dVar2.hashCode(), dVar2);
                        fC = fC;
                    }
                    f3 = fC;
                    dVar.l();
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                case 10:
                    dVar.a();
                    while (dVar.x()) {
                        dVar.i();
                        while (dVar.x()) {
                            int iZ4 = dVar.Z(f10861d);
                            if (iZ4 == 0) {
                                dVar.I();
                            } else if (iZ4 == i10) {
                                dVar.F();
                            } else if (iZ4 != 2) {
                                dVar.b0();
                                dVar.f0();
                            } else {
                                dVar.F();
                            }
                            i10 = 1;
                        }
                        dVar.r();
                        arrayList3.add(new gj.e(16));
                        i10 = 1;
                    }
                    dVar.l();
                    f3 = fC;
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
                default:
                    dVar.b0();
                    dVar.f0();
                    f3 = fC;
                    arrayList = arrayList3;
                    t0Var = t0Var2;
                    f10 = F;
                    f11 = F2;
                    f12 = F3;
                    F = f10;
                    arrayList3 = arrayList;
                    t0Var2 = t0Var;
                    map3 = map3;
                    F3 = f12;
                    F2 = f11;
                    fC = f3;
                    break;
            }
        }
        float f19 = fC;
        aVar.f3114i = new Rect(0, 0, (int) (iG * f19), (int) (iG2 * f19));
        aVar.f3115j = F;
        aVar.f3116k = F2;
        aVar.l = F3;
        aVar.f3113h = arrayList2;
        aVar.f3112g = qVar;
        aVar.f3108c = map;
        aVar.f3109d = map2;
        aVar.f3111f = t0Var2;
        aVar.f3110e = map3;
        return aVar;
    }
}
