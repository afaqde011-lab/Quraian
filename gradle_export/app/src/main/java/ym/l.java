package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.AudioStoryLanguageLocalModel;

public final class l extends GeneratedMessageLite.Builder implements m {
    public final void a(String str) {
        copyOnWrite();
        ((AudioStoryLanguageLocalModel) ((GeneratedMessageLite.Builder) this).instance).setCode(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((AudioStoryLanguageLocalModel) ((GeneratedMessageLite.Builder) this).instance).setLabel(str);
    }
}
