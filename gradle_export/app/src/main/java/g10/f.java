package g10;

import e30.a0;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

public final class f implements u00.a {
    public final int A;
    public final i B;

    public f(i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        i iVar = this.B;
        switch (i) {
            case 0:
                return Arrays.asList(iVar.l().f0(p.l), iVar.l().f0(p.n), iVar.l().f0(p.o), iVar.l().f0(p.m));
            default:
                EnumMap enumMap = new EnumMap(k.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (k kVar : k.values()) {
                    String strB = kVar.A.b();
                    if (strB == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarN = iVar.k(strB).n();
                    if (a0VarN == null) {
                        i.a(48);
                        throw null;
                    }
                    String strB2 = kVar.B.b();
                    if (strB2 == null) {
                        i.a(47);
                        throw null;
                    }
                    a0 a0VarN2 = iVar.k(strB2).n();
                    if (a0VarN2 == null) {
                        i.a(48);
                        throw null;
                    }
                    enumMap.put(kVar, a0VarN2);
                    map.put(a0VarN, a0VarN2);
                    map2.put(a0VarN2, a0VarN);
                }
                return new h(enumMap, map, map2);
        }
    }
}
