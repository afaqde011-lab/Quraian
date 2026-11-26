package im;

import a40.m0;
import android.content.SharedPreferences;
import com.mchutov.core.security.Obfuscated;
import h40.d;
import h40.e;
import kotlin.jvm.internal.m;
import lm.b;

public final class a {
    public final b a;

    public a(SharedPreferences sharedPreferences) {
        e eVar = m0.a;
        d coroutineDispatcher = d.C;
        m.e(coroutineDispatcher, "coroutineDispatcher");
        lm.a aVar = lm.a.A;
        Obfuscated obfuscated = Obfuscated.INSTANCE;
        this.a = new b(obfuscated.decode("27d60568903fb3444c872dafd05704bc6833cf0fa5e34de97c863114ee3bdb1c60c30171cc"), obfuscated.decode("2ed21835826bf819429e20acc04c12af6933cd58fae64de7"), obfuscated.decode("22c71571822bed1e5f962aebd7404ebe7535"));
        String appBaseUrl = obfuscated.decode("https://stage-api.quranify.pro/api/");
        String apiHost = obfuscated.decode("FAKE");
        String mediaHost = obfuscated.decode("22c71571822bed1e5f962aebd7404ebe7535");
        m.e(appBaseUrl, "appBaseUrl");
        m.e(apiHost, "apiHost");
        m.e(mediaHost, "mediaHost");
    }
}
