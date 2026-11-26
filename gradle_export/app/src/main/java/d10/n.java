package d10;

public final class n extends f0 implements a10.j {
    public final Object P;

    public n(l1 container, j10.l0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        this.P = rd.a.I(g00.i.B, new a30.l(this, 17));
    }

    public n(l1 l1Var, String name, String signature, Object obj) {
        super(l1Var, name, signature, obj);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        this.P = rd.a.I(g00.i.B, new a30.l(this, 17));
    }

    @Override
    public final a10.h c() {
        return (m) this.P.getValue();
    }

    @Override
    public final a10.i c() {
        return (m) this.P.getValue();
    }
}
