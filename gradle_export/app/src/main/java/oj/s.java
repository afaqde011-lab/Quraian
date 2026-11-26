package oj;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.api.internal.d0;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tf.c3;
import tf.h1;
import tf.q2;
import tf.t2;

public final class s implements Runnable {
    public final int A = 0;
    public final long B;
    public final Object C;
    public final Object D;

    public s(FirebaseMessaging firebaseMessaging, long j9) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new qd.c0("firebase-iid-executor"));
        this.D = firebaseMessaging;
        this.B = j9;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f4355b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.C = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public s(t2 t2Var, q2 q2Var, long j9) {
        this.C = q2Var;
        this.B = j9;
        Objects.requireNonNull(t2Var);
        this.D = t2Var;
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.D).f4355b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.D).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e3.getMessage() != null) {
                    throw e3;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e3.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.C;
                q qVarF = q.F();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.D;
                if (qVarF.K(firebaseMessaging.f4355b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f4362i = true;
                        }
                        if (!firebaseMessaging.f4361h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.f4362i = false;
                            }
                            if (!q.F().K(firebaseMessaging.f4355b)) {
                                return;
                            }
                        } else if (!q.F().J(firebaseMessaging.f4355b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.f4362i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.B);
                            }
                            if (!q.F().K(firebaseMessaging.f4355b)) {
                                return;
                            }
                        } else {
                            d0 d0Var = new d0();
                            d0Var.f3184c = this;
                            d0Var.a();
                            if (!q.F().K(firebaseMessaging.f4355b)) {
                                return;
                            }
                        }
                    } catch (IOException e3) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e3.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.f4362i = false;
                            if (!q.F().K(firebaseMessaging.f4355b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th2) {
                    if (q.F().K(firebaseMessaging.f4355b)) {
                        wakeLock.release();
                    }
                    throw th2;
                }
            default:
                t2 t2Var = (t2) this.D;
                t2Var.Z0((q2) this.C, false, this.B);
                t2Var.F = null;
                c3 c3VarJ = ((h1) t2Var.B).j();
                c3VarJ.V0();
                c3VarJ.W0();
                c3VarJ.j1(new kh.r(c3VarJ, (q2) null));
                return;
        }
    }
}
