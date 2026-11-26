package cy;

public final class a implements d {
    public final int a;
    public final String b;

    public a(int i) {
        this.a = i;
        this.b = g4.c.f(i, "playlist-");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    @Override
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return g4.c.i("Playlist(playlistId=", this.a, ")");
    }
}
