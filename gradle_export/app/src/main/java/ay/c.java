package ay;

import a2.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import r30.j;
import r30.r;

public final class c {
    public static final b a = new b(new a(), 0);

    public static final int a(cy.e eVar) {
        cy.f fVar = eVar.b;
        int i = eVar.c;
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return i + 25;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return i;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(o oVar, String str, a8.d dVar) {
        if (str.length() != 0) {
            String str2 = (String) oVar.B;
            if (str2.length() != 0) {
                if (str.equals(str2)) {
                    return dVar.a;
                }
                if (r.x0(str, str2, false)) {
                    return dVar.b;
                }
                j jVar = e.a;
                if (e.a(str, (ArrayList) oVar.D)) {
                    return dVar.c;
                }
            }
        }
        return 0;
    }

    public static int c(o oVar, ArrayList arrayList, a8.d dVar) {
        Iterator it = arrayList.iterator();
        int iMax = 0;
        while (it.hasNext() && (iMax = Math.max(iMax, b(oVar, (String) it.next(), dVar))) != dVar.a) {
        }
        return iMax;
    }
}
