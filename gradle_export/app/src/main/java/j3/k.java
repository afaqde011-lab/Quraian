package j3;

public final class k {

    public final int f7937a;

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f7937a == ((k) obj).f7937a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7937a);
    }

    public final String toString() {
        int i10 = this.f7937a;
        if (i10 == 0) {
            return "Button";
        }
        if (i10 == 1) {
            return "Checkbox";
        }
        if (i10 == 2) {
            return "Switch";
        }
        if (i10 == 3) {
            return "RadioButton";
        }
        if (i10 == 4) {
            return "Tab";
        }
        if (i10 == 5) {
            return "Image";
        }
        if (i10 == 6) {
            return "DropdownList";
        }
        if (i10 == 7) {
            return "Picker";
        }
        return i10 == 8 ? "Carousel" : "Unknown";
    }
}
