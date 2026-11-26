package ii;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class m implements ij.b {

    public volatile Set f7708a;

    public volatile Set f7709b;

    @Override
    public final Object get() {
        if (this.f7709b == null) {
            synchronized (this) {
                try {
                    if (this.f7709b == null) {
                        this.f7709b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f7708a.iterator();
                                while (it.hasNext()) {
                                    this.f7709b.add(((ij.b) it.next()).get());
                                }
                                this.f7708a = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return Collections.unmodifiableSet(this.f7709b);
    }
}
