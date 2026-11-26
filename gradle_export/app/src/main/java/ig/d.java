package ig;

import a5.g;
import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;

public final class d extends p5.a {
    public final Chip Q;

    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.Q = chip;
    }

    @Override
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.W;
        Chip chip = this.Q;
        if (!chip.c() || (fVar = chip.E) == null || !fVar.f7656q0 || chip.H == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override
    public final void o(int i10, g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        CharSequence charSequence = RuntimeVersion.SUFFIX;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription(RuntimeVersion.SUFFIX);
            accessibilityNodeInfo.setBoundsInParent(Chip.W);
            return;
        }
        Chip chip = this.Q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            if (!TextUtils.isEmpty(text)) {
                charSequence = text;
            }
            accessibilityNodeInfo.setContentDescription(context.getString(2131886854, charSequence).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        gVar.b(a5.c.f171e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        gVar.g(Button.class.getName());
    }

    @Override
    public final void p(int i10, boolean z10) {
        Chip chip = this.Q;
        if (i10 == 1) {
            chip.M = z10;
        }
        f fVar = chip.E;
        boolean z11 = chip.M;
        boolean zQ = false;
        if (fVar.f7657r0 != null) {
            zQ = fVar.Q(z11 ? new int[]{R.attr.state_pressed, R.attr.state_enabled} : f.f7630l1);
        }
        if (zQ) {
            chip.refreshDrawableState();
        }
    }
}
