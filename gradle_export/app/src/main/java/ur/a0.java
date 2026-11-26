package ur;

public final class a0 implements p0 {
    public final int a;

    public a0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && this.a == ((a0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("OnPlaylistClicked(playlistId=", this.a, ")");
    }
}
