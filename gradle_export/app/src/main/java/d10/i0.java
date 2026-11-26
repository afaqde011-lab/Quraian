package d10;

public class i0 extends m0 implements a10.t {
    public final Object O;

    public i0(l1 container, j10.l0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new g0(this, 0));
        rd.a.I(iVar, new g0(this, 1));
    }

    public i0(l1 l1Var, String name, String signature, Object obj) {
        super(l1Var, name, signature, obj);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new g0(this, 0));
        rd.a.I(iVar, new g0(this, 1));
    }

    @Override
    public final a0 B() {
        return (h0) this.O.getValue();
    }

    @Override
    public final a10.p b() {
        return (h0) this.O.getValue();
    }

    @Override
    public final a10.s b() {
        return (h0) this.O.getValue();
    }

    @Override
    public final Object get(Object obj) {
        return ((h0) this.O.getValue()).call(obj);
    }

    @Override
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
