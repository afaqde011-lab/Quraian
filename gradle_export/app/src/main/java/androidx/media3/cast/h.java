package androidx.media3.cast;

public final class h implements u00.n {
    public final int A;
    public final MediaRouteButtonState B;
    public final u00.a C;
    public final int D;

    public h(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10, int i11) {
        this.A = i11;
        this.B = mediaRouteButtonState;
        this.C = aVar;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                return MediaRouteButtonKt.MediaRouteControllerDialog$lambda$12(this.B, this.C, this.D, jVar, iIntValue);
            case 1:
                return MediaRouteButtonKt.MediaRouteChooserDialog$lambda$7(this.B, this.C, this.D, jVar, iIntValue);
            case 2:
                return MediaRouteButtonKt.MediaRouteDialog$lambda$1(this.B, this.C, this.D, jVar, iIntValue);
            default:
                return MediaRouteButtonKt.MediaRouteDialog$lambda$2(this.B, this.C, this.D, jVar, iIntValue);
        }
    }
}
