package vv;

import a10.h0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import h00.q;
import h00.x;
import java.util.ArrayList;
import java.util.List;
import r30.k;

public final class d extends h0 {
    public final List X(wv.a aVar) {
        ArrayList arrayList;
        List<wv.a.C0026a> playlists;
        dw.a aVar2;
        Integer num;
        ?? arrayList2;
        dw.b bVar;
        Long l;
        dw.c cVar;
        String str;
        Integer num2;
        x xVar = x.A;
        if (aVar == null || (playlists = aVar.getPlaylists()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (wv.a.C0026a c0026a : playlists) {
                if (c0026a == null || (num = c0026a.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) {
                    aVar2 = null;
                } else {
                    int iIntValue = num.intValue();
                    List<wv.a.b> surahs = c0026a.getSurahs();
                    if (surahs != null) {
                        arrayList2 = new ArrayList();
                        for (wv.a.b bVar2 : surahs) {
                            if (bVar2 == null || (l = bVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) {
                                bVar = null;
                            } else {
                                long jLongValue = l.longValue();
                                Integer surahNumber = bVar2.getSurahNumber();
                                if (surahNumber != null) {
                                    int iIntValue2 = surahNumber.intValue();
                                    wv.a.c reciter = bVar2.getReciter();
                                    if (reciter == null || (num2 = reciter.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.ID_KEY java.lang.String()) == null) {
                                        cVar = null;
                                    } else {
                                        int iIntValue3 = num2.intValue();
                                        String str2 = reciter.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.NAME_KEY java.lang.String();
                                        String str3 = str2 == null ? "" : str2;
                                        String photoUrl = reciter.getPhotoUrl();
                                        String str4 = photoUrl == null ? "" : photoUrl;
                                        Boolean isNew = reciter.getIsNew();
                                        cVar = new dw.c(iIntValue3, str3, str4, isNew != null ? isNew.booleanValue() : false);
                                    }
                                    if (cVar == null) {
                                        bVar = null;
                                    } else {
                                        String title = bVar2.getTitle();
                                        if (title == null) {
                                            title = z3.W(bVar2.getSurahNumber().intValue());
                                            if (title == null) {
                                                str = "";
                                            } else {
                                                str = title;
                                            }
                                        } else {
                                            if (k.L0(title)) {
                                                title = null;
                                            }
                                            if (title == null) {
                                                title = z3.W(bVar2.getSurahNumber().intValue());
                                                if (title == null) {
                                                    str = "";
                                                } else {
                                                    str = title;
                                                }
                                            } else {
                                                str = title;
                                            }
                                        }
                                        List titleOtherLanguages = bVar2.getTitleOtherLanguages();
                                        if (titleOtherLanguages == null) {
                                            titleOtherLanguages = xVar;
                                        }
                                        ArrayList arrayListJ0 = q.J0(titleOtherLanguages);
                                        String audioUrl = bVar2.getAudioUrl();
                                        bVar = new dw.b(jLongValue, str, arrayListJ0, (audioUrl == null || k.L0(audioUrl)) ? null : audioUrl, iIntValue2, cVar);
                                    }
                                } else {
                                    bVar = null;
                                }
                            }
                            if (bVar != null) {
                                arrayList2.add(bVar);
                            }
                        }
                    } else {
                        arrayList2 = 0;
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = xVar;
                    }
                    String slug = c0026a.getSlug();
                    if (slug == null) {
                        slug = "";
                    }
                    String title2 = c0026a.getTitle();
                    if (title2 == null) {
                        title2 = "";
                    }
                    String subtitle = c0026a.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    String description = c0026a.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    String coverUrl = c0026a.getCoverUrl();
                    if (coverUrl == null) {
                        coverUrl = "";
                    }
                    Boolean isSpecial = c0026a.getIsSpecial();
                    boolean zBooleanValue = isSpecial != null ? isSpecial.booleanValue() : false;
                    List titleOtherLanguages2 = c0026a.getTitleOtherLanguages();
                    if (titleOtherLanguages2 == null) {
                        titleOtherLanguages2 = xVar;
                    }
                    aVar2 = new dw.a(iIntValue, slug, title2, subtitle, description, coverUrl, zBooleanValue, q.J0(titleOtherLanguages2), g4.d0((Iterable) arrayList2));
                }
                if (aVar2 != null) {
                    arrayList3.add(aVar2);
                }
            }
            arrayList = arrayList3;
        }
        return arrayList == null ? xVar : arrayList;
    }
}
