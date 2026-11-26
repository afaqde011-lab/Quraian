package sy;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$SettingsScreen;
import cq.j;
import h00.v;
import java.io.IOException;
import kotlin.jvm.internal.m;
import l1.q;
import r30.l;
import r30.r;
import z1.p;

public final class c implements j {
    public final Context a;
    public final p b = q.y(new p9.g[]{SettingsRoute$SettingsScreen.INSTANCE});

    public c(Context context) {
        this.a = context;
    }

    public static void e(Context context) {
        m.e(context, "context");
        Uri uri = Uri.parse("https://t.me/QuranifySupportBot");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
    }

    @Override
    public final void a() {
        v.z0(this.b);
    }

    @Override
    public final p b() {
        return this.b;
    }

    @Override
    public final void c(p9.g route) {
        m.e(route, "route");
        this.b.add(route);
    }

    public final void d(Context context, String str, String str2) throws IOException {
        m.e(context, "context");
        String str3 = Build.MANUFACTURER;
        String strM = Build.MODEL;
        m.b(strM);
        m.b(str3);
        if (!r.x0(strM, str3, false)) {
            strM = x5.m(str3, " ", strM);
        }
        String str4 = Build.VERSION.RELEASE;
        int i = Build.VERSION.SDK_INT;
        StringBuilder sbS = a1.b.s("\n        ", str2, "\n        \n        \n        \n        -------------------\n        App Version: 2.4.1 (92)\n        Device: ", strM, "\n        Android version: ");
        sbS.append(str4);
        sbS.append("\n        API version: ");
        sbS.append(i);
        sbS.append("\n        -------------------\n        ");
        Uri uri = Uri.parse("mailto:support+android@quranify.pro?body=" + l.j0(sbS.toString()) + "&subject=" + str);
        try {
            context.startActivity(new Intent("android.intent.action.SENDTO", uri));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
    }
}
