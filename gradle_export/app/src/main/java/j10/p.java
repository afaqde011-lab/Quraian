package j10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public abstract class p {
    public static final o a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final o0 k;
    public static final o0 l;
    public static final o0 m;
    public static final k30.o n;
    public static final HashMap o;

    static {
        z0 z0Var = z0.c;
        o oVar = new o(z0Var, 0);
        a = oVar;
        a1 a1Var = a1.c;
        o oVar2 = new o(a1Var, 1);
        b = oVar2;
        b1 b1Var = b1.c;
        o oVar3 = new o(b1Var, 2);
        c = oVar3;
        w0 w0Var = w0.c;
        o oVar4 = new o(w0Var, 3);
        d = oVar4;
        c1 c1Var = c1.c;
        o oVar5 = new o(c1Var, 4);
        e = oVar5;
        y0 y0Var = y0.c;
        o oVar6 = new o(y0Var, 5);
        f = oVar6;
        v0 v0Var = v0.c;
        o oVar7 = new o(v0Var, 6);
        g = oVar7;
        x0 x0Var = x0.c;
        o oVar8 = new o(x0Var, 7);
        h = oVar8;
        d1 d1Var = d1.c;
        o oVar9 = new o(d1Var, 8);
        i = oVar9;
        Collections.unmodifiableSet(h00.n.X0(new o[]{oVar, oVar2, oVar4, oVar6}));
        HashMap map = new HashMap(6);
        map.put(oVar2, 0);
        map.put(oVar, 0);
        map.put(oVar4, 1);
        map.put(oVar3, 1);
        map.put(oVar5, 2);
        Collections.unmodifiableMap(map);
        j = oVar5;
        k = new o0(2);
        l = new o0(3);
        m = new o0(4);
        try {
            Iterator it = Arrays.asList(new k30.o[0]).iterator();
            n = it.hasNext() ? (k30.o) it.next() : k30.o.a;
            HashMap map2 = new HashMap();
            o = map2;
            map2.put(z0Var, oVar);
            map2.put(a1Var, oVar2);
            map2.put(b1Var, oVar3);
            map2.put(w0Var, oVar4);
            map2.put(c1Var, oVar5);
            map2.put(y0Var, oVar6);
            map2.put(v0Var, oVar7);
            map2.put(x0Var, oVar8);
            map2.put(d1Var, oVar9);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static void a(int i2) {
        String str = i2 != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 16 ? 3 : 2];
        if (i2 != 1 && i2 != 3 && i2 != 5 && i2 != 7) {
            switch (i2) {
                case 9:
                    objArr[0] = "from";
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
        } else {
            objArr[0] = "from";
        }
        if (i2 != 16) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
        } else {
            objArr[1] = "toDescriptorVisibility";
        }
        switch (i2) {
            case 2:
            case 3:
                objArr[2] = "isVisibleIgnoringReceiver";
                break;
            case 4:
            case 5:
                objArr[2] = "isVisibleWithAnyReceiver";
                break;
            case 6:
            case 7:
                objArr[2] = "inSameFile";
                break;
            case 8:
            case 9:
                objArr[2] = "findInvisibleMember";
                break;
            case 10:
            case 11:
                objArr[2] = "compareLocal";
                break;
            case 12:
            case 13:
                objArr[2] = "compare";
                break;
            case 14:
                objArr[2] = "isPrivate";
                break;
            case 15:
                objArr[2] = "toDescriptorVisibility";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                break;
            default:
                objArr[2] = "isVisible";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i2 == 16) {
            throw new IllegalStateException(str2);
        }
    }

    public static Integer b(o oVar, o oVar2) {
        if (oVar == null) {
            a(12);
            throw null;
        }
        f1 f1Var = oVar.a;
        if (oVar2 == null) {
            a(13);
            throw null;
        }
        f1 f1Var2 = oVar2.a;
        Integer numA = f1Var.a(f1Var2);
        if (numA != null) {
            return numA;
        }
        Integer numA2 = f1Var2.a(f1Var);
        if (numA2 != null) {
            return Integer.valueOf(-numA2.intValue());
        }
        return null;
    }

    public static n c(y20.d dVar, n nVar, k kVar) {
        n nVarC;
        if (nVar == null) {
            a(8);
            throw null;
        }
        if (kVar == null) {
            a(9);
            throw null;
        }
        for (n nVar2 = (n) nVar.a(); nVar2 != null && nVar2.getVisibility() != f; nVar2 = (n) q20.d.h(nVar2, n.class, true)) {
            if (!nVar2.getVisibility().a(dVar, nVar2, kVar)) {
                return nVar2;
            }
        }
        if (!(nVar instanceof m10.n0) || (nVarC = c(dVar, ((m10.o0) ((m10.n0) nVar)).g0, kVar)) == null) {
            return null;
        }
        return nVarC;
    }

    public static boolean d(n nVar, k kVar) {
        if (kVar == null) {
            a(7);
            throw null;
        }
        o0 o0VarE = q20.d.e(kVar);
        if (o0VarE != o0.B) {
            return o0VarE.equals(q20.d.e(nVar));
        }
        return false;
    }

    public static boolean e(o oVar) {
        if (oVar != null) {
            return oVar == a || oVar == b;
        }
        a(14);
        throw null;
    }

    public static o f(f1 f1Var) {
        if (f1Var == null) {
            a(15);
            throw null;
        }
        o oVar = (o) o.get(f1Var);
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + f1Var);
    }
}
