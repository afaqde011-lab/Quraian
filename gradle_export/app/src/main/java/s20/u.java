package s20;

public final class u extends p {
    public u(long j) {
        super(Long.valueOf(j));
    }

    @Override
    public final e30.w a(j10.z module) {
        kotlin.jvm.internal.m.e(module, "module");
        g10.i iVarD = module.d();
        iVarD.getClass();
        return iVarD.t(g10.k.LONG);
    }

    @Override
    public final String toString() {
        return ((Number) this.a).longValue() + ".toLong()";
    }
}
