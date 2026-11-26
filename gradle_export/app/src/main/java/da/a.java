package da;

import a1.u0;
import gj.e;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    public static final e f4840c = new e(8);

    public static final LinkedHashMap f4841d = new LinkedHashMap();

    public final ReentrantLock f4842a;

    public final u0 f4843b;

    public a(String str, boolean z10) {
        ReentrantLock reentrantLock;
        synchronized (f4840c) {
            try {
                LinkedHashMap linkedHashMap = f4841d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f4842a = reentrantLock;
        this.f4843b = z10 ? new u0(str) : null;
    }
}
