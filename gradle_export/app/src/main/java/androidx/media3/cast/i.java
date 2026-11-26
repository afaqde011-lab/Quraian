package androidx.media3.cast;

import l1.z0;

public final class i implements u00.a {
    public final int A;
    public final Object B;

    public i(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                return MediaRouteButtonKt.AnonymousClass1.invoke$lambda$4$lambda$3((z0) obj);
            case 1:
                return MediaRouteButtonKt.AnonymousClass1.invoke$lambda$6$lambda$5((z0) obj);
            default:
                return MediaRouteButtonState.observe$lambda$0((MediaRouteButtonState) obj);
        }
    }
}
