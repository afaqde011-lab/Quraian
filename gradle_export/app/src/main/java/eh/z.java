package eh;

import android.content.res.Resources;
import android.util.Base64;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.CredentialsData;
import fh.i2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class z implements x {
    public final int A;

    public z(int i10) {
        this.A = i10;
    }

    @Override
    public final Object get() {
        switch (this.A) {
            case 0:
                throw new IllegalStateException();
            case 1:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof kh.w) {
                    return (kh.w) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new kh.a0((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new kh.x(executorServiceNewSingleThreadExecutor);
            case 2:
                return new i7.g(new w7.e(), 50000, 1000, 50000, 50000, 1000, 1000, CastStatusCodes.AUTHENTICATION_FAILED, 1000, true, 0, false, i2.G);
            case 3:
                byte[] bArr = new byte[12];
                j7.h.f8216i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 4:
                Resources system = Resources.getSystem();
                int dimensionPixelSize = system.getDisplayMetrics().widthPixels;
                try {
                    dimensionPixelSize = system.getDimensionPixelSize(system.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID));
                    break;
                } catch (Resources.NotFoundException unused) {
                }
                return Integer.valueOf(dimensionPixelSize);
            default:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
        }
    }
}
