package qi;

import androidx.media3.common.q;
import com.google.android.gms.cast.MediaStatus;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l implements Closeable {
    public static final Logger G = Logger.getLogger(l.class.getName());
    public final RandomAccessFile A;
    public int B;
    public int C;
    public i D;
    public i E;
    public final byte[] F;

    public l(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.F = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(MediaStatus.COMMAND_EDIT_TRACKS);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    Z(i10, iArr[i11], bArr2);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.A = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iX = x(0, bArr);
        this.B = iX;
        if (iX > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.B + ", Actual length: " + randomAccessFile2.length());
        }
        this.C = x(4, bArr);
        int iX2 = x(8, bArr);
        int iX3 = x(12, bArr);
        this.D = v(iX2);
        this.E = v(iX3);
    }

    public static void Z(int i10, int i11, byte[] bArr) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static int x(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final synchronized void A() {
        if (r()) {
            throw new NoSuchElementException();
        }
        if (this.C == 1) {
            synchronized (this) {
                S(4096, 0, 0, 0);
                this.C = 0;
                i iVar = i.f13026c;
                this.D = iVar;
                this.E = iVar;
                if (this.B > 4096) {
                    RandomAccessFile randomAccessFile = this.A;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.B = 4096;
            }
        } else {
            i iVar2 = this.D;
            int iO = O(iVar2.f13027a + 4 + iVar2.f13028b);
            F(iO, this.F, 0, 4);
            int iX = x(0, this.F);
            S(this.B, this.C - 1, iO, this.E.f13027a);
            this.C--;
            this.D = new i(iO, iX);
        }
    }

    public final void F(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int iO = O(i10);
        int i13 = iO + i12;
        int i14 = this.B;
        RandomAccessFile randomAccessFile = this.A;
        if (i13 <= i14) {
            randomAccessFile.seek(iO);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void G(int i10, int i11, byte[] bArr) throws IOException {
        int iO = O(i10);
        int i12 = iO + i11;
        int i13 = this.B;
        RandomAccessFile randomAccessFile = this.A;
        if (i12 <= i13) {
            randomAccessFile.seek(iO);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - iO;
        randomAccessFile.seek(iO);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i14, i11 - i14);
    }

    public final int I() {
        if (this.C == 0) {
            return 16;
        }
        i iVar = this.E;
        int i10 = iVar.f13027a;
        int i11 = this.D.f13027a;
        return i10 >= i11 ? (i10 - i11) + 4 + iVar.f13028b + 16 : (((i10 + 4) + iVar.f13028b) + this.B) - i11;
    }

    public final int O(int i10) {
        int i11 = this.B;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void S(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.F;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.A;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                Z(i15, iArr[i14], bArr);
                i15 += 4;
                i14++;
            }
        }
    }

    public final void a(byte[] bArr) {
        int iO;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    i(length);
                    boolean zR = r();
                    if (zR) {
                        iO = 16;
                    } else {
                        i iVar = this.E;
                        iO = O(iVar.f13027a + 4 + iVar.f13028b);
                    }
                    i iVar2 = new i(iO, length);
                    Z(0, length, this.F);
                    G(iO, 4, this.F);
                    G(iO + 4, length, bArr);
                    S(this.B, this.C + 1, zR ? iO : this.D.f13027a, iO);
                    this.E = iVar2;
                    this.C++;
                    if (zR) {
                        this.D = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public final synchronized void close() {
        this.A.close();
    }

    public final void i(int i10) throws IOException {
        int i11 = i10 + 4;
        int I = this.B - I();
        if (I >= i11) {
            return;
        }
        int i12 = this.B;
        do {
            I += i12;
            i12 <<= 1;
        } while (I < i11);
        RandomAccessFile randomAccessFile = this.A;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        i iVar = this.E;
        int iO = O(iVar.f13027a + 4 + iVar.f13028b);
        if (iO < this.D.f13027a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.B);
            long j9 = iO - 4;
            if (channel.transferTo(16L, j9, channel) != j9) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.E.f13027a;
        int i14 = this.D.f13027a;
        if (i13 < i14) {
            int i15 = (this.B + i13) - 16;
            S(i12, this.C, i14, i15);
            this.E = new i(i15, this.E.f13028b);
        } else {
            S(i12, this.C, i14, i13);
        }
        this.B = i12;
    }

    public final synchronized void l(k kVar) {
        int iO = this.D.f13027a;
        for (int i10 = 0; i10 < this.C; i10++) {
            i iVarV = v(iO);
            kVar.a(new j(this, iVarV), iVarV.f13028b);
            iO = O(iVarV.f13027a + 4 + iVarV.f13028b);
        }
    }

    public final synchronized boolean r() {
        return this.C == 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.B);
        sb2.append(", size=");
        sb2.append(this.C);
        sb2.append(", first=");
        sb2.append(this.D);
        sb2.append(", last=");
        sb2.append(this.E);
        sb2.append(", element lengths=[");
        try {
            l(new q((Object) sb2, 9, false));
        } catch (IOException e3) {
            G.log(Level.WARNING, "read error", (Throwable) e3);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final i v(int i10) throws IOException {
        if (i10 == 0) {
            return i.f13026c;
        }
        RandomAccessFile randomAccessFile = this.A;
        randomAccessFile.seek(i10);
        return new i(i10, randomAccessFile.readInt());
    }
}
