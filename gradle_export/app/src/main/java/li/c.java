package li;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.google.protobuf.RuntimeVersion;
import h00.q;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ri.c2;
import ri.y0;
import ri.z0;

public final class c {

    public static final c f10296a = new c();

    public static final c f10297b = new c();

    public static ArrayList c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        m.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = x.A;
        }
        ArrayList arrayListJ0 = q.J0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListJ0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            y0 y0Var = new y0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            y0Var.f13574a = str2;
            y0Var.f13575b = runningAppProcessInfo.pid;
            byte b7 = (byte) (y0Var.f13578e | 1);
            y0Var.f13576c = runningAppProcessInfo.importance;
            y0Var.f13578e = (byte) (b7 | 2);
            y0Var.f13577d = m.a(str2, str);
            y0Var.f13578e = (byte) (y0Var.f13578e | 4);
            arrayList2.add(y0Var.a());
        }
        return arrayList2;
    }

    public boolean a(int i10) {
        return 4 <= i10 || Log.isLoggable("FirebaseCrashlytics", i10);
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public c2 d(Context context) {
        Object next;
        String processName;
        m.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = c(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((z0) ((c2) next)).f13582b != iMyPid);
        c2 c2Var = (c2) next;
        if (c2Var != null) {
            return c2Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            m.b(processName);
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = RuntimeVersion.SUFFIX;
            }
        }
        int i10 = (12 & 4) != 0 ? 0 : 0;
        m.e(processName, "processName");
        y0 y0Var = new y0();
        y0Var.f13574a = processName;
        y0Var.f13575b = iMyPid;
        byte b7 = (byte) (y0Var.f13578e | 1);
        y0Var.f13576c = i10;
        y0Var.f13577d = false;
        y0Var.f13578e = (byte) (((byte) (b7 | 2)) | 4);
        return y0Var.a();
    }

    public void e(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void f(String str, Exception exc) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}
