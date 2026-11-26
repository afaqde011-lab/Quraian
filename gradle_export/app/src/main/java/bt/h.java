package bt;

public final class h implements w {
    public final int a;

    public h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnConfirmDailyGoalClicked(selectedValue=", this.a, ")");
    }
}
