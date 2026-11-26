package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;

class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip A;
    public final EditText B;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(2131559074, (ViewGroup) this, false);
        this.A = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(2131559075, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.B = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(2131362788);
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override
    public final boolean isChecked() {
        return this.A.isChecked();
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.B.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override
    public final void setChecked(boolean z10) {
        Chip chip = this.A;
        chip.setChecked(z10);
        int i10 = z10 ? 0 : 4;
        EditText editText = this.B;
        editText.setVisibility(i10);
        chip.setVisibility(z10 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new ng.k(editText, 0));
        }
    }

    @Override
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.A.setOnClickListener(onClickListener);
    }

    @Override
    public final void setTag(int i10, Object obj) {
        this.A.setTag(i10, obj);
    }

    @Override
    public final void toggle() {
        this.A.toggle();
    }
}
