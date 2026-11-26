package l60;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class p0 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final Class b;
    public final q0 c;

    public p0(q0 q0Var, Class cls) {
        this.c = q0Var;
        this.b = cls;
    }

    @Override
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        r rVarB;
        Object obj2;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        a aVar = j0.b;
        if (aVar.e(method)) {
            return aVar.d(method, cls, obj, objArr2);
        }
        q0 q0Var = this.c;
        while (true) {
            Object objPutIfAbsent = q0Var.a.get(method);
            if (!(objPutIfAbsent instanceof r)) {
                if (objPutIfAbsent != null) {
                    synchronized (objPutIfAbsent) {
                        obj2 = q0Var.a.get(method);
                        if (obj2 == null) {
                            rVarB = (r) obj2;
                            break;
                        }
                    }
                } else {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            objPutIfAbsent = q0Var.a.putIfAbsent(method, obj3);
                            if (objPutIfAbsent != null) {
                                synchronized (objPutIfAbsent) {
                                    try {
                                        obj2 = q0Var.a.get(method);
                                        if (obj2 == null) {
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                rVarB = (r) obj2;
                                break;
                            }
                            try {
                                rVarB = r.b(q0Var, cls, method);
                                q0Var.a.put(method, rVarB);
                                break;
                            } catch (Throwable th2) {
                                q0Var.a.remove(method);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            } else {
                rVarB = (r) objPutIfAbsent;
                break;
            }
        }
        return rVarB.a(new y(rVarB.a, obj, objArr2, rVarB.b, rVarB.c), objArr2);
    }
}
