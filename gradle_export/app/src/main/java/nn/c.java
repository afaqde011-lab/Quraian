package nn;

import com.mchutov.quranify.appwidget.presentation.playback.PlayFavoriteReciterCallback;
import com.mchutov.quranify.appwidget.presentation.playback.PlayRecentItemCallback;
import java.util.Arrays;

public abstract class c {
    public static final c6.c a = new c6.c("widgetReciterId");
    public static final c6.c b = new c6.c("widgetSurahNumber");
    public static final c6.c c = new c6.c("widgetCollectionId");
    public static final c6.c d = new c6.c("widgetSurahId");

    public static final e6.d a(int i) {
        return new e6.d(PlayFavoriteReciterCallback.class, a.a.U((c6.d[]) Arrays.copyOf(new c6.d[]{new c6.d(a, Integer.valueOf(i))}, 1)));
    }

    public static final e6.d b(int i, int i2, Integer num, Long l) {
        return new e6.d(PlayRecentItemCallback.class, a.a.U((c6.d[]) Arrays.copyOf(new c6.d[]{new c6.d(a, Integer.valueOf(i)), new c6.d(b, Integer.valueOf(i2)), new c6.d(c, Integer.valueOf(num != null ? num.intValue() : -1)), new c6.d(d, Long.valueOf(l != null ? l.longValue() : -1L))}, 4)));
    }
}
