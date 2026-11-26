package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.PlaylistEntryLocalModel;
import com.mchutov.quranify.PlaylistReciterLocalModel;
import java.util.List;

public final class a0 extends GeneratedMessageLite.Builder implements b0 {
    public final void a(List list) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllTitleOtherLanguages(list);
    }

    public final void b(String str) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setAudioUrl(str);
    }

    public final void c(long j) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(j);
    }

    public final void d(PlaylistReciterLocalModel playlistReciterLocalModel) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setReciter(playlistReciterLocalModel);
    }

    public final void e(int i) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSurahNumber(i);
    }

    public final void f(String str) {
        copyOnWrite();
        ((PlaylistEntryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setTitle(str);
    }
}
