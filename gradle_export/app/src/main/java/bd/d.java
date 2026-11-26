package bd;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.m;

public final class d {

    public final SharedPreferences f2493a;

    public d(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f2493a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e3) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e3.getMessage());
            }
        }
    }

    public d(SharedPreferences sharedPreferences) {
        this.f2493a = sharedPreferences;
    }

    public void a(String str) {
        m.e(str, "key");
        this.f2493a.edit().remove(str).commit();
    }

    public long b(String str, long j9) {
        m.e(str, "key");
        return this.f2493a.getLong(str, j9);
    }

    public boolean c(long j9, String str) {
        m.e(str, "key");
        return this.f2493a.edit().putLong(str, j9).commit();
    }
}
