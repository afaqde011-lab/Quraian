package ko;

import a1.e1;
import a10.h0;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.e0;
import androidx.media3.common.g0;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.l0;
import androidx.media3.common.m0;
import androidx.media3.common.q0;
import androidx.media3.common.s0;
import androidx.media3.common.t0;
import fh.d2;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ta.c0;

public final class l extends h0 {
    public final e1 f;

    public l(e1 e1Var) {
        this.f = e1Var;
    }

    public final q0 X(g00.k kVar) {
        l0 l0Var;
        ho.a aVar = (ho.a) kVar.A;
        ho.g gVar = (ho.g) kVar.B;
        Bundle bundle = new Bundle();
        bundle.putInt("audioStoryId", aVar.a);
        bundle.putInt("audioStoryEpisodeId", gVar.a);
        String str = gVar.c;
        bundle.putString("audioStoryLanguage", str);
        s0 s0Var = new s0();
        String str2 = aVar.c;
        s0Var.a = str2;
        int i = gVar.b;
        Integer numValueOf = Integer.valueOf(i);
        e1 e1Var = this.f;
        s0Var.b = (CharSequence) e1Var.invoke(numValueOf);
        s0Var.f = (CharSequence) e1Var.invoke(Integer.valueOf(i));
        ho.b bVar = aVar.f;
        if (bVar != null) {
            str2 = bVar.b;
        }
        s0Var.c = str2;
        String str3 = gVar.g;
        if (str3 == null) {
            str3 = aVar.e;
        }
        s0Var.m = str3 != null ? Uri.parse(str3) : null;
        s0Var.n = Integer.valueOf(i);
        long j = gVar.f;
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            lValueOf = null;
        }
        s0Var.d(lValueOf);
        s0Var.r = Boolean.TRUE;
        s0Var.q = Boolean.FALSE;
        s0Var.G = 3;
        s0Var.H = bundle;
        t0 t0Var = new t0(s0Var);
        e0 e0Var = new e0();
        androidx.media3.common.h0 h0Var = new androidx.media3.common.h0();
        List list = Collections.EMPTY_LIST;
        d2 d2Var = d2.E;
        j0 j0Var = new j0();
        m0 m0Var = m0.d;
        StringBuilder sbP = oi.k.p(aVar.a, gVar.a, "audio_story/", "/", "/");
        sbP.append(str);
        String string = sbP.toString();
        string.getClass();
        Uri uri = Uri.parse(gVar.e);
        c0.A(((Uri) h0Var.e) == null || ((UUID) h0Var.d) != null);
        if (uri != null) {
            l0Var = new l0(uri, (String) null, ((UUID) h0Var.d) != null ? new i0(h0Var) : null, (androidx.media3.common.c0) null, list, (String) null, d2Var, -9223372036854775807L);
        } else {
            l0Var = null;
        }
        return new q0(string, new g0(e0Var), l0Var, new k0(j0Var), t0Var, m0Var);
    }
}
