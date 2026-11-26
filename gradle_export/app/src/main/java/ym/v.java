package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.mchutov.quranify.ListeningTimerModel;

public final class v extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    public final void a(long j) {
        copyOnWrite();
        ((ListeningTimerModel) ((GeneratedMessageLite.Builder) this).instance).setOverallPassedMs(j);
    }

    public final void b() {
        copyOnWrite();
        ((ListeningTimerModel) ((GeneratedMessageLite.Builder) this).instance).setOverallPassedSeconds(0L);
    }

    public final void c(String str) {
        copyOnWrite();
        ((ListeningTimerModel) ((GeneratedMessageLite.Builder) this).instance).setTodaysDate(str);
    }
}
