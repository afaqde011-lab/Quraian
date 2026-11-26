package dh;

import java.util.Set;

public abstract class i extends e implements Set {
    public static final int C = 0;
    public transient j B;

    @Override
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return set.size() == 0 && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
