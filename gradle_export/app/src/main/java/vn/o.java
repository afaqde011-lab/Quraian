package vn;

import a40.m0;
import a40.w1;
import android.net.NetworkRequest;
import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import g1.s1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ri.t1;
import za.j0;

public final class o implements io.a {
    public final xn.b a;
    public final ao.a b;
    public final tn.d c;
    public final ab.y d;
    public final AudioStoryAnalytics e;
    public final a40.z f;

    public o(xn.b bVar, ao.a aVar, tn.d dVar, ab.y yVar, AudioStoryAnalytics audioStoryAnalytics) {
        w1 w1VarE = a40.c0.e();
        h40.e eVar = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, h40.d.C).plus(new q3.m(a40.w.A, 1)));
        this.a = bVar;
        this.b = aVar;
        this.c = dVar;
        this.d = yVar;
        this.e = audioStoryAnalytics;
        this.f = cVarC;
        a40.c0.y(cVarC, null, null, new rm.c(this, (k00.c) null), 3);
    }

    public final void a(int i, Integer num) {
        Integer numValueOf = Integer.valueOf(i);
        if (num != null) {
            numValueOf = null;
        }
        this.e.logEvent(new AudioStoryAnalyticsEvent.AudioStoryDownloadCancelled(numValueOf, num));
        this.d.j0("audio_story:" + i);
    }

    public final java.lang.Object b(int r6, m00.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: vn.o.b(int, m00.c):java.lang.Object");
    }

    public final Object c(int i, m00.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.D = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objA = hVar.B;
        l00.a aVar = l00.a.A;
        int i3 = hVar.D;
        g00.b0 b0Var = g00.b0.a;
        xn.b bVar = this.a;
        if (i3 == 0) {
            t1.O(objA);
            this.e.logEvent(new AudioStoryAnalyticsEvent.AudioStoryDownloadDeleted(i, null));
            this.d.j0("audio_story:" + i);
            hVar.A = i;
            hVar.D = 1;
            objA = bVar.a(hVar);
            if (objA != aVar) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objA);
            return b0Var;
        }
        i = hVar.A;
        t1.O(objA);
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objA) {
            if (((bo.a) obj).c == i) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = ((bo.a) it.next()).a;
            ao.a aVar2 = this.b;
            aVar2.getClass();
            File file = new File(aVar2.a, String.valueOf(i4));
            file.mkdirs();
            r00.i.Y(file);
        }
        hVar.A = i;
        hVar.D = 2;
        Object objN = rd.a.N(bVar.a, false, true, new s1(i, 17), hVar);
        if (objN != l00.a.A) {
            objN = b0Var;
        }
        return objN == aVar ? aVar : b0Var;
    }

    public final void d(int i, int i2) {
        this.e.logEvent(new AudioStoryAnalyticsEvent.AudioStoryDownloadStarted(i, Integer.valueOf(i2), 1));
        e(i, Integer.valueOf(i2), false);
    }

    public final void e(int i, Integer num, boolean z) {
        String strF;
        za.x xVar = new za.x(AudioStoryDownloadWorker.class);
        g00.k[] kVarArr = {new g00.k("storyId", Integer.valueOf(i)), new g00.k("episodeId", Integer.valueOf(num != null ? num.intValue() : -1)), new g00.k("silent", Boolean.valueOf(z))};
        za.b0 b0Var = new za.b0();
        for (int i2 = 0; i2 < 3; i2++) {
            g00.k kVar = kVarArr[i2];
            b0Var.b(kVar.B, (String) kVar.A);
        }
        za.x xVarH = xVar.h(b0Var.a());
        za.w wVar = za.w.A;
        ((j0) xVarH).c.j = new za.e(new ib.f((NetworkRequest) null), za.w.B, false, false, false, false, -1L, -1L, h00.q.r1(new LinkedHashSet()));
        za.x xVarE = xVarH.e(za.a.B, 30L, TimeUnit.SECONDS);
        if (!z) {
            za.c0 c0Var = za.c0.A;
            hb.p pVar = ((j0) xVarE).c;
            pVar.q = true;
            pVar.r = c0Var;
        }
        za.x xVarA = xVarE.a("audio_story_download");
        if (z) {
            xVarA.a("audio_story_silent");
        }
        za.x xVarA2 = xVarA.a("audio_story:" + i);
        if (num != null) {
            xVarA2.a("audio_story_episode:" + num.intValue());
        }
        za.y yVarB = xVarA2.b();
        if (num == null || (strF = w.c.h(i, num.intValue(), "audio_story_download_", "_")) == null) {
            strF = g4.c.f(i, "audio_story_download_");
        }
        this.d.x(strF, za.l.B, yVarB);
    }

    public final Object f(int i, m00.c cVar) {
        ao.a aVar = this.b;
        aVar.getClass();
        File file = new File(aVar.a, String.valueOf(i));
        file.mkdirs();
        r00.i.Y(file);
        Object objN = rd.a.N(this.a.a, false, true, new s1(i, 16), cVar);
        l00.a aVar2 = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objN != aVar2) {
            objN = b0Var;
        }
        return objN == aVar2 ? objN : b0Var;
    }

    public final java.lang.Object g(java.util.Set r8, m00.c r9) {
        throw new UnsupportedOperationException("Method not decompiled: vn.o.g(java.util.Set, m00.c):java.lang.Object");
    }

    public final Object h(List list, m00.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i = nVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.D = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objA = nVar.B;
        l00.a aVar = l00.a.A;
        int i2 = nVar.D;
        if (i2 == 0) {
            t1.O(objA);
            nVar.A = list;
            nVar.D = 1;
            objA = this.a.a(nVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = nVar.A;
            t1.O(objA);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (Iterable) objA) {
            Integer num = new Integer(((bo.a) obj).a);
            Object arrayList = linkedHashMap.get(num);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(num, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        if (!linkedHashMap.isEmpty()) {
            for (ho.a aVar2 : list) {
                for (ho.g gVar : aVar2.g) {
                    List list2 = (List) linkedHashMap.get(new Integer(gVar.a));
                    if (list2 != null) {
                        int iP = h00.d0.P(h00.r.q0(list2, 10));
                        if (iP < 16) {
                            iP = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iP);
                        for (Object obj2 : list2) {
                            linkedHashMap2.put(((bo.a) obj2).b, obj2);
                        }
                        bo.a aVar3 = (bo.a) linkedHashMap2.get(gVar.c);
                        boolean z = false;
                        boolean z2 = aVar3 != null && aVar3.e < gVar.m;
                        List list3 = gVar.n;
                        if (!list3.isEmpty()) {
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                if (!linkedHashMap2.containsKey(((ho.m) it.next()).a)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (z2 || z) {
                            e(aVar2.a, new Integer(gVar.a), true);
                        }
                    }
                }
            }
        }
        return g00.b0.a;
    }
}
