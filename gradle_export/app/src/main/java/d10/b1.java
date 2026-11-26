package d10;

import java.util.HashSet;

public final class b1 implements u00.n {
    public static final b1 B = new b1(0);
    public static final b1 C = new b1(1);
    public final int A;

    public b1(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a30.u deserializeToDescriptor = (a30.u) obj;
        i20.j0 proto = (i20.j0) obj2;
        switch (this.A) {
            case 0:
                HashSet hashSet = j1.D;
                kotlin.jvm.internal.m.e(deserializeToDescriptor, "$this$deserializeToDescriptor");
                kotlin.jvm.internal.m.e(proto, "proto");
                break;
            default:
                int i = p1.D;
                kotlin.jvm.internal.m.e(deserializeToDescriptor, "$this$deserializeToDescriptor");
                kotlin.jvm.internal.m.e(proto, "proto");
                break;
        }
        return deserializeToDescriptor.g(proto, true);
    }
}
