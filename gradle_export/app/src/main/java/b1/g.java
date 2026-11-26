package b1;

import android.net.Uri;
import com.mchutov.quranify.AudioStoryAuthorLocalModel;
import com.mchutov.quranify.AudioStoryCatalogLocalModel;
import com.mchutov.quranify.AudioStoryEpisodeLocalModel;
import com.mchutov.quranify.AudioStoryLanguageLocalModel;
import com.mchutov.quranify.AudioStoryLocalModel;
import d40.f1;
import d40.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class g implements d40.j {
    public final int A;
    public final Object B;
    public final Object C;

    public g(d40.j jVar, u00.n nVar) {
        this.A = 5;
        this.B = jVar;
        this.C = (m00.i) nVar;
    }

    public g(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    private final Object c(Object obj, k00.c cVar) {
        vn.j jVar;
        if (cVar instanceof vn.j) {
            jVar = (vn.j) cVar;
            int i10 = jVar.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.B = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new vn.j(this, cVar);
            }
        } else {
            jVar = new vn.j(this, cVar);
        }
        Object obj2 = jVar.A;
        l00.a aVar = l00.a.A;
        int i11 = jVar.B;
        int i12 = 1;
        if (i11 == 0) {
            t1.O(obj2);
            d40.j jVar2 = (d40.j) this.B;
            List list = (List) obj;
            tn.d dVar = ((vn.o) this.C).c;
            ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bo.a aVar2 = (bo.a) it.next();
                dVar.getClass();
                kotlin.jvm.internal.m.e(aVar2, "from");
                int i13 = aVar2.a;
                String str = aVar2.b;
                int i14 = aVar2.c;
                String str2 = aVar2.d;
                int i15 = aVar2.e;
                long j9 = aVar2.f;
                String string = Uri.fromFile(new File(aVar2.g)).toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                String str3 = aVar2.h;
                tn.d dVar2 = dVar;
                Iterator it2 = it;
                arrayList.add(new ho.d(i13, str, i14, str2, i15, j9, string, str3 != null ? Uri.fromFile(new File(str3)).toString() : null, aVar2.i));
                dVar = dVar2;
                it = it2;
                i12 = 1;
            }
            jVar.B = i12;
            if (jVar2.emit(arrayList, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
        }
        return g00.b0.a;
    }

    private final Object d(Object obj, k00.c cVar) {
        vs.b bVar;
        if (cVar instanceof vs.b) {
            bVar = (vs.b) cVar;
            int i10 = bVar.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.B = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new vs.b(this, cVar);
            }
        } else {
            bVar = new vs.b(this, cVar);
        }
        Object obj2 = bVar.A;
        l00.a aVar = l00.a.A;
        int i11 = bVar.B;
        if (i11 == 0) {
            t1.O(obj2);
            d40.j jVar = (d40.j) this.B;
            long jE = ((vs.c) this.C).b.e();
            Long l = new Long((jE - (jE % 60)) * 1000);
            bVar.B = 1;
            if (jVar.emit(l, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
        }
        return g00.b0.a;
    }

    private final Object e(Object obj, k00.c cVar) {
        wn.b bVar;
        h00.x xVar;
        ho.b bVar2;
        if (cVar instanceof wn.b) {
            bVar = (wn.b) cVar;
            int i10 = bVar.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.B = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new wn.b(this, cVar);
            }
        } else {
            bVar = new wn.b(this, cVar);
        }
        Object obj2 = bVar.A;
        l00.a aVar = l00.a.A;
        int i11 = bVar.B;
        if (i11 == 0) {
            t1.O(obj2);
            d40.j jVar = (d40.j) this.B;
            AudioStoryCatalogLocalModel audioStoryCatalogLocalModel = (AudioStoryCatalogLocalModel) obj;
            if (audioStoryCatalogLocalModel != null) {
                tn.c cVar2 = ((wn.d) this.C).b;
                List storiesList = audioStoryCatalogLocalModel.getStoriesList();
                kotlin.jvm.internal.m.d(storiesList, "getStoriesList(...)");
                h00.x arrayList = new ArrayList(h00.r.q0(storiesList, 10));
                for (Iterator it = storiesList.iterator(); it.hasNext(); it = it) {
                    AudioStoryLocalModel audioStoryLocalModel = (AudioStoryLocalModel) it.next();
                    int id2 = audioStoryLocalModel.getId();
                    String slug = audioStoryLocalModel.getSlug();
                    kotlin.jvm.internal.m.d(slug, "getSlug(...)");
                    String title = audioStoryLocalModel.getTitle();
                    String str = "getTitle(...)";
                    kotlin.jvm.internal.m.d(title, "getTitle(...)");
                    String description = audioStoryLocalModel.hasDescription() ? audioStoryLocalModel.getDescription() : null;
                    String coverUrl = audioStoryLocalModel.hasCoverUrl() ? audioStoryLocalModel.getCoverUrl() : null;
                    if (audioStoryLocalModel.hasAuthor()) {
                        AudioStoryAuthorLocalModel author = audioStoryLocalModel.getAuthor();
                        kotlin.jvm.internal.m.d(author, "getAuthor(...)");
                        Integer numValueOf = author.hasId() ? Integer.valueOf(author.getId()) : null;
                        String name = author.getName();
                        kotlin.jvm.internal.m.d(name, "getName(...)");
                        bVar2 = new ho.b(numValueOf, name, author.hasPhotoUrl() ? author.getPhotoUrl() : null);
                    } else {
                        bVar2 = null;
                    }
                    List episodesList = audioStoryLocalModel.getEpisodesList();
                    kotlin.jvm.internal.m.d(episodesList, "getEpisodesList(...)");
                    ArrayList arrayList2 = new ArrayList(h00.r.q0(episodesList, 10));
                    Iterator it2 = episodesList.iterator();
                    while (it2.hasNext()) {
                        AudioStoryEpisodeLocalModel audioStoryEpisodeLocalModel = (AudioStoryEpisodeLocalModel) it2.next();
                        int id3 = audioStoryEpisodeLocalModel.getId();
                        int order = audioStoryEpisodeLocalModel.getOrder();
                        String language = audioStoryEpisodeLocalModel.getLanguage();
                        Iterator it3 = it2;
                        kotlin.jvm.internal.m.d(language, "getLanguage(...)");
                        String title2 = audioStoryEpisodeLocalModel.getTitle();
                        kotlin.jvm.internal.m.d(title2, str);
                        String audioUrl = audioStoryEpisodeLocalModel.getAudioUrl();
                        kotlin.jvm.internal.m.d(audioUrl, "getAudioUrl(...)");
                        long durationMs = audioStoryEpisodeLocalModel.getDurationMs();
                        String coverUrl2 = audioStoryEpisodeLocalModel.hasCoverUrl() ? audioStoryEpisodeLocalModel.getCoverUrl() : null;
                        String transcriptUrl = audioStoryEpisodeLocalModel.hasTranscriptUrl() ? audioStoryEpisodeLocalModel.getTranscriptUrl() : null;
                        boolean isFree = audioStoryEpisodeLocalModel.getIsFree();
                        Long lValueOf = audioStoryEpisodeLocalModel.hasFreeDurationMs() ? Long.valueOf(audioStoryEpisodeLocalModel.getFreeDurationMs()) : null;
                        int version = audioStoryEpisodeLocalModel.getVersion();
                        List availableLanguagesList = audioStoryEpisodeLocalModel.getAvailableLanguagesList();
                        kotlin.jvm.internal.m.d(availableLanguagesList, "getAvailableLanguagesList(...)");
                        AudioStoryLocalModel audioStoryLocalModel2 = audioStoryLocalModel;
                        ArrayList arrayList3 = new ArrayList(h00.r.q0(availableLanguagesList, 10));
                        Iterator it4 = availableLanguagesList.iterator();
                        while (it4.hasNext()) {
                            AudioStoryLanguageLocalModel audioStoryLanguageLocalModel = (AudioStoryLanguageLocalModel) it4.next();
                            Iterator it5 = it4;
                            String code = audioStoryLanguageLocalModel.getCode();
                            kotlin.jvm.internal.m.d(code, "getCode(...)");
                            String label = audioStoryLanguageLocalModel.getLabel();
                            kotlin.jvm.internal.m.d(label, "getLabel(...)");
                            arrayList3.add(new ho.m(code, label));
                            it4 = it5;
                            str = str;
                        }
                        arrayList2.add(new ho.g(id3, order, language, title2, audioUrl, durationMs, coverUrl2, transcriptUrl, isFree, lValueOf, 0L, false, version, arrayList3));
                        audioStoryLocalModel = audioStoryLocalModel2;
                        it2 = it3;
                    }
                    arrayList.add(new ho.a(id2, slug, title, description, coverUrl, bVar2, arrayList2, audioStoryLocalModel.getVersion()));
                }
                xVar = arrayList;
            } else {
                xVar = null;
            }
            if (xVar == null) {
                xVar = h00.x.A;
            }
            bVar.B = 1;
            if (jVar.emit(xVar, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
        }
        return g00.b0.a;
    }

    public Object b(int i10, k00.c cVar) {
        j1 j1Var;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i11 = j1Var.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                j1Var.C = i11 - Integer.MIN_VALUE;
            } else {
                j1Var = new j1(this, cVar);
            }
        } else {
            j1Var = new j1(this, cVar);
        }
        Object obj = j1Var.A;
        l00.a aVar = l00.a.A;
        int i12 = j1Var.C;
        g00.b0 b0Var = g00.b0.a;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        t1.O(obj);
        if (i10 > 0) {
            kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.B;
            if (!vVar.A) {
                vVar.A = true;
                d40.j jVar = (d40.j) this.C;
                f1 f1Var = f1.A;
                j1Var.C = 1;
                if (jVar.emit(f1Var, j1Var) == aVar) {
                    return aVar;
                }
            }
        }
        return b0Var;
    }

    public final java.lang.Object emit(java.lang.Object r36, k00.c r37) {
        throw new UnsupportedOperationException("Method not decompiled: b1.g.emit(java.lang.Object, k00.c):java.lang.Object");
    }
}
