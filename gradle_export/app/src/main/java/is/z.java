package is;

import android.content.SharedPreferences;

public final class z {
    public final SharedPreferences a;

    public z(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        if (sharedPreferences.contains("listening_local_data_since")) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong("listening_local_data_since", jCurrentTimeMillis);
        editorEdit.apply();
    }
}
