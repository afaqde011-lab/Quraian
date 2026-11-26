package oc;

import android.util.Log;
import java.util.HashSet;

public abstract class b {

    public static final a f11920a = new a();

    public static void a(String str) {
        f11920a.getClass();
        HashSet hashSet = a.f11919a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th2) {
        f11920a.getClass();
        HashSet hashSet = a.f11919a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th2);
        hashSet.add(str);
    }
}
