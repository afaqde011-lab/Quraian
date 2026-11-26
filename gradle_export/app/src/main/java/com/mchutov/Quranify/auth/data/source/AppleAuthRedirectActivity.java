package com.mchutov.quranify.auth.data.source;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import eo.p;
import g00.i;
import h00.q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import r30.k;
import r30.r;
import rd.a;
import ri.t1;
import sd.p1;
import w.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/auth/data/source/AppleAuthRedirectActivity;", "Landroid/app/Activity;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppleAuthRedirectActivity extends Activity {
    public final Object A = a.I(i.A, new p(this, 24));

    @Override
    public final void onCreate(Bundle bundle) {
        Uri data;
        boolean zA;
        String str;
        Object objS;
        Object objS2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            xo.a aVar = (xo.a) this.A.getValue();
            aVar.getClass();
            p1 p1Var = aVar.a;
            if (p1Var != null) {
                boolean z = true;
                if (m.a(data.getScheme(), "quranify") && m.a(data.getHost(), "apple-callback")) {
                    zA = true;
                } else {
                    zA = (m.a(data.getScheme(), "https") && m.a(data.getHost(), "quranify.pro")) ? m.a(data.getPath(), "/auth/apple/callback") : false;
                }
                if (zA) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Set<String> queryParameterNames = data.getQueryParameterNames();
                    m.d(queryParameterNames, "getQueryParameterNames(...)");
                    Iterator<T> it = queryParameterNames.iterator();
                    while (true) {
                        str = "";
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        String queryParameter = data.getQueryParameter(str2);
                        if (queryParameter != null) {
                            str = queryParameter;
                        }
                        linkedHashMap.put(str2, str);
                    }
                    String fragment = data.getFragment();
                    if (fragment != null) {
                        Iterator it2 = k.W0(fragment, new String[]{"&"}, 6).iterator();
                        while (it2.hasNext()) {
                            List listW0 = k.W0((String) it2.next(), new String[]{"="}, 2);
                            if (listW0.size() == 2) {
                                linkedHashMap.put(listW0.get(0), Uri.decode((String) listW0.get(1)));
                            }
                        }
                    }
                    String str3 = (String) linkedHashMap.get("error");
                    String str4 = (String) linkedHashMap.get("id_token");
                    String str5 = (String) linkedHashMap.get("code");
                    if (str5 == null) {
                        str5 = "";
                    }
                    aVar.a = null;
                    if (str3 == null || k.L0(str3)) {
                        if ((str4 == null || k.L0(str4)) || !m.a(linkedHashMap.get("state"), (String) p1Var.B)) {
                            if (((a40.k) p1Var.D).w()) {
                                ((a40.k) p1Var.D).resumeWith(t1.s(new AppleSignInFailedException()));
                            }
                        } else if (((a40.k) p1Var.D).w()) {
                            a40.k kVar = (a40.k) p1Var.D;
                            String str6 = (String) q.O0(1, k.W0(str4, new String[]{"."}, 6));
                            String str7 = str;
                            if (str6 != null) {
                                try {
                                    byte[] bArrDecode = Base64.decode(c.j(str6, r.t0((4 - (str6.length() % 4)) % 4, "=")), 10);
                                    m.d(bArrDecode, "decode(...)");
                                    objS = new String(bArrDecode, r30.a.a);
                                } catch (Throwable th) {
                                    objS = t1.s(th);
                                }
                                String str8 = (String) (objS instanceof g00.m ? null : objS);
                                str7 = str;
                                if (str8 != null) {
                                    try {
                                        objS2 = new JSONObject(str8).optString("email");
                                    } catch (Throwable th2) {
                                        objS2 = t1.s(th2);
                                    }
                                    Object obj = str;
                                    if (!(objS2 instanceof g00.m)) {
                                        obj = objS2;
                                    }
                                    str7 = (String) obj;
                                }
                            }
                            kVar.resumeWith(new ep.a(str4, str5, str7));
                        }
                    } else {
                        if (!m.a(str3, "user_cancelled_authorize") && !m.a(str3, "access_denied")) {
                            z = false;
                        }
                        if (z) {
                            if (((a40.k) p1Var.D).w()) {
                                ((a40.k) p1Var.D).resumeWith(null);
                            }
                        } else if (((a40.k) p1Var.D).w()) {
                            ((a40.k) p1Var.D).resumeWith(t1.s(new AppleSignInFailedException()));
                        }
                    }
                }
            }
        }
        Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
        intent2.addFlags(603979776);
        startActivity(intent2);
        finish();
    }
}
