package k00;

import a1.x2;
import a1.y1;
import a10.h0;
import a10.w;
import a10.z;
import a40.b0;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.internal.FrameworkClassParsingException;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.t0;
import d10.f2;
import d10.i2;
import d10.j1;
import d10.m0;
import d10.r1;
import d10.u1;
import g1.z6;
import h0.n1;
import h0.p1;
import h0.t1;
import h0.v1;
import h0.z1;
import h00.x;
import i20.a1;
import i20.f0;
import i20.h1;
import i20.j0;
import j0.v;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k00.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import l1.g0;
import l1.j;
import l1.m1;
import l1.m2;
import l1.q;
import l1.z0;
import m3.r0;
import p30.r;
import ta.c0;
import u10.l;
import w.e2;
import x.t;
import x20.n;
import x20.p;
import y3.o;
import z.i1;
import z2.w0;

public abstract class f implements e5.d {
    public static final int A(e10.g gVar) {
        m.e(gVar, "<this>");
        return gVar.a().size();
    }

    public static Collection C(p pVar, x20.f fVar, int i) {
        if ((i & 1) != 0) {
            fVar = x20.f.m;
        }
        n.a.getClass();
        return pVar.a(fVar, x20.k.B);
    }

    public static final Class D(a10.d dVar) {
        m.e(dVar, "<this>");
        Class clsV = ((kotlin.jvm.internal.d) dVar).v();
        m.c(clsV, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsV;
    }

    public static final Field E(w wVar) {
        m0 m0Var;
        m.e(wVar, "<this>");
        n20.c cVar = i2.a;
        if (wVar instanceof m0) {
            m0Var = (m0) wVar;
        } else if (wVar instanceof u) {
            a10.c cVarCompute = ((u) wVar).compute();
            if (cVarCompute instanceof m0) {
                m0Var = (m0) cVarCompute;
            } else {
                m0Var = null;
            }
        } else {
            m0Var = null;
        }
        if (m0Var != null) {
            return (Field) m0Var.L.getValue();
        }
        return null;
    }

    public static final Method F(a10.g gVar) {
        e10.g gVarA;
        m.e(gVar, "<this>");
        u1 u1VarA = i2.a(gVar);
        Member memberB = (u1VarA == null || (gVarA = u1VarA.a()) == null) ? null : gVarA.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Class G(a10.d dVar) {
        m.e(dVar, "<this>");
        Class clsV = ((kotlin.jvm.internal.d) dVar).v();
        if (!clsV.isPrimitive()) {
            return clsV;
        }
        String name = clsV.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsV : Double.class;
            case 104431:
                return !name.equals("int") ? clsV : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsV : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsV : Character.class;
            case 3327612:
                return !name.equals("long") ? clsV : Long.class;
            case 3625364:
                return !name.equals("void") ? clsV : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsV : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsV : Float.class;
            case 109413500:
                return !name.equals("short") ? clsV : Short.class;
            default:
                return clsV;
        }
    }

    public static final Class H(a10.d dVar) {
        m.e(dVar, "<this>");
        Class clsV = ((kotlin.jvm.internal.d) dVar).v();
        if (clsV.isPrimitive()) {
            return clsV;
        }
        String name = clsV.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final a10.d I(Class cls) {
        m.e(cls, "<this>");
        return a0.a.b(cls);
    }

    public static final j1 J(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (j1) I((Class) genericDeclaration);
        }
        throw new b0("Non-class container of a type parameter is not supported: " + genericDeclaration + " (" + typeVariable + ')');
    }

    public static final String M(String str, String str2) {
        if (str != null) {
            if (r30.k.L0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        return str2 == null ? "" : str2;
    }

    public static final void N(o1.k kVar, l1.a aVar, int i) {
        while (true) {
            int i2 = kVar.v;
            if (i > i2 && i < kVar.u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            kVar.O();
            if (kVar.y(kVar.v)) {
                aVar.l();
            }
            kVar.j();
        }
    }

    public static final File O(Context context, String name) {
        m.e(context, "<this>");
        m.e(name, "name");
        return h0.r(context, name.concat(".preferences_pb"));
    }

    public static void P(Metadata metadata) {
        g00.k kVarI = m20.g.i(f50.k.B(metadata), metadata.d2());
        m20.f strings = (m20.f) kVarI.A;
        f0 f0Var = (f0) kVarI.B;
        boolean z = new v10.a(metadata.mv()).compareTo(new v10.a(1, 4, 0)) < 0;
        m.e(f0Var, "<this>");
        m.e(strings, "strings");
        p10.a aVar = new p10.a(3);
        a1 a1Var = f0Var.G;
        m.d(a1Var, "getTypeTable(...)");
        h9.f fVar = new h9.f(a1Var);
        k20.j jVar = k20.j.b;
        h1 h1Var = f0Var.H;
        m.d(h1Var, "getVersionRequirementTable(...)");
        t10.i iVar = new t10.i(strings, fVar, c0.D(h1Var), z, x.A, 16);
        List list = f0Var.D;
        m.d(list, "getFunctionList(...)");
        List list2 = f0Var.E;
        m.d(list2, "getPropertyList(...)");
        List list3 = f0Var.F;
        m.d(list3, "getTypeAliasList(...)");
        p30.f.C0(aVar, list, list2, list3, iVar);
        Iterator it = iVar.h.iterator();
        while (it.hasNext()) {
            ((w10.d) ((l) it.next())).getClass();
            u10.d type = w10.e.b;
            m.e(type, "type");
            w10.e eVar = (w10.e) ((u10.f) z3.R((ArrayList) aVar.D, type));
            for (j0 j0Var : (List) f0Var.i(l20.j.l)) {
                ArrayList arrayList = eVar.a;
                m.b(j0Var);
                arrayList.add(p30.f.x0(j0Var, iVar));
            }
            o20.n packageModuleName = l20.j.k;
            m.d(packageModuleName, "packageModuleName");
            Integer num = (Integer) w00.a.u(f0Var, packageModuleName);
            if (num != null) {
                iVar.a.getString(num.intValue());
            }
        }
    }

    public static final y3.k Q(h2.c cVar) {
        return new y3.k(Math.round(cVar.a), Math.round(cVar.b), Math.round(cVar.c), Math.round(cVar.d));
    }

    public static final p30.j R(r rVar, Type type) {
        a10.e eVar = rVar.B;
        List<z> list = rVar.C;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (z zVar : list) {
            a10.x xVar = zVar.b;
            if (xVar != null) {
                z zVar2 = z.c;
                zVar = new z(a10.a0.C, xVar);
            }
            arrayList.add(zVar);
        }
        r rVarW = w(type, eVar, arrayList, true);
        d10.d dVar = new d10.d(3, type);
        boolean zEquals = rVar.equals(rVarW);
        Object jVar = rVar;
        if (!zEquals) {
            jVar = new p30.j(rVar, rVarW, false, dVar);
        }
        return (p30.j) jVar;
    }

    public static a10.x S(Type type, Map map, f2 f2Var, boolean z, int i) {
        ArrayList arrayList;
        r rVarW;
        String strM;
        d10.b bVar = d10.b.K;
        d10.b bVar2 = d10.b.J;
        f2 nullability = (i & 2) != 0 ? f2.B : f2Var;
        boolean z2 = (i & 4) != 0 ? false : z;
        m.e(type, "<this>");
        m.e(nullability, "nullability");
        boolean z3 = type instanceof Class;
        n20.d dVar = null;
        x xVar = x.A;
        if (z3) {
            Class cls = (Class) type;
            if (!n(cls).isEmpty() && !z2) {
                a10.d dVarI = I(cls);
                List listN = n(cls);
                ArrayList arrayList2 = new ArrayList(h00.r.q0(listN, 10));
                Iterator it = listN.iterator();
                while (it.hasNext()) {
                    Type[] bounds = ((TypeVariable) q30.l.q0(q30.l.n0((TypeVariable) it.next(), d10.b.G))).getBounds();
                    m.d(bounds, "getBounds(...)");
                    Type type2 = (Type) h00.n.D0(bounds);
                    z zVar = z.c;
                    m.b(type2);
                    arrayList2.add(a.a.I(S(type2, map, null, true, 2)));
                }
                r rVarW2 = w(cls, dVarI, arrayList2, false);
                a10.d dVarI2 = I(cls);
                List<TypeVariable> listN2 = n(cls);
                ArrayList arrayList3 = new ArrayList(h00.r.q0(listN2, 10));
                for (TypeVariable typeVariable : listN2) {
                    arrayList3.add(z.c);
                }
                r rVarW3 = w(cls, dVarI2, arrayList3, true);
                return rVarW2.equals(rVarW3) ? rVarW2 : new p30.j(rVarW2, rVarW3, true, new a30.l(cls, 14));
            }
            if (cls.isArray()) {
                a10.d dVarI3 = I(cls);
                Class<?> componentType = cls.getComponentType();
                m.d(componentType, "getComponentType(...)");
                return R(w(type, dVarI3, va.a.R(T(componentType, map)), false), type);
            }
            a10.d dVarI4 = I(cls);
            List<TypeVariable> listN3 = n(cls);
            ArrayList arrayList4 = new ArrayList(h00.r.q0(listN3, 10));
            for (TypeVariable typeVariable2 : listN3) {
                arrayList4.add(z.c);
            }
            rVarW = w(type, dVarI4, arrayList4, false);
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                m.d(genericComponentType, "getGenericComponentType(...)");
                z zVarT = T(genericComponentType, map);
                a10.x xVar2 = zVarT.b;
                m.b(xVar2);
                return R(w(type, I(i2.c(D(f50.k.q(xVar2)))), va.a.R(zVarT), false), type);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                m.c(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                a10.d dVarI5 = I((Class) rawType);
                if (z2) {
                    List<Type> listU0 = q30.l.u0(new q30.g(q30.l.n0(parameterizedType, bVar2), bVar, q30.n.A));
                    arrayList = new ArrayList(h00.r.q0(listU0, 10));
                    for (Type type3 : listU0) {
                        arrayList.add(z.c);
                    }
                } else {
                    List listU1 = q30.l.u0(new q30.g(q30.l.n0(parameterizedType, bVar2), bVar, q30.n.A));
                    ArrayList arrayList5 = new ArrayList(h00.r.q0(listU1, 10));
                    Iterator it2 = listU1.iterator();
                    while (it2.hasNext()) {
                        arrayList5.add(T((Type) it2.next(), map));
                    }
                    arrayList = arrayList5;
                }
                rVarW = w(type, dVarI5, arrayList, false);
            } else {
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        throw new b0("Wildcard type is not possible here: " + type);
                    }
                    throw new b0("Type is not supported: " + type + " (" + type.getClass() + ')');
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                r1 r1Var = (r1) map.get(typeVariable3);
                if (r1Var == null) {
                    Iterator it3 = J(typeVariable3).getTypeParameters().iterator();
                    boolean z4 = false;
                    Object obj = null;
                    while (true) {
                        if (!it3.hasNext()) {
                            if (!z4) {
                                break;
                            }
                            break;
                        }
                        Object next = it3.next();
                        if (m.a(((r1) next).C, typeVariable3.getName())) {
                            if (!z4) {
                                obj = next;
                                z4 = true;
                            }
                        }
                        obj = null;
                        break;
                    }
                    r1Var = (r1) obj;
                    if (r1Var == null) {
                        throw new b0("Type parameter " + typeVariable3.getName() + " is not found in " + J(typeVariable3));
                    }
                }
                rVarW = w(type, r1Var, xVar, false);
            }
        }
        a10.e eVar = rVarW.B;
        a10.d dVar2 = eVar instanceof a10.d ? (a10.d) eVar : null;
        String str = i10.d.a;
        if (dVar2 != null && (strM = dVar2.m()) != null) {
            dVar = new n20.d(strM);
        }
        n20.c cVarH = i10.d.h(dVar);
        p30.a jVar = rVarW;
        jVar = rVarW;
        if (cVarH != null && dVar2 != null) {
            r rVar = new r(eVar, rVarW.C, rVarW.D, xVar, null, false, false, false, w50.c.N(dVar2, cVarH), new d10.d(2, type));
            jVar = rVar.equals(rVarW) ? rVar : new p30.j(rVar, rVarW, false, new d10.d(0, type));
        }
        int iOrdinal = nullability.ordinal();
        if (iOrdinal == 0) {
            return jVar;
        }
        if (iOrdinal == 1) {
            return jVar.z(true);
        }
        p30.a aVarX = jVar.x();
        p30.a aVar = aVarX;
        if (aVarX == null) {
            aVar = jVar;
        }
        p30.a aVarA = jVar.A();
        p30.a aVar2 = jVar;
        if (aVarA != null) {
            aVar2 = aVarA;
        }
        p30.a aVarZ = aVar2.z(true);
        return aVar.equals(aVarZ) ? aVar : new p30.j(aVar, aVarZ, false, new d10.d(1, type));
    }

    public static final z T(Type type, Map map) {
        if (!(type instanceof WildcardType)) {
            z zVar = z.c;
            return a.a.I(S(type, map, null, false, 6));
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new b0("Wildcard types with many bounds are not supported: " + type);
        }
        if (lowerBounds.length == 1) {
            z zVar2 = z.c;
            Object objR0 = h00.n.R0(lowerBounds);
            m.d(objR0, "single(...)");
            a10.x type2 = S((Type) objR0, map, null, false, 6);
            m.e(type2, "type");
            return new z(a10.a0.B, type2);
        }
        if (upperBounds.length != 1) {
            return z.c;
        }
        z zVar3 = z.c;
        Object objR1 = h00.n.R0(upperBounds);
        m.d(objR1, "single(...)");
        a10.x type3 = S((Type) objR1, map, null, false, 6);
        m.e(type3, "type");
        return new z(a10.a0.C, type3);
    }

    public static final Intent U(Context context) {
        m.e(context, "context");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(268435456);
        return intent;
    }

    public static void V(String str, int i, List list) {
        if (list.size() == i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i + " parameters found " + list.size());
    }

    public static void W(String str, int i, List list) {
        if (list.size() >= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i + " parameters found " + list.size());
    }

    public static void X(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i + " parameters found " + arrayList.size());
    }

    public static boolean Y(com.google.android.gms.internal.measurement.n nVar) {
        if (nVar == null) {
            return false;
        }
        Double dZzd = nVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static com.google.android.gms.internal.measurement.w Z(String str) {
        com.google.android.gms.internal.measurement.w wVar = null;
        if (str != null && !str.isEmpty()) {
            wVar = (com.google.android.gms.internal.measurement.w) com.google.android.gms.internal.measurement.w.L0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(a1.b.o("Unsupported commandId ", str));
    }

    public static final void a(final String text, b2.r rVar, final long j, final long j2, o oVar, q3.u uVar, x3.k kVar, int i, float f, r0 r0Var, l1.j jVar, final int i2, final int i3) {
        int i4;
        b2.r rVar2;
        int i5;
        o oVar2;
        int i6;
        int i7;
        q3.u uVar2;
        int i8;
        int i9;
        x3.k kVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z;
        l1.j jVar2;
        final int i16;
        final float f2;
        final r0 r0Var2;
        final b2.r rVar3;
        final q3.u uVar3;
        final x3.k kVar3;
        final o oVar3;
        l1.r1 r1VarT;
        int i17;
        float f3;
        int i18;
        x3.k kVar4;
        float f4;
        r0 r0Var3;
        int i19;
        q3.u uVar4;
        o oVar4;
        b2.r rVar4;
        long j3;
        long jF;
        boolean z2;
        boolean z3;
        Object objN;
        z0 z0Var;
        boolean zG;
        Object objN2;
        int i21;
        int i22;
        m.e(text, "text");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1929546459);
        if ((i2 & 6) == 0) {
            i4 = (jVar3.g(text) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i23 = i3 & 2;
        if (i23 == 0) {
            if ((i2 & 48) == 0) {
                rVar2 = rVar;
                i4 |= jVar3.g(rVar2) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if (jVar3.f(j)) {
                    i22 = 256;
                } else {
                    i22 = 128;
                }
                i4 |= i22;
            }
            if ((i2 & 3072) == 0) {
                if (jVar3.f(j2)) {
                    i21 = 2048;
                } else {
                    i21 = 1024;
                }
                i4 |= i21;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    oVar2 = oVar;
                    if (jVar3.g(oVar2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    uVar2 = uVar;
                } else {
                    uVar2 = uVar;
                    if ((i2 & 196608) == 0) {
                        if (jVar3.g(uVar2)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    kVar2 = kVar;
                } else {
                    kVar2 = kVar;
                    if ((i2 & 1572864) == 0) {
                        if (jVar3.g(kVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    if ((i2 & 12582912) == 0) {
                        if (jVar3.e(i)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        if ((i2 & 100663296) == 0) {
                            if (jVar3.d(f)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i4 |= i15;
                        }
                        if ((i2 & 805306368) == 0) {
                            i4 |= 268435456;
                        }
                        if ((i4 & 306783379) != 306783378) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (jVar3.S(i4 & 1, z)) {
                            jVar3.X();
                            if ((i2 & 1) != 0 || jVar3.A()) {
                                if (i23 != 0) {
                                    rVar2 = b2.o.A;
                                }
                                if (i5 != 0) {
                                    oVar2 = null;
                                }
                                if (i7 != 0) {
                                    uVar2 = null;
                                }
                                if (i9 != 0) {
                                    kVar2 = null;
                                }
                                if (i12 != 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i;
                                }
                                if (i14 != 0) {
                                    f3 = 0.8f;
                                } else {
                                    f3 = f;
                                }
                                i18 = i17;
                                kVar4 = kVar2;
                                f4 = f3;
                                r0Var3 = (r0) jVar3.k(z6.a);
                                i19 = (-1879048193) & i4;
                                uVar4 = uVar2;
                                oVar4 = oVar2;
                                rVar4 = rVar2;
                            } else {
                                jVar3.V();
                                i18 = i;
                                r0Var3 = r0Var;
                                i19 = i4 & (-1879048193);
                                kVar4 = kVar2;
                                f4 = f;
                                rVar4 = rVar2;
                                uVar4 = uVar2;
                                oVar4 = oVar2;
                            }
                            jVar3.s();
                            if (oVar4 != null) {
                                j3 = oVar4.a;
                            } else {
                                j3 = j2;
                            }
                            jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                            if ((i19 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            o oVar5 = oVar4;
                            z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                            objN = jVar3.N();
                            Object obj = l1.i.a;
                            if (z3 || objN == obj) {
                                objN = q.z(new o(j2));
                                jVar3.n0(objN);
                            }
                            z0Var = (z0) objN;
                            b2.r rVar5 = rVar4;
                            long jF2 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                            long j4 = ((o) z0Var.getValue()).a;
                            zG = jVar3.g(z0Var) | jVar3.f(jF);
                            objN2 = jVar3.N();
                            if (zG || objN2 == obj) {
                                objN2 = new cl.b(jF, z0Var, 5);
                                jVar3.n0(objN2);
                            }
                            int i24 = (i19 & 1022) | ((i19 << 3) & 3670016);
                            int i25 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                            float f5 = f4;
                            jVar2 = jVar3;
                            z6.b(text, rVar5, j, j4, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF2, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i24, i25, 41896);
                            rVar3 = rVar5;
                            uVar3 = uVar4;
                            kVar3 = kVar4;
                            i16 = i18;
                            r0Var2 = r0Var3;
                            oVar3 = oVar5;
                            f2 = f5;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            i16 = i;
                            f2 = f;
                            r0Var2 = r0Var;
                            rVar3 = rVar2;
                            uVar3 = uVar2;
                            kVar3 = kVar2;
                            oVar3 = oVar2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new u00.n() {
                                @Override
                                public final Object invoke(Object obj2, Object obj3) {
                                    ((Integer) obj3).getClass();
                                    int iK = q.K(i2 | 1);
                                    f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj2, iK, i3);
                                    return g00.b0.a;
                                }
                            };
                        }
                    }
                    i4 |= 100663296;
                    if ((i2 & 805306368) == 0) {
                        i4 |= 268435456;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jVar3.S(i4 & 1, z)) {
                        jVar3.X();
                        if ((i2 & 1) != 0) {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        } else {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        }
                        jVar3.s();
                        if (oVar4 != null) {
                            j3 = oVar4.a;
                        } else {
                            j3 = j2;
                        }
                        jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                        if ((i19 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o oVar6 = oVar4;
                        z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                        objN = jVar3.N();
                        Object obj2 = l1.i.a;
                        if (z3) {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        } else {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        }
                        z0Var = (z0) objN;
                        b2.r rVar6 = rVar4;
                        long jF3 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                        long j5 = ((o) z0Var.getValue()).a;
                        zG = jVar3.g(z0Var) | jVar3.f(jF);
                        objN2 = jVar3.N();
                        if (zG) {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        } else {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        }
                        int i26 = (i19 & 1022) | ((i19 << 3) & 3670016);
                        int i27 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                        float f6 = f4;
                        jVar2 = jVar3;
                        z6.b(text, rVar6, j, j5, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF3, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i26, i27, 41896);
                        rVar3 = rVar6;
                        uVar3 = uVar4;
                        kVar3 = kVar4;
                        i16 = i18;
                        r0Var2 = r0Var3;
                        oVar3 = oVar6;
                        f2 = f6;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        i16 = i;
                        f2 = f;
                        r0Var2 = r0Var;
                        rVar3 = rVar2;
                        uVar3 = uVar2;
                        kVar3 = kVar2;
                        oVar3 = oVar2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj3, Object obj4) {
                                ((Integer) obj4).getClass();
                                int iK = q.K(i2 | 1);
                                f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj3, iK, i3);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i4 |= 12582912;
                i14 = i3 & 256;
                if (i14 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (jVar3.d(f)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 805306368) == 0) {
                        i4 |= 268435456;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jVar3.S(i4 & 1, z)) {
                        jVar3.X();
                        if ((i2 & 1) != 0) {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        } else {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        }
                        jVar3.s();
                        if (oVar4 != null) {
                            j3 = oVar4.a;
                        } else {
                            j3 = j2;
                        }
                        jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                        if ((i19 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o oVar7 = oVar4;
                        z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                        objN = jVar3.N();
                        Object obj3 = l1.i.a;
                        if (z3) {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        } else {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        }
                        z0Var = (z0) objN;
                        b2.r rVar7 = rVar4;
                        long jF4 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                        long j6 = ((o) z0Var.getValue()).a;
                        zG = jVar3.g(z0Var) | jVar3.f(jF);
                        objN2 = jVar3.N();
                        if (zG) {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        } else {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        }
                        int i28 = (i19 & 1022) | ((i19 << 3) & 3670016);
                        int i29 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                        float f7 = f4;
                        jVar2 = jVar3;
                        z6.b(text, rVar7, j, j6, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF4, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i28, i29, 41896);
                        rVar3 = rVar7;
                        uVar3 = uVar4;
                        kVar3 = kVar4;
                        i16 = i18;
                        r0Var2 = r0Var3;
                        oVar3 = oVar7;
                        f2 = f7;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        i16 = i;
                        f2 = f;
                        r0Var2 = r0Var;
                        rVar3 = rVar2;
                        uVar3 = uVar2;
                        kVar3 = kVar2;
                        oVar3 = oVar2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                int iK = q.K(i2 | 1);
                                f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj4, iK, i3);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar8 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj4 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar8 = rVar4;
                    long jF5 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j7 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i210 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i211 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f8 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar8, j, j7, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF5, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i210, i211, 41896);
                    rVar3 = rVar8;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar8;
                    f2 = f8;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj5, Object obj6) {
                            ((Integer) obj6).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj5, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 24576;
            oVar2 = oVar;
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                uVar2 = uVar;
            } else {
                uVar2 = uVar;
                if ((i2 & 196608) == 0) {
                    if (jVar3.g(uVar2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if ((i2 & 1572864) == 0) {
                    if (jVar3.g(kVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (jVar3.e(i)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (jVar3.d(f)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 805306368) == 0) {
                        i4 |= 268435456;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jVar3.S(i4 & 1, z)) {
                        jVar3.X();
                        if ((i2 & 1) != 0) {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        } else {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        }
                        jVar3.s();
                        if (oVar4 != null) {
                            j3 = oVar4.a;
                        } else {
                            j3 = j2;
                        }
                        jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                        if ((i19 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o oVar9 = oVar4;
                        z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                        objN = jVar3.N();
                        Object obj5 = l1.i.a;
                        if (z3) {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        } else {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        }
                        z0Var = (z0) objN;
                        b2.r rVar9 = rVar4;
                        long jF6 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                        long j8 = ((o) z0Var.getValue()).a;
                        zG = jVar3.g(z0Var) | jVar3.f(jF);
                        objN2 = jVar3.N();
                        if (zG) {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        } else {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        }
                        int i212 = (i19 & 1022) | ((i19 << 3) & 3670016);
                        int i213 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                        float f9 = f4;
                        jVar2 = jVar3;
                        z6.b(text, rVar9, j, j8, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF6, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i212, i213, 41896);
                        rVar3 = rVar9;
                        uVar3 = uVar4;
                        kVar3 = kVar4;
                        i16 = i18;
                        r0Var2 = r0Var3;
                        oVar3 = oVar9;
                        f2 = f9;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        i16 = i;
                        f2 = f;
                        r0Var2 = r0Var;
                        rVar3 = rVar2;
                        uVar3 = uVar2;
                        kVar3 = kVar2;
                        oVar3 = oVar2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj6, Object obj7) {
                                ((Integer) obj7).getClass();
                                int iK = q.K(i2 | 1);
                                f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj6, iK, i3);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar10 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj6 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar10 = rVar4;
                    long jF7 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j9 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i214 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i215 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f11 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar10, j, j9, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF7, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i214, i215, 41896);
                    rVar3 = rVar10;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar10;
                    f2 = f11;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj7, Object obj8) {
                            ((Integer) obj8).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj7, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            i14 = i3 & 256;
            if (i14 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (jVar3.d(f)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar11 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj7 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar11 = rVar4;
                    long jF8 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j11 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i216 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i217 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f12 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar11, j, j11, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF8, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i216, i217, 41896);
                    rVar3 = rVar11;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar11;
                    f2 = f12;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj8, Object obj9) {
                            ((Integer) obj9).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj8, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            if ((i2 & 805306368) == 0) {
                i4 |= 268435456;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i4 & 1, z)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                } else {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                }
                jVar3.s();
                if (oVar4 != null) {
                    j3 = oVar4.a;
                } else {
                    j3 = j2;
                }
                jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                if ((i19 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o oVar12 = oVar4;
                z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                objN = jVar3.N();
                Object obj8 = l1.i.a;
                if (z3) {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                } else {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                }
                z0Var = (z0) objN;
                b2.r rVar12 = rVar4;
                long jF9 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                long j12 = ((o) z0Var.getValue()).a;
                zG = jVar3.g(z0Var) | jVar3.f(jF);
                objN2 = jVar3.N();
                if (zG) {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                }
                int i218 = (i19 & 1022) | ((i19 << 3) & 3670016);
                int i219 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                float f13 = f4;
                jVar2 = jVar3;
                z6.b(text, rVar12, j, j12, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF9, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i218, i219, 41896);
                rVar3 = rVar12;
                uVar3 = uVar4;
                kVar3 = kVar4;
                i16 = i18;
                r0Var2 = r0Var3;
                oVar3 = oVar12;
                f2 = f13;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i16 = i;
                f2 = f;
                r0Var2 = r0Var;
                rVar3 = rVar2;
                uVar3 = uVar2;
                kVar3 = kVar2;
                oVar3 = oVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj9, Object obj10) {
                        ((Integer) obj10).getClass();
                        int iK = q.K(i2 | 1);
                        f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj9, iK, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 48;
        rVar2 = rVar;
        if ((i2 & 384) != 0) {
            if (jVar3.f(j)) {
                i22 = 256;
            } else {
                i22 = 128;
            }
            i4 |= i22;
        }
        if ((i2 & 3072) == 0) {
            if (jVar3.f(j2)) {
                i21 = 2048;
            } else {
                i21 = 1024;
            }
            i4 |= i21;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                oVar2 = oVar;
                if (jVar3.g(oVar2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= 196608;
                uVar2 = uVar;
            } else {
                uVar2 = uVar;
                if ((i2 & 196608) == 0) {
                    if (jVar3.g(uVar2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            i9 = i3 & 64;
            if (i9 != 0) {
                i4 |= 1572864;
                kVar2 = kVar;
            } else {
                kVar2 = kVar;
                if ((i2 & 1572864) == 0) {
                    if (jVar3.g(kVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                if ((i2 & 12582912) == 0) {
                    if (jVar3.e(i)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    if ((i2 & 100663296) == 0) {
                        if (jVar3.d(f)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    if ((i2 & 805306368) == 0) {
                        i4 |= 268435456;
                    }
                    if ((i4 & 306783379) != 306783378) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (jVar3.S(i4 & 1, z)) {
                        jVar3.X();
                        if ((i2 & 1) != 0) {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        } else {
                            if (i23 != 0) {
                                rVar2 = b2.o.A;
                            }
                            if (i5 != 0) {
                                oVar2 = null;
                            }
                            if (i7 != 0) {
                                uVar2 = null;
                            }
                            if (i9 != 0) {
                                kVar2 = null;
                            }
                            if (i12 != 0) {
                                i17 = 1;
                            } else {
                                i17 = i;
                            }
                            if (i14 != 0) {
                                f3 = 0.8f;
                            } else {
                                f3 = f;
                            }
                            i18 = i17;
                            kVar4 = kVar2;
                            f4 = f3;
                            r0Var3 = (r0) jVar3.k(z6.a);
                            i19 = (-1879048193) & i4;
                            uVar4 = uVar2;
                            oVar4 = oVar2;
                            rVar4 = rVar2;
                        }
                        jVar3.s();
                        if (oVar4 != null) {
                            j3 = oVar4.a;
                        } else {
                            j3 = j2;
                        }
                        jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                        if ((i19 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        o oVar13 = oVar4;
                        z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                        objN = jVar3.N();
                        Object obj9 = l1.i.a;
                        if (z3) {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        } else {
                            objN = q.z(new o(j2));
                            jVar3.n0(objN);
                        }
                        z0Var = (z0) objN;
                        b2.r rVar13 = rVar4;
                        long jF10 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                        long j13 = ((o) z0Var.getValue()).a;
                        zG = jVar3.g(z0Var) | jVar3.f(jF);
                        objN2 = jVar3.N();
                        if (zG) {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        } else {
                            objN2 = new cl.b(jF, z0Var, 5);
                            jVar3.n0(objN2);
                        }
                        int i2110 = (i19 & 1022) | ((i19 << 3) & 3670016);
                        int i2111 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                        float f14 = f4;
                        jVar2 = jVar3;
                        z6.b(text, rVar13, j, j13, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF10, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i2110, i2111, 41896);
                        rVar3 = rVar13;
                        uVar3 = uVar4;
                        kVar3 = kVar4;
                        i16 = i18;
                        r0Var2 = r0Var3;
                        oVar3 = oVar13;
                        f2 = f14;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        i16 = i;
                        f2 = f;
                        r0Var2 = r0Var;
                        rVar3 = rVar2;
                        uVar3 = uVar2;
                        kVar3 = kVar2;
                        oVar3 = oVar2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new u00.n() {
                            @Override
                            public final Object invoke(Object obj10, Object obj11) {
                                ((Integer) obj11).getClass();
                                int iK = q.K(i2 | 1);
                                f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj10, iK, i3);
                                return g00.b0.a;
                            }
                        };
                    }
                }
                i4 |= 100663296;
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar14 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj10 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar14 = rVar4;
                    long jF11 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j14 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i2112 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i2113 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f15 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar14, j, j14, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF11, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i2112, i2113, 41896);
                    rVar3 = rVar14;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar14;
                    f2 = f15;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj11, Object obj12) {
                            ((Integer) obj12).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj11, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 12582912;
            i14 = i3 & 256;
            if (i14 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (jVar3.d(f)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar15 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj11 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar15 = rVar4;
                    long jF12 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j15 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i2114 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i2115 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f16 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar15, j, j15, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF12, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i2114, i2115, 41896);
                    rVar3 = rVar15;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar15;
                    f2 = f16;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj12, Object obj13) {
                            ((Integer) obj13).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj12, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            if ((i2 & 805306368) == 0) {
                i4 |= 268435456;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i4 & 1, z)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                } else {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                }
                jVar3.s();
                if (oVar4 != null) {
                    j3 = oVar4.a;
                } else {
                    j3 = j2;
                }
                jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                if ((i19 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o oVar16 = oVar4;
                z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                objN = jVar3.N();
                Object obj12 = l1.i.a;
                if (z3) {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                } else {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                }
                z0Var = (z0) objN;
                b2.r rVar16 = rVar4;
                long jF13 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                long j16 = ((o) z0Var.getValue()).a;
                zG = jVar3.g(z0Var) | jVar3.f(jF);
                objN2 = jVar3.N();
                if (zG) {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                }
                int i2116 = (i19 & 1022) | ((i19 << 3) & 3670016);
                int i2117 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                float f17 = f4;
                jVar2 = jVar3;
                z6.b(text, rVar16, j, j16, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF13, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i2116, i2117, 41896);
                rVar3 = rVar16;
                uVar3 = uVar4;
                kVar3 = kVar4;
                i16 = i18;
                r0Var2 = r0Var3;
                oVar3 = oVar16;
                f2 = f17;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i16 = i;
                f2 = f;
                r0Var2 = r0Var;
                rVar3 = rVar2;
                uVar3 = uVar2;
                kVar3 = kVar2;
                oVar3 = oVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj13, Object obj14) {
                        ((Integer) obj14).getClass();
                        int iK = q.K(i2 | 1);
                        f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj13, iK, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 24576;
        oVar2 = oVar;
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= 196608;
            uVar2 = uVar;
        } else {
            uVar2 = uVar;
            if ((i2 & 196608) == 0) {
                if (jVar3.g(uVar2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        i9 = i3 & 64;
        if (i9 != 0) {
            i4 |= 1572864;
            kVar2 = kVar;
        } else {
            kVar2 = kVar;
            if ((i2 & 1572864) == 0) {
                if (jVar3.g(kVar2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            if ((i2 & 12582912) == 0) {
                if (jVar3.e(i)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                if ((i2 & 100663296) == 0) {
                    if (jVar3.d(f)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                if ((i2 & 805306368) == 0) {
                    i4 |= 268435456;
                }
                if ((i4 & 306783379) != 306783378) {
                    z = true;
                } else {
                    z = false;
                }
                if (jVar3.S(i4 & 1, z)) {
                    jVar3.X();
                    if ((i2 & 1) != 0) {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    } else {
                        if (i23 != 0) {
                            rVar2 = b2.o.A;
                        }
                        if (i5 != 0) {
                            oVar2 = null;
                        }
                        if (i7 != 0) {
                            uVar2 = null;
                        }
                        if (i9 != 0) {
                            kVar2 = null;
                        }
                        if (i12 != 0) {
                            i17 = 1;
                        } else {
                            i17 = i;
                        }
                        if (i14 != 0) {
                            f3 = 0.8f;
                        } else {
                            f3 = f;
                        }
                        i18 = i17;
                        kVar4 = kVar2;
                        f4 = f3;
                        r0Var3 = (r0) jVar3.k(z6.a);
                        i19 = (-1879048193) & i4;
                        uVar4 = uVar2;
                        oVar4 = oVar2;
                        rVar4 = rVar2;
                    }
                    jVar3.s();
                    if (oVar4 != null) {
                        j3 = oVar4.a;
                    } else {
                        j3 = j2;
                    }
                    jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                    if ((i19 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o oVar17 = oVar4;
                    z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                    objN = jVar3.N();
                    Object obj13 = l1.i.a;
                    if (z3) {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    } else {
                        objN = q.z(new o(j2));
                        jVar3.n0(objN);
                    }
                    z0Var = (z0) objN;
                    b2.r rVar17 = rVar4;
                    long jF14 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                    long j17 = ((o) z0Var.getValue()).a;
                    zG = jVar3.g(z0Var) | jVar3.f(jF);
                    objN2 = jVar3.N();
                    if (zG) {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    } else {
                        objN2 = new cl.b(jF, z0Var, 5);
                        jVar3.n0(objN2);
                    }
                    int i2118 = (i19 & 1022) | ((i19 << 3) & 3670016);
                    int i2119 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                    float f18 = f4;
                    jVar2 = jVar3;
                    z6.b(text, rVar17, j, j17, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF14, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i2118, i2119, 41896);
                    rVar3 = rVar17;
                    uVar3 = uVar4;
                    kVar3 = kVar4;
                    i16 = i18;
                    r0Var2 = r0Var3;
                    oVar3 = oVar17;
                    f2 = f18;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    i16 = i;
                    f2 = f;
                    r0Var2 = r0Var;
                    rVar3 = rVar2;
                    uVar3 = uVar2;
                    kVar3 = kVar2;
                    oVar3 = oVar2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj14, Object obj15) {
                            ((Integer) obj15).getClass();
                            int iK = q.K(i2 | 1);
                            f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj14, iK, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i4 |= 100663296;
            if ((i2 & 805306368) == 0) {
                i4 |= 268435456;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i4 & 1, z)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                } else {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                }
                jVar3.s();
                if (oVar4 != null) {
                    j3 = oVar4.a;
                } else {
                    j3 = j2;
                }
                jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                if ((i19 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o oVar18 = oVar4;
                z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                objN = jVar3.N();
                Object obj14 = l1.i.a;
                if (z3) {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                } else {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                }
                z0Var = (z0) objN;
                b2.r rVar18 = rVar4;
                long jF15 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                long j18 = ((o) z0Var.getValue()).a;
                zG = jVar3.g(z0Var) | jVar3.f(jF);
                objN2 = jVar3.N();
                if (zG) {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                }
                int i21110 = (i19 & 1022) | ((i19 << 3) & 3670016);
                int i21111 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                float f19 = f4;
                jVar2 = jVar3;
                z6.b(text, rVar18, j, j18, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF15, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i21110, i21111, 41896);
                rVar3 = rVar18;
                uVar3 = uVar4;
                kVar3 = kVar4;
                i16 = i18;
                r0Var2 = r0Var3;
                oVar3 = oVar18;
                f2 = f19;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i16 = i;
                f2 = f;
                r0Var2 = r0Var;
                rVar3 = rVar2;
                uVar3 = uVar2;
                kVar3 = kVar2;
                oVar3 = oVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj15, Object obj16) {
                        ((Integer) obj16).getClass();
                        int iK = q.K(i2 | 1);
                        f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj15, iK, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 12582912;
        i14 = i3 & 256;
        if (i14 != 0) {
            if ((i2 & 100663296) == 0) {
                if (jVar3.d(f)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            if ((i2 & 805306368) == 0) {
                i4 |= 268435456;
            }
            if ((i4 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (jVar3.S(i4 & 1, z)) {
                jVar3.X();
                if ((i2 & 1) != 0) {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                } else {
                    if (i23 != 0) {
                        rVar2 = b2.o.A;
                    }
                    if (i5 != 0) {
                        oVar2 = null;
                    }
                    if (i7 != 0) {
                        uVar2 = null;
                    }
                    if (i9 != 0) {
                        kVar2 = null;
                    }
                    if (i12 != 0) {
                        i17 = 1;
                    } else {
                        i17 = i;
                    }
                    if (i14 != 0) {
                        f3 = 0.8f;
                    } else {
                        f3 = f;
                    }
                    i18 = i17;
                    kVar4 = kVar2;
                    f4 = f3;
                    r0Var3 = (r0) jVar3.k(z6.a);
                    i19 = (-1879048193) & i4;
                    uVar4 = uVar2;
                    oVar4 = oVar2;
                    rVar4 = rVar2;
                }
                jVar3.s();
                if (oVar4 != null) {
                    j3 = oVar4.a;
                } else {
                    j3 = j2;
                }
                jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
                if ((i19 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                o oVar19 = oVar4;
                z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
                objN = jVar3.N();
                Object obj15 = l1.i.a;
                if (z3) {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                } else {
                    objN = q.z(new o(j2));
                    jVar3.n0(objN);
                }
                z0Var = (z0) objN;
                b2.r rVar19 = rVar4;
                long jF16 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
                long j19 = ((o) z0Var.getValue()).a;
                zG = jVar3.g(z0Var) | jVar3.f(jF);
                objN2 = jVar3.N();
                if (zG) {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                } else {
                    objN2 = new cl.b(jF, z0Var, 5);
                    jVar3.n0(objN2);
                }
                int i21112 = (i19 & 1022) | ((i19 << 3) & 3670016);
                int i21113 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
                float f110 = f4;
                jVar2 = jVar3;
                z6.b(text, rVar19, j, j19, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF16, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i21112, i21113, 41896);
                rVar3 = rVar19;
                uVar3 = uVar4;
                kVar3 = kVar4;
                i16 = i18;
                r0Var2 = r0Var3;
                oVar3 = oVar19;
                f2 = f110;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                i16 = i;
                f2 = f;
                r0Var2 = r0Var;
                rVar3 = rVar2;
                uVar3 = uVar2;
                kVar3 = kVar2;
                oVar3 = oVar2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj16, Object obj17) {
                        ((Integer) obj17).getClass();
                        int iK = q.K(i2 | 1);
                        f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj16, iK, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 100663296;
        if ((i2 & 805306368) == 0) {
            i4 |= 268435456;
        }
        if ((i4 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (jVar3.S(i4 & 1, z)) {
            jVar3.X();
            if ((i2 & 1) != 0) {
                if (i23 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i5 != 0) {
                    oVar2 = null;
                }
                if (i7 != 0) {
                    uVar2 = null;
                }
                if (i9 != 0) {
                    kVar2 = null;
                }
                if (i12 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i14 != 0) {
                    f3 = 0.8f;
                } else {
                    f3 = f;
                }
                i18 = i17;
                kVar4 = kVar2;
                f4 = f3;
                r0Var3 = (r0) jVar3.k(z6.a);
                i19 = (-1879048193) & i4;
                uVar4 = uVar2;
                oVar4 = oVar2;
                rVar4 = rVar2;
            } else {
                if (i23 != 0) {
                    rVar2 = b2.o.A;
                }
                if (i5 != 0) {
                    oVar2 = null;
                }
                if (i7 != 0) {
                    uVar2 = null;
                }
                if (i9 != 0) {
                    kVar2 = null;
                }
                if (i12 != 0) {
                    i17 = 1;
                } else {
                    i17 = i;
                }
                if (i14 != 0) {
                    f3 = 0.8f;
                } else {
                    f3 = f;
                }
                i18 = i17;
                kVar4 = kVar2;
                f4 = f3;
                r0Var3 = (r0) jVar3.k(z6.a);
                i19 = (-1879048193) & i4;
                uVar4 = uVar2;
                oVar4 = oVar2;
                rVar4 = rVar2;
            }
            jVar3.s();
            if (oVar4 != null) {
                j3 = oVar4.a;
            } else {
                j3 = j2;
            }
            jF = kh.o.F(ab.a0.x(f4, 0.1f, 1.0f) * o.c(j2), 4294967296L);
            if ((i19 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            o oVar110 = oVar4;
            z3 = z2 | ((((i19 & 7168) ^ 3072) <= 2048 && jVar3.f(j2)) || (i19 & 3072) == 2048);
            objN = jVar3.N();
            Object obj16 = l1.i.a;
            if (z3) {
                objN = q.z(new o(j2));
                jVar3.n0(objN);
            } else {
                objN = q.z(new o(j2));
                jVar3.n0(objN);
            }
            z0Var = (z0) objN;
            b2.r rVar110 = rVar4;
            long jF17 = kh.o.F((o.c(j3) / o.c(j2)) * o.c(((o) z0Var.getValue()).a), 4294967296L);
            long j110 = ((o) z0Var.getValue()).a;
            zG = jVar3.g(z0Var) | jVar3.f(jF);
            objN2 = jVar3.N();
            if (zG) {
                objN2 = new cl.b(jF, z0Var, 5);
                jVar3.n0(objN2);
            } else {
                objN2 = new cl.b(jF, z0Var, 5);
                jVar3.n0(objN2);
            }
            int i21114 = (i19 & 1022) | ((i19 << 3) & 3670016);
            int i21115 = ((i19 >> 18) & 14) | 384 | ((i19 >> 9) & 57344);
            float f111 = f4;
            jVar2 = jVar3;
            z6.b(text, rVar110, j, j110, uVar4, (q3.i) null, 0L, (x3.l) null, kVar4, jF17, 2, false, i18, 0, (u00.k) objN2, r0Var3, jVar2, i21114, i21115, 41896);
            rVar3 = rVar110;
            uVar3 = uVar4;
            kVar3 = kVar4;
            i16 = i18;
            r0Var2 = r0Var3;
            oVar3 = oVar110;
            f2 = f111;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            i16 = i;
            f2 = f;
            r0Var2 = r0Var;
            rVar3 = rVar2;
            uVar3 = uVar2;
            kVar3 = kVar2;
            oVar3 = oVar2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj17, Object obj18) {
                    ((Integer) obj18).getClass();
                    int iK = q.K(i2 | 1);
                    f.a(text, rVar3, j, j2, oVar3, uVar3, kVar3, i16, f2, r0Var2, (j) obj17, iK, i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static boolean a0(com.google.android.gms.internal.measurement.n nVar, com.google.android.gms.internal.measurement.n nVar2) {
        if (!nVar.getClass().equals(nVar2.getClass())) {
            return false;
        }
        if ((nVar instanceof com.google.android.gms.internal.measurement.r) || (nVar instanceof com.google.android.gms.internal.measurement.l)) {
            return true;
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.g) {
            if (Double.isNaN(nVar.zzd().doubleValue()) || Double.isNaN(nVar2.zzd().doubleValue())) {
                return false;
            }
            return nVar.zzd().equals(nVar2.zzd());
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.q) {
            return nVar.zzc().equals(nVar2.zzc());
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.e) {
            return nVar.zze().equals(nVar2.zze());
        }
        return nVar == nVar2;
    }

    public static final void b(ln.c state, l1.j jVar, int i) {
        m.e(state, "state");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1939439039);
        int i2 = (g0Var.g(state) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            w00.a.b(ze.d.u(b6.k.a), 0, 0, v1.d.d(1969925173, new az.j((Context) g0Var.k(b6.g.b), f50.k.n(state.a), state, 10), g0Var), g0Var, 3072, 6);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(state, i, 24);
        }
    }

    public static int b0(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static final y3.k c(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new y3.k(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    public static double c0(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    public static final void d(b2.r rVar, v vVar, n1 n1Var, h0.h hVar, b2.c cVar, t0 t0Var, boolean z, z.h1 h1Var, u00.k kVar, l1.j jVar, int i, int i2) {
        int i3;
        v vVarA;
        n1 n1Var2;
        int i4;
        h0.h hVar2;
        int i5;
        b2.c cVar2;
        int i6;
        t0 t0Var2;
        int i7;
        boolean z2;
        int i8;
        z.h1 h1Var2;
        int i9;
        boolean z3;
        l1.j jVar2;
        b2.r rVar2;
        v vVar2;
        n1 n1Var3;
        h0.h hVar3;
        b2.c cVar3;
        t0 t0Var3;
        boolean z4;
        z.h1 h1Var3;
        l1.r1 r1VarT;
        b2.r rVar3;
        n1 p1Var;
        int i11;
        z.h1 h1VarB;
        b2.r rVar4;
        n1 n1Var4;
        t tVarA;
        boolean zG;
        Object objN;
        int i12;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(53695811);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (jVar3.g(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                vVarA = vVar;
                int i14 = jVar3.g(vVarA) ? 32 : 16;
                i3 |= i14;
            } else {
                vVarA = vVar;
            }
            i3 |= i14;
        } else {
            vVarA = vVar;
        }
        int i15 = i2 & 4;
        if (i15 == 0) {
            if ((i & 384) == 0) {
                n1Var2 = n1Var;
                i3 |= jVar3.g(n1Var2) ? 256 : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    hVar2 = hVar;
                    int i16 = jVar3.g(hVar2) ? 16384 : 8192;
                    i4 |= i16;
                } else {
                    hVar2 = hVar;
                }
                i4 |= i16;
            } else {
                hVar2 = hVar;
            }
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    cVar2 = cVar;
                    if (jVar3.g(cVar2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        t0Var2 = t0Var;
                        int i17 = jVar3.g(t0Var2) ? 1048576 : 524288;
                        i4 |= i17;
                    } else {
                        t0Var2 = t0Var;
                    }
                    i4 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                i7 = i2 & 128;
                if (i7 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i8 = 8388608;
                        } else {
                            i8 = 4194304;
                        }
                        i4 |= i8;
                    }
                    if ((100663296 & i) == 0) {
                        if ((i2 & 256) == 0) {
                            h1Var2 = h1Var;
                            int i18 = jVar3.g(h1Var2) ? 67108864 : 33554432;
                            i4 |= i18;
                        } else {
                            h1Var2 = h1Var;
                        }
                        i4 |= i18;
                    } else {
                        h1Var2 = h1Var;
                    }
                    if ((i & 805306368) == 0) {
                        if (jVar3.i(kVar)) {
                            i12 = 536870912;
                        } else {
                            i12 = 268435456;
                        }
                        i4 |= i12;
                    }
                    i9 = i4;
                    if ((i4 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i9 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0 || jVar3.A()) {
                            if (i13 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i9 &= -113;
                            }
                            if (i15 != 0) {
                                float f = 0;
                                p1Var = new p1(f, f, f, f);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i9 &= -57345;
                                hVar2 = h0.i.c;
                            }
                            if (i5 != 0) {
                                cVar2 = b2.b.M;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG || objN == l1.i.a) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                t0Var2 = (d0.l) objN;
                                i11 = i9 & (-3670017);
                            } else {
                                i11 = i9;
                            }
                            if (i7 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 256) != 0) {
                                i11 &= -234881025;
                                h1VarB = i1.b(jVar3);
                            } else {
                                h1VarB = h1Var2;
                            }
                            rVar4 = rVar3;
                            n1Var4 = p1Var;
                        } else {
                            jVar3.V();
                            i11 = (i2 & 2) != 0 ? i9 & (-113) : i9;
                            if ((i2 & 16) != 0) {
                                i11 &= -57345;
                            }
                            if ((i2 & 64) != 0) {
                                i11 &= -3670017;
                            }
                            if ((i2 & 256) != 0) {
                                i11 &= -234881025;
                            }
                            vVarA = vVarA;
                            hVar2 = hVar2;
                            cVar2 = cVar2;
                            t0Var2 = t0Var2;
                            z2 = z2;
                            h1VarB = h1Var2;
                            rVar4 = rVar;
                            n1Var4 = n1Var2;
                        }
                        jVar3.s();
                        int i19 = i11 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i19) | (3670016 & i19) | (i19 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                        rVar2 = rVar4;
                        vVar2 = vVarA;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var2;
                        z4 = z2;
                        h1Var3 = h1VarB;
                        cVar3 = cVar2;
                        hVar3 = hVar2;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        hVar3 = hVar2;
                        cVar3 = cVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                        h1Var3 = h1Var2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
                    }
                }
                i4 |= 12582912;
                z2 = z;
                if ((100663296 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        h1Var2 = h1Var;
                        if (jVar3.g(h1Var2)) {
                        }
                        i4 |= i18;
                    } else {
                        h1Var2 = h1Var;
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                if ((i & 805306368) == 0) {
                    if (jVar3.i(kVar)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i9 = i4;
                if ((i4 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i9 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f2 = 0;
                            p1Var = new p1(f2, f2, f2, f2);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    } else {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f3 = 0;
                            p1Var = new p1(f3, f3, f3, f3);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    }
                    jVar3.s();
                    int i110 = i11 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i110) | (3670016 & i110) | (i110 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    vVar2 = vVarA;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1VarB;
                    cVar3 = cVar2;
                    hVar3 = hVar2;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    hVar3 = hVar2;
                    cVar3 = cVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1Var2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
                }
            }
            i4 |= 196608;
            cVar2 = cVar;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (jVar3.g(t0Var2)) {
                    }
                    i4 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                i4 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        h1Var2 = h1Var;
                        if (jVar3.g(h1Var2)) {
                        }
                        i4 |= i18;
                    } else {
                        h1Var2 = h1Var;
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                if ((i & 805306368) == 0) {
                    if (jVar3.i(kVar)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i9 = i4;
                if ((i4 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i9 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f4 = 0;
                            p1Var = new p1(f4, f4, f4, f4);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    } else {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f5 = 0;
                            p1Var = new p1(f5, f5, f5, f5);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    }
                    jVar3.s();
                    int i111 = i11 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i111) | (3670016 & i111) | (i111 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    vVar2 = vVarA;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1VarB;
                    cVar3 = cVar2;
                    hVar3 = hVar2;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    hVar3 = hVar2;
                    cVar3 = cVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1Var2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
                }
            }
            i4 |= 12582912;
            z2 = z;
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    h1Var2 = h1Var;
                    if (jVar3.g(h1Var2)) {
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                i4 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            if ((i & 805306368) == 0) {
                if (jVar3.i(kVar)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i9 = i4;
            if ((i4 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i9 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f6 = 0;
                        p1Var = new p1(f6, f6, f6, f6);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                } else {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f7 = 0;
                        p1Var = new p1(f7, f7, f7, f7);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                }
                jVar3.s();
                int i112 = i11 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i112) | (3670016 & i112) | (i112 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                vVar2 = vVarA;
                n1Var3 = n1Var4;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1VarB;
                cVar3 = cVar2;
                hVar3 = hVar2;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                hVar3 = hVar2;
                cVar3 = cVar2;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1Var2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
            }
        }
        i3 |= 384;
        n1Var2 = n1Var;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                hVar2 = hVar;
                if (jVar3.g(hVar2)) {
                }
                i4 |= i16;
            } else {
                hVar2 = hVar;
            }
            i4 |= i16;
        } else {
            hVar2 = hVar;
        }
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                cVar2 = cVar;
                if (jVar3.g(cVar2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (jVar3.g(t0Var2)) {
                    }
                    i4 |= i17;
                } else {
                    t0Var2 = t0Var;
                }
                i4 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i7 = i2 & 128;
            if (i7 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i4 |= i8;
                }
                if ((100663296 & i) == 0) {
                    if ((i2 & 256) == 0) {
                        h1Var2 = h1Var;
                        if (jVar3.g(h1Var2)) {
                        }
                        i4 |= i18;
                    } else {
                        h1Var2 = h1Var;
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                if ((i & 805306368) == 0) {
                    if (jVar3.i(kVar)) {
                        i12 = 536870912;
                    } else {
                        i12 = 268435456;
                    }
                    i4 |= i12;
                }
                i9 = i4;
                if ((i4 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i9 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f8 = 0;
                            p1Var = new p1(f8, f8, f8, f8);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    } else {
                        if (i13 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i9 &= -113;
                        }
                        if (i15 != 0) {
                            float f9 = 0;
                            p1Var = new p1(f9, f9, f9, f9);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i9 &= -57345;
                            hVar2 = h0.i.c;
                        }
                        if (i5 != 0) {
                            cVar2 = b2.b.M;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            t0Var2 = (d0.l) objN;
                            i11 = i9 & (-3670017);
                        } else {
                            i11 = i9;
                        }
                        if (i7 != 0) {
                            z2 = true;
                        }
                        if ((i2 & 256) != 0) {
                            i11 &= -234881025;
                            h1VarB = i1.b(jVar3);
                        } else {
                            h1VarB = h1Var2;
                        }
                        rVar4 = rVar3;
                        n1Var4 = p1Var;
                    }
                    jVar3.s();
                    int i113 = i11 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i113) | (3670016 & i113) | (i113 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                    rVar2 = rVar4;
                    vVar2 = vVarA;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1VarB;
                    cVar3 = cVar2;
                    hVar3 = hVar2;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    hVar3 = hVar2;
                    cVar3 = cVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                    h1Var3 = h1Var2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
                }
            }
            i4 |= 12582912;
            z2 = z;
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    h1Var2 = h1Var;
                    if (jVar3.g(h1Var2)) {
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                i4 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            if ((i & 805306368) == 0) {
                if (jVar3.i(kVar)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i9 = i4;
            if ((i4 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i9 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f11 = 0;
                        p1Var = new p1(f11, f11, f11, f11);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                } else {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f12 = 0;
                        p1Var = new p1(f12, f12, f12, f12);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                }
                jVar3.s();
                int i114 = i11 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i114) | (3670016 & i114) | (i114 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                vVar2 = vVarA;
                n1Var3 = n1Var4;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1VarB;
                cVar3 = cVar2;
                hVar3 = hVar2;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                hVar3 = hVar2;
                cVar3 = cVar2;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1Var2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
            }
        }
        i4 |= 196608;
        cVar2 = cVar;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                t0Var2 = t0Var;
                if (jVar3.g(t0Var2)) {
                }
                i4 |= i17;
            } else {
                t0Var2 = t0Var;
            }
            i4 |= i17;
        } else {
            t0Var2 = t0Var;
        }
        i7 = i2 & 128;
        if (i7 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (jVar3.h(z2)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i4 |= i8;
            }
            if ((100663296 & i) == 0) {
                if ((i2 & 256) == 0) {
                    h1Var2 = h1Var;
                    if (jVar3.g(h1Var2)) {
                    }
                    i4 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                i4 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            if ((i & 805306368) == 0) {
                if (jVar3.i(kVar)) {
                    i12 = 536870912;
                } else {
                    i12 = 268435456;
                }
                i4 |= i12;
            }
            i9 = i4;
            if ((i4 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i9 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f13 = 0;
                        p1Var = new p1(f13, f13, f13, f13);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                } else {
                    if (i13 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        float f14 = 0;
                        p1Var = new p1(f14, f14, f14, f14);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i9 &= -57345;
                        hVar2 = h0.i.c;
                    }
                    if (i5 != 0) {
                        cVar2 = b2.b.M;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        t0Var2 = (d0.l) objN;
                        i11 = i9 & (-3670017);
                    } else {
                        i11 = i9;
                    }
                    if (i7 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 256) != 0) {
                        i11 &= -234881025;
                        h1VarB = i1.b(jVar3);
                    } else {
                        h1VarB = h1Var2;
                    }
                    rVar4 = rVar3;
                    n1Var4 = p1Var;
                }
                jVar3.s();
                int i115 = i11 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i115) | (3670016 & i115) | (i115 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
                rVar2 = rVar4;
                vVar2 = vVarA;
                n1Var3 = n1Var4;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1VarB;
                cVar3 = cVar2;
                hVar3 = hVar2;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                hVar3 = hVar2;
                cVar3 = cVar2;
                t0Var3 = t0Var2;
                z4 = z2;
                h1Var3 = h1Var2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
            }
        }
        i4 |= 12582912;
        z2 = z;
        if ((100663296 & i) == 0) {
            if ((i2 & 256) == 0) {
                h1Var2 = h1Var;
                if (jVar3.g(h1Var2)) {
                }
                i4 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            i4 |= i18;
        } else {
            h1Var2 = h1Var;
        }
        if ((i & 805306368) == 0) {
            if (jVar3.i(kVar)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i4 |= i12;
        }
        i9 = i4;
        if ((i4 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i9 & 1, z3)) {
            jVar3.X();
            if ((i & 1) != 0) {
                if (i13 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 2) != 0) {
                    vVarA = j0.x.a(0, jVar3, 3);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    float f15 = 0;
                    p1Var = new p1(f15, f15, f15, f15);
                } else {
                    p1Var = n1Var2;
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    hVar2 = h0.i.c;
                }
                if (i5 != 0) {
                    cVar2 = b2.b.M;
                }
                if ((i2 & 64) != 0) {
                    tVarA = e2.a(jVar3);
                    zG = jVar3.g(tVarA);
                    objN = jVar3.N();
                    if (zG) {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    } else {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    }
                    t0Var2 = (d0.l) objN;
                    i11 = i9 & (-3670017);
                } else {
                    i11 = i9;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i2 & 256) != 0) {
                    i11 &= -234881025;
                    h1VarB = i1.b(jVar3);
                } else {
                    h1VarB = h1Var2;
                }
                rVar4 = rVar3;
                n1Var4 = p1Var;
            } else {
                if (i13 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 2) != 0) {
                    vVarA = j0.x.a(0, jVar3, 3);
                    i9 &= -113;
                }
                if (i15 != 0) {
                    float f16 = 0;
                    p1Var = new p1(f16, f16, f16, f16);
                } else {
                    p1Var = n1Var2;
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                    hVar2 = h0.i.c;
                }
                if (i5 != 0) {
                    cVar2 = b2.b.M;
                }
                if ((i2 & 64) != 0) {
                    tVarA = e2.a(jVar3);
                    zG = jVar3.g(tVarA);
                    objN = jVar3.N();
                    if (zG) {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    } else {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    }
                    t0Var2 = (d0.l) objN;
                    i11 = i9 & (-3670017);
                } else {
                    i11 = i9;
                }
                if (i7 != 0) {
                    z2 = true;
                }
                if ((i2 & 256) != 0) {
                    i11 &= -234881025;
                    h1VarB = i1.b(jVar3);
                } else {
                    h1VarB = h1Var2;
                }
                rVar4 = rVar3;
                n1Var4 = p1Var;
            }
            jVar3.s();
            int i116 = i11 >> 3;
            jVar2 = jVar3;
            kh.n.h(rVar4, vVarA, n1Var4, true, t0Var2, z2, h1VarB, cVar2, hVar2, (b2.h) null, (h0.e) null, kVar, jVar2, (i11 & 14) | 24576 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (458752 & i116) | (3670016 & i116) | (i116 & 29360128) | ((i11 << 12) & 1879048192), ((i11 >> 12) & 14) | ((i11 >> 18) & 7168), 6400);
            rVar2 = rVar4;
            vVar2 = vVarA;
            n1Var3 = n1Var4;
            t0Var3 = t0Var2;
            z4 = z2;
            h1Var3 = h1VarB;
            cVar3 = cVar2;
            hVar3 = hVar2;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
            vVar2 = vVarA;
            n1Var3 = n1Var2;
            hVar3 = hVar2;
            cVar3 = cVar2;
            t0Var3 = t0Var2;
            z4 = z2;
            h1Var3 = h1Var2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, hVar3, cVar3, t0Var3, z4, h1Var3, kVar, i, i2, 1);
        }
    }

    public static Object d0(com.google.android.gms.internal.measurement.n nVar) {
        if (com.google.android.gms.internal.measurement.n.g.equals(nVar)) {
            return null;
        }
        if (com.google.android.gms.internal.measurement.n.f.equals(nVar)) {
            return "";
        }
        if (nVar instanceof com.google.android.gms.internal.measurement.k) {
            return e0((com.google.android.gms.internal.measurement.k) nVar);
        }
        if (!(nVar instanceof com.google.android.gms.internal.measurement.d)) {
            return !nVar.zzd().isNaN() ? nVar.zzd() : nVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.gms.internal.measurement.d dVar = (com.google.android.gms.internal.measurement.d) nVar;
        int i = 0;
        while (i < dVar.m()) {
            if (i >= dVar.m()) {
                throw new NoSuchElementException(x5.j(i, "Out of bounds index: ", new StringBuilder(String.valueOf(i).length() + 21)));
            }
            int i2 = i + 1;
            Object objD0 = d0(dVar.n(i));
            if (objD0 != null) {
                arrayList.add(objD0);
            }
            i = i2;
        }
        return arrayList;
    }

    public static final void e(b2.r rVar, v vVar, n1 n1Var, h0.e eVar, b2.h hVar, t0 t0Var, boolean z, z.h1 h1Var, u00.k kVar, l1.j jVar, int i, int i2) {
        int i3;
        v vVarA;
        int i4;
        int i5;
        n1 n1Var2;
        int i6;
        int i7;
        h0.e eVar2;
        int i8;
        b2.h hVar2;
        int i9;
        t0 t0Var2;
        int i11;
        int i12;
        boolean z2;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z3;
        l1.j jVar2;
        b2.r rVar2;
        z.h1 h1Var2;
        v vVar2;
        n1 n1Var3;
        h0.e eVar3;
        b2.h hVar3;
        t0 t0Var3;
        boolean z4;
        l1.r1 r1VarT;
        b2.r rVar3;
        n1 p1Var;
        z.h1 h1VarB;
        t0 t0Var4;
        boolean z5;
        b2.r rVar4;
        int i17;
        n1 n1Var4;
        t tVarA;
        boolean zG;
        Object objN;
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(-1884325601);
        int i18 = i2 & 1;
        if (i18 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (jVar3.g(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            vVarA = vVar;
            int i19 = jVar3.g(vVarA) ? 32 : 16;
            i4 = i3 | i19;
            i5 = i2 & 4;
            if (i5 != 0) {
                if ((i & 384) == 0) {
                    n1Var2 = n1Var;
                    if (jVar3.g(n1Var2)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i4 | 3072;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        eVar2 = eVar;
                        int i21 = jVar3.g(eVar2) ? 16384 : 8192;
                        i7 |= i21;
                    } else {
                        eVar2 = eVar;
                    }
                    i7 |= i21;
                } else {
                    eVar2 = eVar;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        hVar2 = hVar;
                        if (jVar3.g(hVar2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i7 |= i9;
                    }
                    if ((i2 & 64) == 0) {
                        t0Var2 = t0Var;
                        int i22 = jVar3.g(t0Var2) ? 1048576 : 524288;
                        i11 = i7 | i22;
                        i12 = i2 & 128;
                        if (i12 != 0) {
                            if ((12582912 & i) == 0) {
                                z2 = z;
                                if (jVar3.h(z2)) {
                                    i13 = 8388608;
                                } else {
                                    i13 = 4194304;
                                }
                                i11 |= i13;
                            }
                            int i23 = i11 | 33554432;
                            if (jVar3.i(kVar)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i15 = i23 | i14;
                            i16 = i15;
                            if ((i15 & 306783379) != 306783378) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (jVar3.S(i16 & 1, z3)) {
                                jVar3.X();
                                if ((i & 1) != 0 || jVar3.A()) {
                                    if (i18 != 0) {
                                        rVar3 = b2.o.A;
                                    } else {
                                        rVar3 = rVar;
                                    }
                                    if ((i2 & 2) != 0) {
                                        vVarA = j0.x.a(0, jVar3, 3);
                                        i16 &= -113;
                                    }
                                    if (i5 != 0) {
                                        float f = 0;
                                        p1Var = new p1(f, f, f, f);
                                    } else {
                                        p1Var = n1Var2;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i16 &= -57345;
                                        eVar2 = h0.i.a;
                                    }
                                    if (i8 != 0) {
                                        hVar2 = b2.b.J;
                                    }
                                    if ((i2 & 64) != 0) {
                                        tVarA = e2.a(jVar3);
                                        zG = jVar3.g(tVarA);
                                        objN = jVar3.N();
                                        if (zG || objN == l1.i.a) {
                                            objN = new d0.l(tVarA);
                                            jVar3.n0(objN);
                                        }
                                        i16 &= -3670017;
                                        t0Var2 = (d0.l) objN;
                                    }
                                    if (i12 != 0) {
                                        z2 = true;
                                    }
                                    int i24 = i16 & (-234881025);
                                    h1VarB = i1.b(jVar3);
                                    t0Var4 = t0Var2;
                                    z5 = z2;
                                    rVar4 = rVar3;
                                    i17 = i24;
                                    n1Var4 = p1Var;
                                } else {
                                    jVar3.V();
                                    int i25 = (i2 & 2) != 0 ? i16 & (-113) : i16;
                                    if ((i2 & 16) != 0) {
                                        i25 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i25 &= -3670017;
                                    }
                                    i17 = i25 & (-234881025);
                                    h1VarB = h1Var;
                                    t0Var4 = t0Var2;
                                    z5 = z2;
                                    rVar4 = rVar;
                                    n1Var4 = n1Var2;
                                }
                                v vVar3 = vVarA;
                                h0.e eVar4 = eVar2;
                                b2.h hVar4 = hVar2;
                                jVar3.s();
                                int i26 = i17 >> 3;
                                jVar2 = jVar3;
                                kh.n.h(rVar4, vVar3, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar4, eVar4, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i26) | (i26 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                                rVar2 = rVar4;
                                vVar2 = vVar3;
                                n1Var3 = n1Var4;
                                t0Var3 = t0Var4;
                                z4 = z5;
                                h1Var2 = h1VarB;
                                hVar3 = hVar4;
                                eVar3 = eVar4;
                            } else {
                                jVar2 = jVar3;
                                jVar2.V();
                                rVar2 = rVar;
                                h1Var2 = h1Var;
                                vVar2 = vVarA;
                                n1Var3 = n1Var2;
                                eVar3 = eVar2;
                                hVar3 = hVar2;
                                t0Var3 = t0Var2;
                                z4 = z2;
                            }
                            r1VarT = jVar2.t();
                            if (r1VarT != null) {
                                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                            }
                        }
                        i11 |= 12582912;
                        z2 = z;
                        int i27 = i11 | 33554432;
                        if (jVar3.i(kVar)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i15 = i27 | i14;
                        i16 = i15;
                        if ((i15 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jVar3.S(i16 & 1, z3)) {
                            jVar3.X();
                            if ((i & 1) != 0) {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f2 = 0;
                                    p1Var = new p1(f2, f2, f2, f2);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i28 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i28;
                                n1Var4 = p1Var;
                            } else {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f3 = 0;
                                    p1Var = new p1(f3, f3, f3, f3);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i29 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i29;
                                n1Var4 = p1Var;
                            }
                            v vVar4 = vVarA;
                            h0.e eVar5 = eVar2;
                            b2.h hVar5 = hVar2;
                            jVar3.s();
                            int i210 = i17 >> 3;
                            jVar2 = jVar3;
                            kh.n.h(rVar4, vVar4, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar5, eVar5, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i210) | (i210 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                            rVar2 = rVar4;
                            vVar2 = vVar4;
                            n1Var3 = n1Var4;
                            t0Var3 = t0Var4;
                            z4 = z5;
                            h1Var2 = h1VarB;
                            hVar3 = hVar5;
                            eVar3 = eVar5;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            rVar2 = rVar;
                            h1Var2 = h1Var;
                            vVar2 = vVarA;
                            n1Var3 = n1Var2;
                            eVar3 = eVar2;
                            hVar3 = hVar2;
                            t0Var3 = t0Var2;
                            z4 = z2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                        }
                    }
                    t0Var2 = t0Var;
                    i11 = i7 | i22;
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i) == 0) {
                            z2 = z;
                            if (jVar3.h(z2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i11 |= i13;
                        }
                        int i211 = i11 | 33554432;
                        if (jVar3.i(kVar)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i15 = i211 | i14;
                        i16 = i15;
                        if ((i15 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jVar3.S(i16 & 1, z3)) {
                            jVar3.X();
                            if ((i & 1) != 0) {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f4 = 0;
                                    p1Var = new p1(f4, f4, f4, f4);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i212 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i212;
                                n1Var4 = p1Var;
                            } else {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f5 = 0;
                                    p1Var = new p1(f5, f5, f5, f5);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i213 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i213;
                                n1Var4 = p1Var;
                            }
                            v vVar5 = vVarA;
                            h0.e eVar6 = eVar2;
                            b2.h hVar6 = hVar2;
                            jVar3.s();
                            int i214 = i17 >> 3;
                            jVar2 = jVar3;
                            kh.n.h(rVar4, vVar5, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar6, eVar6, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i214) | (i214 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                            rVar2 = rVar4;
                            vVar2 = vVar5;
                            n1Var3 = n1Var4;
                            t0Var3 = t0Var4;
                            z4 = z5;
                            h1Var2 = h1VarB;
                            hVar3 = hVar6;
                            eVar3 = eVar6;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            rVar2 = rVar;
                            h1Var2 = h1Var;
                            vVar2 = vVarA;
                            n1Var3 = n1Var2;
                            eVar3 = eVar2;
                            hVar3 = hVar2;
                            t0Var3 = t0Var2;
                            z4 = z2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                        }
                    }
                    i11 |= 12582912;
                    z2 = z;
                    int i215 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i215 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f6 = 0;
                                p1Var = new p1(f6, f6, f6, f6);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i216 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i216;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f7 = 0;
                                p1Var = new p1(f7, f7, f7, f7);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i217 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i217;
                            n1Var4 = p1Var;
                        }
                        v vVar6 = vVarA;
                        h0.e eVar7 = eVar2;
                        b2.h hVar7 = hVar2;
                        jVar3.s();
                        int i218 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar6, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar7, eVar7, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i218) | (i218 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar6;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar7;
                        eVar3 = eVar7;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i7 |= 196608;
                hVar2 = hVar;
                if ((i2 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (jVar3.g(t0Var2)) {
                    }
                    i11 = i7 | i22;
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i) == 0) {
                            z2 = z;
                            if (jVar3.h(z2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i11 |= i13;
                        }
                        int i219 = i11 | 33554432;
                        if (jVar3.i(kVar)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i15 = i219 | i14;
                        i16 = i15;
                        if ((i15 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jVar3.S(i16 & 1, z3)) {
                            jVar3.X();
                            if ((i & 1) != 0) {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f8 = 0;
                                    p1Var = new p1(f8, f8, f8, f8);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i2110 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i2110;
                                n1Var4 = p1Var;
                            } else {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f9 = 0;
                                    p1Var = new p1(f9, f9, f9, f9);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i2111 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i2111;
                                n1Var4 = p1Var;
                            }
                            v vVar7 = vVarA;
                            h0.e eVar8 = eVar2;
                            b2.h hVar8 = hVar2;
                            jVar3.s();
                            int i2112 = i17 >> 3;
                            jVar2 = jVar3;
                            kh.n.h(rVar4, vVar7, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar8, eVar8, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2112) | (i2112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                            rVar2 = rVar4;
                            vVar2 = vVar7;
                            n1Var3 = n1Var4;
                            t0Var3 = t0Var4;
                            z4 = z5;
                            h1Var2 = h1VarB;
                            hVar3 = hVar8;
                            eVar3 = eVar8;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            rVar2 = rVar;
                            h1Var2 = h1Var;
                            vVar2 = vVarA;
                            n1Var3 = n1Var2;
                            eVar3 = eVar2;
                            hVar3 = hVar2;
                            t0Var3 = t0Var2;
                            z4 = z2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                        }
                    }
                    i11 |= 12582912;
                    z2 = z;
                    int i2113 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i2113 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f11 = 0;
                                p1Var = new p1(f11, f11, f11, f11);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2114 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2114;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f12 = 0;
                                p1Var = new p1(f12, f12, f12, f12);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2115 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2115;
                            n1Var4 = p1Var;
                        }
                        v vVar8 = vVarA;
                        h0.e eVar9 = eVar2;
                        b2.h hVar9 = hVar2;
                        jVar3.s();
                        int i2116 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar8, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar9, eVar9, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2116) | (i2116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar8;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar9;
                        eVar3 = eVar9;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                t0Var2 = t0Var;
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i2117 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i2117 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f13 = 0;
                                p1Var = new p1(f13, f13, f13, f13);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2118 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2118;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f14 = 0;
                                p1Var = new p1(f14, f14, f14, f14);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2119 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2119;
                            n1Var4 = p1Var;
                        }
                        v vVar9 = vVarA;
                        h0.e eVar10 = eVar2;
                        b2.h hVar10 = hVar2;
                        jVar3.s();
                        int i21110 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar9, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar10, eVar10, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21110) | (i21110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar9;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar10;
                        eVar3 = eVar10;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i21111 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i21111 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f15 = 0;
                            p1Var = new p1(f15, f15, f15, f15);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21112 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21112;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f16 = 0;
                            p1Var = new p1(f16, f16, f16, f16);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21113 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21113;
                        n1Var4 = p1Var;
                    }
                    v vVar10 = vVarA;
                    h0.e eVar11 = eVar2;
                    b2.h hVar11 = hVar2;
                    jVar3.s();
                    int i21114 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar10, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar11, eVar11, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21114) | (i21114 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar10;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar11;
                    eVar3 = eVar11;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i4 |= 384;
            n1Var2 = n1Var;
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (jVar3.g(eVar2)) {
                    }
                    i7 |= i21;
                } else {
                    eVar2 = eVar;
                }
                i7 |= i21;
            } else {
                eVar2 = eVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    hVar2 = hVar;
                    if (jVar3.g(hVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                if ((i2 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (jVar3.g(t0Var2)) {
                    }
                    i11 = i7 | i22;
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i) == 0) {
                            z2 = z;
                            if (jVar3.h(z2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i11 |= i13;
                        }
                        int i21115 = i11 | 33554432;
                        if (jVar3.i(kVar)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i15 = i21115 | i14;
                        i16 = i15;
                        if ((i15 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jVar3.S(i16 & 1, z3)) {
                            jVar3.X();
                            if ((i & 1) != 0) {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f17 = 0;
                                    p1Var = new p1(f17, f17, f17, f17);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i21116 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i21116;
                                n1Var4 = p1Var;
                            } else {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f18 = 0;
                                    p1Var = new p1(f18, f18, f18, f18);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i21117 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i21117;
                                n1Var4 = p1Var;
                            }
                            v vVar11 = vVarA;
                            h0.e eVar12 = eVar2;
                            b2.h hVar12 = hVar2;
                            jVar3.s();
                            int i21118 = i17 >> 3;
                            jVar2 = jVar3;
                            kh.n.h(rVar4, vVar11, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar12, eVar12, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21118) | (i21118 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                            rVar2 = rVar4;
                            vVar2 = vVar11;
                            n1Var3 = n1Var4;
                            t0Var3 = t0Var4;
                            z4 = z5;
                            h1Var2 = h1VarB;
                            hVar3 = hVar12;
                            eVar3 = eVar12;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            rVar2 = rVar;
                            h1Var2 = h1Var;
                            vVar2 = vVarA;
                            n1Var3 = n1Var2;
                            eVar3 = eVar2;
                            hVar3 = hVar2;
                            t0Var3 = t0Var2;
                            z4 = z2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                        }
                    }
                    i11 |= 12582912;
                    z2 = z;
                    int i21119 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i21119 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f19 = 0;
                                p1Var = new p1(f19, f19, f19, f19);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211110 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211110;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f110 = 0;
                                p1Var = new p1(f110, f110, f110, f110);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111;
                            n1Var4 = p1Var;
                        }
                        v vVar12 = vVarA;
                        h0.e eVar13 = eVar2;
                        b2.h hVar13 = hVar2;
                        jVar3.s();
                        int i211112 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar12, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar13, eVar13, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211112) | (i211112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar12;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar13;
                        eVar3 = eVar13;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                t0Var2 = t0Var;
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i211113 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i211113 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f111 = 0;
                                p1Var = new p1(f111, f111, f111, f111);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211114 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211114;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f112 = 0;
                                p1Var = new p1(f112, f112, f112, f112);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211115 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211115;
                            n1Var4 = p1Var;
                        }
                        v vVar13 = vVarA;
                        h0.e eVar14 = eVar2;
                        b2.h hVar14 = hVar2;
                        jVar3.s();
                        int i211116 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar13, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar14, eVar14, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211116) | (i211116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar13;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar14;
                        eVar3 = eVar14;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i211117 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i211117 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f113 = 0;
                            p1Var = new p1(f113, f113, f113, f113);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211118 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211118;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f114 = 0;
                            p1Var = new p1(f114, f114, f114, f114);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211119 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211119;
                        n1Var4 = p1Var;
                    }
                    v vVar14 = vVarA;
                    h0.e eVar15 = eVar2;
                    b2.h hVar15 = hVar2;
                    jVar3.s();
                    int i2111110 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar14, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar15, eVar15, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111110) | (i2111110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar14;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar15;
                    eVar3 = eVar15;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i7 |= 196608;
            hVar2 = hVar;
            if ((i2 & 64) == 0) {
                t0Var2 = t0Var;
                if (jVar3.g(t0Var2)) {
                }
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i2111111 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i2111111 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f115 = 0;
                                p1Var = new p1(f115, f115, f115, f115);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2111112 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2111112;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f116 = 0;
                                p1Var = new p1(f116, f116, f116, f116);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2111113 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2111113;
                            n1Var4 = p1Var;
                        }
                        v vVar15 = vVarA;
                        h0.e eVar16 = eVar2;
                        b2.h hVar16 = hVar2;
                        jVar3.s();
                        int i2111114 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar15, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar16, eVar16, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111114) | (i2111114 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar15;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar16;
                        eVar3 = eVar16;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i2111115 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i2111115 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f117 = 0;
                            p1Var = new p1(f117, f117, f117, f117);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111116 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111116;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f118 = 0;
                            p1Var = new p1(f118, f118, f118, f118);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111117 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111117;
                        n1Var4 = p1Var;
                    }
                    v vVar16 = vVarA;
                    h0.e eVar17 = eVar2;
                    b2.h hVar17 = hVar2;
                    jVar3.s();
                    int i2111118 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar16, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar17, eVar17, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111118) | (i2111118 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar16;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar17;
                    eVar3 = eVar17;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            t0Var2 = t0Var;
            i11 = i7 | i22;
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i11 |= i13;
                }
                int i2111119 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i2111119 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f119 = 0;
                            p1Var = new p1(f119, f119, f119, f119);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21111110 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21111110;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f1110 = 0;
                            p1Var = new p1(f1110, f1110, f1110, f1110);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21111111 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21111111;
                        n1Var4 = p1Var;
                    }
                    v vVar17 = vVarA;
                    h0.e eVar18 = eVar2;
                    b2.h hVar18 = hVar2;
                    jVar3.s();
                    int i21111112 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar17, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar18, eVar18, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111112) | (i21111112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar17;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar18;
                    eVar3 = eVar18;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i11 |= 12582912;
            z2 = z;
            int i21111113 = i11 | 33554432;
            if (jVar3.i(kVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i15 = i21111113 | i14;
            i16 = i15;
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f1111 = 0;
                        p1Var = new p1(f1111, f1111, f1111, f1111);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111114 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111114;
                    n1Var4 = p1Var;
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f1112 = 0;
                        p1Var = new p1(f1112, f1112, f1112, f1112);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111115 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111115;
                    n1Var4 = p1Var;
                }
                v vVar18 = vVarA;
                h0.e eVar19 = eVar2;
                b2.h hVar19 = hVar2;
                jVar3.s();
                int i21111116 = i17 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVar18, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar19, eVar19, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111116) | (i21111116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                rVar2 = rVar4;
                vVar2 = vVar18;
                n1Var3 = n1Var4;
                t0Var3 = t0Var4;
                z4 = z5;
                h1Var2 = h1VarB;
                hVar3 = hVar19;
                eVar3 = eVar19;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                h1Var2 = h1Var;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                eVar3 = eVar2;
                hVar3 = hVar2;
                t0Var3 = t0Var2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
            }
        }
        vVarA = vVar;
        i4 = i3 | i19;
        i5 = i2 & 4;
        if (i5 != 0) {
            if ((i & 384) == 0) {
                n1Var2 = n1Var;
                if (jVar3.g(n1Var2)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i4 | 3072;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    eVar2 = eVar;
                    if (jVar3.g(eVar2)) {
                    }
                    i7 |= i21;
                } else {
                    eVar2 = eVar;
                }
                i7 |= i21;
            } else {
                eVar2 = eVar;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    hVar2 = hVar;
                    if (jVar3.g(hVar2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i7 |= i9;
                }
                if ((i2 & 64) == 0) {
                    t0Var2 = t0Var;
                    if (jVar3.g(t0Var2)) {
                    }
                    i11 = i7 | i22;
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i) == 0) {
                            z2 = z;
                            if (jVar3.h(z2)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i11 |= i13;
                        }
                        int i21111117 = i11 | 33554432;
                        if (jVar3.i(kVar)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i15 = i21111117 | i14;
                        i16 = i15;
                        if ((i15 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jVar3.S(i16 & 1, z3)) {
                            jVar3.X();
                            if ((i & 1) != 0) {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f1113 = 0;
                                    p1Var = new p1(f1113, f1113, f1113, f1113);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i21111118 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i21111118;
                                n1Var4 = p1Var;
                            } else {
                                if (i18 != 0) {
                                    rVar3 = b2.o.A;
                                } else {
                                    rVar3 = rVar;
                                }
                                if ((i2 & 2) != 0) {
                                    vVarA = j0.x.a(0, jVar3, 3);
                                    i16 &= -113;
                                }
                                if (i5 != 0) {
                                    float f1114 = 0;
                                    p1Var = new p1(f1114, f1114, f1114, f1114);
                                } else {
                                    p1Var = n1Var2;
                                }
                                if ((i2 & 16) != 0) {
                                    i16 &= -57345;
                                    eVar2 = h0.i.a;
                                }
                                if (i8 != 0) {
                                    hVar2 = b2.b.J;
                                }
                                if ((i2 & 64) != 0) {
                                    tVarA = e2.a(jVar3);
                                    zG = jVar3.g(tVarA);
                                    objN = jVar3.N();
                                    if (zG) {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    } else {
                                        objN = new d0.l(tVarA);
                                        jVar3.n0(objN);
                                    }
                                    i16 &= -3670017;
                                    t0Var2 = (d0.l) objN;
                                }
                                if (i12 != 0) {
                                    z2 = true;
                                }
                                int i21111119 = i16 & (-234881025);
                                h1VarB = i1.b(jVar3);
                                t0Var4 = t0Var2;
                                z5 = z2;
                                rVar4 = rVar3;
                                i17 = i21111119;
                                n1Var4 = p1Var;
                            }
                            v vVar19 = vVarA;
                            h0.e eVar110 = eVar2;
                            b2.h hVar110 = hVar2;
                            jVar3.s();
                            int i211111110 = i17 >> 3;
                            jVar2 = jVar3;
                            kh.n.h(rVar4, vVar19, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar110, eVar110, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111110) | (i211111110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                            rVar2 = rVar4;
                            vVar2 = vVar19;
                            n1Var3 = n1Var4;
                            t0Var3 = t0Var4;
                            z4 = z5;
                            h1Var2 = h1VarB;
                            hVar3 = hVar110;
                            eVar3 = eVar110;
                        } else {
                            jVar2 = jVar3;
                            jVar2.V();
                            rVar2 = rVar;
                            h1Var2 = h1Var;
                            vVar2 = vVarA;
                            n1Var3 = n1Var2;
                            eVar3 = eVar2;
                            hVar3 = hVar2;
                            t0Var3 = t0Var2;
                            z4 = z2;
                        }
                        r1VarT = jVar2.t();
                        if (r1VarT != null) {
                            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                        }
                    }
                    i11 |= 12582912;
                    z2 = z;
                    int i211111111 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i211111111 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f1115 = 0;
                                p1Var = new p1(f1115, f1115, f1115, f1115);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111112 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111112;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f1116 = 0;
                                p1Var = new p1(f1116, f1116, f1116, f1116);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111113 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111113;
                            n1Var4 = p1Var;
                        }
                        v vVar110 = vVarA;
                        h0.e eVar111 = eVar2;
                        b2.h hVar111 = hVar2;
                        jVar3.s();
                        int i211111114 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar110, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar111, eVar111, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111114) | (i211111114 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar110;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar111;
                        eVar3 = eVar111;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                t0Var2 = t0Var;
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i211111115 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i211111115 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f1117 = 0;
                                p1Var = new p1(f1117, f1117, f1117, f1117);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111116 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111116;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f1118 = 0;
                                p1Var = new p1(f1118, f1118, f1118, f1118);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111117 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111117;
                            n1Var4 = p1Var;
                        }
                        v vVar111 = vVarA;
                        h0.e eVar112 = eVar2;
                        b2.h hVar112 = hVar2;
                        jVar3.s();
                        int i211111118 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar111, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar112, eVar112, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111118) | (i211111118 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar111;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar112;
                        eVar3 = eVar112;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i211111119 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i211111119 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f1119 = 0;
                            p1Var = new p1(f1119, f1119, f1119, f1119);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111110 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111110;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f11110 = 0;
                            p1Var = new p1(f11110, f11110, f11110, f11110);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111111 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111111;
                        n1Var4 = p1Var;
                    }
                    v vVar112 = vVarA;
                    h0.e eVar113 = eVar2;
                    b2.h hVar113 = hVar2;
                    jVar3.s();
                    int i2111111112 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar112, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar113, eVar113, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111111112) | (i2111111112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar112;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar113;
                    eVar3 = eVar113;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i7 |= 196608;
            hVar2 = hVar;
            if ((i2 & 64) == 0) {
                t0Var2 = t0Var;
                if (jVar3.g(t0Var2)) {
                }
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i2111111113 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i2111111113 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f11111 = 0;
                                p1Var = new p1(f11111, f11111, f11111, f11111);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2111111114 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2111111114;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f11112 = 0;
                                p1Var = new p1(f11112, f11112, f11112, f11112);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i2111111115 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i2111111115;
                            n1Var4 = p1Var;
                        }
                        v vVar113 = vVarA;
                        h0.e eVar114 = eVar2;
                        b2.h hVar114 = hVar2;
                        jVar3.s();
                        int i2111111116 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar113, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar114, eVar114, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111111116) | (i2111111116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar113;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar114;
                        eVar3 = eVar114;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i2111111117 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i2111111117 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f11113 = 0;
                            p1Var = new p1(f11113, f11113, f11113, f11113);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111118 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111118;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f11114 = 0;
                            p1Var = new p1(f11114, f11114, f11114, f11114);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111119 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111119;
                        n1Var4 = p1Var;
                    }
                    v vVar114 = vVarA;
                    h0.e eVar115 = eVar2;
                    b2.h hVar115 = hVar2;
                    jVar3.s();
                    int i21111111110 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar114, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar115, eVar115, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111111110) | (i21111111110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar114;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar115;
                    eVar3 = eVar115;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            t0Var2 = t0Var;
            i11 = i7 | i22;
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i11 |= i13;
                }
                int i21111111111 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i21111111111 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f11115 = 0;
                            p1Var = new p1(f11115, f11115, f11115, f11115);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21111111112 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21111111112;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f11116 = 0;
                            p1Var = new p1(f11116, f11116, f11116, f11116);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i21111111113 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i21111111113;
                        n1Var4 = p1Var;
                    }
                    v vVar115 = vVarA;
                    h0.e eVar116 = eVar2;
                    b2.h hVar116 = hVar2;
                    jVar3.s();
                    int i21111111114 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar115, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar116, eVar116, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111111114) | (i21111111114 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar115;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar116;
                    eVar3 = eVar116;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i11 |= 12582912;
            z2 = z;
            int i21111111115 = i11 | 33554432;
            if (jVar3.i(kVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i15 = i21111111115 | i14;
            i16 = i15;
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f11117 = 0;
                        p1Var = new p1(f11117, f11117, f11117, f11117);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111116 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111116;
                    n1Var4 = p1Var;
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f11118 = 0;
                        p1Var = new p1(f11118, f11118, f11118, f11118);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111117 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111117;
                    n1Var4 = p1Var;
                }
                v vVar116 = vVarA;
                h0.e eVar117 = eVar2;
                b2.h hVar117 = hVar2;
                jVar3.s();
                int i21111111118 = i17 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVar116, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar117, eVar117, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111111118) | (i21111111118 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                rVar2 = rVar4;
                vVar2 = vVar116;
                n1Var3 = n1Var4;
                t0Var3 = t0Var4;
                z4 = z5;
                h1Var2 = h1VarB;
                hVar3 = hVar117;
                eVar3 = eVar117;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                h1Var2 = h1Var;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                eVar3 = eVar2;
                hVar3 = hVar2;
                t0Var3 = t0Var2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
            }
        }
        i4 |= 384;
        n1Var2 = n1Var;
        i7 = i4 | 3072;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                eVar2 = eVar;
                if (jVar3.g(eVar2)) {
                }
                i7 |= i21;
            } else {
                eVar2 = eVar;
            }
            i7 |= i21;
        } else {
            eVar2 = eVar;
        }
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                hVar2 = hVar;
                if (jVar3.g(hVar2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i7 |= i9;
            }
            if ((i2 & 64) == 0) {
                t0Var2 = t0Var;
                if (jVar3.g(t0Var2)) {
                }
                i11 = i7 | i22;
                i12 = i2 & 128;
                if (i12 != 0) {
                    if ((12582912 & i) == 0) {
                        z2 = z;
                        if (jVar3.h(z2)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i11 |= i13;
                    }
                    int i21111111119 = i11 | 33554432;
                    if (jVar3.i(kVar)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i15 = i21111111119 | i14;
                    i16 = i15;
                    if ((i15 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (jVar3.S(i16 & 1, z3)) {
                        jVar3.X();
                        if ((i & 1) != 0) {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f11119 = 0;
                                p1Var = new p1(f11119, f11119, f11119, f11119);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111111110 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111111110;
                            n1Var4 = p1Var;
                        } else {
                            if (i18 != 0) {
                                rVar3 = b2.o.A;
                            } else {
                                rVar3 = rVar;
                            }
                            if ((i2 & 2) != 0) {
                                vVarA = j0.x.a(0, jVar3, 3);
                                i16 &= -113;
                            }
                            if (i5 != 0) {
                                float f111110 = 0;
                                p1Var = new p1(f111110, f111110, f111110, f111110);
                            } else {
                                p1Var = n1Var2;
                            }
                            if ((i2 & 16) != 0) {
                                i16 &= -57345;
                                eVar2 = h0.i.a;
                            }
                            if (i8 != 0) {
                                hVar2 = b2.b.J;
                            }
                            if ((i2 & 64) != 0) {
                                tVarA = e2.a(jVar3);
                                zG = jVar3.g(tVarA);
                                objN = jVar3.N();
                                if (zG) {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                } else {
                                    objN = new d0.l(tVarA);
                                    jVar3.n0(objN);
                                }
                                i16 &= -3670017;
                                t0Var2 = (d0.l) objN;
                            }
                            if (i12 != 0) {
                                z2 = true;
                            }
                            int i211111111111 = i16 & (-234881025);
                            h1VarB = i1.b(jVar3);
                            t0Var4 = t0Var2;
                            z5 = z2;
                            rVar4 = rVar3;
                            i17 = i211111111111;
                            n1Var4 = p1Var;
                        }
                        v vVar117 = vVarA;
                        h0.e eVar118 = eVar2;
                        b2.h hVar118 = hVar2;
                        jVar3.s();
                        int i211111111112 = i17 >> 3;
                        jVar2 = jVar3;
                        kh.n.h(rVar4, vVar117, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar118, eVar118, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111111112) | (i211111111112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                        rVar2 = rVar4;
                        vVar2 = vVar117;
                        n1Var3 = n1Var4;
                        t0Var3 = t0Var4;
                        z4 = z5;
                        h1Var2 = h1VarB;
                        hVar3 = hVar118;
                        eVar3 = eVar118;
                    } else {
                        jVar2 = jVar3;
                        jVar2.V();
                        rVar2 = rVar;
                        h1Var2 = h1Var;
                        vVar2 = vVarA;
                        n1Var3 = n1Var2;
                        eVar3 = eVar2;
                        hVar3 = hVar2;
                        t0Var3 = t0Var2;
                        z4 = z2;
                    }
                    r1VarT = jVar2.t();
                    if (r1VarT != null) {
                        r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                    }
                }
                i11 |= 12582912;
                z2 = z;
                int i211111111113 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i211111111113 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111111 = 0;
                            p1Var = new p1(f111111, f111111, f111111, f111111);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211111111114 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211111111114;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111112 = 0;
                            p1Var = new p1(f111112, f111112, f111112, f111112);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211111111115 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211111111115;
                        n1Var4 = p1Var;
                    }
                    v vVar118 = vVarA;
                    h0.e eVar119 = eVar2;
                    b2.h hVar119 = hVar2;
                    jVar3.s();
                    int i211111111116 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar118, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar119, eVar119, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111111116) | (i211111111116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar118;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar119;
                    eVar3 = eVar119;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            t0Var2 = t0Var;
            i11 = i7 | i22;
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i11 |= i13;
                }
                int i211111111117 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i211111111117 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111113 = 0;
                            p1Var = new p1(f111113, f111113, f111113, f111113);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211111111118 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211111111118;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111114 = 0;
                            p1Var = new p1(f111114, f111114, f111114, f111114);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i211111111119 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i211111111119;
                        n1Var4 = p1Var;
                    }
                    v vVar119 = vVarA;
                    h0.e eVar1110 = eVar2;
                    b2.h hVar1110 = hVar2;
                    jVar3.s();
                    int i2111111111110 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar119, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1110, eVar1110, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111111111110) | (i2111111111110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar119;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar1110;
                    eVar3 = eVar1110;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i11 |= 12582912;
            z2 = z;
            int i2111111111111 = i11 | 33554432;
            if (jVar3.i(kVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i15 = i2111111111111 | i14;
            i16 = i15;
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f111115 = 0;
                        p1Var = new p1(f111115, f111115, f111115, f111115);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i2111111111112 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i2111111111112;
                    n1Var4 = p1Var;
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f111116 = 0;
                        p1Var = new p1(f111116, f111116, f111116, f111116);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i2111111111113 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i2111111111113;
                    n1Var4 = p1Var;
                }
                v vVar1110 = vVarA;
                h0.e eVar1111 = eVar2;
                b2.h hVar1111 = hVar2;
                jVar3.s();
                int i2111111111114 = i17 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVar1110, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1111, eVar1111, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111111111114) | (i2111111111114 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                rVar2 = rVar4;
                vVar2 = vVar1110;
                n1Var3 = n1Var4;
                t0Var3 = t0Var4;
                z4 = z5;
                h1Var2 = h1VarB;
                hVar3 = hVar1111;
                eVar3 = eVar1111;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                h1Var2 = h1Var;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                eVar3 = eVar2;
                hVar3 = hVar2;
                t0Var3 = t0Var2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
            }
        }
        i7 |= 196608;
        hVar2 = hVar;
        if ((i2 & 64) == 0) {
            t0Var2 = t0Var;
            if (jVar3.g(t0Var2)) {
            }
            i11 = i7 | i22;
            i12 = i2 & 128;
            if (i12 != 0) {
                if ((12582912 & i) == 0) {
                    z2 = z;
                    if (jVar3.h(z2)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i11 |= i13;
                }
                int i2111111111115 = i11 | 33554432;
                if (jVar3.i(kVar)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i15 = i2111111111115 | i14;
                i16 = i15;
                if ((i15 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (jVar3.S(i16 & 1, z3)) {
                    jVar3.X();
                    if ((i & 1) != 0) {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111117 = 0;
                            p1Var = new p1(f111117, f111117, f111117, f111117);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111111116 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111111116;
                        n1Var4 = p1Var;
                    } else {
                        if (i18 != 0) {
                            rVar3 = b2.o.A;
                        } else {
                            rVar3 = rVar;
                        }
                        if ((i2 & 2) != 0) {
                            vVarA = j0.x.a(0, jVar3, 3);
                            i16 &= -113;
                        }
                        if (i5 != 0) {
                            float f111118 = 0;
                            p1Var = new p1(f111118, f111118, f111118, f111118);
                        } else {
                            p1Var = n1Var2;
                        }
                        if ((i2 & 16) != 0) {
                            i16 &= -57345;
                            eVar2 = h0.i.a;
                        }
                        if (i8 != 0) {
                            hVar2 = b2.b.J;
                        }
                        if ((i2 & 64) != 0) {
                            tVarA = e2.a(jVar3);
                            zG = jVar3.g(tVarA);
                            objN = jVar3.N();
                            if (zG) {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            } else {
                                objN = new d0.l(tVarA);
                                jVar3.n0(objN);
                            }
                            i16 &= -3670017;
                            t0Var2 = (d0.l) objN;
                        }
                        if (i12 != 0) {
                            z2 = true;
                        }
                        int i2111111111117 = i16 & (-234881025);
                        h1VarB = i1.b(jVar3);
                        t0Var4 = t0Var2;
                        z5 = z2;
                        rVar4 = rVar3;
                        i17 = i2111111111117;
                        n1Var4 = p1Var;
                    }
                    v vVar1111 = vVarA;
                    h0.e eVar1112 = eVar2;
                    b2.h hVar1112 = hVar2;
                    jVar3.s();
                    int i2111111111118 = i17 >> 3;
                    jVar2 = jVar3;
                    kh.n.h(rVar4, vVar1111, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1112, eVar1112, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i2111111111118) | (i2111111111118 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                    rVar2 = rVar4;
                    vVar2 = vVar1111;
                    n1Var3 = n1Var4;
                    t0Var3 = t0Var4;
                    z4 = z5;
                    h1Var2 = h1VarB;
                    hVar3 = hVar1112;
                    eVar3 = eVar1112;
                } else {
                    jVar2 = jVar3;
                    jVar2.V();
                    rVar2 = rVar;
                    h1Var2 = h1Var;
                    vVar2 = vVarA;
                    n1Var3 = n1Var2;
                    eVar3 = eVar2;
                    hVar3 = hVar2;
                    t0Var3 = t0Var2;
                    z4 = z2;
                }
                r1VarT = jVar2.t();
                if (r1VarT != null) {
                    r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
                }
            }
            i11 |= 12582912;
            z2 = z;
            int i2111111111119 = i11 | 33554432;
            if (jVar3.i(kVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i15 = i2111111111119 | i14;
            i16 = i15;
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f111119 = 0;
                        p1Var = new p1(f111119, f111119, f111119, f111119);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111111110 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111111110;
                    n1Var4 = p1Var;
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f1111110 = 0;
                        p1Var = new p1(f1111110, f1111110, f1111110, f1111110);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111111111 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111111111;
                    n1Var4 = p1Var;
                }
                v vVar1112 = vVarA;
                h0.e eVar1113 = eVar2;
                b2.h hVar1113 = hVar2;
                jVar3.s();
                int i21111111111112 = i17 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVar1112, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1113, eVar1113, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111111111112) | (i21111111111112 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                rVar2 = rVar4;
                vVar2 = vVar1112;
                n1Var3 = n1Var4;
                t0Var3 = t0Var4;
                z4 = z5;
                h1Var2 = h1VarB;
                hVar3 = hVar1113;
                eVar3 = eVar1113;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                h1Var2 = h1Var;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                eVar3 = eVar2;
                hVar3 = hVar2;
                t0Var3 = t0Var2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
            }
        }
        t0Var2 = t0Var;
        i11 = i7 | i22;
        i12 = i2 & 128;
        if (i12 != 0) {
            if ((12582912 & i) == 0) {
                z2 = z;
                if (jVar3.h(z2)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i11 |= i13;
            }
            int i21111111111113 = i11 | 33554432;
            if (jVar3.i(kVar)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i15 = i21111111111113 | i14;
            i16 = i15;
            if ((i15 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (jVar3.S(i16 & 1, z3)) {
                jVar3.X();
                if ((i & 1) != 0) {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f1111111 = 0;
                        p1Var = new p1(f1111111, f1111111, f1111111, f1111111);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111111114 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111111114;
                    n1Var4 = p1Var;
                } else {
                    if (i18 != 0) {
                        rVar3 = b2.o.A;
                    } else {
                        rVar3 = rVar;
                    }
                    if ((i2 & 2) != 0) {
                        vVarA = j0.x.a(0, jVar3, 3);
                        i16 &= -113;
                    }
                    if (i5 != 0) {
                        float f1111112 = 0;
                        p1Var = new p1(f1111112, f1111112, f1111112, f1111112);
                    } else {
                        p1Var = n1Var2;
                    }
                    if ((i2 & 16) != 0) {
                        i16 &= -57345;
                        eVar2 = h0.i.a;
                    }
                    if (i8 != 0) {
                        hVar2 = b2.b.J;
                    }
                    if ((i2 & 64) != 0) {
                        tVarA = e2.a(jVar3);
                        zG = jVar3.g(tVarA);
                        objN = jVar3.N();
                        if (zG) {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        } else {
                            objN = new d0.l(tVarA);
                            jVar3.n0(objN);
                        }
                        i16 &= -3670017;
                        t0Var2 = (d0.l) objN;
                    }
                    if (i12 != 0) {
                        z2 = true;
                    }
                    int i21111111111115 = i16 & (-234881025);
                    h1VarB = i1.b(jVar3);
                    t0Var4 = t0Var2;
                    z5 = z2;
                    rVar4 = rVar3;
                    i17 = i21111111111115;
                    n1Var4 = p1Var;
                }
                v vVar1113 = vVarA;
                h0.e eVar1114 = eVar2;
                b2.h hVar1114 = hVar2;
                jVar3.s();
                int i21111111111116 = i17 >> 3;
                jVar2 = jVar3;
                kh.n.h(rVar4, vVar1113, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1114, eVar1114, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i21111111111116) | (i21111111111116 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
                rVar2 = rVar4;
                vVar2 = vVar1113;
                n1Var3 = n1Var4;
                t0Var3 = t0Var4;
                z4 = z5;
                h1Var2 = h1VarB;
                hVar3 = hVar1114;
                eVar3 = eVar1114;
            } else {
                jVar2 = jVar3;
                jVar2.V();
                rVar2 = rVar;
                h1Var2 = h1Var;
                vVar2 = vVarA;
                n1Var3 = n1Var2;
                eVar3 = eVar2;
                hVar3 = hVar2;
                t0Var3 = t0Var2;
                z4 = z2;
            }
            r1VarT = jVar2.t();
            if (r1VarT != null) {
                r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
            }
        }
        i11 |= 12582912;
        z2 = z;
        int i21111111111117 = i11 | 33554432;
        if (jVar3.i(kVar)) {
            i14 = 536870912;
        } else {
            i14 = 268435456;
        }
        i15 = i21111111111117 | i14;
        i16 = i15;
        if ((i15 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jVar3.S(i16 & 1, z3)) {
            jVar3.X();
            if ((i & 1) != 0) {
                if (i18 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 2) != 0) {
                    vVarA = j0.x.a(0, jVar3, 3);
                    i16 &= -113;
                }
                if (i5 != 0) {
                    float f1111113 = 0;
                    p1Var = new p1(f1111113, f1111113, f1111113, f1111113);
                } else {
                    p1Var = n1Var2;
                }
                if ((i2 & 16) != 0) {
                    i16 &= -57345;
                    eVar2 = h0.i.a;
                }
                if (i8 != 0) {
                    hVar2 = b2.b.J;
                }
                if ((i2 & 64) != 0) {
                    tVarA = e2.a(jVar3);
                    zG = jVar3.g(tVarA);
                    objN = jVar3.N();
                    if (zG) {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    } else {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    }
                    i16 &= -3670017;
                    t0Var2 = (d0.l) objN;
                }
                if (i12 != 0) {
                    z2 = true;
                }
                int i21111111111118 = i16 & (-234881025);
                h1VarB = i1.b(jVar3);
                t0Var4 = t0Var2;
                z5 = z2;
                rVar4 = rVar3;
                i17 = i21111111111118;
                n1Var4 = p1Var;
            } else {
                if (i18 != 0) {
                    rVar3 = b2.o.A;
                } else {
                    rVar3 = rVar;
                }
                if ((i2 & 2) != 0) {
                    vVarA = j0.x.a(0, jVar3, 3);
                    i16 &= -113;
                }
                if (i5 != 0) {
                    float f1111114 = 0;
                    p1Var = new p1(f1111114, f1111114, f1111114, f1111114);
                } else {
                    p1Var = n1Var2;
                }
                if ((i2 & 16) != 0) {
                    i16 &= -57345;
                    eVar2 = h0.i.a;
                }
                if (i8 != 0) {
                    hVar2 = b2.b.J;
                }
                if ((i2 & 64) != 0) {
                    tVarA = e2.a(jVar3);
                    zG = jVar3.g(tVarA);
                    objN = jVar3.N();
                    if (zG) {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    } else {
                        objN = new d0.l(tVarA);
                        jVar3.n0(objN);
                    }
                    i16 &= -3670017;
                    t0Var2 = (d0.l) objN;
                }
                if (i12 != 0) {
                    z2 = true;
                }
                int i21111111111119 = i16 & (-234881025);
                h1VarB = i1.b(jVar3);
                t0Var4 = t0Var2;
                z5 = z2;
                rVar4 = rVar3;
                i17 = i21111111111119;
                n1Var4 = p1Var;
            }
            v vVar1114 = vVarA;
            h0.e eVar1115 = eVar2;
            b2.h hVar1115 = hVar2;
            jVar3.s();
            int i211111111111110 = i17 >> 3;
            jVar2 = jVar3;
            kh.n.h(rVar4, vVar1114, n1Var4, false, t0Var4, z5, h1VarB, (b2.c) null, (h0.h) null, hVar1115, eVar1115, kVar, jVar2, (i17 & 14) | 24576 | (i17 & 112) | (i17 & 896) | 3072 | (458752 & i211111111111110) | (i211111111111110 & 3670016), ((i17 >> 12) & 112) | ((i17 >> 6) & 896) | ((i17 >> 18) & 7168), 1792);
            rVar2 = rVar4;
            vVar2 = vVar1114;
            n1Var3 = n1Var4;
            t0Var3 = t0Var4;
            z4 = z5;
            h1Var2 = h1VarB;
            hVar3 = hVar1115;
            eVar3 = eVar1115;
        } else {
            jVar2 = jVar3;
            jVar2.V();
            rVar2 = rVar;
            h1Var2 = h1Var;
            vVar2 = vVarA;
            n1Var3 = n1Var2;
            eVar3 = eVar2;
            hVar3 = hVar2;
            t0Var3 = t0Var2;
            z4 = z2;
        }
        r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new g1.v(rVar2, vVar2, n1Var3, eVar3, hVar3, t0Var3, z4, h1Var2, kVar, i, i2, 2);
        }
    }

    public static HashMap e0(com.google.android.gms.internal.measurement.k kVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(kVar.A.keySet())) {
            Object objD0 = d0(kVar.a(str));
            if (objD0 != null) {
                map.put(str, objD0);
            }
        }
        return map;
    }

    public static final void f(pu.e refusal, u00.a onDismiss, l1.j jVar, int i) {
        g00.k kVar;
        m.e(refusal, "refusal");
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(606607855);
        int i2 = (g0Var.e(refusal.ordinal()) ? 4 : 2) | i | (g0Var.i(onDismiss) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = refusal.ordinal();
            if (iOrdinal == 0) {
                kVar = new g00.k(2131887084, 2131887083);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = new g00.k(2131887082, 2131887081);
            }
            wr.k.H(z3.U(g0Var, ((Number) kVar.A).intValue()), z3.U(g0Var, ((Number) kVar.B).intValue()), onDismiss, null, 0L, null, null, v1.d.d(-1193036914, new eu.d(6, onDismiss), g0Var), g0Var, ((i2 << 3) & 896) | 12582912, 120);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new al.i(refusal, onDismiss, i, 12);
        }
    }

    public static void f0(oj.q qVar) {
        int iB0 = b0(qVar.e0("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iB0 > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        qVar.c0("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(iB0)));
    }

    public static final void g(final PlayerItem playerItem, final long j, final long j2, l1.j jVar, final int i) {
        String strT;
        boolean z;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1638243287);
        int i2 = i | (g0Var.g(playerItem) ? 4 : 2);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            y3.m mVar = (y3.m) g0Var.k(o1.n);
            String str = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(playerItem.getSurahNumber())}, 1));
            int iOrdinal = mVar.ordinal();
            if (iOrdinal == 0) {
                g0Var.c0(-1901187921);
                strT = z3.T(2131886525, new Object[]{Integer.valueOf(playerItem.getSurahNumber()), playerItem.getSurahTranscription()}, g0Var);
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw oi.k.r(g0Var, -1901189475, false);
                }
                g0Var.c0(-1901182010);
                strT = z3.T(2131886526, new Object[]{str, playerItem.getSurahTranscription()}, g0Var);
                g0Var.r(false);
            }
            int iOrdinal2 = mVar.ordinal();
            if (iOrdinal2 == 0) {
                g0Var.c0(1193130910);
                v1 v1VarA = t1.a(h0.i.a, b2.b.K, g0Var, 48);
                int iHashCode = Long.hashCode(g0Var.T);
                m1 m1VarM = g0Var.m();
                b2.o oVar = b2.o.A;
                b2.r rVarC = b2.a.c(oVar, g0Var);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(v1VarA, g0Var, b3.h.f);
                q.I(m1VarM, g0Var, b3.h.e);
                q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                q.E(g0Var, b3.h.h);
                q.I(rVarC, g0Var, b3.h.d);
                long j3 = dl.a.k;
                z6.b(strT, (b2.r) null, j3, j, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 0, false, 0, 0, (u00.k) null, new r0(0L, 0L, (q3.u) null, (q3.i) null, 0L, 0L, 0, 1, 0L, (m3.z) null, 16711679), g0Var, 24576, 48, 129002);
                g0Var = g0Var;
                h0.c.h(z1.q(oVar, 4), g0Var);
                if (r30.k.L0(playerItem.getSurahOriginalName())) {
                    z = false;
                    g0Var.c0(-2039535121);
                    g0Var.r(false);
                } else {
                    g0Var.c0(-2039862822);
                    z6.b(a1.b.p("(", playerItem.getSurahOriginalName(), ")"), (b2.r) null, j3, kh.o.z(11), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(11), 0, false, 0, 0, (u00.k) null, new r0(0L, 0L, (q3.u) null, (q3.i) null, 0L, 0L, 0, 1, 0L, (m3.z) null, 16711679), g0Var, 24576, 48, 129002);
                    g0Var = g0Var;
                    z = false;
                    g0Var.r(false);
                }
                g0Var.r(true);
                g0Var.r(z);
            } else {
                if (iOrdinal2 != 1) {
                    throw oi.k.r(g0Var, -1901176000, false);
                }
                g0Var.c0(1193982573);
                z6.b(strT, (b2.r) null, dl.a.k, j, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 0, false, 0, 0, (u00.k) null, new r0(0L, 0L, (q3.u) null, (q3.i) null, 0L, 0L, 0, 1, 0L, (m3.z) null, 16711679), g0Var, 24576, 48, 129002);
                g0Var = g0Var;
                g0Var.r(false);
            }
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(j, j2, i) {
                public final long B;
                public final long C;

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = q.K(433);
                    f.g(this.A, this.B, this.C, (j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void h(jk.a backdrop, u00.a onMiniPlayerClicked, l1.j jVar, int i) {
        m.e(backdrop, "backdrop");
        m.e(onMiniPlayerClicked, "onMiniPlayerClicked");
        g0 g0Var = (g0) jVar;
        g0Var.e0(330635452);
        int i2 = (g0Var.i(backdrop) ? 4 : 2) | i | (g0Var.i(onMiniPlayerClicked) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 147) != 146)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g((Object) null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = oi.k.f(a0.a, uu.a.class, aVarA, (b60.a) null, g0Var);
            }
            uu.a aVar = (uu.a) objN;
            uu.w wVar = (uu.w) aVar;
            ze.d.d(onMiniPlayerClicked, backdrop, h0.c.E(z1.d(b2.o.A, 1.0f), 16, 0.0f, 2), false, 0L, dl.a.P, 0.0f, (i2.t0) null, v1.d.d(-2004373641, new az.j(aVar, q(wVar.C, g0Var, 0), q(wVar.G, g0Var, 0), 13), g0Var), g0Var, ((i2 >> 3) & 14) | 806879232 | ((i2 << 3) & 112), 408);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new lv.a(backdrop, onMiniPlayerClicked, i, 0);
        }
    }

    public static final void i(PlayerItem playerItem, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1179614302);
        int i2 = (g0Var.g(playerItem) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            float f = 8;
            v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            q.I(rVarC, g0Var, fVar4);
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = playerItem.getReciterPhotoUrl();
            hVar.c(200);
            mb.j jVarI = mb.l.i(hVar.a(), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(f, 0, dl.a.s, f2.h.c(z1.m(oVar, 36), p0.f.a(f)), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            h0.v vVarA = h0.u.a(h0.i.c, b2.b.M, g0Var, 0);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(oVar, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(vVarA, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC2, g0Var, fVar4);
            g(playerItem, kh.o.z(12), kh.o.z(10), g0Var, (i2 & 14) | 432);
            z6.b(playerItem.getReciterName(), (b2.r) null, dl.a.o, kh.o.z(11), (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(6), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
            g0Var = g0Var;
            g0Var.r(true);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new lv.b(playerItem, i, 0);
        }
    }

    public static final void j(u00.a onConfirm, u00.a onDismiss, l1.j jVar, int i) {
        m.e(onConfirm, "onConfirm");
        m.e(onDismiss, "onDismiss");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-2043835927);
        int i2 = (g0Var.i(onConfirm) ? 4 : 2) | i | (g0Var.i(onDismiss) ? 32 : 16);
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            wr.k.H(z3.U(g0Var, 2131887174), z3.U(g0Var, 2131887173), onDismiss, null, 0L, null, null, v1.d.d(-854602168, new eu.f(onConfirm, onDismiss, 1), g0Var), g0Var, ((i2 << 3) & 896) | 12582912, 120);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new eu.f(onConfirm, onDismiss, i, 2);
        }
    }

    public static final void k(String str, b2.r rVar, g1.r rVar2, u00.a aVar, l1.j jVar, int i) {
        b2.r rVar3;
        b2.r rVar4;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-636380941);
        int i2 = i | (g0Var.g(str) ? 4 : 2) | 48 | (g0Var.g(rVar2) ? 256 : 128) | (g0Var.i(aVar) ? 2048 : 1024);
        if (g0Var.S(i2 & 1, (i2 & 1171) != 1170)) {
            g0Var.X();
            int i3 = i & 1;
            b2.r rVar5 = b2.o.A;
            if (i3 == 0 || g0Var.A()) {
                rVar4 = rVar5;
            } else {
                g0Var.V();
                rVar4 = rVar;
            }
            g0Var.s();
            b2.r rVarD = z1.d(rVar4, 1.0f);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, b3.h.f);
            q.I(m1VarM, g0Var, b3.h.e);
            q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            q.E(g0Var, b3.h.h);
            q.I(rVarC, g0Var, b3.h.d);
            g1.x5.a(aVar, z1.e(z1.d(rVar5, 0.9f), 50), false, p0.f.a(100), rVar2, (g1.u) null, (n1) null, (f0.i) null, v1.d.d(-385999171, new fv.a(str, 0), g0Var), g0Var, ((i2 >> 9) & 14) | 805306416 | ((i2 << 6) & 57344), 484);
            g0Var.r(true);
            rVar3 = rVar4;
        } else {
            g0Var.V();
            rVar3 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new dz.k((Object) str, rVar3, (Object) rVar2, (g00.e) aVar, i, 4);
        }
    }

    public static final ExecutorService l(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new za.c(z));
        m.d(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        return executorServiceNewFixedThreadPool;
    }

    public static final void m(a50.a aVar, a50.c cVar, String str) {
        a50.e.i.fine(cVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.a);
    }

    public static final List n(Class cls) {
        m.e(cls, "<this>");
        return q30.l.u0(new q30.g(q30.l.n0(cls, d10.b.H), d10.b.I, q30.o.A));
    }

    public static final z0 o(d40.i iVar, Object obj, androidx.lifecycle.q qVar, l1.j jVar, int i) {
        androidx.lifecycle.p pVar = androidx.lifecycle.p.D;
        j jVar2 = j.A;
        Object[] objArr = {iVar, qVar, pVar, jVar2};
        g0 g0Var = (g0) jVar;
        boolean zI = ((((i & 7168) ^ 3072) > 2048 && g0Var.e(pVar.ordinal())) || (i & 3072) == 2048) | g0Var.i(qVar) | g0Var.i(jVar2) | g0Var.i(iVar);
        Object objN = g0Var.N();
        Object obj2 = l1.i.a;
        if (zI || objN == obj2) {
            objN = new pz.k(qVar, iVar, (c) null);
            g0Var.n0(objN);
        }
        u00.n nVar = (u00.n) objN;
        Object objN2 = g0Var.N();
        if (objN2 == obj2) {
            objN2 = q.z(obj);
            g0Var.n0(objN2);
        }
        z0 z0Var = (z0) objN2;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
        boolean zI2 = g0Var.i(nVar);
        Object objN3 = g0Var.N();
        if (zI2 || objN3 == obj2) {
            objN3 = new m2(nVar, z0Var, (c) null, 3);
            g0Var.n0(objN3);
        }
        q.j(objArrCopyOf, (u00.n) objN3, jVar);
        return z0Var;
    }

    public static final z0 p(d40.i iVar, Object obj, l1.j jVar, int i) {
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) ((g0) jVar).k(r6.d.a);
        androidx.lifecycle.p pVar = androidx.lifecycle.p.A;
        return o(iVar, obj, wVar.getLifecycle(), jVar, i & 112);
    }

    public static final z0 q(d40.n1 n1Var, l1.j jVar, int i) {
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) ((g0) jVar).k(r6.d.a);
        androidx.lifecycle.p pVar = androidx.lifecycle.p.A;
        int i2 = i & 14;
        int i3 = i << 3;
        return o(n1Var, n1Var.getValue(), wVar.getLifecycle(), jVar, (i3 & 57344) | i2 | (i3 & 7168));
    }

    public static final x2 r(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? x2.A : x2.B;
    }

    public static i2.e s(i2.e eVar, BlurMaskFilter blurMaskFilter, int i) {
        long j = i2.t.b;
        int i2 = (i & 8) != 0 ? 0 : 1;
        eVar.e(j);
        eVar.d(3);
        eVar.m(i2);
        i2.b0.o(eVar).setMaskFilter(blurMaskFilter);
        return eVar;
    }

    public static long t(int i, x2 x2Var) {
        int i2 = b1.a.a[x2Var.ordinal()];
        int i3 = -1;
        if (i2 != -1) {
            i3 = 1;
            if (i2 == 1) {
                i3 = 0;
            } else if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (((long) i) << 32) | (((long) i3) & 4294967295L);
    }

    public static o10.c u(Class klass) throws InvocationTargetException {
        d50.g gVar;
        h20.c cVar;
        h20.a aVar;
        m.e(klass, "klass");
        h20.e eVar = new h20.e();
        eVar.A = null;
        eVar.B = null;
        eVar.C = 0;
        eVar.D = null;
        eVar.E = null;
        eVar.F = null;
        eVar.G = null;
        eVar.H = null;
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        m.d(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            m.b(annotation);
            Class clsD = D(z(annotation));
            n20.b bVarA = p10.d.a(clsD);
            n20.c cVarA = bVarA.a();
            if (cVarA.equals(x10.v.a)) {
                cVar = new h20.c(eVar, 0);
            } else if (cVarA.equals(x10.v.o)) {
                cVar = new gi.c(eVar, 1);
            } else if (h20.e.I || eVar.G != null || (aVar = (h20.a) h20.e.J.get(bVarA)) == null) {
                cVar = null;
            } else {
                eVar.G = aVar;
                cVar = new h20.c(eVar, 1);
            }
            if (cVar != null) {
                f50.c.S(cVar, annotation, clsD);
            }
        }
        k20.f fVar = k20.f.g;
        if (eVar.G == null || eVar.A == null) {
            gVar = null;
        } else {
            k20.f fVar2 = new k20.f(eVar.A, (eVar.C & 8) != 0);
            if (fVar2.b(fVar)) {
                h20.a aVar2 = eVar.G;
                if ((aVar2 == h20.a.CLASS || aVar2 == h20.a.FILE_FACADE || aVar2 == h20.a.MULTIFILE_CLASS_PART) && eVar.D == null) {
                    gVar = null;
                }
            } else {
                eVar.F = eVar.D;
                eVar.D = null;
            }
            String[] strArr = eVar.H;
            if (strArr != null) {
                m20.a.a(strArr);
            }
            gVar = new d50.g(eVar.G, fVar2, eVar.D, eVar.F, eVar.E, eVar.B, eVar.C);
        }
        if (gVar == null) {
            return null;
        }
        return new o10.c(klass, gVar);
    }

    public static GetCredentialException v(String type, String str) {
        Exception excH;
        m.e(type, "type");
        try {
            GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new GetPublicKeyCredentialDomException(new g5.a(26), (String) null);
            if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excH = f50.k.h(new g5.a(0), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excH = f50.k.h(new g5.a(1), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_DATA_CLONE_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excH = f50.k.h(new g5.a(3), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excH = f50.k.h(new g5.a(4), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_INVALID_CHARACTER_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excH = f50.k.h(new g5.a(10), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_NAMESPACE_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excH = f50.k.h(new g5.a(12), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excH = f50.k.h(new g5.a(14), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_NOT_FOUND_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excH = f50.k.h(new g5.a(16), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excH = f50.k.h(new g5.a(17), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_OPERATION_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_OPT_OUT_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_READ_ONLY_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excH = f50.k.h(new g5.a(22), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_SYNTAX_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excH = f50.k.h(new g5.a(24), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR"), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excH = f50.k.h(new g5.a(26), str, getPublicKeyCredentialDomException);
            } else if (type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_VERSION_ERROR"), str, getPublicKeyCredentialDomException);
            } else {
                if (!type.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new FrameworkClassParsingException();
                }
                excH = f50.k.h(new g5.a("androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR"), str, getPublicKeyCredentialDomException);
            }
            return (GetCredentialException) excH;
        } catch (FrameworkClassParsingException unused) {
            return new GetCredentialCustomException(str, type);
        }
    }

    public static r w(Type type, a10.e eVar, List list, boolean z) {
        return new r(eVar, list, z, x.A, null, false, false, false, null, new d10.d(2, type));
    }

    public static final String x(long j) {
        String strK;
        if (j <= -999500000) {
            strK = a1.b.k((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strK = a1.b.k((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strK = a1.b.k((j - ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500) {
            strK = a1.b.k((j + ((long) 500)) / ((long) 1000), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strK = a1.b.k((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strK = a1.b.k((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strK}, 1));
    }

    public static final a10.d z(Annotation annotation) {
        m.e(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        m.d(clsAnnotationType, "annotationType(...)");
        return I(clsAnnotationType);
    }

    public abstract Constructor B(Class cls);

    public abstract String[] K(Class cls);

    public abstract boolean L(Class cls);

    public abstract Method y(Class cls, Field field);
}
