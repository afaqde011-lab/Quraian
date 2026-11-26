package s20;

public final class w extends p {
    public w(short s) {
        super(Short.valueOf(s));
    }

    @Override
    public final e30.w a(j10.z module) {
        kotlin.jvm.internal.m.e(module, "module");
        g10.i iVarD = module.d();
        iVarD.getClass();
        return iVarD.t(g10.k.SHORT);
    }

    @Override
    public final String toString() {
        return ((Number) this.a).intValue() + ".toShort()";
    }
}
