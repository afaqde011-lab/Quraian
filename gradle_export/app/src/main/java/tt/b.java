package tt;

import a10.h0;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import kotlin.jvm.internal.m;
import yt.c;

public final class b extends h0 {
    public static c X(PlayerItem from) {
        m.e(from, "from");
        return new c(from.getReciterId(), from.getSurahId(), from.getSurahNumber(), from.getPlayerUrl(), from.getCollectionId());
    }
}
