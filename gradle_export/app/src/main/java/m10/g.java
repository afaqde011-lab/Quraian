package m10;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class g extends e30.f {
    public final j10.o0 C;
    public final h D;

    public g(h hVar, d30.o oVar, j10.o0 o0Var) {
        super(oVar);
        if (oVar == null) {
            i(0);
            throw null;
        }
        this.D = hVar;
        this.C = o0Var;
    }

    public static void i(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 1) {
            objArr[1] = "computeSupertypes";
        } else if (i == 2) {
            objArr[1] = "getParameters";
        } else if (i == 3) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 4) {
            objArr[1] = "getBuiltIns";
        } else if (i == 5) {
            objArr[1] = "getSupertypeLoopChecker";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
        } else {
            objArr[1] = "processSupertypesWithoutCycles";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5 && i != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Collection a() {
        List listZ0 = this.D.Z0();
        if (listZ0 != null) {
            return listZ0;
        }
        i(1);
        throw null;
    }

    @Override
    public final e30.w b() {
        return g30.l.c(g30.k.G, new String[0]);
    }

    @Override
    public final j10.o0 c() {
        j10.o0 o0Var = this.C;
        if (o0Var != null) {
            return o0Var;
        }
        i(5);
        throw null;
    }

    @Override
    public final g10.i d() {
        g10.i iVarE = u20.d.e(this.D);
        if (iVarE != null) {
            return iVarE;
        }
        i(4);
        throw null;
    }

    @Override
    public final boolean f(j10.h hVar) {
        if (!(hVar instanceof j10.r0)) {
            return false;
        }
        return q20.b.A.d(this.D, (j10.r0) hVar, true, q20.a.A);
    }

    @Override
    public final j10.h g() {
        h hVar = this.D;
        if (hVar != null) {
            return hVar;
        }
        i(3);
        throw null;
    }

    @Override
    public final List getParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i(2);
        throw null;
    }

    @Override
    public final List h(List list) {
        List listY0 = this.D.Y0(list);
        if (listY0 != null) {
            return listY0;
        }
        i(8);
        throw null;
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return this.D.getName().A;
    }
}
