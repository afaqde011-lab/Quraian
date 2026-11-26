package qa;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class a {

    public static final HashMap f12798e = new HashMap();

    public final boolean f12799a;

    public final File f12800b;

    public final Lock f12801c;

    public FileChannel f12802d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f12799a = z10;
        this.f12800b = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = f12798e;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f12801c = lock;
    }

    public final void a(boolean z10) {
        this.f12801c.lock();
        if (z10) {
            File file = this.f12800b;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f12802d = channel;
            } catch (IOException e3) {
                this.f12802d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e3);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f12802d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f12801c.unlock();
    }
}
