package v6;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import oi.k;
import tf.y;

public final class b {

    public final y f15481a = new y(14);

    public final LinkedHashMap f15482b = new LinkedHashMap();

    public final LinkedHashSet f15483c = new LinkedHashSet();

    public volatile boolean f15484d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                k.x(autoCloseable);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
