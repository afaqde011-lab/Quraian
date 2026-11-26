package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.PlaylistReciterLocalModel;

public final class g0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(int i) {
        copyOnWrite();
        ((PlaylistReciterLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void b(boolean z) {
        copyOnWrite();
        ((PlaylistReciterLocalModel) ((GeneratedMessageLite.Builder) this).instance).setIsNew(z);
    }

    public final void c(String str) {
        copyOnWrite();
        ((PlaylistReciterLocalModel) ((GeneratedMessageLite.Builder) this).instance).setName(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((PlaylistReciterLocalModel) ((GeneratedMessageLite.Builder) this).instance).setPhotoUrl(str);
    }
}
