package n3;

import java.text.CharacterIterator;

public final class b implements CharacterIterator {
    public final CharSequence A;
    public final int B;
    public int C = 0;

    public b(CharSequence charSequence, int i10) {
        this.A = charSequence;
        this.B = i10;
    }

    @Override
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override
    public final char current() {
        int i10 = this.C;
        if (i10 == this.B) {
            return (char) 65535;
        }
        return this.A.charAt(i10);
    }

    @Override
    public final char first() {
        this.C = 0;
        return current();
    }

    @Override
    public final int getBeginIndex() {
        return 0;
    }

    @Override
    public final int getEndIndex() {
        return this.B;
    }

    @Override
    public final int getIndex() {
        return this.C;
    }

    @Override
    public final char last() {
        int i10 = this.B;
        if (i10 == 0) {
            this.C = i10;
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.C = i11;
        return this.A.charAt(i11);
    }

    @Override
    public final char next() {
        int i10 = this.C + 1;
        this.C = i10;
        int i11 = this.B;
        if (i10 < i11) {
            return this.A.charAt(i10);
        }
        this.C = i11;
        return (char) 65535;
    }

    @Override
    public final char previous() {
        int i10 = this.C;
        if (i10 <= 0) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.C = i11;
        return this.A.charAt(i11);
    }

    @Override
    public final char setIndex(int i10) {
        if (i10 > this.B || i10 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.C = i10;
        return current();
    }
}
