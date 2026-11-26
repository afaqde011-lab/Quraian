package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

public abstract class j extends b {
    public final j10.k E;
    public final j10.n0 F;

    public j(d30.o oVar, j10.k kVar, n20.e eVar, j10.n0 n0Var) {
        super(oVar, eVar);
        if (oVar == null) {
            P(0);
            throw null;
        }
        if (kVar == null) {
            P(1);
            throw null;
        }
        if (eVar == null) {
            P(2);
            throw null;
        }
        this.E = kVar;
        this.F = n0Var;
    }

    public static void P(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = DiagnosticsEntry.NAME_KEY;
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i != 4 && i != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public boolean isExternal() {
        return false;
    }

    @Override
    public final j10.k l() {
        j10.k kVar = this.E;
        if (kVar != null) {
            return kVar;
        }
        P(4);
        throw null;
    }

    @Override
    public final j10.n0 o() {
        j10.n0 n0Var = this.F;
        if (n0Var != null) {
            return n0Var;
        }
        P(5);
        throw null;
    }
}
