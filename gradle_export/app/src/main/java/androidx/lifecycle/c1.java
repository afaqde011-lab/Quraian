package androidx.lifecycle;

public interface c1 {
    default a1 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default a1 b(a10.d dVar, t6.d dVar2) {
        kotlin.jvm.internal.m.e(dVar, "modelClass");
        return c(k00.f.D(dVar), dVar2);
    }

    default a1 c(Class cls, t6.d dVar) {
        return a(cls);
    }
}
