package x7;

import android.os.SystemClock;
import com.google.android.gms.cast.Cast;
import g4.c;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;

public abstract class b {

    public static final Object f16472a = new Object();

    public static final Object f16473b = new Object();

    public static boolean f16474c;

    public static long f16475d;

    public static long a() {
        byte[] bArr;
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            Object obj = f16473b;
            synchronized (obj) {
            }
            datagramSocket.setSoTimeout(1000);
            synchronized (obj) {
            }
            InetAddress[] allByName = InetAddress.getAllByName("time.android.com");
            int length = allByName.length;
            byte b7 = 0;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr2 = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr2, 48, allByName[i10], 123);
                bArr2[b7] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jCurrentTimeMillis == 0) {
                    Arrays.fill(bArr2, 40, 48, b7);
                    bArr = bArr2;
                } else {
                    long j9 = jCurrentTimeMillis / 1000;
                    long j10 = jCurrentTimeMillis - (j9 * 1000);
                    long j11 = j9 + 2208988800L;
                    bArr = bArr2;
                    bArr[40] = (byte) (j11 >> 24);
                    bArr[41] = (byte) (j11 >> 16);
                    bArr[42] = (byte) (j11 >> 8);
                    bArr[43] = (byte) j11;
                    long j12 = (j10 * 4294967296L) / 1000;
                    bArr[44] = (byte) (j12 >> 24);
                    bArr[45] = (byte) (j12 >> 16);
                    bArr[46] = (byte) (j12 >> 8);
                    bArr[47] = (byte) (Math.random() * 255.0d);
                }
                datagramSocket.send(datagramPacket);
                byte[] bArr3 = bArr;
                try {
                    datagramSocket.receive(new DatagramPacket(bArr3, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j13 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                    byte b10 = bArr3[b7];
                    int i12 = bArr3[1] & 255;
                    long jD = d(24, bArr3);
                    long jD2 = d(32, bArr3);
                    long jD3 = d(40, bArr3);
                    b((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jD3);
                    long j14 = (j13 + (((jD3 - j13) + (jD2 - jD)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j14;
                } catch (SocketTimeoutException e3) {
                    if (socketTimeoutException == 0) {
                        socketTimeoutException = e3;
                    } else {
                        SocketTimeoutException socketTimeoutException2 = socketTimeoutException;
                        socketTimeoutException2.addSuppressed(e3);
                        socketTimeoutException = socketTimeoutException2;
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        socketTimeoutException.getClass();
                        throw socketTimeoutException;
                    }
                    i10++;
                    i11 = i13;
                    b7 = b7;
                }
            }
            socketTimeoutException.getClass();
            throw socketTimeoutException;
        } catch (Throwable th2) {
            try {
                datagramSocket.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public static void b(byte b7, byte b10, int i10, long j9) throws IOException {
        if (b7 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException(c.f(b10, "SNTP: Untrusted mode: "));
        }
        if (i10 == 0 || i10 > 15) {
            throw new IOException(c.f(i10, "SNTP: Untrusted stratum: "));
        }
        if (j9 == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static long c(int i10, byte[] bArr) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            i11 = (i11 & 127) + Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i12 & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            i12 = (i12 & 127) + Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i13 & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            i13 = (i13 & 127) + Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i14 & Cast.MAX_NAMESPACE_LENGTH) == 128) {
            i14 = (i14 & 127) + Cast.MAX_NAMESPACE_LENGTH;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    public static long d(int i10, byte[] bArr) {
        long jC = c(i10, bArr);
        long jC2 = c(i10 + 4, bArr);
        if (jC == 0 && jC2 == 0) {
            return 0L;
        }
        return ((jC2 * 1000) / 4294967296L) + ((jC - 2208988800L) * 1000);
    }
}
