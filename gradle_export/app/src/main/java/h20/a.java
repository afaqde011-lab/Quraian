package h20;

import h00.d0;
import java.util.LinkedHashMap;
import sg.f;

public final class a {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final f B;
    public static final LinkedHashMap C;
    public final int A;

    static {
        f50.c.v(new a[]{r0, r1, r2, r3, r4, r5});
        B = new f();
        a[] aVarArrValues = values();
        int iP = d0.P(aVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (a aVar : aVarArrValues) {
            linkedHashMap.put(Integer.valueOf(aVar.A), aVar);
        }
        C = linkedHashMap;
    }

    public a(int i) {
        super(str, i);
        this.A = i;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) J.clone();
    }
}
