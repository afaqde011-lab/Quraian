package o20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class n {
    public final b a;
    public final Object b;
    public final b c;
    public final m d;
    public final Method e;

    public n(b bVar, Object obj, b bVar2, m mVar, Class cls) {
        if (bVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (mVar.B == l0.F && bVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.a = bVar;
        this.b = obj;
        this.c = bVar2;
        this.d = mVar;
        if (!p.class.isAssignableFrom(cls)) {
            this.e = null;
            return;
        }
        try {
            this.e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            throw new RuntimeException(w.c.l(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e);
        }
    }

    public final Object a(Object obj) {
        if (this.d.B.A != m0.ENUM) {
            return obj;
        }
        try {
            return this.e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.d.B.A == m0.ENUM ? Integer.valueOf(((p) obj).getNumber()) : obj;
    }
}
