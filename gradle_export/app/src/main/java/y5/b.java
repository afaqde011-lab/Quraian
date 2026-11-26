package y5;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b extends InputStream implements DataInput {
    public final DataInputStream A;
    public int B;
    public ByteOrder C;
    public byte[] D;
    public final int E;

    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i10) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A = dataInputStream;
        dataInputStream.mark(0);
        this.B = 0;
        this.C = byteOrder;
        this.E = inputStream instanceof b ? ((b) inputStream).E : -1;
    }

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.E = bArr.length;
    }

    public final void a(int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i10 - i11;
            DataInputStream dataInputStream = this.A;
            int iSkip = (int) dataInputStream.skip(i12);
            if (iSkip <= 0) {
                if (this.D == null) {
                    this.D = new byte[8192];
                }
                iSkip = dataInputStream.read(this.D, 0, Math.min(8192, i12));
                if (iSkip == -1) {
                    throw new EOFException(g4.c.i("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += iSkip;
        }
        this.B += i11;
    }

    @Override
    public final int available() {
        return this.A.available();
    }

    @Override
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.B++;
        return this.A.read();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A.read(bArr, i10, i11);
        this.B += i12;
        return i12;
    }

    @Override
    public final boolean readBoolean() {
        this.B++;
        return this.A.readBoolean();
    }

    @Override
    public final byte readByte() throws IOException {
        this.B++;
        int i10 = this.A.read();
        if (i10 >= 0) {
            return (byte) i10;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.B += 2;
        return this.A.readChar();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override
    public final void readFully(byte[] bArr) throws IOException {
        this.B += bArr.length;
        this.A.readFully(bArr);
    }

    @Override
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.B += i11;
        this.A.readFully(bArr, i10, i11);
    }

    @Override
    public final int readInt() throws IOException {
        this.B += 4;
        DataInputStream dataInputStream = this.A;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.C;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
        }
        throw new IOException("Invalid byte order: " + this.C);
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() throws IOException {
        this.B += 8;
        DataInputStream dataInputStream = this.A;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        int i17 = dataInputStream.read();
        if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.C;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
        }
        throw new IOException("Invalid byte order: " + this.C);
    }

    @Override
    public final short readShort() throws IOException {
        int i10;
        this.B += 2;
        DataInputStream dataInputStream = this.A;
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.C;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            i10 = (i12 << 8) + i11;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.C);
            }
            i10 = (i11 << 8) + i12;
        }
        return (short) i10;
    }

    @Override
    public final String readUTF() {
        this.B += 2;
        return this.A.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.B++;
        return this.A.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() throws IOException {
        this.B += 2;
        DataInputStream dataInputStream = this.A;
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.C;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 8) + i10;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.C);
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }
}
