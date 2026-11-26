package s20;

public final class d extends p {
    public d(byte b) {
        super(Byte.valueOf(b));
    }

    @Override
    public final e30.w a(j10.z module) {
        kotlin.jvm.internal.m.e(module, "module");
        g10.i iVarD = module.d();
        iVarD.getClass();
        return iVarD.t(g10.k.BYTE);
    }

    @Override
    public final String toString() {
        return ((Number) this.a).intValue() + ".toByte()";
    }
}
