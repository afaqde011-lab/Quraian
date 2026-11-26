package ii;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class f implements ij.b {

    public final int f7685a;

    public f(int i10) {
        this.f7685a = i10;
    }

    @Override
    public final Object get() {
        switch (this.f7685a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                l lVar = ExecutorsRegistrar.f4342a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new ji.f(Executors.newFixedThreadPool(4, new ji.b("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f4345d.get());
            case 3:
                l lVar2 = ExecutorsRegistrar.f4342a;
                return new ji.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ji.b("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f4345d.get());
            case 4:
                l lVar3 = ExecutorsRegistrar.f4342a;
                return new ji.f(Executors.newCachedThreadPool(new ji.b("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f4345d.get());
            case 5:
                l lVar4 = ExecutorsRegistrar.f4342a;
                return Executors.newSingleThreadScheduledExecutor(new ji.b("Firebase Scheduler", 0, null));
            case 6:
                bd.d dVar = FirebaseMessaging.f4353k;
                return null;
            default:
                Random random = rj.e.f13597j;
                return null;
        }
    }
}
