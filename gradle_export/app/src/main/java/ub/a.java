package ub;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import kotlin.jvm.internal.m;
import o9.q;
import qd.j0;
import s10.w0;
import tf.w;

public final class a {

    public final Context f15230a;

    public double f15231b;

    public final boolean f15232c;

    public final boolean f15233d;

    public a(Context context) {
        this.f15230a = context;
        Bitmap.Config[] configArr = bc.d.f2480a;
        double d3 = 0.2d;
        try {
            Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
            m.b(systemService);
            if (((ActivityManager) systemService).isLowRamDevice()) {
                d3 = 0.15d;
            }
        } catch (Exception unused) {
        }
        this.f15231b = d3;
        this.f15232c = true;
        this.f15233d = true;
    }

    public final d a() {
        w0 qVar;
        int largeMemoryClass;
        int i10 = 0;
        h j0Var = this.f15233d ? new j0(15, (byte) 0) : new w(13);
        if (this.f15232c) {
            double d3 = this.f15231b;
            if (d3 > 0.0d) {
                Context context = this.f15230a;
                Bitmap.Config[] configArr = bc.d.f2480a;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    m.b(systemService);
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                } catch (Exception unused) {
                    largeMemoryClass = 256;
                }
                double d5 = 1024;
                i10 = (int) (d3 * ((double) largeMemoryClass) * d5 * d5);
            }
            qVar = i10 > 0 ? new w0(i10, j0Var) : new q(j0Var, 25);
        } else {
            qVar = new q(j0Var, 25);
        }
        return new d(qVar, j0Var);
    }
}
