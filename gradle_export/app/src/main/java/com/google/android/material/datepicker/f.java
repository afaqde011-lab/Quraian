package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import ba.p0;
import java.util.Calendar;

public final class f implements View.OnClickListener {
    public final int A;
    public final u B;
    public final m C;

    public f(m mVar, u uVar, int i10) {
        this.A = i10;
        this.C = mVar;
        this.B = uVar;
    }

    @Override
    public final void onClick(View view) {
        switch (this.A) {
            case 0:
                m mVar = this.C;
                int iN0 = ((LinearLayoutManager) mVar.H.getLayoutManager()).N0() - 1;
                Calendar calendarA = y.a(this.B.f4162a.A.A);
                calendarA.add(2, iN0);
                mVar.i(new q(calendarA));
                break;
            default:
                m mVar2 = this.C;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar2.H.getLayoutManager();
                View viewP0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
                int iG = viewP0 == null ? -1 : p0.G(viewP0);
                Calendar calendarA2 = y.a(this.B.f4162a.A.A);
                calendarA2.add(2, iG + 1);
                mVar2.i(new q(calendarA2));
                break;
        }
    }
}
