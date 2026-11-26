package zm;

import android.content.SharedPreferences;
import bk.m;
import com.mchutov.quranify.appwidget.domain.model.RecentPlayEntry;
import h00.x;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ri.t1;

public final class b {
    public final SharedPreferences a;
    public final m b;
    public final Type c = new a().getType();

    public b(SharedPreferences sharedPreferences, m mVar) {
        this.a = sharedPreferences;
        this.b = mVar;
    }

    public final List a() {
        Object objS;
        String string = this.a.getString("WIDGET_RECENT_PLAYS_KEY", null);
        List list = x.A;
        if (string == null) {
            return list;
        }
        try {
            objS = (List) this.b.e(string, this.c);
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        List list2 = (List) (objS instanceof g00.m ? null : objS);
        if (list2 != null) {
            list = list2;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((RecentPlayEntry) obj).getSourceKey())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
