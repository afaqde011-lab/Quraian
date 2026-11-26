package m10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e30.u0;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class i extends t implements j10.j {
    public final boolean e0;

    public i(j10.e eVar, j10.j jVar, k10.h hVar, boolean z, int i, j10.n0 n0Var) {
        super(i, eVar, jVar, n0Var, hVar, n20.g.e);
        if (eVar == null) {
            y0(0);
            throw null;
        }
        if (hVar == null) {
            y0(1);
            throw null;
        }
        if (i == 0) {
            y0(2);
            throw null;
        }
        if (n0Var == null) {
            y0(3);
            throw null;
        }
        this.e0 = z;
    }

    public static void y0(int i) {
        String str;
        int i2;
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 27) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 21 && i != 27) {
            switch (i) {
                case 15:
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Object G(j10.m mVar, Object obj) {
        return mVar.n(this, obj);
    }

    @Override
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        y0(22);
        throw null;
    }

    @Override
    public i a1(int i, j10.k kVar, j10.u uVar, j10.n0 n0Var, k10.h hVar, n20.e eVar) {
        if (kVar == null) {
            y0(23);
            throw null;
        }
        if (i == 0) {
            y0(24);
            throw null;
        }
        if (hVar == null) {
            y0(25);
            throw null;
        }
        if (i == 1 || i == 4) {
            return new i((j10.e) kVar, this, hVar, this.e0, 1, n0Var);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + g4.c.u(i));
    }

    @Override
    public final j10.e l() {
        j10.e eVar = (j10.e) super.l();
        if (eVar != null) {
            return eVar;
        }
        y0(17);
        throw null;
    }

    @Override
    public final i a() {
        i iVar = (i) super.a();
        if (iVar != null) {
            return iVar;
        }
        y0(19);
        throw null;
    }

    @Override
    public final Collection m() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        y0(21);
        throw null;
    }

    public final void m1(List list, j10.o oVar) {
        if (list == null) {
            y0(13);
            throw null;
        }
        if (oVar != null) {
            n1(list, oVar, l().p());
        } else {
            y0(14);
            throw null;
        }
    }

    public final void n1(List list, j10.o oVar, List list2) {
        u uVarX0;
        List listS0;
        if (list == null) {
            y0(10);
            throw null;
        }
        if (oVar == null) {
            y0(11);
            throw null;
        }
        if (list2 == null) {
            y0(12);
            throw null;
        }
        j10.e eVarL = l();
        if (eVarL.k()) {
            j10.k kVarL = eVarL.l();
            if (kVarL instanceof j10.e) {
                uVarX0 = ((j10.e) kVarL).x0();
            } else {
                uVarX0 = null;
            }
        } else {
            uVarX0 = null;
        }
        j10.e eVarL2 = l();
        if (eVarL2.s0().isEmpty()) {
            listS0 = Collections.EMPTY_LIST;
            if (listS0 == null) {
                y0(16);
                throw null;
            }
        } else {
            listS0 = eVarL2.s0();
            if (listS0 == null) {
                y0(15);
                throw null;
            }
        }
        d1(null, uVarX0, listS0, list2, list, null, j10.y.B, oVar);
    }

    @Override
    public final i e(u0 u0Var) {
        if (u0Var != null) {
            return (i) super.e(u0Var);
        }
        y0(20);
        throw null;
    }

    @Override
    public final j10.c r(j10.e eVar, j10.y yVar, j10.o oVar) {
        return (i) Y0(eVar, yVar, oVar);
    }

    @Override
    public final boolean w() {
        return this.e0;
    }

    @Override
    public final j10.e x() {
        j10.e eVarL = l();
        if (eVarL != null) {
            return eVarL;
        }
        y0(18);
        throw null;
    }
}
