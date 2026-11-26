package yc;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.amplitude.android.migration.CursorWindowAllocationException;
import java.io.File;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.JSONObject;
import r30.r;

public final class e extends SQLiteOpenHelper {
    public final cd.b A;
    public final File B;
    public boolean C;
    public int D;

    public e(Context context, String str, cd.b bVar) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(str, "databaseName");
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.A = bVar;
        File databasePath = context.getDatabasePath(str);
        kotlin.jvm.internal.m.d(databasePath, "getDatabasePath(...)");
        this.B = databasePath;
        this.C = true;
        this.D = 4;
    }

    public static void i(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (!r.x0(message, "Cursor window allocation of", false) && !r.x0(message, "Could not allocate CursorWindow", false)) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    public final AbstractList A(String str) throws Throwable {
        RuntimeException runtimeException;
        Cursor cursor;
        String str2;
        Throwable th2;
        if (!this.B.exists()) {
            return new ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        Cursor cursor2 = null;
        try {
            try {
                try {
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    if (!this.C) {
                        ArrayList arrayList = new ArrayList();
                        close();
                        return arrayList;
                    }
                    kotlin.jvm.internal.m.b(readableDatabase);
                    str2 = str;
                    try {
                        Cursor cursorQuery = readableDatabase.query(str2, new String[]{"id", "event"}, null, null, null, null, "id ASC", null);
                        while (true) {
                            try {
                                kotlin.jvm.internal.m.b(cursorQuery);
                                if (!cursorQuery.moveToNext()) {
                                    cursorQuery.close();
                                    close();
                                    return linkedList;
                                }
                                long j9 = cursorQuery.getLong(0);
                                String string = cursorQuery.getString(1);
                                if (string != null && string.length() != 0) {
                                    JSONObject jSONObject = new JSONObject(string);
                                    jSONObject.put("$rowId", j9);
                                    linkedList.add(jSONObject);
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor2 = cursorQuery;
                                dd.b.f4866c.a("read events from " + str2 + " failed: " + e.getMessage());
                                a();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (IllegalStateException e10) {
                                e = e10;
                                cursor2 = cursorQuery;
                                x(e);
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (RuntimeException e11) {
                                cursor = cursorQuery;
                                runtimeException = e11;
                                try {
                                    i(runtimeException);
                                    throw null;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    close();
                                    throw th2;
                                }
                            } catch (StackOverflowError e12) {
                                e = e12;
                                cursor2 = cursorQuery;
                                dd.b.f4866c.a("read events from " + str2 + " failed: " + e.getMessage());
                                a();
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                return linkedList;
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = cursorQuery;
                                th2 = th;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                close();
                                throw th2;
                            }
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                    } catch (StackOverflowError e14) {
                        e = e14;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (SQLiteException e15) {
                e = e15;
                str2 = str;
            } catch (StackOverflowError e16) {
                e = e16;
                str2 = str;
            }
        } catch (IllegalStateException e17) {
            e = e17;
        } catch (RuntimeException e18) {
            runtimeException = e18;
            cursor = null;
        }
    }

    public final void F(long j9, String str) {
        try {
            getWritableDatabase().delete(str, "id = ?", new String[]{String.valueOf(j9)});
        } catch (StackOverflowError e3) {
            dd.b.f4866c.a("remove events from " + str + " failed: " + e3.getMessage());
            a();
        } catch (SQLiteException e10) {
            dd.b.f4866c.a("remove events from " + str + " failed: " + e10.getMessage());
            a();
        } finally {
            close();
        }
    }

    public final synchronized void G(String str) {
        I(str);
    }

    public final void I(String str) {
        try {
            getWritableDatabase().delete("long_store", "key = ?", new String[]{str});
        } catch (SQLiteException e3) {
            dd.b.f4866c.a("remove value from long_store failed: " + e3.getMessage());
            a();
        } catch (StackOverflowError e10) {
            dd.b.f4866c.a("remove value from long_store failed: " + e10.getMessage());
            a();
        } finally {
            close();
        }
    }

    public final void a() {
        try {
            close();
        } catch (Exception e3) {
            dd.b bVar = dd.b.f4866c;
            dd.b.f4866c.a("close failed: " + e3.getMessage());
        }
    }

    public final synchronized Long l(String str) {
        return (Long) v("long_store", str);
    }

    @Override
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        kotlin.jvm.internal.m.e(sQLiteDatabase, "db");
        this.C = false;
        this.A.a("Attempt to re-create existing legacy database file " + this.B.getAbsolutePath());
    }

    @Override
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.D = i10;
    }

    public final synchronized String r(String str) {
        return (String) v("store", str);
    }

    public final Object v(String str, String str2) throws Throwable {
        Throwable th2;
        RuntimeException runtimeException;
        IllegalStateException illegalStateException;
        Cursor cursorQuery;
        String str3;
        StackOverflowError stackOverflowError;
        SQLiteException sQLiteException;
        ?? r4 = 0;
        Object string = null;
        try {
            if (this.B.exists()) {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        if (!this.C) {
                            close();
                            return null;
                        }
                        kotlin.jvm.internal.m.b(readableDatabase);
                        str3 = str;
                        try {
                            cursorQuery = readableDatabase.query(str3, new String[]{"key", "value"}, "key = ?", new String[]{str2}, null, null, null, null);
                            try {
                                kotlin.jvm.internal.m.b(cursorQuery);
                                if (cursorQuery.moveToFirst()) {
                                    string = str3.equals("store") ? cursorQuery.getString(1) : Long.valueOf(cursorQuery.getLong(1));
                                }
                                cursorQuery.close();
                                close();
                                return string;
                            } catch (SQLiteException e3) {
                                sQLiteException = e3;
                            } catch (IllegalStateException e10) {
                                illegalStateException = e10;
                                x(illegalStateException);
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                close();
                                return null;
                            } catch (RuntimeException e11) {
                                runtimeException = e11;
                                i(runtimeException);
                                throw null;
                            } catch (StackOverflowError e12) {
                                stackOverflowError = e12;
                                dd.b.f4866c.a("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                                a();
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                close();
                                return null;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            sQLiteException = e;
                            cursorQuery = null;
                        } catch (StackOverflowError e14) {
                            e = e14;
                            stackOverflowError = e;
                            cursorQuery = null;
                            dd.b.f4866c.a("getValue from " + str3 + " failed: " + stackOverflowError.getMessage());
                            a();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            close();
                            return null;
                        }
                    } catch (SQLiteException e15) {
                        e = e15;
                        str3 = str;
                    } catch (StackOverflowError e16) {
                        e = e16;
                        str3 = str;
                    }
                } catch (IllegalStateException e17) {
                    illegalStateException = e17;
                    cursorQuery = null;
                } catch (RuntimeException e18) {
                    runtimeException = e18;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (r4 != 0) {
                        r4.close();
                    }
                    close();
                    throw th2;
                }
                sQLiteException = e;
                cursorQuery = null;
                dd.b.f4866c.a("getValue from " + str3 + " failed: " + sQLiteException.getMessage());
                a();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            r4 = str;
        }
    }

    public final void x(IllegalStateException illegalStateException) {
        String message = illegalStateException.getMessage();
        if (message == null || message.length() == 0 || !r30.k.A0(message, "Couldn't read", false) || !r30.k.A0(message, "CursorWindow", false)) {
            throw illegalStateException;
        }
        a();
    }
}
