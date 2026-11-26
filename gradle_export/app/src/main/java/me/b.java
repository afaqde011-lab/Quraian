package me;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import ba.m;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    public static final ReentrantLock f10877c = new ReentrantLock();

    public static b f10878d;

    public final ReentrantLock f10879a = new ReentrantLock();

    public final SharedPreferences f10880b;

    public b(Context context) {
        this.f10880b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        d0.h(context);
        ReentrantLock reentrantLock = f10877c;
        reentrantLock.lock();
        try {
            if (f10878d == null) {
                f10878d = new b(context.getApplicationContext());
            }
            return f10878d;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String f(String str, String str2) {
        return w.c.l(new StringBuilder(str.length() + 1 + String.valueOf(str2).length()), str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strE2) && (strE = e(f("googleSignInAccount", strE2))) != null) {
            try {
                return GoogleSignInAccount.a(strE);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        d0.h(googleSignInAccount);
        d0.h(googleSignInOptions);
        String str = googleSignInAccount.H;
        d("defaultGoogleSignInAccount", str);
        String strF = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.A;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.B;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.C;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.D;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.J;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.K;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.E;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.F;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.G);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.I;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, m.B);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.B);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(strF, jSONObject.toString());
            String strF2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.H;
            String str10 = googleSignInOptions.G;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.B;
                Collections.sort(arrayList, GoogleSignInOptions.O);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).B);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.C;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.D);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.F);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.E);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(strF2, jSONObject2.toString());
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.f10879a;
        reentrantLock.lock();
        try {
            this.f10880b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f10879a;
        reentrantLock.lock();
        try {
            return this.f10880b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
