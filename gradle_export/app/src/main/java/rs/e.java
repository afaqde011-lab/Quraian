package rs;

import kotlin.jvm.internal.m;
import oi.k;

public final class e {
    public final int a;
    public final int b;
    public final zz.a c;
    public final float d;

    public e(int i, int i2, zz.a aVar, float f) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && m.a(this.c, eVar.c) && Float.compare(this.d, eVar.d) == 0;
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.d(this.b, Integer.hashCode(this.a) * 31, 31), 31, true);
        zz.a aVar = this.c;
        return Float.hashCode(this.d) + ((iE + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbP = k.p(this.a, this.b, "ListeningContext(surahNumber=", ", reciterId=", ", isPlaying=true, backgroundSound=");
        sbP.append(this.c);
        sbP.append(", backgroundSoundVolume=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
