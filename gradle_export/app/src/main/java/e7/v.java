package e7;

public final class v {

    public static final v f5185c = new v(-1, -1);

    public static final v f5186d = new v(0, 0);

    public final int f5187a;

    public final int f5188b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public v(int i10, int i11) {
        ta.c0.s((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f5187a = i10;
        this.f5188b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f5187a == vVar.f5187a && this.f5188b == vVar.f5188b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f5187a;
        int i11 = i10 << 16;
        return this.f5188b ^ ((i10 >>> 16) | i11);
    }

    public final String toString() {
        return this.f5187a + "x" + this.f5188b;
    }
}
