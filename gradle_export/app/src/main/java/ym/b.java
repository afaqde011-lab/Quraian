package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.AudioStoryAuthorLocalModel;

public final class b extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(int i) {
        copyOnWrite();
        ((AudioStoryAuthorLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void b(String str) {
        copyOnWrite();
        ((AudioStoryAuthorLocalModel) ((GeneratedMessageLite.Builder) this).instance).setName(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((AudioStoryAuthorLocalModel) ((GeneratedMessageLite.Builder) this).instance).setPhotoUrl(str);
    }
}
