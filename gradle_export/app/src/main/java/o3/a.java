package o3;

import android.text.SegmentFinder;

public final class a extends SegmentFinder {

    public final h7.b f11658a;

    public a(h7.b bVar) {
        this.f11658a = bVar;
    }

    public final int nextEndBoundary(int i10) {
        return this.f11658a.f0(i10);
    }

    public final int nextStartBoundary(int i10) {
        return this.f11658a.N(i10);
    }

    public final int previousEndBoundary(int i10) {
        return this.f11658a.P(i10);
    }

    public final int previousStartBoundary(int i10) {
        return this.f11658a.c0(i10);
    }
}
