package androidx.fragment.app;

public final class b1 {

    public static final u.s0 f691b = new u.s0(0);

    public final i1 f692a;

    public b1(i1 i1Var) {
        this.f692a = i1Var;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        u.s0 s0Var = f691b;
        u.s0 s0Var2 = (u.s0) s0Var.get(classLoader);
        if (s0Var2 == null) {
            s0Var2 = new u.s0(0);
            s0Var.put(classLoader, s0Var2);
        }
        Class cls = (Class) s0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        s0Var2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e3) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        } catch (ClassNotFoundException e10) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }
}
