package ze;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c3.s0;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.internal.cast.o;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import tf.w;
import tf.x;
import tf.y;

public final class c {

    public static Boolean f17415f = null;

    public static String f17416g = null;

    public static boolean f17417h = false;

    public static int f17418i = -1;

    public static Boolean f17419j;

    public static f f17421n;

    public static g f17422o;

    public final Context f17423a;

    public static final ThreadLocal f17420k = new ThreadLocal();
    public static final s0 l = new s0(11);
    public static final y m = new y(25);

    public static final w f17411b = new w(26);

    public static final x f17412c = new x(26);

    public static final y f17413d = new y(26);

    public static final w f17414e = new w(27);

    public c(Context context) {
        this.f17423a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(str.length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (d0.k(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb3.append("Module descriptor id '");
            sb3.append(strValueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(str.length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e3) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e3.getMessage())));
            return 0;
        }
    }

    public static c c(Context context, b bVar, String str) throws DynamiteModule$LoadingException {
        ?? r7;
        int i10;
        c cVar;
        Cursor cursor;
        int i11;
        Boolean bool;
        f fVarH;
        int i12;
        ye.a aVarP2;
        Object objL2;
        e eVar;
        g gVar;
        e eVar2;
        boolean z10;
        ye.a aVarP3;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new DynamiteModule$LoadingException("null application Context");
        }
        ThreadLocal threadLocal = f17420k;
        e eVar3 = (e) threadLocal.get();
        e eVar4 = new e();
        threadLocal.set(eVar4);
        s0 s0Var = l;
        Long l10 = (Long) s0Var.get();
        long jLongValue = l10.longValue();
        try {
            s0Var.set(Long.valueOf(SystemClock.uptimeMillis()));
            a8.d dVarJ = bVar.j(context, str, m);
            int i13 = dVarJ.f238a;
            int i14 = dVarJ.f239b;
            StringBuilder sb2 = new StringBuilder(str.length() + 26 + String.valueOf(i13).length() + 19 + str.length() + 1 + String.valueOf(i14).length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i13);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i14);
            Log.i("DynamiteModule", sb2.toString());
            int i15 = dVarJ.f240c;
            if (i15 != 0) {
                if (i15 != -1) {
                    if (i15 == 1 || dVarJ.f239b != 0) {
                        if (i15 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat(str));
                            c cVar2 = new c(applicationContext);
                            if (jLongValue == 0) {
                                s0Var.remove();
                            } else {
                                s0Var.set(l10);
                            }
                            cursor2 = eVar4.f17426a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(eVar3);
                            return cVar2;
                        }
                        if (i15 == 1) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i15).length() + 36);
                            sb3.append("VersionPolicy returned invalid code:");
                            sb3.append(i15);
                            throw new DynamiteModule$LoadingException(sb3.toString());
                        }
                        try {
                            try {
                                i11 = dVarJ.f239b;
                                try {
                                    try {
                                        try {
                                            synchronized (c.class) {
                                                try {
                                                    if (e(context)) {
                                                        throw new DynamiteModule$LoadingException("Remote loading disabled");
                                                    }
                                                    bool = f17415f;
                                                    if (bool != null) {
                                                        throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                                                    }
                                                    if (bool.booleanValue()) {
                                                        StringBuilder sb4 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                                        sb4.append("Selected remote version of ");
                                                        sb4.append(str);
                                                        sb4.append(", version >= ");
                                                        sb4.append(i11);
                                                        Log.i("DynamiteModule", sb4.toString());
                                                        synchronized (c.class) {
                                                            gVar = f17422o;
                                                        }
                                                        if (gVar != null) {
                                                            throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                                        }
                                                        eVar2 = (e) threadLocal.get();
                                                        if (eVar2 != null || eVar2.f17426a == null) {
                                                            throw new DynamiteModule$LoadingException("No result cursor");
                                                        }
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor3 = eVar2.f17426a;
                                                        new ye.b(null);
                                                        synchronized (c.class) {
                                                            z10 = f17418i >= 2;
                                                        }
                                                        if (z10) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            aVarP3 = gVar.q2(new ye.b(applicationContext2), str, i11, new ye.b(cursor3));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            aVarP3 = gVar.p2(new ye.b(applicationContext2), str, i11, new ye.b(cursor3));
                                                        }
                                                        Context context2 = (Context) ye.b.l2(aVarP3);
                                                        if (context2 == null) {
                                                            throw new DynamiteModule$LoadingException("Failed to get module context");
                                                        }
                                                        cVar = new c(context2);
                                                    } else {
                                                        StringBuilder sb5 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                                                        sb5.append("Selected remote version of ");
                                                        sb5.append(str);
                                                        sb5.append(", version >= ");
                                                        sb5.append(i11);
                                                        Log.i("DynamiteModule", sb5.toString());
                                                        fVarH = h(context);
                                                        if (fVarH != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                                                        }
                                                        Parcel parcelG2 = fVarH.g2(6, fVarH.i2());
                                                        i12 = parcelG2.readInt();
                                                        parcelG2.recycle();
                                                        if (i12 >= 3) {
                                                            eVar = (e) threadLocal.get();
                                                            if (eVar != null) {
                                                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                                                            }
                                                            aVarP2 = fVarH.s2(new ye.b(context), str, i11, new ye.b(eVar.f17426a));
                                                        } else if (i12 == 2) {
                                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                            aVarP2 = fVarH.q2(new ye.b(context), str, i11);
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                            aVarP2 = fVarH.p2(new ye.b(context), str, i11);
                                                        }
                                                        objL2 = ye.b.l2(aVarP2);
                                                        if (objL2 != null) {
                                                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                                                        }
                                                        cVar = new c((Context) objL2);
                                                    }
                                                    if (jLongValue == 0) {
                                                        l.remove();
                                                    } else {
                                                        l.set(l10);
                                                    }
                                                    cursor = eVar4.f17426a;
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                    f17420k.set(eVar3);
                                                    return cVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (RemoteException e3) {
                                        e = e3;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                    } catch (DynamiteModule$LoadingException e10) {
                                        throw e10;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                    }
                                } catch (RemoteException e11) {
                                    e = e11;
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", e);
                                } catch (DynamiteModule$LoadingException e12) {
                                    throw e12;
                                } catch (Throwable th5) {
                                    th = th5;
                                    throw new DynamiteModule$LoadingException("Failed to load remote module.", th);
                                }
                            } catch (DynamiteModule$LoadingException e13) {
                                e = e13;
                                r7 = s0Var;
                                String message = e.getMessage();
                                StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 30);
                                sb6.append("Failed to load remote module: ");
                                sb6.append(message);
                                Log.w("DynamiteModule", sb6.toString());
                                i10 = dVarJ.f238a;
                                if (i10 != 0 || bVar.j(r7, str, new o(i10)).f240c != -1) {
                                    throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                                }
                                Log.i("DynamiteModule", "Selected local version of ".concat(str));
                                cVar = new c(applicationContext);
                            }
                        } catch (DynamiteModule$LoadingException e14) {
                            e = e14;
                            r7 = context;
                            String message2 = e.getMessage();
                            StringBuilder sb7 = new StringBuilder(String.valueOf(message2).length() + 30);
                            sb7.append("Failed to load remote module: ");
                            sb7.append(message2);
                            Log.w("DynamiteModule", sb7.toString());
                            i10 = dVarJ.f238a;
                            if (i10 != 0) {
                            }
                            throw new DynamiteModule$LoadingException("Remote load failed. No local fallback found.", e);
                        }
                    }
                } else if (dVarJ.f238a != 0) {
                    i15 = -1;
                    if (i15 == 1) {
                    }
                    if (i15 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(str));
                        c cVar3 = new c(applicationContext);
                        if (jLongValue == 0) {
                            s0Var.remove();
                        } else {
                            s0Var.set(l10);
                        }
                        cursor2 = eVar4.f17426a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(eVar3);
                        return cVar3;
                    }
                    if (i15 == 1) {
                        StringBuilder sb8 = new StringBuilder(String.valueOf(i15).length() + 36);
                        sb8.append("VersionPolicy returned invalid code:");
                        sb8.append(i15);
                        throw new DynamiteModule$LoadingException(sb8.toString());
                    }
                    i11 = dVarJ.f239b;
                    synchronized (c.class) {
                        if (e(context)) {
                            throw new DynamiteModule$LoadingException("Remote loading disabled");
                        }
                        bool = f17415f;
                        if (bool != null) {
                            throw new DynamiteModule$LoadingException("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb9 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                            sb9.append("Selected remote version of ");
                            sb9.append(str);
                            sb9.append(", version >= ");
                            sb9.append(i11);
                            Log.i("DynamiteModule", sb9.toString());
                            synchronized (c.class) {
                                gVar = f17422o;
                                if (gVar != null) {
                                    throw new DynamiteModule$LoadingException("DynamiteLoaderV2 was not cached.");
                                }
                                eVar2 = (e) threadLocal.get();
                                if (eVar2 != null) {
                                }
                                throw new DynamiteModule$LoadingException("No result cursor");
                            }
                        }
                        StringBuilder sb10 = new StringBuilder(str.length() + 40 + String.valueOf(i11).length());
                        sb10.append("Selected remote version of ");
                        sb10.append(str);
                        sb10.append(", version >= ");
                        sb10.append(i11);
                        Log.i("DynamiteModule", sb10.toString());
                        fVarH = h(context);
                        if (fVarH != null) {
                            throw new DynamiteModule$LoadingException("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelG3 = fVarH.g2(6, fVarH.i2());
                        i12 = parcelG3.readInt();
                        parcelG3.recycle();
                        if (i12 >= 3) {
                            eVar = (e) threadLocal.get();
                            if (eVar != null) {
                                throw new DynamiteModule$LoadingException("No cached result cursor holder");
                            }
                            aVarP2 = fVarH.s2(new ye.b(context), str, i11, new ye.b(eVar.f17426a));
                        } else if (i12 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarP2 = fVarH.q2(new ye.b(context), str, i11);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarP2 = fVarH.p2(new ye.b(context), str, i11);
                        }
                        objL2 = ye.b.l2(aVarP2);
                        if (objL2 != null) {
                            throw new DynamiteModule$LoadingException("Failed to load remote module.");
                        }
                        cVar = new c((Context) objL2);
                        if (jLongValue == 0) {
                            l.remove();
                        } else {
                            l.set(l10);
                        }
                        cursor = eVar4.f17426a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f17420k.set(eVar3);
                        return cVar;
                    }
                }
            }
            int i16 = dVarJ.f238a;
            int i17 = dVarJ.f239b;
            StringBuilder sb11 = new StringBuilder(str.length() + 46 + String.valueOf(i16).length() + 23 + String.valueOf(i17).length() + 1);
            sb11.append("No acceptable module ");
            sb11.append(str);
            sb11.append(" found. Local version is ");
            sb11.append(i16);
            sb11.append(" and remote version is ");
            sb11.append(i17);
            sb11.append(".");
            throw new DynamiteModule$LoadingException(sb11.toString());
        } catch (Throwable th6) {
            if (jLongValue == 0) {
                l.remove();
            } else {
                l.set(l10);
            }
            Cursor cursor4 = eVar4.f17426a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f17420k.set(eVar3);
            throw th6;
        }
    }

    public static int d(Context context, String str, boolean z10) {
        Throwable th2;
        RemoteException remoteException;
        int i10;
        Cursor cursor;
        try {
            synchronized (c.class) {
                Boolean bool = f17415f;
                boolean z11 = true;
                Cursor cursor2 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        g(classLoader);
                                    } catch (DynamiteModule$LoadingException unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else {
                                    if (!e(context)) {
                                        return 0;
                                    }
                                    if (f17417h) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iF = f(context, str, z10, true);
                                                String str2 = f17416g;
                                                if (str2 != null && !str2.isEmpty()) {
                                                    ClassLoader classLoaderW = d.W();
                                                    if (classLoaderW == null) {
                                                        String str3 = f17416g;
                                                        d0.h(str3);
                                                        classLoaderW = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                    }
                                                    g(classLoaderW);
                                                    declaredField.set(null, classLoaderW);
                                                    f17415f = bool2;
                                                    return iF;
                                                }
                                                return iF;
                                            } catch (DynamiteModule$LoadingException unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    }
                                }
                                f17415f = bool;
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e3) {
                        String string = e3.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(string);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return f(context, str, z10, false);
                    } catch (DynamiteModule$LoadingException e10) {
                        String message = e10.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message).length() + 42);
                        sb3.append("Failed to retrieve remote module version: ");
                        sb3.append(message);
                        Log.w("DynamiteModule", sb3.toString());
                        return 0;
                    }
                }
                f fVarH = h(context);
                try {
                    if (fVarH == null) {
                        return 0;
                    }
                    try {
                        Parcel parcelG2 = fVarH.g2(6, fVarH.i2());
                        int i11 = parcelG2.readInt();
                        parcelG2.recycle();
                        if (i11 >= 3) {
                            ThreadLocal threadLocal = f17420k;
                            e eVar = (e) threadLocal.get();
                            if (eVar != null && (cursor = eVar.f17426a) != null) {
                                return cursor.getInt(0);
                            }
                            Cursor cursor3 = (Cursor) ye.b.l2(fVarH.r2(new ye.b(context), str, z10, ((Long) l.get()).longValue()));
                            if (cursor3 != null) {
                                try {
                                    if (cursor3.moveToFirst()) {
                                        i10 = cursor3.getInt(0);
                                        if (i10 > 0) {
                                            e eVar2 = (e) threadLocal.get();
                                            if (eVar2 == null || eVar2.f17426a != null) {
                                                z11 = false;
                                            } else {
                                                eVar2.f17426a = cursor3;
                                            }
                                            cursor2 = z11 ? null : cursor3;
                                        }
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                    }
                                } catch (RemoteException e11) {
                                    remoteException = e11;
                                    cursor2 = cursor3;
                                    String message2 = remoteException.getMessage();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(message2).length() + 42);
                                    sb4.append("Failed to retrieve remote module version: ");
                                    sb4.append(message2);
                                    Log.w("DynamiteModule", sb4.toString());
                                    if (cursor2 == null) {
                                        return 0;
                                    }
                                    cursor2.close();
                                    return 0;
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    cursor2 = cursor3;
                                    if (cursor2 == null) {
                                        throw th2;
                                    }
                                    cursor2.close();
                                    throw th2;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor3 == null) {
                                return 0;
                            }
                            cursor3.close();
                            return 0;
                        }
                        if (i11 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            ye.b bVar = new ye.b(context);
                            Parcel parcelI2 = fVarH.i2();
                            mf.g.b(parcelI2, bVar);
                            parcelI2.writeString(str);
                            parcelI2.writeInt(z10 ? 1 : 0);
                            Parcel parcelG3 = fVarH.g2(5, parcelI2);
                            i10 = parcelG3.readInt();
                            parcelG3.recycle();
                        } else {
                            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            ye.b bVar2 = new ye.b(context);
                            Parcel parcelI3 = fVarH.i2();
                            mf.g.b(parcelI3, bVar2);
                            parcelI3.writeString(str);
                            parcelI3.writeInt(z10 ? 1 : 0);
                            Parcel parcelG4 = fVarH.g2(3, parcelI3);
                            i10 = parcelG4.readInt();
                            parcelG4.recycle();
                        }
                        return i10;
                    } catch (RemoteException e12) {
                        remoteException = e12;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        } catch (Throwable th6) {
            try {
                d0.h(context);
                throw th6;
            } catch (Exception e13) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e13);
                throw th6;
            }
        }
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f17419j)) {
            return true;
        }
        boolean z10 = false;
        if (f17419j == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 268435456);
            if (pe.f.f12493b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z10 = true;
            }
            f17419j = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f17417h = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static int f(Context context, String str, boolean z10, boolean z11) throws Throwable {
        Exception exc;
        Throwable th2;
        MatrixCursor matrixCursor;
        boolean z12;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z13 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z10 ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", String.valueOf(((Long) l.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z14 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i10 = 0; i10 < count; i10++) {
                                    if (!cursorQuery.moveToPosition(i10)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i11 = 0; i11 < columnCount; i11++) {
                                        int type = cursorQuery.getType(i11);
                                        if (type == 0) {
                                            objArr[i11] = null;
                                        } else if (type == 1) {
                                            objArr[i11] = Long.valueOf(cursorQuery.getLong(i11));
                                        } else if (type == 2) {
                                            objArr[i11] = Double.valueOf(cursorQuery.getDouble(i11));
                                        } else if (type == 3) {
                                            objArr[i11] = cursorQuery.getString(i11);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i11] = cursorQuery.getBlob(i11);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th3) {
                                try {
                                    cursorQuery.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th5) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th5;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i12 = matrixCursor.getInt(0);
                            if (i12 > 0) {
                                synchronized (c.class) {
                                    try {
                                        f17416g = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f17418i = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z12 = matrixCursor.getInt(columnIndex2) != 0;
                                            f17417h = z12;
                                        } else {
                                            z12 = false;
                                        }
                                    } catch (Throwable th6) {
                                        throw th6;
                                    }
                                }
                                e eVar = (e) f17420k.get();
                                if (eVar == null || eVar.f17426a != null) {
                                    z13 = false;
                                } else {
                                    eVar.f17426a = matrixCursor;
                                }
                                z14 = z12;
                                matrixCursor2 = z13 ? null : matrixCursor;
                            }
                            if (z11 && z14) {
                                throw new DynamiteModule$LoadingException("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i12;
                        }
                    } catch (Exception e3) {
                        exc = e3;
                        if (exc instanceof DynamiteModule$LoadingException) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 25);
                        sb2.append("V2 version check failed: ");
                        sb2.append(message);
                        throw new DynamiteModule$LoadingException(sb2.toString(), exc);
                    } catch (Throwable th7) {
                        th2 = th7;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th2;
                        }
                        matrixCursor2.close();
                        throw th2;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new DynamiteModule$LoadingException("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th8) {
                th2 = th8;
            }
        } catch (Exception e10) {
            exc = e10;
        }
    }

    public static void g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            g gVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 4);
            }
            f17422o = gVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e3);
        }
    }

    public static f h(Context context) {
        f fVar;
        synchronized (c.class) {
            f fVar2 = f17421n;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 4);
                }
                if (fVar != null) {
                    f17421n = fVar;
                    return fVar;
                }
            } catch (Exception e3) {
                String message = e3.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 45);
                sb2.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb2.append(message);
                Log.e("DynamiteModule", sb2.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.f17423a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e3) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e3);
        }
    }
}
