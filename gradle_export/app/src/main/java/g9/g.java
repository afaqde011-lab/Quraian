package g9;

import android.text.Layout;

public final class g {

    public CharSequence f6273c;

    public long f6271a = 0;

    public long f6272b = 0;

    public int f6274d = 2;

    public float f6275e = -3.4028235E38f;

    public int f6276f = 1;

    public int f6277g = 0;

    public float f6278h = -3.4028235E38f;

    public int f6279i = Integer.MIN_VALUE;

    public float f6280j = 1.0f;

    public int f6281k = Integer.MIN_VALUE;

    public final d7.a a() {
        Layout.Alignment alignment;
        float f3 = this.f6278h;
        float f10 = -3.4028235E38f;
        if (f3 == -3.4028235E38f) {
            int i10 = this.f6274d;
            if (i10 != 4) {
                f3 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f3 = 0.0f;
            }
        }
        int i11 = this.f6279i;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.f6274d;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        d7.a aVar = new d7.a();
        int i13 = this.f6274d;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            a1.b.y("Unknown textAlignment: ", i13, "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        aVar.f4725c = alignment;
        float f11 = this.f6275e;
        int i14 = this.f6276f;
        if (f11 != -3.4028235E38f && i14 == 0 && (f11 < 0.0f || f11 > 1.0f)) {
            f10 = 1.0f;
        } else if (f11 != -3.4028235E38f) {
            f10 = f11;
        } else if (i14 == 0) {
            f10 = 1.0f;
        }
        aVar.f4727e = f10;
        aVar.f4728f = i14;
        aVar.f4729g = this.f6277g;
        aVar.f4730h = f3;
        aVar.f4731i = i11;
        float f12 = this.f6280j;
        if (i11 == 0) {
            f3 = 1.0f - f3;
        } else if (i11 == 1) {
            f3 = f3 <= 0.5f ? f3 * 2.0f : (1.0f - f3) * 2.0f;
        } else if (i11 != 2) {
            throw new IllegalStateException(String.valueOf(i11));
        }
        aVar.l = Math.min(f12, f3);
        aVar.f4736p = this.f6281k;
        CharSequence charSequence = this.f6273c;
        if (charSequence != null) {
            aVar.f4723a = charSequence;
            aVar.f4724b = null;
        }
        return aVar;
    }
}
