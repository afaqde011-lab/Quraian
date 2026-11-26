package v4;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import b3.c0;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import k0.v;
import kh.o;
import u.s;

public abstract class b {

    public static final s f15432a = new s(2);

    public static final c0 f15433b = new c0(14);

    public static v a(Context context, List list) {
        o.n("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                c cVar = (c) list.get(i10);
                String str = cVar.f15438e;
                Typeface typefaceE = q4.d.e(str);
                if (typefaceE == null || q4.d.f(typefaceE) == null) {
                    ProviderInfo providerInfoB = b(context.getPackageManager(), cVar, context.getResources());
                    if (providerInfoB == null) {
                        return new v();
                    }
                    arrayList.add(c(context, cVar, providerInfoB.authority));
                } else {
                    arrayList.add(new g[]{new g(str, cVar.f15439f)});
                }
            }
            return new v(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, c cVar, Resources resources) {
        c0 c0Var = f15433b;
        s sVar = f15432a;
        o.n("FontProvider.getProvider");
        try {
            List listK = cVar.f15437d;
            String str = cVar.f15434a;
            String str2 = cVar.f15435b;
            if (listK == null) {
                listK = p4.a.k(resources, 0);
            }
            a aVar = new a();
            aVar.f15429a = str;
            aVar.f15430b = str2;
            aVar.f15431c = listK;
            ProviderInfo providerInfo = (ProviderInfo) sVar.c(aVar);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c0Var);
            for (int i10 = 0; i10 < listK.size(); i10++) {
                ArrayList arrayList2 = new ArrayList((Collection) listK.get(i10));
                Collections.sort(arrayList2, c0Var);
                if (arrayList.size() == arrayList2.size()) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            sVar.d(aVar, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public static g[] c(Context context, c cVar, String str) {
        o.n("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                o.n("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {cVar.f15436c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new g(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : MediaError.DetailedErrorCode.MANIFEST_UNKNOWN, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, cVar.f15439f, i10));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    g[] gVarArr = (g[]) arrayList.toArray(new g[0]);
                    Trace.endSection();
                    return gVarArr;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
