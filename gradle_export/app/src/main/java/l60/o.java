package l60;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

public final class o extends e {
    public final Executor a;

    public o(Executor executor) {
        this.a = executor;
    }

    @Override
    public final f a(Type type, Annotation[] annotationArr) {
        if (w0.h(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new h7.b(w0.g(0, (ParameterizedType) type), w0.l(annotationArr, r0.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
