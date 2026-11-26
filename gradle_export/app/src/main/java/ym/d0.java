package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.PlaylistLocalModel;
import java.util.ArrayList;
import java.util.List;

public final class d0 extends GeneratedMessageLite.Builder implements e0 {
    public final void a(ArrayList arrayList) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllSurahs(arrayList);
    }

    public final void b(List list) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).addAllTitleOtherLanguages(list);
    }

    public final void c(String str) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setCoverUrl(str);
    }

    public final void d(String str) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setDescription(str);
    }

    public final void e(int i) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void f(boolean z) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setIsSpecial(z);
    }

    public final void g(String str) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSlug(str);
    }

    public final void h(String str) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setSubtitle(str);
    }

    public final void j(String str) {
        copyOnWrite();
        ((PlaylistLocalModel) ((GeneratedMessageLite.Builder) this).instance).setTitle(str);
    }
}
