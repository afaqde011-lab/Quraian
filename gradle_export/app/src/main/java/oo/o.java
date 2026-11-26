package oo;

public final class o implements a0 {
    public final boolean a;

    public o(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.a == ((o) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.j("OnReadAlongSwiped(isOnward=", ")", this.a);
    }
}
