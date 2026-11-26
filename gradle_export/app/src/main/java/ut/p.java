package ut;

import a1.f2;
import a40.c0;
import a40.m0;
import a40.u1;
import a40.z;
import ab.y;
import android.content.Context;
import android.net.Uri;
import androidx.datastore.core.DataStore;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.SurahModel;
import com.mchutov.quranify.main.data.source.remote.DownloadWorker;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import com.mchutov.quranify.main.presentation.analytics.DownloadEvent;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d40.l1;
import d40.p1;
import d6.v0;
import g00.b0;
import h00.q;
import h00.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.v;
import lu.w;
import qd.s0;
import ri.t1;
import vp.x;
import ym.y0;
import za.h0;

public final class p implements zt.a {
    public final Context a;
    public final DataStore b;
    public final tt.a c;
    public final x d;
    public final tx.a e;
    public final DownloadAnalytics f;
    public final t1 g;
    public final z h;
    public u1 i;
    public final p1 j;

    public p(Context context, DataStore dataStore, tt.a aVar, x xVar, tx.a aVar2, DownloadAnalytics downloadAnalytics) {
        y yVarL0 = y.l0(context);
        f40.c cVarC = c0.c(m0.a);
        f40.c cVarC2 = c0.c(rd.a.P(c0.e(), f40.m.a));
        this.a = context;
        this.b = dataStore;
        this.c = aVar;
        this.d = xVar;
        this.e = aVar2;
        this.f = downloadAnalytics;
        this.g = yVarL0;
        this.h = cVarC2;
        this.j = d40.o.c(h00.x.A);
        yVarL0.H();
        ta.c0.M(cVarC, (k00.i) null, (u00.n) null, (u00.k) null, new l6.d(this, (k00.c) null, 17), 31);
    }

    public final void a() {
        u1 u1Var = this.i;
        if (u1Var != null) {
            u1Var.i(null);
        }
        this.i = null;
        y yVar = this.g;
        y yVar2 = yVar;
        za.i iVar = yVar2.b.m;
        ca.z zVar = yVar2.d.a;
        kotlin.jvm.internal.m.d(zVar, "getSerialTaskExecutor(...)");
        s0.k0(iVar, "CancelAllWork", zVar, new ab.x(yVar2, 1));
        yVar.H();
    }

