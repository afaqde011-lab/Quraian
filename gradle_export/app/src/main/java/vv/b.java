package vv;

import a10.h0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.PlaylistEntryLocalModel;
import com.mchutov.quranify.PlaylistLocalModel;
import com.mchutov.quranify.PlaylistReciterLocalModel;
import com.mchutov.quranify.PlaylistsModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;

public final class b extends h0 {
    public static ArrayList X(PlaylistsModel from) {
        m.e(from, "from");
        List<PlaylistLocalModel> playlistsList = from.getPlaylistsList();
        m.d(playlistsList, "getPlaylistsList(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = playlistsList.iterator();
        while (it.hasNext()) {
            PlaylistLocalModel playlistLocalModel = (PlaylistLocalModel) it.next();
            List<PlaylistEntryLocalModel> surahsList = playlistLocalModel.getSurahsList();
            m.d(surahsList, "getSurahsList(...)");
            ArrayList arrayList2 = new ArrayList();
            for (PlaylistEntryLocalModel playlistEntryLocalModel : surahsList) {
                dw.b bVar = null;
                if (playlistEntryLocalModel.hasReciter()) {
                    long id = playlistEntryLocalModel.getId();
                    String title = playlistEntryLocalModel.getTitle();
                    m.b(title);
                    String str = !k.L0(title) ? title : null;
                    List<String> titleOtherLanguagesList = playlistEntryLocalModel.getTitleOtherLanguagesList();
                    m.d(titleOtherLanguagesList, "getTitleOtherLanguagesList(...)");
                    String audioUrl = playlistEntryLocalModel.getAudioUrl();
                    m.b(audioUrl);
                    String str2 = !k.L0(audioUrl) ? audioUrl : null;
                    int surahNumber = playlistEntryLocalModel.getSurahNumber();
                    PlaylistReciterLocalModel reciter = playlistEntryLocalModel.getReciter();
                    m.d(reciter, "getReciter(...)");
                    int id2 = reciter.getId();
                    String name = reciter.getName();
                    m.d(name, "getName(...)");
                    String photoUrl = reciter.getPhotoUrl();
                    m.d(photoUrl, "getPhotoUrl(...)");
                    bVar = new dw.b(id, str, titleOtherLanguagesList, str2, surahNumber, new dw.c(id2, name, photoUrl, reciter.getIsNew()));
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
                it = it;
            }
            Iterator it2 = it;
            int id3 = playlistLocalModel.getId();
            String slug = playlistLocalModel.getSlug();
            m.d(slug, "getSlug(...)");
            String title2 = playlistLocalModel.getTitle();
            m.d(title2, "getTitle(...)");
            String subtitle = playlistLocalModel.getSubtitle();
            m.d(subtitle, "getSubtitle(...)");
            String description = playlistLocalModel.getDescription();
            m.d(description, "getDescription(...)");
            String coverUrl = playlistLocalModel.getCoverUrl();
            m.d(coverUrl, "getCoverUrl(...)");
            boolean isSpecial = playlistLocalModel.getIsSpecial();
            List<String> titleOtherLanguagesList2 = playlistLocalModel.getTitleOtherLanguagesList();
            m.d(titleOtherLanguagesList2, "getTitleOtherLanguagesList(...)");
            arrayList.add(new dw.a(id3, slug, title2, subtitle, description, coverUrl, isSpecial, titleOtherLanguagesList2, g4.d0(arrayList2)));
            it = it2;
        }
        return arrayList;
    }
}
