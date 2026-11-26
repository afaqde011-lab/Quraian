package tn;

import a10.h0;
import h00.q;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class i extends h0 {
    public final ArrayList X(un.j jVar) {
        Iterator it;
        ho.a aVar;
        Integer num;
        ho.b bVar;
        Iterator it2;
        ho.g gVar;
        Integer num2;
        long j;
        Long l;
        Long lValueOf;
        Iterator it3;
        Object mVar;
        String code;
        String str;
        String str2;
        List stories = jVar != null ? jVar.getStories() : null;
        x xVar = x.A;
        if (stories == null) {
            stories = xVar;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = stories.iterator();
        while (it4.hasNext()) {
            un.a aVar2 = (un.a) it4.next();
            if (aVar2 == null || (num = aVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) {
                it = it4;
                aVar = null;
            } else {
                int iIntValue = num.intValue();
                String slug = aVar2.getSlug();
                String str3 = slug == null ? "" : slug;
                String title = aVar2.getTitle();
                String str4 = title == null ? "" : title;
                String description = aVar2.getDescription();
                String str5 = (description == null || r30.k.L0(description)) ? null : description;
                String coverUrl = aVar2.getCoverUrl();
                String str6 = (coverUrl == null || r30.k.L0(coverUrl)) ? null : coverUrl;
                un.b author = aVar2.getAuthor();
                if (author == null || (str2 = author.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String()) == null) {
                    bVar = null;
                } else {
                    if (r30.k.L0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                        bVar = null;
                    } else {
                        Integer num3 = author.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String();
                        String photoUrl = author.getPhotoUrl();
                        if (photoUrl == null || r30.k.L0(photoUrl)) {
                            photoUrl = null;
                        }
                        bVar = new ho.b(num3, str2, photoUrl);
                    }
                }
                List<un.d> episodes = aVar2.getEpisodes();
                if (episodes == null) {
                    episodes = xVar;
                }
                ArrayList arrayList2 = new ArrayList();
                for (un.d dVar : episodes) {
                    if (dVar == null || (num2 = dVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) {
                        it2 = it4;
                        gVar = null;
                    } else {
                        int iIntValue2 = num2.intValue();
                        String audioUrl = dVar.getAudioUrl();
                        if (audioUrl == null) {
                            it2 = it4;
                            gVar = null;
                        } else {
                            String str7 = !r30.k.L0(audioUrl) ? audioUrl : null;
                            if (str7 == null) {
                                it2 = it4;
                                gVar = null;
                            } else {
                                Long durationMs = dVar.getDurationMs();
                                if (durationMs != null) {
                                    long jLongValue = durationMs.longValue();
                                    if (jLongValue < 0) {
                                        jLongValue = 0;
                                    }
                                    j = jLongValue;
                                } else {
                                    j = 0;
                                }
                                Integer order = dVar.getOrder();
                                int iIntValue3 = order != null ? order.intValue() : 0;
                                String language = dVar.getLanguage();
                                if (language == null) {
                                    language = "";
                                }
                                String title2 = dVar.getTitle();
                                if (title2 == null) {
                                    title2 = "";
                                }
                                String coverUrl2 = dVar.getCoverUrl();
                                if (coverUrl2 == null || r30.k.L0(coverUrl2)) {
                                    coverUrl2 = null;
                                }
                                String transcriptUrl = dVar.getTranscriptUrl();
                                if (transcriptUrl == null || r30.k.L0(transcriptUrl)) {
                                    l = null;
                                    transcriptUrl = null;
                                } else {
                                    l = null;
                                }
                                Boolean isFree = dVar.getIsFree();
                                Boolean bool = Boolean.TRUE;
                                boolean zA = kotlin.jvm.internal.m.a(isFree, bool);
                                Long freeDurationMs = dVar.getFreeDurationMs();
                                if (freeDurationMs != null) {
                                    long jLongValue2 = freeDurationMs.longValue();
                                    if (jLongValue2 < 0) {
                                        jLongValue2 = 0;
                                    }
                                    if (j > 0 && jLongValue2 > j) {
                                        jLongValue2 = j;
                                    }
                                    lValueOf = Long.valueOf(jLongValue2);
                                } else {
                                    lValueOf = l;
                                }
                                Long positionMs = dVar.getPositionMs();
                                long jLongValue3 = positionMs != null ? positionMs.longValue() : 0L;
                                if (jLongValue3 < 0) {
                                    jLongValue3 = 0;
                                }
                                if (j > 0 && jLongValue3 > j) {
                                    jLongValue3 = j;
                                }
                                boolean zA2 = kotlin.jvm.internal.m.a(dVar.getIsCompleted(), bool);
                                Integer num4 = dVar.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
                                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                                List availableLanguages = dVar.getAvailableLanguages();
                                if (availableLanguages == null) {
                                    availableLanguages = xVar;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it5 = availableLanguages.iterator();
                                while (it5.hasNext()) {
                                    un.i iVar = (un.i) it5.next();
                                    if (iVar == null || (code = iVar.getCode()) == null) {
                                        it3 = it5;
                                    } else {
                                        it3 = it5;
                                        String str8 = !r30.k.L0(code) ? code : l;
                                        if (str8 != 0) {
                                            String label = iVar.getLabel();
                                            if (label != null) {
                                                boolean zL0 = r30.k.L0(label);
                                                Object obj = label;
                                                if (zL0) {
                                                    obj = l;
                                                }
                                                if (obj == null) {
                                                    String upperCase = str8.toUpperCase(Locale.ROOT);
                                                    kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
                                                    str = upperCase;
                                                } else {
                                                    str = obj;
                                                }
                                            } else {
                                                String upperCase2 = str8.toUpperCase(Locale.ROOT);
                                                kotlin.jvm.internal.m.d(upperCase2, "toUpperCase(...)");
                                                str = upperCase2;
                                            }
                                            mVar = new ho.m(str8, str);
                                        }
                                        if (mVar != null) {
                                            arrayList3.add(mVar);
                                        }
                                        it5 = it3;
                                        it4 = it4;
                                    }
                                    it4 = it4;
                                    mVar = l;
                                    if (mVar != null) {
                                        arrayList3.add(mVar);
                                    }
                                    it5 = it3;
                                    it4 = it4;
                                }
                                it2 = it4;
                                gVar = new ho.g(iIntValue2, iIntValue3, language, title2, str7, j, coverUrl2, transcriptUrl, zA, lValueOf, jLongValue3, zA2, iIntValue4, arrayList3);
                            }
                        }
                    }
                    if (gVar != null) {
                        arrayList2.add(gVar);
                    }
                    it4 = it2;
                }
                it = it4;
                ArrayList arrayList4 = new ArrayList(r.q0(arrayList2, 10));
                int i = 0;
                for (Object obj2 : arrayList2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        va.a.k0();
                        throw null;
                    }
                    ho.g gVarA = (ho.g) obj2;
                    if (gVarA.b <= 0) {
                        gVarA = ho.g.a(gVarA, i2, null, null, 0L, null, 0L, false, 0, 16381);
                    }
                    arrayList4.add(gVarA);
                    i = i2;
                }
                List listI1 = q.i1(arrayList4, new ba.m(22));
                Integer num5 = aVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
                aVar = new ho.a(iIntValue, str3, str4, str5, str6, bVar, listI1, num5 != null ? num5.intValue() : 0);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            it4 = it;
        }
        return arrayList;
    }
}