    public final b0 b(yt.a aVar, m00.i iVar) {
        List<yt.a> listN1 = q.n1((Iterable) this.j.getValue());
        UUID uuid = aVar.a;
        t1 t1Var = this.g;
        t1Var.o(uuid);
        t1Var.H();
        ArrayList arrayList = new ArrayList();
        for (yt.a aVar2 : listN1) {
            yt.c cVar = null;
            if (!kotlin.jvm.internal.m.a(aVar.a, aVar2.a)) {
                int i = aVar2.b;
                long j = aVar2.c;
                int i2 = aVar2.d;
                Integer num = aVar2.e;
                String str = aVar2.f;
                if (str != null) {
                    cVar = new yt.c(i, j, i2, str, num);
                }
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        h(arrayList);
        l00.a aVar3 = l00.a.A;
        return b0.a;
    }

    public final Object c(m00.c cVar) {
        a aVar;
        int i;
        List<SurahModel> surahsList;
        w wVar;
        l1 l1Var;
        int i2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i3 = aVar.D;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.D = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objU = aVar.B;
        l00.a aVar2 = l00.a.A;
        int i4 = aVar.D;
        DataStore dataStore = this.b;
        k00.c cVar2 = null;
        if (i4 == 0) {
            t1.O(objU);
            d40.i data = dataStore.getData();
            aVar.D = 1;
            objU = d40.o.u(data, aVar);
            if (objU != aVar2) {
            }
            return aVar2;
        }
        if (i4 == 1) {
            t1.O(objU);
        } else {
            if (i4 == 2) {
                i = aVar.A;
                t1.O(objU);
                y0 y0VarNewBuilder = SurahModel.newBuilder();
                y0VarNewBuilder.d(-1);
                wVar = new w((SurahModel) y0VarNewBuilder.build(), cVar2, 16);
                aVar.A = i;
                aVar.D = 3;
                if (dataStore.updateData(wVar, aVar) != aVar2) {
                    l1Var = new l1(2, null, 11);
                    aVar.A = i;
                    aVar.D = 4;
                    if (dataStore.updateData(l1Var, aVar) != aVar2) {
                        i2 = i;
                    }
                }
                return aVar2;
            }
            if (i4 == 3) {
                i = aVar.A;
                t1.O(objU);
                l1Var = new l1(2, null, 11);
                aVar.A = i;
                aVar.D = 4;
                if (dataStore.updateData(l1Var, aVar) != aVar2) {
                    i2 = i;
                }
                return aVar2;
            }
            if (i4 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = aVar.A;
            t1.O(objU);
        }
        this.f.logEvent(new DownloadEvent.AllDownloadsDeleted(i2));
        return b0.a;
        DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) objU;
        i = 0;
        if (downloadedSurahModel != null && (surahsList = downloadedSurahModel.getSurahsList()) != null && !surahsList.isEmpty()) {
            Iterator<T> it = surahsList.iterator();
            while (it.hasNext()) {
                if (((SurahModel) it.next()).getReciterId() != -1 && (i = i + 1) < 0) {
                    va.a.j0();
                    throw null;
                }
            }
        }
        h40.e eVar = m0.a;
        h40.d dVar = h40.d.C;
        bt.y0 y0Var = new bt.y0(this, cVar2, 10);
        aVar.A = i;
        aVar.D = 2;
        if (c0.J(y0Var, dVar, aVar) != aVar2) {
            y0 y0VarNewBuilder2 = SurahModel.newBuilder();
            y0VarNewBuilder2.d(-1);
            wVar = new w((SurahModel) y0VarNewBuilder2.build(), cVar2, 16);
            aVar.A = i;
            aVar.D = 3;
            if (dataStore.updateData(wVar, aVar) != aVar2) {
                l1Var = new l1(2, null, 11);
                aVar.A = i;
                aVar.D = 4;
                if (dataStore.updateData(l1Var, aVar) != aVar2) {
                    i2 = i;
                    this.f.logEvent(new DownloadEvent.AllDownloadsDeleted(i2));
                    return b0.a;
                }
            }
        }
        return aVar2;
    }

    public final Object d(int i, m00.c cVar) {
        b bVar;
        ArrayList<SurahModel> arrayList;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.E = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objU = bVar.C;
        l00.a aVar = l00.a.A;
        int i3 = bVar.E;
        DataStore dataStore = this.b;
        if (i3 == 0) {
            t1.O(objU);
            if (r00.i.Y(new File(this.a.getFilesDir(), g4.c.f(i, "collections/")))) {
                d40.i data = dataStore.getData();
                bVar.A = i;
                bVar.E = 1;
                objU = d40.o.u(data, bVar);
                if (objU != aVar) {
                }
                return aVar;
            }
            return b0.a;
        }
        if (i3 == 1) {
            i = bVar.A;
            t1.O(objU);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = bVar.B;
            t1.O(objU);
        }
        for (SurahModel surahModel : arrayList) {
            this.f.logEvent(new DownloadEvent.DownloadDeleted(surahModel.getSurahId(), surahModel.getSurahNumber(), surahModel.getReciterId()));
        }
        return b0.a;
        DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) objU;
        List<SurahModel> surahsList = downloadedSurahModel != null ? downloadedSurahModel.getSurahsList() : null;
        if (surahsList == null) {
            surahsList = h00.x.A;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : surahsList) {
            if (((SurahModel) obj).getCollectionId() == i) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : surahsList) {
            if (((SurahModel) obj2).getCollectionId() != i) {
                arrayList3.add(obj2);
            }
        }
        v0 v0Var = new v0(arrayList3, (k00.c) null, 1);
        bVar.B = arrayList2;
        bVar.A = i;
        bVar.E = 2;
        if (dataStore.updateData(v0Var, bVar) != aVar) {
            arrayList = arrayList2;
            while (r10.hasNext()) {
                this.f.logEvent(new DownloadEvent.DownloadDeleted(surahModel.getSurahId(), surahModel.getSurahNumber(), surahModel.getReciterId()));
            }
            return b0.a;
        }
        return aVar;
    }

    public final Object e(int i, m00.c cVar) {
        c cVar2;
        int i2;
        int i3;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i4 = cVar2.E;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar2.E = i4 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objU = cVar2.C;
        l00.a aVar = l00.a.A;
        int i5 = cVar2.E;
        DataStore dataStore = this.b;
        if (i5 == 0) {
            t1.O(objU);
            if (r00.i.Y(new File(this.a.getFilesDir(), g4.c.f(i, "reciters/")))) {
                d40.i data = dataStore.getData();
                cVar2.A = i;
                cVar2.E = 1;
                objU = d40.o.u(data, cVar2);
                if (objU != aVar) {
                }
                return aVar;
            }
            return b0.a;
        }
        if (i5 == 1) {
            i = cVar2.A;
            t1.O(objU);
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = cVar2.B;
            i2 = cVar2.A;
            t1.O(objU);
        }
        this.f.logEvent(new DownloadEvent.DownloadsDeletedForReciter(i2, i3));
        return b0.a;
        DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) objU;
        List<SurahModel> surahsList = downloadedSurahModel != null ? downloadedSurahModel.getSurahsList() : null;
        if (surahsList == null) {
            surahsList = h00.x.A;
        }
        int i6 = 0;
        if (!surahsList.isEmpty()) {
            for (SurahModel surahModel : surahsList) {
                if (surahModel.getCollectionId() == -1 && surahModel.getReciterId() == i && (i6 = i6 + 1) < 0) {
                    va.a.j0();
                    throw null;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : surahsList) {
            SurahModel surahModel2 = (SurahModel) obj;
            if (surahModel2.getCollectionId() != -1 || surahModel2.getReciterId() != i) {
                arrayList.add(obj);
            }
        }
        v0 v0Var = new v0(arrayList, (k00.c) null, 2);
        cVar2.A = i;
        cVar2.B = i6;
        cVar2.E = 2;
        if (dataStore.updateData(v0Var, cVar2) != aVar) {
            i2 = i;
            i3 = i6;
            this.f.logEvent(new DownloadEvent.DownloadsDeletedForReciter(i2, i3));
            return b0.a;
        }
        return aVar;
    }

    public final Object f(PlayerItem playerItem, m00.c cVar) {
        d dVar;
        PlayerItem playerItem2;
        v vVar;
        Uri uri;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.E = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.C;
        l00.a aVar = l00.a.A;
        int i2 = dVar.E;
        if (i2 == 0) {
            t1.O(obj);
            String playerUri = playerItem.getPlayerUri();
            String path = (playerUri == null || (uri = Uri.parse(playerUri)) == null) ? null : uri.getPath();
            if (path == null) {
                path = "";
            }
            new File(path).delete();
            v vVar2 = new v();
            f2 f2Var = new f2(vVar2, playerItem, (k00.c) null, 21);
            dVar.A = playerItem;
            dVar.B = vVar2;
            dVar.E = 1;
            if (this.b.updateData(f2Var, dVar) == aVar) {
                return aVar;
            }
            playerItem2 = playerItem;
            vVar = vVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = dVar.B;
            playerItem2 = dVar.A;
            t1.O(obj);
        }
        if (vVar.A) {
            this.f.logEvent(new DownloadEvent.DownloadDeleted(playerItem2.getSurahId(), playerItem2.getSurahNumber(), playerItem2.getReciterId()));
        }
        return b0.a;
    }

    public final Object g(yt.c cVar, m00.c cVar2) {
        e eVar;
        UUID uuidRandomUUID;
        String str;
        String strO;
        String str2;
        yt.c cVar3;
        String str3;
        String str4;
        UUID uuid;
        String str5;
        int i;
        int i2;
        g00.k[] kVarArr;
        za.b0 b0Var;
        int i3;
        za.l lVar;
        List listR;
        y yVar;
        yt.c cVar4 = cVar;
        if (cVar2 instanceof e) {
            eVar = (e) cVar2;
            int i4 = eVar.H;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.H = i4 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar2);
            }
        } else {
            eVar = new e(this, cVar2);
        }
        Object obj = eVar.F;
        l00.a aVar = l00.a.A;
        int i5 = eVar.H;
        b0 b0Var2 = b0.a;
        y yVar2 = this.g;
        if (i5 == 0) {
            t1.O(obj);
            yVar2.H();
            uuidRandomUUID = UUID.randomUUID();
            String str6 = "RECITER_" + cVar4.a + "|" + cVar4.b;
            str = "COLLECTION_ID|" + cVar4.e;
            strO = a1.b.o("url|", cVar4.d);
            bt.t1 t1Var = new bt.t1(yVar2.A("downloads"), 15);
            eVar.A = cVar4;
            eVar.B = uuidRandomUUID;
            eVar.C = str6;
            eVar.D = str;
            eVar.E = strO;
            eVar.H = 1;
            Object objU = d40.o.u(t1Var, eVar);
            if (objU != aVar) {
                str2 = str6;
                obj = objU;
            }
            return aVar;
        }
        if (i5 == 1) {
            String str7 = eVar.E;
            str = eVar.D;
            str2 = eVar.C;
            uuidRandomUUID = eVar.B;
            yt.c cVar5 = eVar.A;
            t1.O(obj);
            strO = str7;
            cVar4 = cVar5;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = eVar.E;
            str3 = eVar.D;
            str5 = eVar.C;
            uuid = eVar.B;
            cVar3 = eVar.A;
            t1.O(obj);
        }
        za.x xVar = new za.x(DownloadWorker.class);
        long j = cVar3.b;
        i = cVar3.a;
        i2 = cVar3.c;
        kVarArr = new g00.k[]{new g00.k("surahId", new Long(j)), new g00.k("surahNumber", new Integer(i2)), new g00.k("collectionId", cVar3.e), new g00.k("url", cVar3.d), new g00.k("reciterId", new Integer(i))};
        b0Var = new za.b0();
        for (i3 = 0; i3 < 5; i3++) {
            g00.k kVar = kVarArr[i3];
            b0Var.b(kVar.B, (String) kVar.A);
        }
        za.x xVarH = xVar.h(b0Var.a());
        kotlin.jvm.internal.m.b(uuid);
        za.y yVarB = xVarH.f(uuid).a("downloads").a(str5).a(str4).a(str3).b();
        lVar = za.l.C;
        yVar2.getClass();
        listR = va.a.R(yVarB);
        yVar = yVar2;
        if (!listR.isEmpty()) {
            throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
        }
        new ab.q(yVar, "download_queue", lVar, listR, 0).n0();
        this.f.logEvent(new DownloadEvent.DownloadStarted(cVar3.b, i2, i));
        return b0Var2;
        UUID uuid2 = uuidRandomUUID;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((h0) it.next()).c.contains(str2)) {
                    return b0Var2;
                }
            }
        }
        kotlin.jvm.internal.m.b(uuid2);
        String str8 = str2;
        yt.a aVar2 = new yt.a(uuid2, cVar4.a, cVar4.b, cVar4.c, cVar4.e, cVar4.d, new Float(0.0f));
        eVar.A = cVar4;
        eVar.B = uuid2;
        eVar.C = str8;
        eVar.D = str;
        eVar.E = strO;
        eVar.H = 2;
        m(aVar2, eVar);
        if (b0Var2 != aVar) {
            cVar3 = cVar4;
            str3 = str;
            str4 = strO;
            uuid = uuid2;
            str5 = str8;
            za.x xVar2 = new za.x(DownloadWorker.class);
            long j2 = cVar3.b;
            i = cVar3.a;
            i2 = cVar3.c;
            kVarArr = new g00.k[]{new g00.k("surahId", new Long(j2)), new g00.k("surahNumber", new Integer(i2)), new g00.k("collectionId", cVar3.e), new g00.k("url", cVar3.d), new g00.k("reciterId", new Integer(i))};
            b0Var = new za.b0();
            while (i3 < 5) {
                g00.k kVar2 = kVarArr[i3];
                b0Var.b(kVar2.B, (String) kVar2.A);
            }
            za.x xVarH2 = xVar2.h(b0Var.a());
            kotlin.jvm.internal.m.b(uuid);
            za.y yVarB2 = xVarH2.f(uuid).a("downloads").a(str5).a(str4).a(str3).b();
            lVar = za.l.C;
            yVar2.getClass();
            listR = va.a.R(yVarB2);
            yVar = yVar2;
            if (!listR.isEmpty()) {
                throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
            }
            new ab.q(yVar, "download_queue", lVar, listR, 0).n0();
            this.f.logEvent(new DownloadEvent.DownloadStarted(cVar3.b, i2, i));
            return b0Var2;
        }
        return aVar;
    }

    public final void h(ArrayList arrayList) {
        this.i = ta.c0.M(this.h, (k00.i) null, (u00.n) null, (u00.k) null, new gc.n(this, arrayList, (k00.c) null, 4), 31);
    }

    public final Object i(m00.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.C = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objU = kVar.A;
        l00.a aVar = l00.a.A;
        int i2 = kVar.C;
        if (i2 == 0) {
            t1.O(objU);
            j jVar = new j(this.b.getData(), this.c, 0);
            kVar.C = 1;
            objU = d40.o.u(jVar, kVar);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
        }
        List list = (List) objU;
        return list == null ? h00.x.A : list;
    }

    public final Object j(List list, m00.c cVar) {
        l lVar;
        Object next;
        Long l;
        bx.b bVarA;
        u30.b bVar;
        Object next2;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.D = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objU = lVar.B;
        l00.a aVar = l00.a.A;
        int i2 = lVar.D;
        b0 b0Var = b0.a;
        DataStore dataStore = this.b;
        if (i2 == 0) {
            t1.O(objU);
            d40.i data = dataStore.getData();
            lVar.A = list;
            lVar.D = 1;
            objU = d40.o.u(data, lVar);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
            return b0Var;
        }
        list = lVar.A;
        t1.O(objU);
        DownloadedSurahModel downloadedSurahModel = (DownloadedSurahModel) objU;
        k00.c cVar2 = null;
        List<SurahModel> surahsList = downloadedSurahModel != null ? downloadedSurahModel.getSurahsList() : null;
        if (surahsList == null) {
            surahsList = h00.x.A;
        }
        if (!list.isEmpty() && !surahsList.isEmpty() && !surahsList.isEmpty()) {
            Iterator<T> it = surahsList.iterator();
            while (it.hasNext()) {
                if (!((SurahModel) it.next()).getMigrated()) {
                    ArrayList arrayList = new ArrayList(r.q0(surahsList, 10));
                    for (SurahModel surahModel : surahsList) {
                        if (!surahModel.hasMigrated() || !surahModel.getMigrated()) {
                            Iterator it2 = list.iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (surahModel.getReciterId() != ((bx.c) next).a);
                            bx.c cVar3 = (bx.c) next;
                            if (cVar3 == null || (bVarA = cVar3.a()) == null || (bVar = bVarA.e) == null) {
                                l = null;
                            } else {
                                Iterator<E> it3 = bVar.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it3.next();
                                } while (surahModel.getSurahNumber() != ((bx.f) next2).b);
                                bx.f fVar = (bx.f) next2;
                                if (fVar != null) {
                                    l = new Long(fVar.a);
                                } else {
                                    l = null;
                                }
                            }
                            y0 y0VarNewBuilder = SurahModel.newBuilder();
                            y0VarNewBuilder.d(surahModel.getReciterId());
                            y0VarNewBuilder.e(l != null ? l.longValue() : -1L);
                            y0VarNewBuilder.g(surahModel.getUri());
                            y0VarNewBuilder.f(surahModel.getSurahSize());
                            y0VarNewBuilder.a();
                            y0VarNewBuilder.b(-1);
                            y0VarNewBuilder.c();
                            surahModel = (SurahModel) y0VarNewBuilder.build();
                        }
                        arrayList.add(surahModel);
                    }
                    bt.y0 y0Var = new bt.y0(arrayList, cVar2, 11);
                    lVar.A = null;
                    lVar.D = 2;
                    if (dataStore.updateData(y0Var, lVar) == aVar) {
                        return aVar;
                    }
                }
            }
        }
        return b0Var;
    }

    public final j k() {
        return new j(this.b.getData(), this.c, 1);
    }

    public final Object l(String str, int i, long j, Integer num, long j2, m00.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i2 = nVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.C = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object obj = nVar.A;
        l00.a aVar = l00.a.A;
        int i3 = nVar.C;
        if (i3 == 0) {
            t1.O(obj);
            o oVar = new o(i, j, str, num, j2, null);
            nVar.C = 1;
            if (this.b.updateData(oVar, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        boolean zK = this.d.k();
        tx.a aVar2 = this.e;
        aVar2.getClass();
        if (zK) {
            aVar2.b(ux.a.C);
        }
        return b0.a;
    }

    public final b0 m(yt.a aVar, m00.c cVar) {
        p1 p1Var = this.j;
        ArrayList arrayListO1 = q.o1((Collection) p1Var.getValue());
        Iterator it = arrayListO1.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (kotlin.jvm.internal.m.a(((yt.a) it.next()).a, aVar.a)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            arrayListO1.set(i, aVar);
        } else {
            arrayListO1.add(aVar);
        }
        p1Var.emit(arrayListO1, cVar);
        l00.a aVar2 = l00.a.A;
        return b0.a;
    }
}
