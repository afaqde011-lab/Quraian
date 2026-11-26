package k9;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.LegacyConversions$ConversionException;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.internal.measurement.b5;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class z0 implements t {

    public final Context f9557a;

    public final u f9558b;

    public final f4 f9559c;

    public final e7.p f9560d;

    public final y0 f9561e;

    public final e7.c f9562f;

    public final Bundle f9563g;

    public final long f9564h;

    public h7.b f9565i;

    public l9.h f9566j;

    public boolean f9567k;
    public boolean l;
    public ba.v0 m = new ba.v0();

    public ba.v0 f9568n = new ba.v0();

    public boolean f9569o;

    public sd.y1 f9570p;

    public long f9571q;

    public long f9572r;

    public z0(Context context, u uVar, f4 f4Var, Bundle bundle, Looper looper, e7.c cVar) {
        sd.y1 y1Var = new sd.y1();
        y1Var.f14132a = t3.H.l(x3.f9542c);
        y1Var.f14133b = a4.f9211b;
        y1Var.f14134c = androidx.media3.common.b1.f1101b;
        y1Var.f14135d = fh.d2.E;
        y1Var.f14136e = Bundle.EMPTY;
        y1Var.f14137f = null;
        this.f9570p = y1Var;
        this.f9560d = new e7.p(looper, e7.b0.f5117a, new w0(this));
        this.f9557a = context;
        this.f9558b = uVar;
        this.f9561e = new y0(this, looper);
        this.f9559c = f4Var;
        this.f9563g = bundle;
        this.f9562f = cVar;
        this.f9564h = 100L;
        this.f9571q = -9223372036854775807L;
        this.f9572r = -9223372036854775807L;
        fh.d2 d2Var = fh.d2.E;
    }

    public static List g(ArrayList arrayList) {
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        h1.l lVar = q3.f9407a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static l9.j0 h(l9.j0 j0Var) {
        if (j0Var == null) {
            return null;
        }
        if (j0Var.D > 0.0f) {
            return j0Var;
        }
        e7.a.m("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j9 = j0Var.C;
        long j10 = j0Var.E;
        int i10 = j0Var.F;
        CharSequence charSequence = j0Var.G;
        AbstractCollection abstractCollection = j0Var.I;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new l9.j0(j0Var.A, j0Var.B, j9, 1.0f, j10, i10, charSequence, j0Var.H, arrayList, j0Var.J, j0Var.K);
    }

    public static androidx.media3.common.e1 i(int i10, androidx.media3.common.q0 q0Var, long j9, boolean z10) {
        return new androidx.media3.common.e1(null, i10, q0Var, null, i10, j9, j9, z10 ? 0 : -1, z10 ? 0 : -1);
    }

    @Override
    public final a4 a() {
        return (a4) this.f9570p.f14133b;
    }

    @Override
    public final void addListener(androidx.media3.common.d1 d1Var) {
        this.f9560d.a(d1Var);
    }

    @Override
    public final void addMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        addMediaItems(i10, Collections.singletonList(q0Var));
    }

    @Override
    public final void addMediaItem(androidx.media3.common.q0 q0Var) {
        addMediaItems(Integer.MAX_VALUE, Collections.singletonList(q0Var));
    }

    @Override
    public final void addMediaItems(int i10, List list) {
        ta.c0.s(i10 >= 0);
        if (list.isEmpty()) {
            return;
        }
        x3 x3Var = (x3) ((t3) this.f9570p.f14132a).f9504j;
        if (x3Var.isEmpty()) {
            setMediaItems(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i10, getCurrentTimeline().getWindowCount());
        x3 x3VarA = x3Var.a(iMin, list);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int size = list.size();
        if (currentMediaItemIndex >= iMin) {
            currentMediaItemIndex += size;
        }
        t3 t3VarM = ((t3) this.f9570p.f14132a).m(x3VarA, currentMediaItemIndex);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarM, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (l()) {
            f(iMin, list);
        }
    }

    @Override
    public final void addMediaItems(List list) {
        addMediaItems(Integer.MAX_VALUE, list);
    }

    @Override
    public final fh.t0 b() {
        return (fh.t0) this.f9570p.f14135d;
    }

    @Override
    public final kh.v c(z3 z3Var) {
        Bundle bundle = z3Var.f9580c;
        Bundle bundle2 = Bundle.EMPTY;
        if (this.f9565i == null) {
            return b5.x(new d4(-100));
        }
        if (!bundle2.isEmpty()) {
            if (bundle.isEmpty()) {
                bundle = bundle2;
            } else {
                Bundle bundle3 = new Bundle(bundle);
                bundle3.putAll(bundle2);
                bundle = bundle3;
            }
        }
        this.f9565i.s().Q0(z3Var.f9579b, bundle);
        return b5.x(new d4(0));
    }

    @Override
    public final void clearMediaItems() {
        removeMediaItems(0, Integer.MAX_VALUE);
    }

    @Override
    public final void clearVideoSurface() {
        e7.a.m("MCImplLegacy", "Session doesn't support clearing Surface");
    }

    @Override
    public final void clearVideoSurface(Surface surface) {
        e7.a.m("MCImplLegacy", "Session doesn't support clearing Surface");
    }

    @Override
    public final void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        e7.a.m("MCImplLegacy", "Session doesn't support clearing SurfaceHolder");
    }

    @Override
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        e7.a.m("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override
    public final void clearVideoTextureView(TextureView textureView) {
        e7.a.m("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    @Override
    public final void d() {
        f4 f4Var = this.f9559c;
        int type = f4Var.f9293a.getType();
        u uVar = this.f9558b;
        if (type != 0) {
            uVar.b(new v0(this, 1));
            return;
        }
        Object objC = f4Var.f9293a.c();
        objC.getClass();
        uVar.b(new ji.a(this, (l9.e0) objC, 10));
        uVar.f9523f.postDelayed(new v0(this, 0), 500L);
    }

    @Override
    public final void decreaseDeviceVolume() {
        decreaseDeviceVolume(1);
    }

    @Override
    public final void decreaseDeviceVolume(int i10) {
        int deviceVolume = getDeviceVolume() - 1;
        if (deviceVolume >= getDeviceInfo().f1319b) {
            t3 t3VarC = ((t3) this.f9570p.f14132a).c(deviceVolume, isDeviceMuted());
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarC, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        ((l9.v) this.f9565i.A).f10183a.adjustVolume(-1, i10);
    }

    @Override
    public final Bundle e() {
        return this.f9563g;
    }

    public final void f(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        i7.w0 w0Var = new i7.w0(this, new AtomicInteger(0), list, arrayList, i10, 1);
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = ((androidx.media3.common.q0) list.get(i11)).f1416d.f1637k;
            if (bArr == null) {
                arrayList.add(null);
                w0Var.run();
            } else {
                kh.v vVarO0 = this.f9562f.o0(bArr);
                arrayList.add(vVarO0);
                Handler handler = this.f9558b.f9523f;
                Objects.requireNonNull(handler);
                vVarO0.a(w0Var, new androidx.media3.cast.s(handler));
            }
        }
    }

    @Override
    public final androidx.media3.common.d getAudioAttributes() {
        return ((t3) this.f9570p.f14132a).f9509q;
    }

    @Override
    public final int getAudioSessionId() {
        return ((t3) this.f9570p.f14132a).f9508p;
    }

    @Override
    public final androidx.media3.common.b1 getAvailableCommands() {
        return (androidx.media3.common.b1) this.f9570p.f14134c;
    }

    @Override
    public final int getBufferedPercentage() {
        return ((t3) this.f9570p.f14132a).f9497c.f9258f;
    }

    @Override
    public final long getBufferedPosition() {
        return ((t3) this.f9570p.f14132a).f9497c.f9257e;
    }

    @Override
    public final long getContentBufferedPosition() {
        return getBufferedPosition();
    }

    @Override
    public final long getContentDuration() {
        return getDuration();
    }

    @Override
    public final long getContentPosition() {
        return getCurrentPosition();
    }

    @Override
    public final int getCurrentAdGroupIndex() {
        return -1;
    }

    @Override
    public final int getCurrentAdIndexInAdGroup() {
        return -1;
    }

    @Override
    public final d7.c getCurrentCues() {
        e7.a.m("MCImplLegacy", "Session doesn't support getting Cue");
        return d7.c.f4764d;
    }

    @Override
    public final long getCurrentLiveOffset() {
        return -9223372036854775807L;
    }

    @Override
    public final int getCurrentMediaItemIndex() {
        return ((t3) this.f9570p.f14132a).f9497c.f9253a.f1183b;
    }

    @Override
    public final int getCurrentPeriodIndex() {
        return getCurrentMediaItemIndex();
    }

    @Override
    public final long getCurrentPosition() {
        long jC = q3.c((t3) this.f9570p.f14132a, this.f9571q, this.f9572r, this.f9558b.f9524g);
        this.f9571q = jC;
        return jC;
    }

    @Override
    public final androidx.media3.common.k2 getCurrentTimeline() {
        return ((t3) this.f9570p.f14132a).f9504j;
    }

    @Override
    public final androidx.media3.common.s2 getCurrentTracks() {
        return androidx.media3.common.s2.f1554b;
    }

    @Override
    public final androidx.media3.common.l getDeviceInfo() {
        return ((t3) this.f9570p.f14132a).f9511s;
    }

    @Override
    public final int getDeviceVolume() {
        t3 t3Var = (t3) this.f9570p.f14132a;
        if (t3Var.f9511s.f1318a == 1) {
            return t3Var.f9512t;
        }
        h7.b bVar = this.f9565i;
        if (bVar == null) {
            return 0;
        }
        ba.n1 n1VarQ = bVar.q();
        fh.e1 e1Var = p.f9381a;
        if (n1VarQ == null) {
            return 0;
        }
        return n1VarQ.f2360d;
    }

    @Override
    public final long getDuration() {
        return ((t3) this.f9570p.f14132a).f9497c.f9256d;
    }

    @Override
    public final long getMaxSeekToPreviousPosition() {
        return ((t3) this.f9570p.f14132a).E;
    }

    @Override
    public final androidx.media3.common.t0 getMediaMetadata() {
        androidx.media3.common.q0 q0VarS = ((t3) this.f9570p.f14132a).s();
        return q0VarS == null ? androidx.media3.common.t0.K : q0VarS.f1416d;
    }

    @Override
    public final int getNextMediaItemIndex() {
        return -1;
    }

    @Override
    public final boolean getPlayWhenReady() {
        return ((t3) this.f9570p.f14132a).f9514v;
    }

    @Override
    public final androidx.media3.common.z0 getPlaybackParameters() {
        return ((t3) this.f9570p.f14132a).f9501g;
    }

    @Override
    public final int getPlaybackState() {
        return ((t3) this.f9570p.f14132a).A;
    }

    @Override
    public final int getPlaybackSuppressionReason() {
        return 0;
    }

    @Override
    public final PlaybackException getPlayerError() {
        return ((t3) this.f9570p.f14132a).f9495a;
    }

    @Override
    public final androidx.media3.common.t0 getPlaylistMetadata() {
        return ((t3) this.f9570p.f14132a).m;
    }

    @Override
    public final int getPreviousMediaItemIndex() {
        return -1;
    }

    @Override
    public final int getRepeatMode() {
        return ((t3) this.f9570p.f14132a).f9502h;
    }

    @Override
    public final long getSeekBackIncrement() {
        return ((t3) this.f9570p.f14132a).C;
    }

    @Override
    public final long getSeekForwardIncrement() {
        return ((t3) this.f9570p.f14132a).D;
    }

    @Override
    public final boolean getShuffleModeEnabled() {
        return ((t3) this.f9570p.f14132a).f9503i;
    }

    @Override
    public final e7.v getSurfaceSize() {
        e7.a.m("MCImplLegacy", "Session doesn't support getting VideoSurfaceSize");
        return e7.v.f5185c;
    }

    @Override
    public final long getTotalBufferedDuration() {
        return ((t3) this.f9570p.f14132a).f9497c.f9259g;
    }

    @Override
    public final androidx.media3.common.q2 getTrackSelectionParameters() {
        return androidx.media3.common.q2.J;
    }

    @Override
    public final androidx.media3.common.w2 getVideoSize() {
        e7.a.m("MCImplLegacy", "Session doesn't support getting VideoSize");
        return androidx.media3.common.w2.f1669d;
    }

    @Override
    public final float getVolume() {
        return 1.0f;
    }

    @Override
    public final boolean hasNextMediaItem() {
        return this.l;
    }

    @Override
    public final boolean hasPreviousMediaItem() {
        return this.l;
    }

    @Override
    public final void increaseDeviceVolume() {
        increaseDeviceVolume(1);
    }

    @Override
    public final void increaseDeviceVolume(int i10) {
        int deviceVolume = getDeviceVolume();
        int i11 = getDeviceInfo().f1320c;
        if (i11 == 0 || deviceVolume + 1 <= i11) {
            t3 t3VarC = ((t3) this.f9570p.f14132a).c(deviceVolume + 1, isDeviceMuted());
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarC, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        ((l9.v) this.f9565i.A).f10183a.adjustVolume(1, i10);
    }

    @Override
    public final boolean isConnected() {
        return this.l;
    }

    @Override
    public final boolean isDeviceMuted() {
        t3 t3Var = (t3) this.f9570p.f14132a;
        if (t3Var.f9511s.f1318a == 1) {
            return t3Var.f9513u;
        }
        h7.b bVar = this.f9565i;
        if (bVar == null) {
            return false;
        }
        ba.n1 n1VarQ = bVar.q();
        fh.e1 e1Var = p.f9381a;
        return n1VarQ != null && n1VarQ.f2360d == 0;
    }

    @Override
    public final boolean isLoading() {
        return false;
    }

    @Override
    public final boolean isPlaying() {
        return ((t3) this.f9570p.f14132a).f9516x;
    }

    @Override
    public final boolean isPlayingAd() {
        return ((t3) this.f9570p.f14132a).f9497c.f9254b;
    }

    public final void j(boolean z10, ba.v0 v0Var) {
        boolean z11;
        ba.n1 n1Var;
        boolean z12;
        int i10;
        x3 x3Var;
        long j9;
        long j10;
        int windowCount;
        int i11;
        androidx.media3.common.t0 t0VarL;
        androidx.media3.common.q0 q0Var;
        androidx.media3.common.q0 q0VarJ;
        fh.t0 t0Var;
        int size;
        w3 w3Var;
        boolean z13;
        androidx.media3.common.t0 t0Var2;
        ba.n1 n1Var2;
        int i12;
        String str;
        boolean z14;
        long j11;
        int i13;
        androidx.media3.common.b1 b1Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        androidx.media3.common.t0 t0Var3;
        int iS;
        boolean zU;
        HashSet<z3> hashSet;
        fh.d2 d2Var;
        int i14;
        Object[] objArrCopyOf;
        Iterator it;
        int i15;
        int i16;
        boolean z15;
        fh.t0 t0VarK;
        Bundle bundle;
        int i17;
        a aVar;
        Bundle bundle2;
        String string;
        int iB;
        Uri uri;
        String scheme;
        a4 a4Var;
        Bundle bundle3;
        int i18;
        b4 b4Var;
        boolean z16;
        androidx.media3.common.z0 z0Var;
        ba.n1 n1Var3;
        androidx.media3.common.d dVar;
        boolean z17;
        int i19;
        int i20;
        long jD;
        boolean z18;
        boolean z19;
        int i21;
        boolean z20;
        androidx.media3.common.l lVarB;
        int i22;
        boolean z21;
        x3 x3Var2;
        androidx.media3.common.q0 q0Var2;
        t3 t3Var;
        ba.v0 v0Var2;
        sd.y1 y1Var;
        long j12;
        Integer num;
        boolean zIsEmpty;
        androidx.media3.common.q0 q0VarS;
        w3 w3Var2;
        int i23;
        fh.t0 t0Var4;
        boolean z22;
        boolean z23;
        Integer num2;
        long jC;
        long jC2;
        Integer num3;
        boolean z24;
        int i24;
        l9.d0 d0Var;
        Bitmap bitmap;
        l9.y yVar;
        Bitmap bitmapB;
        if (this.f9567k || !this.l) {
            return;
        }
        ba.v0 v0Var3 = this.m;
        sd.y1 y1Var2 = this.f9570p;
        String packageName = ((l9.v) this.f9565i.A).f10183a.getPackageName();
        long flags = ((l9.v) this.f9565i.A).f10183a.getFlags();
        boolean z25 = ((l9.v) this.f9565i.A).f10187e.a() != null;
        int ratingType = ((l9.v) this.f9565i.A).f10183a.getRatingType();
        u uVar = this.f9558b;
        long j13 = uVar.f9524g;
        boolean z26 = this.f9569o;
        l9.y yVar2 = (l9.y) v0Var3.f2442f;
        l9.j0 j0Var = (l9.j0) v0Var3.f2441e;
        List list = (List) v0Var3.f2437a;
        if (yVar2 == null || (yVar = (l9.y) v0Var.f2442f) == null || yVar2.C == null || (bitmapB = yVar.b()) == null) {
            z11 = z25;
        } else {
            z11 = z25;
            Bitmap bitmapB2 = yVar2.b();
            if (bitmapB2 != null && bitmapB.sameAs(bitmapB2)) {
                yVar.C = yVar2.C;
            }
        }
        List list2 = (List) v0Var.f2437a;
        Bundle bundle4 = (Bundle) v0Var.f2444h;
        l9.j0 j0Var2 = (l9.j0) v0Var.f2441e;
        l9.y yVar3 = (l9.y) v0Var.f2442f;
        ba.n1 n1Var4 = (ba.n1) v0Var.f2440d;
        if (list != list2) {
            HashMap map = new HashMap();
            int i25 = 0;
            while (i25 < list.size()) {
                l9.d0 d0Var2 = (l9.d0) list.get(i25);
                ba.n1 n1Var5 = n1Var4;
                if (d0Var2.A.E != null) {
                    map.put(Long.valueOf(d0Var2.B), d0Var2);
                }
                i25++;
                n1Var4 = n1Var5;
            }
            n1Var = n1Var4;
            int i26 = 0;
            while (i26 < list2.size()) {
                l9.d0 d0Var3 = (l9.d0) list2.get(i26);
                if (d0Var3.A.E == null || (d0Var = (l9.d0) map.get(Long.valueOf(d0Var3.B))) == null) {
                    i24 = i26;
                } else {
                    l9.x xVar = d0Var3.A;
                    l9.x xVar2 = d0Var.A;
                    xVar.getClass();
                    if (xVar2.F == null || (bitmap = xVar.E) == null) {
                        i24 = i26;
                    } else {
                        i24 = i26;
                        Bitmap bitmap2 = xVar2.E;
                        if (bitmap2 != null && bitmap.sameAs(bitmap2)) {
                            xVar.F = xVar2.F;
                        }
                    }
                }
                i26 = i24 + 1;
            }
        } else {
            n1Var = n1Var4;
        }
        boolean z27 = list != list2;
        if (z27) {
            x3 x3Var3 = x3.f9542c;
            fh.w.g(4, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[4];
            int i27 = 0;
            int i28 = 0;
            while (i28 < list2.size()) {
                l9.d0 d0Var4 = (l9.d0) list2.get(i28);
                fh.e1 e1Var = p.f9381a;
                boolean z28 = z27;
                int i29 = ratingType;
                w3 w3Var3 = new w3(p.k(d0Var4.A), d0Var4.B, -9223372036854775807L);
                int i30 = i27 + 1;
                int iB2 = fh.n0.b(objArrCopyOf2.length, i30);
                if (iB2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                }
                objArrCopyOf2[i27] = w3Var3;
                i28++;
                i27 = i30;
                z27 = z28;
                ratingType = i29;
            }
            z12 = z27;
            i10 = ratingType;
            x3Var = new x3(fh.t0.l(i27, objArrCopyOf2), null);
        } else {
            z12 = z27;
            i10 = ratingType;
            x3 x3Var4 = (x3) ((t3) y1Var2.f14132a).f9504j;
            x3Var = new x3(x3Var4.f9544a, x3Var4.f9545b);
        }
        boolean z29 = ((l9.y) v0Var3.f2442f) != yVar3 || z10;
        long j14 = j0Var == null ? -1L : j0Var.J;
        if (j0Var2 == null) {
            j10 = -1;
            j9 = -1;
        } else {
            j9 = -1;
            j10 = j0Var2.J;
        }
        boolean z30 = j14 != j10 || z10;
        long jD2 = p.d(yVar3);
        if (z29 || z30 || z12) {
            boolean z31 = z29;
            if (list2 == null || j10 == j9) {
                windowCount = -1;
                break;
            }
            long j15 = j10;
            windowCount = 0;
            while (true) {
                if (windowCount >= list2.size()) {
                    windowCount = -1;
                    break;
                } else if (((l9.d0) list2.get(windowCount)).B == j15) {
                    break;
                } else {
                    windowCount++;
                }
            }
            boolean z32 = yVar3 != null;
            if (z32 && z31) {
                i11 = i10;
                t0VarL = p.m(yVar3, i11);
            } else {
                i11 = i10;
                t0VarL = (z32 || !z30) ? ((t3) y1Var2.f14132a).B : windowCount == -1 ? androidx.media3.common.t0.K : p.l(((l9.d0) list2.get(windowCount)).A, i11);
            }
            fh.t0 t0Var5 = x3Var.f9544a;
            x3 x3Var5 = x3Var;
            int i31 = -1;
            if (windowCount != -1) {
                if (windowCount != i31) {
                    t0VarL = t0VarL;
                    x3Var = new x3(t0Var5, null);
                    if (z32) {
                        if (windowCount >= x3Var.getWindowCount()) {
                            q0Var = null;
                        } else {
                            q0Var = x3Var.c(windowCount).f9539a;
                        }
                        q0Var.getClass();
                        q0VarJ = p.j(q0Var.f1413a, yVar3, i11);
                        t0Var = x3Var.f9544a;
                        size = t0Var.size();
                        w3Var = x3Var.f9545b;
                        if (windowCount >= size || (windowCount == t0Var.size() && w3Var != null)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        ta.c0.s(z13);
                        if (windowCount == t0Var.size()) {
                            x3Var = new x3(t0Var, new w3(q0VarJ, -1L, jD2));
                            bundle4 = bundle4;
                        } else {
                            bundle4 = bundle4;
                            long j16 = ((w3) t0Var.get(windowCount)).f9540b;
                            fh.q0 q0Var3 = new fh.q0(4);
                            q0Var3.e(t0Var.subList(0, windowCount));
                            q0Var3.c(new w3(q0VarJ, j16, jD2));
                            q0Var3.e(t0Var.subList(windowCount + 1, t0Var.size()));
                            x3Var = new x3(q0Var3.g(), w3Var);
                        }
                    } else {
                        bundle4 = bundle4;
                    }
                } else {
                    x3Var = x3Var5;
                    windowCount = 0;
                }
            } else if (!z31) {
                i31 = -1;
                if (windowCount != i31) {
                    t0VarL = t0VarL;
                    x3Var = new x3(t0Var5, null);
                    if (z32) {
                        bundle4 = bundle4;
                    } else {
                        if (windowCount >= x3Var.getWindowCount()) {
                            q0Var = null;
                        } else {
                            q0Var = x3Var.c(windowCount).f9539a;
                        }
                        q0Var.getClass();
                        q0VarJ = p.j(q0Var.f1413a, yVar3, i11);
                        t0Var = x3Var.f9544a;
                        size = t0Var.size();
                        w3Var = x3Var.f9545b;
                        if (windowCount >= size) {
                            z13 = true;
                        } else {
                            z13 = true;
                        }
                        ta.c0.s(z13);
                        if (windowCount == t0Var.size()) {
                            x3Var = new x3(t0Var, new w3(q0VarJ, -1L, jD2));
                            bundle4 = bundle4;
                        } else {
                            bundle4 = bundle4;
                            long j17 = ((w3) t0Var.get(windowCount)).f9540b;
                            fh.q0 q0Var4 = new fh.q0(4);
                            q0Var4.e(t0Var.subList(0, windowCount));
                            q0Var4.c(new w3(q0VarJ, j17, jD2));
                            q0Var4.e(t0Var.subList(windowCount + 1, t0Var.size()));
                            x3Var = new x3(q0Var4.g(), w3Var);
                        }
                    }
                } else {
                    x3Var = x3Var5;
                    windowCount = 0;
                }
            } else if (z32) {
                e7.a.m("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                CharSequence charSequence3 = yVar3.A.getCharSequence("android.media.metadata.MEDIA_ID");
                x3Var = new x3(t0Var5, new w3(p.j(charSequence3 != null ? charSequence3.toString() : null, yVar3, i11), -1L, jD2));
                windowCount = x3Var.getWindowCount() - 1;
                t0VarL = t0VarL;
                bundle4 = bundle4;
            } else {
                x3Var = new x3(t0Var5, null);
                windowCount = 0;
            }
            t0Var2 = t0VarL;
        } else {
            t3 t3Var2 = (t3) y1Var2.f14132a;
            windowCount = t3Var2.f9497c.f9253a.f1183b;
            t0Var2 = t3Var2.B;
            bundle4 = bundle4;
        }
        if (n1Var != null) {
            n1Var2 = n1Var;
            i12 = n1Var2.f2358b;
        } else {
            n1Var2 = n1Var;
            i12 = 0;
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        long j18 = j0Var2 == null ? 0L : j0Var2.E;
        if (j0Var2 != null) {
            str = r14;
            switch (j0Var2.A) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    x3Var = x3Var;
                    n1Var2 = n1Var2;
                    z14 = true;
                    break;
                case 7:
                case 8:
                default:
                    break;
            }
            if (p.y(j18, 4L) || z14) {
                j11 = 4;
                if ((p.y(j18, 2L) && z14) || p.y(j18, 512L)) {
                }
                if (p.y(j18, MediaStatus.COMMAND_LIKE)) {
                    qVar.d(2);
                }
                i13 = i12;
                if ((p.y(j18, MediaStatus.COMMAND_DISLIKE) && p.y(j18, MediaStatus.COMMAND_QUEUE_REPEAT_ALL)) || ((p.y(j18, MediaStatus.COMMAND_FOLLOW) && p.y(j18, MediaStatus.COMMAND_QUEUE_REPEAT_ONE)) || (p.y(j18, MediaStatus.COMMAND_UNFOLLOW) && p.y(j18, MediaStatus.COMMAND_PLAYBACK_RATE)))) {
                    qVar.f(31, 2);
                }
                if (p.y(j18, 8L)) {
                    qVar.d(11);
                }
                if (p.y(j18, 64L)) {
                    qVar.d(12);
                }
                if (p.y(j18, 256L)) {
                    qVar.f(5, 4);
                }
                if (p.y(j18, 32L)) {
                    qVar.f(9, 8);
                }
                if (p.y(j18, 16L)) {
                    qVar.f(7, 6);
                }
                if (p.y(j18, 4194304L)) {
                    qVar.d(13);
                }
                if (p.y(j18, 1L)) {
                    qVar.d(3);
                }
                if (i13 == 1) {
                    qVar.f(26, 34);
                } else if (i13 == 2) {
                    qVar.f(26, 34, 25, 33);
                }
                qVar.f(23, 17, 18, 16, 21, 32);
                if ((flags & j11) != 0) {
                    qVar.d(20);
                    if (p.y(j18, MediaStatus.COMMAND_EDIT_TRACKS)) {
                        qVar.d(10);
                    }
                }
                if (z11) {
                    if (p.y(j18, MediaStatus.COMMAND_STREAM_TRANSFER)) {
                        qVar.d(15);
                    }
                    if (p.y(j18, 2097152L)) {
                        qVar.d(14);
                    }
                }
                b1Var = new androidx.media3.common.b1(qVar.g());
                charSequence = (CharSequence) v0Var3.f2443g;
                charSequence2 = (CharSequence) v0Var.f2443g;
                if (charSequence == charSequence2) {
                    t0Var3 = ((t3) y1Var2.f14132a).m;
                } else if (charSequence2 == null) {
                    t0Var3 = androidx.media3.common.t0.K;
                } else {
                    androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
                    s0Var.f1515a = charSequence2;
                    t0Var3 = new androidx.media3.common.t0(s0Var);
                }
                androidx.media3.common.t0 t0Var6 = t0Var3;
                iS = p.s(v0Var.f2438b);
                zU = p.u(v0Var.f2439c);
                if (j0Var == j0Var2 || z26) {
                    hashSet = new HashSet();
                    d2Var = z3.f9573d;
                    for (i14 = 0; i14 < d2Var.D; i14++) {
                        hashSet.add(new z3(((Integer) d2Var.get(i14)).intValue()));
                    }
                    if (!z11) {
                        for (z3 z3Var : hashSet) {
                            if (z3Var.f9578a == 40010) {
                                hashSet.remove(z3Var);
                            }
                        }
                    }
                    if (j0Var2 != null) {
                        for (l9.i0 i0Var : j0Var2.I) {
                            String str2 = i0Var.A;
                            bundle3 = i0Var.D;
                            if (bundle3 == null) {
                                bundle3 = Bundle.EMPTY;
                            }
                            hashSet.add(new z3(str2, bundle3));
                        }
                    }
                    a4 a4Var2 = new a4(hashSet);
                    if (j0Var2 == null) {
                        fh.r0 r0Var = fh.t0.B;
                        i16 = iS;
                        t0VarK = fh.d2.E;
                        z15 = zU;
                    } else {
                        ?? r10 = j0Var2.I;
                        fh.w.g(4, "initialCapacity");
                        objArrCopyOf = new Object[4];
                        it = r10.iterator();
                        i15 = 0;
                        while (it.hasNext()) {
                            l9.i0 i0Var2 = (l9.i0) it.next();
                            String str3 = i0Var2.A;
                            bundle = i0Var2.D;
                            if (bundle != null) {
                                i17 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i17 = 0;
                            }
                            boolean z33 = zU;
                            aVar = new a(i17, i0Var2.C);
                            if (bundle == null) {
                                bundle2 = Bundle.EMPTY;
                            } else {
                                bundle2 = bundle;
                            }
                            aVar.d(new z3(str3, bundle2));
                            aVar.f9201f = i0Var2.B;
                            aVar.f9203h = true;
                            if (bundle != null) {
                                aVar.f9202g = new Bundle(bundle);
                            }
                            if (bundle != null) {
                                string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                            } else {
                                string = null;
                            }
                            if (string != null) {
                                uri = Uri.parse(string);
                                scheme = uri.getScheme();
                                if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                                    aVar.b(uri);
                                }
                            }
                            b bVarA = aVar.a();
                            int i32 = i15 + 1;
                            iB = fh.n0.b(objArrCopyOf.length, i32);
                            if (iB > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                            }
                            objArrCopyOf[i15] = bVarA;
                            i15 = i32;
                            iS = iS;
                            it = it;
                            zU = z33;
                        }
                        i16 = iS;
                        z15 = zU;
                        t0VarK = b.k(fh.t0.l(i15, objArrCopyOf), b1Var, bundle4);
                    }
                    a4Var = a4Var2;
                } else {
                    a4Var = (a4) y1Var2.f14133b;
                    t0VarK = (fh.t0) y1Var2.f14135d;
                    i16 = iS;
                    z15 = zU;
                }
                Context context = this.f9557a;
                PlaybackException playbackExceptionO = p.o(j0Var2, context);
                if (j0Var2 == null) {
                    b4Var = null;
                } else {
                    i18 = j0Var2.A;
                    int i33 = j0Var2.F;
                    CharSequence charSequence4 = j0Var2.G;
                    Bundle bundle5 = j0Var2.K;
                    if (i18 != 7 || i33 == 0) {
                        b4Var = null;
                    } else {
                        int iT = p.t(i33);
                        String string2 = charSequence4 != null ? charSequence4.toString() : p.x(context, iT);
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        b4Var = new b4(string2, iT, bundle5);
                    }
                }
                long jC3 = p.c(j0Var2, yVar3, j13);
                long jB = p.b(j0Var2, yVar3, j13);
                a4 a4Var3 = a4Var;
                int iB3 = q3.b(p.b(j0Var2, yVar3, j13), p.d(yVar3));
                long jB2 = p.b(j0Var2, yVar3, j13) - p.c(j0Var2, yVar3, j13);
                if (yVar3 == null && yVar3.a("android.media.metadata.ADVERTISEMENT") != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (j0Var2 == null) {
                    z0Var = androidx.media3.common.z0.f1685d;
                } else {
                    z0Var = new androidx.media3.common.z0(j0Var2.D);
                }
                if (n1Var2 == null) {
                    dVar = androidx.media3.common.d.f1142i;
                    n1Var3 = n1Var2;
                } else {
                    n1Var3 = n1Var2;
                    dVar = (androidx.media3.common.d) n1Var3.f2361e;
                }
                if (j0Var2 != null) {
                    switch (j0Var2.A) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            z17 = true;
                            break;
                        case 7:
                        case 8:
                        default:
                            z17 = false;
                            break;
                    }
                } else {
                    z17 = false;
                }
                if (j0Var2 == null) {
                    z0Var = z0Var;
                    i19 = 1;
                } else {
                    try {
                        i20 = j0Var2.A;
                        jD = p.d(yVar3);
                        if (jD == -9223372036854775807L && p.c(j0Var2, yVar3, j13) >= jD) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        switch (i20) {
                            case 0:
                            case 7:
                            case 8:
                                z0Var = z0Var;
                                i19 = 1;
                                break;
                            case 1:
                                z0Var = z0Var;
                                if (z18) {
                                    i19 = 4;
                                } else {
                                    i19 = 1;
                                }
                                break;
                            case 2:
                                z0Var = z0Var;
                                if (z18) {
                                    i19 = 4;
                                } else {
                                    i19 = 3;
                                }
                                break;
                            case 3:
                                z0Var = z0Var;
                                i19 = 3;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                z0Var = z0Var;
                                i19 = 2;
                                break;
                            default:
                                try {
                                    throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i20);
                                } catch (LegacyConversions$ConversionException unused) {
                                    e7.a.d(str, "Received invalid playback state " + j0Var2.A + " from package " + packageName + ". Keeping the previous state.");
                                    i19 = ((t3) y1Var2.f14132a).A;
                                    int i34 = i19;
                                    if (j0Var2 == null) {
                                        z19 = false;
                                    } else {
                                        z19 = true;
                                    }
                                    if (n1Var3 == null) {
                                        lVarB = androidx.media3.common.l.f1313e;
                                    } else {
                                        if (n1Var3.f2357a == 2) {
                                            i21 = 1;
                                        } else {
                                            i21 = 0;
                                        }
                                        androidx.media3.common.k kVar = new androidx.media3.common.k(i21);
                                        kVar.f1300d = n1Var3.f2359c;
                                        String str4 = (String) n1Var3.f2362f;
                                        if (i21 == 0) {
                                            z20 = true;
                                        } else {
                                            z20 = true;
                                        }
                                        ta.c0.s(z20);
                                        kVar.f1301e = str4;
                                        lVarB = kVar.b();
                                    }
                                    androidx.media3.common.l lVar = lVarB;
                                    if (n1Var3 == null) {
                                        i22 = 0;
                                    } else {
                                        i22 = n1Var3.f2360d;
                                    }
                                    if (n1Var3 == null) {
                                        z21 = false;
                                    } else {
                                        z21 = true;
                                    }
                                    t3 t3Var3 = (t3) y1Var2.f14132a;
                                    long j19 = t3Var3.C;
                                    long j20 = t3Var3.D;
                                    long j21 = t3Var3.E;
                                    Bundle bundle6 = (Bundle) v0Var.f2444h;
                                    if (windowCount >= x3Var.getWindowCount()) {
                                        x3Var2 = x3Var;
                                        q0Var2 = null;
                                    } else {
                                        x3Var2 = x3Var;
                                        q0Var2 = x3Var2.c(windowCount).f9539a;
                                    }
                                    c4 c4Var = new c4(i(windowCount, q0Var2, jC3, z16), z16, SystemClock.elapsedRealtime(), jD2, jB, iB3, jB2, -9223372036854775807L, jD2, jB);
                                    androidx.media3.common.e1 e1Var2 = c4.f9243k;
                                    int i35 = i16;
                                    t3Var = new t3(playbackExceptionO, 0, c4Var, e1Var2, e1Var2, 0, z0Var, i35, z15, androidx.media3.common.w2.f1669d, x3Var2, 0, t0Var6, 1.0f, 1.0f, dVar, 0, d7.c.f4764d, lVar, i22, z21, z17, 1, 0, i34, z19, false, t0Var2, j19, j20, j21, androidx.media3.common.s2.f1554b, androidx.media3.common.q2.J);
                                    sd.y1 y1Var3 = new sd.y1(t3Var, a4Var3, b1Var, t0VarK, bundle6, b4Var);
                                    v0Var2 = this.m;
                                    y1Var = this.f9570p;
                                    j12 = uVar.f9524g;
                                    num = 3;
                                    zIsEmpty = ((t3) y1Var.f14132a).f9504j.isEmpty();
                                    boolean zIsEmpty2 = x3Var2.isEmpty();
                                    if (!zIsEmpty) {
                                        if (zIsEmpty) {
                                            q0VarS = ((t3) y1Var.f14132a).s();
                                            q0VarS.getClass();
                                            w3Var2 = x3Var2.f9545b;
                                            if (w3Var2 == null) {
                                                i23 = 0;
                                                while (true) {
                                                    t0Var4 = x3Var2.f9544a;
                                                    if (i23 >= t0Var4.size()) {
                                                        z22 = false;
                                                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                        z22 = true;
                                                    } else {
                                                        i23++;
                                                    }
                                                }
                                            } else {
                                                i23 = 0;
                                                while (true) {
                                                    t0Var4 = x3Var2.f9544a;
                                                    if (i23 >= t0Var4.size()) {
                                                        z22 = false;
                                                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                        z22 = true;
                                                    } else {
                                                        i23++;
                                                    }
                                                }
                                            }
                                            if (z22) {
                                                num2 = 4;
                                            } else if (q0VarS.equals(t3Var.s())) {
                                                jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                                                jC2 = p.c(j0Var2, yVar3, j12);
                                                if (jC2 == 0) {
                                                    if (Math.abs(jC - jC2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                } else {
                                                    if (Math.abs(jC - jC2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                }
                                                num = num3;
                                            } else {
                                                z23 = true;
                                                num = 1;
                                                num2 = 0;
                                            }
                                            z23 = true;
                                        } else {
                                            q0VarS = ((t3) y1Var.f14132a).s();
                                            q0VarS.getClass();
                                            w3Var2 = x3Var2.f9545b;
                                            if (w3Var2 == null) {
                                                i23 = 0;
                                                while (true) {
                                                    t0Var4 = x3Var2.f9544a;
                                                    if (i23 >= t0Var4.size()) {
                                                        z22 = false;
                                                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                        z22 = true;
                                                    } else {
                                                        i23++;
                                                    }
                                                }
                                            } else {
                                                i23 = 0;
                                                while (true) {
                                                    t0Var4 = x3Var2.f9544a;
                                                    if (i23 >= t0Var4.size()) {
                                                        z22 = false;
                                                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                        z22 = true;
                                                    } else {
                                                        i23++;
                                                    }
                                                }
                                            }
                                            if (z22) {
                                                num2 = 4;
                                            } else if (q0VarS.equals(t3Var.s())) {
                                                jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                                                jC2 = p.c(j0Var2, yVar3, j12);
                                                if (jC2 == 0) {
                                                    if (Math.abs(jC - jC2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                } else {
                                                    if (Math.abs(jC - jC2) > 100) {
                                                        num2 = 5;
                                                    } else {
                                                        num2 = null;
                                                    }
                                                    num3 = null;
                                                }
                                                num = num3;
                                            } else {
                                                z23 = true;
                                                num = 1;
                                                num2 = 0;
                                            }
                                            z23 = true;
                                        }
                                    } else if (zIsEmpty) {
                                        q0VarS = ((t3) y1Var.f14132a).s();
                                        q0VarS.getClass();
                                        w3Var2 = x3Var2.f9545b;
                                        if (w3Var2 == null) {
                                            i23 = 0;
                                            while (true) {
                                                t0Var4 = x3Var2.f9544a;
                                                if (i23 >= t0Var4.size()) {
                                                    z22 = false;
                                                } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                    z22 = true;
                                                } else {
                                                    i23++;
                                                }
                                            }
                                        } else {
                                            i23 = 0;
                                            while (true) {
                                                t0Var4 = x3Var2.f9544a;
                                                if (i23 >= t0Var4.size()) {
                                                    z22 = false;
                                                } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                    z22 = true;
                                                } else {
                                                    i23++;
                                                }
                                            }
                                        }
                                        if (z22) {
                                            num2 = 4;
                                        } else if (q0VarS.equals(t3Var.s())) {
                                            jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                                            jC2 = p.c(j0Var2, yVar3, j12);
                                            if (jC2 == 0) {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z23 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z23 = true;
                                    } else {
                                        q0VarS = ((t3) y1Var.f14132a).s();
                                        q0VarS.getClass();
                                        w3Var2 = x3Var2.f9545b;
                                        if (w3Var2 == null) {
                                            i23 = 0;
                                            while (true) {
                                                t0Var4 = x3Var2.f9544a;
                                                if (i23 >= t0Var4.size()) {
                                                    z22 = false;
                                                } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                    z22 = true;
                                                } else {
                                                    i23++;
                                                }
                                            }
                                        } else {
                                            i23 = 0;
                                            while (true) {
                                                t0Var4 = x3Var2.f9544a;
                                                if (i23 >= t0Var4.size()) {
                                                    z22 = false;
                                                } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                                    z22 = true;
                                                } else {
                                                    i23++;
                                                }
                                            }
                                        }
                                        if (z22) {
                                            num2 = 4;
                                        } else if (q0VarS.equals(t3Var.s())) {
                                            jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                                            jC2 = p.c(j0Var2, yVar3, j12);
                                            if (jC2 == 0) {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z23 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z23 = true;
                                    }
                                    Pair pairCreate = Pair.create(num2, num);
                                    o(z10, v0Var, true, y1Var3, (Integer) pairCreate.first, (Integer) pairCreate.second);
                                    if (this.f9569o) {
                                        this.f9569o = false;
                                        if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                                            z24 = z23;
                                        } else {
                                            z24 = false;
                                        }
                                        ta.c0.A(z24);
                                        uVar.f9522e.getClass();
                                    }
                                }
                        }
                    } catch (LegacyConversions$ConversionException unused2) {
                    }
                }
                int i36 = i19;
                if (j0Var2 == null && j0Var2.A == 3) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (n1Var3 == null) {
                    lVarB = androidx.media3.common.l.f1313e;
                } else {
                    if (n1Var3.f2357a == 2) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    androidx.media3.common.k kVar2 = new androidx.media3.common.k(i21);
                    kVar2.f1300d = n1Var3.f2359c;
                    String str5 = (String) n1Var3.f2362f;
                    if (i21 == 0 || str5 == null) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    ta.c0.s(z20);
                    kVar2.f1301e = str5;
                    lVarB = kVar2.b();
                }
                androidx.media3.common.l lVar2 = lVarB;
                if (n1Var3 == null) {
                    i22 = 0;
                } else {
                    i22 = n1Var3.f2360d;
                }
                if (n1Var3 == null && n1Var3.f2360d == 0) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                t3 t3Var4 = (t3) y1Var2.f14132a;
                long j110 = t3Var4.C;
                long j22 = t3Var4.D;
                long j23 = t3Var4.E;
                Bundle bundle7 = (Bundle) v0Var.f2444h;
                if (windowCount >= x3Var.getWindowCount()) {
                    x3Var2 = x3Var;
                    q0Var2 = null;
                } else {
                    x3Var2 = x3Var;
                    q0Var2 = x3Var2.c(windowCount).f9539a;
                }
                c4 c4Var2 = new c4(i(windowCount, q0Var2, jC3, z16), z16, SystemClock.elapsedRealtime(), jD2, jB, iB3, jB2, -9223372036854775807L, jD2, jB);
                androidx.media3.common.e1 e1Var3 = c4.f9243k;
                int i37 = i16;
                t3Var = new t3(playbackExceptionO, 0, c4Var2, e1Var3, e1Var3, 0, z0Var, i37, z15, androidx.media3.common.w2.f1669d, x3Var2, 0, t0Var6, 1.0f, 1.0f, dVar, 0, d7.c.f4764d, lVar2, i22, z21, z17, 1, 0, i36, z19, false, t0Var2, j110, j22, j23, androidx.media3.common.s2.f1554b, androidx.media3.common.q2.J);
                sd.y1 y1Var4 = new sd.y1(t3Var, a4Var3, b1Var, t0VarK, bundle7, b4Var);
                v0Var2 = this.m;
                y1Var = this.f9570p;
                j12 = uVar.f9524g;
                num = 3;
                zIsEmpty = ((t3) y1Var.f14132a).f9504j.isEmpty();
                boolean zIsEmpty3 = x3Var2.isEmpty();
                if (!zIsEmpty && zIsEmpty3) {
                    num2 = null;
                    num = null;
                } else if (zIsEmpty || zIsEmpty3) {
                    q0VarS = ((t3) y1Var.f14132a).s();
                    q0VarS.getClass();
                    w3Var2 = x3Var2.f9545b;
                    if (w3Var2 == null && q0VarS.equals(w3Var2.f9539a)) {
                        z22 = true;
                    } else {
                        i23 = 0;
                        while (true) {
                            t0Var4 = x3Var2.f9544a;
                            if (i23 >= t0Var4.size()) {
                                z22 = false;
                            } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                z22 = true;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (z22) {
                        if (q0VarS.equals(t3Var.s())) {
                            jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                            jC2 = p.c(j0Var2, yVar3, j12);
                            if (jC2 == 0 || i37 != 1) {
                                if (Math.abs(jC - jC2) > 100) {
                                    num2 = 5;
                                } else {
                                    num2 = null;
                                }
                                num3 = null;
                            } else {
                                num2 = 0;
                                num3 = null;
                            }
                            num = num3;
                        } else {
                            z23 = true;
                            num = 1;
                            num2 = 0;
                        }
                        Pair pairCreate2 = Pair.create(num2, num);
                        o(z10, v0Var, true, y1Var4, (Integer) pairCreate2.first, (Integer) pairCreate2.second);
                        if (this.f9569o) {
                            this.f9569o = false;
                            if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                                z24 = z23;
                            } else {
                                z24 = false;
                            }
                            ta.c0.A(z24);
                            uVar.f9522e.getClass();
                        }
                    }
                    num2 = 4;
                } else {
                    num2 = 0;
                }
                z23 = true;
                Pair pairCreate3 = Pair.create(num2, num);
                o(z10, v0Var, true, y1Var4, (Integer) pairCreate3.first, (Integer) pairCreate3.second);
                if (this.f9569o) {
                    this.f9569o = false;
                    if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                        z24 = z23;
                    } else {
                        z24 = false;
                    }
                    ta.c0.A(z24);
                    uVar.f9522e.getClass();
                }
            }
            j11 = 4;
            qVar.d(1);
            if (p.y(j18, MediaStatus.COMMAND_LIKE)) {
                qVar.d(2);
            }
            i13 = i12;
            if (p.y(j18, MediaStatus.COMMAND_DISLIKE)) {
                qVar.f(31, 2);
            } else {
                qVar.f(31, 2);
            }
            if (p.y(j18, 8L)) {
                qVar.d(11);
            }
            if (p.y(j18, 64L)) {
                qVar.d(12);
            }
            if (p.y(j18, 256L)) {
                qVar.f(5, 4);
            }
            if (p.y(j18, 32L)) {
                qVar.f(9, 8);
            }
            if (p.y(j18, 16L)) {
                qVar.f(7, 6);
            }
            if (p.y(j18, 4194304L)) {
                qVar.d(13);
            }
            if (p.y(j18, 1L)) {
                qVar.d(3);
            }
            if (i13 == 1) {
                qVar.f(26, 34);
            } else if (i13 == 2) {
                qVar.f(26, 34, 25, 33);
            }
            qVar.f(23, 17, 18, 16, 21, 32);
            if ((flags & j11) != 0) {
                qVar.d(20);
                if (p.y(j18, MediaStatus.COMMAND_EDIT_TRACKS)) {
                    qVar.d(10);
                }
            }
            if (z11) {
                if (p.y(j18, MediaStatus.COMMAND_STREAM_TRANSFER)) {
                    qVar.d(15);
                }
                if (p.y(j18, 2097152L)) {
                    qVar.d(14);
                }
            }
            b1Var = new androidx.media3.common.b1(qVar.g());
            charSequence = (CharSequence) v0Var3.f2443g;
            charSequence2 = (CharSequence) v0Var.f2443g;
            if (charSequence == charSequence2) {
                t0Var3 = ((t3) y1Var2.f14132a).m;
            } else if (charSequence2 == null) {
                t0Var3 = androidx.media3.common.t0.K;
            } else {
                androidx.media3.common.s0 s0Var2 = new androidx.media3.common.s0();
                s0Var2.f1515a = charSequence2;
                t0Var3 = new androidx.media3.common.t0(s0Var2);
            }
            androidx.media3.common.t0 t0Var7 = t0Var3;
            iS = p.s(v0Var.f2438b);
            zU = p.u(v0Var.f2439c);
            if (j0Var == j0Var2) {
                hashSet = new HashSet();
                d2Var = z3.f9573d;
                while (i14 < d2Var.D) {
                    hashSet.add(new z3(((Integer) d2Var.get(i14)).intValue()));
                }
                if (!z11) {
                    while (r10.hasNext()) {
                        if (z3Var.f9578a == 40010) {
                            hashSet.remove(z3Var);
                        }
                    }
                }
                if (j0Var2 != null) {
                    while (r10.hasNext()) {
                        String str6 = i0Var.A;
                        bundle3 = i0Var.D;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        hashSet.add(new z3(str6, bundle3));
                    }
                }
                a4 a4Var4 = new a4(hashSet);
                if (j0Var2 == null) {
                    fh.r0 r0Var2 = fh.t0.B;
                    i16 = iS;
                    t0VarK = fh.d2.E;
                    z15 = zU;
                } else {
                    ?? r11 = j0Var2.I;
                    fh.w.g(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = r11.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        l9.i0 i0Var3 = (l9.i0) it.next();
                        String str7 = i0Var3.A;
                        bundle = i0Var3.D;
                        if (bundle != null) {
                            i17 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i17 = 0;
                        }
                        boolean z34 = zU;
                        aVar = new a(i17, i0Var3.C);
                        if (bundle == null) {
                            bundle2 = Bundle.EMPTY;
                        } else {
                            bundle2 = bundle;
                        }
                        aVar.d(new z3(str7, bundle2));
                        aVar.f9201f = i0Var3.B;
                        aVar.f9203h = true;
                        if (bundle != null) {
                            aVar.f9202g = new Bundle(bundle);
                        }
                        if (bundle != null) {
                            string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                aVar.b(uri);
                            } else {
                                aVar.b(uri);
                            }
                        }
                        b bVarA2 = aVar.a();
                        int i38 = i15 + 1;
                        iB = fh.n0.b(objArrCopyOf.length, i38);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i15] = bVarA2;
                        i15 = i38;
                        iS = iS;
                        it = it;
                        zU = z34;
                    }
                    i16 = iS;
                    z15 = zU;
                    t0VarK = b.k(fh.t0.l(i15, objArrCopyOf), b1Var, bundle4);
                }
                a4Var = a4Var4;
            } else {
                hashSet = new HashSet();
                d2Var = z3.f9573d;
                while (i14 < d2Var.D) {
                    hashSet.add(new z3(((Integer) d2Var.get(i14)).intValue()));
                }
                if (!z11) {
                    while (r10.hasNext()) {
                        if (z3Var.f9578a == 40010) {
                            hashSet.remove(z3Var);
                        }
                    }
                }
                if (j0Var2 != null) {
                    while (r10.hasNext()) {
                        String str8 = i0Var.A;
                        bundle3 = i0Var.D;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        hashSet.add(new z3(str8, bundle3));
                    }
                }
                a4 a4Var5 = new a4(hashSet);
                if (j0Var2 == null) {
                    fh.r0 r0Var3 = fh.t0.B;
                    i16 = iS;
                    t0VarK = fh.d2.E;
                    z15 = zU;
                } else {
                    ?? r12 = j0Var2.I;
                    fh.w.g(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = r12.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        l9.i0 i0Var4 = (l9.i0) it.next();
                        String str9 = i0Var4.A;
                        bundle = i0Var4.D;
                        if (bundle != null) {
                            i17 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i17 = 0;
                        }
                        boolean z35 = zU;
                        aVar = new a(i17, i0Var4.C);
                        if (bundle == null) {
                            bundle2 = Bundle.EMPTY;
                        } else {
                            bundle2 = bundle;
                        }
                        aVar.d(new z3(str9, bundle2));
                        aVar.f9201f = i0Var4.B;
                        aVar.f9203h = true;
                        if (bundle != null) {
                            aVar.f9202g = new Bundle(bundle);
                        }
                        if (bundle != null) {
                            string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content")) {
                                aVar.b(uri);
                            } else {
                                aVar.b(uri);
                            }
                        }
                        b bVarA3 = aVar.a();
                        int i39 = i15 + 1;
                        iB = fh.n0.b(objArrCopyOf.length, i39);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i15] = bVarA3;
                        i15 = i39;
                        iS = iS;
                        it = it;
                        zU = z35;
                    }
                    i16 = iS;
                    z15 = zU;
                    t0VarK = b.k(fh.t0.l(i15, objArrCopyOf), b1Var, bundle4);
                }
                a4Var = a4Var5;
            }
            Context context2 = this.f9557a;
            PlaybackException playbackExceptionO2 = p.o(j0Var2, context2);
            if (j0Var2 == null) {
                b4Var = null;
            } else {
                i18 = j0Var2.A;
                int i310 = j0Var2.F;
                CharSequence charSequence5 = j0Var2.G;
                Bundle bundle8 = j0Var2.K;
                if (i18 != 7) {
                    b4Var = null;
                } else {
                    b4Var = null;
                }
            }
            long jC4 = p.c(j0Var2, yVar3, j13);
            long jB3 = p.b(j0Var2, yVar3, j13);
            a4 a4Var6 = a4Var;
            int iB4 = q3.b(p.b(j0Var2, yVar3, j13), p.d(yVar3));
            long jB4 = p.b(j0Var2, yVar3, j13) - p.c(j0Var2, yVar3, j13);
            if (yVar3 == null) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (j0Var2 == null) {
                z0Var = androidx.media3.common.z0.f1685d;
            } else {
                z0Var = new androidx.media3.common.z0(j0Var2.D);
            }
            if (n1Var2 == null) {
                dVar = androidx.media3.common.d.f1142i;
                n1Var3 = n1Var2;
            } else {
                n1Var3 = n1Var2;
                dVar = (androidx.media3.common.d) n1Var3.f2361e;
            }
            if (j0Var2 != null) {
                switch (j0Var2.A) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z17 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z17 = false;
                        break;
                }
            } else {
                z17 = false;
            }
            if (j0Var2 == null) {
                z0Var = z0Var;
                i19 = 1;
            } else {
                i20 = j0Var2.A;
                jD = p.d(yVar3);
                if (jD == -9223372036854775807L) {
                    z18 = false;
                } else {
                    z18 = true;
                }
                switch (i20) {
                    case 0:
                    case 7:
                    case 8:
                        z0Var = z0Var;
                        i19 = 1;
                        break;
                    case 1:
                        z0Var = z0Var;
                        if (z18) {
                            i19 = 4;
                        } else {
                            i19 = 1;
                        }
                        break;
                    case 2:
                        z0Var = z0Var;
                        if (z18) {
                            i19 = 4;
                        } else {
                            i19 = 3;
                        }
                        break;
                    case 3:
                        z0Var = z0Var;
                        i19 = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z0Var = z0Var;
                        i19 = 2;
                        break;
                    default:
                        throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i20);
                }
            }
            int i311 = i19;
            if (j0Var2 == null) {
                z19 = false;
            } else {
                z19 = true;
            }
            if (n1Var3 == null) {
                lVarB = androidx.media3.common.l.f1313e;
            } else {
                if (n1Var3.f2357a == 2) {
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                androidx.media3.common.k kVar3 = new androidx.media3.common.k(i21);
                kVar3.f1300d = n1Var3.f2359c;
                String str10 = (String) n1Var3.f2362f;
                if (i21 == 0) {
                    z20 = true;
                } else {
                    z20 = true;
                }
                ta.c0.s(z20);
                kVar3.f1301e = str10;
                lVarB = kVar3.b();
            }
            androidx.media3.common.l lVar3 = lVarB;
            if (n1Var3 == null) {
                i22 = 0;
            } else {
                i22 = n1Var3.f2360d;
            }
            if (n1Var3 == null) {
                z21 = false;
            } else {
                z21 = true;
            }
            t3 t3Var5 = (t3) y1Var2.f14132a;
            long j111 = t3Var5.C;
            long j24 = t3Var5.D;
            long j25 = t3Var5.E;
            Bundle bundle9 = (Bundle) v0Var.f2444h;
            if (windowCount >= x3Var.getWindowCount()) {
                x3Var2 = x3Var;
                q0Var2 = null;
            } else {
                x3Var2 = x3Var;
                q0Var2 = x3Var2.c(windowCount).f9539a;
            }
            c4 c4Var3 = new c4(i(windowCount, q0Var2, jC4, z16), z16, SystemClock.elapsedRealtime(), jD2, jB3, iB4, jB4, -9223372036854775807L, jD2, jB3);
            androidx.media3.common.e1 e1Var4 = c4.f9243k;
            int i312 = i16;
            t3Var = new t3(playbackExceptionO2, 0, c4Var3, e1Var4, e1Var4, 0, z0Var, i312, z15, androidx.media3.common.w2.f1669d, x3Var2, 0, t0Var7, 1.0f, 1.0f, dVar, 0, d7.c.f4764d, lVar3, i22, z21, z17, 1, 0, i311, z19, false, t0Var2, j111, j24, j25, androidx.media3.common.s2.f1554b, androidx.media3.common.q2.J);
            sd.y1 y1Var5 = new sd.y1(t3Var, a4Var6, b1Var, t0VarK, bundle9, b4Var);
            v0Var2 = this.m;
            y1Var = this.f9570p;
            j12 = uVar.f9524g;
            num = 3;
            zIsEmpty = ((t3) y1Var.f14132a).f9504j.isEmpty();
            boolean zIsEmpty4 = x3Var2.isEmpty();
            if (!zIsEmpty) {
                if (zIsEmpty) {
                    q0VarS = ((t3) y1Var.f14132a).s();
                    q0VarS.getClass();
                    w3Var2 = x3Var2.f9545b;
                    if (w3Var2 == null) {
                        i23 = 0;
                        while (true) {
                            t0Var4 = x3Var2.f9544a;
                            if (i23 >= t0Var4.size()) {
                                z22 = false;
                            } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                z22 = true;
                            } else {
                                i23++;
                            }
                        }
                    } else {
                        i23 = 0;
                        while (true) {
                            t0Var4 = x3Var2.f9544a;
                            if (i23 >= t0Var4.size()) {
                                z22 = false;
                            } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                z22 = true;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (z22) {
                        num2 = 4;
                    } else if (q0VarS.equals(t3Var.s())) {
                        jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                        jC2 = p.c(j0Var2, yVar3, j12);
                        if (jC2 == 0) {
                            if (Math.abs(jC - jC2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jC - jC2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z23 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z23 = true;
                } else {
                    q0VarS = ((t3) y1Var.f14132a).s();
                    q0VarS.getClass();
                    w3Var2 = x3Var2.f9545b;
                    if (w3Var2 == null) {
                        i23 = 0;
                        while (true) {
                            t0Var4 = x3Var2.f9544a;
                            if (i23 >= t0Var4.size()) {
                                z22 = false;
                            } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                z22 = true;
                            } else {
                                i23++;
                            }
                        }
                    } else {
                        i23 = 0;
                        while (true) {
                            t0Var4 = x3Var2.f9544a;
                            if (i23 >= t0Var4.size()) {
                                z22 = false;
                            } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                                z22 = true;
                            } else {
                                i23++;
                            }
                        }
                    }
                    if (z22) {
                        num2 = 4;
                    } else if (q0VarS.equals(t3Var.s())) {
                        jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                        jC2 = p.c(j0Var2, yVar3, j12);
                        if (jC2 == 0) {
                            if (Math.abs(jC - jC2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            if (Math.abs(jC - jC2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z23 = true;
                        num = 1;
                        num2 = 0;
                    }
                    z23 = true;
                }
            } else if (zIsEmpty) {
                q0VarS = ((t3) y1Var.f14132a).s();
                q0VarS.getClass();
                w3Var2 = x3Var2.f9545b;
                if (w3Var2 == null) {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                } else {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                }
                if (z22) {
                    num2 = 4;
                } else if (q0VarS.equals(t3Var.s())) {
                    jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                    jC2 = p.c(j0Var2, yVar3, j12);
                    if (jC2 == 0) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z23 = true;
                    num = 1;
                    num2 = 0;
                }
                z23 = true;
            } else {
                q0VarS = ((t3) y1Var.f14132a).s();
                q0VarS.getClass();
                w3Var2 = x3Var2.f9545b;
                if (w3Var2 == null) {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                } else {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                }
                if (z22) {
                    num2 = 4;
                } else if (q0VarS.equals(t3Var.s())) {
                    jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                    jC2 = p.c(j0Var2, yVar3, j12);
                    if (jC2 == 0) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z23 = true;
                    num = 1;
                    num2 = 0;
                }
                z23 = true;
            }
            Pair pairCreate4 = Pair.create(num2, num);
            o(z10, v0Var, true, y1Var5, (Integer) pairCreate4.first, (Integer) pairCreate4.second);
            if (this.f9569o) {
                this.f9569o = false;
                if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                    z24 = z23;
                } else {
                    z24 = false;
                }
                ta.c0.A(z24);
                uVar.f9522e.getClass();
            }
        }
        str = "MCImplLegacy";
        z14 = false;
        if (p.y(j18, 4L)) {
            j11 = 4;
            if (p.y(j18, 2L)) {
                qVar.d(1);
            } else {
                qVar.d(1);
            }
        } else {
            j11 = 4;
            if (p.y(j18, 2L)) {
                qVar.d(1);
            } else {
                qVar.d(1);
            }
        }
        if (p.y(j18, MediaStatus.COMMAND_LIKE)) {
            qVar.d(2);
        }
        i13 = i12;
        if (p.y(j18, MediaStatus.COMMAND_DISLIKE)) {
            qVar.f(31, 2);
        } else {
            qVar.f(31, 2);
        }
        if (p.y(j18, 8L)) {
            qVar.d(11);
        }
        if (p.y(j18, 64L)) {
            qVar.d(12);
        }
        if (p.y(j18, 256L)) {
            qVar.f(5, 4);
        }
        if (p.y(j18, 32L)) {
            qVar.f(9, 8);
        }
        if (p.y(j18, 16L)) {
            qVar.f(7, 6);
        }
        if (p.y(j18, 4194304L)) {
            qVar.d(13);
        }
        if (p.y(j18, 1L)) {
            qVar.d(3);
        }
        if (i13 == 1) {
            qVar.f(26, 34);
        } else if (i13 == 2) {
            qVar.f(26, 34, 25, 33);
        }
        qVar.f(23, 17, 18, 16, 21, 32);
        if ((flags & j11) != 0) {
            qVar.d(20);
            if (p.y(j18, MediaStatus.COMMAND_EDIT_TRACKS)) {
                qVar.d(10);
            }
        }
        if (z11) {
            if (p.y(j18, MediaStatus.COMMAND_STREAM_TRANSFER)) {
                qVar.d(15);
            }
            if (p.y(j18, 2097152L)) {
                qVar.d(14);
            }
        }
        b1Var = new androidx.media3.common.b1(qVar.g());
        charSequence = (CharSequence) v0Var3.f2443g;
        charSequence2 = (CharSequence) v0Var.f2443g;
        if (charSequence == charSequence2) {
            t0Var3 = ((t3) y1Var2.f14132a).m;
        } else if (charSequence2 == null) {
            t0Var3 = androidx.media3.common.t0.K;
        } else {
            androidx.media3.common.s0 s0Var3 = new androidx.media3.common.s0();
            s0Var3.f1515a = charSequence2;
            t0Var3 = new androidx.media3.common.t0(s0Var3);
        }
        androidx.media3.common.t0 t0Var8 = t0Var3;
        iS = p.s(v0Var.f2438b);
        zU = p.u(v0Var.f2439c);
        if (j0Var == j0Var2) {
            hashSet = new HashSet();
            d2Var = z3.f9573d;
            while (i14 < d2Var.D) {
                hashSet.add(new z3(((Integer) d2Var.get(i14)).intValue()));
            }
            if (!z11) {
                while (r10.hasNext()) {
                    if (z3Var.f9578a == 40010) {
                        hashSet.remove(z3Var);
                    }
                }
            }
            if (j0Var2 != null) {
                while (r10.hasNext()) {
                    String str11 = i0Var.A;
                    bundle3 = i0Var.D;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    hashSet.add(new z3(str11, bundle3));
                }
            }
            a4 a4Var7 = new a4(hashSet);
            if (j0Var2 == null) {
                fh.r0 r0Var4 = fh.t0.B;
                i16 = iS;
                t0VarK = fh.d2.E;
                z15 = zU;
            } else {
                ?? r13 = j0Var2.I;
                fh.w.g(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = r13.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    l9.i0 i0Var5 = (l9.i0) it.next();
                    String str12 = i0Var5.A;
                    bundle = i0Var5.D;
                    if (bundle != null) {
                        i17 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i17 = 0;
                    }
                    boolean z36 = zU;
                    aVar = new a(i17, i0Var5.C);
                    if (bundle == null) {
                        bundle2 = Bundle.EMPTY;
                    } else {
                        bundle2 = bundle;
                    }
                    aVar.d(new z3(str12, bundle2));
                    aVar.f9201f = i0Var5.B;
                    aVar.f9203h = true;
                    if (bundle != null) {
                        aVar.f9202g = new Bundle(bundle);
                    }
                    if (bundle != null) {
                        string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            aVar.b(uri);
                        } else {
                            aVar.b(uri);
                        }
                    }
                    b bVarA4 = aVar.a();
                    int i313 = i15 + 1;
                    iB = fh.n0.b(objArrCopyOf.length, i313);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i15] = bVarA4;
                    i15 = i313;
                    iS = iS;
                    it = it;
                    zU = z36;
                }
                i16 = iS;
                z15 = zU;
                t0VarK = b.k(fh.t0.l(i15, objArrCopyOf), b1Var, bundle4);
            }
            a4Var = a4Var7;
        } else {
            hashSet = new HashSet();
            d2Var = z3.f9573d;
            while (i14 < d2Var.D) {
                hashSet.add(new z3(((Integer) d2Var.get(i14)).intValue()));
            }
            if (!z11) {
                while (r10.hasNext()) {
                    if (z3Var.f9578a == 40010) {
                        hashSet.remove(z3Var);
                    }
                }
            }
            if (j0Var2 != null) {
                while (r10.hasNext()) {
                    String str13 = i0Var.A;
                    bundle3 = i0Var.D;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    hashSet.add(new z3(str13, bundle3));
                }
            }
            a4 a4Var8 = new a4(hashSet);
            if (j0Var2 == null) {
                fh.r0 r0Var5 = fh.t0.B;
                i16 = iS;
                t0VarK = fh.d2.E;
                z15 = zU;
            } else {
                ?? r14 = j0Var2.I;
                fh.w.g(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = r14.iterator();
                i15 = 0;
                while (it.hasNext()) {
                    l9.i0 i0Var6 = (l9.i0) it.next();
                    String str14 = i0Var6.A;
                    bundle = i0Var6.D;
                    if (bundle != null) {
                        i17 = bundle.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i17 = 0;
                    }
                    boolean z37 = zU;
                    aVar = new a(i17, i0Var6.C);
                    if (bundle == null) {
                        bundle2 = Bundle.EMPTY;
                    } else {
                        bundle2 = bundle;
                    }
                    aVar.d(new z3(str14, bundle2));
                    aVar.f9201f = i0Var6.B;
                    aVar.f9203h = true;
                    if (bundle != null) {
                        aVar.f9202g = new Bundle(bundle);
                    }
                    if (bundle != null) {
                        string = bundle.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            aVar.b(uri);
                        } else {
                            aVar.b(uri);
                        }
                    }
                    b bVarA5 = aVar.a();
                    int i314 = i15 + 1;
                    iB = fh.n0.b(objArrCopyOf.length, i314);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i15] = bVarA5;
                    i15 = i314;
                    iS = iS;
                    it = it;
                    zU = z37;
                }
                i16 = iS;
                z15 = zU;
                t0VarK = b.k(fh.t0.l(i15, objArrCopyOf), b1Var, bundle4);
            }
            a4Var = a4Var8;
        }
        Context context3 = this.f9557a;
        PlaybackException playbackExceptionO3 = p.o(j0Var2, context3);
        if (j0Var2 == null) {
            b4Var = null;
        } else {
            i18 = j0Var2.A;
            int i315 = j0Var2.F;
            CharSequence charSequence6 = j0Var2.G;
            Bundle bundle10 = j0Var2.K;
            if (i18 != 7) {
                b4Var = null;
            } else {
                b4Var = null;
            }
        }
        long jC5 = p.c(j0Var2, yVar3, j13);
        long jB5 = p.b(j0Var2, yVar3, j13);
        a4 a4Var9 = a4Var;
        int iB5 = q3.b(p.b(j0Var2, yVar3, j13), p.d(yVar3));
        long jB6 = p.b(j0Var2, yVar3, j13) - p.c(j0Var2, yVar3, j13);
        if (yVar3 == null) {
            z16 = false;
        } else {
            z16 = true;
        }
        if (j0Var2 == null) {
            z0Var = androidx.media3.common.z0.f1685d;
        } else {
            z0Var = new androidx.media3.common.z0(j0Var2.D);
        }
        if (n1Var2 == null) {
            dVar = androidx.media3.common.d.f1142i;
            n1Var3 = n1Var2;
        } else {
            n1Var3 = n1Var2;
            dVar = (androidx.media3.common.d) n1Var3.f2361e;
        }
        if (j0Var2 != null) {
            switch (j0Var2.A) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z17 = true;
                    break;
                case 7:
                case 8:
                default:
                    z17 = false;
                    break;
            }
        } else {
            z17 = false;
        }
        if (j0Var2 == null) {
            z0Var = z0Var;
            i19 = 1;
        } else {
            i20 = j0Var2.A;
            jD = p.d(yVar3);
            if (jD == -9223372036854775807L) {
                z18 = false;
            } else {
                z18 = true;
            }
            switch (i20) {
                case 0:
                case 7:
                case 8:
                    z0Var = z0Var;
                    i19 = 1;
                    break;
                case 1:
                    z0Var = z0Var;
                    if (z18) {
                        i19 = 4;
                    } else {
                        i19 = 1;
                    }
                    break;
                case 2:
                    z0Var = z0Var;
                    if (z18) {
                        i19 = 4;
                    } else {
                        i19 = 3;
                    }
                    break;
                case 3:
                    z0Var = z0Var;
                    i19 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z0Var = z0Var;
                    i19 = 2;
                    break;
                default:
                    throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i20);
            }
        }
        int i316 = i19;
        if (j0Var2 == null) {
            z19 = false;
        } else {
            z19 = true;
        }
        if (n1Var3 == null) {
            lVarB = androidx.media3.common.l.f1313e;
        } else {
            if (n1Var3.f2357a == 2) {
                i21 = 1;
            } else {
                i21 = 0;
            }
            androidx.media3.common.k kVar4 = new androidx.media3.common.k(i21);
            kVar4.f1300d = n1Var3.f2359c;
            String str15 = (String) n1Var3.f2362f;
            if (i21 == 0) {
                z20 = true;
            } else {
                z20 = true;
            }
            ta.c0.s(z20);
            kVar4.f1301e = str15;
            lVarB = kVar4.b();
        }
        androidx.media3.common.l lVar4 = lVarB;
        if (n1Var3 == null) {
            i22 = 0;
        } else {
            i22 = n1Var3.f2360d;
        }
        if (n1Var3 == null) {
            z21 = false;
        } else {
            z21 = true;
        }
        t3 t3Var6 = (t3) y1Var2.f14132a;
        long j112 = t3Var6.C;
        long j26 = t3Var6.D;
        long j27 = t3Var6.E;
        Bundle bundle11 = (Bundle) v0Var.f2444h;
        if (windowCount >= x3Var.getWindowCount()) {
            x3Var2 = x3Var;
            q0Var2 = null;
        } else {
            x3Var2 = x3Var;
            q0Var2 = x3Var2.c(windowCount).f9539a;
        }
        c4 c4Var4 = new c4(i(windowCount, q0Var2, jC5, z16), z16, SystemClock.elapsedRealtime(), jD2, jB5, iB5, jB6, -9223372036854775807L, jD2, jB5);
        androidx.media3.common.e1 e1Var5 = c4.f9243k;
        int i317 = i16;
        t3Var = new t3(playbackExceptionO3, 0, c4Var4, e1Var5, e1Var5, 0, z0Var, i317, z15, androidx.media3.common.w2.f1669d, x3Var2, 0, t0Var8, 1.0f, 1.0f, dVar, 0, d7.c.f4764d, lVar4, i22, z21, z17, 1, 0, i316, z19, false, t0Var2, j112, j26, j27, androidx.media3.common.s2.f1554b, androidx.media3.common.q2.J);
        sd.y1 y1Var6 = new sd.y1(t3Var, a4Var9, b1Var, t0VarK, bundle11, b4Var);
        v0Var2 = this.m;
        y1Var = this.f9570p;
        j12 = uVar.f9524g;
        num = 3;
        zIsEmpty = ((t3) y1Var.f14132a).f9504j.isEmpty();
        boolean zIsEmpty5 = x3Var2.isEmpty();
        if (!zIsEmpty) {
            if (zIsEmpty) {
                q0VarS = ((t3) y1Var.f14132a).s();
                q0VarS.getClass();
                w3Var2 = x3Var2.f9545b;
                if (w3Var2 == null) {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                } else {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                }
                if (z22) {
                    num2 = 4;
                } else if (q0VarS.equals(t3Var.s())) {
                    jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                    jC2 = p.c(j0Var2, yVar3, j12);
                    if (jC2 == 0) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z23 = true;
                    num = 1;
                    num2 = 0;
                }
                z23 = true;
            } else {
                q0VarS = ((t3) y1Var.f14132a).s();
                q0VarS.getClass();
                w3Var2 = x3Var2.f9545b;
                if (w3Var2 == null) {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                } else {
                    i23 = 0;
                    while (true) {
                        t0Var4 = x3Var2.f9544a;
                        if (i23 >= t0Var4.size()) {
                            z22 = false;
                        } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                            z22 = true;
                        } else {
                            i23++;
                        }
                    }
                }
                if (z22) {
                    num2 = 4;
                } else if (q0VarS.equals(t3Var.s())) {
                    jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                    jC2 = p.c(j0Var2, yVar3, j12);
                    if (jC2 == 0) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z23 = true;
                    num = 1;
                    num2 = 0;
                }
                z23 = true;
            }
        } else if (zIsEmpty) {
            q0VarS = ((t3) y1Var.f14132a).s();
            q0VarS.getClass();
            w3Var2 = x3Var2.f9545b;
            if (w3Var2 == null) {
                i23 = 0;
                while (true) {
                    t0Var4 = x3Var2.f9544a;
                    if (i23 >= t0Var4.size()) {
                        z22 = false;
                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                        z22 = true;
                    } else {
                        i23++;
                    }
                }
            } else {
                i23 = 0;
                while (true) {
                    t0Var4 = x3Var2.f9544a;
                    if (i23 >= t0Var4.size()) {
                        z22 = false;
                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                        z22 = true;
                    } else {
                        i23++;
                    }
                }
            }
            if (z22) {
                num2 = 4;
            } else if (q0VarS.equals(t3Var.s())) {
                jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                jC2 = p.c(j0Var2, yVar3, j12);
                if (jC2 == 0) {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z23 = true;
                num = 1;
                num2 = 0;
            }
            z23 = true;
        } else {
            q0VarS = ((t3) y1Var.f14132a).s();
            q0VarS.getClass();
            w3Var2 = x3Var2.f9545b;
            if (w3Var2 == null) {
                i23 = 0;
                while (true) {
                    t0Var4 = x3Var2.f9544a;
                    if (i23 >= t0Var4.size()) {
                        z22 = false;
                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                        z22 = true;
                    } else {
                        i23++;
                    }
                }
            } else {
                i23 = 0;
                while (true) {
                    t0Var4 = x3Var2.f9544a;
                    if (i23 >= t0Var4.size()) {
                        z22 = false;
                    } else if (q0VarS.equals(((w3) t0Var4.get(i23)).f9539a)) {
                        z22 = true;
                    } else {
                        i23++;
                    }
                }
            }
            if (z22) {
                num2 = 4;
            } else if (q0VarS.equals(t3Var.s())) {
                jC = p.c((l9.j0) v0Var2.f2441e, (l9.y) v0Var2.f2442f, j12);
                jC2 = p.c(j0Var2, yVar3, j12);
                if (jC2 == 0) {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z23 = true;
                num = 1;
                num2 = 0;
            }
            z23 = true;
        }
        Pair pairCreate5 = Pair.create(num2, num);
        o(z10, v0Var, true, y1Var6, (Integer) pairCreate5.first, (Integer) pairCreate5.second);
        if (this.f9569o) {
            this.f9569o = false;
            if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                z24 = z23;
            } else {
                z24 = false;
            }
            ta.c0.A(z24);
            uVar.f9522e.getClass();
        }
    }

    public final void k() {
        androidx.media3.common.j2 j2Var = new androidx.media3.common.j2();
        ta.c0.A(l() && !((t3) this.f9570p.f14132a).f9504j.isEmpty());
        t3 t3Var = (t3) this.f9570p.f14132a;
        x3 x3Var = (x3) t3Var.f9504j;
        int i10 = t3Var.f9497c.f9253a.f1183b;
        androidx.media3.common.q0 q0Var = x3Var.getWindow(i10, j2Var).f1285c;
        if (x3Var.b(i10) == -1) {
            androidx.media3.common.m0 m0Var = q0Var.f1418f;
            String str = q0Var.f1413a;
            if (m0Var.f1348a != null) {
                if (((t3) this.f9570p.f14132a).f9514v) {
                    l9.w wVarS = this.f9565i.s();
                    Uri uri = m0Var.f1348a;
                    Bundle bundle = m0Var.f1350c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wVarS.B).playFromUri(uri, bundle);
                } else {
                    l9.w wVarS2 = this.f9565i.s();
                    Uri uri2 = m0Var.f1348a;
                    Bundle bundle2 = m0Var.f1350c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wVarS2.B).prepareFromUri(uri2, bundle2);
                }
            } else if (m0Var.f1349b != null) {
                if (((t3) this.f9570p.f14132a).f9514v) {
                    l9.w wVarS3 = this.f9565i.s();
                    String str2 = m0Var.f1349b;
                    Bundle bundle3 = m0Var.f1350c;
                    if (bundle3 == null) {
                        bundle3 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wVarS3.B).playFromSearch(str2, bundle3);
                } else {
                    l9.w wVarS4 = this.f9565i.s();
                    String str3 = m0Var.f1349b;
                    Bundle bundle4 = m0Var.f1350c;
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) wVarS4.B).prepareFromSearch(str3, bundle4);
                }
            } else if (((t3) this.f9570p.f14132a).f9514v) {
                l9.w wVarS5 = this.f9565i.s();
                Bundle bundle5 = m0Var.f1350c;
                if (bundle5 == null) {
                    bundle5 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) wVarS5.B).playFromMediaId(str, bundle5);
            } else {
                l9.w wVarS6 = this.f9565i.s();
                Bundle bundle6 = m0Var.f1350c;
                if (bundle6 == null) {
                    bundle6 = Bundle.EMPTY;
                }
                ((MediaController.TransportControls) wVarS6.B).prepareFromMediaId(str, bundle6);
            }
        } else if (((t3) this.f9570p.f14132a).f9514v) {
            ((MediaController.TransportControls) this.f9565i.s().B).play();
        } else {
            ((MediaController.TransportControls) this.f9565i.s().B).prepare();
        }
        if (((t3) this.f9570p.f14132a).f9497c.f9253a.f1187f != 0) {
            ((MediaController.TransportControls) this.f9565i.s().B).seekTo(((t3) this.f9570p.f14132a).f9497c.f9253a.f1187f);
        }
        if (((androidx.media3.common.b1) this.f9570p.f14134c).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < x3Var.getWindowCount(); i11++) {
                if (i11 != i10 && x3Var.b(i11) == -1) {
                    arrayList.add(x3Var.getWindow(i11, j2Var).f1285c);
                }
            }
            f(0, arrayList);
        }
    }

    public final boolean l() {
        return ((t3) this.f9570p.f14132a).A != 1;
    }

    public final void m() {
        l9.y yVarCreateFromParcel;
        int iH;
        if (this.f9567k || this.l) {
            return;
        }
        this.l = true;
        ba.n1 n1VarQ = this.f9565i.q();
        l9.j0 j0VarH = h(this.f9565i.r());
        MediaMetadata metadata = ((l9.v) this.f9565i.A).f10183a.getMetadata();
        if (metadata != null) {
            u.e eVar = l9.y.D;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            yVarCreateFromParcel = l9.y.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            yVarCreateFromParcel.B = metadata;
        } else {
            yVarCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((l9.v) this.f9565i.A).f10183a.getQueue();
        List listG = g(queue != null ? l9.d0.a(queue) : null);
        CharSequence queueTitle = ((l9.v) this.f9565i.A).f10183a.getQueueTitle();
        l9.d dVarA = ((l9.v) this.f9565i.A).f10187e.a();
        int repeatMode = -1;
        if (dVarA != null) {
            try {
                repeatMode = dVarA.getRepeatMode();
            } catch (RemoteException | SecurityException e3) {
                e7.a.e("MediaControllerCompat", "Dead object in getRepeatMode.", e3);
            }
        }
        l9.d dVarA2 = ((l9.v) this.f9565i.A).f10187e.a();
        if (dVarA2 != null) {
            try {
                iH = dVarA2.h();
            } catch (RemoteException | SecurityException e10) {
                e7.a.e("MediaControllerCompat", "Dead object in getShuffleMode.", e10);
                iH = -1;
            }
        } else {
            iH = -1;
        }
        j(true, new ba.v0(n1VarQ, j0VarH, yVarCreateFromParcel, listG, queueTitle, repeatMode, iH, ((l9.v) this.f9565i.A).f10183a.getExtras()));
    }

    @Override
    public final void moveMediaItem(int i10, int i11) {
        moveMediaItems(i10, i10 + 1, i11);
    }

    @Override
    public final void moveMediaItems(int i10, int i11, int i12) {
        ta.c0.s(i10 >= 0 && i10 <= i11 && i12 >= 0);
        x3 x3Var = (x3) ((t3) this.f9570p.f14132a).f9504j;
        int windowCount = x3Var.getWindowCount();
        int iMin = Math.min(i11, windowCount);
        int i13 = iMin - i10;
        int i14 = windowCount - i13;
        int i15 = i14 - 1;
        int iMin2 = Math.min(i12, i14);
        if (i10 >= windowCount || i10 == iMin || i10 == iMin2) {
            return;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (currentMediaItemIndex >= i10) {
            currentMediaItemIndex = currentMediaItemIndex < iMin ? -1 : currentMediaItemIndex - i13;
        }
        if (currentMediaItemIndex == -1) {
            currentMediaItemIndex = e7.i0.h(i10, 0, i15);
            e7.a.m("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + currentMediaItemIndex + " would be the new current item");
        }
        if (currentMediaItemIndex >= iMin2) {
            currentMediaItemIndex += i13;
        }
        ArrayList arrayList = new ArrayList(x3Var.f9544a);
        e7.i0.G(arrayList, i10, iMin, iMin2);
        t3 t3VarM = ((t3) this.f9570p.f14132a).m(new x3(fh.t0.o(arrayList), x3Var.f9545b), currentMediaItemIndex);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarM, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (l()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i16 = 0; i16 < i13; i16++) {
                arrayList2.add((l9.d0) ((List) this.m.f2437a).get(i10));
                this.f9565i.z(((l9.d0) ((List) this.m.f2437a).get(i10)).A);
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                this.f9565i.l(((l9.d0) arrayList2.get(i17)).A, i17 + iMin2);
            }
        }
    }

    @Override
    public final void mute() {
        e7.a.m("MCImplLegacy", "Session doesn't support muting the player");
    }

    public final void n(int i10, long j9) {
        Integer num;
        Integer num2;
        int i11;
        long j10;
        long j11;
        long j12;
        int i12 = i10;
        long j13 = j9;
        ta.c0.s(i12 >= 0);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        androidx.media3.common.k2 k2Var = ((t3) this.f9570p.f14132a).f9504j;
        if ((k2Var.isEmpty() || i12 < k2Var.getWindowCount()) && !isPlayingAd()) {
            if (i12 != currentMediaItemIndex) {
                long jB = ((x3) ((t3) this.f9570p.f14132a).f9504j).b(i12);
                if (jB != -1) {
                    ((MediaController.TransportControls) this.f9565i.s().B).skipToQueueItem(jB);
                    num = 2;
                } else {
                    a1.b.y("Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", i12, "MCImplLegacy");
                    i12 = currentMediaItemIndex;
                    num = null;
                }
            } else {
                i12 = currentMediaItemIndex;
                num = null;
            }
            long currentPosition = getCurrentPosition();
            if (j13 == -9223372036854775807L) {
                num2 = null;
                j13 = currentPosition;
            } else {
                ((MediaController.TransportControls) this.f9565i.s().B).seekTo(j13);
                num2 = 1;
            }
            if (num == null) {
                long bufferedPosition = getBufferedPosition();
                long duration = getDuration();
                long jMax = j13 < currentPosition ? j13 : Math.max(j13, bufferedPosition);
                j10 = jMax;
                i11 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j11 = jMax - j13;
                j12 = duration;
            } else {
                i11 = 0;
                j10 = 0;
                j11 = 0;
                j12 = -9223372036854775807L;
            }
            t3 t3VarJ = ((t3) this.f9570p.f14132a).j(new c4(i(i12, !k2Var.isEmpty() ? k2Var.getWindow(i12, new androidx.media3.common.j2()).f1285c : null, j13, false), false, SystemClock.elapsedRealtime(), j12, j10, i11, j11, -9223372036854775807L, j12, j10));
            if (t3VarJ.A != 1) {
                t3VarJ = t3VarJ.f(2, null);
            }
            t3 t3Var = t3VarJ;
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3Var, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), num2, num);
        }
    }

    public final void o(boolean z10, ba.v0 v0Var, boolean z11, final sd.y1 y1Var, Integer num, Integer num2) {
        PlaybackException playbackExceptionO;
        final int i10;
        boolean z12;
        final int i11;
        fh.t0 t0Var = (fh.t0) y1Var.f14135d;
        ba.v0 v0Var2 = this.m;
        sd.y1 y1Var2 = this.f9570p;
        if (v0Var2 != v0Var) {
            this.m = new ba.v0(v0Var);
        }
        if (z11) {
            this.f9568n = this.m;
        }
        this.f9570p = y1Var;
        u uVar = this.f9558b;
        if (z10) {
            uVar.a();
            if (((fh.t0) y1Var2.f14135d).equals(t0Var)) {
                return;
            }
            uVar.f9523f.post(new v0(this, y1Var));
            return;
        }
        t3 t3Var = (t3) y1Var2.f14132a;
        androidx.media3.common.k2 k2Var = t3Var.f9504j;
        t3 t3Var2 = (t3) y1Var.f14132a;
        b4 b4Var = (b4) y1Var.f14137f;
        a4 a4Var = (a4) y1Var.f14133b;
        boolean zEquals = k2Var.equals(t3Var2.f9504j);
        final int i12 = 4;
        e7.p pVar = this.f9560d;
        if (!zEquals) {
            pVar.c(0, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i12) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = (CharSequence) v0Var2.f2443g;
        CharSequence charSequence2 = (CharSequence) v0Var.f2443g;
        l9.j0 j0Var = (l9.j0) v0Var.f2441e;
        boolean zEquals2 = Objects.equals(charSequence, charSequence2);
        final int i13 = 5;
        if (!zEquals2) {
            pVar.c(15, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i13) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            pVar.c(11, new ce.a(y1Var2, y1Var, num, 4));
        }
        int i14 = 13;
        if (num2 != null) {
            pVar.c(1, new ak.a(y1Var, num2, i14));
        }
        l9.j0 j0Var2 = (l9.j0) v0Var2.f2441e;
        h1.l lVar = q3.f9407a;
        boolean z13 = j0Var2 != null && j0Var2.A == 7;
        boolean z14 = j0Var != null && j0Var.A == 7;
        final int i15 = 3;
        final int i16 = 10;
        if (z13 && z14) {
            String str = e7.i0.f5136a;
            if (j0Var2.F != j0Var.F || !TextUtils.equals(j0Var2.G, j0Var.G)) {
                playbackExceptionO = p.o(j0Var, this.f9557a);
                pVar.c(10, new j7.b(3, playbackExceptionO));
                if (playbackExceptionO != null) {
                    pVar.c(10, new j7.b(4, playbackExceptionO));
                }
            }
        } else if (z13 != z14) {
            playbackExceptionO = p.o(j0Var, this.f9557a);
            pVar.c(10, new j7.b(3, playbackExceptionO));
            if (playbackExceptionO != null) {
                pVar.c(10, new j7.b(4, playbackExceptionO));
            }
        }
        if (((l9.y) v0Var2.f2442f) != ((l9.y) v0Var.f2442f)) {
            pVar.c(14, new w0(this));
        }
        if (t3Var.A != t3Var2.A) {
            final int i17 = 6;
            pVar.c(4, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i17) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9514v != t3Var2.f9514v) {
            i10 = 7;
            pVar.c(5, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i10) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        } else {
            i10 = 7;
        }
        final int i18 = 8;
        if (t3Var.f9516x != t3Var2.f9516x) {
            pVar.c(i10, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i18) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        final int i19 = 9;
        final int i20 = 12;
        if (!t3Var.f9501g.equals(t3Var2.f9501g)) {
            pVar.c(12, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i19) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9502h != t3Var2.f9502h) {
            pVar.c(8, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i16) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9503i != t3Var2.f9503i) {
            final int i21 = 11;
            pVar.c(9, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i21) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (!t3Var.f9509q.equals(t3Var2.f9509q)) {
            pVar.c(20, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i20) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9508p != t3Var2.f9508p) {
            z12 = false;
            final boolean z15 = false ? 1 : 0;
            pVar.c(21, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (z15) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        } else {
            z12 = false;
        }
        if (t3Var.f9511s.equals(t3Var2.f9511s)) {
            i11 = 1;
        } else {
            i11 = 1;
            pVar.c(29, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i11) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (t3Var.f9512t != t3Var2.f9512t || t3Var.f9513u != t3Var2.f9513u) {
            final int i22 = 2;
            pVar.c(30, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i22) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (!((androidx.media3.common.b1) y1Var2.f14134c).equals((androidx.media3.common.b1) y1Var.f14134c)) {
            pVar.c(13, new e7.m() {
                @Override
                public final void invoke(Object obj) {
                    androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
                    switch (i15) {
                        case 0:
                            d1Var.p(((t3) y1Var.f14132a).f9508p);
                            break;
                        case 1:
                            d1Var.M(((t3) y1Var.f14132a).f9511s);
                            break;
                        case 2:
                            t3 t3Var3 = (t3) y1Var.f14132a;
                            d1Var.A(t3Var3.f9512t, t3Var3.f9513u);
                            break;
                        case 3:
                            d1Var.T((androidx.media3.common.b1) y1Var.f14134c);
                            break;
                        case 4:
                            t3 t3Var4 = (t3) y1Var.f14132a;
                            d1Var.v(t3Var4.f9504j, t3Var4.f9505k);
                            break;
                        case 5:
                            d1Var.E(((t3) y1Var.f14132a).m);
                            break;
                        case 6:
                            d1Var.r(((t3) y1Var.f14132a).A);
                            break;
                        case 7:
                            d1Var.m(4, ((t3) y1Var.f14132a).f9514v);
                            break;
                        case 8:
                            d1Var.V(((t3) y1Var.f14132a).f9516x);
                            break;
                        case 9:
                            d1Var.x(((t3) y1Var.f14132a).f9501g);
                            break;
                        case 10:
                            d1Var.e(((t3) y1Var.f14132a).f9502h);
                            break;
                        case 11:
                            d1Var.w(((t3) y1Var.f14132a).f9503i);
                            break;
                        default:
                            d1Var.s(((t3) y1Var.f14132a).f9509q);
                            break;
                    }
                }
            });
        }
        if (!((a4) y1Var2.f14133b).equals(a4Var)) {
            uVar.getClass();
            ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper() ? i11 : z12 ? 1 : 0);
            uVar.f9522e.i();
        }
        if (!((fh.t0) y1Var2.f14135d).equals(t0Var)) {
            uVar.getClass();
            ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper() ? i11 : z12 ? 1 : 0);
            s sVar = uVar.f9522e;
            sVar.getClass();
            s.z();
            sVar.o();
        }
        if (b4Var != null) {
            uVar.getClass();
            boolean z16 = z12;
            if (Looper.myLooper() == uVar.f9523f.getLooper()) {
                z16 = i11;
            }
            ta.c0.A(z16);
            uVar.f9522e.getClass();
        }
        pVar.b();
    }

    public final void p(sd.y1 y1Var, Integer num, Integer num2) {
        o(false, this.m, false, y1Var, num, num2);
    }

    @Override
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override
    public final void prepare() {
        t3 t3Var = (t3) this.f9570p.f14132a;
        if (t3Var.A != 1) {
            return;
        }
        t3 t3VarF = t3Var.f(t3Var.f9504j.isEmpty() ? 4 : 2, null);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarF, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (((t3) this.f9570p.f14132a).f9504j.isEmpty()) {
            return;
        }
        k();
    }

    @Override
    public final void release() {
        Messenger messenger;
        if (this.f9567k) {
            return;
        }
        this.f9567k = true;
        l9.h hVar = this.f9566j;
        if (hVar != null) {
            l9.f fVar = (l9.f) hVar.f10149a;
            h7.b bVar = fVar.f10143f;
            if (bVar != null && (messenger = fVar.f10144g) != null) {
                try {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 7;
                    messageObtain.arg1 = 1;
                    messageObtain.replyTo = messenger;
                    ((Messenger) bVar.A).send(messageObtain);
                } catch (RemoteException unused) {
                    e7.a.h("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            fVar.f10139b.disconnect();
            this.f9566j = null;
        }
        h7.b bVar2 = this.f9565i;
        if (bVar2 != null) {
            Set set = (Set) bVar2.B;
            y0 y0Var = this.f9561e;
            if (set.remove(y0Var)) {
                try {
                    ((l9.v) bVar2.A).b(y0Var);
                    y0Var.d(null);
                } catch (Throwable th2) {
                    y0Var.d(null);
                    throw th2;
                }
            } else {
                e7.a.m("MediaControllerCompat", "the callback has never been registered");
            }
            y0Var.f9549d.removeCallbacksAndMessages(null);
            this.f9565i = null;
        }
        this.l = false;
        this.f9560d.d();
    }

    @Override
    public final void removeListener(androidx.media3.common.d1 d1Var) {
        this.f9560d.e(d1Var);
    }

    @Override
    public final void removeMediaItem(int i10) {
        removeMediaItems(i10, i10 + 1);
    }

    @Override
    public final void removeMediaItems(int i10, int i11) {
        ta.c0.s(i10 >= 0 && i11 >= i10);
        int windowCount = getCurrentTimeline().getWindowCount();
        int iMin = Math.min(i11, windowCount);
        if (i10 >= windowCount || i10 == iMin) {
            return;
        }
        x3 x3Var = (x3) ((t3) this.f9570p.f14132a).f9504j;
        x3Var.getClass();
        fh.q0 q0Var = new fh.q0(4);
        fh.t0 t0Var = x3Var.f9544a;
        q0Var.e(t0Var.subList(0, i10));
        q0Var.e(t0Var.subList(iMin, t0Var.size()));
        x3 x3Var2 = new x3(q0Var.g(), x3Var.f9545b);
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int i12 = iMin - i10;
        if (currentMediaItemIndex >= i10) {
            currentMediaItemIndex = currentMediaItemIndex < iMin ? -1 : currentMediaItemIndex - i12;
        }
        if (currentMediaItemIndex == -1) {
            currentMediaItemIndex = e7.i0.h(i10, 0, x3Var2.getWindowCount() - 1);
            e7.a.m("MCImplLegacy", "Currently playing item is removed. Assumes item at " + currentMediaItemIndex + " is the new current item");
        }
        t3 t3VarM = ((t3) this.f9570p.f14132a).m(x3Var2, currentMediaItemIndex);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarM, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (l()) {
            while (i10 < iMin && i10 < ((List) this.m.f2437a).size()) {
                this.f9565i.z(((l9.d0) ((List) this.m.f2437a).get(i10)).A);
                i10++;
            }
        }
    }

    @Override
    public final void replaceMediaItem(int i10, androidx.media3.common.q0 q0Var) {
        replaceMediaItems(i10, i10 + 1, fh.t0.s(q0Var));
    }

    @Override
    public final void replaceMediaItems(int i10, int i11, List list) {
        ta.c0.s(i10 >= 0 && i10 <= i11);
        int windowCount = ((x3) ((t3) this.f9570p.f14132a).f9504j).getWindowCount();
        if (i10 > windowCount) {
            return;
        }
        int iMin = Math.min(i11, windowCount);
        addMediaItems(iMin, list);
        removeMediaItems(i10, iMin);
    }

    @Override
    public final void seekBack() {
        ((MediaController.TransportControls) this.f9565i.s().B).rewind();
    }

    @Override
    public final void seekForward() {
        ((MediaController.TransportControls) this.f9565i.s().B).fastForward();
    }

    @Override
    public final void seekTo(int i10, long j9) {
        n(i10, j9);
    }

    @Override
    public final void seekTo(long j9) {
        n(getCurrentMediaItemIndex(), j9);
    }

    @Override
    public final void seekToDefaultPosition() {
        n(getCurrentMediaItemIndex(), 0L);
    }

    @Override
    public final void seekToDefaultPosition(int i10) {
        n(i10, 0L);
    }

    @Override
    public final void seekToNext() {
        ((MediaController.TransportControls) this.f9565i.s().B).skipToNext();
    }

    @Override
    public final void seekToNextMediaItem() {
        ((MediaController.TransportControls) this.f9565i.s().B).skipToNext();
    }

    @Override
    public final void seekToPrevious() {
        ((MediaController.TransportControls) this.f9565i.s().B).skipToPrevious();
    }

    @Override
    public final void seekToPreviousMediaItem() {
        ((MediaController.TransportControls) this.f9565i.s().B).skipToPrevious();
    }

    @Override
    public final void setAudioAttributes(androidx.media3.common.d dVar, boolean z10) {
        e7.a.m("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override
    public final void setDeviceMuted(boolean z10) {
        setDeviceMuted(z10, 1);
    }

    @Override
    public final void setDeviceMuted(boolean z10, int i10) {
        if (z10 != isDeviceMuted()) {
            t3 t3VarC = ((t3) this.f9570p.f14132a).c(getDeviceVolume(), z10);
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarC, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        ((l9.v) this.f9565i.A).f10183a.adjustVolume(z10 ? -100 : 100, i10);
    }

    @Override
    public final void setDeviceVolume(int i10) {
        setDeviceVolume(i10, 1);
    }

    @Override
    public final void setDeviceVolume(int i10, int i11) {
        androidx.media3.common.l deviceInfo = getDeviceInfo();
        int i12 = deviceInfo.f1319b;
        int i13 = deviceInfo.f1320c;
        if (i12 <= i10 && (i13 == 0 || i10 <= i13)) {
            t3 t3VarC = ((t3) this.f9570p.f14132a).c(i10, isDeviceMuted());
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarC, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        ((l9.v) this.f9565i.A).f10183a.setVolumeTo(i10, i11);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var) {
        setMediaItem(q0Var, -9223372036854775807L);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, long j9) {
        setMediaItems(fh.t0.s(q0Var), 0, j9);
    }

    @Override
    public final void setMediaItem(androidx.media3.common.q0 q0Var, boolean z10) {
        setMediaItem(q0Var);
    }

    @Override
    public final void setMediaItems(List list) {
        setMediaItems(list, 0, -9223372036854775807L);
    }

    @Override
    public final void setMediaItems(List list, int i10, long j9) {
        if (list.isEmpty()) {
            clearMediaItems();
            return;
        }
        t3 t3VarN = ((t3) this.f9570p.f14132a).n(x3.f9542c.a(0, list), new c4(i(i10, (androidx.media3.common.q0) list.get(i10), j9 == -9223372036854775807L ? 0L : j9, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarN, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (l()) {
            k();
        }
    }

    @Override
    public final void setMediaItems(List list, boolean z10) {
        setMediaItems(list);
    }

    @Override
    public final void setPlayWhenReady(boolean z10) {
        t3 t3Var = (t3) this.f9570p.f14132a;
        if (t3Var.f9514v == z10) {
            return;
        }
        this.f9571q = q3.c(t3Var, this.f9571q, this.f9572r, this.f9558b.f9524g);
        this.f9572r = SystemClock.elapsedRealtime();
        t3 t3VarD = ((t3) this.f9570p.f14132a).d(1, 0, z10);
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3VarD, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        if (!l() || ((t3) this.f9570p.f14132a).f9504j.isEmpty()) {
            return;
        }
        if (z10) {
            ((MediaController.TransportControls) this.f9565i.s().B).play();
        } else {
            ((MediaController.TransportControls) this.f9565i.s().B).pause();
        }
    }

    @Override
    public final void setPlaybackParameters(androidx.media3.common.z0 z0Var) {
        if (!z0Var.equals(getPlaybackParameters())) {
            t3 t3VarE = ((t3) this.f9570p.f14132a).e(z0Var);
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarE, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        l9.w wVarS = this.f9565i.s();
        float f3 = z0Var.f1688a;
        if (f3 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        ((MediaController.TransportControls) wVarS.B).setPlaybackSpeed(f3);
    }

    @Override
    public final void setPlaybackSpeed(float f3) {
        if (f3 != getPlaybackParameters().f1688a) {
            t3 t3VarE = ((t3) this.f9570p.f14132a).e(new androidx.media3.common.z0(f3));
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarE, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        l9.w wVarS = this.f9565i.s();
        if (f3 == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        ((MediaController.TransportControls) wVarS.B).setPlaybackSpeed(f3);
    }

    @Override
    public final void setPlaylistMetadata(androidx.media3.common.t0 t0Var) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override
    public final void setRepeatMode(int i10) {
        if (i10 != getRepeatMode()) {
            t3 t3VarI = ((t3) this.f9570p.f14132a).i(i10);
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarI, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        l9.w wVarS = this.f9565i.s();
        int iP = p.p(i10);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iP);
        wVarS.Q0("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override
    public final void setShuffleModeEnabled(boolean z10) {
        if (z10 != getShuffleModeEnabled()) {
            t3 t3VarK = ((t3) this.f9570p.f14132a).k(z10);
            sd.y1 y1Var = this.f9570p;
            p(new sd.y1(t3VarK, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        }
        l9.w wVarS = this.f9565i.s();
        fh.e1 e1Var = p.f9381a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z10 ? 1 : 0);
        wVarS.Q0("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override
    public final void setTrackSelectionParameters(androidx.media3.common.q2 q2Var) {
    }

    @Override
    public final void setVideoSurface(Surface surface) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting Surface");
    }

    @Override
    public final void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting SurfaceHolder");
    }

    @Override
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    @Override
    public final void setVideoTextureView(TextureView textureView) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override
    public final void setVolume(float f3) {
        e7.a.m("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override
    public final void stop() {
        t3 t3Var = (t3) this.f9570p.f14132a;
        if (t3Var.A == 1) {
            return;
        }
        c4 c4Var = t3Var.f9497c;
        androidx.media3.common.e1 e1Var = c4Var.f9253a;
        long j9 = c4Var.f9256d;
        long j10 = e1Var.f1187f;
        t3 t3VarJ = t3Var.j(new c4(e1Var, false, SystemClock.elapsedRealtime(), j9, j10, q3.b(j10, j9), 0L, -9223372036854775807L, j9, j10));
        t3 t3Var2 = (t3) this.f9570p.f14132a;
        if (t3Var2.A != 1) {
            t3VarJ = t3VarJ.f(1, t3Var2.f9495a);
        }
        t3 t3Var3 = t3VarJ;
        sd.y1 y1Var = this.f9570p;
        p(new sd.y1(t3Var3, (a4) y1Var.f14133b, (androidx.media3.common.b1) y1Var.f14134c, (fh.t0) y1Var.f14135d, (Bundle) y1Var.f14136e, (b4) null), null, null);
        ((MediaController.TransportControls) this.f9565i.s().B).stop();
    }

    @Override
    public final void unmute() {
        e7.a.m("MCImplLegacy", "Session doesn't support unmuting the player");
    }
}
