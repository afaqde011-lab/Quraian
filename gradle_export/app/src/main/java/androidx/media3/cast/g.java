package androidx.media3.cast;

import l1.z;

public final class g implements u00.k {
    public final int A;
    public final MediaRouteButtonState B;
    public final u00.a C;

    public g(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10) {
        this.A = i10;
        this.B = mediaRouteButtonState;
        this.C = aVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return MediaRouteButtonKt.MediaRouteControllerDialog$lambda$11$lambda$10(this.B, this.C, (z) obj);
            default:
                return MediaRouteButtonKt.MediaRouteChooserDialog$lambda$6$lambda$5(this.B, this.C, (z) obj);
        }
    }
}
