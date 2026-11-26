package d10;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;

public final class d0 implements u00.a {
    public final int A;
    public final f0 B;

    public d0(f0 f0Var, int i) {
        this.A = i;
        this.B = f0Var;
    }

    @Override
    public final Object invoke() throws IllegalPropertyDelegateAccessException {
        switch (this.A) {
            case 0:
                return new e0(this.B);
            default:
                f0 f0Var = this.B;
                Object objZ = f0Var.z();
                try {
                    Object obj = m0.N;
                    Object objZ2 = ri.t1.D(f0Var) ? kh.n.z(f0Var.K, f0Var.w()) : null;
                    if (objZ2 == obj) {
                        objZ2 = null;
                    }
                    ri.t1.D(f0Var);
                    AccessibleObject accessibleObject = objZ != null ? (AccessibleObject) objZ : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(f50.c.M(f0Var));
                    }
                    if (objZ == null) {
                        return null;
                    }
                    if (objZ instanceof Field) {
                        return ((Field) objZ).get(objZ2);
                    }
                    if (!(objZ instanceof Method)) {
                        throw new AssertionError("delegate field/method " + objZ + " neither field nor method");
                    }
                    int length = ((Method) objZ).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) objZ).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) objZ;
                        if (objZ2 == null) {
                            Class<?> cls = ((Method) objZ).getParameterTypes()[0];
                            kotlin.jvm.internal.m.d(cls, "get(...)");
                            objZ2 = i2.d(cls);
                        }
                        return method.invoke(null, objZ2);
                    }
                    if (length == 2) {
                        Method method2 = (Method) objZ;
                        Class<?> cls2 = ((Method) objZ).getParameterTypes()[1];
                        kotlin.jvm.internal.m.d(cls2, "get(...)");
                        return method2.invoke(null, objZ2, i2.d(cls2));
                    }
                    throw new AssertionError("delegate method " + objZ + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new IllegalPropertyDelegateAccessException("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
