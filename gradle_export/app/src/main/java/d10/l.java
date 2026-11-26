package d10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

public final class l extends j implements kotlin.jvm.internal.h, q0, v1 {
    public static final a10.w[] N = {kotlin.jvm.internal.a0.a.h(new kotlin.jvm.internal.s(l.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
    public final l1 H;
    public final String I;
    public final Object J;
    public final x1 K;
    public final Object L;
    public final Object M;

    public l(l1 container, j10.u descriptor) {
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        String strB = ((m10.m) descriptor).getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        this(container, strB, c2.c(descriptor).X(), descriptor, kotlin.jvm.internal.c.NO_RECEIVER);
    }

    public l(l1 l1Var, String str, String str2, j10.u uVar, Object obj) {
        this.H = l1Var;
        this.I = str2;
        this.J = obj;
        this.K = va.a.Q(uVar, new a20.a(this, str, 13));
        g00.i iVar = g00.i.B;
        this.L = rd.a.I(iVar, new k(this, 0));
        this.M = rd.a.I(iVar, new k(this, 1));
    }

    public final e10.q A(Method method, boolean z) {
        if (!ri.t1.D(this)) {
            return new e10.v(6, 2, method, false);
        }
        m10.u uVarT = w().T();
        Object objZ = this.J;
        if (uVarT != null) {
            e30.w type = uVarT.getType();
            int i = q20.f.a;
            j10.h hVarG = type.m0().g();
            if (hVarG != null ? q20.f.b(hVarG) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
                Class cls = (Class) h00.n.E0(parameterTypes);
                if (cls == null || !cls.isInterface()) {
                    objZ = kh.n.z(objZ, w());
                }
            } else {
                objZ = kh.n.z(objZ, w());
            }
        } else {
            objZ = kh.n.z(objZ, w());
        }
        return new e10.t(method, z, objZ);
    }

    @Override
    public final j10.u w() {
        a10.w wVar = N[0];
        Object objInvoke = this.K.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
        return (j10.u) objInvoke;
    }

    @Override
    public final e10.g a() {
        return (e10.g) this.L.getValue();
    }

    @Override
    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        return call(b2.o.A, obj, bool, obj2, obj3, obj4, obj5, num);
    }

    @Override
    public final e10.g e() {
        return (e10.g) this.M.getValue();
    }

    public final boolean equals(Object obj) {
        v1 v1Var;
        n20.c cVar = i2.a;
        if (obj instanceof v1) {
            v1Var = (v1) obj;
        } else if (obj instanceof kotlin.jvm.internal.i) {
            a10.c cVarCompute = ((kotlin.jvm.internal.i) obj).compute();
            if (cVarCompute instanceof v1) {
                v1Var = (v1) cVarCompute;
            } else {
                v1Var = null;
            }
        } else {
            v1Var = null;
        }
        if (v1Var == null) {
            return false;
        }
        l lVar = (l) v1Var;
        return kotlin.jvm.internal.m.a(this.H, lVar.H) && getName().equals(lVar.getName()) && kotlin.jvm.internal.m.a(this.I, lVar.I) && kotlin.jvm.internal.m.a(this.J, lVar.J);
    }

    @Override
    public final int getArity() {
        return k00.f.A(a());
    }

    @Override
    public final String getName() {
        String strB = ((m10.m) w()).getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        return strB;
    }

    @Override
    public final l1 h() {
        return this.H;
    }

    public final int hashCode() {
        return this.I.hashCode() + ((getName().hashCode() + (this.H.hashCode() * 31)) * 31);
    }

    @Override
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override
    public final Object invoke(Object obj) {
        return call(obj);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override
    public final boolean isExternal() {
        return w().isExternal();
    }

    @Override
    public final boolean isInfix() {
        return w().isInfix();
    }

    @Override
    public final boolean isInline() {
        return w().isInline();
    }

    @Override
    public final boolean isOperator() {
        return w().isOperator();
    }

    @Override
    public final boolean isSuspend() {
        return w().isSuspend();
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override
    public final Object q() {
        return this.J;
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final String toString() {
        return b2.d(this);
    }

    public final e10.w z(Constructor constructor, j10.u uVar, boolean z) {
        Object obj = this.J;
        if (!z) {
            m10.i iVar = uVar instanceof m10.i ? (m10.i) uVar : null;
            if (iVar != null) {
                m10.i iVar2 = iVar;
                if (!j10.p.e(iVar2.getVisibility())) {
                    j10.e eVarX = iVar.x();
                    kotlin.jvm.internal.m.d(eVarX, "getConstructedClass(...)");
                    if (!q20.f.e(eVarX) && !q20.d.o(iVar.x())) {
                        List listO = iVar2.O();
                        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                        if (!listO.isEmpty()) {
                            Iterator it = listO.iterator();
                            while (it.hasNext()) {
                                e30.w type = ((m10.r0) it.next()).getType();
                                kotlin.jvm.internal.m.d(type, "getType(...)");
                                if (qd.s0.p0(type)) {
                                    if (ri.t1.D(this)) {
                                        return new e10.h(constructor, kh.n.z(obj, w()), 0);
                                    }
                                    Class declaringClass = constructor.getDeclaringClass();
                                    kotlin.jvm.internal.m.d(declaringClass, "getDeclaringClass(...)");
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
                                    return new e10.i(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : h00.n.x0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (ri.t1.D(this)) {
            return new e10.h(constructor, kh.n.z(obj, w()), 1);
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        kotlin.jvm.internal.m.d(declaringClass2, "getDeclaringClass(...)");
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        Class<?> cls = (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4;
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes2, "getGenericParameterTypes(...)");
        return new e10.i(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }
}
