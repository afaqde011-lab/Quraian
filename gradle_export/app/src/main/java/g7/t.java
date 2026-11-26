package g7;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

public final class t extends b {
    public final int E;
    public final byte[] F;
    public final DatagramPacket G;
    public Uri H;
    public DatagramSocket I;
    public MulticastSocket J;
    public InetAddress K;
    public boolean L;
    public int M;

    public t() {
        super(true);
        this.E = 8000;
        byte[] bArr = new byte[CastStatusCodes.AUTHENTICATION_FAILED];
        this.F = bArr;
        this.G = new DatagramPacket(bArr, 0, CastStatusCodes.AUTHENTICATION_FAILED);
    }

    @Override
    public final void close() {
        this.H = null;
        MulticastSocket multicastSocket = this.J;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.K;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.J = null;
        }
        DatagramSocket datagramSocket = this.I;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.I = null;
        }
        this.K = null;
        this.M = 0;
        if (this.L) {
            this.L = false;
            c();
        }
    }

    @Override
    public final long p(j jVar) throws UdpDataSource$UdpDataSourceException {
        Uri uri = jVar.f6218a;
        this.H = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.H.getPort();
        e();
        try {
            this.K = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.K, port);
            if (this.K.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.J = multicastSocket;
                multicastSocket.joinGroup(this.K);
                this.I = this.J;
            } else {
                this.I = new DatagramSocket(inetSocketAddress);
            }
            this.I.setSoTimeout(this.E);
            this.L = true;
            h(jVar);
            return -1L;
        } catch (IOException e3) {
            throw new UdpDataSource$UdpDataSourceException(CastStatusCodes.INVALID_REQUEST, e3);
        } catch (SecurityException e10) {
            throw new UdpDataSource$UdpDataSourceException(CastStatusCodes.MESSAGE_TOO_LARGE, e10);
        }
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws UdpDataSource$UdpDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.M;
        DatagramPacket datagramPacket = this.G;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.I;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.M = length;
                b(length);
            } catch (SocketTimeoutException e3) {
                throw new UdpDataSource$UdpDataSourceException(CastStatusCodes.CANCELED, e3);
            } catch (IOException e10) {
                throw new UdpDataSource$UdpDataSourceException(CastStatusCodes.INVALID_REQUEST, e10);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.M;
        int iMin = Math.min(i13, i11);
        System.arraycopy(this.F, length2 - i13, bArr, i10, iMin);
        this.M -= iMin;
        return iMin;
    }

    @Override
    public final Uri y() {
        return this.H;
    }
}
