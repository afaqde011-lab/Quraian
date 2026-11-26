package b4;

import android.os.Parcelable;
import android.util.SparseArray;
import b3.b2;
import g00.b0;

public final class i extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final z B;

    public i(z zVar, int i10) {
        super(0);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.getLayoutNode().E();
                return b0.a;
            case 1:
                z zVar = this.B;
                if (zVar.E && zVar.isAttachedToWindow() && zVar.getView().getParent() == zVar) {
                    b2 snapshotObserver = zVar.getSnapshotObserver();
                    snapshotObserver.f2003a.d(zVar, c.B, zVar.getUpdate());
                }
                return b0.a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.B.f2155d0.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                z zVar2 = this.B;
                zVar2.getReleaseBlock().invoke(zVar2.f2155d0);
                z.n(zVar2);
                return b0.a;
            case 4:
                z zVar3 = this.B;
                zVar3.getResetBlock().invoke(zVar3.f2155d0);
                return b0.a;
            default:
                z zVar4 = this.B;
                zVar4.getUpdateBlock().invoke(zVar4.f2155d0);
                return b0.a;
        }
    }
}
