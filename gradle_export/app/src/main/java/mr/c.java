package mr;

import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import h00.n;
import java.util.Set;

public final class c {
    HEADER(w50.c.g0("header")),
    RECITER_COLLECTION(n.X0(new String[]{"reciter_collection", "reciter_collections"})),
    SURAH_COLLECTIONS(w50.c.g0("surah_collections")),
    INSIGHTS(w50.c.g0(AuthAnalyticsSource.INSIGHTS)),
    AUDIO_STORIES(w50.c.g0("audio_stories"));

    public static final sg.f B = new sg.f();
    public static final n00.b I;
    public final Set A;

    static {
        I = f50.c.v(new c[]{r0, r1, r2, r3, r4});
    }

    public c(Set set) {
        super(str, i);
        this.A = set;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) H.clone();
    }
}
