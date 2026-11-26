package q4;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import v4.g;

public final class e extends w00.a {
    public static Font P(FontFamily fontFamily, int i10) {
        FontStyle fontStyle = new FontStyle((i10 & 1) != 0 ? 700 : MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, (i10 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iR = R(fontStyle, font.getStyle());
        for (int i11 = 1; i11 < fontFamily.getSize(); i11++) {
            Font font2 = fontFamily.getFont(i11);
            int iR2 = R(fontStyle, font2.getStyle());
            if (iR2 < iR) {
                font = font2;
                iR = iR2;
            }
        }
        return font;
    }

    public static int R(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public final Typeface O(Context context, List list, int i10) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyQ = Q((g[]) list.get(0), contentResolver);
            if (fontFamilyQ == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyQ);
            for (int i11 = 1; i11 < list.size(); i11++) {
                FontFamily fontFamilyQ2 = Q((g[]) list.get(i11), contentResolver);
                if (fontFamilyQ2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyQ2);
                }
            }
            return customFallbackBuilder.setStyle(P(fontFamilyQ, i10).getStyle()).build();
        } catch (Exception e3) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
            return null;
        }
    }

    public final FontFamily Q(g[] gVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        Font fontF;
        FontFamily.Builder builder = null;
        for (g gVar : gVarArr) {
            if (Objects.equals(gVar.f15452a.getScheme(), "systemfont")) {
                Uri uri = gVar.f15452a;
                boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
                String str = gVar.f15456e;
                fontBuild = null;
                String authority = zEquals ? uri.getAuthority() : null;
                if (authority != null) {
                    Typeface typefaceCreate = Typeface.create(authority, 0);
                    Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                    if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                        typefaceCreate = null;
                    }
                    if (typefaceCreate != null && (fontF = d.f(typefaceCreate)) != null) {
                        if (TextUtils.isEmpty(str)) {
                            fontBuild = fontF;
                        } else {
                            try {
                                fontBuild = new Font.Builder(fontF).setFontVariationSettings(str).build();
                            } catch (IOException unused) {
                                Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                            }
                        }
                    }
                }
            } else {
                try {
                    Uri uri2 = gVar.f15452a;
                    String str2 = gVar.f15456e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri2, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(gVar.f15454c).setSlant(gVar.f15455d ? 1 : 0).setTtcIndex(gVar.f15453b);
                            if (!TextUtils.isEmpty(str2)) {
                                ttcIndex.setFontVariationSettings(str2);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                } catch (IOException e3) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e3);
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }
}
