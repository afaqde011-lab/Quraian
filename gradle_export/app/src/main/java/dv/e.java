package dv;

import kotlin.jvm.internal.m;

public final class e {
    public final a a;
    public final d b;
    public final c c;
    public final f d;
    public final b e;

    public e(a overlay, d reciter, c playlist, f trackList, b playback) {
        m.e(overlay, "overlay");
        m.e(reciter, "reciter");
        m.e(playlist, "playlist");
        m.e(trackList, "trackList");
        m.e(playback, "playback");
        this.a = overlay;
        this.b = reciter;
        this.c = playlist;
        this.d = trackList;
        this.e = playback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(this.a, eVar.a) && m.a(this.b, eVar.b) && m.a(this.c, eVar.c) && m.a(this.d, eVar.d) && m.a(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PlayerScreenData(overlay=" + this.a + ", reciter=" + this.b + ", playlist=" + this.c + ", trackList=" + this.d + ", playback=" + this.e + ")";
    }
}
