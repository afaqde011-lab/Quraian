package xo;

import a40.k;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.mchutov.quranify.auth.data.source.AppleSignInFailedException;
import java.util.UUID;
import kotlin.jvm.internal.m;
import q0.w0;
import q3.e0;
import qd.s0;
import ri.t1;
import sd.p1;

public final class a {
    public volatile p1 a;

    public final Object a(Activity activity, m00.c cVar) {
        p1 p1Var = this.a;
        if (p1Var != null) {
            this.a = null;
            if (((k) p1Var.D).w()) {
                ((k) p1Var.D).resumeWith(null);
            }
        }
        k kVar = new k(1, s0.j0(cVar));
        kVar.r();
        String string = UUID.randomUUID().toString();
        m.d(string, "toString(...)");
        String string2 = UUID.randomUUID().toString();
        m.d(string2, "toString(...)");
        p1 p1Var2 = new p1(string, string2, kVar, 22);
        this.a = p1Var2;
        kVar.u(new w0(this, p1Var2, 12));
        try {
            c7.c cVar2 = new c7.c(8);
            ((Intent) cVar2.B).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            e0 e0VarC = cVar2.c();
            Uri uriE = p1Var2.e();
            Intent intent = (Intent) e0VarC.B;
            intent.setData(uriE);
            activity.startActivity(intent, (Bundle) e0VarC.C);
        } catch (ActivityNotFoundException unused) {
            this.a = null;
            if (((k) p1Var2.D).w()) {
                ((k) p1Var2.D).resumeWith(t1.s(new AppleSignInFailedException()));
            }
        }
        Object objQ = kVar.q();
        l00.a aVar = l00.a.A;
        return objQ;
    }
}
