package androidx.mediarouter.app;

import android.widget.SeekBar;

public final class t implements SeekBar.OnSeekBarChangeListener {

    public final k f1808a = new k(this, 1);

    public final v f1809b;

    public t(v vVar) {
        this.f1809b = vVar;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            o9.b0 b0Var = (o9.b0) seekBar.getTag();
            int i11 = v.Q0;
            b0Var.j(i10);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        v vVar = this.f1809b;
        if (vVar.f1823n0 != null) {
            vVar.f1821l0.removeCallbacks(this.f1808a);
        }
        vVar.f1823n0 = (o9.b0) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f1809b.f1821l0.postDelayed(this.f1808a, 500L);
    }
}
