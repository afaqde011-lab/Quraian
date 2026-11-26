package e30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class i extends b {
    public final m10.y C;
    public final List D;
    public final Collection E;

    public i(m10.y yVar, List list, Collection collection, d30.o oVar) {
        super(oVar);
        if (list == null) {
            i(1);
            throw null;
        }
        if (collection == null) {
            i(2);
            throw null;
        }
        if (oVar == null) {
            i(3);
            throw null;
        }
        this.C = yVar;
        this.D = Collections.unmodifiableList(new ArrayList(list));
        this.E = Collections.unmodifiableCollection(collection);
    }

    public static void i(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Collection a() {
        Collection collection = this.E;
        if (collection != null) {
            return collection;
        }
        i(6);
        throw null;
    }

    @Override
    public final j10.o0 c() {
        return j10.o0.C;
    }

    @Override
    public final List getParameters() {
        List list = this.D;
        if (list != null) {
            return list;
        }
        i(4);
        throw null;
    }

    @Override
    public final j10.e g() {
        m10.y yVar = this.C;
        if (yVar != null) {
            return yVar;
        }
        i(5);
        throw null;
    }

    @Override
    public final boolean o() {
        return true;
    }

    public final String toString() {
        return q20.d.f(this.C).a;
    }
}
