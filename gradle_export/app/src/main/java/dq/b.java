package dq;

public final class b implements d {
    public final boolean a = true;
    public final boolean b;

    public b(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "OnToggleBottomSheetVisibility(isVisible=" + this.a + ", showTracks=" + this.b + ")";
    }
}
