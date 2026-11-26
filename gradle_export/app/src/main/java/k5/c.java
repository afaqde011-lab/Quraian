package k5;

import ah.d;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import cf.e;
import cf.h;
import cf.i;
import cf.n;
import cf.q;
import f5.g;
import f5.o;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import ke.j;
import kotlin.jvm.internal.m;
import nf.u0;
import org.json.JSONException;
import org.json.JSONObject;
import r30.k;

public final class c extends j5.b {

    public static final int f8966j = 0;

    public final Context f8967e;

    public g f8968f;

    public Executor f8969g;

    public CancellationSignal f8970h;

    public final d f8971i;

    public c(Context context) {
        m.e(context, "context");
        this.f8967e = context;
        this.f8971i = new d(this, new Handler(Looper.getMainLooper()), 1);
    }

    public final o e(j jVar) throws GetCredentialCancellationException, GetPublicKeyCredentialDomException, GetCredentialUnknownException {
        Object obj;
        String string;
        ?? mVar;
        q qVar = jVar.I;
        String str = jVar.G;
        String str2 = jVar.A;
        String str3 = jVar.F;
        if (str3 != null) {
            m.d(str2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            mVar = new f5.m(str3, 2, bundle);
        } else {
            k10.a jSONObject = null;
            if (str != null) {
                m.d(str2, "getId(...)");
                String str4 = jVar.B;
                String str5 = str4 != null ? str4 : null;
                String str6 = jVar.C;
                String str7 = str6 != null ? str6 : null;
                String str8 = jVar.D;
                String str9 = str8 != null ? str8 : null;
                String str10 = jVar.H;
                String str11 = str10 != null ? str10 : null;
                Uri uri = jVar.E;
                jSONObject = new yf.c(str2, str, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (qVar != null) {
                i iVar = qVar.F;
                cf.g gVar = qVar.E;
                h hVar = qVar.D;
                LinkedHashMap linkedHashMap = l5.a.f10032a;
                JSONObject jSONObject2 = new JSONObject();
                if (hVar != null) {
                    obj = hVar;
                } else if (gVar != null) {
                    obj = gVar;
                } else {
                    if (iVar == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    obj = iVar;
                }
                boolean z10 = true;
                if (obj instanceof i) {
                    i iVar2 = (i) obj;
                    n nVar = iVar2.A;
                    m.d(nVar, "getErrorCode(...)");
                    String str12 = iVar2.B;
                    g5.a aVar = (g5.a) l5.a.f10032a.get(nVar);
                    if (aVar == null) {
                        throw new GetPublicKeyCredentialDomException(new g5.a(26), a1.b.o("unknown fido gms exception - ", str12));
                    }
                    if (nVar == n.NOT_ALLOWED_ERR && str12 != null && k.A0(str12, "Unable to get sync account", false)) {
                        throw new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.");
                    }
                    throw new GetPublicKeyCredentialDomException(aVar, str12);
                }
                if (obj instanceof cf.g) {
                    try {
                        u0 u0Var = qVar.C;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (u0Var != null && u0Var.m().length > 0) {
                                jSONObject3.put("rawId", ve.c.c(u0Var.m()));
                            }
                            String str13 = qVar.H;
                            if (str13 != null) {
                                jSONObject3.put("authenticatorAttachment", str13);
                            }
                            String str14 = qVar.B;
                            if (str14 != null && iVar == null) {
                                jSONObject3.put("type", str14);
                            }
                            String str15 = qVar.A;
                            if (str15 != null) {
                                jSONObject3.put("id", str15);
                            }
                            String str16 = "response";
                            if (gVar != null) {
                                jSONObject = gVar.zza();
                            } else if (hVar != null) {
                                jSONObject = hVar.zza();
                            } else {
                                if (iVar != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", iVar.A.A);
                                        Object obj2 = iVar.B;
                                        if (obj2 != null) {
                                            jSONObject.put("message", obj2);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e3) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e3);
                                    }
                                }
                                z10 = false;
                            }
                            if (jSONObject != null) {
                                jSONObject3.put(str16, jSONObject);
                            }
                            e eVar = qVar.G;
                            if (eVar != null) {
                                jSONObject3.put("clientExtensionResults", eVar.zza());
                            } else if (z10) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            m.d(string, "toJson(...)");
                        } catch (JSONException e10) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e10);
                        }
                    } catch (Throwable th2) {
                        throw new GetCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    m.d(string, "toString(...)");
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                mVar = new f5.m(string, 3, bundle2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            mVar = jSONObject;
        }
        if (mVar != 0) {
            return new o(mVar);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final g f() {
        g gVar = this.f8968f;
        if (gVar != null) {
            return gVar;
        }
        m.k("callback");
        throw null;
    }

    public final Executor g() {
        Executor executor = this.f8969g;
        if (executor != null) {
            return executor;
        }
        m.k("executor");
        throw null;
    }
}
