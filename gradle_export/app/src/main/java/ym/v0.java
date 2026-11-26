package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.SurahLocalModel;

public final class v0 extends GeneratedMessageLite.Builder implements w0 {
    public final void a(long j) {
        copyOnWrite();
        ((SurahLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSurahId(j);
    }

    public final void b(int i) {
        copyOnWrite();
        ((SurahLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSurahNumber(i);
    }
}
