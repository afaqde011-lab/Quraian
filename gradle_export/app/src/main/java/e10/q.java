package e10;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

public abstract class q extends w {
    public final int e = 0;
    public final boolean f;

    public q(Field field, boolean z, boolean z2) {
        Class TYPE = Void.TYPE;
        kotlin.jvm.internal.m.d(TYPE, "TYPE");
        Class<?> declaringClass = z2 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.m.d(genericType, "getGenericType(...)");
        super(field, TYPE, declaringClass, new Type[]{genericType});
        this.f = z;
    }

    public q(Method method, boolean z, int i) {
        z = (i & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.m.d(genericParameterTypes, "getGenericParameterTypes(...)");
        this(method, z, genericParameterTypes);
    }

    public q(Method method, boolean z, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.m.d(genericReturnType, "getGenericReturnType(...)");
        super(method, genericReturnType, z ? method.getDeclaringClass() : null, typeArr);
        this.f = genericReturnType.equals(Void.TYPE);
    }

    @Override
    public Object call(Object[] args) throws IllegalAccessException {
        kotlin.jvm.internal.m.e(args, "args");
        d(args);
        ((Field) this.a).set(this.c != null ? h00.n.D0(args) : null, h00.n.N0(args));
        return g00.b0.a;
    }

    @Override
    public void d(Object[] args) {
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.m.e(args, "args");
                super.d(args);
                if (this.f && h00.n.N0(args) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            default:
                super.d(args);
                return;
        }
    }

    public Object f(Object obj, Object[] args) {
        kotlin.jvm.internal.m.e(args, "args");
        return this.f ? g00.b0.a : ((Method) this.a).invoke(obj, Arrays.copyOf(args, args.length));
    }
}
