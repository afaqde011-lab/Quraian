package dz;

public final class e implements g {
    public final int a;

    public e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnDeleteReciterDownloadsClicked(reciterId=", this.a, ")");
    }
}
