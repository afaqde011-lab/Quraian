package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import bc.d;
import com.google.protobuf.RuntimeVersion;
import h00.q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.m;
import r30.k;
import wb.l;

public final class a {

    public final int f14510a;

    public a(int i10) {
        this.f14510a = i10;
    }

    public final Object a(Object obj, l lVar) throws PackageManager.NameNotFoundException {
        String scheme;
        String authority;
        switch (this.f14510a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (!d.c(uri) && ((scheme = uri.getScheme()) == null || scheme.equals("file"))) {
                    String path = uri.getPath();
                    if (path == null) {
                        path = RuntimeVersion.SUFFIX;
                    }
                    if (k.Y0(path, '/') && ((String) q.N0(uri.getPathSegments())) != null) {
                        if (!m.a(uri.getScheme(), "file")) {
                            return new File(uri.toString());
                        }
                        String path2 = uri.getPath();
                        if (path2 != null) {
                            return new File(path2);
                        }
                    }
                }
                return null;
            case 2:
                return ((x40.q) obj).i;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = lVar.f15960a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) != null) {
                        return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            case 4:
                Uri uri2 = (Uri) obj;
                if (!m.a(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || k.L0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                if (authority2 == null) {
                    authority2 = RuntimeVersion.SUFFIX;
                }
                Resources resourcesForApplication = lVar.f15960a.getPackageManager().getResourcesForApplication(authority2);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                if (identifier == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri2).toString());
                }
                return Uri.parse("android.resource://" + authority2 + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}
