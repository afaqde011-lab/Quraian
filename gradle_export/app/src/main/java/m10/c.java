package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;

public abstract class c extends h {
    public c(d30.o oVar, j10.k kVar, k10.h hVar, n20.e eVar, a1 a1Var, boolean z, int i, j10.o0 o0Var) {
        super(oVar, kVar, hVar, eVar, a1Var, z, i, o0Var);
        if (oVar == null) {
            y0(0);
            throw null;
        }
        if (kVar == null) {
            y0(1);
            throw null;
        }
        if (o0Var != null) {
        } else {
            y0(6);
            throw null;
        }
    }

    public static void y0(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override
    public final String toString() {
        String str = "";
        String str2 = this.G ? "reified " : "";
        if (F() != a1.C) {
            str = F() + " ";
        }
        return str2 + str + getName();
    }
}
