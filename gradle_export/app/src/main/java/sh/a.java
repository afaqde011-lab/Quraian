package sh;

import android.content.Context;
import android.preference.PreferenceManager;
import mh.f;

public final class a {

    public static final Object f14236b = new Object();

    public final f f14237a;

    public a(ui.b bVar) {
        Context context = (Context) bVar.C;
        String str = (String) bVar.B;
        String str2 = (String) bVar.D;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f14237a = (f) bVar.H;
    }
}
