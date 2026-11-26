package j4;

public final class a extends c {
    public int H;
    public int I;
    public g4.a J;

    public boolean getAllowsGoneWidget() {
        return this.J.f6096s0;
    }

    public int getMargin() {
        return this.J.f6097t0;
    }

    public int getType() {
        return this.H;
    }

    @Override
    public final void h(g4.e eVar, boolean z10) {
        int i10 = this.H;
        this.I = i10;
        if (z10) {
            if (i10 == 5) {
                this.I = 1;
            } else if (i10 == 6) {
                this.I = 0;
            }
        } else if (i10 == 5) {
            this.I = 0;
        } else if (i10 == 6) {
            this.I = 1;
        }
        if (eVar instanceof g4.a) {
            ((g4.a) eVar).f6095r0 = this.I;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.J.f6096s0 = z10;
    }

    public void setDpMargin(int i10) {
        this.J.f6097t0 = (int) ((i10 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.J.f6097t0 = i10;
    }

    public void setType(int i10) {
        this.H = i10;
    }
}
