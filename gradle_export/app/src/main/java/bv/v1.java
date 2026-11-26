package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e3 C;
    public final PlayerItem D;

    public v1(e3 e3Var, PlayerItem playerItem, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e3Var;
        this.D = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v1(this.C, this.D, cVar, 0);
            default:
                return new v1(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((v1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    ri.t1.O(obj);
                    e3 e3Var = this.C;
                    vp.x xVar = e3Var.s;
                    zt.a aVar2 = e3Var.q;
                    if (xVar.k()) {
                        List list = (List) ((ut.p) aVar2).j.getValue();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            PlayerItem playerItem = this.D;
                            if (zHasNext) {
                                Object next = it.next();
                                if (((yt.a) next).b != playerItem.getReciterId()) {
                                    arrayList.add(next);
                                }
                            } else if (arrayList.isEmpty() && ((o1) e3Var.c.d.getValue()).s) {
                                e3Var.r.getClass();
                                yt.c cVarX = tt.b.X(playerItem);
                                this.B = 1;
                                if (((ut.p) aVar2).g(cVarX, this) == aVar) {
                                    return aVar;
                                }
                            }
                        }
                    } else {
                        ((bq.a) e3Var.m).f(true, zp.b.DOWNLOADS);
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i2 == 0) {
                    ri.t1.O(obj);
                    uu.a aVar4 = this.C.d;
                    this.B = 1;
                    uu.w wVar = (uu.w) aVar4;
                    AudioPlayerAnalytics audioPlayerAnalytics = wVar.h;
                    PlayerItem playerItem2 = this.D;
                    audioPlayerAnalytics.logEvent(new AudioPlayerEvent.PlayerPlayTapped(String.valueOf(playerItem2.getSurahId())));
                    wVar.n(playerItem2);
                    int iIndexOf = ((u30.b) wVar.T.A.getValue()).indexOf(playerItem2);
                    if (iIndexOf == -1) {
                        objJ = b0Var2;
                    } else {
                        objJ = a40.c0.J(new as.y0(wVar, playerItem2, iIndexOf, null, 8), wVar.p, this);
                        if (objJ != aVar3) {
                            objJ = b0Var2;
                        }
                    }
                    if (objJ == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
        }
    }
}
