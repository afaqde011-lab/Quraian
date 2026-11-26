package f7;

import java.util.ArrayList;

public final class s implements Comparable {
    public long B = -9223372036854775807L;
    public final ArrayList A = new ArrayList();

    @Override
    public final int compareTo(Object obj) {
        return Long.compare(this.B, ((s) obj).B);
    }
}
