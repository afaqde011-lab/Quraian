package ym;

import com.google.protobuf.GeneratedMessageLite;
import com.mchutov.quranify.SocialLinkLocalModel;

public final class s0 extends GeneratedMessageLite.Builder implements t0 {
    public final void a(String str) {
        copyOnWrite();
        ((SocialLinkLocalModel) ((GeneratedMessageLite.Builder) this).instance).setLabel(str);
    }

    public final void b(String str) {
        copyOnWrite();
        ((SocialLinkLocalModel) ((GeneratedMessageLite.Builder) this).instance).setPlatform(str);
    }

    public final void c(String str) {
        copyOnWrite();
        ((SocialLinkLocalModel) ((GeneratedMessageLite.Builder) this).instance).setUrl(str);
    }
}
