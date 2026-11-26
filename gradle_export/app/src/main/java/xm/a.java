package xm;

import android.content.Context;
import java.text.Normalizer;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import ri.t1;
import w.c;

public final class a {
    public final Context a;

    public a(Context context) {
        m.e(context, "context");
        this.a = context;
    }

    public final java.lang.String a(java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: xm.a.a(java.lang.String):java.lang.String");
    }

    public final String b(String str) {
        Object next;
        Object objS;
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        Iterator it = va.a.S(new String[]{a1.b.p("flags/", strNormalize, ".svg"), c.j(strNormalize, ".svg")}).iterator();
        while (it.hasNext()) {
            next = it.next();
            try {
                this.a.getAssets().open((String) next).close();
                objS = Boolean.TRUE;
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            Object obj = Boolean.FALSE;
            if (objS instanceof g00.m) {
                objS = obj;
            }
            if (((Boolean) objS).booleanValue()) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }
}
