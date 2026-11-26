package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.MoshafLocalModel;
import java.util.ArrayList;

public final class x extends GeneratedMessageLite.Builder implements y {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((MoshafLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllSurahNumber(arrayList);
    }

    public final void b(int i) {
        copyOnWrite();
        ((MoshafLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void c(int i) {
        copyOnWrite();
        ((MoshafLocalModel) ((GeneratedMessageLite.Builder) this).instance).setMoshafType(i);
    }

    public final void d(String str) {
        copyOnWrite();
        ((MoshafLocalModel) ((GeneratedMessageLite.Builder) this).instance).setName(str);
    }

    public final void e(String str) {
        copyOnWrite();
        ((MoshafLocalModel) ((GeneratedMessageLite.Builder) this).instance).setServer(str);
    }
}
