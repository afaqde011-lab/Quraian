package bt;

import com.mchutov.quranify.insights.presentation.screen.insights.InsightsAction$OnCloseScreen;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerAction$OnCloseScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

public final class t0 implements u00.a {
    public final int A;
    public final u00.k B;

    public t0(int i, u00.k kVar) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke(g.a);
                break;
            case 1:
                this.B.invoke(InsightsAction$OnCloseScreen.INSTANCE);
                break;
            case 2:
                this.B.invoke(bv.m.a);
                break;
            case 3:
                this.B.invoke(bv.q.a);
                break;
            case 4:
                this.B.invoke(bv.p.a);
                break;
            case 5:
                this.B.invoke(bv.l.a);
                break;
            case 6:
                this.B.invoke(new c00.c(null));
                break;
            case 7:
                this.B.invoke(SoundEffectPickerAction$OnCloseScreen.INSTANCE);
                break;
            case 8:
                this.B.invoke(c00.b.a);
                break;
            case 9:
                this.B.invoke(j.a);
                break;
            case 10:
                this.B.invoke(k.a);
                break;
            case 11:
                this.B.invoke(u.a);
                break;
            case 12:
                this.B.invoke(i.a);
                break;
            case 13:
                this.B.invoke(o.a);
                break;
            case 14:
                this.B.invoke(n.a);
                break;
            case 15:
                this.B.invoke(ds.f.a);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                this.B.invoke(ds.b.a);
                break;
            case 17:
                this.B.invoke(ds.e.a);
                break;
            case 18:
                this.B.invoke(dz.c.a);
                break;
            case 19:
                this.B.invoke(5);
                break;
            case 20:
                this.B.invoke(ev.c.a);
                break;
            case 21:
                this.B.invoke(ev.b.a);
                break;
            case 22:
                this.B.invoke(ev.i.a);
                break;
            case 23:
                this.B.invoke(ev.d.a);
                break;
            case 24:
                this.B.invoke(ev.e.a);
                break;
            case 25:
                this.B.invoke(ev.f.a);
                break;
            case 26:
                this.B.invoke(ez.d.a);
                break;
            case 27:
                this.B.invoke(ez.b.a);
                break;
            case 28:
                this.B.invoke(ez.c.a);
                break;
            default:
                this.B.invoke(ez.e.a);
                break;
        }
        return g00.b0.a;
    }
}
