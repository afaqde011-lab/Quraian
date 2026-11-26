package androidx.media3.cast;

import android.net.Uri;
import androidx.media3.common.d0;
import androidx.media3.common.h0;
import androidx.media3.common.i0;
import androidx.media3.common.l0;
import androidx.media3.common.q0;
import androidx.media3.common.s0;
import androidx.media3.common.t0;
import androidx.media3.common.x0;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.protobuf.RuntimeVersion;
import fh.w0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class DefaultMediaItemConverter implements MediaItemConverter {
    private static final String KEY_DRM_CONFIGURATION = "drmConfiguration";
    private static final String KEY_LICENSE_URI = "licenseUri";
    private static final String KEY_MEDIA_ID = "mediaId";
    private static final String KEY_MEDIA_ITEM = "mediaItem";
    private static final String KEY_MIME_TYPE = "mimeType";
    private static final String KEY_PLAYER_CONFIG = "exoPlayerConfig";
    private static final String KEY_REQUEST_HEADERS = "requestHeaders";
    private static final String KEY_TITLE = "title";
    private static final String KEY_URI = "uri";
    private static final String KEY_UUID = "uuid";
    private static final String TAG = "DefltMediaItemConverter";

    private static JSONObject getCustomData(q0 q0Var) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_MEDIA_ITEM, getMediaItemJson(q0Var));
            JSONObject playerConfigJson = getPlayerConfigJson(q0Var);
            if (playerConfigJson != null) {
                jSONObject.put(KEY_PLAYER_CONFIG, playerConfigJson);
            }
            return jSONObject;
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static JSONObject getDrmConfigurationJson(i0 i0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_UUID, i0Var.f1256a);
        jSONObject.put(KEY_LICENSE_URI, i0Var.f1257b);
        jSONObject.put(KEY_REQUEST_HEADERS, new JSONObject(i0Var.f1258c));
        return jSONObject;
    }

    private static q0 getMediaItem(JSONObject jSONObject, t0 t0Var) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_MEDIA_ITEM);
            d0 d0Var = new d0();
            d0Var.f1157b = Uri.parse(jSONObject2.getString(KEY_URI));
            String string = jSONObject2.getString(KEY_MEDIA_ID);
            string.getClass();
            d0Var.f1156a = string;
            d0Var.f1164i = t0Var;
            if (jSONObject2.has(KEY_MIME_TYPE)) {
                d0Var.f1158c = jSONObject2.getString(KEY_MIME_TYPE);
            }
            if (jSONObject2.has(KEY_DRM_CONFIGURATION)) {
                populateDrmConfiguration(jSONObject2.getJSONObject(KEY_DRM_CONFIGURATION), d0Var);
            }
            return d0Var.a();
        } catch (JSONException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static JSONObject getMediaItemJson(q0 q0Var) throws JSONException {
        q0Var.f1414b.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_MEDIA_ID, q0Var.f1413a);
        jSONObject.put(KEY_TITLE, q0Var.f1416d.f1627a);
        l0 l0Var = q0Var.f1414b;
        jSONObject.put(KEY_URI, l0Var.f1328a.toString());
        jSONObject.put(KEY_MIME_TYPE, l0Var.f1329b);
        i0 i0Var = l0Var.f1330c;
        if (i0Var != null) {
            jSONObject.put(KEY_DRM_CONFIGURATION, getDrmConfigurationJson(i0Var));
        }
        return jSONObject;
    }

    private static int getMediaType(q0 q0Var) {
        Integer num = q0Var.f1416d.H;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue != 1) {
                if (iIntValue == 2) {
                    return 5;
                }
                if (iIntValue != 4) {
                    if (iIntValue == 7 || iIntValue == 8) {
                        return 1;
                    }
                    if (iIntValue == 9) {
                        return 2;
                    }
                }
            }
            return 3;
        }
        l0 l0Var = q0Var.f1414b;
        String str = l0Var != null ? l0Var.f1329b : null;
        if (str == null) {
            e7.a.m(TAG, "Converting MediaItem with null MIME type and no media type. Assuming MEDIA_TYPE_MOVIE. Song metadata may not be rendered correctly by the default receiver.");
        }
        return x0.j(str) ? 3 : 1;
    }

    private static JSONObject getPlayerConfigJson(q0 q0Var) throws JSONException {
        i0 i0Var;
        String str;
        l0 l0Var = q0Var.f1414b;
        if (l0Var != null && (i0Var = l0Var.f1330c) != null) {
            UUID uuid = androidx.media3.common.h.f1217d;
            UUID uuid2 = i0Var.f1256a;
            w0 w0Var = i0Var.f1258c;
            if (!uuid.equals(uuid2)) {
                str = androidx.media3.common.h.f1218e.equals(i0Var.f1256a) ? "playready" : "widevine";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("withCredentials", false);
            jSONObject.put("protectionSystem", str);
            Uri uri = i0Var.f1257b;
            if (uri != null) {
                jSONObject.put("licenseUrl", uri);
            }
            if (!w0Var.isEmpty()) {
                jSONObject.put("headers", new JSONObject(w0Var));
            }
            return jSONObject;
        }
        return null;
    }

    private static void populateDrmConfiguration(JSONObject jSONObject, d0 d0Var) throws JSONException {
        h0 h0Var = new h0(UUID.fromString(jSONObject.getString(KEY_UUID)));
        String string = jSONObject.getString(KEY_LICENSE_URI);
        h0Var.f1223e = string == null ? null : Uri.parse(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject(KEY_REQUEST_HEADERS);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        h0Var.f1224f = w0.a(map);
        i0 i0Var = new i0(h0Var);
        d0Var.getClass();
        d0Var.f1160e = i0Var.a();
    }

    @Override
    public q0 toMediaItem(MediaQueueItem mediaQueueItem) {
        MediaInfo media = mediaQueueItem.getMedia();
        media.getClass();
        s0 s0Var = new s0();
        MediaMetadata metadata = media.getMetadata();
        if (metadata != null) {
            if (metadata.containsKey(MediaMetadata.KEY_TITLE)) {
                s0Var.f1515a = metadata.getString(MediaMetadata.KEY_TITLE);
            }
            if (metadata.containsKey(MediaMetadata.KEY_SUBTITLE)) {
                s0Var.f1520f = metadata.getString(MediaMetadata.KEY_SUBTITLE);
            }
            if (metadata.containsKey(MediaMetadata.KEY_ARTIST)) {
                s0Var.f1516b = metadata.getString(MediaMetadata.KEY_ARTIST);
            }
            if (metadata.containsKey(MediaMetadata.KEY_ALBUM_ARTIST)) {
                s0Var.f1518d = metadata.getString(MediaMetadata.KEY_ALBUM_ARTIST);
            }
            if (metadata.containsKey(MediaMetadata.KEY_ALBUM_TITLE)) {
                s0Var.f1517c = metadata.getString(MediaMetadata.KEY_ALBUM_TITLE);
            }
            if (!metadata.getImages().isEmpty()) {
                s0Var.m = metadata.getImages().get(0).B;
            }
            if (metadata.containsKey(MediaMetadata.KEY_COMPOSER)) {
                s0Var.f1538z = metadata.getString(MediaMetadata.KEY_COMPOSER);
            }
            if (metadata.containsKey(MediaMetadata.KEY_DISC_NUMBER)) {
                s0Var.B = Integer.valueOf(metadata.getInt(MediaMetadata.KEY_DISC_NUMBER));
            }
            if (metadata.containsKey(MediaMetadata.KEY_TRACK_NUMBER)) {
                s0Var.f1526n = Integer.valueOf(metadata.getInt(MediaMetadata.KEY_TRACK_NUMBER));
            }
        }
        JSONObject customData = media.getCustomData();
        customData.getClass();
        return getMediaItem(customData, new t0(s0Var));
    }

    @Override
    public MediaQueueItem toMediaQueueItem(q0 q0Var) {
        l0 l0Var = q0Var.f1414b;
        String str = q0Var.f1413a;
        l0 l0Var2 = q0Var.f1414b;
        l0Var.getClass();
        MediaMetadata mediaMetadata = new MediaMetadata(getMediaType(q0Var));
        t0 t0Var = q0Var.f1416d;
        CharSequence charSequence = t0Var.f1627a;
        if (charSequence != null) {
            mediaMetadata.putString(MediaMetadata.KEY_TITLE, charSequence.toString());
        }
        CharSequence charSequence2 = t0Var.f1632f;
        if (charSequence2 != null) {
            mediaMetadata.putString(MediaMetadata.KEY_SUBTITLE, charSequence2.toString());
        }
        CharSequence charSequence3 = t0Var.f1628b;
        if (charSequence3 != null) {
            mediaMetadata.putString(MediaMetadata.KEY_ARTIST, charSequence3.toString());
        }
        CharSequence charSequence4 = t0Var.f1630d;
        if (charSequence4 != null) {
            mediaMetadata.putString(MediaMetadata.KEY_ALBUM_ARTIST, charSequence4.toString());
        }
        CharSequence charSequence5 = t0Var.f1629c;
        if (charSequence5 != null) {
            mediaMetadata.putString(MediaMetadata.KEY_ALBUM_TITLE, charSequence5.toString());
        }
        Uri uri = t0Var.m;
        if (uri != null) {
            mediaMetadata.addImage(new qe.a(uri, 0, 0));
        }
        CharSequence charSequence6 = t0Var.A;
        if (charSequence6 != null) {
            mediaMetadata.putString(MediaMetadata.KEY_COMPOSER, charSequence6.toString());
        }
        Integer num = t0Var.C;
        if (num != null) {
            mediaMetadata.putInt(MediaMetadata.KEY_DISC_NUMBER, num.intValue());
        }
        Integer num2 = t0Var.f1638n;
        if (num2 != null) {
            mediaMetadata.putInt(MediaMetadata.KEY_TRACK_NUMBER, num2.intValue());
        }
        String string = l0Var2.f1328a.toString();
        if (str.equals(RuntimeVersion.SUFFIX)) {
            str = string;
        }
        return new MediaQueueItem.Builder(new MediaInfo.Builder(str).setStreamType(1).setContentType(l0Var2.f1329b).setContentUrl(string).setMetadata(mediaMetadata).setCustomData(getCustomData(q0Var)).build()).build();
    }
}
