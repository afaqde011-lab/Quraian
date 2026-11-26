package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import o.o;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p.e1;

public final class i extends MenuInflater {

    public static final Class[] f10982e;

    public static final Class[] f10983f;

    public final Object[] f10984a;

    public final Object[] f10985b;

    public final Context f10986c;

    public Object f10987d;

    static {
        Class[] clsArr = {Context.class};
        f10982e = clsArr;
        f10983f = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f10986c = context;
        Object[] objArr = {context};
        this.f10984a = objArr;
        this.f10985b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        ColorStateList colorStateList;
        int resourceId;
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.f10986c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f7729p);
                        hVar.f10959b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        hVar.f10960c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        hVar.f10961d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        hVar.f10962e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        hVar.f10963f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        hVar.f10964g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.a.f7730q);
                        hVar.f10966i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        hVar.f10967j = (typedArrayObtainStyledAttributes2.getInt(5, hVar.f10960c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, hVar.f10961d) & 65535);
                        hVar.f10968k = typedArrayObtainStyledAttributes2.getText(7);
                        hVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        hVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        hVar.f10969n = string == null ? (char) 0 : string.charAt(0);
                        hVar.f10970o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        hVar.f10971p = string2 == null ? (char) 0 : string2.charAt(0);
                        hVar.f10972q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            hVar.f10973r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            hVar.f10973r = hVar.f10962e;
                        }
                        hVar.f10974s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        hVar.f10975t = typedArrayObtainStyledAttributes2.getBoolean(4, hVar.f10963f);
                        hVar.f10976u = typedArrayObtainStyledAttributes2.getBoolean(1, hVar.f10964g);
                        hVar.f10977v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        hVar.f10980y = typedArrayObtainStyledAttributes2.getString(12);
                        hVar.f10978w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        hVar.f10979x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z12 = string3 != null;
                        if (z12 && hVar.f10978w == 0 && hVar.f10979x == null) {
                            hVar.f10981z = (z4.c) hVar.a(string3, f10983f, this.f10985b);
                        } else {
                            if (z12) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            hVar.f10981z = null;
                        }
                        hVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        hVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            hVar.D = e1.a(typedArrayObtainStyledAttributes2.getInt(19, -1), hVar.D);
                        } else {
                            hVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = n4.b.b(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            hVar.C = colorStateList;
                        } else {
                            hVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        hVar.f10965h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        hVar.f10965h = true;
                        SubMenu subMenuAddSubMenu = hVar.f10958a.addSubMenu(hVar.f10959b, hVar.f10966i, hVar.f10967j, hVar.f10968k);
                        hVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z11 = true;
                    }
                }
                z10 = z10;
            } else if (eventType != 3) {
                z10 = z10;
            } else {
                String name3 = xmlPullParser.getName();
                if (z11 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        hVar.f10959b = 0;
                        hVar.f10960c = 0;
                        hVar.f10961d = 0;
                        hVar.f10962e = 0;
                        hVar.f10963f = true;
                        hVar.f10964g = true;
                    } else if (name3.equals("item")) {
                        if (!hVar.f10965h) {
                            z4.c cVar = hVar.f10981z;
                            if (cVar == null || !((o) cVar).f11449b.hasSubMenu()) {
                                hVar.f10965h = true;
                                hVar.b(hVar.f10958a.add(hVar.f10959b, hVar.f10966i, hVar.f10967j, hVar.f10968k));
                            } else {
                                hVar.f10965h = true;
                                hVar.b(hVar.f10958a.addSubMenu(hVar.f10959b, hVar.f10966i, hVar.f10967j, hVar.f10968k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z10 = true;
                    }
                    z10 = z10;
                }
            }
            eventType = xmlPullParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof o.l)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f10986c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof o.l) {
                    o.l lVar = (o.l) menu;
                    if (!lVar.f11415p) {
                        lVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((o.l) menu).v();
                }
                layout.close();
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th2) {
            if (z10) {
                ((o.l) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
