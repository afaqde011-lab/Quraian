package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public interface f extends androidx.media3.common.j {
    void close();

    long p(j jVar);

    default Map r() {
        return Collections.EMPTY_MAP;
    }

    void s(s sVar);

    Uri y();
}
