package ve;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class f {

    public static final Method f15629a;

    public static final Method f15630b;

    public static Boolean f15631c;

    static {
        Method method;
        Method method2;
        Class cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f15629a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f15630b = method2;
        try {
            WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
        }
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception e3) {
            Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e3);
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
        } catch (Exception e10) {
            Log.w("WorkSourceUtil", "Missing WorkChain class", e10);
        }
        try {
            WorkSource.class.getMethod("isEmpty", null).setAccessible(true);
        } catch (Exception unused6) {
        }
        f15631c = null;
    }
}
