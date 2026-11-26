package zo;

import java.util.List;
import r30.k;
import r30.r;

public abstract class b {
    public static final List a = va.a.S(new String[]{"/auth/change-password", "/auth/devices", "/auth/logout", "/auth/me", "/v2/auth/me/delete-code", "/v2/auth/me", "/auth/push-token", "/v1/subscription/cancel", "/v1/subscription/purchase-device", "/listening/me", "/listening/events", "/listening/import", "/listening/goal", "/listening/year", "/audio-stories"});

    public static final boolean a(String str) {
        List<String> list = a;
        if (list == null || !list.isEmpty()) {
            for (String str2 : list) {
                String strD1 = k.d1(k.R0(str, "/api"), '?');
                if (strD1.equals(str2)) {
                    return true;
                }
                if (r.x0(strD1, str2 + "/", false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
