package a3;

import com.google.android.gms.internal.measurement.y3;
import l1.i1;
import l1.q;
import me.i;

public final class d extends y3 {

    public final i f169g;

    public final i1 f170h = q.z(null);

    public d(i iVar) {
        this.f169g = iVar;
    }

    @Override
    public final Object F(i iVar) {
        if (iVar != this.f169g) {
            y2.a.c("Check failed.");
        }
        Object value = this.f170h.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override
    public final boolean w(i iVar) {
        return iVar == this.f169g;
    }
}
