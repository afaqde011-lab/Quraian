package com.revenuecat.purchases.common;

import ab.a0;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i0;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import org.json.JSONException;
import s30.b;
import x00.c;
import x00.d;
import z00.g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000 \u00182\u00020\u0001:\u0002\u0019\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher;", "", "Ljava/util/concurrent/ExecutorService;", "executorService", "Landroid/os/Handler;", "mainHandler", "", "runningIntegrationTests", "<init>", "(Ljava/util/concurrent/ExecutorService;Landroid/os/Handler;Z)V", "Ljava/lang/Runnable;", "command", "Lcom/revenuecat/purchases/common/Delay;", "delay", "Lg00/b0;", "enqueue", "(Ljava/lang/Runnable;Lcom/revenuecat/purchases/common/Delay;)V", "close", "()V", "isClosed", "()Z", "Ljava/util/concurrent/ExecutorService;", "Landroid/os/Handler;", "Z", "Companion", "AsyncCall", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$AsyncCall;", "Ljava/lang/Runnable;", "<init>", "()V", "Lcom/revenuecat/purchases/common/networking/HTTPResult;", "call", "()Lcom/revenuecat/purchases/common/networking/HTTPResult;", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "result", "onCompletion", "(Lcom/revenuecat/purchases/common/networking/HTTPResult;)V", "run", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call() throws JSONException, IOException;

        public void onCompletion(HTTPResult result) {
            m.e(result, "result");
        }

        public void onError(PurchasesError error) {
            m.e(error, "error");
        }

        @Override
        public void run() {
            try {
                onCompletion(call());
            } catch (NullPointerReadingErrorStreamException e) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError(e);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (SignatureVerificationException e2) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError(e2);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (IOException e3) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e3);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (SecurityException e4) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e4);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            } catch (JSONException e5) {
                PurchasesError purchasesError5 = ErrorsKt.toPurchasesError(e5);
                LogUtilsKt.errorLog(purchasesError5);
                onError(purchasesError5);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/Dispatcher$Companion;", "", "()V", "INTEGRATION_TEST_DELAY_PERCENTAGE", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z) {
        m.e(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z;
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z, int i, f fVar) {
        this(executorService, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i & 4) != 0 ? false : z);
    }

    public static void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    public static final void enqueue$lambda$3$lambda$2(Runnable runnable, Dispatcher dispatcher) {
        try {
            runnable.run();
        } catch (Throwable th) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception running command: " + th, null);
            Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new i0(th, 8));
            }
        }
    }

    public static final void enqueue$lambda$3$lambda$2$lambda$1(Throwable th) throws Throwable {
        throw th;
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable command, Delay delay) {
        m.e(command, "command");
        m.e(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    Runnable fVar = new ab.f(command, this, 6);
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        this.executorService.submit(fVar);
                    } else {
                        g gVar = new g(b.e(delay.getMinDelay()), b.e(delay.getMaxDelay()));
                        c cVar = d.A;
                        try {
                            long jQ0 = a0.q0(gVar);
                            if (this.runningIntegrationTests) {
                                jQ0 = (long) (jQ0 * 0.01d);
                            }
                            ((ScheduledExecutorService) this.executorService).schedule(fVar, jQ0, TimeUnit.MILLISECONDS);
                        } catch (IllegalArgumentException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean zIsShutdown;
        synchronized (this.executorService) {
            zIsShutdown = this.executorService.isShutdown();
        }
        return zIsShutdown;
    }
}
