package i5;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import g00.b0;
import ke.f;
import ke.i;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

public final class d extends n implements k {
    public final int A;
    public final HiddenActivity B;
    public final int C;

    public d(HiddenActivity hiddenActivity, int i10, int i11) {
        super(1);
        this.A = i11;
        this.B = hiddenActivity;
        this.C = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                HiddenActivity hiddenActivity = this.B;
                f fVar = (f) obj;
                try {
                    hiddenActivity.B = true;
                    hiddenActivity.startIntentSenderForResult(fVar.A.getIntentSender(), this.C, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e3) {
                    ResultReceiver resultReceiver = hiddenActivity.A;
                    m.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e3.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.B;
                i iVar = (i) obj;
                try {
                    hiddenActivity2.B = true;
                    hiddenActivity2.startIntentSenderForResult(iVar.A.getIntentSender(), this.C, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e10) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.A;
                    m.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.B;
                PendingIntent pendingIntent = (PendingIntent) obj;
                m.e(pendingIntent, "result");
                try {
                    hiddenActivity3.B = true;
                    hiddenActivity3.startIntentSenderForResult(pendingIntent.getIntentSender(), this.C, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e11) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.A;
                    m.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e11.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.B;
                PendingIntent pendingIntent2 = (PendingIntent) obj;
                try {
                    hiddenActivity4.B = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent2.getIntentSender(), this.C, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e12) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.A;
                    m.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e12.getMessage());
                }
                break;
        }
        return b0.a;
    }
}
