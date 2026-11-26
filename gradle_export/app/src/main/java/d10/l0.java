package d10;

public class l0 extends m0 implements a10.v {
    public final Object O;

    public l0(l1 container, j10.l0 descriptor) {
        super(container, descriptor);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new j0(this, 0));
        rd.a.I(iVar, new j0(this, 1));
    }

    public l0(l1 l1Var, String name, String signature) {
        super(l1Var, name, signature, kotlin.jvm.internal.c.NO_RECEIVER);
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
        g00.i iVar = g00.i.B;
        this.O = rd.a.I(iVar, new j0(this, 0));
        rd.a.I(iVar, new j0(this, 1));
    }

    @Override
    public final a0 B() {
        return (k0) this.O.getValue();
    }

    @Override
    public final a10.p b() {
        return (k0) this.O.getValue();
    }

    @Override
    public final a10.u b() {
        return (k0) this.O.getValue();
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) this.O.getValue()).call(obj, obj2);
    }
}
