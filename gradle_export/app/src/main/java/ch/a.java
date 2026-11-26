package ch;

import java.util.HashMap;

public abstract class a {

    public static final HashMap f3155a;

    public static final HashMap f3156b;

    static {
        HashMap map = new HashMap();
        f3155a = map;
        HashMap map2 = new HashMap();
        f3156b = map2;
        map.put(-1, "The Play Store app is either not installed or not the official version.");
        map.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(-2, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
