package mc;

import java.util.ArrayList;

public abstract class a {

    public static final h7.b f10822a = h7.b.t("k", "x", "y");

    public static db.g a(nc.d dVar, cc.a aVar) {
        ArrayList arrayList = new ArrayList();
        if (dVar.O() == 1) {
            dVar.a();
            while (dVar.x()) {
                nc.d dVar2 = dVar;
                cc.a aVar2 = aVar;
                arrayList.add(new fc.j(aVar2, o.b(dVar2, aVar2, oc.e.c(), f.E, dVar.O() == 3, false)));
                dVar = dVar2;
                aVar = aVar2;
            }
            dVar.l();
            p.b(arrayList);
        } else {
            arrayList.add(new pc.a(n.b(dVar, oc.e.c())));
        }
        return new db.g(arrayList);
    }

    public static jc.e b(nc.d dVar, cc.a aVar) {
        dVar.i();
        db.g gVarA = null;
        jc.b bVarS0 = null;
        boolean z10 = false;
        jc.b bVarS1 = null;
        while (dVar.O() != 4) {
            int iZ = dVar.Z(f10822a);
            if (iZ == 0) {
                gVarA = a(dVar, aVar);
            } else if (iZ != 1) {
                if (iZ != 2) {
                    dVar.b0();
                    dVar.f0();
                } else if (dVar.O() == 6) {
                    dVar.f0();
                    z10 = true;
                } else {
                    bVarS0 = ab.a0.s0(dVar, aVar, true);
                }
            } else if (dVar.O() == 6) {
                dVar.f0();
                z10 = true;
            } else {
                bVarS1 = ab.a0.s0(dVar, aVar, true);
            }
        }
        dVar.r();
        if (z10) {
            aVar.a("Lottie doesn't support expressions.");
        }
        return gVarA != null ? gVarA : new jc.c(bVarS1, bVarS0);
    }
}
