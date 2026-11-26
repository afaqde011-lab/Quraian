package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.u0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class l0 extends t {
    public l0(j10.k kVar, l0 l0Var, k10.h hVar, n20.e eVar, int i, j10.n0 n0Var) {
        super(i, kVar, l0Var, n0Var, hVar, eVar);
        if (kVar == null) {
            y0(0);
            throw null;
        }
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (eVar == null) {
            y0(2);
            throw null;
        }
        if (i == 0) {
            y0(3);
            throw null;
        }
        if (n0Var != null) {
        } else {
            y0(4);
            throw null;
        }
    }

    public static l0 j1(b bVar, n20.e eVar, int i, j10.n0 n0Var) {
        if (bVar == null) {
            y0(5);
            throw null;
        }
        if (eVar == null) {
            y0(7);
            throw null;
        }
        if (i == 0) {
            y0(8);
            throw null;
        }
        if (n0Var != null) {
            return new l0(bVar, null, k10.g.a, eVar, i, n0Var);
        }
        y0(9);
        throw null;
    }

    public static void y0(int i) {
        String str = (i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 13 || i == 18 || i == 23 || i == 24 || i == 29 || i == 30) ? 2 : 3];
        switch (i) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 13 || i == 18 || i == 23) {
            objArr[1] = "initialize";
        } else if (i == 24) {
            objArr[1] = "getOriginal";
        } else if (i == 29) {
            objArr[1] = "copy";
        } else if (i != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 13 && i != 18 && i != 23 && i != 24 && i != 29 && i != 30) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public t a1(int i, j10.k kVar, j10.u uVar, j10.n0 n0Var, k10.h hVar, n20.e eVar) {
        if (kVar == null) {
            y0(25);
            throw null;
        }
        if (i == 0) {
            y0(26);
            throw null;
        }
        if (hVar == null) {
            y0(27);
            throw null;
        }
        l0 l0Var = (l0) uVar;
        if (eVar == null) {
            eVar = getName();
        }
        return new l0(kVar, l0Var, hVar, eVar, i, n0Var);
    }

    @Override
    public final l0 a() {
        l0 l0Var = (l0) super.a();
        if (l0Var != null) {
            return l0Var;
        }
        y0(24);
        throw null;
    }

    @Override
    public final l0 d1(u uVar, u uVar2, List list, List list2, List list3, e30.w wVar, j10.y yVar, j10.o oVar) {
        if (list == null) {
            y0(14);
            throw null;
        }
        if (list2 == null) {
            y0(15);
            throw null;
        }
        if (list3 == null) {
            y0(16);
            throw null;
        }
        if (oVar != null) {
            return m1(uVar, uVar2, list, list2, list3, wVar, yVar, oVar, null);
        }
        y0(17);
        throw null;
    }

    public l0 m1(u uVar, u uVar2, List list, List list2, List list3, e30.w wVar, j10.y yVar, j10.o oVar, Map map) {
        if (list == null) {
            y0(19);
            throw null;
        }
        if (list2 == null) {
            y0(20);
            throw null;
        }
        if (list3 == null) {
            y0(21);
            throw null;
        }
        if (oVar == null) {
            y0(22);
            throw null;
        }
        super.d1(uVar, uVar2, list, list2, list3, wVar, yVar, oVar);
        if (map != null && !map.isEmpty()) {
            this.d0 = new LinkedHashMap(map);
        }
        return this;
    }

    @Override
    public j10.t n0() {
        return e1(u0.b);
    }
}
