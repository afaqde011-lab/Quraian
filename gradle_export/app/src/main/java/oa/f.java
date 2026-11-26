package oa;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import ca.p;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import o9.q;
import qd.j0;

public final class f extends SQLiteOpenHelper {
    public static final int H = 0;
    public final Context A;
    public final q B;
    public final j0 C;
    public final boolean D;
    public boolean E;
    public final qa.a F;
    public boolean G;

    public f(Context context, String str, final q qVar, final j0 j0Var, boolean z10) {
        String string;
        super(context, str, null, j0Var.B, new DatabaseErrorHandler() {
            @Override
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i10 = f.H;
                m.b(sQLiteDatabase);
                b bVarY = w00.a.y(qVar, sQLiteDatabase);
                j0Var.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVarY + ".path");
                SQLiteDatabase sQLiteDatabase2 = bVarY.A;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        j0.g(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                m.d(obj, "second");
                                j0.g((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                j0.g(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    bVarY.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        m.e(context, "context");
        m.e(j0Var, "callback");
        this.A = context;
        this.B = qVar;
        this.C = j0Var;
        this.D = z10;
        if (str == null) {
            string = UUID.randomUUID().toString();
            m.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.F = new qa.a(string, context.getCacheDir(), false);
    }

    public final na.a a(boolean z10) {
        qa.a aVar = this.F;
        try {
            aVar.a((this.G || getDatabaseName() == null) ? false : true);
            this.E = false;
            SQLiteDatabase sQLiteDatabaseI = i(z10);
            if (!this.E) {
                return w00.a.y(this.B, sQLiteDatabaseI);
            }
            close();
            return a(z10);
        } finally {
            aVar.b();
        }
    }

    @Override
    public final void close() {
        qa.a aVar = this.F;
        try {
            aVar.a(aVar.f12799a);
            super.close();
            this.B.B = null;
            this.G = false;
        } finally {
            aVar.b();
        }
    }

    public final SQLiteDatabase i(boolean z10) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z11 = this.G;
        Context context = this.A;
        if (databaseName != null && !z11 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z10) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                m.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            m.b(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z10) {
                    readableDatabase2 = getWritableDatabase();
                    m.b(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    m.b(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int iOrdinal = dVar.A.ordinal();
                    th = dVar.B;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.D) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z10) {
                        readableDatabase = getWritableDatabase();
                        m.b(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        m.b(readableDatabase);
                    }
                    return readableDatabase;
                } catch (d e3) {
                    throw e3.B;
                }
            }
        }
    }

    @Override
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        m.e(sQLiteDatabase, "db");
        boolean z10 = this.E;
        j0 j0Var = this.C;
        if (!z10 && j0Var.B != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            w00.a.y(this.B, sQLiteDatabase);
            j0Var.getClass();
        } catch (Throwable th2) {
            throw new d(e.A, th2);
        }
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m.e(sQLiteDatabase, "sqLiteDatabase");
        try {
            ((p) this.C.C).j(new pa.a(w00.a.y(this.B, sQLiteDatabase)));
        } catch (Throwable th2) {
            throw new d(e.B, th2);
        }
    }

    @Override
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m.e(sQLiteDatabase, "db");
        this.E = true;
        try {
            this.C.k(w00.a.y(this.B, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.D, th2);
        }
    }

    @Override
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        m.e(sQLiteDatabase, "db");
        if (!this.E) {
            try {
                j0 j0Var = this.C;
                b bVarY = w00.a.y(this.B, sQLiteDatabase);
                p pVar = (p) j0Var.C;
                pVar.l(new pa.a(bVarY));
                pVar.f3072i = bVarY;
            } catch (Throwable th2) {
                throw new d(e.E, th2);
            }
        }
        this.G = true;
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        m.e(sQLiteDatabase, "sqLiteDatabase");
        this.E = true;
        try {
            this.C.k(w00.a.y(this.B, sQLiteDatabase), i10, i11);
        } catch (Throwable th2) {
            throw new d(e.C, th2);
        }
    }
}
