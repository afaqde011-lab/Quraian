package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.AudioStoryEpisodeLocalModel;
import java.util.ArrayList;

public final class i extends GeneratedMessageLite.Builder implements j {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllAvailableLanguages(arrayList);
    }

    public final void b(String str) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setAudioUrl(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setCoverUrl(str);
    }

    public final void d(long j) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setDurationMs(j);
    }

    public final void e(long j) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setFreeDurationMs(j);
    }

    public final void f(int i) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void g(boolean z) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setIsFree(z);
    }

    public final void h(String str) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setLanguage(str);
    }

    public final void j(int i) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setOrder(i);
    }

    public final void k(String str) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setTitle(str);
    }

    public final void m(String str) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setTranscriptUrl(str);
    }

    public final void n(int i) {
        copyOnWrite();
        ((AudioStoryEpisodeLocalModel) ((GeneratedMessageLite.Builder) this).instance).setVersion(i);
    }
}
