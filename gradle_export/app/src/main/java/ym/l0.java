package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.RecentReciterModel;
import java.util.ArrayList;

public final class l0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((RecentReciterModel) ((GeneratedMessageLite.Builder) this).instance).addAllRecentReciters(arrayList);
    }

    public final void b() {
        copyOnWrite();
        ((RecentReciterModel) ((GeneratedMessageLite.Builder) this).instance).clearRecentReciters();
    }
}
