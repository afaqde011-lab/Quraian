package i5;

import android.os.CancellationSignal;
import android.util.Log;

public final class b {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }

    public static void b(CancellationSignal cancellationSignal, u00.a aVar) {
        if (a(cancellationSignal)) {
            return;
        }
        aVar.invoke();
    }
}
