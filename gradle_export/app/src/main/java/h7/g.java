package h7;

import android.net.Uri;
import android.util.Log;
import c40.l;
import g1.b5;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import rc.a0;

public final class g extends Thread {
    public final int A;
    public final Object B;

    public g(h hVar) {
        super("ExoPlayer:SimpleDecoder");
        this.A = 0;
        this.B = hVar;
    }

    public g(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                do {
                    try {
                    } catch (InterruptedException e3) {
                        throw new IllegalStateException(e3);
                    }
                    break;
                } while (((h) this.B).j());
                return;
            case 1:
                b5 b5Var = (b5) this.B;
                ((l) b5Var.f5744j).i((CancellationException) null);
                ((l) b5Var.f5743i).i((CancellationException) null);
                b5Var.f5735a = false;
                return;
            case 2:
                HashMap map = (HashMap) this.B;
                Uri.Builder builderBuildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String str : map.keySet()) {
                    builderBuildUpon.appendQueryParameter(str, (String) map.get(str));
                }
                String string = builderBuildUpon.build().toString();
                try {
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
                        try {
                            int responseCode = httpURLConnection.getResponseCode();
                            if (responseCode < 200 || responseCode >= 300) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 65);
                                sb2.append("Received non-success response code ");
                                sb2.append(responseCode);
                                sb2.append(" from pinging URL: ");
                                sb2.append(string);
                                Log.w("HttpUrlPinger", sb2.toString());
                                break;
                            }
                            return;
                        } finally {
                            httpURLConnection.disconnect();
                        }
                    } catch (IOException | RuntimeException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + String.valueOf(string).length() + 27);
                        sb3.append("Error while pinging URL: ");
                        sb3.append(string);
                        sb3.append(". ");
                        sb3.append(message);
                        Log.w("HttpUrlPinger", sb3.toString(), e10);
                        return;
                    }
                } catch (IndexOutOfBoundsException e11) {
                    String message2 = e11.getMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + String.valueOf(string).length() + 32);
                    sb4.append("Error while parsing ping URL: ");
                    sb4.append(string);
                    sb4.append(". ");
                    sb4.append(message2);
                    Log.w("HttpUrlPinger", sb4.toString(), e11);
                    return;
                }
            default:
                a0 a0Var = ((rc.c) this.B).f13157g;
                m.c(a0Var, "null cannot be cast to non-null type com.amplitude.android.Timeline");
                a0Var.C.i((CancellationException) null);
                return;
        }
    }
}
