package n10;

import i00.f;
import j10.a1;
import j10.b1;
import j10.e1;
import j10.f1;
import j10.w0;
import j10.z0;
import kotlin.jvm.internal.m;

public final class b extends f1 {
    public static final b c = new b("protected_and_package", true);

    @Override
    public final Integer a(f1 visibility) {
        m.e(visibility, "visibility");
        if (equals(visibility)) {
            return 0;
        }
        if (visibility == w0.c) {
            return null;
        }
        f fVar = e1.a;
        return (visibility == z0.c || visibility == a1.c) ? 1 : -1;
    }

    @Override
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override
    public final f1 c() {
        return b1.c;
    }
}
