package m10;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class k0 extends g0 implements j10.k0 {
    public r0 N;
    public final k0 O;

    public k0(j10.l0 l0Var, k10.h hVar, j10.y yVar, j10.o oVar, boolean z, boolean z2, boolean z3, int i, k0 k0Var, j10.n0 n0Var) {
        super(yVar, oVar, l0Var, hVar, n20.e.g("<set-" + l0Var.getName() + ">"), z, z2, z3, i, n0Var);
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
        this.O = k0Var != null ? k0Var : this;
    }

    public static r0 a1(k0 k0Var, e30.w wVar, k10.h hVar) {
        if (wVar == null) {
            y0(8);
            throw null;
        }
        if (hVar != null) {
            return new r0(k0Var, null, 0, hVar, n20.g.g, wVar, false, false, false, null, j10.n0.n);
        }
        y0(9);
        throw null;
    }

    public static void y0(int i) {
        String str;
        int i2;
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.A(this, obj);
    }

    @Override
    public final List O() {
        r0 r0Var = this.N;
        if (r0Var == null) {
            throw new IllegalStateException();
        }
        List listSingletonList = Collections.singletonList(r0Var);
        if (listSingletonList != null) {
            return listSingletonList;
        }
        y0(11);
        throw null;
    }

    @Override
    public final k0 a() {
        k0 k0Var = this.O;
        if (k0Var != null) {
            return k0Var;
        }
        y0(13);
        throw null;
    }

    @Override
    public final e30.w getReturnType() {
        return u20.d.e(this).x();
    }

    @Override
    public final Collection m() {
        return Z0(false);
    }
}
