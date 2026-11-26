package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {
    public static final int T = 0;
    public final Chip S;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j jVar = new j(this);
        LayoutInflater.from(context).inflate(2131559076, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(2131362785);
        materialButtonToggleGroup.K.add(new i());
        Chip chip = (Chip) findViewById(2131362790);
        Chip chip2 = (Chip) findViewById(2131362787);
        this.S = chip2;
        l lVar = new l(new GestureDetector(getContext(), new k(this)));
        chip.setOnTouchListener(lVar);
        chip2.setOnTouchListener(lVar);
        chip.setTag(2131363002, 12);
        chip2.setTag(2131363002, 10);
        chip.setOnClickListener(jVar);
        chip2.setOnClickListener(jVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.S.sendAccessibilityEvent(8);
        }
    }
}
