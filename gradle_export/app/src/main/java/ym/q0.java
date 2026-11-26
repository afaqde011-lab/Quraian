package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.RecitersModel;
import java.util.ArrayList;

public final class q0 extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((RecitersModel) ((GeneratedMessageLite.Builder) this).instance).addAllReciters(arrayList);
    }
}
