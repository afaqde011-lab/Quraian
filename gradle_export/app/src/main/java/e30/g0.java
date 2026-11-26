package e30;

import java.util.ArrayList;
import java.util.Map;

public final class g0 extends n0 {
    public final int c;
    public final Object d;

    public g0(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override
    public boolean a() {
        switch (this.c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override
    public boolean e() {
        switch (this.c) {
            case 1:
                return ((Map) this.d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override
    public final p0 g(m0 key) {
        switch (this.c) {
            case 0:
                kotlin.jvm.internal.m.e(key, "key");
                if (!((ArrayList) this.d).contains(key)) {
                    return null;
                }
                j10.h hVarG = key.g();
                kotlin.jvm.internal.m.c(hVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return x0.j((j10.r0) hVarG);
            default:
                kotlin.jvm.internal.m.e(key, "key");
                return (p0) ((Map) this.d).get(key);
        }
    }
}
