package bv;

import com.mchutov.core.deeplink.presentation.analytics.DeepLinkEvent;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.revenuecat.purchases.common.Constants;
import java.util.Iterator;

public final class c3 extends m00.i implements u00.n {
    public int A;
    public final e3 B;
    public final PlayerItem C;

    public c3(e3 e3Var, PlayerItem playerItem, k00.c cVar) {
        super(2, cVar);
        this.B = e3Var;
        this.C = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new c3(this.B, this.C, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        PlayerItem playerItem;
        Object next;
        oq.a aVarD;
        l00.a aVar = l00.a.A;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        e3 e3Var = this.B;
        if (i == 0) {
            ri.t1.O(obj);
            xw.k kVar = e3Var.p;
            this.A = 1;
            obj = kVar.c(this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return b0Var;
        }
        ri.t1.O(obj);
        Iterator it = ((Iterable) obj).iterator();
        do {
            boolean zHasNext = it.hasNext();
            playerItem = this.C;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (((bx.c) next).a != playerItem.getReciterId());
        bx.c cVar = (bx.c) next;
        if (cVar != null && (aVarD = e3Var.v.d(cVar, playerItem.getSurahNumber(), playerItem.getSurahTranscription())) != null) {
            e3Var.w.logEvent(new DeepLinkEvent.ContentShared("reciter_surah", cVar.a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + playerItem.getSurahNumber(), "player_screen"));
            h1 h1Var = new h1(aVarD);
            this.A = 2;
            if (e3Var.c.a(h1Var, this) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
