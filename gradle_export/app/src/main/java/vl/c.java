package vl;

public final class c implements k {
    public final int a;
    public final String b;

    public c(int i) {
        this.a = i;
        this.b = String.valueOf(i);
    }

    @Override
    public final String a() {
        return "collection";
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("Collection(collectionId=", this.a, ")");
    }
}
