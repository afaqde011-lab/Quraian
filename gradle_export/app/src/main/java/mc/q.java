package mc;

import android.graphics.Color;
import android.view.animation.BaseInterpolator;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;

public abstract class q {

    public static final h7.b f10855a = h7.b.t("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    public static final h7.b f10856b = h7.b.t("d", "a");

    public static final h7.b f10857c = h7.b.t("ty", "nm");

    public static lc.e a(nc.d dVar, cc.a aVar) {
        String str;
        Float f3;
        boolean z10;
        boolean z11;
        oj.q qVar;
        jc.b bVar;
        jc.b bVar2;
        jc.b bVar3;
        jc.b bVar4;
        ?? r13;
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dVar.i();
        boolean z12 = false;
        boolean z13 = true;
        float F = 1.0f;
        int i10 = 0;
        int iC = 0;
        int iC2 = 0;
        int color = 0;
        boolean zA = false;
        int i11 = 1;
        String strI = "UNSET";
        float F2 = 0.0f;
        float F3 = 0.0f;
        float F4 = 0.0f;
        float F5 = 0.0f;
        float F6 = 0.0f;
        long jG = 0;
        long jG2 = -1;
        String strI2 = null;
        jc.a aVar2 = null;
        oj.q qVar2 = null;
        String strI3 = null;
        hf.c cVar = null;
        ce.c cVar2 = null;
        jc.d dVarA = null;
        jc.b bVarS0 = null;
        while (dVar.x()) {
            oj.q qVar3 = null;
            qVar2 = qVar2;
            switch (dVar.Z(f10855a)) {
                case 0:
                    fValueOf = fValueOf;
                    strI = dVar.I();
                    fValueOf = fValueOf;
                    break;
                case 1:
                    jG = dVar.G();
                    z13 = z13;
                    z12 = z12;
                    fValueOf = fValueOf;
                    break;
                case 2:
                    fValueOf = fValueOf;
                    strI3 = dVar.I();
                    fValueOf = fValueOf;
                    break;
                case 3:
                    f3 = fValueOf;
                    z10 = z12;
                    z11 = z13;
                    int iG = dVar.G();
                    i10 = 7;
                    if (iG < 6) {
                        i10 = e4.f.c(7)[iG];
                    }
                    z12 = z10;
                    qVar2 = qVar2;
                    fValueOf = f3;
                    z13 = z11;
                    break;
                case 4:
                    jG2 = dVar.G();
                    z12 = z12;
                    fValueOf = fValueOf;
                    break;
                case 5:
                    iC = (int) (oc.e.c() * dVar.G());
                    z13 = z13;
                    z12 = z12;
                    fValueOf = fValueOf;
                    break;
                case 6:
                    iC2 = (int) (oc.e.c() * dVar.G());
                    z13 = z13;
                    z12 = z12;
                    fValueOf = fValueOf;
                    break;
                case 7:
                    color = Color.parseColor(dVar.I());
                    z12 = z12;
                    fValueOf = fValueOf;
                    break;
                case 8:
                    fValueOf = fValueOf;
                    dVarA = c.a(dVar, aVar);
                    fValueOf = fValueOf;
                    break;
                case 9:
                    f3 = fValueOf;
                    z10 = z12;
                    int iG2 = dVar.G();
                    if (iG2 < e4.f.c(6).length) {
                        i11 = e4.f.c(6)[iG2];
                        int iB = e4.f.b(i11);
                        if (iB == 3) {
                            aVar.a("Unsupported matte type: Luma");
                        } else if (iB == 4) {
                            aVar.a("Unsupported matte type: Luma Inverted");
                        }
                        z11 = true;
                        aVar.m++;
                        z12 = z10;
                        qVar2 = qVar2;
                        fValueOf = f3;
                        z13 = z11;
                    } else {
                        aVar.a("Unsupported matte type: " + iG2);
                        z12 = z10;
                        qVar2 = qVar2;
                        fValueOf = f3;
                        z13 = true;
                    }
                    break;
                case 10:
                    dVar.a();
                    while (dVar.x()) {
                        dVar.i();
                        jc.a aVarU0 = null;
                        boolean zA2 = false;
                        jc.a aVar3 = null;
                        int i12 = 0;
                        while (dVar.x()) {
                            String strS0 = dVar.s0();
                            strS0.getClass();
                            switch (strS0) {
                                case "o":
                                    aVarU0 = ab.a0.u0(dVar, aVar);
                                    break;
                                case "pt":
                                    aVar3 = new jc.a(5, p.a(dVar, aVar, oc.e.c(), x.A, false));
                                    break;
                                case "inv":
                                    zA2 = dVar.A();
                                    break;
                                case "mode":
                                    String strI4 = dVar.I();
                                    strI4.getClass();
                                    switch (strI4) {
                                        case "a":
                                            i12 = 1;
                                            break;
                                        case "i":
                                            aVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            i12 = 3;
                                            break;
                                        case "n":
                                            i12 = 4;
                                            break;
                                        case "s":
                                            i12 = 2;
                                            break;
                                        default:
                                            oc.b.a("Unknown mask mode " + strS0 + ". Defaulting to Add.");
                                            i12 = 1;
                                            break;
                                    }
                                    break;
                                default:
                                    dVar.f0();
                                    break;
                            }
                            fValueOf = fValueOf;
                        }
                        dVar.r();
                        arrayList.add(new kc.f(i12, aVar3, aVarU0, zA2));
                        fValueOf = fValueOf;
                    }
                    f3 = fValueOf;
                    z10 = false;
                    aVar.m += arrayList.size();
                    dVar.l();
                    z12 = z10;
                    qVar2 = qVar2;
                    fValueOf = f3;
                    z13 = true;
                    break;
                case 11:
                    dVar.a();
                    while (dVar.x()) {
                        kc.b bVarA = g.a(dVar, aVar);
                        if (bVarA != null) {
                            arrayList2.add(bVarA);
                        }
                    }
                    dVar.l();
                    f3 = fValueOf;
                    z10 = false;
                    z12 = z10;
                    qVar2 = qVar2;
                    fValueOf = f3;
                    z13 = true;
                    break;
                case 12:
                    dVar.i();
                    jc.a aVar4 = aVar2;
                    qVar2 = qVar2;
                    while (dVar.x()) {
                        int iZ = dVar.Z(f10856b);
                        if (iZ == 0) {
                            aVar4 = new jc.a(6, p.a(dVar, aVar, oc.e.c(), h.A, false));
                            qVar3 = null;
                        } else if (iZ != 1) {
                            dVar.b0();
                            dVar.f0();
                        } else {
                            dVar.a();
                            if (dVar.x()) {
                                h7.b bVar5 = b.f10824a;
                                dVar.i();
                                oj.q qVar4 = qVar3;
                                while (dVar.x()) {
                                    if (dVar.Z(b.f10824a) != 0) {
                                        dVar.b0();
                                        dVar.f0();
                                    } else {
                                        dVar.i();
                                        Object objR0 = qVar3;
                                        Object objR1 = objR0;
                                        Object objS0 = objR1;
                                        Object objS1 = objS0;
                                        while (dVar.x()) {
                                            int iZ2 = dVar.Z(b.f10825b);
                                            if (iZ2 == 0) {
                                                objR0 = ab.a0.r0(dVar, aVar);
                                            } else if (iZ2 == 1) {
                                                objR1 = ab.a0.r0(dVar, aVar);
                                            } else if (iZ2 == 2) {
                                                objS0 = ab.a0.s0(dVar, aVar, true);
                                            } else if (iZ2 != 3) {
                                                dVar.b0();
                                                dVar.f0();
                                            } else {
                                                objS1 = ab.a0.s0(dVar, aVar, true);
                                            }
                                        }
                                        dVar.r();
                                        qVar4 = new oj.q(objR0, objR1, objS0, objS1, 20);
                                    }
                                }
                                dVar.r();
                                if (qVar4 == null) {
                                    qVar = qVar3;
                                    qVar2 = new oj.q(qVar, qVar, qVar, qVar, 20);
                                } else {
                                    qVar = qVar3;
                                    qVar2 = qVar4;
                                }
                            } else {
                                qVar = qVar3;
                            }
                            while (dVar.x()) {
                                dVar.f0();
                            }
                            dVar.l();
                            qVar3 = qVar;
                        }
                    }
                    dVar.r();
                    aVar2 = aVar4;
                    z12 = false;
                    z13 = true;
                    break;
                case 13:
                    dVar.a();
                    ArrayList arrayList3 = new ArrayList();
                    while (dVar.x()) {
                        dVar.i();
                        while (dVar.x()) {
                            int iZ3 = dVar.Z(f10857c);
                            if (iZ3 == 0) {
                                int iG3 = dVar.G();
                                if (iG3 == 29) {
                                    h7.b bVar6 = d.f10831a;
                                    cVar = null;
                                    while (dVar.x()) {
                                        if (dVar.Z(d.f10831a) != 0) {
                                            dVar.b0();
                                            dVar.f0();
                                        } else {
                                            dVar.a();
                                            while (dVar.x()) {
                                                dVar.i();
                                                boolean z14 = z12;
                                                hf.c cVar3 = null;
                                                while (dVar.x()) {
                                                    int iZ4 = dVar.Z(d.f10832b);
                                                    if (iZ4 == 0) {
                                                        z14 = dVar.G() == 0 ? z13 : false;
                                                    } else if (iZ4 != z13) {
                                                        dVar.b0();
                                                        dVar.f0();
                                                    } else if (z14) {
                                                        cVar3 = new hf.c(ab.a0.s0(dVar, aVar, z13), 14);
                                                    } else {
                                                        dVar.f0();
                                                    }
                                                }
                                                dVar.r();
                                                if (cVar3 != null) {
                                                    cVar = cVar3;
                                                }
                                                z12 = false;
                                            }
                                            dVar.l();
                                            z12 = false;
                                        }
                                    }
                                } else if (iG3 == 25) {
                                    i iVar = new i();
                                    while (dVar.x()) {
                                        if (dVar.Z(i.f10835f) != 0) {
                                            dVar.b0();
                                            dVar.f0();
                                        } else {
                                            dVar.a();
                                            while (dVar.x()) {
                                                dVar.i();
                                                String strI5 = RuntimeVersion.SUFFIX;
                                                while (dVar.x()) {
                                                    int iZ5 = dVar.Z(i.f10836g);
                                                    if (iZ5 == 0) {
                                                        strI5 = dVar.I();
                                                    } else if (iZ5 == z13) {
                                                        strI5.getClass();
                                                        switch (strI5.hashCode()) {
                                                            case 353103893:
                                                                if (!strI5.equals("Distance")) {
                                                                    r13 = -1;
                                                                } else {
                                                                    r13 = 0;
                                                                }
                                                                break;
                                                            case 397447147:
                                                                if (!strI5.equals("Opacity")) {
                                                                    r13 = -1;
                                                                } else {
                                                                    r13 = z13;
                                                                }
                                                                break;
                                                            case 1041377119:
                                                                if (!strI5.equals("Direction")) {
                                                                    r13 = -1;
                                                                } else {
                                                                    r13 = 2;
                                                                }
                                                                break;
                                                            case 1379387491:
                                                                if (!strI5.equals("Shadow Color")) {
                                                                    r13 = -1;
                                                                } else {
                                                                    r13 = 3;
                                                                }
                                                                break;
                                                            case 1383710113:
                                                                if (!strI5.equals("Softness")) {
                                                                    r13 = -1;
                                                                } else {
                                                                    r13 = 4;
                                                                }
                                                                break;
                                                            default:
                                                                r13 = -1;
                                                                break;
                                                        }
                                                        switch (r13) {
                                                            case 0:
                                                                iVar.f10840d = ab.a0.s0(dVar, aVar, z13);
                                                                break;
                                                            case 1:
                                                                iVar.f10838b = ab.a0.s0(dVar, aVar, false);
                                                                break;
                                                            case 2:
                                                                iVar.f10839c = ab.a0.s0(dVar, aVar, false);
                                                                break;
                                                            case 3:
                                                                iVar.f10837a = ab.a0.r0(dVar, aVar);
                                                                break;
                                                            case 4:
                                                                iVar.f10841e = ab.a0.s0(dVar, aVar, z13);
                                                                break;
                                                            default:
                                                                dVar.f0();
                                                                break;
                                                        }
                                                    } else {
                                                        dVar.b0();
                                                        dVar.f0();
                                                    }
                                                }
                                                dVar.r();
                                            }
                                            dVar.l();
                                        }
                                    }
                                    jc.a aVar5 = iVar.f10837a;
                                    cVar2 = (aVar5 == null || (bVar = iVar.f10838b) == null || (bVar2 = iVar.f10839c) == null || (bVar3 = iVar.f10840d) == null || (bVar4 = iVar.f10841e) == null) ? null : new ce.c(aVar5, bVar, bVar2, bVar3, bVar4, 9);
                                }
                            } else if (iZ3 != z13) {
                                dVar.b0();
                                dVar.f0();
                            } else {
                                arrayList3.add(dVar.I());
                            }
                            z12 = false;
                            z13 = true;
                        }
                        dVar.r();
                        z12 = false;
                        z13 = true;
                    }
                    dVar.l();
                    aVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                    qVar2 = qVar2;
                    z12 = false;
                    z13 = true;
                    break;
                case 14:
                    F = (float) dVar.F();
                    qVar2 = qVar2;
                    break;
                case 15:
                    F6 = (float) dVar.F();
                    qVar2 = qVar2;
                    break;
                case 16:
                    F4 = (float) (dVar.F() * ((double) oc.e.c()));
                    qVar2 = qVar2;
                    break;
                case 17:
                    F5 = (float) (dVar.F() * ((double) oc.e.c()));
                    qVar2 = qVar2;
                    break;
                case TYPE_SINT64_VALUE:
                    F2 = (float) dVar.F();
                    qVar2 = qVar2;
                    break;
                case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                    F3 = (float) dVar.F();
                    qVar2 = qVar2;
                    break;
                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                    bVarS0 = ab.a0.s0(dVar, aVar, z12);
                    qVar2 = qVar2;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                    strI2 = dVar.I();
                    qVar2 = qVar2;
                    break;
                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                    zA = dVar.A();
                    qVar2 = qVar2;
                    break;
                default:
                    dVar.b0();
                    dVar.f0();
                    f3 = fValueOf;
                    z10 = z12;
                    z12 = z10;
                    qVar2 = qVar2;
                    fValueOf = f3;
                    z13 = true;
                    break;
            }
        }
        Float f10 = fValueOf;
        oj.q qVar5 = qVar2;
        dVar.r();
        ArrayList arrayList4 = new ArrayList();
        if (F2 > 0.0f) {
            str = strI2;
            arrayList4.add(new pc.a(aVar, f10, f10, (BaseInterpolator) null, 0.0f, Float.valueOf(F2)));
        } else {
            str = strI2;
        }
        if (F3 <= 0.0f) {
            F3 = aVar.f3116k;
        }
        arrayList4.add(new pc.a(aVar, fValueOf2, fValueOf2, (BaseInterpolator) null, F2, Float.valueOf(F3)));
        arrayList4.add(new pc.a(aVar, f10, f10, (BaseInterpolator) null, F3, Float.valueOf(Float.MAX_VALUE)));
        if (strI.endsWith(".ai") || "ai".equals(str)) {
            aVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new lc.e(arrayList2, aVar, strI, jG, i10, jG2, strI3, arrayList, dVarA, iC, iC2, color, F, F6, F4, F5, aVar2, qVar5, arrayList4, i11, bVarS0, zA, cVar, cVar2);
    }
}
