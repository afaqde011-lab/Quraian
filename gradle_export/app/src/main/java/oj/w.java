package oj;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sd.y1;

public final class w {

    public static final long f12116i = TimeUnit.HOURS.toSeconds(8);

    public static final int f12117j = 0;

    public final Context f12118a;

    public final m f12119b;

    public final y1 f12120c;

    public final FirebaseMessaging f12121d;

    public final ScheduledThreadPoolExecutor f12123f;

    public final u f12125h;

    public final u.e f12122e = new u.e(0);

    public boolean f12124g = false;

    public w(FirebaseMessaging firebaseMessaging, m mVar, u uVar, y1 y1Var, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f12121d = firebaseMessaging;
        this.f12119b = mVar;
        this.f12125h = uVar;
        this.f12120c = y1Var;
        this.f12118a = context;
        this.f12123f = scheduledThreadPoolExecutor;
    }

    public static void a(Task task) throws IOException {
        try {
            Tasks.a(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e10);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String strA = this.f12121d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        y1 y1Var = this.f12120c;
        a(y1Var.x(y1Var.Y(strA, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String strA = this.f12121d.a();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        y1 y1Var = this.f12120c;
        a(y1Var.x(y1Var.Y(strA, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z10) {
        this.f12124g = z10;
    }

    public final boolean e() throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: oj.w.e():boolean");
    }

    public final void f(long j9) {
        this.f12123f.schedule(new y(this, this.f12118a, this.f12119b, Math.min(Math.max(30L, 2 * j9), f12116i)), j9, TimeUnit.SECONDS);
        d(true);
    }
}
