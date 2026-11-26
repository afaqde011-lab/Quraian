package mc;

import java.util.ArrayList;

public abstract class p {

    public static final h7.b f10854a = h7.b.t("k");

    public static ArrayList a(nc.c cVar, cc.a aVar, float f3, d0 d0Var, boolean z10) {
        nc.c cVar2;
        cc.a aVar2;
        float f10;
        d0 d0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (cVar.O() == 6) {
            aVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.i();
        while (cVar.x()) {
            if (cVar.Z(f10854a) != 0) {
                cVar.f0();
            } else if (cVar.O() == 1) {
                cVar.a();
                if (cVar.O() == 7) {
                    nc.c cVar3 = cVar;
                    cc.a aVar3 = aVar;
                    float f11 = f3;
                    d0 d0Var3 = d0Var;
                    boolean z12 = z10;
                    pc.a aVarB = o.b(cVar3, aVar3, f11, d0Var3, false, z12);
                    cVar2 = cVar3;
                    aVar2 = aVar3;
                    f10 = f11;
                    d0Var2 = d0Var3;
                    z11 = z12;
                    arrayList.add(aVarB);
                } else {
                    cVar2 = cVar;
                    aVar2 = aVar;
                    f10 = f3;
                    d0Var2 = d0Var;
                    z11 = z10;
                    while (cVar2.x()) {
                        arrayList.add(o.b(cVar2, aVar2, f10, d0Var2, true, z11));
                    }
                }
                cVar2.l();
                cVar = cVar2;
                aVar = aVar2;
                f3 = f10;
                d0Var = d0Var2;
                z10 = z11;
            } else {
                nc.c cVar4 = cVar;
                arrayList.add(o.b(cVar4, aVar, f3, d0Var, false, z10));
                cVar = cVar4;
            }
        }
        cVar.r();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            pc.a aVar = (pc.a) arrayList.get(i11);
            i11++;
            pc.a aVar2 = (pc.a) arrayList.get(i11);
            aVar.f12481h = Float.valueOf(aVar2.f12480g);
            if (aVar.f12476c == null && (obj = aVar2.f12475b) != null) {
                aVar.f12476c = obj;
                if (aVar instanceof fc.j) {
                    ((fc.j) aVar).d();
                }
            }
        }
        pc.a aVar3 = (pc.a) arrayList.get(i10);
        if ((aVar3.f12475b == null || aVar3.f12476c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
