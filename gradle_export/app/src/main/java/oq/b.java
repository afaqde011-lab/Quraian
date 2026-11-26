package oq;

import com.google.android.gms.internal.measurement.x5;
import h00.q;
import ho.g;
import kotlin.jvm.internal.m;
import r30.k;
import vw.e;

public final class b {
    public final lq.a a;
    public final pm.c b;

    public b(lq.a aVar, pm.c cVar) {
        this.a = aVar;
        this.b = cVar;
    }

    public final a a(dw.a playlist) {
        String strB;
        m.e(playlist, "playlist");
        String str = playlist.b;
        if (k.L0(str)) {
            str = null;
        }
        if (str != null) {
            strB = this.a.b("collections", str);
        } else {
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        String str2 = playlist.c;
        return b(str2, this.b.a(2131887264, str2), strB, playlist.f);
    }

    public final a b(String str, String str2, String str3, String str4) {
        return new a(str, q.R0(va.a.S(new String[]{this.b.a(2131887266, new Object[0]), str2, str3}), "\n", null, null, null, 62), str4);
    }

    public final a c(ho.a story, g episode) {
        String strB;
        m.e(story, "story");
        String str = story.c;
        m.e(episode, "episode");
        int i = episode.b;
        String str2 = story.b;
        if (k.L0(str2)) {
            str2 = null;
        }
        if (str2 != null) {
            strB = this.a.b("audio-stories", str2, String.valueOf(i));
        } else {
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        Object[] objArr = {Integer.valueOf(i)};
        pm.c cVar = this.b;
        return b(x5.m(str, " · ", cVar.a(2131886133, objArr)), cVar.a(2131887265, Integer.valueOf(i), str), strB, story.e);
    }

    public final a d(bx.c reciter, int i, String surahName) {
        String strM;
        m.e(reciter, "reciter");
        String str = reciter.b;
        m.e(surahName, "surahName");
        String str2 = (String) q.O0(i - 1, e.a);
        if (str2 != null) {
            strM = x5.m(this.a.b("reciters", mq.b.c(reciter)), "?play=", lq.a.a(str2));
        } else {
            strM = null;
        }
        if (strM == null) {
            return null;
        }
        return b(x5.m(surahName, " · ", str), this.b.a(2131887269, surahName, str), strM, reciter.e);
    }

    public final a e(ho.a story) {
        String strB;
        m.e(story, "story");
        String str = story.b;
        if (k.L0(str)) {
            str = null;
        }
        if (str != null) {
            strB = this.a.b("audio-stories", str);
        } else {
            strB = null;
        }
        if (strB == null) {
            return null;
        }
        String str2 = story.c;
        return b(str2, this.b.a(2131887268, str2), strB, story.e);
    }
}
