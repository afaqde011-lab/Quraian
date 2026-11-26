package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.AudioStoryAuthorLocalModel;
import com.mchutov.quranify.AudioStoryLocalModel;
import java.util.ArrayList;

public final class o extends GeneratedMessageLite.Builder implements p {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllEpisodes(arrayList);
    }

    public final void b(AudioStoryAuthorLocalModel audioStoryAuthorLocalModel) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setAuthor(audioStoryAuthorLocalModel);
    }

    public final void c(String str) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setCoverUrl(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setDescription(str);
    }

    public final void e(int i) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void f(String str) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSlug(str);
    }

    public final void g(String str) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setTitle(str);
    }

    public final void h(int i) {
        copyOnWrite();
        ((AudioStoryLocalModel) ((GeneratedMessageLite.Builder) this).instance).setVersion(i);
    }
}
