package v2;

public final class a implements p {

    public final int f15350b;

    public a(int i10) {
        this.f15350b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.f15350b == ((a) obj).f15350b;
    }

    public final int hashCode() {
        return this.f15350b;
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("AndroidPointerIcon(type="), this.f15350b, ')');
    }
}
