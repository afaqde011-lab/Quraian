package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.Reciter;
import java.util.ArrayList;
import java.util.List;

public final class n0 extends GeneratedMessageLite.Builder implements o0 {
    public final void a(List list) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).addAllCountryNameOtherLanguages(list);
    }

    public final void b(ArrayList arrayList) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).addAllMoshaf(arrayList);
    }

    public final void c(List list) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).addAllNameOtherLanguages(list);
    }

    public final void d(ArrayList arrayList) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).addAllSocialLinks(arrayList);
    }

    public final void e(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setBio(str);
    }

    public final void f(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setCountryCode(str);
    }

    public final void g(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setCountryName(str);
    }

    public final void h(int i) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setId(i);
    }

    public final void j(boolean z) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setIsNew(z);
    }

    public final void k(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setLetter(str);
    }

    public final void m(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setName(str);
    }

    public final void n(String str) {
        copyOnWrite();
        ((Reciter) ((GeneratedMessageLite.Builder) this).instance).setPhotoUrl(str);
    }
}
