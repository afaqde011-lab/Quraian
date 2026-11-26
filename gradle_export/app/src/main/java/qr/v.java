package qr;

public final class v {
    public final String a;
    public final u b;
    public final boolean c;
    public final float d;

    public v(String str, u uVar, boolean z, float f) {
        this.a = str;
        this.b = uVar;
        this.c = z;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.m.a(this.a, vVar.a) && this.b == vVar.b && this.c == vVar.c && Float.compare(this.d, vVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + w.c.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "StreakInfoDvo(dayName=" + this.a + ", state=" + this.b + ", isToday=" + this.c + ", progress=" + this.d + ")";
    }
}
