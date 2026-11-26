package nv;

import a1.q1;
import android.os.Bundle;
import androidx.media3.common.q0;
import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import d40.l1;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import k9.a2;
import k9.d4;
import k9.g1;
import k9.z3;
import kh.v;
import uu.w;

public final class p {
    public final AudioPlayerService a;

    public p(AudioPlayerService audioPlayerService) {
        this.a = audioPlayerService;
    }

    public final v a(g1 mediaSession, a2 controller, List mediaItems) {
        k00.c cVar;
        Object next;
        kotlin.jvm.internal.m.e(mediaSession, "mediaSession");
        kotlin.jvm.internal.m.e(controller, "controller");
        kotlin.jvm.internal.m.e(mediaItems, "mediaItems");
        ArrayList arrayList = new ArrayList(h00.r.q0(mediaItems, 10));
        Iterator it = mediaItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((q0) it.next()).a);
        }
        int i = AudioPlayerService.j0;
        AudioPlayerService audioPlayerService = this.a;
        ov.g gVarY = audioPlayerService.y();
        Iterator it2 = arrayList.iterator();
        do {
            cVar = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!gVarY.c((String) next));
        String str = (String) next;
        if (AudioPlayerService.n(audioPlayerService, controller)) {
            if (AudioPlayerService.C(controller)) {
                audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoSubscriptionBlocked.INSTANCE);
            }
            return b5.x(x.A);
        }
        if (!mediaItems.isEmpty()) {
            Iterator it3 = mediaItems.iterator();
            while (it3.hasNext()) {
                q0 q0Var = (q0) it3.next();
                ov.g gVarY2 = audioPlayerService.y();
                String mediaId = q0Var.a;
                kotlin.jvm.internal.m.d(mediaId, "mediaId");
                if (gVarY2.d(mediaId)) {
                    Iterator it4 = mediaItems.iterator();
                    while (it4.hasNext()) {
                        q0 q0Var2 = (q0) it4.next();
                        ov.g gVarY3 = audioPlayerService.y();
                        String mediaId2 = q0Var2.a;
                        kotlin.jvm.internal.m.d(mediaId2, "mediaId");
                        if (gVarY3.d(mediaId2)) {
                            String mediaId3 = q0Var2.a;
                            kotlin.jvm.internal.m.d(mediaId3, "mediaId");
                            return AudioPlayerService.l(audioPlayerService, new j(audioPlayerService, mediaId3, controller, cVar, 0));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        if (str != null) {
            return AudioPlayerService.l(audioPlayerService, new j(audioPlayerService, str, controller, cVar, 1));
        }
        if (!mediaItems.isEmpty()) {
            Iterator it5 = mediaItems.iterator();
            while (it5.hasNext()) {
                if (((q0) it5.next()).b == null) {
                    AudioPlayerService.q(audioPlayerService, controller);
                    return AudioPlayerService.l(audioPlayerService, new d40.l(audioPlayerService, mediaItems, cVar, 4));
                }
            }
        }
        AudioPlayerService.q(audioPlayerService, controller);
        Iterator it6 = mediaItems.iterator();
        while (it6.hasNext()) {
            if (((q0) it6.next()).b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                kh.s sVar = new kh.s();
                sVar.m(unsupportedOperationException);
                return sVar;
            }
        }
        return b5.x(mediaItems);
    }

    public final v b(g1 session, a2 controller, z3 z3Var, Bundle args) {
        kotlin.jvm.internal.m.e(session, "session");
        kotlin.jvm.internal.m.e(controller, "controller");
        kotlin.jvm.internal.m.e(args, "args");
        int i = AudioPlayerService.j0;
        AudioPlayerService audioPlayerService = this.a;
        if (!audioPlayerService.B().a()) {
            return b5.x(new d4(-6));
        }
        String str = z3Var.b;
        int iHashCode = str.hashCode();
        k00.c cVar = null;
        if (iHashCode != -470988570) {
            if (iHashCode == 1543939317 && str.equals("SAVE_TO_FAVORITES")) {
                return AudioPlayerService.l(audioPlayerService, new q1(audioPlayerService, (k00.c) null, 5));
            }
        } else if (str.equals("TOGGLE_REPEAT")) {
            if (audioPlayerService.E()) {
                w wVar = (w) audioPlayerService.w();
                wVar.getClass();
                wVar.v(false, new l1(2, cVar, 14));
            }
            return b5.x(new d4(0));
        }
        return b5.x(new d4(-6));
    }
}
