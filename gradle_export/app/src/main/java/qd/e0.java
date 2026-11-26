package qd;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.e1;
import com.google.android.gms.internal.play_billing.s3;
import org.json.JSONException;

public final class e0 extends bh.a {

    public final int f12874f;

    public final com.revenuecat.purchases.google.usecase.b f12875g;

    public final n0 f12876h;

    public final int f12877i;

    public e0(com.revenuecat.purchases.google.usecase.b bVar, q3.e0 e0Var, int i10, int i11) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 1);
        this.f12874f = i11;
        switch (i11) {
            case 1:
                super("com.android.vending.billing.IInAppBillingDelegateToBackendCallback", 1);
                this.f12875g = bVar;
                this.f12876h = e0Var;
                this.f12877i = i10;
                break;
            default:
                this.f12875g = bVar;
                this.f12876h = e0Var;
                this.f12877i = i10;
                break;
        }
    }

    @Override
    public final boolean f(int i10, Parcel parcel, Parcel parcel2) {
        h hVarA;
        switch (this.f12874f) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.d.a(parcel);
                bh.a.g2(parcel);
                int i11 = this.f12877i;
                s3 s3Var = s3.BROADCAST_ACTION_UNSPECIFIED;
                n0 n0Var = this.f12876h;
                com.revenuecat.purchases.google.usecase.b bVar = this.f12875g;
                if (bundle != null) {
                    int iA = com.google.android.gms.internal.play_billing.q.a("BillingClient", bundle);
                    String strF = com.google.android.gms.internal.play_billing.q.f("BillingClient", bundle);
                    a8.a aVarA = h.a();
                    aVarA.f194b = iA;
                    aVarA.f193a = strF;
                    if (iA != 0) {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", bi.b.c0(iA, "getBillingConfig() failed. Response code: "));
                        h hVarA2 = aVarA.a();
                        ((q3.e0) n0Var).x(m0.b(23, 13, hVarA2, null, s3Var), i11);
                        bVar.a(hVarA2, (d) null);
                    } else if (bundle.containsKey("BILLING_CONFIG")) {
                        try {
                            bVar.a(aVarA.a(), new d(bundle.getString("BILLING_CONFIG")));
                        } catch (JSONException e3) {
                            com.google.android.gms.internal.play_billing.q.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e3);
                            h hVar = o0.f12932h;
                            ((q3.e0) n0Var).x(m0.b(65, 13, hVar, null, s3Var), i11);
                            bVar.a(hVar, (d) null);
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.q.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        aVarA.f194b = 6;
                        h hVarA3 = aVarA.a();
                        ((q3.e0) n0Var).x(m0.b(64, 13, hVarA3, null, s3Var), i11);
                        bVar.a(hVarA3, (d) null);
                    }
                    break;
                } else {
                    h hVar2 = o0.f12932h;
                    ((q3.e0) n0Var).x(m0.b(63, 13, hVar2, null, s3Var), i11);
                    bVar.a(hVar2, (d) null);
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i10 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.play_billing.d.a(parcel);
                bh.a.g2(parcel);
                int i12 = this.f12877i;
                n0 n0Var2 = this.f12876h;
                if (bundle2 == null) {
                    h hVar3 = o0.f12932h;
                    c7.i.a0(98, hVar3, n0Var2, i12);
                    k2(hVar3);
                } else {
                    boolean zContainsKey = bundle2.containsKey("BILLING_RESULT");
                    s3 s3Var2 = s3.BROADCAST_ACTION_UNSPECIFIED;
                    if (zContainsKey) {
                        try {
                            byte[] byteArray = bundle2.getByteArray("BILLING_RESULT");
                            if (byteArray == null) {
                                throw new Exception("Billing result is null");
                            }
                            e1 e1VarS = e1.s(byteArray);
                            a8.a aVarA2 = h.a();
                            aVarA2.f194b = e1VarS.r();
                            aVarA2.f193a = e1VarS.t();
                            hVarA = aVarA2.a();
                            if (hVarA.f12892a != 0) {
                                c7.i.a0(23, hVarA, n0Var2, i12);
                            } else if (!bundle2.containsKey("RESPONSE_DATA")) {
                                com.google.android.gms.internal.play_billing.q.h("GetBillingConfigDelegateToBackendCallback", "delegateToBackendAsync returned a bundle with neither an error nor response data");
                                hVarA = o0.f12932h;
                                c7.i.a0(101, hVarA, n0Var2, i12);
                            }
                        } catch (Exception e10) {
                            com.google.android.gms.internal.play_billing.q.i("GetBillingConfigDelegateToBackendCallback", "Failed parsing BillingResult.", e10);
                            h hVar4 = o0.f12932h;
                            ((q3.e0) n0Var2).x(m0.b(100, 29, hVar4, m0.a(e10), s3Var2), i12);
                            hVarA = hVar4;
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.q.h("GetBillingConfigDelegateToBackendCallback", "delegateToBackendAsync does not contain a billing result in the response");
                        hVarA = o0.f12932h;
                        c7.i.a0(99, hVarA, n0Var2, i12);
                    }
                    if (hVarA.f12892a == 0) {
                        try {
                            byte[] byteArray2 = bundle2.getByteArray("RESPONSE_DATA");
                            if (byteArray2 == null) {
                                throw new IllegalArgumentException("Response data is null");
                            }
                            this.f12875g.a(hVarA, new d(a1.r(byteArray2).s(), 0));
                        } catch (Exception e11) {
                            com.google.android.gms.internal.play_billing.q.i("GetBillingConfigDelegateToBackendCallback", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e11);
                            h hVar5 = o0.f12932h;
                            ((q3.e0) n0Var2).x(m0.b(97, 29, hVar5, m0.a(e11), s3Var2), i12);
                            k2(hVar5);
                        }
                    } else {
                        k2(hVarA);
                    }
                }
                return true;
        }
    }

    public void k2(h hVar) {
        com.revenuecat.purchases.google.usecase.b bVar = this.f12875g;
        if (bVar != null) {
            bVar.a(hVar, (d) null);
        } else {
            c7.i.a0(96, hVar, this.f12876h, this.f12877i);
        }
    }
}
