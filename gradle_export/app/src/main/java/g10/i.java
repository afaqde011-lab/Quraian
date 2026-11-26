package g10;

import a1.u0;
import a40.g1;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.utils.EventsFileHelper;
import com.revenuecat.purchases.utils.PurchaseParamsValidator;
import e30.a1;
import e30.f0;
import e30.m0;
import e30.p0;
import e30.w;
import e30.x0;
import e30.z0;
import j10.e0;
import j10.g0;
import j10.l0;
import j10.u;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m10.a0;
import m10.c0;
import m10.j0;
import m10.k0;
import m10.z;

public abstract class i {
    public static final n20.e e = n20.e.g("<built-ins module>");
    public a0 a;
    public final d30.i b;
    public final d30.e c;
    public final d30.l d;

    public i(d30.l lVar) {
        this.d = lVar;
        lVar.a(new f(this, 0));
        this.b = new d30.i(lVar, new f(this, 1));
        this.c = lVar.b(new g(this, 0));
    }

    public static boolean A(j10.k kVar) {
        if (kVar != null) {
            return q20.d.h(kVar, b30.c.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean B(w wVar, n20.d dVar) {
        if (wVar == null) {
            a(97);
            throw null;
        }
        if (dVar != null) {
            return I(wVar.m0(), dVar);
        }
        a(98);
        throw null;
    }

    public static boolean C(w wVar, n20.d dVar) {
        if (dVar != null) {
            return B(wVar, dVar) && !wVar.t0();
        }
        a(135);
        throw null;
    }

    public static boolean D(u uVar) {
        if (uVar.a().getAnnotations().d(o.m)) {
            return true;
        }
        if (!(uVar instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) uVar;
        boolean zW = l0Var.W();
        j0 j0VarB = l0Var.b();
        k0 k0VarC = l0Var.c();
        if (j0VarB == null || !D(j0VarB)) {
            return false;
        }
        if (zW) {
            return k0VarC != null && D(k0VarC);
        }
        return true;
    }

    public static boolean E(w wVar, n20.d dVar) {
        if (wVar == null) {
            a(105);
            throw null;
        }
        if (dVar != null) {
            return !wVar.t0() && B(wVar, dVar);
        }
        a(106);
        throw null;
    }

    public static boolean F(w wVar) {
        if (wVar != null) {
            return B(wVar, o.b) && !x0.e(wVar);
        }
        a(136);
        throw null;
    }

    public static boolean G(w wVar) {
        if (wVar.t0()) {
            return false;
        }
        j10.h hVarG = wVar.m0().g();
        return (hVarG instanceof j10.e) && u((j10.e) hVarG) != null;
    }

    public static boolean H(w wVar) {
        return E(wVar, o.f);
    }

    public static boolean I(m0 m0Var, n20.d dVar) {
        if (m0Var == null) {
            a(101);
            throw null;
        }
        if (dVar != null) {
            j10.h hVarG = m0Var.g();
            return (hVarG instanceof j10.e) && b((j10.e) hVarG, dVar);
        }
        a(102);
        throw null;
    }

    public static boolean J(j10.h hVar) {
        if (hVar == null) {
            a(10);
            throw null;
        }
        for (j10.k kVarL = hVar; kVarL != null; kVarL = kVarL.l()) {
            if (kVarL instanceof e0) {
                n20.c cVar = ((c0) ((e0) kVarL)).F;
                n20.e segment = p.k;
                cVar.getClass();
                kotlin.jvm.internal.m.e(segment, "segment");
                return cVar.a.h(segment);
            }
        }
        return false;
    }

    public static void a(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                                case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                                case 51:
                                case 52:
                                case 53:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                                case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                                    objArr[1] = "getNothingType";
                                    break;
                                case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
            case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case EventsFileHelper.MAX_EVENT_PROPERTY_SIZE:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case PurchaseParamsValidator.MAX_NUMBER_OF_ADD_ON_PRODUCTS:
                                case EventsManager.EVENTS_TO_CLEAR_ON_LIMIT:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    public static boolean b(j10.e eVar, n20.d dVar) {
        if (eVar == null) {
            a(103);
            throw null;
        }
        if (dVar != null) {
            return eVar.getName().equals(dVar.g()) && dVar.equals(q20.d.f(eVar));
        }
        a(104);
        throw null;
    }

    public static k s(j10.h hVar) {
        if (hVar == null) {
            a(77);
            throw null;
        }
        if (o.e0.contains(hVar.getName())) {
            return (k) o.g0.get(q20.d.f(hVar));
        }
        return null;
    }

    public static k u(j10.e eVar) {
        if (o.d0.contains(eVar.getName())) {
            return (k) o.f0.get(q20.d.f(eVar));
        }
        return null;
    }

    public static boolean y(w wVar) {
        if (wVar != null) {
            return B(wVar, o.a);
        }
        a(139);
        throw null;
    }

    public static boolean z(w wVar) {
        if (wVar != null) {
            return B(wVar, o.g);
        }
        a(88);
        throw null;
    }

    public final void c() {
        n20.e moduleName = e;
        kotlin.jvm.internal.m.e(moduleName, "moduleName");
        d30.l lVar = this.d;
        a0 a0Var = new a0(moduleName, lVar, this, 48);
        this.a = a0Var;
        c.a.getClass();
        c cVar = (c) b.b.getValue();
        a0 builtInsModule = this.a;
        Iterable classDescriptorFactories = m();
        l10.d platformDependentDeclarationFilter = q();
        l10.b additionalClassPartsProvider = d();
        b30.b bVar = (b30.b) cVar;
        bVar.getClass();
        kotlin.jvm.internal.m.e(builtInsModule, "builtInsModule");
        kotlin.jvm.internal.m.e(classDescriptorFactories, "classDescriptorFactories");
        kotlin.jvm.internal.m.e(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.m.e(additionalClassPartsProvider, "additionalClassPartsProvider");
        Set<n20.c> packageFqNames = p.r;
        g1 g1Var = new g1(1, bVar.b, b30.d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 13);
        kotlin.jvm.internal.m.e(packageFqNames, "packageFqNames");
        ArrayList arrayList = new ArrayList();
        for (n20.c cVar2 : packageFqNames) {
            b30.a.m.getClass();
            InputStream inputStream = (InputStream) g1Var.invoke(b30.a.a(cVar2));
            b30.c cVarQ = inputStream != null ? va.a.q(cVar2, lVar, builtInsModule, inputStream) : null;
            if (cVarQ != null) {
                arrayList.add(cVarQ);
            }
        }
        g0 g0Var = new g0(arrayList);
        oj.q qVar = new oj.q(lVar, builtInsModule);
        qj.c cVar3 = new qj.c(g0Var, 2);
        b30.a aVar = b30.a.m;
        a30.i iVar = new a30.i(lVar, builtInsModule, cVar3, new u0(builtInsModule, qVar, aVar), g0Var, classDescriptorFactories, qVar, additionalClassPartsProvider, platformDependentDeclarationFilter, aVar.a, null, new tf.w(lVar), 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b30.c) it.next()).Z0(iVar);
        }
        a0Var.I = g0Var;
        a0 a0Var2 = this.a;
        a0Var2.getClass();
        a0Var2.H = new z(h00.n.V0(new a0[]{a0Var2}));
    }

    public l10.b d() {
        return l10.a.b;
    }

    public final e30.a0 e() {
        e30.a0 a0VarN = k("Any").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(51);
        throw null;
    }

    public final w f(w wVar) {
        if (wVar == null) {
            a(68);
            throw null;
        }
        w wVarG = g(wVar);
        if (wVarG != null) {
            return wVarG;
        }
        throw new IllegalStateException("not array: " + wVar);
    }

    public final w g(w wVar) {
        n20.b bVarF;
        n20.b bVar;
        j10.e eVarD;
        e30.a0 a0VarN;
        if (wVar == null) {
            a(70);
            throw null;
        }
        if (!z(wVar)) {
            z0 z0VarG = x0.g(wVar, false);
            w wVar2 = (w) ((h) this.b.invoke()).b.get(z0VarG);
            if (wVar2 != null) {
                return wVar2;
            }
            int i = q20.d.a;
            j10.h hVarG = z0VarG.m0().g();
            j10.z zVarD = hVarG == null ? null : q20.d.d(hVarG);
            if (zVarD != null) {
                j10.h hVarG2 = z0VarG.m0().g();
                if (hVarG2 == null) {
                    a0VarN = null;
                } else {
                    Set set = t.a;
                    n20.e name = hVarG2.getName();
                    kotlin.jvm.internal.m.e(name, "name");
                    if (!t.d.contains(name) || (bVarF = u20.d.f(hVarG2)) == null || (bVar = (n20.b) t.b.get(bVarF)) == null || (eVarD = j10.w.d(zVarD, bVar)) == null) {
                        a0VarN = null;
                    } else {
                        a0VarN = eVarD.n();
                    }
                }
                if (a0VarN != null) {
                    return a0VarN;
                }
            }
        } else if (wVar.e0().size() == 1) {
            return ((p0) wVar.e0().get(0)).b();
        }
        return null;
    }

    public final e30.a0 h(w wVar) {
        a1 a1Var = a1.C;
        if (wVar != null) {
            return i(a1Var, wVar, k10.g.a);
        }
        a(83);
        throw null;
    }

    public final e30.a0 i(a1 a1Var, w wVar, k10.h hVar) {
        if (wVar != null) {
            return e30.c.t(e30.c.E(hVar), k("Array"), Collections.singletonList(new f0(wVar, a1Var)));
        }
        a(79);
        throw null;
    }

    public final j10.e j(n20.c cVar) {
        if (cVar == null) {
            a(12);
            throw null;
        }
        a0 a0VarL = l();
        r10.c cVar2 = r10.c.A;
        j10.e eVarJ = j10.w.j(a0VarL, cVar);
        if (eVarJ != null) {
            return eVarJ;
        }
        a(13);
        throw null;
    }

    public final j10.e k(String str) {
        if (str != null) {
            return (j10.e) this.c.invoke(n20.e.e(str));
        }
        a(14);
        throw null;
    }

    public final a0 l() {
        this.a.getClass();
        a0 a0Var = this.a;
        if (a0Var != null) {
            return a0Var;
        }
        a(7);
        throw null;
    }

    public Iterable m() {
        List listSingletonList = Collections.singletonList(new h10.a(this.d, l()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    public final e30.a0 n() {
        e30.a0 a0VarP = p();
        if (a0VarP != null) {
            return a0VarP;
        }
        a(53);
        throw null;
    }

    public final e30.a0 o() {
        e30.a0 a0VarN = k("Nothing").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(49);
        throw null;
    }

    public final e30.a0 p() {
        e30.a0 a0VarC0 = e().z0(true);
        if (a0VarC0 != null) {
            return a0VarC0;
        }
        a(52);
        throw null;
    }

    public l10.d q() {
        return l10.a.d;
    }

    public final e30.a0 r(k kVar) {
        if (kVar == null) {
            a(73);
            throw null;
        }
        e30.a0 a0Var = (e30.a0) ((h) this.b.invoke()).a.get(kVar);
        if (a0Var != null) {
            return a0Var;
        }
        a(74);
        throw null;
    }

    public final e30.a0 t(k kVar) {
        if (kVar == null) {
            a(54);
            throw null;
        }
        e30.a0 a0VarN = k(kVar.A.b()).n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(55);
        throw null;
    }

    public final e30.a0 v() {
        e30.a0 a0VarN = k("String").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(66);
        throw null;
    }

    public final j10.e w(int i) {
        return j(p.f.a(n20.e.e(h10.j.c.b + i)));
    }

    public final e30.a0 x() {
        e30.a0 a0VarN = k("Unit").n();
        if (a0VarN != null) {
            return a0VarN;
        }
        a(65);
        throw null;
    }
}
