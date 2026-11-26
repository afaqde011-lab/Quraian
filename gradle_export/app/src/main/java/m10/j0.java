package m10;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class j0 extends g0 implements j10.k0 {
    public e30.w N;
    public final j0 O;

    public j0(j10.l0 l0Var, k10.h hVar, j10.y yVar, j10.o oVar, boolean z, boolean z2, boolean z3, int i, j0 j0Var, j10.n0 n0Var) {
        super(yVar, oVar, l0Var, hVar, n20.e.g("<get-" + l0Var.getName() + ">"), z, z2, z3, i, n0Var);
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (yVar == null) {
            y0(2);
            throw null;
        }
        if (oVar == null) {
            y0(3);
            throw null;
        }
        if (i == 0) {
            y0(4);
            throw null;
        }
        if (n0Var == null) {
            y0(5);
            throw null;
        }
        this.O = j0Var != null ? j0Var : this;
    }

    public static void y0(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 6 || i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i != 6 && i != 7 && i != 8) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 6 && i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.q(this, obj);
    }

    @Override
    public final List O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        y0(7);
        throw null;
    }

    @Override
    public final j0 a() {
        j0 j0Var = this.O;
        if (j0Var != null) {
            return j0Var;
        }
        y0(8);
        throw null;
    }

    public final void b1(e30.w wVar) {
        if (wVar == null) {
            wVar = Y0().getType();
        }
        this.N = wVar;
    }

    @Override
    public final e30.w getReturnType() {
        return this.N;
    }

    @Override
    public final Collection m() {
        return Z0(true);
    }
}
