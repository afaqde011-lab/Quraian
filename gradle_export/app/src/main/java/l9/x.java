package l9;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new com.google.android.gms.common.internal.k0(23);
    public final String A;
    public final CharSequence B;
    public final CharSequence C;
    public final CharSequence D;
    public final Bitmap E;
    public byte[] F;
    public final Uri G;
    public final Bundle H;
    public final Uri I;
    public MediaDescription J;

    public x(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.A = str;
        this.B = charSequence;
        this.C = charSequence2;
        this.D = charSequence3;
        this.E = bitmap;
        this.G = uri;
        this.H = bundle;
        this.I = uri2;
    }

    public static x a(MediaDescription mediaDescription) {
        Uri mediaUri;
        String mediaId = mediaDescription.getMediaId();
        CharSequence title = mediaDescription.getTitle();
        CharSequence subtitle = mediaDescription.getSubtitle();
        CharSequence description = mediaDescription.getDescription();
        Bitmap iconBitmap = mediaDescription.getIconBitmap();
        Uri iconUri = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        Bundle bundle = null;
        if (extras == null) {
            extras = null;
        } else {
            f0.h(extras);
            try {
                extras.isEmpty();
            } catch (BadParcelableException unused) {
                e7.a.d("MediaSessionCompat", "Could not unparcel the data.");
                extras = null;
            }
        }
        if (extras != null) {
            extras = new Bundle(extras);
        }
        if (extras != null) {
            mediaUri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (mediaUri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            if (mediaUri == null) {
                mediaUri = mediaDescription.getMediaUri();
            }
            x xVar = new x(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
            xVar.J = mediaDescription;
            return xVar;
        }
        mediaUri = null;
        bundle = extras;
        if (mediaUri == null) {
            mediaUri = mediaDescription.getMediaUri();
        }
        x xVar2 = new x(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
        xVar2.J = mediaDescription;
        return xVar2;
    }

    public final MediaDescription b() {
        MediaDescription mediaDescription = this.J;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.A);
        builder.setTitle(this.B);
        builder.setSubtitle(this.C);
        builder.setDescription(this.D);
        builder.setIconBitmap(this.E);
        builder.setIconUri(this.G);
        builder.setExtras(this.H);
        builder.setMediaUri(this.I);
        MediaDescription mediaDescriptionBuild = builder.build();
        this.J = mediaDescriptionBuild;
        return mediaDescriptionBuild;
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
        b().writeToParcel(parcel, i10);
    }
}
