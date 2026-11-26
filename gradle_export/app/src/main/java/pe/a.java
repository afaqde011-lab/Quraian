package pe;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.d0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements ServiceConnection {
    public boolean A = false;
    public final LinkedBlockingQueue B = new LinkedBlockingQueue();

    public final IBinder a() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d0.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.A) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.A = true;
        IBinder iBinder = (IBinder) this.B.poll(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.B.add(iBinder);
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
