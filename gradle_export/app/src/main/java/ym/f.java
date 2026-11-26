package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.AudioStoryCatalogLocalModel;
import com.mchutov.quranify.AudioStoryCatalogsModel;

public final class f extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(String str, AudioStoryCatalogLocalModel audioStoryCatalogLocalModel) {
        str.getClass();
        copyOnWrite();
        ((AudioStoryCatalogsModel) ((GeneratedMessageLite.Builder) this).instance).getMutableCatalogsMap().put(str, audioStoryCatalogLocalModel);
    }
}
