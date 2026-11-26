package androidx.media3.cast;

import androidx.media3.common.l2;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import e7.i0;

final class CastUtils {
    private CastUtils() {
    }

    public static String getLogString(int i10) {
        if (i10 == 0) {
            return "Success.";
        }
        if (i10 == 2100) {
            return "The in-progress request failed.";
        }
        if (i10 == 2103) {
            return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
        }
        if (i10 == 7) {
            return "Network I/O error.";
        }
        if (i10 == 8) {
            return "An internal error has occurred.";
        }
        if (i10 == 2200) {
            return "The Cast Remote Display service could not be created.";
        }
        if (i10 == 2201) {
            return "The Cast Remote Display service was disconnected.";
        }
        switch (i10) {
            case 13:
                return "An unknown, unexpected error has occurred.";
            case 14:
                return "A blocking call was interrupted while waiting and did not run to completion.";
            case 15:
                return "An operation has timed out.";
            default:
                switch (i10) {
                    case CastStatusCodes.AUTHENTICATION_FAILED:
                        return "Authentication failure.";
                    case CastStatusCodes.INVALID_REQUEST:
                        return "An invalid request was made.";
                    case CastStatusCodes.CANCELED:
                        return "An in-progress request has been canceled, most likely because another action has preempted it.";
                    case CastStatusCodes.NOT_ALLOWED:
                        return "The request was disallowed and could not be completed.";
                    case CastStatusCodes.APPLICATION_NOT_FOUND:
                        return "A requested application could not be found.";
                    case CastStatusCodes.APPLICATION_NOT_RUNNING:
                        return "A requested application is not currently running.";
                    case CastStatusCodes.MESSAGE_TOO_LARGE:
                        return "A message could not be sent because it is too large.";
                    case CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL:
                        return "A message could not be sent because there is not enough room in the send buffer at this time.";
                    default:
                        return CastStatusCodes.getStatusCodeString(i10);
                }
        }
    }

    public static long getStreamDurationUs(MediaInfo mediaInfo) {
        if (mediaInfo == null) {
            return -9223372036854775807L;
        }
        long streamDuration = mediaInfo.getStreamDuration();
        if (streamDuration != -1) {
            return i0.H(streamDuration);
        }
        return -9223372036854775807L;
    }

    private static String getUnknownMimeTypeForTrackType(int i10) {
        if (i10 == 1) {
            return "audio/x-unknown";
        }
        if (i10 == 2) {
            return "video/x-unknown";
        }
        if (i10 != 3) {
            return null;
        }
        return "text/x-unknown";
    }

    public static l2 mediaTrackToTrackGroup(String str, MediaTrack mediaTrack) {
        String unknownMimeTypeForTrackType;
        String contentType = mediaTrack.getContentType();
        int media3TrackType = toMedia3TrackType(mediaTrack.getType());
        if (media3TrackType != x0.h(contentType) && (unknownMimeTypeForTrackType = getUnknownMimeTypeForTrackType(media3TrackType)) != null) {
            contentType = unknownMimeTypeForTrackType;
        }
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.f1491a = mediaTrack.getContentId();
        sVar.l = x0.n(contentType);
        sVar.f1494d = mediaTrack.getLanguage();
        return new l2(str, new t(sVar));
    }

    private static int toMedia3TrackType(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 2;
        }
        return 1;
    }
}
