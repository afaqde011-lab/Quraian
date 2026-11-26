package nu;

import android.content.SharedPreferences;
import bk.m;
import com.google.gson.JsonSyntaxException;
import h00.x;
import java.util.List;

public final class d {
    public final SharedPreferences a;
    public final m b;

    public d(SharedPreferences sharedPreferences, m mVar) {
        this.a = sharedPreferences;
        this.b = mVar;
    }

    public final List a() {
        List list;
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences.getString("PLAYER_QUEUE_JSON_KEY", null);
        x xVar = x.A;
        if (string != null) {
            try {
                list = (List) this.b.e(string, new c().getType());
            } catch (JsonSyntaxException unused) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.remove("PLAYER_QUEUE_JSON_KEY");
                editorEdit.remove("PLAYING_ITEM_POSITION_KEY");
                editorEdit.remove("ITEM_DURATION_POSITION_KEY");
                editorEdit.remove("ITEM_OVERALL_DURATION_POSITION_KEY");
                editorEdit.remove("IS_FAVORITES_MIX_PLAYLIST_KEY");
                editorEdit.apply();
                list = xVar;
            }
            if (list != null) {
                return list;
            }
        }
        return xVar;
    }
}
