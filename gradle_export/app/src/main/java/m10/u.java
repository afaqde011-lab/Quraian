package m10;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e30.a1;
import e30.u0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class u extends m implements j10.j0 {
    public final int D = 0;
    public final j10.k E;
    public final y20.d F;

    public u(j10.e eVar) {
        super(k10.g.a, n20.g.d);
        this.E = eVar;
        this.F = new y20.c(eVar);
    }

    public u(j10.k kVar, f5.c cVar, k10.h hVar) {
        this(kVar, cVar, hVar, n20.g.d);
        if (kVar == null) {
            z0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            z0(2);
            throw null;
        }
    }

    public u(j10.k kVar, f5.c cVar, k10.h hVar, n20.e eVar) {
        super(hVar, eVar);
        if (kVar == null) {
            z0(3);
            throw null;
        }
        if (hVar == null) {
            z0(5);
            throw null;
        }
        if (eVar == null) {
            z0(6);
            throw null;
        }
        this.E = kVar;
        this.F = cVar;
    }

    public static void X0(int i) {
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
            case 11:
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
            case 11:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 2:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void y0(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2) ? 2 : 3];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i != 1 && i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void z0(int i) {
        String str = (i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 7 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i == 7) {
            objArr[1] = "getValue";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 7 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.u(this, obj);
    }

    @Override
    public final List O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        X0(7);
        throw null;
    }

    @Override
    public final u T() {
        return null;
    }

    @Override
    public final u X() {
        return null;
    }

    public final y20.d Y0() {
        switch (this.D) {
            case 0:
                y20.c cVar = (y20.c) this.F;
                if (cVar != null) {
                    return cVar;
                }
                y0(1);
                throw null;
            default:
                f5.c cVar2 = this.F;
                if (cVar2 != null) {
                    return cVar2;
                }
                z0(7);
                throw null;
        }
    }

    @Override
    public final u e(u0 u0Var) {
        if (u0Var == null) {
            X0(3);
            throw null;
        }
        if (!u0Var.a.e()) {
            e30.w wVarI = l() instanceof j10.e ? u0Var.i(getType(), a1.E) : u0Var.i(getType(), a1.C);
            if (wVarI == null) {
                return null;
            }
            if (wVarI != getType()) {
                return new u(l(), new y20.e(wVarI), getAnnotations());
            }
        }
        return this;
    }

    @Override
    public final j10.b a() {
        return this;
    }

    @Override
    public final j10.k a() {
        return this;
    }

    @Override
    public final e30.w getReturnType() {
        return getType();
    }

    @Override
    public final e30.w getType() {
        e30.w type = Y0().getType();
        if (type != null) {
            return type;
        }
        X0(6);
        throw null;
    }

    @Override
    public final List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        X0(5);
        throw null;
    }

    @Override
    public final j10.o getVisibility() {
        j10.o oVar = j10.p.f;
        if (oVar != null) {
            return oVar;
        }
        X0(9);
        throw null;
    }

    @Override
    public final j10.k l() {
        switch (this.D) {
            case 0:
                j10.e eVar = (j10.e) this.E;
                if (eVar != null) {
                    return eVar;
                }
                y0(2);
                throw null;
            default:
                j10.k kVar = this.E;
                if (kVar != null) {
                    return kVar;
                }
                z0(8);
                throw null;
        }
    }

    @Override
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        X0(8);
        throw null;
    }

    @Override
    public final j10.n0 o() {
        return j10.n0.n;
    }

    @Override
    public String toString() {
        switch (this.D) {
            case 0:
                return "class " + ((j10.e) this.E).getName() + "::this";
            default:
                return super.toString();
        }
    }
}
