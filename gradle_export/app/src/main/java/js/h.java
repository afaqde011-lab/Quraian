package js;

import android.content.Context;
import android.content.SharedPreferences;
import bk.m;
import java.io.File;

public final class h {
    public final Context a;
    public final SharedPreferences b;
    public final m c;

    public h(Context context, SharedPreferences sharedPreferences, m mVar) {
        this.a = context;
        this.b = sharedPreferences;
        this.c = mVar;
        if (sharedPreferences.contains("listening_import_rejected_accounts")) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove("listening_import_rejected_accounts");
            editorEdit.apply();
        }
    }

    public final File a() {
        return new File(this.a.getFilesDir(), "listening_import.json.gz");
    }
}
