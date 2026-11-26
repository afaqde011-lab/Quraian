package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import j10.u0;
import java.util.Collections;
import java.util.List;

public abstract class s0 extends n implements u0 {
    public e30.w F;

    public s0(j10.k kVar, k10.h hVar, n20.e eVar, e30.w wVar, j10.n0 n0Var) {
        super(kVar, hVar, eVar, n0Var);
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
        this.F = wVar;
    }

    public static void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public boolean B() {
        return false;
    }

    @Override
    public final List O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(6);
        throw null;
    }

    public u T() {
        return null;
    }

    public u X() {
        return null;
    }

    public e30.w getReturnType() {
        e30.w type = getType();
        if (type != null) {
            return type;
        }
        y0(10);
        throw null;
    }

    @Override
    public final e30.w getType() {
        e30.w wVar = this.F;
        if (wVar != null) {
            return wVar;
        }
        y0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(8);
        throw null;
    }
}
