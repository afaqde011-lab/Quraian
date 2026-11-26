package e00;

import a40.c0;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import g00.b0;
import ri.t1;

public final class v {
    public final long a;
    public final ScriptIntrinsicBlur b;
    public final Allocation c;
    public final Allocation d;
    public final Bitmap e;
    public final c40.h f;
    public volatile boolean g;

    public v(RenderScript rs2, long j) {
        kotlin.jvm.internal.m.e(rs2, "rs");
        this.a = j;
        this.f = t1.b(-1, 6, (c40.a) null);
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        Allocation allocationCreateTyped = Allocation.createTyped(rs2, new Type.Builder(rs2, Element.U8_4(rs2)).setX(i).setY(i2).create(), 33);
        kotlin.jvm.internal.m.d(allocationCreateTyped, "createTyped(...)");
        this.c = allocationCreateTyped;
        allocationCreateTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() {
            @Override
            public final void onBufferAvailable(Allocation allocation) {
                v vVar = this.a;
                if (vVar.g) {
                    return;
                }
                allocation.ioReceive();
                c40.h hVar = vVar.f;
                Object objJ = hVar.j(b0.a);
                if (!(objJ instanceof c40.n)) {
                } else {
                    Object obj = ((c40.o) c0.C(k00.j.A, new a1.d(hVar, (k00.c) null, 22))).a;
                }
            }
        });
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.e = bitmapCreateBitmap;
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(rs2, bitmapCreateBitmap);
        kotlin.jvm.internal.m.d(allocationCreateFromBitmap, "createFromBitmap(...)");
        this.d = allocationCreateFromBitmap;
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(rs2, Element.U8_4(rs2));
        kotlin.jvm.internal.m.d(scriptIntrinsicBlurCreate, "create(...)");
        this.b = scriptIntrinsicBlurCreate;
        scriptIntrinsicBlurCreate.setInput(allocationCreateTyped);
    }

    public final void a() {
        this.g = true;
        this.b.destroy();
        this.c.destroy();
        this.d.destroy();
    }
}
