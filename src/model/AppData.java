package model;

import java.util.ArrayList;

public class AppData {
    // اسم المستخدم الحالي (سنحتاجه لعرضه بعد تسجيل الدخول)
    public static String currentUser = "";
    
    // المظهر الحالي: true تعني المظهر الداكن، و false تعني المظهر الفاتح
    public static boolean isDarkMode = false;
    
    // قائمة لتخزين المهام مؤقتاً في الذاكرة (بديل الداتابيز)
    public static ArrayList<String> tasksList = new ArrayList<>();
    
    // تعبئة تلقائية لبيانات وهمية حتى نرى نتائج فورية عند تشغيل الواجهات
    static {
        tasksList.add("برمجة واجهة تسجيل الدخول - High");
        tasksList.add("تصميم لوحة التحكم Dashboard - Medium");
        tasksList.add("تجهيز فيديو مناقشة المشروع - Low");
    }
}