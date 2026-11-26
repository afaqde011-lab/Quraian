package wu;

import a10.h0;
import android.content.Context;
import android.net.Uri;
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
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.service.auto.art.AutoArtContentProvider;
import f50.c;
import fh.d2;
import gj.e;
import h00.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.m;
import r30.k;
import ta.c0;

public final class a extends h0 {
    public final Context f;

    public a(Context context) {
        this.f = context;
    }

    public final List X(List from) {
        Uri uriL;
        l0 l0Var;
        m.e(from, "from");
        ArrayList arrayList = new ArrayList(r.q0(from, 10));
        Iterator it = from.iterator();
        while (it.hasNext()) {
            PlayerItem playerItem = (PlayerItem) it.next();
            e0 e0Var = new e0();
            androidx.media3.common.h0 h0Var = new androidx.media3.common.h0();
            List list = Collections.EMPTY_LIST;
            d2 d2Var = d2.E;
            j0 j0Var = new j0();
            m0 m0Var = m0.d;
            String strValueOf = String.valueOf(playerItem.getSurahId());
            strValueOf.getClass();
            String playerUri = playerItem.getPlayerUri();
            if (playerUri == null) {
                playerUri = playerItem.getPlayerUrl();
            }
            Uri uri = playerUri == null ? null : Uri.parse(playerUri);
            s0 s0Var = new s0();
            s0Var.a = playerItem.getSurahTranscription();
            s0Var.b = playerItem.getReciterName();
            String reciterPhotoUrl = playerItem.getReciterPhotoUrl();
            if (reciterPhotoUrl == null) {
                uriL = null;
            } else {
                if (k.L0(reciterPhotoUrl)) {
                    reciterPhotoUrl = null;
                }
                if (reciterPhotoUrl == null) {
                    uriL = null;
                } else if (r30.r.x0(reciterPhotoUrl, "http", false)) {
                    int i = AutoArtContentProvider.A;
                    uriL = e.l(this.f, reciterPhotoUrl);
                } else {
                    uriL = Uri.parse(reciterPhotoUrl);
                }
            }
            s0Var.m = uriL;
            s0Var.H = c.n(new g00.k("reciterId", Integer.valueOf(playerItem.getReciterId())), new g00.k("surahId", Long.valueOf(playerItem.getSurahId())), new g00.k("surahNumber", Integer.valueOf(playerItem.getSurahNumber())), new g00.k("is_playing_local_file", Boolean.valueOf(playerItem.getPlayerUri() != null)));
            t0 t0Var = new t0(s0Var);
            c0.A(((Uri) h0Var.e) == null || ((UUID) h0Var.d) != null);
            if (uri != null) {
                l0Var = new l0(uri, (String) null, ((UUID) h0Var.d) != null ? new i0(h0Var) : null, (androidx.media3.common.c0) null, list, (String) null, d2Var, -9223372036854775807L);
            } else {
                l0Var = null;
            }
            arrayList.add(new q0(strValueOf, new g0(e0Var), l0Var, new k0(j0Var), t0Var, m0Var));
        }
        return arrayList;
    }
}
