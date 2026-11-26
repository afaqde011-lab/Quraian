package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

public abstract class n extends m implements j10.l {
    public final j10.k D;
    public final j10.n0 E;

    public n(j10.k kVar, k10.h hVar, n20.e eVar, j10.n0 n0Var) {
        super(hVar, eVar);
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
        if (n0Var == null) {
            y0(3);
            throw null;
        }
        this.D = kVar;
        this.E = n0Var;
    }

    public static void y0(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5 && i != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public j10.l a() {
        return this;
    }

    public j10.k l() {
        j10.k kVar = this.D;
        if (kVar != null) {
            return kVar;
        }
        y0(5);
        throw null;
    }

    public j10.n0 o() {
        j10.n0 n0Var = this.E;
        if (n0Var != null) {
            return n0Var;
        }
        y0(6);
        throw null;
    }
}
