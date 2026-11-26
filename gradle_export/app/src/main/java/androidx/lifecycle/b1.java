package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

public final class b1 extends d1 {

    public static b1 f977c;

    public static final hb.f f978d = new hb.f();

    public final Application f979b;

    public b1(Application application) {
        this.f979b = application;
    }

    @Override
    public final a1 a(Class cls) {
        Application application = this.f979b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override
    public final a1 c(Class cls, t6.d dVar) {
        if (this.f979b != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f14360a.get(f978d);
        if (application != null) {
            return d(cls, application);
        }
        if (a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return ze.d.r(cls);
    }

    public final a1 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return ze.d.r(cls);
        }
        try {
            a1 a1Var = (a1) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.m.b(a1Var);
            return a1Var;
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
