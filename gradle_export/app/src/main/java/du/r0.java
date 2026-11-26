package du;

import com.mchutov.core.analytics.domain.model.QuranifyAnalyticsProperty;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import ri.t1;

public final class r0 extends m00.i implements u00.n {
    public Object A;
    public final t0 B;

    public r0(t0 t0Var, k00.c cVar) {
        super(2, cVar);
        this.B = t0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        r0 r0Var = new r0(this.B, cVar);
        r0Var.A = obj;
        return r0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((zz.a) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String str;
        zz.a aVar = (zz.a) this.A;
        l00.a aVar2 = l00.a.A;
        t1.O(obj);
        g00.b0 b0Var = g00.b0.a;
        if (aVar != null && (str = aVar.a) != null && !r30.k.L0(str)) {
            t0 t0Var = this.B;
            ((tk.b) t0Var.l).a(new QuranifyAnalyticsProperty.PreferredBackgroundSound(str));
            t0Var.m.logEvent(new AudioPlayerEvent.BackgroundSoundChanged(str));
        }
        return b0Var;
    }
}
