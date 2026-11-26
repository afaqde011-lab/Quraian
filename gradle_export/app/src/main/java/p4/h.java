package p4;

import android.content.res.Resources;
import java.util.Objects;

public final class h {

    public final Resources f12333a;

    public final Resources.Theme f12334b;

    public h(Resources resources, Resources.Theme theme) {
        this.f12333a = resources;
        this.f12334b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f12333a.equals(hVar.f12333a) && Objects.equals(this.f12334b, hVar.f12334b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12333a, this.f12334b);
    }
}
