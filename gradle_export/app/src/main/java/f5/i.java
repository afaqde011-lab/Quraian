package f5;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public interface i {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, n nVar, CancellationSignal cancellationSignal, Executor executor, g gVar);
}
