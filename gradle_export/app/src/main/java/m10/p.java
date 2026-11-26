package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public final class p extends x20.o {
    public final d30.e b;
    public final d30.e c;
    public final d30.i d;
    public final q e;

    public p(q qVar, d30.o oVar) {
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.e = qVar;
        d30.l lVar = (d30.l) oVar;
        this.b = lVar.b(new o(this, 0));
        this.c = lVar.b(new o(this, 1));
        this.d = new d30.i(lVar, new eo.p(this, 11));
    }

    public static void h(int i) {
        String str;
        int i2;
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 10:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 2:
            case 6:
                objArr[0] = "location";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            case 11:
                objArr[0] = "fromSupertypes";
                break;
            case 13:
                objArr[0] = "kindFilter";
                break;
            case 14:
                objArr[0] = "nameFilter";
                break;
            case 20:
                objArr[0] = "p";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 3) {
            objArr[1] = "getContributedVariables";
        } else if (i == 7) {
            objArr[1] = "getContributedFunctions";
        } else if (i == 9) {
            objArr[1] = "getSupertypeScope";
        } else if (i != 12) {
            switch (i) {
                case 15:
                    objArr[1] = "getContributedDescriptors";
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    objArr[1] = "computeAllDeclarations";
                    break;
                case 17:
                    objArr[1] = "getFunctionNames";
                    break;
                case 18:
                    objArr[1] = "getClassifierNames";
                    break;
                case 19:
                    objArr[1] = "getVariableNames";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
            }
        } else {
            objArr[1] = "resolveFakeOverrides";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "getContributedVariables";
                break;
            case 3:
            case 7:
            case 9:
            case 12:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
                break;
            case 4:
                objArr[2] = "computeProperties";
                break;
            case 5:
            case 6:
                objArr[2] = "getContributedFunctions";
                break;
            case 8:
                objArr[2] = "computeFunctions";
                break;
            case 10:
            case 11:
                objArr[2] = "resolveFakeOverrides";
                break;
            case 13:
            case 14:
                objArr[2] = "getContributedDescriptors";
                break;
            case 20:
                objArr[2] = "printScopeStructure";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 7 && i != 9 && i != 12) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Collection a(x20.f fVar, u00.k kVar) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        Collection collection = (Collection) this.d.invoke();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override
    public final Set b() {
        Set set = (Set) this.e.I.invoke();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override
    public final Set c() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        h(18);
        throw null;
    }

    @Override
    public final Collection d(n20.e eVar, r10.a aVar) {
        if (eVar != null) {
            return (Collection) this.b.invoke(eVar);
        }
        h(5);
        throw null;
    }

    @Override
    public final Collection e(n20.e eVar, r10.c cVar) {
        if (eVar != null) {
            return (Collection) this.c.invoke(eVar);
        }
        h(1);
        throw null;
    }

    @Override
    public final Set f() {
        Set set = (Set) this.e.I.invoke();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    public final x20.n i() {
        x20.n nVarN = ((e30.w) ((e30.f) this.e.f()).l().iterator().next()).N();
        if (nVarN != null) {
            return nVarN;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(n20.e eVar, Collection collection) {
        if (eVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q20.j.c.h(eVar, collection, Collections.EMPTY_SET, this.e, new c30.g(linkedHashSet, 1));
        return linkedHashSet;
    }
}
