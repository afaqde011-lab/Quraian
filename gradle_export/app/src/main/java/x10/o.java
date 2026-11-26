package x10;

import java.util.HashMap;

public abstract class o {
    public static final j10.o a;
    public static final j10.o b;
    public static final j10.o c;
    public static final HashMap d;

    static {
        n10.a aVar = n10.a.c;
        j10.o oVar = new j10.o(aVar, 9);
        a = oVar;
        n10.c cVar = n10.c.c;
        j10.o oVar2 = new j10.o(cVar, 10);
        b = oVar2;
        n10.b bVar = n10.b.c;
        j10.o oVar3 = new j10.o(bVar, 11);
        c = oVar3;
        HashMap map = new HashMap();
        d = map;
        map.put(aVar, oVar);
        map.put(cVar, oVar2);
        map.put(bVar, oVar3);
    }

    public static void a(int i) {
        String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(y20.d dVar, j10.n nVar, j10.k kVar) {
        j10.n nVarR;
        if (kVar == null) {
            a(1);
            throw null;
        }
        if (nVar instanceof j10.c) {
            nVarR = q20.d.r((j10.c) nVar);
        } else {
            int i = q20.d.a;
            nVarR = nVar;
        }
        if (c(nVarR, kVar)) {
            return true;
        }
        return j10.p.c.a(dVar, nVar, kVar);
    }

    public static boolean c(j10.n nVar, j10.k kVar) {
        if (nVar == null) {
            a(2);
            throw null;
        }
        if (kVar == null) {
            a(3);
            throw null;
        }
        j10.e0 e0Var = (j10.e0) q20.d.h(nVar, j10.e0.class, false);
        j10.e0 e0Var2 = (j10.e0) q20.d.h(kVar, j10.e0.class, false);
        return (e0Var2 == null || e0Var == null || !((m10.c0) e0Var).F.equals(((m10.c0) e0Var2).F)) ? false : true;
    }
}
