package j3;

import java.util.Comparator;

public final class i implements Comparator {
    public static final i B = new i(0);
    public static final i C = new i(1);
    public static final i D = new i(2);
    public final int A;

    public i(int i10) {
        this.A = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                h2.c cVarH = ((s) obj).h();
                h2.c cVarH2 = ((s) obj2).h();
                int iCompare = Float.compare(cVarH.f6546a, cVarH2.f6546a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f6547b, cVarH2.f6547b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f6549d, cVarH2.f6549d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f6548c, cVarH2.f6548c);
            case 1:
                h2.c cVarH3 = ((s) obj).h();
                h2.c cVarH4 = ((s) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f6548c, cVarH3.f6548c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f6547b, cVarH4.f6547b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f6549d, cVarH4.f6549d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f6546a, cVarH3.f6546a);
            default:
                g00.k kVar = (g00.k) obj;
                g00.k kVar2 = (g00.k) obj2;
                int iCompare7 = Float.compare(((h2.c) kVar.A).f6547b, ((h2.c) kVar2.A).f6547b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((h2.c) kVar.A).f6549d, ((h2.c) kVar2.A).f6549d);
        }
    }
}
