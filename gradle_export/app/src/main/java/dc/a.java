package dc;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import oc.d;

public final class a extends Paint {

    public final int f4854a;

    public a(int i10, int i11) {
        super(i10);
        this.f4854a = i11;
    }

    public a(PorterDuff.Mode mode) {
        super(1);
        this.f4854a = 0;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }

    @Override
    public void setAlpha(int i10) {
        switch (this.f4854a) {
            case 0:
                PointF pointF = d.f11921a;
                super.setAlpha(Math.max(0, Math.min(255, i10)));
                break;
            default:
                super.setAlpha(i10);
                break;
        }
    }

    @Override
    public void setTextLocales(LocaleList localeList) {
        switch (this.f4854a) {
            case 0:
                break;
            default:
                super.setTextLocales(localeList);
                break;
        }
    }
}
