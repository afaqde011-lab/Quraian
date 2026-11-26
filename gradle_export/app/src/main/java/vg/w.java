package vg;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.RuntimeVersion;
import p.v0;

public final class w extends z4.b {
    public final TextInputLayout D;

    public w(TextInputLayout textInputLayout) {
        this.D = textInputLayout;
    }

    @Override
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        this.A.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.D;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z10 = textInputLayout.V0;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z11 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : RuntimeVersion.SUFFIX;
        u uVar = textInputLayout.B;
        v0 v0Var = uVar.B;
        if (v0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(v0Var);
            accessibilityNodeInfo.setTraversalAfter(v0Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(uVar.D);
        }
        if (!zIsEmpty) {
            gVar.k(text);
        } else if (!TextUtils.isEmpty(string)) {
            gVar.k(string);
            if (!z10 && placeholderText != null) {
                gVar.k(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            gVar.k(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            accessibilityNodeInfo.setHintText(string);
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z11) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        v0 v0Var2 = textInputLayout.K.f15693y;
        if (v0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(v0Var2);
        }
        textInputLayout.C.b().m(gVar);
    }

    @Override
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.D.C.b().n(accessibilityEvent);
    }
}
