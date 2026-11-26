package ii;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

public final class d implements ij.b {

    public final int f7683a;

    public final Object f7684b;

    public d(Object obj, int i10) {
        this.f7683a = i10;
        this.f7684b = obj;
    }

    @Override
    public final Object get() {
        int i10 = this.f7683a;
        Object obj = this.f7684b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e3) {
                    throw new InvalidRegistrarException(a1.b.p("Could not instantiate ", str, "."), e3);
                } catch (InstantiationException e10) {
                    throw new InvalidRegistrarException(a1.b.p("Could not instantiate ", str, "."), e10);
                } catch (NoSuchMethodException e11) {
                    throw new InvalidRegistrarException(a1.b.o("Could not instantiate ", str), e11);
                } catch (InvocationTargetException e12) {
                    throw new InvalidRegistrarException(a1.b.o("Could not instantiate ", str), e12);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new kj.c((bi.g) obj);
        }
    }
}
