package rt;

import com.google.android.gms.internal.measurement.x5;
import kotlin.jvm.internal.m;

public final class g {
    public final ot.d a;
    public final u30.f b;
    public final boolean c;
    public final String d;
    public final String e;

    public g(ot.d dVar, String str, String str2, int i) {
        ot.d dVar2 = (i & 1) != 0 ? ot.d.A : dVar;
        x30.c cVar = x30.c.D;
        this(dVar2, p30.f.d0(), true, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
    }

    public g(ot.d verseScript, u30.f fVar, boolean z, String languageName, String scriptName) {
        m.e(verseScript, "verseScript");
        m.e(languageName, "languageName");
        m.e(scriptName, "scriptName");
        this.a = verseScript;
        this.b = fVar;
        this.c = z;
        this.d = languageName;
        this.e = scriptName;
    }

    public static g a(g gVar, u30.f fVar, int i) {
        ot.d verseScript = gVar.a;
        if ((i & 2) != 0) {
            fVar = gVar.b;
        }
        u30.f textByAyah = fVar;
        boolean z = (i & 4) != 0 ? gVar.c : false;
        String languageName = gVar.d;
        String scriptName = gVar.e;
        gVar.getClass();
        m.e(verseScript, "verseScript");
        m.e(textByAyah, "textByAyah");
        m.e(languageName, "languageName");
        m.e(scriptName, "scriptName");
        return new g(verseScript, textByAyah, z, languageName, scriptName);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && m.a(this.b, gVar.b) && this.c == gVar.c && m.a(this.d, gVar.d) && m.a(this.e, gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + x5.e(w.c.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LyricsTranscriptionState(verseScript=");
        sb.append(this.a);
        sb.append(", textByAyah=");
        sb.append(this.b);
        sb.append(", isContentReady=");
        sb.append(this.c);
        sb.append(", languageName=");
        sb.append(this.d);
        sb.append(", scriptName=");
        return x5.n(sb, this.e, ")");
    }
}
