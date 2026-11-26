package x10;

import j10.l0;

public final class k implements q20.e {
    @Override
    public final int a(j10.b superDescriptor, j10.b subDescriptor, j10.e eVar) {
        kotlin.jvm.internal.m.e(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.m.e(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof l0) || !(superDescriptor instanceof l0)) {
            return 3;
        }
        l0 l0Var = (l0) subDescriptor;
        l0 l0Var2 = (l0) superDescriptor;
        if (!kotlin.jvm.internal.m.a(l0Var.getName(), l0Var2.getName())) {
            return 3;
        }
        if (rd.a.H(l0Var) && rd.a.H(l0Var2)) {
            return 1;
        }
        return (rd.a.H(l0Var) || rd.a.H(l0Var2)) ? 2 : 3;
    }

    @Override
    public final int b() {
        return 3;
    }
}
