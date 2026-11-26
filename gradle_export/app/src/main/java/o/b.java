package o;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p.m1;

public final class b extends m1 {
    public final int J = 0;
    public final View K;

    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.K = actionMenuItemView;
    }

    public b(p.i iVar, p.i iVar2) {
        super(iVar2);
        this.K = iVar;
    }

    @Override
    public final b0 b() {
        p.f fVar;
        switch (this.J) {
            case 0:
                c cVar = ((ActionMenuItemView) this.K).L;
                if (cVar == null || (fVar = ((p.g) cVar).f12163a.T) == null) {
                    return null;
                }
                return fVar.a();
            default:
                p.f fVar2 = ((p.i) this.K).D.S;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override
    public final boolean c() {
        b0 b0VarB;
        switch (this.J) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.K;
                k kVar = actionMenuItemView.J;
                return kVar != null && kVar.c(actionMenuItemView.G) && (b0VarB = b()) != null && b0VarB.a();
            default:
                ((p.i) this.K).D.l();
                return true;
        }
    }

    @Override
    public boolean d() {
        switch (this.J) {
            case 1:
                p.j jVar = ((p.i) this.K).D;
                if (jVar.U != null) {
                    return false;
                }
                jVar.h();
                return true;
            default:
                return super.d();
        }
    }
}
