package g10;

public final class r {
    UBYTEARRAY(kh.n.F("kotlin/UByteArray", false)),
    USHORTARRAY(kh.n.F("kotlin/UShortArray", false)),
    UINTARRAY(kh.n.F("kotlin/UIntArray", false)),
    ULONGARRAY(kh.n.F("kotlin/ULongArray", false));

    public final n20.e A;

    static {
        f50.c.v(rVarArr);
    }

    public r(n20.b bVar) {
        super(str, i);
        this.A = bVar.f();
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) F.clone();
    }
}
