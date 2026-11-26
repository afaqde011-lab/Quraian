package h7;

import android.media.MediaCodec;

public final class c {

    public byte[] f6608a;

    public byte[] f6609b;

    public int f6610c;

    public int[] f6611d;

    public int[] f6612e;

    public int f6613f;

    public int f6614g;

    public int f6615h;

    public final MediaCodec.CryptoInfo f6616i;

    public final b f6617j;

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f6616i = cryptoInfo;
        b bVar = new b();
        bVar.A = cryptoInfo;
        bVar.B = new MediaCodec.CryptoInfo.Pattern(0, 0);
        this.f6617j = bVar;
    }
}
