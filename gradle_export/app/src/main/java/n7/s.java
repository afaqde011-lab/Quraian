package n7;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import e7.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import k9.b3;
import ta.c0;

public final class s implements p {
    public static final b3 D = new b3(18);
    public final UUID A;
    public final MediaDrm B;
    public int C;

    public s(UUID uuid) {
        uuid.getClass();
        c0.r("Use C.CLEARKEY_UUID instead", !androidx.media3.common.h.f1215b.equals(uuid));
        this.A = uuid;
        MediaDrm mediaDrm = new MediaDrm(uuid);
        this.B = mediaDrm;
        this.C = 1;
        if (androidx.media3.common.h.f1217d.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override
    public final boolean C(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        MediaCrypto mediaCrypto;
        Throwable th2;
        UUID uuid = androidx.media3.common.h.f1217d;
        UUID uuid2 = this.A;
        boolean zEquals2 = uuid2.equals(uuid);
        MediaDrm mediaDrm = this.B;
        if (zEquals2) {
            String propertyString = mediaDrm.getPropertyString("version");
            zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
        } else {
            zEquals = uuid2.equals(androidx.media3.common.h.f1216c);
        }
        if (zEquals) {
            return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto(uuid2, bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
                    mediaCrypto.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto2 = mediaCrypto;
                    boolean z10 = !uuid2.equals(androidx.media3.common.h.f1216c);
                    if (mediaCrypto2 != null) {
                        mediaCrypto2.release();
                    }
                    return z10;
                } catch (Throwable th3) {
                    th2 = th3;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th2;
                }
            } catch (MediaCryptoException unused2) {
            }
        } catch (Throwable th4) {
            mediaCrypto = mediaCrypto2;
            th2 = th4;
        }
    }

    @Override
    public final Map e(byte[] bArr) {
        return this.B.queryKeyStatus(bArr);
    }

    @Override
    public final o g() {
        MediaDrm.ProvisionRequest provisionRequest = this.B.getProvisionRequest();
        return new o(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override
    public final h7.a j(byte[] bArr) {
        return new q(this.A, bArr);
    }

    @Override
    public final byte[] k() {
        return this.B.openSession();
    }

    @Override
    public final void l(final gi.c cVar) {
        this.B.setOnEventListener(new MediaDrm.OnEventListener() {
            @Override
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                s sVar = this.f11181a;
                gi.c cVar2 = cVar;
                sVar.getClass();
                androidx.mediarouter.app.d dVar = ((d) cVar2.B).f11165x;
                dVar.getClass();
                dVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }

    @Override
    public final void m(byte[] bArr, byte[] bArr2) {
        this.B.restoreKeys(bArr, bArr2);
    }

    @Override
    public final void n(byte[] bArr) {
        this.B.closeSession(bArr);
    }

    @Override
    public final void p(byte[] bArr, j7.j jVar) {
        try {
            MediaDrm mediaDrm = this.B;
            LogSessionId logSessionIdA = jVar.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            playbackComponent.setLogSessionId(logSessionIdA);
        } catch (UnsupportedOperationException unused) {
            e7.a.m("FrameworkMediaDrm", "setLogSessionId failed.");
        }
    }

    @Override
    public final byte[] r(byte[] bArr, byte[] bArr2) {
        androidx.media3.common.h.f1216c.equals(this.A);
        return this.B.provideKeyResponse(bArr, bArr2);
    }

    @Override
    public final synchronized void release() {
        int i10 = this.C - 1;
        this.C = i10;
        if (i10 == 0) {
            this.B.release();
        }
    }

    @Override
    public final void s(byte[] bArr) throws DeniedByServerException {
        this.B.provideProvisionResponse(bArr);
    }

    @Override
    public final n t(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        byte[] bArr2;
        String str;
        int i11;
        androidx.media3.common.n nVar;
        androidx.media3.common.n nVar2;
        c50.h hVarI;
        int i12;
        byte[] bArrJ;
        UUID uuid = this.A;
        androidx.media3.common.n nVar3 = null;
        if (list != null) {
            if (!androidx.media3.common.h.f1217d.equals(uuid)) {
                nVar = (androidx.media3.common.n) list.get(0);
            } else if (list.size() <= 1) {
                i11 = 0;
                while (true) {
                    if (i11 < list.size()) {
                        nVar = (androidx.media3.common.n) list.get(0);
                        break;
                    }
                    nVar2 = (androidx.media3.common.n) list.get(i11);
                    byte[] bArr3 = nVar2.E;
                    bArr3.getClass();
                    hVarI = u8.p.i(bArr3);
                    if (hVarI == null) {
                        i12 = -1;
                    } else {
                        i12 = hVarI.B;
                    }
                    if (i12 == 1) {
                        nVar = nVar2;
                        break;
                    }
                    i11++;
                }
            } else {
                androidx.media3.common.n nVar4 = (androidx.media3.common.n) list.get(0);
                int i13 = 0;
                int length = 0;
                while (true) {
                    if (i13 < list.size()) {
                        androidx.media3.common.n nVar5 = (androidx.media3.common.n) list.get(i13);
                        byte[] bArr4 = nVar5.E;
                        bArr4.getClass();
                        if (Objects.equals(nVar5.D, nVar4.D) && Objects.equals(nVar5.C, nVar4.C) && u8.p.i(bArr4) != null) {
                            length += bArr4.length;
                            i13++;
                        } else {
                            i11 = 0;
                            while (true) {
                                if (i11 < list.size()) {
                                    nVar = (androidx.media3.common.n) list.get(0);
                                    break;
                                }
                                nVar2 = (androidx.media3.common.n) list.get(i11);
                                byte[] bArr5 = nVar2.E;
                                bArr5.getClass();
                                hVarI = u8.p.i(bArr5);
                                if (hVarI == null) {
                                    i12 = -1;
                                } else {
                                    i12 = hVarI.B;
                                }
                                if (i12 == 1) {
                                    nVar = nVar2;
                                    break;
                                }
                                i11++;
                            }
                        }
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i14 = 0;
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            byte[] bArr7 = ((androidx.media3.common.n) list.get(i15)).E;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i14, length2);
                            i14 += length2;
                        }
                        nVar = new androidx.media3.common.n(nVar4.B, nVar4.C, nVar4.D, bArr6);
                    }
                }
            }
            byte[] bArrA = nVar.E;
            bArrA.getClass();
            UUID uuid2 = androidx.media3.common.h.f1218e;
            if (uuid2.equals(uuid)) {
                byte[] bArrJ2 = u8.p.j(uuid, bArrA);
                if (bArrJ2 != null) {
                    bArrA = bArrJ2;
                }
                u uVar = new u(bArrA);
                int iO = uVar.o();
                short sQ = uVar.q();
                short sQ2 = uVar.q();
                if (sQ == 1 && sQ2 == 1) {
                    short sQ3 = uVar.q();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strY = uVar.y(sQ3, charset);
                    if (!strY.contains("<LA_URL>")) {
                        int iIndexOf = strY.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            e7.a.m("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strY.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strY.substring(iIndexOf);
                        int i16 = iO + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i16);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i16);
                        byteBufferAllocate.putShort(sQ);
                        byteBufferAllocate.putShort(sQ2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrA = byteBufferAllocate.array();
                    }
                } else {
                    e7.a.h("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrA = u8.p.a(uuid2, null, bArrA);
            }
            if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
                String str3 = Build.MODEL;
                if ((!"AFTB".equals(str3) && !"AFTS".equals(str3) && !"AFTM".equals(str3) && !"AFTT".equals(str3)) || (bArrJ = u8.p.j(uuid, bArrA)) == null) {
                    bArrJ = bArrA;
                }
            } else {
                bArrJ = bArrA;
            }
            bArr2 = bArrJ;
            str = nVar.D;
            nVar3 = nVar;
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.B.getKeyRequest(bArr, bArr2, str, i10, map);
        byte[] data = keyRequest.getData();
        androidx.media3.common.h.f1216c.equals(uuid);
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = RuntimeVersion.SUFFIX;
        } else if ("https://default.url".equals(defaultUrl)) {
            String propertyString = this.B.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = RuntimeVersion.SUFFIX;
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && nVar3 != null) {
            String str4 = nVar3.C;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        keyRequest.getRequestType();
        return new n(defaultUrl, data);
    }

    @Override
    public final int u() {
        return 2;
    }
}
