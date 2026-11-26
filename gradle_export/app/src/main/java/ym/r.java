package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.DownloadedSurahModel;
import com.mchutov.quranify.SurahModel;
import java.util.ArrayList;

public final class r extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((DownloadedSurahModel) ((GeneratedMessageLite.Builder) this).instance).addAllSurahs(arrayList);
    }

    public final void b(SurahModel surahModel) {
        copyOnWrite();
        ((DownloadedSurahModel) ((GeneratedMessageLite.Builder) this).instance).addSurahs(surahModel);
    }

    public final void c() {
        copyOnWrite();
        ((DownloadedSurahModel) ((GeneratedMessageLite.Builder) this).instance).clearSurahs();
    }

    public final void d(int i) {
        copyOnWrite();
        ((DownloadedSurahModel) ((GeneratedMessageLite.Builder) this).instance).removeSurahs(i);
    }
}
