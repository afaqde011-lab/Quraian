package s20;

import e30.a0;

public final class z extends p {
    public final int b = 0;

    public z(byte b) {
        super(Byte.valueOf(b));
    }

    public z(int i) {
        super(Integer.valueOf(i));
    }

    public z(long j) {
        super(Long.valueOf(j));
    }

    public z(short s) {
        super(Short.valueOf(s));
    }

    @Override
    public final e30.w a(j10.z module) {
        a0 a0VarN;
        a0 a0VarN2;
        a0 a0VarN3;
        a0 a0VarN4;
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.m.e(module, "module");
                j10.e eVarD = j10.w.d(module, g10.o.S);
                return (eVarD == null || (a0VarN = eVarD.n()) == null) ? g30.l.c(g30.k.Z, "UByte") : a0VarN;
            case 1:
                kotlin.jvm.internal.m.e(module, "module");
                j10.e eVarD2 = j10.w.d(module, g10.o.U);
                return (eVarD2 == null || (a0VarN2 = eVarD2.n()) == null) ? g30.l.c(g30.k.Z, "UInt") : a0VarN2;
            case 2:
                kotlin.jvm.internal.m.e(module, "module");
                j10.e eVarD3 = j10.w.d(module, g10.o.V);
                return (eVarD3 == null || (a0VarN3 = eVarD3.n()) == null) ? g30.l.c(g30.k.Z, "ULong") : a0VarN3;
            default:
                kotlin.jvm.internal.m.e(module, "module");
                j10.e eVarD4 = j10.w.d(module, g10.o.T);
                return (eVarD4 == null || (a0VarN4 = eVarD4.n()) == null) ? g30.l.c(g30.k.Z, "UShort") : a0VarN4;
        }
    }

    @Override
    public final String toString() {
        switch (this.b) {
            case 0:
                return ((Number) this.a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.a).longValue() + ".toULong()";
            default:
                return ((Number) this.a).intValue() + ".toUShort()";
        }
    }
}
