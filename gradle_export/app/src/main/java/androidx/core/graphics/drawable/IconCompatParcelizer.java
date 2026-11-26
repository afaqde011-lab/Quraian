package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import va.b;
import va.c;

public class IconCompatParcelizer {
    public static IconCompat read(b bVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f568a = bVar.f(iconCompat.f568a, 1);
        byte[] bArr = iconCompat.f570c;
        if (bVar.e(2)) {
            Parcel parcel = ((c) bVar).f15577e;
            int i10 = parcel.readInt();
            if (i10 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i10];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f570c = bArr;
        iconCompat.f571d = bVar.g(iconCompat.f571d, 3);
        iconCompat.f572e = bVar.f(iconCompat.f572e, 4);
        iconCompat.f573f = bVar.f(iconCompat.f573f, 5);
        iconCompat.f574g = (ColorStateList) bVar.g(iconCompat.f574g, 6);
        String string = iconCompat.f576i;
        if (bVar.e(7)) {
            string = ((c) bVar).f15577e.readString();
        }
        iconCompat.f576i = string;
        String string2 = iconCompat.f577j;
        if (bVar.e(8)) {
            string2 = ((c) bVar).f15577e.readString();
        }
        iconCompat.f577j = string2;
        iconCompat.f575h = PorterDuff.Mode.valueOf(iconCompat.f576i);
        switch (iconCompat.f568a) {
            case -1:
                Parcelable parcelable = iconCompat.f571d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f569b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f571d;
                if (parcelable2 != null) {
                    iconCompat.f569b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f570c;
                iconCompat.f569b = bArr3;
                iconCompat.f568a = 3;
                iconCompat.f572e = 0;
                iconCompat.f573f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f570c, Charset.forName("UTF-16"));
                iconCompat.f569b = str;
                if (iconCompat.f568a == 2 && iconCompat.f577j == null) {
                    iconCompat.f577j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f569b = iconCompat.f570c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, b bVar) {
        bVar.getClass();
        iconCompat.f576i = iconCompat.f575h.name();
        switch (iconCompat.f568a) {
            case -1:
                iconCompat.f571d = (Parcelable) iconCompat.f569b;
                break;
            case 1:
            case 5:
                iconCompat.f571d = (Parcelable) iconCompat.f569b;
                break;
            case 2:
                iconCompat.f570c = ((String) iconCompat.f569b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f570c = (byte[]) iconCompat.f569b;
                break;
            case 4:
            case 6:
                iconCompat.f570c = iconCompat.f569b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f568a;
        if (-1 != i10) {
            bVar.j(i10, 1);
        }
        byte[] bArr = iconCompat.f570c;
        if (bArr != null) {
            bVar.i(2);
            Parcel parcel = ((c) bVar).f15577e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f571d;
        if (parcelable != null) {
            bVar.k(parcelable, 3);
        }
        int i11 = iconCompat.f572e;
        if (i11 != 0) {
            bVar.j(i11, 4);
        }
        int i12 = iconCompat.f573f;
        if (i12 != 0) {
            bVar.j(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f574g;
        if (colorStateList != null) {
            bVar.k(colorStateList, 6);
        }
        String str = iconCompat.f576i;
        if (str != null) {
            bVar.i(7);
            ((c) bVar).f15577e.writeString(str);
        }
        String str2 = iconCompat.f577j;
        if (str2 != null) {
            bVar.i(8);
            ((c) bVar).f15577e.writeString(str2);
        }
    }
}
