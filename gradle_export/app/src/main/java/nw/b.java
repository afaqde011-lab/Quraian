package nw;

import a10.h0;
import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import bd.d;
import bi.g;
import com.google.firebase.messaging.FirebaseMessaging;
import com.revenuecat.purchases.Purchases;
import g00.b0;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.m;
import m00.c;
import oi.p;
import r30.k;
import retrofit2.HttpException;
import ri.t1;
import vp.x;
import wo.c0;
import xf.n;

public final class b {
    public final Context a;
    public final qw.a b;
    public final LocaleManager c;
    public final pw.a d;
    public final c0 e;
    public final x f;

    public b(Context context, qw.a aVar, LocaleManager localeManager, pw.a aVar2, c0 c0Var, x xVar) {
        this.a = context;
        this.b = aVar;
        this.c = localeManager;
        this.d = aVar2;
        this.e = c0Var;
        this.f = xVar;
    }

    public final String a() {
        if (n4.b.a(this.a, "android.permission.POST_NOTIFICATIONS") == 0) {
            return "granted";
        }
        return !this.d.a.getBoolean("notification_permission_asked", false) ? "not_determined" : "denied";
    }

    public final Object b(c cVar) throws Exception {
        a aVar;
        FirebaseMessaging firebaseMessaging;
        boolean zAreNotificationsEnabled;
        String str;
        String language;
        String str2;
        kw.a aVar2;
        boolean z;
        String str3;
        boolean z2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.F = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objI = aVar.D;
        l00.a aVar3 = l00.a.A;
        int i2 = aVar.F;
        if (i2 == 0) {
            t1.O(objI);
            d dVar = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(g.c());
            }
            firebaseMessaging.getClass();
            xf.g gVar = new xf.g();
            firebaseMessaging.f.execute(new p(firebaseMessaging, gVar, 1));
            n nVar = gVar.a;
            m.d(nVar, "getToken(...)");
            aVar.F = 1;
            objI = h0.i(nVar, aVar);
            if (objI != aVar3) {
            }
            return aVar3;
        }
        if (i2 == 1) {
            t1.O(objI);
        } else if (i2 == 2) {
            z = aVar.C;
            aVar2 = aVar.B;
            str2 = aVar.A;
            try {
                t1.O(objI);
            } catch (HttpException e) {
                e = e;
                zAreNotificationsEnabled = z;
                if (e.A == 401) {
                }
                throw e;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = aVar.C;
            str3 = aVar.A;
            t1.O(objI);
            str2 = str3;
            z = z2;
        }
        pw.a aVar4 = this.d;
        String value = str2 + "|" + z;
        m.e(value, "value");
        SharedPreferences.Editor editorEdit = aVar4.a.edit();
        editorEdit.putString("push_permission_fingerprint", value);
        editorEdit.apply();
        return b0.a;
        String str4 = (String) objI;
        if (str4 == null || k.L0(str4)) {
            return b0.a;
        }
        zAreNotificationsEnabled = new n4.p(this.a).b.areNotificationsEnabled();
        String strA = a();
        try {
            x xVar = this.f;
            String storefrontCountryCode = (String) xVar.h.getValue();
            if (storefrontCountryCode == null) {
                storefrontCountryCode = Purchases.INSTANCE.getSharedInstance().getStorefrontCountryCode();
            }
            str = storefrontCountryCode;
        } catch (Throwable unused) {
            str = null;
        }
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        m.d(string, "getString(...)");
        LocaleManager localeManager = this.c;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        if (locale == null || (language = locale.getLanguage()) == null) {
            language = "en";
        }
        String str5 = language;
        String id = TimeZone.getDefault().getID();
        m.d(id, "getID(...)");
        kw.a aVar5 = new kw.a(str4, string, str5, id, str, zAreNotificationsEnabled, strA);
        str2 = strA;
        try {
            qw.a aVar6 = this.b;
            aVar.A = str2;
            aVar.B = aVar5;
            aVar.C = zAreNotificationsEnabled;
            aVar.F = 2;
            if (aVar6.a(aVar5, aVar) != aVar3) {
                z = zAreNotificationsEnabled;
                pw.a aVar7 = this.d;
                String value2 = str2 + "|" + z;
                m.e(value2, "value");
                SharedPreferences.Editor editorEdit2 = aVar7.a.edit();
                editorEdit2.putString("push_permission_fingerprint", value2);
                editorEdit2.apply();
                return b0.a;
            }
        } catch (HttpException e2) {
            e = e2;
            aVar2 = aVar5;
            if (e.A == 401 || this.e.a.isAuthorized()) {
                throw e;
            }
            qw.a aVar8 = this.b;
            aVar.A = str2;
            aVar.B = null;
            aVar.C = zAreNotificationsEnabled;
            aVar.F = 3;
            if (aVar8.a(aVar2, aVar) != aVar3) {
                str3 = str2;
                z2 = zAreNotificationsEnabled;
                str2 = str3;
                z = z2;
                pw.a aVar9 = this.d;
                String value3 = str2 + "|" + z;
                m.e(value3, "value");
                SharedPreferences.Editor editorEdit3 = aVar9.a.edit();
                editorEdit3.putString("push_permission_fingerprint", value3);
                editorEdit3.apply();
                return b0.a;
            }
        }
        return aVar3;
    }
}
