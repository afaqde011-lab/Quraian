package mc;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import java.util.List;

public abstract class c {

    public static final h7.b f10828a = h7.b.t("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    public static final h7.b f10829b = h7.b.t("k");

    public static jc.d a(nc.d dVar, cc.a aVar) {
        jc.a aVar2;
        jc.b bVarS0;
        List list;
        jc.b bVar;
        jc.b bVar2;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z10 = dVar.O() == 3;
        if (z10) {
            dVar.i();
        }
        jc.b bVar3 = null;
        jc.b bVarS1 = null;
        db.g gVarA = null;
        jc.e eVarB = null;
        jc.a aVar3 = null;
        jc.b bVarS2 = null;
        jc.a aVarU0 = null;
        jc.b bVarS3 = null;
        jc.b bVarS4 = null;
        while (dVar.x()) {
            switch (dVar.Z(f10828a)) {
                case 0:
                    dVar.i();
                    while (dVar.x()) {
                        if (dVar.Z(f10829b) != 0) {
                            dVar.b0();
                            dVar.f0();
                        } else {
                            gVarA = a.a(dVar, aVar);
                        }
                    }
                    dVar.r();
                    bVarS1 = bVarS1;
                    break;
                case 1:
                    eVarB = a.b(dVar, aVar);
                    break;
                case 2:
                    aVar3 = new jc.a(4, p.a(dVar, aVar, 1.0f, f.G, false));
                    bVarS1 = bVarS1;
                    break;
                case 3:
                    aVar.a("Lottie doesn't support 3D layers.");
                    bVarS0 = ab.a0.s0(dVar, aVar, false);
                    list = (List) bVarS0.B;
                    if (list.isEmpty()) {
                        bVar = bVarS0;
                        bVar2 = bVarS1;
                        list.add(new pc.a(aVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(aVar.f3116k)));
                    } else {
                        bVar = bVarS0;
                        bVar2 = bVarS1;
                        if (((pc.a) list.get(0)).f12475b == null) {
                            list.set(0, new pc.a(aVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(aVar.f3116k)));
                        }
                    }
                    bVarS1 = bVar2;
                    bVar3 = bVar;
                    break;
                case 4:
                    bVarS0 = ab.a0.s0(dVar, aVar, false);
                    list = (List) bVarS0.B;
                    if (list.isEmpty()) {
                        bVar = bVarS0;
                        bVar2 = bVarS1;
                        list.add(new pc.a(aVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(aVar.f3116k)));
                    } else {
                        bVar = bVarS0;
                        bVar2 = bVarS1;
                        if (((pc.a) list.get(0)).f12475b == null) {
                            list.set(0, new pc.a(aVar, fValueOf, fValueOf, (BaseInterpolator) null, 0.0f, Float.valueOf(aVar.f3116k)));
                        }
                    }
                    bVarS1 = bVar2;
                    bVar3 = bVar;
                    break;
                case 5:
                    aVarU0 = ab.a0.u0(dVar, aVar);
                    break;
                case 6:
                    bVarS3 = ab.a0.s0(dVar, aVar, false);
                    break;
                case 7:
                    bVarS4 = ab.a0.s0(dVar, aVar, false);
                    break;
                case 8:
                    bVarS2 = ab.a0.s0(dVar, aVar, false);
                    break;
                case 9:
                    bVarS1 = ab.a0.s0(dVar, aVar, false);
                    break;
                default:
                    dVar.b0();
                    dVar.f0();
                    break;
            }
        }
        jc.b bVar4 = bVarS1;
        if (z10) {
            dVar.r();
        }
        db.g gVar = (gVarA == null || (gVarA.w0() && ((PointF) ((pc.a) gVarA.B.get(0)).f12475b).equals(0.0f, 0.0f))) ? null : gVarA;
        if (eVarB == null || (!(eVarB instanceof jc.c) && eVarB.w0() && ((PointF) ((pc.a) eVarB.t0().get(0)).f12475b).equals(0.0f, 0.0f))) {
            eVarB = null;
        }
        jc.b bVar5 = (bVar3 == null || (bVar3.w0() && ((Float) ((pc.a) ((List) bVar3.B).get(0)).f12475b).floatValue() == 0.0f)) ? null : bVar3;
        if (aVar3 == null) {
            aVar2 = null;
        } else {
            if (aVar3.w0()) {
                pc.b bVar6 = (pc.b) ((pc.a) ((List) aVar3.B).get(0)).f12475b;
                if (bVar6.f12488a == 1.0f && bVar6.f12489b == 1.0f) {
                    aVar2 = null;
                }
            }
            aVar2 = aVar3;
        }
        return new jc.d(gVar, eVarB, aVar2, bVar5, aVarU0, bVarS3, bVarS4, (bVarS2 == null || (bVarS2.w0() && ((Float) ((pc.a) ((List) bVarS2.B).get(0)).f12475b).floatValue() == 0.0f)) ? null : bVarS2, (bVar4 == null || (bVar4.w0() && ((Float) ((pc.a) ((List) bVar4.B).get(0)).f12475b).floatValue() == 0.0f)) ? null : bVar4);
    }
}
