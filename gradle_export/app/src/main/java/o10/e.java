package o10;

import a30.n;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import p10.s;

public final class e implements n {
    public static final e b = new e();
    public static final e c = new e();

    @Override
    public void a(j10.c descriptor) {
        m.e(descriptor, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + descriptor);
    }

    public g b(e20.c javaElement) {
        m.e(javaElement, "javaElement");
        return new g((s) javaElement);
    }

    @Override
    public void c(j10.e eVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + eVar.getName() + ", unresolved classes " + arrayList);
    }
}
