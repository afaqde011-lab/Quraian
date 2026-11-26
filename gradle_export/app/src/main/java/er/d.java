package er;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import bk.m;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsSource;
import com.revenuecat.purchases.Purchases;
import d40.p1;
import g00.n;
import h00.q;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh.o;
import ri.t1;
import vp.x;

public final class d {
    public final gr.a a;
    public final cr.a b;
    public final SharedPreferences c;
    public final LocaleManager d;
    public final x e;
    public final m f;
    public final p1 g;
    public final j40.c h;
    public boolean i;

    public d(gr.a aVar, cr.a aVar2, SharedPreferences sharedPreferences, LocaleManager localeManager, x xVar) {
        List listS;
        m mVar = new m();
        this.a = aVar;
        this.b = aVar2;
        this.c = sharedPreferences;
        this.d = localeManager;
        this.e = xVar;
        this.f = mVar;
        ArrayList arrayListE = e();
        if (arrayListE != null) {
            listS = o.U(arrayListE);
        } else {
            mr.b bVar = new mr.b("header", mr.c.HEADER);
            mr.b bVar2 = new mr.b("audio-stories", mr.c.AUDIO_STORIES);
            mr.c cVar = mr.c.RECITER_COLLECTION;
            listS = va.a.S(new mr.b[]{bVar, bVar2, new mr.b("my-favourites", cVar), new mr.b("new-reciters", cVar), new mr.b("surah-collections", mr.c.SURAH_COLLECTIONS), new mr.b(AuthAnalyticsSource.INSIGHTS, mr.c.INSIGHTS)});
        }
        this.g = d40.o.c(listS);
        this.h = j40.d.a();
    }

    public static final void a(d dVar, ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mr.b bVar = (mr.b) it.next();
            arrayList2.add(new dr.b(bVar.a, (String) q.K0(bVar.b.A)));
        }
        dr.a aVar = new dr.a(arrayList2);
        SharedPreferences.Editor editorEdit = dVar.c.edit();
        editorEdit.putString(dVar.c(str), dVar.f.i(aVar));
        editorEdit.apply();
    }

    public static final Object b(d dVar, m00.c cVar) {
        b bVar;
        Object objE;
        x xVar = dVar.e;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar, cVar);
            }
        } else {
            bVar = new b(dVar, cVar);
        }
        Object obj = bVar.A;
        l00.a aVar = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(obj);
            String storefrontCountryCode = (String) xVar.h.getValue();
            if (storefrontCountryCode == null) {
                storefrontCountryCode = Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode();
            }
            if (storefrontCountryCode != null) {
                return storefrontCountryCode;
            }
            bVar.C = 1;
            objE = xVar.e(bVar);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objE = ((n) obj).A;
        }
        if (objE instanceof g00.m) {
            objE = null;
        }
        return (String) objE;
    }

    public final String c(String str) {
        String strD = d();
        if (str == null) {
            str = "";
        }
        return "home_screen_sections_v1_" + strD + "_" + str;
    }

    public final String d() {
        String language;
        LocaleManager localeManager = this.d;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
    }

    public final ArrayList e() {
        Object objS;
        x xVar = this.e;
        String storefrontCountryCode = (String) xVar.h.getValue();
        if (storefrontCountryCode == null) {
            storefrontCountryCode = Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode();
        }
        String string = this.c.getString(c(storefrontCountryCode), null);
        if (string == null) {
            return null;
        }
        try {
            objS = (dr.a) this.f.d(dr.a.class, string);
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = null;
        }
        ArrayList arrayListX = this.b.X((dr.a) objS);
        if (arrayListX.isEmpty()) {
            return null;
        }
        return arrayListX;
    }

    public final java.lang.Object f(boolean r9, m00.c r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: er.d.f(boolean, m00.c):java.lang.Object");
    }
}
