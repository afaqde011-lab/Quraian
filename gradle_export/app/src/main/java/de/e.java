package de;

import a30.k;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import ee.h;
import xd.i;

public final class e implements fe.a {
    public final int A;
    public final k B;
    public final i C;

    public e(k kVar, i iVar, int i10) {
        this.A = i10;
        this.B = kVar;
        this.C = iVar;
    }

    @Override
    public final Object i() {
        Boolean bool;
        switch (this.A) {
            case 0:
                i iVar = this.C;
                h hVar = (h) ((ee.d) this.B.c);
                SQLiteDatabase sQLiteDatabaseA = hVar.a();
                sQLiteDatabaseA.beginTransaction();
                try {
                    Long lI = h.i(sQLiteDatabaseA, iVar);
                    if (lI == null) {
                        bool = Boolean.FALSE;
                    } else {
                        Cursor cursorRawQuery = hVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI.toString()});
                        try {
                            Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                            cursorRawQuery.close();
                            bool = boolValueOf;
                        } catch (Throwable th2) {
                            cursorRawQuery.close();
                            throw th2;
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                    return bool;
                } catch (Throwable th3) {
                    sQLiteDatabaseA.endTransaction();
                    throw th3;
                }
            default:
                h hVar2 = (h) ((ee.d) this.B.c);
                hVar2.getClass();
                return (Iterable) hVar2.l(new ak.a(hVar2, this.C, 4));
        }
    }
}
