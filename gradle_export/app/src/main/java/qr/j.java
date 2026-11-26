package qr;

import com.google.android.gms.internal.measurement.x5;

public final class j implements l {
    public final String a;
    public final String b;
    public final u30.b c;

    public j(String key, String title, u30.b playlists) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(title, "title");
        kotlin.jvm.internal.m.e(playlists, "playlists");
        this.a = key;
        this.b = title;
        this.c = playlists;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(this.a, jVar.a) && kotlin.jvm.internal.m.a(this.b, jVar.b) && kotlin.jvm.internal.m.a(this.c, jVar.c);
    }

    @Override
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x5.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("Playlists(key=", this.a, ", title=", this.b, ", playlists=");
        sbS.append(this.c);
        sbS.append(")");
        return sbS.toString();
    }
}
