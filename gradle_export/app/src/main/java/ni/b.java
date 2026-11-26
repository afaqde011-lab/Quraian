package ni;

import android.util.Log;
import oi.q;

public final class b implements a {
    @Override
    public final void e(q qVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
