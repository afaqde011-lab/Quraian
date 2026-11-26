package a8;

import android.net.Uri;
import java.util.Map;

public interface t {
    q[] e();

    default q[] f(Uri uri, Map map) {
        return e();
    }
}
