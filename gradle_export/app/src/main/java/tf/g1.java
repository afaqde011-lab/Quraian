package tf;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class g1 implements k2 {
    public final h1 A;

    public g1(h1 h1Var) {
        this.A = h1Var;
    }

    public void a(String str, Bundle bundle) {
        String string;
        h1 h1Var = this.A;
        e1 e1Var = h1Var.G;
        w0 w0Var = h1Var.E;
        h1.g(e1Var);
        e1Var.V0();
        if (h1Var.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        h1.e(w0Var);
        w0Var.X.r(string);
        i7.m1 m1Var = w0Var.Y;
        h1Var.K.getClass();
        m1Var.f(System.currentTimeMillis());
    }

    @Override
    public void b(int i10, Throwable th2, byte[] bArr) {
        q0 q0Var;
        q0 q0Var2;
        int i11 = i10;
        h1 h1Var = this.A;
        q0 q0Var3 = h1Var.F;
        if (i11 == 200 || i11 == 204) {
            if (th2 == null) {
                w0 w0Var = h1Var.E;
                h1.e(w0Var);
                w0Var.U.b(true);
                if (bArr != null || bArr.length == 0) {
                    h1.g(q0Var3);
                    q0Var3.N.b("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr));
                    String strOptString = jSONObject.optString("deeplink", RuntimeVersion.SUFFIX);
                    if (TextUtils.isEmpty(strOptString)) {
                        h1.g(q0Var3);
                        q0Var3.N.b("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", RuntimeVersion.SUFFIX);
                    String strOptString3 = jSONObject.optString("gbraid", RuntimeVersion.SUFFIX);
                    String strOptString4 = jSONObject.optString("gad_source", RuntimeVersion.SUFFIX);
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    e4 e4Var = h1Var.I;
                    h1.e(e4Var);
                    h1 h1Var2 = (h1) e4Var.B;
                    if (TextUtils.isEmpty(strOptString)) {
                        q0Var2 = q0Var3;
                    } else {
                        Context context = h1Var2.A;
                        q0Var2 = q0Var3;
                        try {
                            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                            if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    bundle.putString("gbraid", strOptString3);
                                }
                                if (!TextUtils.isEmpty(strOptString4)) {
                                    bundle.putString("gad_source", strOptString4);
                                }
                                bundle.putString("gclid", strOptString2);
                                bundle.putString("_cis", "ddp");
                                h1Var.M.c1("auto", "_cmp", bundle);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return;
                                }
                                try {
                                    SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                                    editorEdit.putString("deeplink", strOptString);
                                    editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                                    if (editorEdit.commit()) {
                                        Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                        Context context2 = h1Var2.A;
                                        if (Build.VERSION.SDK_INT < 34) {
                                            context2.sendBroadcast(intent);
                                            return;
                                        } else {
                                            context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                            return;
                                        }
                                    }
                                    return;
                                } catch (RuntimeException e3) {
                                    q0 q0Var4 = ((h1) e4Var.B).F;
                                    h1.g(q0Var4);
                                    q0Var4.G.c(e3, "Failed to persist Deferred Deep Link. exception");
                                    return;
                                }
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            q0Var = q0Var2;
                            h1.g(q0Var);
                            q0Var.G.c(e, "Failed to parse the Deferred Deep Link response. exception");
                            return;
                        }
                    }
                    h1.g(q0Var2);
                    q0Var = q0Var2;
                    try {
                        q0Var.J.e("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                        return;
                    } catch (JSONException e11) {
                        e = e11;
                        h1.g(q0Var);
                        q0Var.G.c(e, "Failed to parse the Deferred Deep Link response. exception");
                        return;
                    }
                } catch (JSONException e12) {
                    e = e12;
                    q0Var = q0Var3;
                }
            }
        } else if (i11 == 304) {
            i11 = 304;
            if (th2 == null) {
                w0 w0Var2 = h1Var.E;
                h1.e(w0Var2);
                w0Var2.U.b(true);
                if (bArr != null) {
                }
                h1.g(q0Var3);
                q0Var3.N.b("Deferred Deep Link response empty.");
                return;
            }
        }
        h1.g(q0Var3);
        q0Var3.J.d("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i11), th2);
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        h1 h1Var = this.A;
        h1Var.K.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        w0 w0Var = h1Var.E;
        h1.e(w0Var);
        return jCurrentTimeMillis - w0Var.Y.e() > h1Var.D.c1(null, b0.f14573j0);
    }

    public boolean d() {
        w0 w0Var = this.A.E;
        h1.e(w0Var);
        return w0Var.Y.e() > 0;
    }
}
