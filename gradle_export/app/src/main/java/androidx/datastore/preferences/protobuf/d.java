package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.cast.q9;
import com.google.android.gms.internal.measurement.v4;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {
    public final int A = 0;
    public int B = 0;
    public final int C;
    public final Iterable D;

    public d(g gVar) {
        this.D = gVar;
        this.C = gVar.size();
    }

    public d(androidx.glance.appwidget.protobuf.h hVar) {
        this.D = hVar;
        this.C = hVar.size();
    }

    public d(q9 q9Var) {
        this.D = q9Var;
        this.C = q9Var.c();
    }

    public d(v4 v4Var) {
        this.D = v4Var;
        this.C = v4Var.c();
    }

    public d(com.google.android.gms.internal.play_billing.o1 o1Var) {
        this.D = o1Var;
        this.C = o1Var.c();
    }

    public d(com.google.crypto.tink.shaded.protobuf.h hVar) {
        this.D = hVar;
        this.C = hVar.size();
    }

    public d(nf.u0 u0Var) {
        this.D = u0Var;
        this.C = u0Var.e();
    }

    public d(o20.t tVar) {
        this.D = tVar;
        this.C = tVar.B.length;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B < this.C;
            case 1:
                return this.B < this.C;
            case 2:
                return this.B < this.C;
            case 3:
                return this.B < this.C;
            case 4:
                return this.B < this.C;
            case 5:
                return this.B < this.C;
            case 6:
                return this.B < this.C;
            default:
                return this.B < this.C;
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                int i10 = this.B;
                if (i10 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i10 + 1;
                return Byte.valueOf(((g) this.D).i(i10));
            case 1:
                int i11 = this.B;
                if (i11 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i11 + 1;
                return Byte.valueOf(((androidx.glance.appwidget.protobuf.h) this.D).i(i11));
            case 2:
                int i12 = this.B;
                if (i12 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i12 + 1;
                return Byte.valueOf(((q9) this.D).b(i12));
            case 3:
                int i13 = this.B;
                if (i13 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i13 + 1;
                return Byte.valueOf(((v4) this.D).b(i13));
            case 4:
                int i14 = this.B;
                if (i14 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i14 + 1;
                return Byte.valueOf(((com.google.android.gms.internal.play_billing.o1) this.D).a(i14));
            case 5:
                int i15 = this.B;
                if (i15 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i15 + 1;
                return Byte.valueOf(((com.google.crypto.tink.shaded.protobuf.h) this.D).k(i15));
            case 6:
                int i16 = this.B;
                if (i16 >= this.C) {
                    throw new NoSuchElementException();
                }
                this.B = i16 + 1;
                return Byte.valueOf(((nf.u0) this.D).b(i16));
            default:
                return Byte.valueOf(nextByte());
        }
    }

    public byte nextByte() {
        try {
            byte[] bArr = this.D.B;
            int i10 = this.B;
            this.B = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
