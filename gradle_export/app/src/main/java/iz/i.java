package iz;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import g00.b0;
import l1.z0;

public final class i implements u00.a {
    public final int A;
    public final u00.k B;
    public final z0 C;

    public i(u00.k kVar, z0 z0Var, int i) {
        this.A = i;
        this.B = kVar;
        this.C = z0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.invoke((String) this.C.getValue());
                break;
            case 1:
                this.B.invoke((PlayerItem) this.C.getValue());
                break;
            default:
                this.C.setValue(Boolean.FALSE);
                this.B.invoke(ur.m.a);
                break;
        }
        return b0.a;
    }
}
