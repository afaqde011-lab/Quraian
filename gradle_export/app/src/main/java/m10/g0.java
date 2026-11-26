package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class g0 extends n implements j10.k0 {
    public boolean F;
    public final boolean G;
    public final j10.y H;
    public final j10.l0 I;
    public final boolean J;
    public final int K;
    public j10.o L;
    public j10.u M;

    public g0(j10.y yVar, j10.o oVar, j10.l0 l0Var, k10.h hVar, n20.e eVar, boolean z, boolean z2, boolean z3, int i, j10.n0 n0Var) {
        super(l0Var.l(), hVar, eVar, n0Var);
        if (yVar == null) {
            y0(0);
            throw null;
        }
        if (oVar == null) {
            y0(1);
            throw null;
        }
        if (hVar == null) {
            y0(3);
            throw null;
        }
        if (n0Var == null) {
            y0(5);
            throw null;
        }
        this.M = null;
        this.H = yVar;
        this.L = oVar;
        this.I = l0Var;
        this.F = z;
        this.G = z2;
        this.J = z3;
        this.K = i;
    }

    public static void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            case 7:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(str2);
            case 7:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final boolean I() {
        return false;
    }

    @Override
    public final j10.u S() {
        return this.M;
    }

    @Override
    public final u T() {
        return Y0().T();
    }

    @Override
    public final u X() {
        return Y0().X();
    }

    public final j10.l0 Y0() {
        j10.l0 l0Var = this.I;
        if (l0Var != null) {
            return l0Var;
        }
        y0(13);
        throw null;
    }

    public final ArrayList Z0(boolean z) {
        ArrayList arrayList = new ArrayList(0);
        for (j10.l0 l0Var : Y0().m()) {
            j10.k0 k0VarB = z ? l0Var.b() : l0Var.c();
            if (k0VarB != null) {
                arrayList.add(k0VarB);
            }
        }
        return arrayList;
    }

    @Override
    public final List b0() {
        List listB0 = Y0().b0();
        if (listB0 != null) {
            return listB0;
        }
        y0(14);
        throw null;
    }

    @Override
    public final j10.l e(u0 u0Var) {
        e(u0Var);
        return this;
    }

    @Override
    public final j10.u e(u0 u0Var) {
        if (u0Var != null) {
            return this;
        }
        y0(7);
        throw null;
    }

    @Override
    public final j10.y g() {
        j10.y yVar = this.H;
        if (yVar != null) {
            return yVar;
        }
        y0(10);
        throw null;
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final int getKind() {
        int i = this.K;
        if (i != 0) {
            return i;
        }
        y0(6);
        throw null;
    }

    @Override
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(9);
        throw null;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = this.L;
        if (oVar != null) {
            return oVar;
        }
        y0(11);
        throw null;
    }

    @Override
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        y0(16);
        throw null;
    }

    @Override
    public final boolean isExternal() {
        return this.G;
    }

    @Override
    public final boolean isInfix() {
        return false;
    }

    @Override
    public final boolean isInline() {
        return this.J;
    }

    @Override
    public final boolean isOperator() {
        return false;
    }

    @Override
    public final boolean isSuspend() {
        return false;
    }

    @Override
    public final boolean l0() {
        return false;
    }

    @Override
    public final boolean p0() {
        return false;
    }

    @Override
    public final Object q0(j10.a aVar) {
        return null;
    }

    @Override
    public final j10.c r(j10.e eVar, j10.y yVar, j10.o oVar) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }
}
