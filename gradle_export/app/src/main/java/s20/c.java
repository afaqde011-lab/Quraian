package s20;

public final class c extends g {
    public final int b = 1;

    public c(double d) {
        super(Double.valueOf(d));
    }

    public c(float f) {
        super(Float.valueOf(f));
    }

    public c(Object obj) {
        super(obj);
    }

    @Override
    public final e30.w a(j10.z module) {
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.m.e(module, "module");
                g10.i iVarD = module.d();
                iVarD.getClass();
                return iVarD.t(g10.k.BOOLEAN);
            case 1:
                kotlin.jvm.internal.m.e(module, "module");
                g10.i iVarD2 = module.d();
                iVarD2.getClass();
                return iVarD2.t(g10.k.DOUBLE);
            default:
                kotlin.jvm.internal.m.e(module, "module");
                g10.i iVarD3 = module.d();
                iVarD3.getClass();
                return iVarD3.t(g10.k.FLOAT);
        }
    }

    @Override
    public String toString() {
        switch (this.b) {
            case 1:
                return ((Number) this.a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }
}
