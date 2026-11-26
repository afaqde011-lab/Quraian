package p20;

import java.util.ArrayList;
import java.util.Set;

public final class i {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);

    public static final Set B;
    public static final Set C;
    public final boolean A;

    static {
        f50.c.v(new i[]{r0, r1, r3, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13});
        i[] iVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : iVarArrValues) {
            if (iVar.A) {
                arrayList.add(iVar);
            }
        }
        B = h00.q.r1(arrayList);
        C = h00.n.X0(values());
    }

    public i(boolean z) {
        super(str, i);
        this.A = z;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) R.clone();
    }
}
