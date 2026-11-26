package wj;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class r {

    public static final p f16203a = new p(1);

    public static final p f16204b = new p(2);

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        kotlin.jvm.internal.m.e(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = h00.x.A;
        }
        ArrayList arrayListJ0 = h00.q.J0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListJ0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i10) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.m.d(str2, "processName");
            arrayList2.add(new c0(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, kotlin.jvm.internal.m.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static c0 b(Context context) {
        Object next;
        String processName;
        kotlin.jvm.internal.m.e(context, "context");
        int iMyPid = Process.myPid();
        Iterator it = a(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((c0) next).f16128b != iMyPid);
        c0 c0Var = (c0) next;
        if (c0Var != null) {
            return c0Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            kotlin.jvm.internal.m.d(processName, "myProcessName(...)");
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                if (ve.c.f15626g == null) {
                    ve.c.f15626g = Application.getProcessName();
                }
                processName = ve.c.f15626g;
                if (processName == null) {
                    processName = RuntimeVersion.SUFFIX;
                }
            }
        }
        return new c0(iMyPid, 0, processName, false);
    }
}
