package com.android.billingclient.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.fragment.app.d1;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.internal.play_billing.q;
import d.n;
import h.b;
import h.c;
import h.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public class ProxyBillingActivityV2 extends n {
    public c A;
    public c B;
    public c C;
    public c D;
    public c E;
    public c F;
    public ResultReceiver G;
    public ResultReceiver H;
    public ResultReceiver I;
    public ResultReceiver J;
    public ResultReceiver K;
    public ResultReceiver L;

    public static final hf.c f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            hf.c cVar = new hf.c(activityOptionsMakeBasic, 23);
            if (i10 >= 34) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(3);
                return cVar;
            }
            activityOptionsMakeBasic.setPendingIntentBackgroundActivityLaunchAllowed(true);
            return cVar;
        }
        if (i10 < 34) {
            return null;
        }
        ActivityOptions activityOptionsMakeBasic2 = ActivityOptions.makeBasic();
        hf.c cVar2 = new hf.c(activityOptionsMakeBasic2, 23);
        if (i10 >= 34) {
            activityOptionsMakeBasic2.setPendingIntentBackgroundActivityStartMode(1);
            return cVar2;
        }
        activityOptionsMakeBasic2.setPendingIntentBackgroundActivityLaunchAllowed(true);
        return cVar2;
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i10 = 0;
        this.A = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i11 = i10;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i11) {
                    case 0:
                        Intent intent = aVar.B;
                        int i12 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
                        if (resultReceiver != null) {
                            resultReceiver.send(i12, intent == null ? null : intent.getExtras());
                        }
                        int i13 = aVar.A;
                        if (i13 != -1 || i12 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i14 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i14 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i14);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i14);
                        }
                        int i15 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.I;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i15, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i15 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i16 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i16, intent3 == null ? null : intent3.getExtras());
                        }
                        int i17 = aVar.A;
                        if (i17 != -1 || i16 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i17 + " and billing's responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        this.B = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i11 = i10;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i11) {
                    case 0:
                        Intent intent = aVar.B;
                        int i12 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                        if (resultReceiver != null) {
                            resultReceiver.send(i12, intent == null ? null : intent.getExtras());
                        }
                        int i13 = aVar.A;
                        if (i13 != -1 || i12 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i13 + " and billing's responseCode: " + i12);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i14 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i14 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i14);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i14);
                        }
                        int i15 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i15, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i15 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i15);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i16 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.L;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i16, intent3 == null ? null : intent3.getExtras());
                        }
                        int i17 = aVar.A;
                        if (i17 != -1 || i16 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i17 + " and billing's responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.C = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i12 = i11;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i12) {
                    case 0:
                        Intent intent = aVar.B;
                        int i13 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
                        if (resultReceiver != null) {
                            resultReceiver.send(i13, intent == null ? null : intent.getExtras());
                        }
                        int i14 = aVar.A;
                        if (i14 != -1 || i13 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i14 + " and billing's responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i15 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i15 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i15);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i15);
                        }
                        int i16 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.I;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i16, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i16 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i17 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i17, intent3 == null ? null : intent3.getExtras());
                        }
                        int i18 = aVar.A;
                        if (i18 != -1 || i17 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i18 + " and billing's responseCode: " + i17);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        this.D = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i12 = i11;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i12) {
                    case 0:
                        Intent intent = aVar.B;
                        int i13 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                        if (resultReceiver != null) {
                            resultReceiver.send(i13, intent == null ? null : intent.getExtras());
                        }
                        int i14 = aVar.A;
                        if (i14 != -1 || i13 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i14 + " and billing's responseCode: " + i13);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i15 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i15 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i15);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i15);
                        }
                        int i16 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i16, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i16 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i16);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i17 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.L;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i17, intent3 == null ? null : intent3.getExtras());
                        }
                        int i18 = aVar.A;
                        if (i18 != -1 || i17 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i18 + " and billing's responseCode: " + i17);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        final int i12 = 2;
        this.E = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i13 = i12;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i13) {
                    case 0:
                        Intent intent = aVar.B;
                        int i14 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.G;
                        if (resultReceiver != null) {
                            resultReceiver.send(i14, intent == null ? null : intent.getExtras());
                        }
                        int i15 = aVar.A;
                        if (i15 != -1 || i14 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i15 + " and billing's responseCode: " + i14);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i16 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i16 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i16);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i16);
                        }
                        int i17 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.I;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i17, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                        }
                        if (i17 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i17);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i18 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.K;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i18, intent3 == null ? null : intent3.getExtras());
                        }
                        int i19 = aVar.A;
                        if (i19 != -1 || i18 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Billing program info dialog finished with resultCode " + i19 + " and billing's responseCode: " + i18);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        this.F = registerForActivityResult(new d1(4), new b(this) {
            public final ProxyBillingActivityV2 B;

            {
                this.B = this;
            }

            @Override
            public final void a(Object obj) {
                int i13 = i12;
                h.a aVar = (h.a) obj;
                ProxyBillingActivityV2 proxyBillingActivityV2 = this.B;
                proxyBillingActivityV2.getClass();
                switch (i13) {
                    case 0:
                        Intent intent = aVar.B;
                        int i14 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent).f12892a;
                        ResultReceiver resultReceiver = proxyBillingActivityV2.H;
                        if (resultReceiver != null) {
                            resultReceiver.send(i14, intent == null ? null : intent.getExtras());
                        }
                        int i15 = aVar.A;
                        if (i15 != -1 || i14 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i15 + " and billing's responseCode: " + i14);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    case 1:
                        Intent intent2 = aVar.B;
                        int i16 = aVar.A;
                        Bundle extras = intent2 == null ? null : intent2.getExtras();
                        if (i16 != -1) {
                            if (extras == null) {
                                extras = new Bundle();
                            }
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i16);
                            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i16);
                        }
                        int i17 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent2).f12892a;
                        ResultReceiver resultReceiver2 = proxyBillingActivityV2.J;
                        if (resultReceiver2 != null) {
                            resultReceiver2.send(i17, extras);
                        } else {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
                        }
                        if (i17 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i17);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                    default:
                        Intent intent3 = aVar.B;
                        int i18 = com.google.android.gms.internal.play_billing.q.e("ProxyBillingActivityV2", intent3).f12892a;
                        ResultReceiver resultReceiver3 = proxyBillingActivityV2.L;
                        if (resultReceiver3 != null) {
                            resultReceiver3.send(i18, intent3 == null ? null : intent3.getExtras());
                        }
                        int i19 = aVar.A;
                        if (i19 != -1 || i18 != 0) {
                            com.google.android.gms.internal.play_billing.q.h("ProxyBillingActivityV2", "Subscription management action finished with resultCode: " + i19 + " and billing's responseCode: " + i18);
                        }
                        proxyBillingActivityV2.finish();
                        break;
                }
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.G = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.I = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("launch_external_link_result_receiver")) {
                this.J = (ResultReceiver) bundle.getParcelable("launch_external_link_result_receiver");
            }
            if (bundle.containsKey("billing_program_information_dialog_result_receiver")) {
                this.K = (ResultReceiver) bundle.getParcelable("billing_program_information_dialog_result_receiver");
            }
            if (bundle.containsKey("subscription_management_action_result_receiver")) {
                this.L = (ResultReceiver) bundle.getParcelable("subscription_management_action_result_receiver");
                return;
            }
            return;
        }
        q.g("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.G = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            c cVar = this.A;
            m.e(pendingIntent, f.KEY_PENDING_INTENT);
            IntentSender intentSender = pendingIntent.getIntentSender();
            m.d(intentSender, "getIntentSender(...)");
            cVar.a(new k(intentSender, null, 0, 0), f());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            c cVar2 = this.B;
            m.e(pendingIntent2, f.KEY_PENDING_INTENT);
            IntentSender intentSender2 = pendingIntent2.getIntentSender();
            m.d(intentSender2, "getIntentSender(...)");
            cVar2.a(new k(intentSender2, null, 0, 0), f());
            return;
        }
        if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            c cVar3 = this.C;
            m.e(pendingIntent3, f.KEY_PENDING_INTENT);
            IntentSender intentSender3 = pendingIntent3.getIntentSender();
            m.d(intentSender3, "getIntentSender(...)");
            cVar3.a(new k(intentSender3, null, 0, 0), f());
            return;
        }
        if (getIntent().hasExtra("launch_external_link_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("launch_external_link_flow_pending_intent");
            this.J = (ResultReceiver) getIntent().getParcelableExtra("launch_external_link_result_receiver");
            c cVar4 = this.D;
            m.e(pendingIntent4, f.KEY_PENDING_INTENT);
            IntentSender intentSender4 = pendingIntent4.getIntentSender();
            m.d(intentSender4, "getIntentSender(...)");
            cVar4.a(new k(intentSender4, null, 0, 0), f());
            return;
        }
        if (getIntent().hasExtra("billing_program_information_dialog_pending_intent")) {
            PendingIntent pendingIntent5 = (PendingIntent) getIntent().getParcelableExtra("billing_program_information_dialog_pending_intent");
            this.K = (ResultReceiver) getIntent().getParcelableExtra("billing_program_information_dialog_result_receiver");
            c cVar5 = this.E;
            m.e(pendingIntent5, f.KEY_PENDING_INTENT);
            IntentSender intentSender5 = pendingIntent5.getIntentSender();
            m.d(intentSender5, "getIntentSender(...)");
            cVar5.a(new k(intentSender5, null, 0, 0), f());
            return;
        }
        if (getIntent().hasExtra("SUBSCRIPTION_MANAGEMENT_INTENT")) {
            PendingIntent pendingIntent6 = (PendingIntent) getIntent().getParcelableExtra("SUBSCRIPTION_MANAGEMENT_INTENT");
            this.L = (ResultReceiver) getIntent().getParcelableExtra("subscription_management_action_result_receiver");
            c cVar6 = this.F;
            m.e(pendingIntent6, f.KEY_PENDING_INTENT);
            IntentSender intentSender6 = pendingIntent6.getIntentSender();
            m.d(intentSender6, "getIntentSender(...)");
            cVar6.a(new k(intentSender6, null, 0, 0), f());
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) throws NoWhenBranchMatchedException {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.G;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.H;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.I;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.J;
        if (resultReceiver4 != null) {
            bundle.putParcelable("launch_external_link_result_receiver", resultReceiver4);
        }
        ResultReceiver resultReceiver5 = this.K;
        if (resultReceiver5 != null) {
            bundle.putParcelable("billing_program_information_dialog_result_receiver", resultReceiver5);
        }
        ResultReceiver resultReceiver6 = this.L;
        if (resultReceiver6 != null) {
            bundle.putParcelable("subscription_management_action_result_receiver", resultReceiver6);
        }
    }
}
