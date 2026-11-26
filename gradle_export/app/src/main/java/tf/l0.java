package tf;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

public final class l0 extends d0 {
    public static final String[] F = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final l D;
    public boolean E;

    public l0(h1 h1Var) {
        super(h1Var);
        this.D = new l(this, ((h1) this.B).A);
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void Z0() {
        int iDelete;
        h1 h1Var = (h1) this.B;
        V0();
        try {
            SQLiteDatabase sQLiteDatabaseB1 = b1();
            if (sQLiteDatabaseB1 == null || (iDelete = sQLiteDatabaseB1.delete("messages", null, null)) <= 0) {
                return;
            }
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e3) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(e3, "Error resetting local analytics data. error");
        }
    }

    public final boolean a1() {
        h1 h1Var = (h1) this.B;
        V0();
        if (!this.E && h1Var.A.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseB1 = b1();
                        if (sQLiteDatabaseB1 != null) {
                            sQLiteDatabaseB1.beginTransaction();
                            sQLiteDatabaseB1.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseB1.setTransactionSuccessful();
                            sQLiteDatabaseB1.endTransaction();
                            sQLiteDatabaseB1.close();
                            return true;
                        }
                        this.E = true;
                    } catch (SQLiteException e3) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th2) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th2;
                            }
                        }
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        q0Var.G.c(e3, "Error deleting app launch break from local database");
                        this.E = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i10);
                    i10 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteFullException e10) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.G.c(e10, "Error deleting app launch break from local database");
                    this.E = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.J.b("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final SQLiteDatabase b1() {
        if (this.E) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.D.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.E = true;
        return null;
    }

    public final boolean c1(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseB1;
        boolean z10;
        boolean z11;
        Cursor cursorRawQuery;
        h1 h1Var = (h1) this.B;
        V0();
        boolean z12 = false;
        z12 = false;
        if (!this.E) {
            g gVar = h1Var.D;
            q0 q0Var = h1Var.F;
            a0 a0Var = b0.f14550b1;
            Cursor cursor = null;
            cursor = null;
            g4 g4VarZ0 = gVar.f1(null, a0Var) ? h1Var.l().Z0(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (h1Var.D.f1(null, a0Var) && g4VarZ0 != null) {
                contentValues.put("app_version", g4VarZ0.C);
                contentValues.put("app_version_int", Long.valueOf(g4VarZ0.J));
            }
            int i11 = 5;
            int i12 = 0;
            for (int i13 = 5; i12 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseB1 = b1();
                    if (sQLiteDatabaseB1 == null) {
                        this.E = true;
                    } else {
                        try {
                            sQLiteDatabaseB1.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseB1.rawQuery("select count(1) from messages", null);
                            long j9 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j9 = cursorRawQuery.getLong(z12 ? 1 : 0);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor = cursorRawQuery;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z10 = z12 ? 1 : 0;
                                    SystemClock.sleep(i11);
                                    i11 += 20;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseB1 != null) {
                                        sQLiteDatabaseB1.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                } catch (SQLiteFullException e3) {
                                    e = e3;
                                    z10 = z12 ? 1 : 0;
                                    h1.g(q0Var);
                                    q0Var.G.c(e, "Error writing entry; local database full");
                                    this.E = true;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseB1 != null) {
                                        sQLiteDatabaseB1.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                    if (sQLiteDatabaseB1 != null) {
                                        sQLiteDatabaseB1.endTransaction();
                                    }
                                    h1.g(q0Var);
                                    q0Var.G.c(e, "Error writing entry to local database");
                                    this.E = z11;
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    if (sQLiteDatabaseB1 != null) {
                                        sQLiteDatabaseB1.close();
                                    }
                                    i12++;
                                    z12 = z10;
                                }
                            }
                            if (j9 >= 100000) {
                                h1.g(q0Var);
                                q0Var.G.b("Data loss, local db full");
                                long j10 = 100001 - j9;
                                long jDelete = sQLiteDatabaseB1.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j10)});
                                if (jDelete != j10) {
                                    h1.g(q0Var);
                                    b50.b bVar = q0Var.G;
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                            try {
                                                bVar.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j10), Long.valueOf(jDelete), Long.valueOf(j10 - jDelete));
                                            } catch (SQLiteFullException e11) {
                                                e = e11;
                                                h1.g(q0Var);
                                                q0Var.G.c(e, "Error writing entry; local database full");
                                                this.E = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseB1 != null) {
                                                    sQLiteDatabaseB1.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                if (sQLiteDatabaseB1 != null) {
                                                    sQLiteDatabaseB1.endTransaction();
                                                }
                                                h1.g(q0Var);
                                                q0Var.G.c(e, "Error writing entry to local database");
                                                this.E = z11;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseB1 != null) {
                                                    sQLiteDatabaseB1.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            }
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i11);
                                            i11 += 20;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseB1 != null) {
                                                sQLiteDatabaseB1.close();
                                            }
                                            i12++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteFullException e13) {
                                        e = e13;
                                        h1.g(q0Var);
                                        q0Var.G.c(e, "Error writing entry; local database full");
                                        this.E = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        z11 = true;
                                        if (sQLiteDatabaseB1 != null && sQLiteDatabaseB1.inTransaction()) {
                                            sQLiteDatabaseB1.endTransaction();
                                        }
                                        h1.g(q0Var);
                                        q0Var.G.c(e, "Error writing entry to local database");
                                        this.E = z11;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB1 != null) {
                                            sQLiteDatabaseB1.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                }
                            } else {
                                z10 = z12 ? 1 : 0;
                                z11 = true;
                            }
                            sQLiteDatabaseB1.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseB1.setTransactionSuccessful();
                            sQLiteDatabaseB1.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseB1.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e15) {
                            e = e15;
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e16) {
                            e = e16;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseB1 = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e17) {
                    e = e17;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseB1 = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabaseB1 = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseB1 = null;
                }
            }
            boolean z13 = z12 ? 1 : 0;
            h1.g(q0Var);
            q0Var.O.b("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }
}
