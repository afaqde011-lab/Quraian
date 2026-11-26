package ds;

public final class m {
    public final mr.g a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public m(mr.g state, int i, boolean z, boolean z2) {
        kotlin.jvm.internal.m.e(state, "state");
        this.a = state;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static m a(m mVar, mr.g state, int i, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            state = mVar.a;
        }
        mVar.getClass();
        if ((i2 & 4) != 0) {
            i = mVar.b;
        }
        if ((i2 & 8) != 0) {
            z = mVar.c;
        }
        if ((i2 & 16) != 0) {
            z2 = mVar.d;
        }
        mVar.getClass();
        kotlin.jvm.internal.m.e(state, "state");
        return new m(state, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.a, mVar.a) && this.b == mVar.b && this.c == mVar.c && this.d == mVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + w.c.e(w.c.d(this.b, this.a.hashCode() * 961, 31), 31, this.c);
    }

    public final String toString() {
        return "ListeningTimerUiState(state=" + this.a + ", currentSurahTitle=null, dailyGoalMinute=" + this.b + ", isMinutePickerVisible=" + this.c + ", isGoalSaving=" + this.d + ")";
    }
}
