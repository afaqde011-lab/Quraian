package ha;

import kotlin.jvm.internal.m;

public final class e implements Comparable {
    public final int A;
    public final int B;
    public final String C;
    public final String D;

    public e(int i10, int i11, String str, String str2) {
        m.e(str, "from");
        m.e(str2, "to");
        this.A = i10;
        this.B = i11;
        this.C = str;
        this.D = str2;
    }

    @Override
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        m.e(eVar, "other");
        int i10 = this.A - eVar.A;
        return i10 == 0 ? this.B - eVar.B : i10;
    }
}
