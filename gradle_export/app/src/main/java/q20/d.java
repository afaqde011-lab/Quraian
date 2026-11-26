package q20;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import e30.m0;
import j10.e0;
import j10.i0;
import j10.n;
import j10.o0;
import j10.p;
import j10.y;
import j10.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m10.c0;
import m10.k0;
import m10.w;

public abstract class d {
    public static final int a = 0;

    static {
        new n20.c("kotlin.jvm.JvmName");
    }

    public static void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = DiagnosticsEntry.NAME_KEY;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static void b(j10.b bVar, LinkedHashSet linkedHashSet) {
        if (bVar == null) {
            a(72);
            throw null;
        }
        if (linkedHashSet.contains(bVar)) {
            return;
        }
        Iterator it = bVar.a().m().iterator();
        while (it.hasNext()) {
            j10.b bVarA = ((j10.b) it.next()).a();
            b(bVarA, linkedHashSet);
            linkedHashSet.add(bVarA);
        }
    }

    public static z c(j10.k kVar) {
        if (kVar == null) {
            a(21);
            throw null;
        }
        z zVarD = d(kVar);
        if (zVarD != null) {
            return zVarD;
        }
        a(22);
        throw null;
    }

    public static z d(j10.k kVar) {
        if (kVar == null) {
            a(23);
            throw null;
        }
        while (kVar != null) {
            if (kVar instanceof z) {
                return (z) kVar;
            }
            if (kVar instanceof i0) {
                return ((w) ((i0) kVar)).D;
            }
            kVar = kVar.l();
        }
        return null;
    }

    public static o0 e(j10.k kVar) {
        o0 o0Var = o0.B;
        if (kVar == null) {
            a(81);
            throw null;
        }
        if (kVar instanceof k0) {
            kVar = ((k0) kVar).Y0();
        }
        if (kVar instanceof j10.l) {
            ((j10.l) kVar).o().getClass();
        }
        return o0Var;
    }

    public static n20.d f(j10.k kVar) {
        if (kVar != null) {
            n20.c cVarG = g(kVar);
            return cVarG != null ? cVarG.a : f(kVar.l()).a(kVar.getName());
        }
        a(2);
        throw null;
    }

    public static n20.c g(j10.k kVar) {
        if (kVar == null) {
            a(5);
            throw null;
        }
        if ((kVar instanceof z) || g30.l.f(kVar)) {
            return n20.c.c;
        }
        if (kVar instanceof i0) {
            return ((w) ((i0) kVar)).E;
        }
        if (kVar instanceof e0) {
            return ((c0) ((e0) kVar)).F;
        }
        return null;
    }

    public static j10.k h(j10.k kVar, Class cls, boolean z) {
        if (kVar == null) {
            return null;
        }
        if (z) {
            kVar = kVar.l();
        }
        while (kVar != null) {
            if (cls.isInstance(kVar)) {
                return kVar;
            }
            kVar = kVar.l();
        }
        return null;
    }

    public static j10.e i(j10.e eVar) {
        if (eVar == null) {
            a(44);
            throw null;
        }
        for (e30.w wVar : eVar.f().l()) {
            if (wVar == null) {
                a(45);
                throw null;
            }
            m0 m0VarM0 = wVar.m0();
            if (m0VarM0 == null) {
                a(46);
                throw null;
            }
            j10.e eVar2 = (j10.e) m0VarM0.g();
            if (eVar2 == null) {
                a(47);
                throw null;
            }
            if (eVar2.getKind() != j10.f.B) {
                return eVar2;
            }
        }
        return null;
    }

    public static boolean j(j10.k kVar) {
        return l(kVar, j10.f.A) && kVar.getName().equals(n20.g.a);
    }

    public static boolean k(j10.k kVar) {
        return l(kVar, j10.f.F) && ((j10.e) kVar).s();
    }

    public static boolean l(j10.k kVar, j10.f fVar) {
        return (kVar instanceof j10.e) && ((j10.e) kVar).getKind() == fVar;
    }

    public static boolean m(j10.k kVar) {
        if (kVar == null) {
            a(1);
            throw null;
        }
        while (kVar != null) {
            if (j(kVar) || ((kVar instanceof n) && ((n) kVar).getVisibility() == p.f)) {
                return true;
            }
            kVar = kVar.l();
        }
        return false;
    }

    public static boolean n(e30.w wVar, j10.k kVar) {
        if (wVar == null) {
            a(30);
            throw null;
        }
        if (kVar == null) {
            a(31);
            throw null;
        }
        j10.h hVarG = wVar.m0().g();
        if (hVarG == null) {
            return false;
        }
        j10.k kVarA = hVarG.a();
        return (kVarA instanceof j10.h) && (kVar instanceof j10.h) && ((j10.h) kVar).f().equals(((j10.h) kVarA).f());
    }

    public static boolean o(j10.k kVar) {
        return (l(kVar, j10.f.A) || l(kVar, j10.f.B)) && ((j10.e) kVar).g() == y.C;
    }

    public static boolean p(e30.w wVar, j10.k kVar) {
        if (wVar == null) {
            a(32);
            throw null;
        }
        if (kVar == null) {
            a(33);
            throw null;
        }
        if (n(wVar, kVar)) {
            return true;
        }
        Iterator it = wVar.m0().l().iterator();
        while (it.hasNext()) {
            if (p((e30.w) it.next(), kVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(j10.k kVar) {
        return kVar != null && (kVar.l() instanceof e0);
    }

    public static j10.c r(j10.c cVar) {
        if (cVar == null) {
            a(58);
            throw null;
        }
        while (cVar.getKind() == 2) {
            Collection collectionM = cVar.m();
            if (collectionM.isEmpty()) {
                throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + cVar);
            }
            cVar = (j10.c) collectionM.iterator().next();
        }
        return cVar;
    }
}
