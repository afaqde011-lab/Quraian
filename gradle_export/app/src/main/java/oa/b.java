package oa;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.m;
import o9.q;

public final class b implements na.a {
    public static final String[] B = {RuntimeVersion.SUFFIX, " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] C = new String[0];
    public static final Object D;
    public static final Object E;
    public final SQLiteDatabase A;

    static {
        g00.i iVar = g00.i.B;
        D = rd.a.I(iVar, new h.e(16));
        E = rd.a.I(iVar, new h.e(17));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.A = sQLiteDatabase;
    }

    @Override
    public final boolean B() {
        return this.A.enableWriteAheadLogging();
    }

    @Override
    public final void D(Object[] objArr) {
        this.A.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override
    public final void E() {
        this.A.setTransactionSuccessful();
    }

    @Override
    public final void H() {
        this.A.beginTransactionNonExclusive();
    }

    @Override
    public final void P() {
        this.A.endTransaction();
    }

    @Override
    public final Cursor X(q qVar) {
        final j0.g gVar = new j0.g(qVar, 2);
        Cursor cursorRawQueryWithFactory = this.A.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            @Override
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) gVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, ((pa.e) qVar.B).B, C, null);
        m.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }

    @Override
    public final boolean Y() {
        return this.A.isWriteAheadLoggingEnabled();
    }

    @Override
    public final void close() {
        this.A.close();
    }

    @Override
    public final boolean g() {
        return this.A.inTransaction();
    }

    @Override
    public final int g0(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(B[3]);
        sb2.append("WorkSpec SET ");
        int i10 = 0;
        int i11 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i11 > 0 ? "," : RuntimeVersion.SUFFIX);
            sb2.append(str);
            objArr2[i11] = contentValues.get(str);
            sb2.append("=?");
            i11++;
        }
        for (int i12 = size; i12 < length; i12++) {
            objArr2[i12] = objArr[i12 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        i iVarQ = q(sb2.toString());
        while (i10 < length) {
            Object obj = objArr2[i10];
            i10++;
            if (obj == null) {
                iVarQ.f(i10);
            } else if (obj instanceof byte[]) {
                iVarQ.A.bindBlob(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                iVarQ.U(((Number) obj).floatValue(), i10);
            } else if (obj instanceof Double) {
                iVarQ.U(((Number) obj).doubleValue(), i10);
            } else if (obj instanceof Long) {
                iVarQ.d(i10, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                iVarQ.d(i10, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                iVarQ.d(i10, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                iVarQ.d(i10, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                iVarQ.p(i10, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                iVarQ.d(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return iVarQ.B.executeUpdateDelete();
    }

    @Override
    public final boolean isOpen() {
        return this.A.isOpen();
    }

    @Override
    public final void k() {
        this.A.beginTransaction();
    }

    @Override
    public final void n() {
        this.A.disableWriteAheadLogging();
    }

    @Override
    public final void o(String str) {
        m.e(str, "sql");
        this.A.execSQL(str);
    }

    @Override
    public final i q(String str) {
        m.e(str, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.A.compileStatement(str);
        m.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new i(sQLiteStatementCompileStatement);
    }

    @Override
    public final void u() throws IllegalAccessException, InvocationTargetException {
        ?? r4 = E;
        if (((Method) r4.getValue()) != null) {
            ?? r7 = D;
            if (((Method) r7.getValue()) != null) {
                Method method = (Method) r4.getValue();
                m.b(method);
                Method method2 = (Method) r7.getValue();
                m.b(method2);
                Object objInvoke = method2.invoke(this.A, null);
                if (objInvoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(objInvoke, 0, null, 0, null);
                return;
            }
        }
        k();
    }
}
