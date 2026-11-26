package androidx.media3.common;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;

public abstract class z extends c2 {
    private v0 lastTimedMetadata;
    private x livePositionSuppliers;
    private int pendingDiscontinuityReason;
    private boolean pendingFirstFrameRendered;
    private long pendingPositionDiscontinuityNewPositionMs;
    private int playWhenReadyChangeReason;
    private f1 player;
    private final d1 playerListener;

    public z(f1 f1Var) {
        super(f1Var.getApplicationLooper());
        this.player = f1Var;
        this.lastTimedMetadata = new v0(-9223372036854775807L, new u0[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new x(f1Var);
        y yVar = new y(this);
        this.playerListener = yVar;
        f1Var.addListener(yVar);
    }

    public final f1 getPlayer() {
        return this.player;
    }

    @Override
    public b2 getState() {
        a2 a2Var = new a2();
        a2Var.f1067a = b1.f1101b;
        a2Var.f1068b = false;
        a2Var.f1069c = 1;
        a2Var.f1070d = 1;
        a2Var.f1071e = 0;
        a2Var.f1072f = null;
        a2Var.f1073g = 0;
        a2Var.f1074h = false;
        a2Var.f1075i = false;
        a2Var.f1076j = 5000L;
        a2Var.f1077k = 15000L;
        a2Var.l = 3000L;
        a2Var.m = z0.f1685d;
        a2Var.f1078n = q2.J;
        a2Var.f1079o = d.f1142i;
        a2Var.f1080p = 1.0f;
        a2Var.f1081q = 1.0f;
        a2Var.f1082r = w2.f1669d;
        a2Var.f1083s = d7.c.f4764d;
        a2Var.f1084t = l.f1313e;
        a2Var.f1085u = 0;
        a2Var.f1086v = false;
        a2Var.f1087w = e7.v.f5185c;
        a2Var.f1088x = false;
        a2Var.f1089y = new v0(-9223372036854775807L, new u0[0]);
        a2Var.f1090z = fh.d2.E;
        a2Var.A = k2.EMPTY;
        a2Var.B = null;
        a2Var.C = null;
        a2Var.D = t0.K;
        a2Var.E = -1;
        a2Var.F = -1;
        a2Var.G = -1;
        a2Var.H = null;
        a2Var.I = new y1(-9223372036854775807L);
        y1 y1Var = z1.f1691b;
        a2Var.J = y1Var;
        a2Var.K = new y1(-9223372036854775807L);
        a2Var.L = y1Var;
        a2Var.M = y1Var;
        a2Var.N = false;
        a2Var.O = 5;
        a2Var.P = 0L;
        x xVar = this.livePositionSuppliers;
        if (this.player.isCommandAvailable(16)) {
            a2Var.L = xVar.f1677b;
            a2Var.J = xVar.f1676a;
        }
        if (this.player.isCommandAvailable(21)) {
            a2Var.f1079o = this.player.getAudioAttributes();
        }
        a2Var.f1067a = this.player.getAvailableCommands();
        if (this.player.isCommandAvailable(16)) {
            a2Var.K = xVar.f1679d;
            a8.i0 i0Var = xVar.f1678c;
            a2Var.H = null;
            a2Var.I = i0Var;
            if (this.player.isCommandAvailable(17)) {
                a2Var.a(this.player.getCurrentAdGroupIndex(), this.player.getCurrentAdIndexInAdGroup());
            }
        }
        if (this.player.isCommandAvailable(28)) {
            a2Var.f1083s = this.player.getCurrentCues();
        }
        if (this.player.isCommandAvailable(17)) {
            a2Var.E = this.player.getCurrentMediaItemIndex();
        }
        a2Var.f1084t = this.player.getDeviceInfo();
        if (this.player.isCommandAvailable(23)) {
            a2Var.b(this.player.getDeviceVolume());
            a2Var.f1086v = this.player.isDeviceMuted();
        }
        a2Var.f1075i = this.player.isLoading();
        a2Var.l = this.player.getMaxSeekToPreviousPosition();
        if (this.pendingFirstFrameRendered) {
            a2Var.f1088x = true;
            this.pendingFirstFrameRendered = false;
        }
        a2Var.m = this.player.getPlaybackParameters();
        a2Var.f1070d = this.player.getPlaybackState();
        a2Var.f1071e = this.player.getPlaybackSuppressionReason();
        a2Var.f1072f = this.player.getPlayerError();
        if (this.player.isCommandAvailable(17)) {
            s2 currentTracks = this.player.isCommandAvailable(30) ? this.player.getCurrentTracks() : s2.f1554b;
            t0 mediaMetadata = this.player.isCommandAvailable(18) ? this.player.getMediaMetadata() : null;
            k2 currentTimeline = this.player.getCurrentTimeline();
            a2Var.f1090z = null;
            a2Var.A = currentTimeline;
            a2Var.B = currentTracks;
            a2Var.C = mediaMetadata;
        }
        if (this.player.isCommandAvailable(18)) {
            a2Var.D = this.player.getPlaylistMetadata();
        }
        boolean playWhenReady = this.player.getPlayWhenReady();
        int i10 = this.playWhenReadyChangeReason;
        a2Var.f1068b = playWhenReady;
        a2Var.f1069c = i10;
        long j9 = this.pendingPositionDiscontinuityNewPositionMs;
        if (j9 != -9223372036854775807L) {
            int i11 = this.pendingDiscontinuityReason;
            a2Var.N = true;
            a2Var.O = i11;
            a2Var.P = j9;
            this.pendingPositionDiscontinuityNewPositionMs = -9223372036854775807L;
        }
        a2Var.f1073g = this.player.getRepeatMode();
        a2Var.f1076j = this.player.getSeekBackIncrement();
        a2Var.f1077k = this.player.getSeekForwardIncrement();
        a2Var.f1074h = this.player.getShuffleModeEnabled();
        a2Var.f1087w = this.player.getSurfaceSize();
        a2Var.f1089y = this.lastTimedMetadata;
        if (this.player.isCommandAvailable(16)) {
            a2Var.M = xVar.f1680e;
        }
        a2Var.f1078n = this.player.getTrackSelectionParameters();
        a2Var.f1082r = this.player.getVideoSize();
        if (this.player.isCommandAvailable(22)) {
            a2Var.c(this.player.getVolume());
        }
        return new b2(a2Var);
    }

    @Override
    public kh.v handleAddMediaItems(int i10, List<q0> list) {
        if (list.size() == 1) {
            this.player.addMediaItem(i10, list.get(0));
        } else {
            this.player.addMediaItems(i10, list);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleClearVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.clearVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.clearVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.clearVideoSurfaceHolder((SurfaceHolder) obj);
        } else if (obj instanceof Surface) {
            this.player.clearVideoSurface((Surface) obj);
        } else {
            if (obj != null) {
                throw new IllegalStateException();
            }
            this.player.clearVideoSurface();
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleDecreaseDeviceVolume(int i10) {
        if (this.player.isCommandAvailable(34)) {
            this.player.decreaseDeviceVolume(i10);
        } else {
            this.player.decreaseDeviceVolume();
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleIncreaseDeviceVolume(int i10) {
        if (this.player.isCommandAvailable(34)) {
            this.player.increaseDeviceVolume(i10);
        } else {
            this.player.increaseDeviceVolume();
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleMoveMediaItems(int i10, int i11, int i12) {
        if (i11 == i10 + 1) {
            this.player.moveMediaItem(i10, i12);
        } else {
            this.player.moveMediaItems(i10, i11, i12);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handlePrepare() {
        this.player.prepare();
        return kh.t.B;
    }

    @Override
    public kh.v handleRemoveMediaItems(int i10, int i11) {
        if (i11 == i10 + 1) {
            this.player.removeMediaItem(i10);
        } else {
            this.player.removeMediaItems(i10, i11);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleReplaceMediaItems(int i10, int i11, List<q0> list) {
        if (i11 == i10 + 1 && list.size() == 1) {
            this.player.replaceMediaItem(i10, list.get(0));
        } else {
            this.player.replaceMediaItems(i10, i11, list);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleSeek(int i10, long j9, int i11) {
        switch (i11) {
            case 4:
                this.player.seekToDefaultPosition();
                break;
            case 5:
                this.player.seekTo(j9);
                break;
            case 6:
                this.player.seekToPreviousMediaItem();
                break;
            case 7:
                this.player.seekToPrevious();
                break;
            case 8:
                this.player.seekToNextMediaItem();
                break;
            case 9:
                this.player.seekToNext();
                break;
            case 10:
                if (i10 != -1) {
                    this.player.seekTo(i10, j9);
                }
                break;
            case 11:
                this.player.seekBack();
                break;
            case 12:
                this.player.seekForward();
                break;
            default:
                throw new IllegalStateException();
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleSetAudioAttributes(d dVar, boolean z10) {
        this.player.setAudioAttributes(dVar, z10);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetDeviceMuted(boolean z10, int i10) {
        if (this.player.isCommandAvailable(34)) {
            this.player.setDeviceMuted(z10, i10);
        } else {
            this.player.setDeviceMuted(z10);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleSetDeviceVolume(int i10, int i11) {
        if (this.player.isCommandAvailable(33)) {
            this.player.setDeviceVolume(i10, i11);
        } else {
            this.player.setDeviceVolume(i10);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleSetMediaItems(List<q0> list, int i10, long j9) {
        boolean z10 = list.size() == 1 && this.player.isCommandAvailable(31);
        if (i10 == -1) {
            if (z10) {
                this.player.setMediaItem(list.get(0));
            } else {
                this.player.setMediaItems(list);
            }
        } else if (z10) {
            this.player.setMediaItem(list.get(0), j9);
        } else {
            this.player.setMediaItems(list, i10, j9);
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleSetPlayWhenReady(boolean z10) {
        this.player.setPlayWhenReady(z10);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetPlaybackParameters(z0 z0Var) {
        this.player.setPlaybackParameters(z0Var);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetPlaylistMetadata(t0 t0Var) {
        this.player.setPlaylistMetadata(t0Var);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetRepeatMode(int i10) {
        this.player.setRepeatMode(i10);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetShuffleModeEnabled(boolean z10) {
        this.player.setShuffleModeEnabled(z10);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetTrackSelectionParameters(q2 q2Var) {
        this.player.setTrackSelectionParameters(q2Var);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetVideoOutput(Object obj) {
        if (obj instanceof SurfaceView) {
            this.player.setVideoSurfaceView((SurfaceView) obj);
        } else if (obj instanceof TextureView) {
            this.player.setVideoTextureView((TextureView) obj);
        } else if (obj instanceof SurfaceHolder) {
            this.player.setVideoSurfaceHolder((SurfaceHolder) obj);
        } else {
            if (!(obj instanceof Surface)) {
                throw new IllegalStateException();
            }
            this.player.setVideoSurface((Surface) obj);
        }
        return kh.t.B;
    }

    public final kh.v handleSetVolume(float f3) {
        this.player.setVolume(f3);
        return kh.t.B;
    }

    @Override
    public kh.v handleSetVolume(float f3, int i10) {
        if (i10 == 0) {
            this.player.setVolume(f3);
        } else if (i10 == 1) {
            this.player.mute();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(g4.c.f(i10, "Unknown volume operation type: "));
            }
            this.player.unmute();
        }
        return kh.t.B;
    }

    @Override
    public kh.v handleStop() {
        this.player.stop();
        return kh.t.B;
    }

    public final void setPlayer(f1 f1Var) {
        f1 f1Var2 = this.player;
        if (f1Var2 == f1Var) {
            return;
        }
        if (f1Var.getApplicationLooper() != f1Var2.getApplicationLooper()) {
            throw new IllegalArgumentException("Trying to swap players with non-matching loopers.");
        }
        f1Var2.removeListener(this.playerListener);
        f1Var.addListener(this.playerListener);
        this.player = f1Var;
        this.lastTimedMetadata = new v0(-9223372036854775807L, new u0[0]);
        this.playWhenReadyChangeReason = 1;
        this.pendingDiscontinuityReason = 5;
        this.livePositionSuppliers = new x(f1Var);
        this.pendingPositionDiscontinuityNewPositionMs = f1Var.getCurrentPosition();
        invalidateState();
    }
}
