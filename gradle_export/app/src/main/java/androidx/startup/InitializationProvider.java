package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.google.android.gms.cast.Cast;
import kh.o;
import ra.a;

public class InitializationProvider extends ContentProvider {
    @Override
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new StartupException("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        a aVarC = a.c(context);
        Context context2 = aVarC.f13134c;
        try {
            try {
                o.n("Startup");
                aVarC.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), Cast.MAX_NAMESPACE_LENGTH).metaData);
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException e3) {
                throw new StartupException(e3);
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
