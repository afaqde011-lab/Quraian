# DESIGN.md — نظام التصميم والموارد البصرية

هذا الملف يشرح أين تقرأ وتعدّل **تصميم** التطبيق. لديك صلاحية كاملة لتعديل كل ما يلي.

## 1) الألوان والثيم
- `source/res/values/colors.xml` — كل الألوان (Material + ألوان التطبيق).
- `source/res/values/styles.xml` — الـ styles والـ themes.
- `source/res/values-night/` — نسخة الوضع الليلي.
- `source/res/color/` و `color-night/` — color state lists.

أمثلة موجودة: `#6200ee` (primary)، `#3700b3` (primary dark)، `#ba86fc` (dark primary)، `#d0021b` (cast live indicator)، `#fec92f` (cast accent).

## 2) الخطوط
- `source/res/font/` — ملفات الخطوط (TTF). غيّر الخط هنا ثم حدّث مراجع `@font/...` في `styles.xml`.

## 3) الأيقونات والصور
- `source/res/drawable/` و `drawable-hdpi/` و `drawable-xxxhdpi/` و `drawable-anydpi/` — أيقونات/خلفيات.
- `source/res/mipmap-*/` — أيقونة التطبيق (launcher).
- `source/assets/flags/` — أعلام القرّاء (SVG).
- `source/assets/audio/` — مؤثرات صوتية (MP3).

## 4) التخطيطات
- `source/res/layout/` و `layout-land/` و `layout-sw600dp/` و `layout-watch/` — تخطيطات XML.
- معظم الواجهة مبنية بـ **Jetpack Compose** في `source/java/com/mchutov/quranify/**` (ابحث عن `Compose`, `Screen`, `Effect`).

## 5) الشاشات (من docs/NAVIGATION_MAP.md)
Onboarding → Auth gate → Main tabs (Home, Reciters, Playlists, Insights, Search, Settings) → Player overlays (BottomSheet / FullScreen / Tafsir / SoundEffect) → Audio Stories / Widgets / Deep links.

## 6) كيف تعدّل التصميم بسهولة
1. افتح `source/res/values/colors.xml` وغيّر القيم.
2. افتح الملف المقابل في `source/java/com/mchutov/quranify/<feature>/...` لتعديل الـ Compose UI.
3. راجع `docs/NAVIGATION_MAP.md` عشان ما تكسرش مسار التنقل.
4. حدّث هذا الملف بملخص التغيير.

## 7) قيود
- لا تضف أي مورد أو مكوّن من Google (GMS/Firebase/PairIP).
- حافظ على أسماء الموارد المستخدمة في الكود أو حدّث كل مراجعها معاً.
