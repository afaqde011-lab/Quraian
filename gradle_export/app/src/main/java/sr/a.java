package sr;

import android.content.SharedPreferences;
import java.util.Set;
import w50.c;

public abstract class a {
    public static final Set a = c.g0("2.4.1");

    public static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("last_seen_whats_new_version", "2.4.1");
        editorEdit.remove("last_change_log_version");
        editorEdit.apply();
    }
}
