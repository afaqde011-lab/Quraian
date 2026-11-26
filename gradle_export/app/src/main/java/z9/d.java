package z9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

public final class d {

    public final int f17326a;

    public final int f17327b;

    public final long f17328c;

    public final long f17329d;

    public d(long j9, int i10, int i11, long j10) {
        this.f17326a = i10;
        this.f17327b = i11;
        this.f17328c = j9;
        this.f17329d = j10;
    }

    public static d a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            d dVar = new d(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return dVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f17326a);
            dataOutputStream.writeInt(this.f17327b);
            dataOutputStream.writeLong(this.f17328c);
            dataOutputStream.writeLong(this.f17329d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            if (this.f17327b == dVar.f17327b && this.f17328c == dVar.f17328c && this.f17326a == dVar.f17326a && this.f17329d == dVar.f17329d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17327b), Long.valueOf(this.f17328c), Integer.valueOf(this.f17326a), Long.valueOf(this.f17329d));
    }
}
