package q20;

import j10.l0;
import j10.q0;
import j10.u;
import java.util.Comparator;

public final class g implements Comparator {
    public static final g B = new g(0);
    public final int A;

    public g(int i) {
        this.A = i;
    }

    public static int a(j10.k kVar) {
        if (kVar == null) {
            d.a(36);
            throw null;
        }
        int i = d.a;
        if (d.l(kVar, j10.f.D)) {
            return 8;
        }
        if (kVar instanceof j10.j) {
            return 7;
        }
        if (kVar instanceof l0) {
            return ((l0) kVar).X() == null ? 6 : 5;
        }
        if (kVar instanceof u) {
            return ((u) kVar).X() == null ? 4 : 3;
        }
        if (kVar instanceof j10.e) {
            return 2;
        }
        return kVar instanceof q0 ? 1 : 0;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.A) {
            case 0:
                j10.k kVar = (j10.k) obj;
                j10.k kVar2 = (j10.k) obj2;
                int iA = a(kVar2) - a(kVar);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else {
                    j10.f fVar = j10.f.D;
                    if (d.l(kVar, fVar) && d.l(kVar2, fVar)) {
                        numValueOf = 0;
                    } else {
                        int iCompareTo = kVar.getName().A.compareTo(kVar2.getName().A);
                        numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                    }
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return p30.f.Z(u20.d.g((j10.e) obj).a.a, u20.d.g((j10.e) obj2).a.a);
        }
    }
}
