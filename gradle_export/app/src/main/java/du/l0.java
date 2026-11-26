package du;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import com.mchutov.quranify.main.presentation.screen.main.MainEffect$OpenAppUpdateScreen;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class l0 extends m00.i implements u00.n {
    public Object A;
    public final Context B;
    public final a40.z C;
    public final ah.e D;
    public final cu.a E;
    public final vp.x F;
    public final t0 G;

    public l0(Context context, a40.z zVar, ah.e eVar, cu.a aVar, vp.x xVar, t0 t0Var, k00.c cVar) {
        super(2, cVar);
        this.B = context;
        this.C = zVar;
        this.D = eVar;
        this.E = aVar;
        this.F = xVar;
        this.G = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        l0 l0Var = new l0(this.B, this.C, this.D, this.E, this.F, this.G, cVar);
        l0Var.A = obj;
        return l0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws IOException {
        l0 l0Var = (l0) create((f0) obj, (k00.c) obj2);
        g00.b0 b0Var = g00.b0.a;
        l0Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws IOException {
        f0 f0Var = (f0) this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        boolean z = f0Var instanceof b0;
        g00.b0 b0Var = g00.b0.a;
        k.k context = this.B;
        if (z) {
            MainActivity mainActivity = context instanceof MainActivity ? (MainActivity) context : null;
            if (mainActivity != null) {
                ta.c0.M(this.C, (k00.i) null, (u00.n) null, (u00.k) null, new a1.g(this.F, f0Var, mainActivity, this.G, (k00.c) null, 22), 31);
                return b0Var;
            }
        } else if (f0Var instanceof c0) {
            k.k kVar = context instanceof MainActivity ? (MainActivity) context : null;
            if (kVar != null) {
                ah.b bVar = ((c0) f0Var).a;
                ah.e eVar = this.D;
                eVar.getClass();
                ah.b bVar2 = bVar;
                if (bVar2.B) {
                    Tasks.d((Object) null);
                } else {
                    Intent intent = new Intent((Context) kVar, (Class<?>) PlayCoreDialogWrapperActivity.class);
                    intent.putExtra("confirmation_intent", bVar2.A);
                    intent.putExtra("window_flags", kVar.getWindow().getDecorView().getWindowSystemUiVisibility());
                    intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, (Parcelable) new ah.d(eVar.b, new xf.g()));
                    kVar.startActivity(intent);
                }
            }
        } else {
            boolean z2 = f0Var instanceof e0;
            cu.a aVar2 = this.E;
            if (z2) {
                aVar2.getClass();
                kotlin.jvm.internal.m.e(context, "context");
                Uri uri = Uri.parse("https://t.me/QuranifySupportBot");
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                } catch (ActivityNotFoundException unused) {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri));
                }
            } else if (f0Var instanceof d0) {
                String str = ((d0) f0Var).a;
                aVar2.getClass();
                kotlin.jvm.internal.m.e(context, "context");
                String str2 = Build.MANUFACTURER;
                String strM = Build.MODEL;
                kotlin.jvm.internal.m.b(strM);
                kotlin.jvm.internal.m.b(str2);
                if (!r30.r.x0(strM, str2, false)) {
                    strM = x5.m(str2, " ", strM);
                }
                String str3 = Build.VERSION.RELEASE;
                int i = Build.VERSION.SDK_INT;
                StringBuilder sbS = a1.b.s("\n        ", str, "\n        \n        \n        \n        -------------------\n        App Version: 2.4.1 (92)\n        Device: ", strM, "\n        Android version: ");
                sbS.append(str3);
                sbS.append("\n        API version: ");
                sbS.append(i);
                sbS.append("\n        -------------------\n        ");
                Uri uri2 = Uri.parse("mailto:support+android@quranify.pro?body=" + r30.l.j0(sbS.toString()) + "&subject=Quranify Feedback (Android)");
                try {
                    context.startActivity(new Intent("android.intent.action.SENDTO", uri2));
                } catch (ActivityNotFoundException unused2) {
                    context.startActivity(new Intent("android.intent.action.VIEW", uri2));
                }
            } else if (kotlin.jvm.internal.m.a(f0Var, MainEffect$OpenAppUpdateScreen.INSTANCE)) {
                aVar2.getClass();
                kotlin.jvm.internal.m.e(context, "context");
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.mchutov.Quranify")));
                } catch (ActivityNotFoundException unused3) {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.mchutov.Quranify")));
                }
            } else if (!z) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b0Var;
    }
}
