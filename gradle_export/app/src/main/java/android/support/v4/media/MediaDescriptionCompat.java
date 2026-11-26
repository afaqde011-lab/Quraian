package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.t;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new ah.c(2);
    public final String A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Bitmap E;
    public final Uri F;
    public final Bundle G;
    public final Uri H;
    public MediaDescription I;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.A = str;
        this.B = charSequence;
        this.C = charSequence2;
        this.D = charSequence3;
        this.E = bitmap;
        this.F = uri;
        this.G = bundle;
        this.H = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = a.g(mediaDescription);
        CharSequence charSequenceI = a.i(mediaDescription);
        CharSequence charSequenceH = a.h(mediaDescription);
        CharSequence charSequenceC = a.c(mediaDescription);
        Bitmap bitmapE = a.e(mediaDescription);
        Uri uriF = a.f(mediaDescription);
        Bundle bundleD = a.d(mediaDescription);
        if (bundleD != null) {
            bundleD = t.d(bundleD);
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = b.a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.I = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.B) + ", " + ((Object) this.C) + ", " + ((Object) this.D);
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionA = this.I;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = a.b();
            a.n(builderB, this.A);
            a.p(builderB, this.B);
            a.o(builderB, this.C);
            a.j(builderB, this.D);
            a.l(builderB, this.E);
            a.m(builderB, this.F);
            a.k(builderB, this.G);
            b.b(builderB, this.H);
            mediaDescriptionA = a.a(builderB);
            this.I = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i10);
    }
}
