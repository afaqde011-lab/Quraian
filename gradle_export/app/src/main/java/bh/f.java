package bh;

import a2.n;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.internal.measurement.x5;
import e7.u;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONObject;
import sd.p1;
import v5.r;

public final class f implements v5.k {
    public String A;

    public f(String str) {
        this.A = g4.c.e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public f(String str, boolean z10) {
        this.A = str;
    }

    public static void b(p1 p1Var, wi.d dVar) {
        String str = dVar.f16094a;
        if (str != null) {
            p1Var.w("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        p1Var.w("X-CRASHLYTICS-API-CLIENT-TYPE", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        p1Var.w("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.3");
        p1Var.w("Accept", "application/json");
        String str2 = dVar.f16095b;
        if (str2 != null) {
            p1Var.w("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = dVar.f16096c;
        if (str3 != null) {
            p1Var.w("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = dVar.f16097d;
        if (str4 != null) {
            p1Var.w("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = dVar.f16098e.c().f11990a;
        if (str5 != null) {
            p1Var.w("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    public static HashMap d(wi.d dVar) {
        HashMap map = new HashMap();
        map.put("build_version", dVar.f16101h);
        map.put("display_version", dVar.f16100g);
        map.put("source", Integer.toString(dVar.f16102i));
        String str = dVar.f16099f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public static f f(u uVar) {
        String str;
        uVar.O(2);
        int iA = uVar.A();
        int i10 = iA >> 1;
        int iA2 = ((uVar.A() >> 3) & 31) | ((iA & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7 || i10 == 8) {
            str = "dvhe";
        } else if (i10 == 9) {
            str = "dvav";
        } else {
            if (i10 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbQ = x5.q(str);
        sbQ.append(i10 < 10 ? ".0" : ".");
        sbQ.append(i10);
        return new f(x5.j(iA2, iA2 < 10 ? ".0" : ".", sbQ), false);
    }

    public static String i(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e3) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e3);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return x5.m(str, " : ", str2);
    }

    @Override
    public Object a() {
        return this;
    }

    @Override
    public boolean c(CharSequence charSequence, int i10, int i11, r rVar) {
        if (!TextUtils.equals(charSequence.subSequence(i10, i11), this.A)) {
            return true;
        }
        rVar.f15480c = (rVar.f15480c & 3) | 4;
        return false;
    }

    public JSONObject e(n nVar) {
        String str = this.A;
        int i10 = nVar.f167b;
        li.c cVar = li.c.f10296a;
        cVar.e("Settings response code was: " + i10);
        if (i10 != 200 && i10 != 201 && i10 != 202 && i10 != 203) {
            String str2 = "Settings request failed; (status: " + i10 + ") from " + str;
            if (cVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = nVar.f166a;
        try {
            return new JSONObject(str3);
        } catch (Exception e3) {
            cVar.f("Failed to parse settings JSON from " + str, e3);
            cVar.f("Settings response " + str3, null);
            return null;
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", i(this.A, str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", i(this.A, str, objArr));
        }
    }
}
