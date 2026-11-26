package l9;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

public final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new com.google.android.gms.common.internal.k0(29);
    public final int A;
    public final float B;
    public Object C;

    public k0(int i10, float f3) {
        this.A = i10;
        this.B = f3;
    }

    public static k0 a(Parcelable parcelable) {
        k0 k0Var;
        k0 k0Var2 = null;
        if (parcelable != null) {
            Rating rating = (Rating) parcelable;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        k0Var2 = new k0(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        k0Var = new k0(1, rating.hasHeart() ? 1.0f : 0.0f);
                        break;
                    case 2:
                        k0Var = new k0(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        k0Var2 = e(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        k0Var2 = d(rating.getPercentRating());
                        break;
                }
                k0Var2 = k0Var;
            }
            k0Var2.getClass();
            k0Var2.C = parcelable;
        }
        return k0Var2;
    }

    public static k0 d(float f3) {
        if (f3 >= 0.0f && f3 <= 100.0f) {
            return new k0(6, f3);
        }
        e7.a.d("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static k0 e(float f3, int i10) {
        float f10;
        if (i10 == 3) {
            f10 = 3.0f;
        } else if (i10 == 4) {
            f10 = 4.0f;
        } else {
            if (i10 != 5) {
                e7.a.d("Rating", "Invalid rating style (" + i10 + ") for a star rating");
                return null;
            }
            f10 = 5.0f;
        }
        if (f3 >= 0.0f && f3 <= f10) {
            return new k0(i10, f3);
        }
        e7.a.d("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float b() {
        int i10 = this.A;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && c()) {
            return this.B;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.B >= 0.0f;
    }

    @Override
    public final int describeContents() {
        return this.A;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.A);
        sb2.append(" rating=");
        float f3 = this.B;
        sb2.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb2.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.A);
        parcel.writeFloat(this.B);
    }
}
