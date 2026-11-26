package qd;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.ProxyBillingActivity;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

public final class g0 extends bh.a {

    public final WeakReference f12890f;

    public final ah.d f12891g;

    public g0(WeakReference weakReference, ah.d dVar) {
        super("com.android.vending.billing.IInAppBillingServiceCallback", 1);
        this.f12890f = weakReference;
        this.f12891g = dVar;
    }

    @Override
    public final boolean f(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) com.google.android.gms.internal.play_billing.d.a(parcel);
        bh.a.g2(parcel);
        ah.d dVar = this.f12891g;
        if (dVar == null) {
            com.google.android.gms.internal.play_billing.q.h("BillingClient", "Unable to send result for in-app messaging");
        } else if (bundle == null) {
            dVar.send(0, null);
        } else {
            Activity activity = (Activity) this.f12890f.get();
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
            if (activity == null || pendingIntent == null) {
                dVar.send(0, null);
                com.google.android.gms.internal.play_billing.q.h("BillingClient", "Unable to launch intent for in-app messaging");
            } else {
                try {
                    Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                    intent.putExtra("in_app_message_result_receiver", dVar);
                    intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
                    activity.startActivity(intent);
                } catch (CancellationException e3) {
                    dVar.send(0, null);
                    com.google.android.gms.internal.play_billing.q.i("BillingClient", "Exception caught while launching intent for in-app messaging.", e3);
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
