package qb;

import ab.a0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import ca.v;
import h00.q;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import nb.p;
import org.xmlpull.v1.XmlPullParserException;
import r30.r;
import ua.o;

public final class b implements g {

    public final int f12804a;

    public final Uri f12805b;

    public final wb.l f12806c;

    public b(Uri uri, wb.l lVar, int i10) {
        this.f12804a = i10;
        this.f12805b = uri;
        this.f12806c = lVar;
    }

    @Override
    public final Object a(k00.c cVar) throws XmlPullParserException, IOException {
        InputStream inputStreamOpenInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        Integer numY0;
        Drawable drawable;
        int i10 = this.f12804a;
        Uri uri = this.f12805b;
        wb.l lVar = this.f12806c;
        boolean z10 = true;
        switch (i10) {
            case 0:
                String strR0 = q.R0(q.H0(uri.getPathSegments(), 1), "/", (String) null, (String) null, (u00.k) null, 62);
                return new m(new nb.q(bi.b.r(bi.b.S(lVar.f15960a.getAssets().open(strR0))), new nb.a()), bc.d.b(MimeTypeMap.getSingleton(), strR0), nb.e.C);
            case 1:
                ContentResolver contentResolver = lVar.f15960a.getContentResolver();
                if (kotlin.jvm.internal.m.a(uri.getAuthority(), "com.android.contacts") && kotlin.jvm.internal.m.a(uri.getLastPathSegment(), "display_photo")) {
                    AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
                    }
                } else if (kotlin.jvm.internal.m.a(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && kotlin.jvm.internal.m.a(pathSegments.get(size - 3), "audio") && kotlin.jvm.internal.m.a(pathSegments.get(size - 2), "albums")) {
                    xb.g gVar = lVar.f15963d;
                    a0 a0Var = gVar.f16513a;
                    xb.a aVar = a0Var instanceof xb.a ? (xb.a) a0Var : null;
                    if (aVar != null) {
                        int i11 = aVar.f16510a;
                        a0 a0Var2 = gVar.f16514b;
                        xb.a aVar2 = a0Var2 instanceof xb.a ? (xb.a) a0Var2 : null;
                        if (aVar2 != null) {
                            int i12 = aVar2.f16510a;
                            bundle = new Bundle(1);
                            bundle.putParcelable("android.content.extra.SIZE", new Point(i11, i12));
                        } else {
                            bundle = null;
                        }
                    } else {
                        bundle = null;
                    }
                    AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                    }
                } else {
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                    }
                }
                return new m(new nb.q(bi.b.r(bi.b.S(inputStreamOpenInputStream)), new nb.a()), contentResolver.getType(uri), nb.e.C);
            default:
                String authority = uri.getAuthority();
                if (authority != null) {
                    String str = r30.k.L0(authority) ? null : authority;
                    if (str != null) {
                        String str2 = (String) q.U0(uri.getPathSegments());
                        if (str2 == null || (numY0 = r.y0(str2)) == null) {
                            throw new IllegalStateException("Invalid android.resource URI: " + uri);
                        }
                        int iIntValue = numY0.intValue();
                        Context context = lVar.f15960a;
                        Resources resources = str.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        CharSequence charSequence = typedValue.string;
                        String strB = bc.d.b(MimeTypeMap.getSingleton(), charSequence.subSequence(r30.k.O0(charSequence, '/', 0, 6), charSequence.length()).toString());
                        if (!kotlin.jvm.internal.m.a(strB, "text/xml")) {
                            TypedValue typedValue2 = new TypedValue();
                            return new m(new nb.q(bi.b.r(bi.b.S(resources.openRawResource(iIntValue, typedValue2))), new p(typedValue2.density)), strB, nb.e.C);
                        }
                        if (str.equals(context.getPackageName())) {
                            drawable = p30.f.f0(context, iIntValue);
                            if (drawable == null) {
                                throw new IllegalStateException(g4.c.f(iIntValue, "Invalid resource ID: ").toString());
                            }
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = p4.i.f12335a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                throw new IllegalStateException(g4.c.f(iIntValue, "Invalid resource ID: ").toString());
                            }
                        }
                        if (!(drawable instanceof VectorDrawable) && !(drawable instanceof o)) {
                            z10 = false;
                        }
                        if (z10) {
                            drawable = new BitmapDrawable(context.getResources(), v.u(drawable, lVar.f15961b, lVar.f15963d, lVar.f15964e, lVar.f15965f));
                        }
                        return new d(drawable, z10, nb.e.C);
                    }
                }
                throw new IllegalStateException("Invalid android.resource URI: " + uri);
        }
    }
}
