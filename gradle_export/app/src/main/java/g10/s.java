package g10;

public final class s {
    UBYTE(kh.n.F("kotlin/UByte", false)),
    USHORT(kh.n.F("kotlin/UShort", false)),
    UINT(kh.n.F("kotlin/UInt", false)),
    ULONG(kh.n.F("kotlin/ULong", false));

    public final n20.b A;
    public final n20.e B;
    public final n20.b C;

    static {
        f50.c.v(sVarArr);
    }

    public s(n20.b bVar) {
        super(str, i);
        this.A = bVar;
        n20.e eVarF = bVar.f();
        this.B = eVarF;
        this.C = new n20.b(bVar.a, n20.e.e(eVarF.b() + "Array"));
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) D.clone();
    }
}
