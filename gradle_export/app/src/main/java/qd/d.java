package qd;

import org.json.JSONObject;

public final class d {

    public final String f12869a;

    public d(String str) {
        this.f12869a = new JSONObject(str).optString("countryCode");
    }

    public d(String str, int i10) {
        this.f12869a = str;
    }
}
