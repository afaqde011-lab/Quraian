package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba.p0;
import ba.s0;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class k extends s0 {

    public final u f4158a;

    public final m f4159b;

    public k(m mVar, u uVar) {
        this.f4159b = mVar;
        this.f4158a = uVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int iN0;
        b bVar = this.f4158a.f4162a;
        m mVar = this.f4159b;
        if (i10 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar.H.getLayoutManager();
            View viewP0 = linearLayoutManager.P0(0, linearLayoutManager.v(), false);
            iN0 = viewP0 == null ? -1 : p0.G(viewP0);
        } else {
            iN0 = ((LinearLayoutManager) mVar.H.getLayoutManager()).N0();
        }
        Calendar calendarA = y.a(bVar.A.A);
        calendarA.add(2, iN0);
        q qVar = new q(calendarA);
        mVar.D = qVar;
        MaterialButton materialButton = mVar.M;
        Calendar calendarA2 = y.a(bVar.A.A);
        calendarA2.add(2, iN0);
        calendarA2.set(5, 1);
        Calendar calendarA3 = y.a(calendarA2);
        calendarA3.get(2);
        calendarA3.get(1);
        calendarA3.getMaximum(7);
        calendarA3.getActualMaximum(5);
        calendarA3.getTimeInMillis();
        long timeInMillis = calendarA3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = y.f4166a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.k(bVar.A.d(qVar));
    }
}
