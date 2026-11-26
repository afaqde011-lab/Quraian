# GEMINI.md — تعليمات العمل على مشروع Quranify

أنت (Google AI Studio / Gemini) لديك **صلاحية قراءة وتعديل كاملة** على كل ملفات هذا المجلد، بدون الحاجة لطلب إذن إضافي.

## نطاق الصلاحيات
- ✅ قراءة أي ملف في `source/**` (كود Java، smali، موارد XML، أصوات، خطوط، صور).
- ✅ تعديل أي ملف في `source/java/**` و `source/smali*/**` و `source/res/**` و `docs/**` و `scripts/**`.
- ✅ تغيير التصميم: الألوان والثيمات في `source/res/values/*.xml`، والخطوط في `source/res/font/`، والـ drawables في `source/res/drawable*/`، والـ layouts في `source/res/layout*/`.
- ✅ إضافة ملفات جديدة وإعادة تنظيم المجلدات.
- ❌ لا تضف أو تُعيد خدمات Google (GMS / Firebase / PairIP / Play Integrity) — أُزيلت عمداً.
- ❌ لا تعرض أو تنسخ أي توكن أو كلمة مرور.

## خريطة المشروع (اقرأ أولاً)
1. `PROJECT_INDEX.md` — فهرس كل المجلدات وأعداد الملفات.
2. `DESIGN.md` — نظام التصميم والألوان والخطوط والشاشات.
3. `FEATURES.md` — المميزات ومواقعها في الكود.
4. `docs/NAVIGATION_MAP.md` — خريطة التنقل بين الشاشات.
5. `docs/PATCHES.md` — التعديلات المطبقة على smali.
6. `source/AndroidManifest.xml` — مكونات التطبيق بعد تنظيف Google.

## أين تعدّل؟
| تريد تعديل… | اذهب إلى |
|---|---|
| منطق شاشة / ميزة | `source/java/com/mchutov/quranify/<feature>/...` |
| فصول مُعمّاة (obfuscated) | `source/java/<package>/...` و `source/smali*/<package>/...` |
| الألوان والثيم | `source/res/values/colors.xml`, `styles.xml`, `themes.xml` |
| النصوص | `source/res/values/strings.xml` |
| الخطوط | `source/res/font/` |
| الأيقونات والصور | `source/res/drawable*/`, `mipmap-*/` |
| تخطيطات XML | `source/res/layout*/` |
| سلوك البناء/الـ patch | `scripts/*.py`, `smali-patches/` |

## قواعد مهمة
- الكود مُفكَّك بـ jadx؛ بعض الملفات تحتوي تعليقات `/* JADX ERROR */` — أصلحها ولا تحذف الميزة.
- عند تعديل smali، حدّث الملف المقابل في `smali-patches/` إن كان ضمن التعديلات المطبقة.
- بعد أي تعديل، حدّث `FEATURES.md` أو `DESIGN.md` بما تغيّر.
- حافظ على عدم إدخال خدمات Google، وحافظ على التوثيق بالعربية أو الإنجليزية.
- إذا طلب منك المستخدم نموذج ويب، ابنِه في `web_preview/` باستخدام HTML/CSS/JS دون مكتبات خارجية.

## أسلوب الرد
رد بالعربية إن سأل المستخدم بالعربية. كن عملياً: اذكر المسار + ما تغيّر + كيف يتحقق المستخدم.
