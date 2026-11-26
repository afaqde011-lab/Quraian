package yg;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.integrity.internal.af;
import dh.x;
import java.util.Objects;

public abstract class f extends x {
    public final g B;

    public f(g gVar, xf.g gVar2) {
        super(gVar2);
        Objects.requireNonNull(gVar);
        this.B = gVar;
    }

    @Override
    public final void a(Exception exc) {
        if (!(exc instanceof af)) {
            super.a(exc);
        } else if (g.d(this.B)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
