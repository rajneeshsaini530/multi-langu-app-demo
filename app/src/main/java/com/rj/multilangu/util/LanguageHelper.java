package com.rj.multilangu.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;

import java.util.Locale;

import static android.content.Context.MODE_PRIVATE;

public class LanguageHelper {
    private Context context;

    public LanguageHelper(Context context) {
        this.context = context;
    }

    public void setLang(String lang) {
        Locale locale = new Locale(lang);
        Locale.setDefault(locale);
        Resources res = context.getResources();
        Configuration config = new Configuration(res.getConfiguration());
        config.locale = locale;
        res.updateConfiguration(config, res.getDisplayMetrics());
        SharedPreferences sharedPreferences = context.getSharedPreferences("lang", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("lang", lang);
        editor.commit();
    }
}
