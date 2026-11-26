package d10;

public class f0 extends m0 implements a10.r {
    public final Object O;

    public f0(l1 container, j10.l0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new d0(this, 0));
        rd.a.I(iVar, new d0(this, 1));
    }

    public f0(l1 l1Var, String name, String signature, Object obj) {
        super(l1Var, name, signature, obj);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new d0(this, 0));
        rd.a.I(iVar, new d0(this, 1));
    }

    @Override
    public final a0 B() {
        return (e0) this.O.getValue();
    }

    @Override
    public final a10.p b() {
        return (e0) this.O.getValue();
    }

    @Override
    public final a10.q b() {
        return (e0) this.O.getValue();
    }

    @Override
    public final Object get() {
        return ((e0) this.O.getValue()).call(new Object[0]);
    }

    @Override
    public final Object invoke() {
        return get();
    }
}
