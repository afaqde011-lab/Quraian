package sd;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.x5;
import java.util.HashMap;

public abstract class c2 {

    public static final HashMap f13963a;

    static {
        HashMap map = new HashMap(13);
        f13963a = map;
        Integer numValueOf = Integer.valueOf(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN);
        map.put("normal", numValueOf);
        map.put("bold", 700);
        x5.t(1, map, "bolder", -1, "lighter");
        x5.t(100, map, "100", MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN, "200");
        map.put("300", Integer.valueOf(MediaError.DetailedErrorCode.NETWORK_UNKNOWN));
        map.put("400", numValueOf);
        x5.t(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, map, "500", MediaError.DetailedErrorCode.TEXT_UNKNOWN, "600");
        x5.y(map, "700", 700, 800, "800");
        map.put("900", Integer.valueOf(MediaError.DetailedErrorCode.APP));
    }
}
