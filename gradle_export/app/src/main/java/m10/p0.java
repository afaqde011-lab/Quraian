package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;
import java.util.ArrayList;
import java.util.List;

public final class p0 extends h {
    public final ArrayList L;
    public boolean M;

    public p0(j10.k kVar, k10.h hVar, boolean z, a1 a1Var, n20.e eVar, int i, d30.o oVar) {
        j10.o0 o0Var = j10.o0.C;
        if (kVar == null) {
            y0(19);
            throw null;
        }
        if (hVar == null) {
            y0(20);
            throw null;
        }
        if (a1Var == null) {
            y0(21);
            throw null;
        }
        if (eVar == null) {
            y0(22);
            throw null;
        }
        if (oVar == null) {
            y0(25);
            throw null;
        }
        super(oVar, kVar, hVar, eVar, a1Var, z, i, o0Var);
        this.L = new ArrayList(1);
        this.M = false;
    }

    public static p0 a1(j10.k kVar, k10.h hVar, boolean z, a1 a1Var, n20.e eVar, int i, d30.o oVar) {
        if (kVar == null) {
            y0(6);
            throw null;
        }
        if (hVar == null) {
            y0(7);
            throw null;
        }
        if (a1Var == null) {
            y0(8);
            throw null;
        }
        if (eVar == null) {
            y0(9);
            throw null;
        }
        if (oVar != null) {
            return new p0(kVar, hVar, z, a1Var, eVar, i, oVar);
        }
        y0(11);
        throw null;
    }

    public static p0 b1(b bVar, a1 a1Var, n20.e eVar, int i, d30.o oVar) {
        if (oVar == null) {
            y0(4);
            throw null;
        }
        p0 p0VarA1 = a1(bVar, k10.g.a, false, a1Var, eVar, i, oVar);
        e30.a0 a0VarN = u20.d.e(bVar).n();
        if (p0VarA1.M) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + p0VarA1.c1());
        }
        if (!e30.c.k(a0VarN)) {
            p0VarA1.L.add(a0VarN);
        }
        if (!p0VarA1.M) {
            p0VarA1.M = true;
            return p0VarA1;
        }
        throw new IllegalStateException("Type parameter descriptor is already initialized: " + p0VarA1.c1());
    }

    public static void y0(int i) {
        String str = (i == 5 || i == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 5 || i == 28) ? 2 : 3];
        switch (i) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 5 && i != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final List Z0() {
        if (!this.M) {
            throw new IllegalStateException("Type parameter descriptor is not initialized: " + c1());
        }
        ArrayList arrayList = this.L;
        if (arrayList != null) {
            return arrayList;
        }
        y0(28);
        throw null;
    }

    public final String c1() {
        return getName() + " declared in " + q20.d.f(l());
    }
}
