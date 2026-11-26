package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.AudioStoryCatalogLocalModel;
import java.util.ArrayList;

public final class d extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((AudioStoryCatalogLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllStories(arrayList);
    }

    public final void b(long j) {
        copyOnWrite();
        ((AudioStoryCatalogLocalModel) ((GeneratedMessageLite.Builder) this).instance).setFetchedAt(j);
    }
}
