package e30;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class x0 {
    public static final g30.i a = g30.l.c(g30.k.L, new String[0]);
    public static final g30.i b = g30.l.c(g30.k.I, new String[0]);
    public static final w0 c = new w0("NO_EXPECTED_TYPE");
    public static final w0 d = new w0("UNIT_EXPECTED_TYPE");

    public static void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
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
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(w wVar) {
        if (wVar == null) {
            a(28);
            throw null;
        }
        if (wVar.t0()) {
            return true;
        }
        return c.l(wVar) && b(((q) wVar.y0()).C);
    }

    public static boolean c(w wVar, u00.k kVar, n30.i iVar) {
        if (wVar == null) {
            return false;
        }
        z0 z0VarY0 = wVar.y0();
        if (l(wVar)) {
            return ((Boolean) kVar.invoke(z0VarY0)).booleanValue();
        }
        if (iVar != null && iVar.contains(wVar)) {
            return false;
        }
        if (((Boolean) kVar.invoke(z0VarY0)).booleanValue()) {
            return true;
        }
        if (iVar == null) {
            int i = n30.i.C;
            iVar = n30.l.e();
        }
        iVar.add(wVar);
        q qVar = z0VarY0 instanceof q ? (q) z0VarY0 : null;
        if (qVar != null && (c(qVar.B, kVar, iVar) || c(qVar.C, kVar, iVar))) {
            return true;
        }
        if ((z0VarY0 instanceof l) && c(((l) z0VarY0).B, kVar, iVar)) {
            return true;
        }
        m0 m0VarM0 = wVar.m0();
        if (m0VarM0 instanceof v) {
            Iterator it = ((v) m0VarM0).B.iterator();
            while (it.hasNext()) {
                if (c((w) it.next(), kVar, iVar)) {
                    return true;
                }
            }
            return false;
        }
        for (p0 p0Var : wVar.e0()) {
            if (!p0Var.c() && c(p0Var.b(), kVar, iVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f0(((j10.r0) it.next()).n()));
        }
        return h00.q.n1(arrayList);
    }

    public static boolean e(w wVar) {
        if (wVar == null) {
            a(27);
            throw null;
        }
        if (!wVar.t0() && (!c.l(wVar) || !e(((q) wVar.y0()).C))) {
            if (!(wVar.y0() instanceof l)) {
                if (f(wVar)) {
                    if (!(wVar.m0().g() instanceof j10.e)) {
                        u0 u0VarD = u0.d(wVar);
                        Collection<w> collectionL = wVar.m0().l();
                        ArrayList arrayList = new ArrayList(collectionL.size());
                        for (w wVar2 : collectionL) {
                            if (wVar2 == null) {
                                a(21);
                                throw null;
                            }
                            w wVarI = u0VarD.i(wVar2, a1.C);
                            w wVarH = wVarI != null ? h(wVarI, wVar.t0()) : null;
                            if (wVarH != null) {
                                arrayList.add(wVarH);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (e((w) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                m0 m0VarM0 = wVar.m0();
                if (m0VarM0 instanceof v) {
                    Iterator it2 = ((v) m0VarM0).B.iterator();
                    while (it2.hasNext()) {
                        if (e((w) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean f(w wVar) {
        if (wVar == null) {
            a(60);
            throw null;
        }
        if ((wVar.m0().g() instanceof j10.r0 ? (j10.r0) wVar.m0().g() : null) != null) {
            return true;
        }
        wVar.m0();
        return false;
    }

    public static z0 g(w wVar, boolean z) {
        if (wVar == null) {
            a(3);
            throw null;
        }
        z0 z0VarZ0 = wVar.y0().z0(z);
        if (z0VarZ0 != null) {
            return z0VarZ0;
        }
        a(4);
        throw null;
    }

    public static w h(w wVar, boolean z) {
        if (wVar != null) {
            return z ? g(wVar, true) : wVar;
        }
        a(8);
        throw null;
    }

    public static a0 i(a0 a0Var, boolean z) {
        if (a0Var == null) {
            a(5);
            throw null;
        }
        if (!z) {
            return a0Var;
        }
        a0 a0VarZ0 = a0Var.z0(true);
        if (a0VarZ0 != null) {
            return a0VarZ0;
        }
        a(6);
        throw null;
    }

    public static f0 j(j10.r0 r0Var) {
        if (r0Var != null) {
            return new f0(r0Var);
        }
        a(45);
        throw null;
    }

    public static p0 k(j10.r0 r0Var, c20.a aVar) {
        if (r0Var != null) {
            return aVar.a == v0.A ? new f0(c.x(r0Var)) : new f0(r0Var);
        }
        a(46);
        throw null;
    }

    public static boolean l(w wVar) {
        if (wVar != null) {
            return wVar == c || wVar == d;
        }
        a(0);
        throw null;
    }
}
