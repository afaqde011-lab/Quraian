package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.cast.Cast;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends t1 implements f1 {

    public final i1 f686q;

    public boolean f687r;

    public int f688s;

    public a(i1 i1Var) {
        i1Var.H();
        t0 t0Var = i1Var.f769w;
        if (t0Var != null) {
            t0Var.B.getClassLoader();
        }
        this.f832a = new ArrayList();
        this.f844o = false;
        this.f688s = -1;
        this.f686q = i1Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (i1.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f838g) {
            return true;
        }
        this.f686q.f752d.add(this);
        return true;
    }

    @Override
    public final void c(int i10, j0 j0Var, String str, int i11) {
        String str2 = j0Var.mPreviousWho;
        if (str2 != null) {
            a6.b.c(j0Var, str2);
        }
        Class<?> cls = j0Var.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = j0Var.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(j0Var);
                sb2.append(": was ");
                throw new IllegalStateException(w.c.l(sb2, j0Var.mTag, " now ", str));
            }
            j0Var.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + j0Var + " with tag " + str + " to container view with no id");
            }
            int i12 = j0Var.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + j0Var + ": was " + j0Var.mFragmentId + " now " + i10);
            }
            j0Var.mFragmentId = i10;
            j0Var.mContainerId = i10;
        }
        b(new s1(j0Var, i11));
        j0Var.mFragmentManager = this.f686q;
    }

    public final void d(int i10) {
        ArrayList arrayList = this.f832a;
        if (this.f838g) {
            if (i1.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                s1 s1Var = (s1) arrayList.get(i11);
                j0 j0Var = s1Var.f824b;
                if (j0Var != null) {
                    j0Var.mBackStackNesting += i10;
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + s1Var.f824b + " to " + s1Var.f824b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void e() {
        ArrayList arrayList = this.f832a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            s1 s1Var = (s1) arrayList.get(size);
            if (s1Var.f825c) {
                if (s1Var.f823a == 8) {
                    s1Var.f825c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = s1Var.f824b.mContainerId;
                    s1Var.f823a = 2;
                    s1Var.f825c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        s1 s1Var2 = (s1) arrayList.get(i11);
                        if (s1Var2.f825c && s1Var2.f824b.mContainerId == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int f(boolean z10, boolean z11) {
        if (this.f687r) {
            throw new IllegalStateException("commit already called");
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new d2());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f687r = true;
        boolean z12 = this.f838g;
        i1 i1Var = this.f686q;
        if (z12) {
            this.f688s = i1Var.f759k.getAndIncrement();
        } else {
            this.f688s = -1;
        }
        if (z11) {
            i1Var.x(this, z10);
        }
        return this.f688s;
    }

    public final void g(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        ArrayList arrayList = this.f832a;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f839h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f688s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f687r);
            if (this.f837f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f837f));
            }
            if (this.f833b != 0 || this.f834c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f833b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f834c));
            }
            if (this.f835d != 0 || this.f836e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f835d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f836e));
            }
            if (this.f840i != 0 || this.f841j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f840i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f841j);
            }
            if (this.f842k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f842k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s1 s1Var = (s1) arrayList.get(i10);
            switch (s1Var.f823a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + s1Var.f823a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(s1Var.f824b);
            if (z10) {
                if (s1Var.f826d != 0 || s1Var.f827e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(s1Var.f826d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(s1Var.f827e));
                }
                if (s1Var.f828f != 0 || s1Var.f829g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(s1Var.f828f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(s1Var.f829g));
                }
            }
        }
    }

    public final a h(j0 j0Var) {
        i1 i1Var = j0Var.mFragmentManager;
        if (i1Var == null || i1Var == this.f686q) {
            b(new s1(j0Var, 3));
            return this;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + j0Var.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f688s >= 0) {
            sb2.append(" #");
            sb2.append(this.f688s);
        }
        if (this.f839h != null) {
            sb2.append(" ");
            sb2.append(this.f839h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
