package dq;

public final class m {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Integer d;
    public final boolean e;

    public m(boolean z, boolean z2, boolean z3, Integer num, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = num;
        this.e = z4;
    }

    public static m a(m mVar, boolean z, boolean z2, Integer num, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = mVar.a;
        }
        boolean z4 = z;
        boolean z5 = (i & 2) != 0 ? mVar.b : true;
        if ((i & 4) != 0) {
            z2 = mVar.c;
        }
        boolean z6 = z2;
        if ((i & 8) != 0) {
            num = mVar.d;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z3 = mVar.e;
        }
        mVar.getClass();
        return new m(z4, z5, z6, num2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b && this.c == mVar.c && kotlin.jvm.internal.m.a(this.d, mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabsUiState(isVisibleTopNavigation=");
        sb.append(this.a);
        sb.append(", isOfflineModeBottomSheetViewed=");
        sb.append(this.b);
        sb.append(", isInternetConnected=");
        sb.append(this.c);
        sb.append(", countdownSeconds=");
        sb.append(this.d);
        sb.append(", showReciterEventCelebration=");
        return g4.c.l(sb, this.e, ")");
    }
}
