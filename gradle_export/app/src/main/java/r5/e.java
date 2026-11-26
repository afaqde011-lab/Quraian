package r5;

import android.content.SharedPreferences;
import java.util.Set;
import kotlin.jvm.internal.m;

public final class e {

    public final SharedPreferences f13123a;

    public final Set f13124b;

    public e(SharedPreferences sharedPreferences, Set set) {
        m.e(sharedPreferences, "prefs");
        this.f13123a = sharedPreferences;
        this.f13124b = set;
    }
}
