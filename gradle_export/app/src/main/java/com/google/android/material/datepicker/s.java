package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

public final class s implements AdapterView.OnItemClickListener {
    public final MaterialCalendarGridView A;
    public final u B;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.B = uVar;
        this.A = materialCalendarGridView;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j9) {
        MaterialCalendarGridView materialCalendarGridView = this.A;
        r rVarA = materialCalendarGridView.a();
        if (i10 < rVarA.a() || i10 > rVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i10).longValue() >= ((m) this.B.f4163b.B).C.C.A) {
            throw null;
        }
    }
}
