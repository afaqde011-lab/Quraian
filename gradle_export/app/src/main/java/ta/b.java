package ta;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

public final class b extends Property {

    public final int f14428a;

    public b(Class cls, String str, int i10) {
        super(cls, str);
        this.f14428a = i10;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f14428a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f14428a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f14434a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                eVar.f14435b = iRound;
                int i10 = eVar.f14439f + 1;
                eVar.f14439f = i10;
                if (i10 == eVar.f14440g) {
                    View view = eVar.f14438e;
                    int i11 = eVar.f14434a;
                    int i12 = eVar.f14436c;
                    int i13 = eVar.f14437d;
                    b bVar = b0.f14429a;
                    view.setLeftTopRightBottom(i11, iRound, i12, i13);
                    eVar.f14439f = 0;
                    eVar.f14440g = 0;
                }
                break;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f14436c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                eVar2.f14437d = iRound2;
                int i14 = eVar2.f14440g + 1;
                eVar2.f14440g = i14;
                if (eVar2.f14439f == i14) {
                    View view2 = eVar2.f14438e;
                    int i15 = eVar2.f14434a;
                    int i16 = eVar2.f14435b;
                    int i17 = eVar2.f14436c;
                    b bVar2 = b0.f14429a;
                    view2.setLeftTopRightBottom(i15, i16, i17, iRound2);
                    eVar2.f14439f = 0;
                    eVar2.f14440g = 0;
                }
                break;
            case 2:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view3.getLeft();
                int top = view3.getTop();
                int iRound3 = Math.round(pointF3.x);
                int iRound4 = Math.round(pointF3.y);
                b bVar3 = b0.f14429a;
                view3.setLeftTopRightBottom(left, top, iRound3, iRound4);
                break;
            case 3:
                View view4 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int iRound5 = Math.round(pointF4.x);
                int iRound6 = Math.round(pointF4.y);
                int right = view4.getRight();
                int bottom = view4.getBottom();
                b bVar4 = b0.f14429a;
                view4.setLeftTopRightBottom(iRound5, iRound6, right, bottom);
                break;
            case 4:
                View view5 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound7 = Math.round(pointF5.x);
                int iRound8 = Math.round(pointF5.y);
                int width = view5.getWidth() + iRound7;
                int height = view5.getHeight() + iRound8;
                b bVar5 = b0.f14429a;
                view5.setLeftTopRightBottom(iRound7, iRound8, width, height);
                break;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
