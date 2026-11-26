package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.b1;

public final class h extends LinearLayoutManager {
    public final int E;
    public final m F;

    public h(m mVar, int i10, int i11) {
        super(i10);
        this.F = mVar;
        this.E = i11;
    }

    @Override
    public final void A0(RecyclerView recyclerView, int i10) {
        w wVar = new w(recyclerView.getContext());
        wVar.f2445a = i10;
        B0(wVar);
    }

    @Override
    public final void D0(b1 b1Var, int[] iArr) {
        int i10 = this.E;
        m mVar = this.F;
        if (i10 == 0) {
            iArr[0] = mVar.H.getWidth();
            iArr[1] = mVar.H.getWidth();
        } else {
            iArr[0] = mVar.H.getHeight();
            iArr[1] = mVar.H.getHeight();
        }
    }
}
