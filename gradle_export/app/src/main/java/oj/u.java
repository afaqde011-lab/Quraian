package oj;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

public final class u {

    public static WeakReference f12109b;

    public ce.c f12110a;

    public final synchronized t a() {
        String str;
        t tVar;
        ce.c cVar = this.f12110a;
        synchronized (((ArrayDeque) cVar.E)) {
            str = (String) ((ArrayDeque) cVar.E).peek();
        }
        Pattern pattern = t.f12105d;
        tVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                tVar = new t(strArrSplit[0], strArrSplit[1]);
            }
        }
        return tVar;
    }
}
