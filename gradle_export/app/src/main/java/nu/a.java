package nu;

import android.content.SharedPreferences;
import com.revenuecat.purchases.common.Constants;
import h00.d0;
import h00.y;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r30.k;
import r30.r;

public final class a {
    public final SharedPreferences a;

    public a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static su.b a(Integer num, Integer num2) {
        if (num == null || num2 == null || num.intValue() < 1 || num2.intValue() < num.intValue()) {
            return null;
        }
        return new su.b(num.intValue(), num2.intValue());
    }

    public final Map b() {
        String string = this.a.getString("playerNew.memorization.lastBlocks", null);
        if (string == null) {
            return y.A;
        }
        List<String> listW0 = k.W0(string, new String[]{";"}, 6);
        ArrayList arrayList = new ArrayList();
        for (String str : listW0) {
            Integer numY0 = r.y0(k.e1(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR));
            su.b bVarA = a(r.y0(k.e1(k.a1(str, Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, str), "-")), r.y0(k.a1(str, "-", str)));
            g00.k kVar = (numY0 == null || bVarA == null) ? null : new g00.k(numY0, bVarA);
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return d0.Y(arrayList);
    }
}
