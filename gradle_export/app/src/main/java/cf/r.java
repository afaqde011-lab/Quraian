package cf;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class r extends re.a {
    public static final Parcelable.Creator<r> CREATOR = new ah.c(24);
    public final u A;
    public final w B;
    public final byte[] C;
    public final List D;
    public final Double E;
    public final List F;
    public final k G;
    public final Integer H;
    public final a0 I;
    public final c J;
    public final d K;
    public final String L;
    public final ResultReceiver M;

    public r(u uVar, w wVar, byte[] bArr, ArrayList arrayList, Double d3, ArrayList arrayList2, k kVar, Integer num, a0 a0Var, String str, d dVar, String str2, ResultReceiver resultReceiver) {
        this.M = resultReceiver;
        if (str2 != null) {
            try {
                r rVarA = a(new JSONObject(str2));
                this.A = rVarA.A;
                this.B = rVarA.B;
                this.C = rVarA.C;
                this.D = rVarA.D;
                this.E = rVarA.E;
                this.F = rVarA.F;
                this.G = rVarA.G;
                this.H = rVarA.H;
                this.I = rVarA.I;
                this.J = rVarA.J;
                this.K = rVarA.K;
                this.L = str2;
                return;
            } catch (JSONException e3) {
                throw new IllegalArgumentException(e3);
            }
        }
        com.google.android.gms.common.internal.d0.h(uVar);
        this.A = uVar;
        com.google.android.gms.common.internal.d0.h(wVar);
        this.B = wVar;
        com.google.android.gms.common.internal.d0.h(bArr);
        this.C = bArr;
        com.google.android.gms.common.internal.d0.h(arrayList);
        this.D = arrayList;
        this.E = d3;
        this.F = arrayList2;
        this.G = kVar;
        this.H = num;
        this.I = a0Var;
        if (str != null) {
            try {
                this.J = c.a(str);
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.J = null;
        }
        this.K = dVar;
        this.L = null;
    }

    public static r a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        k kVar;
        d dVar;
        c cVarA;
        int i10;
        j0 j0Var;
        j0 j0VarA;
        p0 p0Var;
        b0 b0Var;
        r0 r0Var;
        f0 f0Var;
        g0 g0Var;
        q0 q0Var;
        h0 h0Var;
        p pVar;
        l0 l0Var;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        nf.f gVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        u uVar = new u(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        w wVar = new w(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), ve.c.b(jSONObject3.getString("id")));
        byte[] bArrB = ve.c.b(jSONObject.getString("challenge"));
        com.google.android.gms.common.internal.d0.h(bArrB);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < jSONArray3.length(); i11++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i11);
            try {
                gVar = new nf.g(new t(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                gVar = nf.d.A;
            }
            if (gVar.b()) {
                arrayList4.add(gVar.a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i12 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList5 = new ArrayList();
            int i13 = 0;
            while (i13 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i13);
                Parcelable.Creator<s> creator = s.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i12);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i14 = 0;
                    while (i14 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i14);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (Transport.UnsupportedTransportException unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i14++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList5.add(new s(string, bArrDecode, arrayList3));
                i13++;
                jSONArray4 = jSONArray4;
                str3 = str;
                i12 = 11;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            kVar = new k(jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            kVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            o oVar = jSONObject7.has("fidoAppIdExtension") ? new o(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                oVar = new o(jSONObject7.getString("appid"));
            }
            o oVar2 = oVar;
            if (!jSONObject7.has("prf")) {
                i10 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    j0VarA = j0.a(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    j0Var = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i10 < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i10);
                        arrayList2.add(new o0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i10++;
                    }
                    p0Var = new p0(arrayList2);
                } else {
                    p0Var = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    b0Var = new b0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    b0Var = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    r0Var = new r0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    r0Var = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    f0Var = new f0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    f0Var = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    g0Var = new g0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    g0Var = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    q0Var = new q0();
                } else {
                    q0Var = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    h0Var = new h0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    h0Var = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    pVar = new p(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    pVar = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    l0Var = new l0(jSONObject7.getString("txAuthSimple"));
                } else {
                    l0Var = null;
                }
                dVar = new d(oVar2, p0Var, b0Var, r0Var, f0Var, g0Var, q0Var, h0Var, pVar, j0Var, l0Var, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i10 = 0;
                j0VarA = j0.a(jSONObject7.getJSONObject("prf"), false);
            }
            j0Var = j0VarA;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i10);
                    arrayList2.add(new o0(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i10++;
                }
                p0Var = new p0(arrayList2);
            } else {
                p0Var = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                b0Var = new b0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                b0Var = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                r0Var = new r0(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                r0Var = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                f0Var = new f0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                f0Var = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                g0Var = new g0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                g0Var = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                q0Var = new q0();
            } else {
                q0Var = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                h0Var = new h0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                h0Var = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                pVar = new p(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                pVar = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                l0Var = new l0(jSONObject7.getString("txAuthSimple"));
            } else {
                l0Var = null;
            }
            dVar = new d(oVar2, p0Var, b0Var, r0Var, f0Var, g0Var, q0Var, h0Var, pVar, j0Var, l0Var, null);
        } else {
            dVar = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                cVarA = c.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException e3) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e3);
                cVarA = c.NONE;
            }
        } else {
            cVarA = null;
        }
        return new r(uVar, wVar, bArrB, arrayList4, dValueOf, arrayList, kVar, null, null, cVarA == null ? null : cVarA.A, dVar, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        List list2 = rVar.D;
        List list3 = rVar.F;
        if (com.google.android.gms.common.internal.d0.k(this.A, rVar.A) && com.google.android.gms.common.internal.d0.k(this.B, rVar.B) && Arrays.equals(this.C, rVar.C) && com.google.android.gms.common.internal.d0.k(this.E, rVar.E)) {
            List list4 = this.D;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.F) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && com.google.android.gms.common.internal.d0.k(this.G, rVar.G) && com.google.android.gms.common.internal.d0.k(this.H, rVar.H) && com.google.android.gms.common.internal.d0.k(this.I, rVar.I) && com.google.android.gms.common.internal.d0.k(this.J, rVar.J) && com.google.android.gms.common.internal.d0.k(this.K, rVar.K) && com.google.android.gms.common.internal.d0.k(this.L, rVar.L))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A, this.B, Integer.valueOf(Arrays.hashCode(this.C)), this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.A);
        String strValueOf2 = String.valueOf(this.B);
        String strC = ve.c.c(this.C);
        String strValueOf3 = String.valueOf(this.D);
        String strValueOf4 = String.valueOf(this.F);
        String strValueOf5 = String.valueOf(this.G);
        String strValueOf6 = String.valueOf(this.I);
        String strValueOf7 = String.valueOf(this.J);
        String strValueOf8 = String.valueOf(this.K);
        StringBuilder sbS = a1.b.s("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        a1.b.z(sbS, strC, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbS.append(this.E);
        sbS.append(", \n excludeList=");
        sbS.append(strValueOf4);
        sbS.append(", \n authenticatorSelection=");
        sbS.append(strValueOf5);
        sbS.append(", \n requestId=");
        sbS.append(this.H);
        sbS.append(", \n tokenBinding=");
        sbS.append(strValueOf6);
        sbS.append(", \n attestationConveyancePreference=");
        return oi.k.m(sbS, strValueOf7, ", \n authenticationExtensions=", strValueOf8, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.a0(parcel, 2, this.A, i10);
        t1.a0(parcel, 3, this.B, i10);
        t1.U(parcel, 4, this.C);
        t1.e0(parcel, 5, this.D);
        Double d3 = this.E;
        if (d3 != null) {
            t1.f0(parcel, 6, 8);
            parcel.writeDouble(d3.doubleValue());
        }
        t1.e0(parcel, 7, this.F);
        t1.a0(parcel, 8, this.G, i10);
        t1.Y(parcel, 9, this.H);
        t1.a0(parcel, 10, this.I, i10);
        c cVar = this.J;
        t1.b0(parcel, 11, cVar == null ? null : cVar.A);
        t1.a0(parcel, 12, this.K, i10);
        t1.b0(parcel, 13, this.L);
        t1.a0(parcel, 14, this.M, i10);
        t1.h0(iG0, parcel);
    }
}
