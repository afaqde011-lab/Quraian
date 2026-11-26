package ba;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public abstract class g0 {
    private final h0 mObservable = new h0();
    private boolean mHasStableIds = false;
    private f0 mStateRestorationPolicy = f0.A;

    public final void bindViewHolder(f1 f1Var, int i10) {
        g0 g0Var = f1Var.f2291s;
        View view = f1Var.f2275a;
        boolean z10 = g0Var == null;
        if (z10) {
            f1Var.f2277c = i10;
            if (hasStableIds()) {
                f1Var.f2279e = getItemId(i10);
            }
            f1Var.f2284j = (f1Var.f2284j & (-520)) | 1;
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(f1Var.f2280f)));
            }
        }
        f1Var.f2291s = this;
        if (RecyclerView.f1852b1) {
            if (view.getParent() == null && view.isAttachedToWindow() != f1Var.j()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + f1Var.j() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + f1Var);
            }
            if (view.getParent() == null && view.isAttachedToWindow()) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + f1Var);
            }
        }
        onBindViewHolder(f1Var, i10, f1Var.c());
        if (z10) {
            ArrayList arrayList = f1Var.f2285k;
            if (arrayList != null) {
                arrayList.clear();
            }
            f1Var.f2284j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof q0) {
                ((q0) layoutParams).f2394c = true;
            }
            Trace.endSection();
        }
    }

    public boolean canRestoreState() {
        int iOrdinal = this.mStateRestorationPolicy.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2;
        }
        return getItemCount() > 0;
    }

    public final f1 createViewHolder(ViewGroup viewGroup, int i10) {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i10)));
            }
            f1 f1VarOnCreateViewHolder = onCreateViewHolder(viewGroup, i10);
            if (f1VarOnCreateViewHolder.f2275a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            f1VarOnCreateViewHolder.f2280f = i10;
            Trace.endSection();
            return f1VarOnCreateViewHolder;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public int findRelativeAdapterPositionIn(g0 g0Var, f1 f1Var, int i10) {
        if (g0Var == this) {
            return i10;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i10) {
        return -1L;
    }

    public int getItemViewType(int i10) {
        return 0;
    }

    public final f0 getStateRestorationPolicy() {
        return this.mStateRestorationPolicy;
    }

    public final boolean hasObservers() {
        return this.mObservable.a();
    }

    public final boolean hasStableIds() {
        return this.mHasStableIds;
    }

    public final void notifyDataSetChanged() {
        this.mObservable.b();
    }

    public final void notifyItemChanged(int i10) {
        this.mObservable.d(i10, 1, null);
    }

    public final void notifyItemChanged(int i10, Object obj) {
        this.mObservable.d(i10, 1, obj);
    }

    public final void notifyItemInserted(int i10) {
        this.mObservable.e(i10, 1);
    }

    public final void notifyItemMoved(int i10, int i11) {
        this.mObservable.c(i10, i11);
    }

    public final void notifyItemRangeChanged(int i10, int i11) {
        this.mObservable.d(i10, i11, null);
    }

    public final void notifyItemRangeChanged(int i10, int i11, Object obj) {
        this.mObservable.d(i10, i11, obj);
    }

    public final void notifyItemRangeInserted(int i10, int i11) {
        this.mObservable.e(i10, i11);
    }

    public final void notifyItemRangeRemoved(int i10, int i11) {
        this.mObservable.f(i10, i11);
    }

    public final void notifyItemRemoved(int i10) {
        this.mObservable.f(i10, 1);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(f1 f1Var, int i10);

    public void onBindViewHolder(f1 f1Var, int i10, List<Object> list) {
        onBindViewHolder(f1Var, i10);
    }

    public abstract f1 onCreateViewHolder(ViewGroup viewGroup, int i10);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(f1 f1Var) {
        return false;
    }

    public void onViewAttachedToWindow(f1 f1Var) {
    }

    public void onViewDetachedFromWindow(f1 f1Var) {
    }

    public void onViewRecycled(f1 f1Var) {
    }

    public void registerAdapterDataObserver(i0 i0Var) {
        this.mObservable.registerObserver(i0Var);
    }

    public void setHasStableIds(boolean z10) {
        if (hasObservers()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.mHasStableIds = z10;
    }

    public void setStateRestorationPolicy(f0 f0Var) {
        this.mStateRestorationPolicy = f0Var;
        this.mObservable.g();
    }

    public void unregisterAdapterDataObserver(i0 i0Var) {
        this.mObservable.unregisterObserver(i0Var);
    }
}
