package pa;

import a10.h0;
import android.database.Cursor;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import o9.q;

public final class e extends f {
    public int[] D;
    public long[] E;
    public double[] F;
    public String[] G;
    public byte[][] H;
    public Cursor I;

    public e(na.a aVar, String str) {
        super(aVar, str);
        m.e(aVar, "db");
        m.e(str, "sql");
        this.D = new int[0];
        this.E = new long[0];
        this.F = new double[0];
        this.G = new String[0];
        this.H = new byte[0][];
    }

    public static void r(Cursor cursor, int i10) {
        if (i10 < 0 || i10 >= cursor.getColumnCount()) {
            h0.M(25, "column index out of range");
            throw null;
        }
    }

    @Override
    public final String R(int i10) {
        a();
        Cursor cursorV = v();
        r(cursorV, i10);
        String string = cursorV.getString(i10);
        m.d(string, "getString(...)");
        return string;
    }

    @Override
    public final void close() {
        if (!this.C) {
            h();
            reset();
        }
        this.C = true;
    }

    @Override
    public final void d(int i10, long j9) {
        a();
        i(1, i10);
        this.D[i10] = 1;
        this.E[i10] = j9;
    }

    @Override
    public final boolean d0() {
        a();
        l();
        Cursor cursor = this.I;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        a();
        i(4, i10);
        this.D[i10] = 4;
        this.H[i10] = bArr;
    }

    @Override
    public final void f(int i10) {
        a();
        i(5, i10);
        this.D[i10] = 5;
    }

    @Override
    public final byte[] getBlob(int i10) {
        a();
        Cursor cursorV = v();
        r(cursorV, i10);
        byte[] blob = cursorV.getBlob(i10);
        m.d(blob, "getBlob(...)");
        return blob;
    }

    @Override
    public final int getColumnCount() {
        a();
        l();
        Cursor cursor = this.I;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override
    public final String getColumnName(int i10) {
        a();
        l();
        Cursor cursor = this.I;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        r(cursor, i10);
        String columnName = cursor.getColumnName(i10);
        m.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override
    public final long getLong(int i10) {
        a();
        Cursor cursorV = v();
        r(cursorV, i10);
        return cursorV.getLong(i10);
    }

    @Override
    public final void h() {
        a();
        this.D = new int[0];
        this.E = new long[0];
        this.F = new double[0];
        this.G = new String[0];
        this.H = new byte[0][];
    }

    public final void i(int i10, int i11) {
        int i12 = i11 + 1;
        int[] iArr = this.D;
        if (iArr.length < i12) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            m.d(iArrCopyOf, "copyOf(...)");
            this.D = iArrCopyOf;
        }
        if (i10 == 1) {
            long[] jArr = this.E;
            if (jArr.length < i12) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                m.d(jArrCopyOf, "copyOf(...)");
                this.E = jArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 2) {
            double[] dArr = this.F;
            if (dArr.length < i12) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                m.d(dArrCopyOf, "copyOf(...)");
                this.F = dArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 3) {
            String[] strArr = this.G;
            if (strArr.length < i12) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                m.d(objArrCopyOf, "copyOf(...)");
                this.G = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        byte[][] bArr = this.H;
        if (bArr.length < i12) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
            m.d(objArrCopyOf2, "copyOf(...)");
            this.H = (byte[][]) objArrCopyOf2;
        }
    }

    @Override
    public final boolean isNull(int i10) {
        a();
        Cursor cursorV = v();
        r(cursorV, i10);
        return cursorV.isNull(i10);
    }

    public final void l() {
        if (this.I == null) {
            this.I = this.A.X(new q(this, 8));
        }
    }

    @Override
    public final void reset() {
        a();
        Cursor cursor = this.I;
        if (cursor != null) {
            cursor.close();
        }
        this.I = null;
    }

    public final Cursor v() {
        Cursor cursor = this.I;
        if (cursor != null) {
            return cursor;
        }
        h0.M(21, "no row");
        throw null;
    }

    @Override
    public final void y(int i10, String str) {
        m.e(str, "value");
        a();
        i(3, i10);
        this.D[i10] = 3;
        this.G[i10] = str;
    }
}
