package ul;

import android.content.SharedPreferences;

public final class a {
    public final SharedPreferences a;
    public volatile String b;

    public a(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        this.b = sharedPreferences.getString("pending_deep_link_url", null);
    }
}
