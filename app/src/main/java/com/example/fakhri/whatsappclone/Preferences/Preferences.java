package com.example.fakhri.whatsappclone.Preferences;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.ContentValues.TAG;

public class Preferences {
    public static void setStringPreference(String preName, String value, Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences(TAG,Context.MODE_PRIVATE).edit();
        editor.putString(preName , value);
        editor.apply();
    }
    public static void setIntPreference(String preName, int value, Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences(TAG,Context.MODE_PRIVATE).edit();
        editor.putInt(preName , value);
        editor.apply();
    }
    public static void setBooleanPreference(String preName, int value, Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences(TAG,Context.MODE_PRIVATE).edit();
        editor.putBoolean(preName , false);
        editor.apply();
    }
    public static String getStringPreference(String preName, Context context){
        SharedPreferences preferences = context.getSharedPreferences(TAG,Context.MODE_PRIVATE);
        String value = preferences.getString(preName,"");
        return value;
    }
    public static int getIntPreference(String preName, Context context){
        SharedPreferences preferences = context.getSharedPreferences(TAG,Context.MODE_PRIVATE);
        int value = preferences.getInt(preName,0);
        return value;
    }
    public static Boolean getBooleanPreference(String preName, Context context){
        SharedPreferences preferences = context.getSharedPreferences(TAG,Context.MODE_PRIVATE);
        boolean value = preferences.getBoolean(preName,false);
        return value;
    }
}
