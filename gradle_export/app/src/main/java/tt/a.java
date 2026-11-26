package tt;

import a10.h0;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.SurahModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

public final class a extends h0 {
    public static ArrayList X(DownloadedSurahModel from) {
        m.e(from, "from");
        List<SurahModel> surahsList = from.getSurahsList();
        m.d(surahsList, "getSurahsList(...)");
        ArrayList arrayList = new ArrayList();
        for (SurahModel surahModel : surahsList) {
            Object bVar = null;
            if (surahModel.getReciterId() > -1) {
                int reciterId = surahModel.getReciterId();
                long surahId = surahModel.hasSurahId() ? surahModel.getSurahId() : -1L;
                boolean migrated = surahModel.hasMigrated() ? surahModel.getMigrated() : false;
                Integer numValueOf = surahModel.hasSurahNumber() ? Integer.valueOf(surahModel.getSurahNumber()) : null;
                if (surahModel.hasCollectionId() && surahModel.getCollectionId() != -1) {
                    bVar = Integer.valueOf(surahModel.getCollectionId());
                }
                String uri = surahModel.getUri();
                m.d(uri, "getUri(...)");
                bVar = new yt.b(reciterId, surahId, migrated, numValueOf, bVar, uri, surahModel.getSurahSize());
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }
}
