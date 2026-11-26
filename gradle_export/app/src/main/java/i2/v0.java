package i2;

public final class v0 extends q {

    public final long f7174a;

    public v0(long j9) {
        this.f7174a = j9;
    }

    @Override
    public final void a(float f3, long j9, e eVar) {
        eVar.c(1.0f);
        long jB = this.f7174a;
        if (f3 != 1.0f) {
            jB = t.b(t.d(jB) * f3, jB);
        }
        eVar.e(jB);
        if (eVar.f7122c != null) {
            eVar.i(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return t.c(this.f7174a, ((v0) obj).f7174a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = t.f7168h;
        return Long.hashCode(this.f7174a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) t.i(this.f7174a)) + ')';
    }
}
