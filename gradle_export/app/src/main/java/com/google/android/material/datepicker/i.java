package com.google.android.material.datepicker;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.n0;

public final class i extends n0 {
    @Override
    public final void a(RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof a0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            throw null;
        }
    }
}
