package z4;

import android.view.DisplayCutout;
import java.util.Objects;

public final class f {

    public final DisplayCutout f17190a;

    public f(DisplayCutout displayCutout) {
        this.f17190a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f17190a, ((f) obj).f17190a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f17190a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f17190a + "}";
    }
}
