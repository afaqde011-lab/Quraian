package l60;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class a implements m {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public static final a D = new a(2);
    public static final a E = new a(3);
    public static final a F = new a(4);
    public static final a G = new a(5);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new o(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    @Override
    public Object convert(Object obj) {
        switch (this.A) {
            case 0:
                return obj.toString();
            case 1:
                x40.d0 d0Var = (x40.d0) obj;
                try {
                    k50.i iVar = new k50.i();
                    d0Var.v().a0(iVar);
                    return new c50.g(d0Var.r(), d0Var.l(), iVar, 1);
                } finally {
                    d0Var.close();
                }
            case 2:
                return (x40.z) obj;
            case 3:
                return (x40.d0) obj;
            case 4:
                ((x40.d0) obj).close();
                return g00.b0.a;
            default:
                ((x40.d0) obj).close();
                return null;
        }
    }

    public Object d(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }
}
