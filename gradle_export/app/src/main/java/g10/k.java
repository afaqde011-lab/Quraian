package g10;

import java.util.Set;

public final class k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public static final Set E;
    public final n20.e A;
    public final n20.e B;
    public final Object C;
    public final Object D;

    static {
        k kVar = CHAR;
        k kVar2 = BYTE;
        k kVar3 = SHORT;
        k kVar4 = INT;
        k kVar5 = FLOAT;
        k kVar6 = LONG;
        k kVar7 = DOUBLE;
        f50.c.v(kVarArr);
        E = h00.n.X0(new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7});
    }

    public k(String str) {
        super(str, i);
        this.A = n20.e.e(str);
        this.B = n20.e.e(str.concat("Array"));
        g00.i iVar = g00.i.B;
        this.C = rd.a.I(iVar, new j(this, 0));
        this.D = rd.a.I(iVar, new j(this, 1));
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) N.clone();
    }
}
