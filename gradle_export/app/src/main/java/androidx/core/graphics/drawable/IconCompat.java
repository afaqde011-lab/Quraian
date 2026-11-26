package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable {

    public static final PorterDuff.Mode f567k = PorterDuff.Mode.SRC_IN;

    public int f568a;

    public Object f569b;

    public byte[] f570c;

    public Parcelable f571d;

    public int f572e;

    public int f573f;

    public ColorStateList f574g;

    public PorterDuff.Mode f575h;

    public String f576i;

    public String f577j;

    public IconCompat() {
        this.f568a = -1;
        this.f570c = null;
        this.f571d = null;
        this.f572e = 0;
        this.f573f = 0;
        this.f574g = null;
        this.f575h = f567k;
        this.f576i = null;
    }

    public IconCompat(int i10) {
        this.f570c = null;
        this.f571d = null;
        this.f572e = 0;
        this.f573f = 0;
        this.f574g = null;
        this.f575h = f567k;
        this.f576i = null;
        this.f568a = i10;
    }

    public static IconCompat a(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f572e = i10;
        if (resources != null) {
            try {
                iconCompat.f569b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f569b = str;
        }
        iconCompat.f577j = str;
        return iconCompat;
    }

    public final int b() {
        int i10 = this.f568a;
        if (i10 == -1) {
            return ((Icon) this.f569b).getResId();
        }
        if (i10 == 2) {
            return this.f572e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Icon c() {
        Icon iconCreateWithBitmap;
        String resPackage;
        Uri uri;
        int i10 = this.f568a;
        switch (i10) {
            case -1:
                return (Icon) this.f569b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f569b);
                break;
            case 2:
                int i11 = this.f568a;
                if (i11 == -1) {
                    resPackage = ((Icon) this.f569b).getResPackage();
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str = this.f577j;
                    resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) this.f569b).split(":", -1)[0] : this.f577j;
                }
                iconCreateWithBitmap = Icon.createWithResource(resPackage, this.f572e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f569b, this.f572e, this.f573f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f569b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f569b);
                break;
            case 6:
                if (i10 == -1) {
                    uri = ((Icon) this.f569b).getUri();
                } else {
                    if (i10 != 4 && i10 != 6) {
                        throw new IllegalStateException("called getUri() on " + this);
                    }
                    uri = Uri.parse((String) this.f569b);
                }
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(uri);
                break;
        }
        ColorStateList colorStateList = this.f574g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f575h;
        if (mode != f567k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f568a == -1) {
            return String.valueOf(this.f569b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f568a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f568a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f569b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f569b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f577j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(b())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f572e);
                if (this.f573f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f573f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f569b);
                break;
        }
        if (this.f574g != null) {
            sb2.append(" tint=");
            sb2.append(this.f574g);
        }
        if (this.f575h != f567k) {
            sb2.append(" mode=");
            sb2.append(this.f575h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
