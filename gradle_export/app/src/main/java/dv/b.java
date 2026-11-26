package dv;

public final class b {
    public final boolean a;
    public final float b;

    public b(float f, boolean z) {
        this.a = z;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && Float.compare(this.b, bVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PlayerPlaybackState(isFavoritesMixPlaylistActive=" + this.a + ", playbackSpeed=" + this.b + ")";
    }
}
