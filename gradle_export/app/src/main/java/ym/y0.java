package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.SurahModel;

public final class y0 extends GeneratedMessageLite.Builder implements z0 {
    public final void a() {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).clearSurahNumber();
    }

    public final void b(int i) {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setCollectionId(i);
    }

    public final void c() {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setMigrated(true);
    }

    public final void d(int i) {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setReciterId(i);
    }

    public final void e(long j) {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setSurahId(j);
    }

    public final void f(long j) {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setSurahSize(j);
    }

    public final void g(String str) {
        copyOnWrite();
        ((SurahModel) ((GeneratedMessageLite.Builder) this).instance).setUri(str);
    }
}
