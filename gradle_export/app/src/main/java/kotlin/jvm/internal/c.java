package kotlin.jvm.internal;

import d10.r1;
import d10.w1;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public abstract class c implements a10.c, Serializable {
    public static final Object NO_RECEIVER = b.A;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient a10.c reflected;
    private final String signature;

    public c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public a10.c compute() {
        a10.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        a10.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract a10.c computeReflected();

    public GenericDeclaration findJavaDeclaration() {
        a10.f owner = getOwner();
        String signature = getSignature();
        m.e(signature, "signature");
        if (!(owner instanceof d)) {
            return null;
        }
        String strD1 = r30.k.d1(signature, '(');
        if (strD1.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        Method[] declaredMethods = ((d) owner).v().getDeclaredMethods();
        m.d(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            if (m.a(method.getName(), strD1)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                m.d(parameterTypes, "getParameterTypes(...)");
                for (Class<?> cls : parameterTypes) {
                    m.b(cls);
                    l.a(cls, sb);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                m.d(returnType, "getReturnType(...)");
                l.a(returnType, sb);
                if (m.a(sb.toString(), signature)) {
                    return method;
                }
            }
        }
        return null;
    }

    @Override
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public a10.f getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? a0.a.c(cls) : a0.a.b(cls);
    }

    @Override
    public List<w1> getParameters() {
        return getReflected().getParameters();
    }

    public abstract a10.c getReflected();

    @Override
    public a10.x getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override
    public List<r1> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override
    public a10.b0 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
