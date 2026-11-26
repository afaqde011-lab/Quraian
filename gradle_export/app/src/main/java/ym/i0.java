package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.PlaylistsModel;
import java.util.ArrayList;

public final class i0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((PlaylistsModel) ((GeneratedMessageLite.Builder) this).instance).addAllPlaylists(arrayList);
    }
}
