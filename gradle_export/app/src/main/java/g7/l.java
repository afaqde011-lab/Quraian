package g7;

import java.util.Map;

public final class l implements eh.n {
    public final int A;

    @Override
    public final boolean apply(Object obj) {
        switch (this.A) {
            case 0:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
