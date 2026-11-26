package qd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.c4;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import java.util.ArrayList;
import tf.y3;

public final class u0 extends BroadcastReceiver {

    public final int f12967a = 0;

    public boolean f12968b;

    public boolean f12969c;

    public final Object f12970d;

    public u0(k7.z zVar, boolean z10) {
        this.f12970d = zVar;
        this.f12969c = z10;
    }

    public u0(y3 y3Var) {
        com.google.android.gms.common.internal.d0.h(y3Var);
        this.f12970d = y3Var;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        if (this.f12968b) {
            return;
        }
        context.registerReceiver(this, intentFilter, true != this.f12969c ? 4 : 2);
        this.f12968b = true;
    }

    public void b() {
        y3 y3Var = (y3) this.f12970d;
        y3Var.j0();
        y3Var.C().V0();
        y3Var.C().V0();
        if (this.f12968b) {
            y3Var.t().O.b("Unregistering connectivity change receiver");
            this.f12968b = false;
            this.f12969c = false;
            try {
                y3Var.L.A.unregisterReceiver(this);
            } catch (IllegalArgumentException e3) {
                y3Var.t().G.c(e3, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.f12968b) {
            com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.f12968b = false;
        }
    }

    public void d(Bundle bundle, h hVar, int i10, s3 s3Var, long j9, boolean z10) {
        k7.z zVar = (k7.z) this.f12970d;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                ((q3.e0) ((n0) zVar.f9189d)).z(m3.v(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j9, z10);
            } else {
                ((q3.e0) ((n0) zVar.f9189d)).z(m0.b(23, i10, hVar, null, s3Var), j9, z10);
            }
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        s3 s3Var;
        h hVarE;
        long j9;
        ArrayList arrayList;
        q3.e0 e0Var;
        w3 w3Var;
        int iIntValue;
        int i10 = this.f12967a;
        Object obj = this.f12970d;
        switch (i10) {
            case 0:
                k7.z zVar = (k7.z) obj;
                String action = intent.getAction();
                int iHashCode = action.hashCode();
                s3 s3Var2 = s3.LOCAL_PURCHASES_UPDATED_ACTION;
                s3 s3Var3 = s3.PURCHASES_UPDATED_ACTION;
                s3 s3Var4 = s3.ALTERNATIVE_BILLING_ACTION;
                if (iHashCode != -1484087650) {
                    if (iHashCode != -337612916) {
                        if (iHashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                            s3Var = s3Var4;
                        } else {
                            s3Var = s3.BROADCAST_ACTION_UNSPECIFIED;
                        }
                    } else if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        s3Var = s3Var2;
                    } else {
                        s3Var = s3.BROADCAST_ACTION_UNSPECIFIED;
                    }
                } else if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                    s3Var = s3Var3;
                } else {
                    s3Var = s3.BROADCAST_ACTION_UNSPECIFIED;
                }
                int i11 = (s3Var.equals(s3Var2) || s3Var.equals(s3Var4)) ? 2 : s3Var.equals(s3Var3) ? 32 : 1;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (i11 == 2) {
                        int i12 = com.google.android.gms.internal.play_billing.q.f4028a;
                        a8.a aVarA = h.a();
                        aVarA.f194b = com.google.android.gms.internal.play_billing.q.a("BillingBroadcastManager", intent.getExtras());
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "Unexpected null bundle received!");
                        } else {
                            Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                            if (obj2 == null) {
                                com.google.android.gms.internal.play_billing.q.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else {
                                if (obj2 instanceof Integer) {
                                    iIntValue = ((Integer) obj2).intValue();
                                } else {
                                    com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName()));
                                }
                                aVarA.f195c = iIntValue;
                                aVarA.f193a = com.google.android.gms.internal.play_billing.q.f("BillingBroadcastManager", intent.getExtras());
                                hVarE = aVarA.a();
                            }
                        }
                        iIntValue = 0;
                        aVarA.f195c = iIntValue;
                        aVarA.f193a = com.google.android.gms.internal.play_billing.q.f("BillingBroadcastManager", intent.getExtras());
                        hVarE = aVarA.a();
                    } else {
                        hVarE = com.google.android.gms.internal.play_billing.q.e("BillingBroadcastManager", intent);
                    }
                    long j10 = extras.getLong("billingClientTransactionId", 0L);
                    boolean z10 = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (s3Var.equals(s3Var3) || s3Var.equals(s3Var2)) {
                        h hVar = hVarE;
                        int i13 = i11;
                        s3 s3Var5 = s3Var;
                        com.google.android.gms.internal.play_billing.t tVar = (com.google.android.gms.internal.play_billing.t) zVar.f9192g;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList2 = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            j9 = 0;
                            s sVarJ = com.google.android.gms.internal.play_billing.q.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), tVar);
                            if (sVarJ == null) {
                                com.google.android.gms.internal.play_billing.q.g("BillingHelper", "Couldn't find single purchase data as well.");
                                arrayList = null;
                            } else {
                                arrayList2.add(sVarJ);
                            }
                            if (hVar.f12892a == 0) {
                                n0 n0Var = (n0) zVar.f9189d;
                                o3 o3VarC = m0.c(i13, s3Var5);
                                e0Var = (q3.e0) n0Var;
                                e0Var.getClass();
                                try {
                                    n3 n3Var = (n3) o3VarC.l();
                                    a4 a4Var = (a4) o3VarC.t().l();
                                    a4Var.c();
                                    c4.s((c4) a4Var.B, z10);
                                    n3Var.c();
                                    o3.w((o3) n3Var.B, (c4) a4Var.a());
                                    o3 o3Var = (o3) n3Var.a();
                                    if (j10 == j9) {
                                        w3Var = (w3) e0Var.B;
                                    } else {
                                        v3 v3Var = (v3) ((w3) e0Var.B).l();
                                        v3Var.g(j10);
                                        w3Var = (w3) v3Var.a();
                                    }
                                    e0Var.H(o3Var, w3Var);
                                } catch (Throwable th2) {
                                    com.google.android.gms.internal.play_billing.q.i("BillingLogger", "Unable to log.", th2);
                                }
                            } else {
                                d(extras, hVar, i13, s3Var5, j10, z10);
                            }
                            ((u) zVar.f9188c).onPurchasesUpdated(hVar, arrayList);
                        } else {
                            j9 = 0;
                            com.google.android.gms.internal.play_billing.q.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i14 = 0; i14 < stringArrayList.size() && i14 < stringArrayList2.size(); i14++) {
                                s sVarJ2 = com.google.android.gms.internal.play_billing.q.j(stringArrayList.get(i14), stringArrayList2.get(i14), tVar);
                                if (sVarJ2 != null) {
                                    arrayList2.add(sVarJ2);
                                }
                            }
                        }
                        arrayList = arrayList2;
                        if (hVar.f12892a == 0) {
                            n0 n0Var2 = (n0) zVar.f9189d;
                            o3 o3VarC2 = m0.c(i13, s3Var5);
                            e0Var = (q3.e0) n0Var2;
                            e0Var.getClass();
                            n3 n3Var2 = (n3) o3VarC2.l();
                            a4 a4Var2 = (a4) o3VarC2.t().l();
                            a4Var2.c();
                            c4.s((c4) a4Var2.B, z10);
                            n3Var2.c();
                            o3.w((o3) n3Var2.B, (c4) a4Var2.a());
                            o3 o3Var2 = (o3) n3Var2.a();
                            if (j10 == j9) {
                                w3Var = (w3) e0Var.B;
                            } else {
                                v3 v3Var2 = (v3) ((w3) e0Var.B).l();
                                v3Var2.g(j10);
                                w3Var = (w3) v3Var2.a();
                            }
                            e0Var.H(o3Var2, w3Var);
                        } else {
                            d(extras, hVar, i13, s3Var5, j10, z10);
                        }
                        ((u) zVar.f9188c).onPurchasesUpdated(hVar, arrayList);
                        break;
                    } else if (s3Var.equals(s3Var4)) {
                        if (hVarE.f12892a != 0) {
                            h hVar2 = hVarE;
                            d(extras, hVar2, i11, s3Var, j10, z10);
                            u uVar = (u) zVar.f9188c;
                            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.r.B;
                            uVar.onPurchasesUpdated(hVar2, com.google.android.gms.internal.play_billing.v.E);
                        } else {
                            s3 s3Var6 = s3Var;
                            zVar.getClass();
                            com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                            n0 n0Var3 = (n0) zVar.f9189d;
                            h hVar3 = o0.f12932h;
                            ((q3.e0) n0Var3).z(m0.b(141, i11, hVar3, null, s3Var6), j10, z10);
                            u uVar2 = (u) zVar.f9188c;
                            com.google.android.gms.internal.play_billing.o oVar2 = com.google.android.gms.internal.play_billing.r.B;
                            uVar2.onPurchasesUpdated(hVar3, com.google.android.gms.internal.play_billing.v.E);
                        }
                    }
                } else {
                    com.google.android.gms.internal.play_billing.q.h("BillingBroadcastManager", "Bundle is null.");
                    n0 n0Var4 = (n0) zVar.f9189d;
                    h hVar4 = o0.f12932h;
                    ((q3.e0) n0Var4).w(m0.b(11, i11, hVar4, null, s3Var));
                    u uVar3 = (u) zVar.f9188c;
                    if (uVar3 != null) {
                        uVar3.onPurchasesUpdated(hVar4, null);
                    }
                }
                break;
            default:
                y3 y3Var = (y3) obj;
                y3Var.j0();
                String action2 = intent.getAction();
                y3Var.t().O.c(action2, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action2)) {
                    tf.t0 t0Var = y3Var.B;
                    y3.R(t0Var);
                    boolean zP1 = t0Var.p1();
                    if (this.f12969c != zP1) {
                        this.f12969c = zP1;
                        y3Var.C().e1(new a50.d(this, zP1));
                    }
                } else {
                    y3Var.t().J.c(action2, "NetworkBroadcastReceiver received unknown action");
                }
                break;
        }
    }
}
