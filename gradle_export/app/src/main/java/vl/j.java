package vl;

public final class j implements k {
    public final int a;
    public final String b;

    public j(int i) {
        this.a = i;
        this.b = String.valueOf(i);
    }

    @Override
    public final String a() {
        return "story";
    }

    @Override
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a == ((j) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("Story(storyId=", this.a, ")");
    }
}
