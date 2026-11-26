package p20;

import h00.f0;
import j10.e0;
import j10.r0;
import java.util.ArrayList;
import m10.c0;

public final class b implements c {
    public static final b b = new b(0);
    public static final b c = new b(1);
    public static final b d = new b(2);
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public static String b(j10.h hVar) {
        String strF0;
        n20.e name = hVar.getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        String strD0 = va.a.d0(name);
        if (!(hVar instanceof r0)) {
            j10.k kVarL = hVar.l();
            kotlin.jvm.internal.m.d(kVarL, "getContainingDeclaration(...)");
            if (kVarL instanceof j10.e) {
                strF0 = b((j10.h) kVarL);
            } else if (kVarL instanceof e0) {
                n20.d dVar = ((c0) ((e0) kVarL)).F.a;
                kotlin.jvm.internal.m.e(dVar, "<this>");
                strF0 = va.a.f0(n20.d.f(dVar));
            } else {
                strF0 = null;
            }
            if (strF0 != null && !strF0.equals("")) {
                return strF0 + '.' + strD0;
            }
        }
        return strD0;
    }

    @Override
    public final String a(j10.h hVar, h hVar2) {
        switch (this.a) {
            case 0:
                if (hVar instanceof r0) {
                    n20.e name = ((r0) hVar).getName();
                    kotlin.jvm.internal.m.d(name, "getName(...)");
                    return hVar2.O(name, false);
                }
                n20.d dVarF = q20.d.f(hVar);
                kotlin.jvm.internal.m.d(dVarF, "getFqName(...)");
                return hVar2.o(va.a.f0(n20.d.f(dVarF)));
            case 1:
                if (hVar instanceof r0) {
                    n20.e name2 = ((r0) hVar).getName();
                    kotlin.jvm.internal.m.d(name2, "getName(...)");
                    return hVar2.O(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(hVar.getName());
                    hVar = hVar.l();
                } while (hVar instanceof j10.e);
                return va.a.f0(new f0(arrayList));
            default:
                return b(hVar);
        }
    }
}
