package d10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.reflect.full.IllegalCallableAccessException;

public abstract class j implements s1, u1 {
    public final x1 A = va.a.Q((j10.c) null, new g(this, 0));
    public final x1 B = va.a.Q((j10.c) null, new g(this, 2));
    public final x1 C = va.a.Q((j10.c) null, new g(this, 3));
    public final x1 D = va.a.Q((j10.c) null, new g(this, 4));
    public final x1 E = va.a.Q((j10.c) null, new g(this, 5));
    public final x1 F = va.a.Q((j10.c) null, new g(this, 6));
    public final Object G = rd.a.I(g00.i.B, new g(this, 7));

    public static Object v(p30.i iVar) {
        Class clsD = k00.f.D(f50.k.q(iVar));
        if (clsD.isArray()) {
            Object objNewInstance = Array.newInstance(clsD.getComponentType(), 0);
            kotlin.jvm.internal.m.d(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new a40.b0("Cannot instantiate the default empty array of type " + clsD.getSimpleName() + ", because it is not an array type");
    }

    @Override
    public final Object call(Object... args) throws IllegalCallableAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        try {
            return a().call(args);
        } catch (IllegalAccessException e) {
            throw new IllegalCallableAccessException(e);
        }
    }

    @Override
    public final Object callBy(Map args) throws IllegalCallableAccessException {
        boolean z;
        Object objV;
        kotlin.jvm.internal.m.e(args, "args");
        boolean z2 = false;
        if (y()) {
            List<w1> parameters = getParameters();
            ArrayList arrayList = new ArrayList(h00.r.q0(parameters, 10));
            for (w1 w1Var : parameters) {
                if (args.containsKey(w1Var)) {
                    objV = args.get(w1Var);
                    if (objV == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + w1Var + ')');
                    }
                } else {
                    w wVar = (w) w1Var;
                    if (wVar.o()) {
                        objV = null;
                    } else {
                        if (!wVar.t()) {
                            throw new IllegalArgumentException("No argument provided for a required parameter: " + wVar);
                        }
                        objV = v(wVar.g());
                    }
                }
                arrayList.add(objV);
            }
            e10.g gVarE = e();
            if (gVarE != null) {
                try {
                    return gVarE.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e) {
                    throw new IllegalCallableAccessException(e);
                }
            }
            throw new a40.b0("This callable does not support a default call: " + w());
        }
        List<w1> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return a().call(isSuspend() ? new k00.c[]{null} : new k00.c[0]);
            } catch (IllegalAccessException e2) {
                throw new IllegalCallableAccessException(e2);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) ((Object[]) this.F.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.G.getValue()).booleanValue();
        int i = 0;
        for (w1 w1Var2 : parameters2) {
            int iX = zBooleanValue ? x(w1Var2) : 1;
            if (args.containsKey(w1Var2)) {
                objArr[((w) w1Var2).B] = args.get(w1Var2);
            } else {
                w wVar2 = (w) w1Var2;
                if (wVar2.o()) {
                    if (zBooleanValue) {
                        int i2 = i + iX;
                        for (int i3 = i; i3 < i2; i3++) {
                            int i4 = (i3 / 32) + size;
                            Object obj = objArr[i4];
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i4] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i3 % 32)));
                        }
                        z = true;
                    } else {
                        z = true;
                        int i5 = (i / 32) + size;
                        Object obj2 = objArr[i5];
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i5] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i % 32)));
                    }
                    z2 = z;
                } else if (!wVar2.t()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + wVar2);
                }
            }
            if (((w) w1Var2).C == a10.n.D) {
                i += iX;
            }
        }
        if (!z2) {
            try {
                e10.g gVarA = a();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                return gVarA.call(objArrCopyOf);
            } catch (IllegalAccessException e3) {
                throw new IllegalCallableAccessException(e3);
            }
        }
        e10.g gVarE2 = e();
        if (gVarE2 != null) {
            try {
                return gVarE2.call(objArr);
            } catch (IllegalAccessException e4) {
                throw new IllegalCallableAccessException(e4);
            }
        }
        throw new a40.b0("This callable does not support a default call: " + w());
    }

    @Override
    public final List getAnnotations() {
        Object objInvoke = this.A.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override
    public final List getParameters() {
        Object objInvoke = this.C.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override
    public final a10.x getReturnType() {
        Object objInvoke = this.D.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (a10.x) objInvoke;
    }

    @Override
    public final List getTypeParameters() {
        Object objInvoke = this.E.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (List) objInvoke;
    }

    @Override
    public final a10.b0 getVisibility() {
        j10.o visibility = w().getVisibility();
        kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
        n20.c cVar = i2.a;
        if (visibility.equals(j10.p.e)) {
            return a10.b0.A;
        }
        if (visibility.equals(j10.p.c)) {
            return a10.b0.B;
        }
        if (visibility.equals(j10.p.d)) {
            return a10.b0.C;
        }
        if (visibility.equals(j10.p.a) || visibility.equals(j10.p.b)) {
            return a10.b0.D;
        }
        return null;
    }

    @Override
    public final boolean isAbstract() {
        return w().g() == j10.y.E;
    }

    @Override
    public final boolean isFinal() {
        return w().g() == j10.y.B;
    }

    @Override
    public final boolean isOpen() {
        return w().g() == j10.y.D;
    }

    public abstract j10.c w();

    public final int x(w1 w1Var) {
        if (!((Boolean) this.G.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        w wVar = (w) w1Var;
        if (!i2.f(wVar.g())) {
            return 1;
        }
        ArrayList arrayListM = kh.n.M(e30.c.b(wVar.g().B));
        kotlin.jvm.internal.m.b(arrayListM);
        return arrayListM.size();
    }

    public final boolean y() {
        return kotlin.jvm.internal.m.a(getName(), "<init>") && h().v().isAnnotation();
    }
}
