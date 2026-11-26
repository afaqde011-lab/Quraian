package oe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import ca.u;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import qd.c0;
import tf.b4;
import tf.c3;
import tf.e0;
import tf.g4;
import tf.h1;
import tf.q0;
import tf.s;

public final class j implements Runnable {
    public final int A;
    public final boolean B;
    public final Parcelable C;
    public final Object D;
    public final Object E;

    public j(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.A = 0;
        this.C = intent;
        this.D = context;
        this.B = z10;
        this.E = pendingResult;
    }

    public j(c3 c3Var, g4 g4Var, boolean z10, re.a aVar, int i10) {
        this.A = i10;
        this.C = g4Var;
        this.B = z10;
        this.D = aVar;
        this.E = c3Var;
    }

    public j(c3 c3Var, g4 g4Var, boolean z10, tf.e eVar) {
        this.A = 3;
        this.C = g4Var;
        this.B = z10;
        this.D = eVar;
        Objects.requireNonNull(c3Var);
        this.E = c3Var;
    }

    @Override
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.A) {
            case 0:
                Intent intent = (Intent) this.C;
                Context context = (Context) this.D;
                boolean z10 = this.B;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.E;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        Bundle extras = intent.getExtras();
                        int iIntValue = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
                        if (extras != null) {
                            a aVar = new a(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.f4351b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c0("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.f4351b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new u(context, aVar, countDownLatch, 2));
                            try {
                                iIntValue = ((Integer) Tasks.await(new oj.h(context).b(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e3) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e3);
                            }
                            try {
                                if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e10) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z10 && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th3;
                }
            case 1:
                c3 c3Var = (c3) this.E;
                e0 e0Var = c3Var.E;
                if (e0Var != null) {
                    c3Var.n1(e0Var, this.B ? null : (b4) this.D, (g4) this.C);
                    c3Var.i1();
                    return;
                } else {
                    q0 q0Var = ((h1) c3Var.B).F;
                    h1.g(q0Var);
                    q0Var.G.b("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                c3 c3Var2 = (c3) this.E;
                e0 e0Var2 = c3Var2.E;
                if (e0Var2 != null) {
                    c3Var2.n1(e0Var2, this.B ? null : (s) this.D, (g4) this.C);
                    c3Var2.i1();
                    return;
                } else {
                    q0 q0Var2 = ((h1) c3Var2.B).F;
                    h1.g(q0Var2);
                    q0Var2.G.b("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                c3 c3Var3 = (c3) this.E;
                e0 e0Var3 = c3Var3.E;
                if (e0Var3 != null) {
                    c3Var3.n1(e0Var3, this.B ? null : (tf.e) this.D, (g4) this.C);
                    c3Var3.i1();
                    return;
                } else {
                    q0 q0Var3 = ((h1) c3Var3.B).F;
                    h1.g(q0Var3);
                    q0Var3.G.b("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }
}
