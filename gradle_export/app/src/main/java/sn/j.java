package sn;

import com.mchutov.quranify.appwidget.presentation.favorites.FavoritesLargeAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.favorites.FavoritesMediumAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.favorites.FavoritesSmallAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.insights.InsightsMediumAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.insights.InsightsSmallAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.recently.RecentlyPlayedLargeAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.recently.RecentlyPlayedMediumAppWidgetReceiver;
import com.mchutov.quranify.appwidget.presentation.recently.RecentlyPlayedSmallAppWidgetReceiver;
import h00.q;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;

public abstract class j {
    public static final List a;
    public static final List b;
    public static final ArrayList c;
    public static final ArrayList d;

    static {
        rn.d dVar = new rn.d(2);
        b0 b0Var = a0.a;
        List listS = va.a.S(new d[]{new d(dVar, b0Var.b(RecentlyPlayedSmallAppWidgetReceiver.class)), new d(new rn.d(1), b0Var.b(RecentlyPlayedMediumAppWidgetReceiver.class)), new d(new rn.d(0), b0Var.b(RecentlyPlayedLargeAppWidgetReceiver.class)), new d(new in.d(2), b0Var.b(FavoritesSmallAppWidgetReceiver.class)), new d(new in.d(1), b0Var.b(FavoritesMediumAppWidgetReceiver.class)), new d(new in.d(0), b0Var.b(FavoritesLargeAppWidgetReceiver.class))});
        a = listS;
        List listS2 = va.a.S(new d[]{new d(new mn.c(1), b0Var.b(InsightsSmallAppWidgetReceiver.class)), new d(new mn.c(0), b0Var.b(InsightsMediumAppWidgetReceiver.class))});
        b = listS2;
        ArrayList arrayListY0 = q.Y0(listS2, listS);
        c = arrayListY0;
        ArrayList arrayList = new ArrayList(r.q0(arrayListY0, 10));
        Iterator it = arrayListY0.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).b);
        }
        d = arrayList;
    }
}
