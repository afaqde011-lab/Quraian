package mc;

import android.graphics.Path;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;

public abstract class g {

    public static final h7.b f10834a = h7.b.t("ty", "d");

    public static kc.b a(nc.d dVar, cc.a aVar) throws nc.b, EOFException {
        String strI;
        kc.b aVar2;
        kc.b lVar;
        kc.b mVar;
        kc.b eVar;
        int i10;
        dVar.i();
        int iG = 2;
        while (true) {
            if (!dVar.x()) {
                strI = null;
                break;
            }
            int iZ = dVar.Z(f10834a);
            if (iZ == 0) {
                strI = dVar.I();
                break;
            }
            if (iZ != 1) {
                dVar.b0();
                dVar.f0();
            } else {
                iG = dVar.G();
            }
        }
        if (strI == null) {
            return null;
        }
        boolean zA = false;
        boolean zA2 = false;
        int i11 = 0;
        switch (strI) {
            case "el":
                h7.b bVar = e.f10833a;
                boolean z10 = iG == 3;
                boolean zA3 = false;
                String strI2 = null;
                jc.e eVarB = null;
                jc.a aVarV0 = null;
                while (dVar.x()) {
                    int iZ2 = dVar.Z(e.f10833a);
                    if (iZ2 == 0) {
                        strI2 = dVar.I();
                    } else if (iZ2 == 1) {
                        eVarB = a.b(dVar, aVar);
                    } else if (iZ2 == 2) {
                        aVarV0 = ab.a0.v0(dVar, aVar);
                    } else if (iZ2 == 3) {
                        zA3 = dVar.A();
                    } else if (iZ2 != 4) {
                        dVar.b0();
                        dVar.f0();
                    } else {
                        z10 = dVar.G() == 3;
                    }
                }
                aVar2 = new kc.a(strI2, eVarB, aVarV0, z10, zA3);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "fl":
                h7.b bVar2 = y.f10867a;
                int iG2 = 1;
                boolean zA4 = false;
                jc.a aVar3 = null;
                String strI3 = null;
                jc.a aVarR0 = null;
                boolean zA5 = false;
                while (dVar.x()) {
                    int iZ3 = dVar.Z(y.f10867a);
                    if (iZ3 == 0) {
                        strI3 = dVar.I();
                    } else if (iZ3 == 1) {
                        aVarR0 = ab.a0.r0(dVar, aVar);
                    } else if (iZ3 == 2) {
                        aVar3 = ab.a0.u0(dVar, aVar);
                    } else if (iZ3 == 3) {
                        zA5 = dVar.A();
                    } else if (iZ3 == 4) {
                        iG2 = dVar.G();
                    } else if (iZ3 != 5) {
                        dVar.b0();
                        dVar.f0();
                    } else {
                        zA4 = dVar.A();
                    }
                }
                if (aVar3 == null) {
                    aVar3 = new jc.a(2, Collections.singletonList(new pc.a(100)));
                }
                lVar = new kc.l(strI3, zA5, iG2 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarR0, aVar3, zA4);
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "gf":
                h7.b bVar3 = l.f10845a;
                Path.FillType fillType = Path.FillType.WINDING;
                int i12 = 0;
                boolean zA6 = false;
                jc.a aVar4 = null;
                String strI4 = null;
                jc.a aVarT0 = null;
                jc.a aVarV1 = null;
                jc.a aVarV2 = null;
                while (dVar.x()) {
                    switch (dVar.Z(l.f10845a)) {
                        case 0:
                            strI4 = dVar.I();
                            break;
                        case 1:
                            dVar.i();
                            int iG3 = -1;
                            while (dVar.x()) {
                                int iZ4 = dVar.Z(l.f10846b);
                                if (iZ4 == 0) {
                                    iG3 = dVar.G();
                                } else if (iZ4 != 1) {
                                    dVar.b0();
                                    dVar.f0();
                                } else {
                                    aVarT0 = ab.a0.t0(dVar, aVar, iG3);
                                }
                            }
                            dVar.r();
                            break;
                        case 2:
                            aVar4 = ab.a0.u0(dVar, aVar);
                            break;
                        case 3:
                            i12 = dVar.G() != 1 ? 2 : 1;
                            break;
                        case 4:
                            aVarV1 = ab.a0.v0(dVar, aVar);
                            break;
                        case 5:
                            aVarV2 = ab.a0.v0(dVar, aVar);
                            break;
                        case 6:
                            fillType = dVar.G() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                            break;
                        case 7:
                            zA6 = dVar.A();
                            break;
                        default:
                            dVar.b0();
                            dVar.f0();
                            break;
                    }
                }
                if (aVar4 == null) {
                    aVar4 = new jc.a(2, Collections.singletonList(new pc.a(100)));
                }
                aVar2 = new kc.d(strI4, i12, fillType, aVarT0, aVar4, aVarV1, aVarV2, zA6);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "gr":
                h7.b bVar4 = z.f10868a;
                ArrayList arrayList = new ArrayList();
                String strI5 = null;
                while (dVar.x()) {
                    int iZ5 = dVar.Z(z.f10868a);
                    if (iZ5 == 0) {
                        strI5 = dVar.I();
                    } else if (iZ5 == 1) {
                        zA = dVar.A();
                    } else if (iZ5 != 2) {
                        dVar.f0();
                    } else {
                        dVar.a();
                        while (dVar.x()) {
                            kc.b bVarA = a(dVar, aVar);
                            if (bVarA != null) {
                                arrayList.add(bVarA);
                            }
                        }
                        dVar.l();
                    }
                }
                mVar = new kc.m(strI5, arrayList, zA);
                lVar = mVar;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "gs":
                h7.b bVar5 = m.f10847a;
                ArrayList arrayList2 = new ArrayList();
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                boolean zA7 = false;
                jc.a aVar5 = null;
                String strI6 = null;
                jc.a aVarT1 = null;
                jc.a aVarV3 = null;
                jc.a aVarV4 = null;
                jc.b bVarS0 = null;
                jc.b bVar6 = null;
                float F = 0.0f;
                while (dVar.x()) {
                    switch (dVar.Z(m.f10847a)) {
                        case 0:
                            strI6 = dVar.I();
                            break;
                        case 1:
                            dVar.i();
                            int iG4 = -1;
                            while (dVar.x()) {
                                int iZ6 = dVar.Z(m.f10848b);
                                if (iZ6 == 0) {
                                    iG4 = dVar.G();
                                } else if (iZ6 != 1) {
                                    dVar.b0();
                                    dVar.f0();
                                } else {
                                    aVarT1 = ab.a0.t0(dVar, aVar, iG4);
                                }
                            }
                            dVar.r();
                            break;
                        case 2:
                            aVar5 = ab.a0.u0(dVar, aVar);
                            break;
                        case 3:
                            i13 = dVar.G() != 1 ? 2 : 1;
                            break;
                        case 4:
                            aVarV3 = ab.a0.v0(dVar, aVar);
                            break;
                        case 5:
                            aVarV4 = ab.a0.v0(dVar, aVar);
                            break;
                        case 6:
                            bVarS0 = ab.a0.s0(dVar, aVar, true);
                            break;
                        case 7:
                            i14 = e4.f.c(3)[dVar.G() - 1];
                            break;
                        case 8:
                            i15 = e4.f.c(3)[dVar.G() - 1];
                            break;
                        case 9:
                            F = (float) dVar.F();
                            break;
                        case 10:
                            zA7 = dVar.A();
                            break;
                        case 11:
                            dVar.a();
                            while (dVar.x()) {
                                dVar.i();
                                String strI7 = null;
                                jc.b bVarS1 = null;
                                while (dVar.x()) {
                                    int iZ7 = dVar.Z(m.f10849c);
                                    if (iZ7 == 0) {
                                        strI7 = dVar.I();
                                    } else if (iZ7 != 1) {
                                        dVar.b0();
                                        dVar.f0();
                                    } else {
                                        bVarS1 = ab.a0.s0(dVar, aVar, true);
                                    }
                                }
                                dVar.r();
                                if (strI7.equals("o")) {
                                    bVar6 = bVarS1;
                                } else if (strI7.equals("d") || strI7.equals("g")) {
                                    arrayList2.add(bVarS1);
                                }
                            }
                            dVar.l();
                            if (arrayList2.size() == 1) {
                                arrayList2.add((jc.b) arrayList2.get(0));
                            }
                            break;
                        default:
                            dVar.b0();
                            dVar.f0();
                            break;
                    }
                }
                if (aVar5 == null) {
                    aVar5 = new jc.a(2, Collections.singletonList(new pc.a(100)));
                }
                eVar = new kc.e(strI6, i13, aVarT1, aVar5, aVarV3, aVarV4, bVarS0, i14, i15, F, arrayList2, bVar6, zA7);
                lVar = eVar;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "mm":
                h7.b bVar7 = s.f10862a;
                boolean zA8 = false;
                String strI8 = null;
                while (dVar.x()) {
                    int iZ8 = dVar.Z(s.f10862a);
                    if (iZ8 == 0) {
                        strI8 = dVar.I();
                    } else if (iZ8 == 1) {
                        int iG5 = dVar.G();
                        if (iG5 != 1) {
                            if (iG5 == 2) {
                                i11 = 2;
                            } else if (iG5 == 3) {
                                i11 = 3;
                            } else if (iG5 == 4) {
                                i11 = 4;
                            } else if (iG5 == 5) {
                                i11 = 5;
                            }
                        }
                        i11 = 1;
                    } else if (iZ8 != 2) {
                        dVar.b0();
                        dVar.f0();
                    } else {
                        zA8 = dVar.A();
                    }
                }
                kc.g gVar = new kc.g(strI8, i11, zA8);
                aVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                lVar = gVar;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "rc":
                h7.b bVar8 = u.f10864a;
                boolean zA9 = false;
                String strI9 = null;
                jc.e eVarB2 = null;
                jc.a aVarV5 = null;
                jc.b bVarS2 = null;
                while (dVar.x()) {
                    int iZ9 = dVar.Z(u.f10864a);
                    if (iZ9 == 0) {
                        strI9 = dVar.I();
                    } else if (iZ9 == 1) {
                        eVarB2 = a.b(dVar, aVar);
                    } else if (iZ9 == 2) {
                        aVarV5 = ab.a0.v0(dVar, aVar);
                    } else if (iZ9 == 3) {
                        bVarS2 = ab.a0.s0(dVar, aVar, true);
                    } else if (iZ9 != 4) {
                        dVar.f0();
                    } else {
                        zA9 = dVar.A();
                    }
                }
                aVar2 = new kc.i(strI9, eVarB2, aVarV5, bVarS2, zA9);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "rd":
                h7.b bVar9 = w.f10866a;
                String strI10 = null;
                jc.b bVarS3 = null;
                while (dVar.x()) {
                    int iZ10 = dVar.Z(w.f10866a);
                    if (iZ10 == 0) {
                        strI10 = dVar.I();
                    } else if (iZ10 == 1) {
                        bVarS3 = ab.a0.s0(dVar, aVar, true);
                    } else if (iZ10 != 2) {
                        dVar.f0();
                    } else {
                        zA2 = dVar.A();
                    }
                }
                lVar = zA2 ? null : new kc.j(strI10, bVarS3);
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "rp":
                h7.b bVar10 = v.f10865a;
                boolean zA10 = false;
                String strI11 = null;
                jc.b bVarS4 = null;
                jc.b bVarS5 = null;
                jc.d dVarA = null;
                while (dVar.x()) {
                    int iZ11 = dVar.Z(v.f10865a);
                    if (iZ11 == 0) {
                        strI11 = dVar.I();
                    } else if (iZ11 == 1) {
                        bVarS4 = ab.a0.s0(dVar, aVar, false);
                    } else if (iZ11 == 2) {
                        bVarS5 = ab.a0.s0(dVar, aVar, false);
                    } else if (iZ11 == 3) {
                        dVarA = c.a(dVar, aVar);
                    } else if (iZ11 != 4) {
                        dVar.f0();
                    } else {
                        zA10 = dVar.A();
                    }
                }
                aVar2 = new kc.i(strI11, bVarS4, bVarS5, dVarA, zA10);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "sh":
                h7.b bVar11 = a0.f10823a;
                int iG6 = 0;
                boolean zA11 = false;
                jc.a aVar6 = null;
                String strI12 = null;
                while (dVar.x()) {
                    int iZ12 = dVar.Z(a0.f10823a);
                    if (iZ12 == 0) {
                        strI12 = dVar.I();
                    } else if (iZ12 == 1) {
                        iG6 = dVar.G();
                    } else if (iZ12 == 2) {
                        aVar6 = new jc.a(5, p.a(dVar, aVar, oc.e.c(), x.A, false));
                    } else if (iZ12 != 3) {
                        dVar.f0();
                    } else {
                        zA11 = dVar.A();
                    }
                }
                mVar = new kc.n(strI12, iG6, aVar6, zA11);
                lVar = mVar;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "sr":
                h7.b bVar12 = t.f10863a;
                boolean z11 = iG == 3;
                int i16 = 0;
                boolean zA12 = false;
                String strI13 = null;
                jc.b bVarS6 = null;
                jc.e eVarB3 = null;
                jc.b bVarS7 = null;
                jc.b bVarS8 = null;
                jc.b bVarS9 = null;
                jc.b bVarS10 = null;
                jc.b bVarS11 = null;
                while (dVar.x()) {
                    switch (dVar.Z(t.f10863a)) {
                        case 0:
                            strI13 = dVar.I();
                            break;
                        case 1:
                            int iG7 = dVar.G();
                            int[] iArrC = e4.f.c(2);
                            int length = iArrC.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 >= length) {
                                    i16 = 0;
                                }
                                int i18 = iArrC[i17];
                                if (i18 == 1) {
                                    i10 = 1;
                                } else {
                                    if (i18 != 2) {
                                        throw null;
                                    }
                                    i10 = 2;
                                }
                                if (i10 == iG7) {
                                    i16 = i18;
                                }
                                i17++;
                                break;
                                break;
                            }
                            break;
                        case 2:
                            bVarS6 = ab.a0.s0(dVar, aVar, false);
                            break;
                        case 3:
                            eVarB3 = a.b(dVar, aVar);
                            break;
                        case 4:
                            bVarS7 = ab.a0.s0(dVar, aVar, false);
                            break;
                        case 5:
                            bVarS9 = ab.a0.s0(dVar, aVar, true);
                            break;
                        case 6:
                            bVarS11 = ab.a0.s0(dVar, aVar, false);
                            break;
                        case 7:
                            bVarS8 = ab.a0.s0(dVar, aVar, true);
                            break;
                        case 8:
                            bVarS10 = ab.a0.s0(dVar, aVar, false);
                            break;
                        case 9:
                            zA12 = dVar.A();
                            break;
                        case 10:
                            z11 = dVar.G() == 3;
                            break;
                        default:
                            dVar.b0();
                            dVar.f0();
                            break;
                    }
                }
                aVar2 = new kc.h(strI13, i16, bVarS6, eVarB3, bVarS7, bVarS8, bVarS9, bVarS10, bVarS11, zA12, z11);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "st":
                h7.b bVar13 = b0.f10826a;
                ArrayList arrayList3 = new ArrayList();
                int i19 = 0;
                int i20 = 0;
                boolean zA13 = false;
                jc.a aVar7 = null;
                String strI14 = null;
                jc.b bVar14 = null;
                jc.a aVarR1 = null;
                jc.b bVarS12 = null;
                float F2 = 0.0f;
                while (dVar.x()) {
                    switch (dVar.Z(b0.f10826a)) {
                        case 0:
                            strI14 = dVar.I();
                            break;
                        case 1:
                            aVarR1 = ab.a0.r0(dVar, aVar);
                            break;
                        case 2:
                            bVarS12 = ab.a0.s0(dVar, aVar, true);
                            break;
                        case 3:
                            aVar7 = ab.a0.u0(dVar, aVar);
                            break;
                        case 4:
                            i19 = e4.f.c(3)[dVar.G() - 1];
                            break;
                        case 5:
                            i20 = e4.f.c(3)[dVar.G() - 1];
                            break;
                        case 6:
                            F2 = (float) dVar.F();
                            break;
                        case 7:
                            zA13 = dVar.A();
                            break;
                        case 8:
                            dVar.a();
                            while (dVar.x()) {
                                dVar.i();
                                String strI15 = null;
                                jc.b bVarS13 = null;
                                while (dVar.x()) {
                                    int iZ13 = dVar.Z(b0.f10827b);
                                    if (iZ13 == 0) {
                                        strI15 = dVar.I();
                                    } else if (iZ13 != 1) {
                                        dVar.b0();
                                        dVar.f0();
                                    } else {
                                        bVarS13 = ab.a0.s0(dVar, aVar, true);
                                    }
                                }
                                dVar.r();
                                strI15.getClass();
                                switch (strI15) {
                                    case "d":
                                    case "g":
                                        arrayList3.add(bVarS13);
                                        break;
                                    case "o":
                                        bVar14 = bVarS13;
                                        break;
                                }
                            }
                            dVar.l();
                            if (arrayList3.size() == 1) {
                                arrayList3.add((jc.b) arrayList3.get(0));
                            }
                            break;
                        default:
                            dVar.f0();
                            break;
                    }
                }
                if (aVar7 == null) {
                    aVar7 = new jc.a(2, Collections.singletonList(new pc.a(100)));
                }
                eVar = new kc.o(strI14, bVar14, arrayList3, aVarR1, aVar7, bVarS12, i19, i20, F2, zA13);
                lVar = eVar;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "tm":
                h7.b bVar15 = c0.f10830a;
                int i21 = 0;
                boolean zA14 = false;
                String strI16 = null;
                jc.b bVarS14 = null;
                jc.b bVarS15 = null;
                jc.b bVarS16 = null;
                while (dVar.x()) {
                    int iZ14 = dVar.Z(c0.f10830a);
                    if (iZ14 == 0) {
                        bVarS14 = ab.a0.s0(dVar, aVar, false);
                    } else if (iZ14 == 1) {
                        bVarS15 = ab.a0.s0(dVar, aVar, false);
                    } else if (iZ14 == 2) {
                        bVarS16 = ab.a0.s0(dVar, aVar, false);
                    } else if (iZ14 == 3) {
                        strI16 = dVar.I();
                    } else if (iZ14 == 4) {
                        int iG8 = dVar.G();
                        if (iG8 == 1) {
                            i21 = 1;
                        } else {
                            if (iG8 != 2) {
                                throw new IllegalArgumentException(g4.c.f(iG8, "Unknown trim path type "));
                            }
                            i21 = 2;
                        }
                    } else if (iZ14 != 5) {
                        dVar.f0();
                    } else {
                        zA14 = dVar.A();
                    }
                }
                aVar2 = new kc.p(strI16, i21, bVarS14, bVarS15, bVarS16, zA14);
                lVar = aVar2;
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            case "tr":
                lVar = c.a(dVar, aVar);
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
            default:
                oc.b.a("Unknown shape type ".concat(strI));
                while (dVar.x()) {
                    dVar.f0();
                }
                dVar.r();
                return lVar;
        }
    }
}
