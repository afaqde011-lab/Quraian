package me;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.internal.d0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class c implements Runnable {
    public static final c50.h C = new c50.h("RevokeAccessOperation", new String[0]);
    public final String A;
    public final s B;

    public c(String str) {
        d0.e(str);
        this.A = str;
        this.B = new s(null, 0);
    }

    @Override
    public final void run() {
        c50.h hVar = C;
        Status status = Status.G;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.A).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.E;
            } else {
                Log.e((String) hVar.D, ((String) hVar.C).concat("Unable to revoke access!"));
            }
            hVar.g("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e3) {
            Log.e((String) hVar.D, ((String) hVar.C).concat("IOException when revoking access: ".concat(String.valueOf(e3.toString()))));
        } catch (Exception e10) {
            Log.e((String) hVar.D, ((String) hVar.C).concat("Exception when revoking access: ".concat(String.valueOf(e10.toString()))));
        }
        this.B.setResult(status);
    }
}
