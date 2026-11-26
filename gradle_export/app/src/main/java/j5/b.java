package j5;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b3.k0;
import b50.l;
import com.google.android.gms.cast.Cast;
import f5.g;
import g4.c;
import h00.n;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import u00.k;

public abstract class b {

    public static final a f8166a = new a();

    public static final Set f8167b = n.X0(new Integer[]{7, 20});

    public static final int f8168c = 1;

    public static final int f8169d = 0;

    public static final void a(CancellationSignal cancellationSignal, u00.a aVar) {
        m.e(aVar, "onResultOrException");
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (i5.b.a(cancellationSignal)) {
            return;
        }
        aVar.invoke();
    }

    public static void b(ResultReceiver resultReceiver, Intent intent, String str) {
        m.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f8168c);
        Parcel parcelObtain = Parcel.obtain();
        m.d(parcelObtain, "obtain(...)");
        resultReceiver.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        ResultReceiver resultReceiver2 = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        intent.putExtra("RESULT_RECEIVER", resultReceiver2);
        intent.setFlags(Cast.MAX_MESSAGE_LENGTH);
    }

    public static boolean c(Bundle bundle, u00.n nVar, Executor executor, g gVar, CancellationSignal cancellationSignal) {
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        a(cancellationSignal, new l(executor, gVar, nVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 4));
        return true;
    }

    public static final boolean d(int i10, u00.n nVar, k kVar, CancellationSignal cancellationSignal) {
        if (i10 == -1) {
            return false;
        }
        z zVar = new z();
        zVar.A = new GetCredentialUnknownException(c.i("activity with result code: ", i10, " indicating not RESULT_OK"));
        if (i10 == 0) {
            zVar.A = new GetCredentialCancellationException("activity is cancelled by the user.");
        }
        nVar.invoke(cancellationSignal, new k0(zVar, kVar));
        return true;
    }
}
