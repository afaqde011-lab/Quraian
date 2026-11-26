package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.FavoriteReciterModel;
import java.util.ArrayList;

public final class t extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((FavoriteReciterModel) ((GeneratedMessageLite.Builder) this).instance).addAllFavoriteReciters(arrayList);
    }

    public final void b() {
        copyOnWrite();
        ((FavoriteReciterModel) ((GeneratedMessageLite.Builder) this).instance).clearFavoriteReciters();
    }
}
