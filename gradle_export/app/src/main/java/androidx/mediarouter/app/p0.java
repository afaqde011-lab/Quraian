package androidx.mediarouter.app;

import android.widget.SeekBar;

public final class p0 implements SeekBar.OnSeekBarChangeListener {

    public final q0 f1765a;

    public p0(q0 q0Var) {
        this.f1765a = q0Var;
    }

    @Override
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            o9.b0 b0Var = (o9.b0) seekBar.getTag();
            h0 h0Var = (h0) this.f1765a.W.get(b0Var.f11739c);
            if (h0Var != null) {
                h0Var.r(i10 == 0);
            }
            b0Var.j(i10);
        }
    }

    @Override
    public final void onStartTrackingTouch(SeekBar seekBar) {
        q0 q0Var = this.f1765a;
        if (q0Var.X != null) {
            q0Var.S.removeMessages(2);
        }
        q0Var.X = (o9.b0) seekBar.getTag();
    }

    @Override
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.f1765a.S.sendEmptyMessageDelayed(2, 500L);
    }
}
