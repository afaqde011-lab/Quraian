package vn;

import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ri.t1;

public final class i extends m00.i implements u00.n {
    public int A;
    public final o B;
    public final ho.a C;

    public i(o oVar, ho.a aVar, k00.c cVar) {
        super(2, cVar);
        this.B = oVar;
        this.C = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new i(this.B, this.C, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        o oVar = this.B;
        if (i == 0) {
            t1.O(obj);
            xn.b bVar = oVar.a;
            this.A = 1;
            obj = bVar.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new Integer(((bo.a) it.next()).a));
        }
        Set setR1 = h00.q.r1(arrayList);
        AudioStoryAnalytics audioStoryAnalytics = oVar.e;
        ho.a aVar2 = this.C;
        int i2 = aVar2.a;
        List list = aVar2.g;
        int i3 = 0;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!setR1.contains(new Integer(((ho.g) it2.next()).a)) && (i3 = i3 + 1) < 0) {
                    va.a.j0();
                    throw null;
                }
            }
        }
        audioStoryAnalytics.logEvent(new AudioStoryAnalyticsEvent.AudioStoryDownloadStarted(i2, null, i3));
        return g00.b0.a;
    }
}
