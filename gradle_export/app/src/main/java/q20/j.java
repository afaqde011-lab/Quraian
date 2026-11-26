package q20;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import e30.l0;
import e30.w;
import e30.z0;
import h00.q;
import h00.r;
import j10.o;
import j10.p;
import j10.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import m10.g0;
import m10.i0;
import m10.k0;
import m10.r0;
import m10.t;
import m10.u;
import q0.w0;

public final class j {
    public static final List b = q.n1(ServiceLoader.load(e.class, e.class.getClassLoader()));
    public static final j c;
    public static final b d;
    public final f30.c a;

    static {
        b bVar = new b();
        d = bVar;
        c = new j(bVar);
    }

    public j(f30.c cVar) {
        if (cVar != null) {
            this.a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    public static void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(w wVar, w wVar2, l0 l0Var) {
        if (wVar == null) {
            a(44);
            throw null;
        }
        if (wVar2 == null) {
            a(45);
            throw null;
        }
        if (e30.c.k(wVar) && e30.c.k(wVar2)) {
            return true;
        }
        return e30.d.h(l0Var, wVar.y0(), wVar2.y0());
    }

    public static void c(j10.c cVar, LinkedHashSet linkedHashSet) {
        if (cVar == null) {
            a(17);
            throw null;
        }
        if (cVar.getKind() != 2) {
            linkedHashSet.add(cVar);
            return;
        }
        if (cVar.m().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + cVar);
        }
        Iterator it = cVar.m().iterator();
        while (it.hasNext()) {
            c((j10.c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(j10.b bVar) {
        u uVarX = bVar.X();
        ArrayList arrayList = new ArrayList();
        if (uVarX != null) {
            arrayList.add(uVarX.getType());
        }
        Iterator it = bVar.O().iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).getType());
        }
        return arrayList;
    }

    public static void e(Collection collection, j10.e eVar, k kVar) {
        y yVar;
        boolean z;
        if (collection == null) {
            a(83);
            throw null;
        }
        if (eVar == null) {
            a(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList.isEmpty();
                if (!zIsEmpty) {
                    collection = arrayList;
                }
                Iterator it2 = collection.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        if (eVar.E() && eVar.g() != y.E && eVar.g() != y.C) {
                            z2 = true;
                        }
                        if (z3 && !z4) {
                            yVar = y.D;
                            break;
                        }
                        if (!z3 && z4) {
                            y yVarG = z2 ? eVar.g() : y.E;
                            if (yVarG != null) {
                                yVar = yVarG;
                                break;
                            } else {
                                a(90);
                                throw null;
                            }
                        }
                        HashSet<j10.c> hashSet = new HashSet();
                        for (j10.c cVar : collection) {
                            if (cVar == null) {
                                a(15);
                                throw null;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            c(cVar, linkedHashSet);
                            hashSet.addAll(linkedHashSet);
                        }
                        if (!hashSet.isEmpty() && u20.d.j((j10.k) hashSet.iterator().next()).D(f30.g.a) != null) {
                            throw new ClassCastException();
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            for (Object obj : hashSet) {
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(obj);
                                        break;
                                    }
                                    j10.b bVar = (j10.b) obj;
                                    j10.b bVar2 = (j10.b) it3.next();
                                    if (!q(bVar, bVar2)) {
                                        if (q(bVar2, bVar)) {
                                            break;
                                        }
                                    } else {
                                        it3.remove();
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        y yVarG2 = eVar.g();
                        if (yVarG2 == null) {
                            a(92);
                            throw null;
                        }
                        y yVar2 = y.E;
                        for (j10.c cVar2 : hashSet) {
                            y yVarG3 = (z2 && cVar2.g() == y.E) ? yVarG2 : cVar2.g();
                            if (yVarG3.compareTo(yVar2) < 0) {
                                yVar2 = yVarG3;
                            }
                        }
                        if (yVar2 != null) {
                            yVar = yVar2;
                            break;
                        } else {
                            a(93);
                            throw null;
                        }
                    }
                    j10.c cVar3 = (j10.c) it2.next();
                    int iOrdinal = cVar3.g().ordinal();
                    if (iOrdinal == 0) {
                        yVar = y.B;
                        break;
                    }
                    if (iOrdinal == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + cVar3);
                    }
                    if (iOrdinal == 2) {
                        z3 = true;
                    } else if (iOrdinal == 3) {
                        z4 = true;
                    }
                }
                j10.c cVarR = ((j10.c) s(collection, new h(0))).r(eVar, yVar, zIsEmpty ? p.h : p.g);
                kVar.p(cVarR, collection);
                kVar.b(cVarR);
                return;
            }
            Object next = it.next();
            j10.c cVar4 = (j10.c) next;
            if (!p.e(cVar4.getVisibility())) {
                if (cVar4 == null) {
                    p.a(2);
                    throw null;
                }
                if (eVar == null) {
                    p.a(3);
                    throw null;
                }
                z = p.c(p.l, cVar4, eVar) == null;
            }
            if (z) {
                arrayList.add(next);
            }
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, u00.k kVar, u00.k kVar2) {
        if (obj == null) {
            a(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        j10.b bVar = (j10.b) kVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            j10.b bVar2 = (j10.b) kVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(bVar, bVar2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    kVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static i i(j10.b bVar, j10.b bVar2) {
        boolean z;
        i iVarC;
        if (bVar == null) {
            a(38);
            throw null;
        }
        if (bVar2 == null) {
            a(39);
            throw null;
        }
        boolean z2 = bVar instanceof j10.u;
        if ((z2 && !(bVar2 instanceof j10.u)) || (((z = bVar instanceof j10.l0)) && !(bVar2 instanceof j10.l0))) {
            return i.c("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + bVar);
        }
        if (!bVar.getName().equals(bVar2.getName())) {
            return i.c("Name mismatch");
        }
        if ((bVar.X() == null) != (bVar2.X() == null)) {
            iVarC = i.c("Receiver presence mismatch");
        } else {
            iVarC = bVar.O().size() != bVar2.O().size() ? i.c("Value parameter number mismatch") : null;
        }
        if (iVarC != null) {
            return iVarC;
        }
        return null;
    }

    public static int j(j10.b bVar, j10.b bVar2) {
        j jVar = c;
        int iB = jVar.l(bVar2, bVar, null).b();
        int iB2 = jVar.m(bVar, bVar2, null, false).b();
        if (iB == 1 && iB2 == 1) {
            return 1;
        }
        return (iB == 3 || iB2 == 3) ? 3 : 2;
    }

    public static boolean k(j10.b bVar, j10.b bVar2) {
        if (bVar == null) {
            a(65);
            throw null;
        }
        if (bVar2 == null) {
            a(66);
            throw null;
        }
        w returnType = bVar.getReturnType();
        w returnType2 = bVar2.getReturnType();
        if (!p(bVar, bVar2)) {
            return false;
        }
        l0 l0VarF = c.f(bVar.getTypeParameters(), bVar2.getTypeParameters());
        if (bVar instanceof j10.u) {
            return o(bVar, returnType, bVar2, returnType2, l0VarF);
        }
        if (!(bVar instanceof j10.l0)) {
            throw new IllegalArgumentException("Unexpected callable: " + bVar.getClass());
        }
        j10.l0 l0Var = (j10.l0) bVar;
        j10.l0 l0Var2 = (j10.l0) bVar2;
        k0 k0VarC = l0Var.c();
        k0 k0VarC2 = l0Var2.c();
        if (!((k0VarC == null || k0VarC2 == null) ? true : p(k0VarC, k0VarC2))) {
            return false;
        }
        if (l0Var.W() && l0Var2.W()) {
            return e30.d.h(l0VarF, returnType.y0(), returnType2.y0());
        }
        return (l0Var.W() || !l0Var2.W()) && o(bVar, returnType, bVar2, returnType2, l0VarF);
    }

    public static boolean o(j10.b bVar, w wVar, j10.b bVar2, w wVar2, l0 l0Var) {
        if (bVar == null) {
            a(71);
            throw null;
        }
        if (wVar == null) {
            a(72);
            throw null;
        }
        if (bVar2 == null) {
            a(73);
            throw null;
        }
        if (wVar2 == null) {
            a(74);
            throw null;
        }
        z0 z0VarY0 = wVar.y0();
        z0 z0VarY1 = wVar2.y0();
        if (z0VarY0 == z0VarY1) {
            return true;
        }
        if (!l0Var.b(z0VarY0, z0VarY1)) {
            return false;
        }
        return e30.d.a.f(l0Var, l0Var.c, z0VarY0, z0VarY1);
    }

    public static boolean p(j10.b bVar, j10.b bVar2) {
        if (bVar == null) {
            a(67);
            throw null;
        }
        if (bVar2 != null) {
            Integer numB = p.b(bVar.getVisibility(), bVar2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(68);
        throw null;
    }

    public static boolean q(j10.b bVar, j10.b bVar2) {
        if (bVar == null) {
            a(13);
            throw null;
        }
        if (bVar2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = bVar.equals(bVar2);
        b bVar3 = b.A;
        if (!zEquals && bVar3.b(bVar.a(), bVar2.a(), false)) {
            return true;
        }
        j10.b bVarA = bVar2.a();
        int i = d.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d.b(bVar.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (bVar3.b(bVarA, (j10.b) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(j10.c cVar, u00.k kVar) {
        o oVar;
        o oVarF;
        o oVar2;
        if (cVar == null) {
            a(105);
            throw null;
        }
        for (j10.c cVar2 : cVar.m()) {
            if (cVar2.getVisibility() == p.g) {
                r(cVar2, kVar);
            }
        }
        if (cVar.getVisibility() != p.g) {
            return;
        }
        Collection<j10.c> collectionM = cVar.m();
        if (collectionM == null) {
            a(107);
            throw null;
        }
        if (!collectionM.isEmpty()) {
            Iterator it = collectionM.iterator();
            loop3: while (true) {
                oVar = null;
                while (true) {
                    if (!it.hasNext()) {
                        break loop3;
                    }
                    o visibility = ((j10.c) it.next()).getVisibility();
                    if (oVar != null) {
                        Integer numB = p.b(visibility, oVar);
                        if (numB != null) {
                            if (numB.intValue() > 0) {
                            }
                        }
                    }
                    oVar = visibility;
                }
            }
            if (oVar == null) {
                oVarF = null;
                break;
            }
            Iterator it2 = collectionM.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    oVarF = oVar;
                    break;
                }
                Integer numB2 = p.b(oVar, ((j10.c) it2.next()).getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = p.j;
        }
        if (oVarF == null) {
            oVarF = null;
            break;
        }
        if (cVar.getKind() == 2) {
            for (j10.c cVar3 : collectionM) {
                if (cVar3.g() != y.E && !cVar3.getVisibility().equals(oVarF)) {
                    oVarF = null;
                    break;
                }
            }
        } else {
            oVarF = p.f(oVarF.a.c());
        }
        if (oVarF == null) {
            if (kVar != null) {
                kVar.invoke(cVar);
            }
            oVar2 = p.e;
        } else {
            oVar2 = oVarF;
        }
        if (cVar instanceof i0) {
            i0 i0Var = (i0) cVar;
            if (oVar2 == null) {
                i0.y0(20);
                throw null;
            }
            i0Var.K = oVar2;
            Iterator it3 = ((j10.l0) cVar).q().iterator();
            while (it3.hasNext()) {
                r((j10.k0) it3.next(), oVarF == null ? null : kVar);
            }
            return;
        }
        if (cVar instanceof t) {
            t tVar = (t) cVar;
            if (oVar2 != null) {
                tVar.M = oVar2;
                return;
            } else {
                t.y0(10);
                throw null;
            }
        }
        g0 g0Var = (g0) cVar;
        g0Var.L = oVar2;
        if (oVar2 != g0Var.Y0().getVisibility()) {
            g0Var.F = false;
        }
    }

    public static Object s(Collection collection, u00.k kVar) {
        Object next;
        if (collection.size() == 1) {
            Object objK0 = q.K0(collection);
            if (objK0 != null) {
                return objK0;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(r.q0(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(kVar.invoke(it.next()));
        }
        Object objK1 = q.K0(collection);
        j10.b bVar = (j10.b) kVar.invoke(objK1);
        for (Object obj : collection) {
            j10.b bVar2 = (j10.b) kVar.invoke(obj);
            if (bVar2 == null) {
                a(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
            } while (k(bVar2, (j10.b) it2.next()));
            if (k(bVar2, bVar) && !k(bVar, bVar2)) {
                objK1 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objK1 != null) {
                return objK1;
            }
            a(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objK2 = q.K0(arrayList);
            if (objK2 != null) {
                return objK2;
            }
            a(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (e30.c.l(((j10.b) kVar.invoke(next)).getReturnType()));
        if (next != null) {
            return next;
        }
        Object objK3 = q.K0(arrayList);
        if (objK3 != null) {
            return objK3;
        }
        a(82);
        throw null;
    }

    public final l0 f(List list, List list2) {
        if (list == null) {
            a(40);
            throw null;
        }
        if (list2 == null) {
            a(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        f30.c cVar = this.a;
        if (zIsEmpty) {
            return new h1.l((HashMap) null, cVar).U0();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((j10.r0) list.get(i)).f(), ((j10.r0) list2.get(i)).f());
        }
        return new h1.l(map, cVar).U0();
    }

    public final void h(n20.e eVar, Collection collection, Collection collection2, j10.e eVar2, k kVar) {
        Integer numB;
        if (eVar == null) {
            a(50);
            throw null;
        }
        if (collection == null) {
            a(51);
            throw null;
        }
        if (collection2 == null) {
            a(52);
            throw null;
        }
        if (eVar2 == null) {
            a(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            j10.c cVar = (j10.c) it.next();
            if (cVar == null) {
                a(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = n30.i.C;
            n30.i iVarE = n30.l.e();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                j10.c cVar2 = (j10.c) it2.next();
                int iB = l(cVar2, cVar, eVar2).b();
                boolean z = !p.e(cVar2.getVisibility()) && p.c(p.l, cVar2, cVar) == null;
                int iB2 = e4.f.b(iB);
                if (iB2 == 0) {
                    if (z) {
                        iVarE.add(cVar2);
                    }
                    arrayList.add(cVar2);
                } else if (iB2 == 2) {
                    if (z) {
                        kVar.d(cVar2, cVar);
                    }
                    arrayList.add(cVar2);
                }
            }
            kVar.p(cVar, iVarE);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            j10.k kVarL = ((j10.c) linkedHashSet.iterator().next()).l();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((j10.c) it3.next()).l() != kVarL) {
                        LinkedList<j10.c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            j10.c cVar3 = null;
                            for (j10.c cVar4 : linkedList) {
                                if (cVar3 == null || ((numB = p.b(cVar3.getVisibility(), cVar4.getVisibility())) != null && numB.intValue() < 0)) {
                                    cVar3 = cVar4;
                                }
                            }
                            kotlin.jvm.internal.m.b(cVar3);
                            e(g(cVar3, linkedList, new h(1), new w0(kVar, cVar3, 2)), eVar2, kVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((j10.c) it4.next()), eVar2, kVar);
        }
    }

    public final i l(j10.b bVar, j10.b bVar2, j10.e eVar) {
        if (bVar == null) {
            a(19);
            throw null;
        }
        if (bVar2 != null) {
            return m(bVar, bVar2, eVar, false);
        }
        a(20);
        throw null;
    }

    public final i m(j10.b bVar, j10.b bVar2, j10.e eVar, boolean z) {
        if (bVar == null) {
            a(22);
            throw null;
        }
        if (bVar2 == null) {
            a(23);
            throw null;
        }
        i iVarN = n(bVar, bVar2, z);
        boolean z2 = iVarN.b() == 1;
        List<e> list = b;
        for (e eVar2 : list) {
            if (eVar2.b() != 1 && (!z2 || eVar2.b() != 2)) {
                int iB = e4.f.b(eVar2.a(bVar, bVar2, eVar));
                if (iB == 0) {
                    z2 = true;
                } else if (iB == 1) {
                    return i.c("External condition");
                }
            }
        }
        if (!z2) {
            return iVarN;
        }
        for (e eVar3 : list) {
            if (eVar3.b() == 1) {
                int iB2 = e4.f.b(eVar3.a(bVar, bVar2, eVar));
                if (iB2 == 0) {
                    throw new IllegalStateException("Contract violation in " + eVar3.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (iB2 == 1) {
                    return i.c("External condition");
                }
            }
        }
        i iVar = i.c;
        if (iVar != null) {
            return iVar;
        }
        i.a(0);
        throw null;
    }

    public final i n(j10.b bVar, j10.b bVar2, boolean z) {
        boolean zF;
        if (bVar == null) {
            a(28);
            throw null;
        }
        if (bVar2 == null) {
            a(29);
            throw null;
        }
        i iVarI = i(bVar, bVar2);
        if (iVarI != null) {
            return iVarI;
        }
        ArrayList arrayListD = d(bVar);
        ArrayList arrayListD2 = d(bVar2);
        List typeParameters = bVar.getTypeParameters();
        List typeParameters2 = bVar2.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListD.size(); i++) {
                if (!f30.d.a.a((w) arrayListD.get(i), (w) arrayListD2.get(i))) {
                    return i.c("Type parameter number mismatch");
                }
            }
            return new i(3, "Type parameter number mismatch");
        }
        l0 l0VarF = f(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            j10.r0 r0Var = (j10.r0) typeParameters.get(i2);
            j10.r0 r0Var2 = (j10.r0) typeParameters2.get(i2);
            if (r0Var == null) {
                a(47);
                throw null;
            }
            if (r0Var2 == null) {
                a(48);
                throw null;
            }
            List<w> upperBounds = r0Var.getUpperBounds();
            ArrayList arrayList = new ArrayList(r0Var2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (w wVar : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    do {
                        if (listIterator.hasNext()) {
                        }
                    } while (!b(wVar, (w) listIterator.next(), l0VarF));
                    listIterator.remove();
                }
            }
            return i.c("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListD.size(); i3++) {
            if (!b((w) arrayListD.get(i3), (w) arrayListD2.get(i3), l0VarF)) {
                return i.c("Value parameter type mismatch");
            }
        }
        if ((bVar instanceof j10.u) && (bVar2 instanceof j10.u) && ((j10.u) bVar).isSuspend() != ((j10.u) bVar2).isSuspend()) {
            return new i(3, "Incompatible suspendability");
        }
        if (z) {
            w returnType = bVar.getReturnType();
            w returnType2 = bVar2.getReturnType();
            if (returnType != null && returnType2 != null && (!e30.c.k(returnType2) || !e30.c.k(returnType))) {
                z0 z0VarY0 = returnType2.y0();
                z0 z0VarY1 = returnType.y0();
                if (z0VarY0 == z0VarY1) {
                    zF = true;
                } else {
                    l0VarF.b(z0VarY0, z0VarY1);
                    zF = e30.d.a.f(l0VarF, l0VarF.c, z0VarY0, z0VarY1);
                }
                if (!zF) {
                    return new i(3, "Return type mismatch");
                }
            }
        }
        i iVar = i.c;
        if (iVar != null) {
            return iVar;
        }
        i.a(0);
        throw null;
    }
}
