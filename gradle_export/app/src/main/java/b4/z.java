package b4;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.ui.node.Owner;
import l1.e0;
import sd.p1;

public final class z extends j {

    public final View f2155d0;

    public final u2.d f2156e0;

    public y1.e f2157f0;

    public u00.k f2158g0;

    public u00.k f2159h0;

    public u00.k f2160i0;

    public z(Context context, u00.k kVar, e0 e0Var, y1.f fVar, int i10, Owner owner) {
        View view = (View) kVar.invoke(context);
        u2.d dVar = new u2.d();
        super(context, e0Var, i10, dVar, view, owner);
        this.f2155d0 = view;
        this.f2156e0 = dVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objC = fVar != null ? fVar.c(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fVar != null) {
            setSavableRegistryEntry(fVar.d(strValueOf, new i(this, 2)));
        }
        c cVar = c.E;
        this.f2158g0 = cVar;
        this.f2159h0 = cVar;
        this.f2160i0 = cVar;
    }

    public static final void n(z zVar) {
        zVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(y1.e eVar) {
        y1.e eVar2 = this.f2157f0;
        if (eVar2 != null) {
            ((p1) eVar2).L();
        }
        this.f2157f0 = eVar;
    }

    public final u2.d getDispatcher() {
        return this.f2156e0;
    }

    public final u00.k getReleaseBlock() {
        return this.f2160i0;
    }

    public final u00.k getResetBlock() {
        return this.f2159h0;
    }

    public c3.a getSubCompositionView() {
        return null;
    }

    public final u00.k getUpdateBlock() {
        return this.f2158g0;
    }

    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(u00.k kVar) {
        this.f2160i0 = kVar;
        setRelease(new i(this, 3));
    }

    public final void setResetBlock(u00.k kVar) {
        this.f2159h0 = kVar;
        setReset(new i(this, 4));
    }

    public final void setUpdateBlock(u00.k kVar) {
        this.f2158g0 = kVar;
        setUpdate(new i(this, 5));
    }
}
