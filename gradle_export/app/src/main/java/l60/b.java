package l60;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

public final class b extends l {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    @Override
    public m a(Type type) {
        switch (this.a) {
            case 0:
                if (x40.z.class.isAssignableFrom(w0.h(type))) {
                    return a.D;
                }
                return null;
            default:
                return super.a(type);
        }
    }

    @Override
    public final m b(Type type, Annotation[] annotationArr, q0 q0Var) {
        switch (this.a) {
            case 0:
                if (type == x40.d0.class) {
                    return w0.l(annotationArr, n60.w.class) ? a.E : a.C;
                }
                if (type == Void.class) {
                    return a.G;
                }
                if (w0.b && type == g00.b0.class) {
                    return a.F;
                }
                return null;
            default:
                if (w0.h(type) != Optional.class) {
                    return null;
                }
                return new gi.c(q0Var.d(w0.g(0, (ParameterizedType) type), annotationArr), 19);
        }
    }
}
