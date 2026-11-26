package k9;

import android.app.PendingIntent;
import android.os.Bundle;
import android.text.TextUtils;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import java.util.HashMap;
import java.util.List;

public final class g1 {

    public static final Object f9305b = new Object();

    public static final HashMap f9306c = new HashMap();

    public final s1 f9307a;

    public g1(AudioPlayerService audioPlayerService, tv.d dVar, PendingIntent pendingIntent, fh.t0 t0Var, fh.t0 t0Var2, fh.t0 t0Var3, nv.p pVar, Bundle bundle, Bundle bundle2, h1.l lVar) {
        synchronized (f9305b) {
            HashMap map = f9306c;
            if (map.containsKey("QURANIFY_MEDIA_SESSION_ID")) {
                throw new IllegalStateException("Session ID must be unique. ID=QURANIFY_MEDIA_SESSION_ID");
            }
            map.put("QURANIFY_MEDIA_SESSION_ID", this);
        }
        this.f9307a = new s1(this, audioPlayerService, dVar, pendingIntent, t0Var, t0Var2, t0Var3, pVar, bundle, bundle2, lVar);
    }

    public final androidx.media3.common.f1 a() {
        return this.f9307a.f9430t.getWrappedPlayer();
    }

    public final void b(int i10, String str) {
        ta.c0.s(!TextUtils.isEmpty(str));
        ta.c0.s(i10 >= 0);
        s1 s1Var = this.f9307a;
        fh.d2 d2VarG = s1Var.E.f9307a.g();
        for (int i11 = 0; i11 < d2VarG.D; i11++) {
            a2 a2VarJ = (a2) d2VarG.get(i11);
            if (!s1Var.A || !s1Var.n(a2VarJ) || (a2VarJ = s1Var.j()) != null) {
                s1Var.e(a2VarJ, new n1(s1Var, str, i10, (e1) null));
            }
        }
    }

    public final void c(a2 a2Var, String str, int i10, e1 e1Var) {
        ta.c0.s(!TextUtils.isEmpty(str));
        ta.c0.s(i10 >= 0);
        s1 s1Var = this.f9307a;
        if (s1Var.A && s1Var.n(a2Var) && (a2Var = s1Var.j()) == null) {
            return;
        }
        s1Var.e(a2Var, new r1(i10, str, e1Var));
    }

    public final void d() {
        try {
            synchronized (f9305b) {
                f9306c.remove(this.f9307a.f9421i);
            }
            this.f9307a.E();
        } catch (Exception unused) {
        }
    }

    public final void e(a2 a2Var, List list) {
        ta.c0.w(list, "media button preferences must not be null");
        fh.t0 t0VarO = fh.t0.o(list);
        s1 s1Var = this.f9307a;
        t2 t2Var = s1Var.f9420h;
        if (s1Var.n(a2Var)) {
            t2Var.M(t0VarO);
            t2Var.P(s1Var.f9430t);
        }
        s1Var.d(a2Var, new c2(t0VarO));
    }
}
