package d10;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.concurrent.ConcurrentHashMap;

public final class b implements u00.k {
    public static final b B = new b(0);
    public static final b C = new b(1);
    public static final b D = new b(2);
    public static final b E = new b(3);
    public static final b F = new b(4);
    public static final b G = new b(5);
    public static final b H = new b(6);
    public static final b I = new b(7);
    public static final b J = new b(8);
    public static final b K = new b(9);
    public static final b L = new b(10);
    public static final b M = new b(11);
    public static final b N = new b(12);
    public static final b O = new b(13);
    public static final b P = new b(14);
    public static final b Q = new b(15);
    public static final b R = new b(16);
    public static final b S = new b(17);
    public static final b T = new b(18);
    public static final b U = new b(19);
    public static final b V = new b(20);
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = this.A;
        h00.x xVar = h00.x.A;
        switch (i) {
            case 0:
                Class it = (Class) obj;
                a1.u0 u0Var = c.a;
                kotlin.jvm.internal.m.e(it, "it");
                return new j1(it);
            case 1:
                Class it2 = (Class) obj;
                a1.u0 u0Var2 = c.a;
                kotlin.jvm.internal.m.e(it2, "it");
                return new p1(it2);
            case 2:
                Class it3 = (Class) obj;
                a1.u0 u0Var3 = c.a;
                kotlin.jvm.internal.m.e(it3, "it");
                return qd.s0.a0(c.a(it3), xVar, false, xVar);
            case 3:
                Class it4 = (Class) obj;
                a1.u0 u0Var4 = c.a;
                kotlin.jvm.internal.m.e(it4, "it");
                return qd.s0.a0(c.a(it4), xVar, true, xVar);
            case 4:
                a1.u0 u0Var5 = c.a;
                kotlin.jvm.internal.m.e((Class) obj, "it");
                return new ConcurrentHashMap();
            case 5:
                TypeVariable it5 = (TypeVariable) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                Type[] bounds = it5.getBounds();
                kotlin.jvm.internal.m.d(bounds, "getBounds(...)");
                Object objD0 = h00.n.D0(bounds);
                if (objD0 instanceof TypeVariable) {
                    return (TypeVariable) objD0;
                }
                return null;
            case 6:
                Class it6 = (Class) obj;
                kotlin.jvm.internal.m.e(it6, "it");
                if (Modifier.isStatic(it6.getModifiers())) {
                    return null;
                }
                return it6.getDeclaringClass();
            case 7:
                Class it7 = (Class) obj;
                kotlin.jvm.internal.m.e(it7, "it");
                TypeVariable[] typeParameters = it7.getTypeParameters();
                kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
                return h00.n.l0(typeParameters);
            case 8:
                ParameterizedType it8 = (ParameterizedType) obj;
                kotlin.jvm.internal.m.e(it8, "it");
                Type ownerType = it8.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 9:
                ParameterizedType it9 = (ParameterizedType) obj;
                kotlin.jvm.internal.m.e(it9, "it");
                Type[] actualTypeArguments = it9.getActualTypeArguments();
                kotlin.jvm.internal.m.d(actualTypeArguments, "getActualTypeArguments(...)");
                return h00.n.V0(actualTypeArguments);
            case 10:
                s10.b1 it10 = (s10.b1) obj;
                kotlin.jvm.internal.m.e(it10, "it");
                return it10.e;
            case 11:
                s10.b1 it11 = (s10.b1) obj;
                kotlin.jvm.internal.m.e(it11, "it");
                return it11.c;
            case 12:
                Class<?> returnType = ((Method) obj).getReturnType();
                kotlin.jvm.internal.m.d(returnType, "getReturnType(...)");
                return p10.d.b(returnType);
            case 13:
                Class cls = (Class) obj;
                kotlin.jvm.internal.m.b(cls);
                return p10.d.b(cls);
            case 14:
                j10.l0 descriptor = (j10.l0) obj;
                r30.j jVar = l1.A;
                kotlin.jvm.internal.m.e(descriptor, "descriptor");
                return p20.h.e.w(descriptor) + " | " + c2.b(descriptor).W();
            case 15:
                j10.u descriptor2 = (j10.u) obj;
                r30.j jVar2 = l1.A;
                kotlin.jvm.internal.m.e(descriptor2, "descriptor");
                return p20.h.e.w(descriptor2) + " | " + c2.c(descriptor2).X();
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                w1 parameter = (w1) obj;
                kotlin.jvm.internal.m.e(parameter, "parameter");
                StringBuilder sb = new StringBuilder();
                w wVar = (w) parameter;
                String name = wVar.getName();
                if (name == null) {
                    name = "_";
                }
                sb.append(name);
                sb.append(": ");
                sb.append(wVar.g());
                return sb.toString();
            case 17:
                w1 it12 = (w1) obj;
                kotlin.jvm.internal.m.e(it12, "it");
                return b2.f(((w) it12).g(), false);
            case 18:
                w1 it13 = (w1) obj;
                kotlin.jvm.internal.m.e(it13, "it");
                return b2.f(((w) it13).g(), false);
            case 19:
                n20.e it14 = (n20.e) obj;
                kotlin.jvm.internal.m.e(it14, "it");
                return va.a.d0(it14);
            default:
                Class cls2 = (Class) obj;
                kotlin.jvm.internal.m.b(cls2);
                return p10.d.b(cls2);
        }
    }
}
