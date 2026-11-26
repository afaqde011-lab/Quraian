package pg;

import android.R;
import android.content.res.ColorStateList;
import p.a0;

public final class a extends a0 {
    public static final int[][] G = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList E;
    public boolean F;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.E == null) {
            int iE0 = ab.a0.e0(this, 2130968894);
            int iE1 = ab.a0.e0(this, 2130968914);
            int iE2 = ab.a0.e0(this, 2130968937);
            this.E = new ColorStateList(G, new int[]{ab.a0.k0(1.0f, iE2, iE0), ab.a0.k0(0.54f, iE2, iE1), ab.a0.k0(0.38f, iE2, iE1), ab.a0.k0(0.38f, iE2, iE1)});
        }
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.F = z10;
        if (z10) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
