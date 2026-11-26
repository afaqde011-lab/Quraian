package n10;

import i00.f;
import j10.a1;
import j10.b1;
import j10.e1;
import j10.f1;
import j10.z0;
import kotlin.jvm.internal.m;

public final class a extends f1 {
    public static final a c = new a("package", false);

    @Override
    public final Integer a(f1 visibility) {
        m.e(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        f fVar = e1.a;
        return (visibility == z0.c || visibility == a1.c) ? 1 : -1;
    }

    @Override
    public final String b() {
        return "public/*package*/";
    }

    @Override
    public final f1 c() {
        return b1.c;
    }
}
