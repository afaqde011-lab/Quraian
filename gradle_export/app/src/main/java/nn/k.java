package nn;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.appwidget.domain.model.RecentPlayEntry;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import sn.l;

public final class k {
    public final d a;
    public final zm.b b;
    public final sn.c c;
    public final SharedPreferences d;
    public volatile b e;
    public volatile long f = -1;

    public k(d dVar, zm.b bVar, sn.c cVar, SharedPreferences sharedPreferences) {
        this.a = dVar;
        this.b = bVar;
        this.c = cVar;
        this.d = sharedPreferences;
    }

    public final void a(PlayerItem playerItem, boolean z) {
        boolean z2 = z && playerItem != null;
        d dVar = this.a;
        Integer collectionId = playerItem != null ? playerItem.getCollectionId() : null;
        Integer numValueOf = playerItem != null ? Integer.valueOf(playerItem.getReciterId()) : null;
        a aVar = dVar.a;
        if (aVar != null) {
            if (numValueOf != null && m.a(aVar.a, b5.I(numValueOf.intValue(), collectionId)) && aVar.b == z2) {
                dVar.a = null;
            }
            if (!z2 && !aVar.b) {
                dVar.a = null;
            }
        }
        b bVar = new b(playerItem != null ? playerItem.getCollectionId() + "-" + playerItem.getReciterId() + "-" + playerItem.getSurahNumber() : null, z2);
        if (bVar.equals(this.e)) {
            return;
        }
        this.e = bVar;
        if (z2) {
            zm.b bVar2 = this.b;
            if (playerItem == null) {
                throw new IllegalStateException("Required value was null.");
            }
            RecentPlayEntry recentPlayEntry = new RecentPlayEntry(playerItem.getSurahNumber(), Long.valueOf(playerItem.getSurahId()), playerItem.getSurahTranscription(), playerItem.getReciterId(), playerItem.getReciterName(), playerItem.getReciterPhotoUrl(), System.currentTimeMillis(), playerItem.getCollectionId());
            i00.b bVarS = va.a.s();
            bVarS.add(recentPlayEntry);
            List listA = bVar2.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                if (!m.a(((RecentPlayEntry) obj).getSourceKey(), recentPlayEntry.getSourceKey())) {
                    arrayList.add(obj);
                }
            }
            bVarS.addAll(arrayList);
            List listJ1 = q.j1(va.a.k(bVarS), 10);
            SharedPreferences.Editor editorEdit = bVar2.a.edit();
            editorEdit.putString("WIDGET_RECENT_PLAYS_KEY", bVar2.b.i(listJ1));
            editorEdit.apply();
        }
        oi.k.v(this.d, "WIDGET_WAS_PLAYING_KEY", z2);
        this.c.a(l.A);
    }
}
