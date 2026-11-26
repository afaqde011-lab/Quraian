package d10;

public final class p extends i0 implements a10.l {
    public final Object P;

    public p(l1 container, j10.l0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.P = rd.a.I(g00.i.B, new a30.l(this, 18));
    }

    public p(l1 l1Var, String name, String signature, Object obj) {
        super(l1Var, name, signature, obj);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        this.P = rd.a.I(g00.i.B, new a30.l(this, 18));
    }

    @Override
    public final a10.h c() {
        return (o) this.P.getValue();
    }

    @Override
    public final a10.k c() {
        return (o) this.P.getValue();
    }

    @Override
    public final void p(Object obj, Object obj2) {
        ((o) this.P.getValue()).call(obj, obj2);
    }
}
