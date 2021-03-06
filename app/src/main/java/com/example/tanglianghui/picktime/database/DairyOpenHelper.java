package com.example.tanglianghui.picktime.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tanglianghui on 16/6/9.
 */
public class DairyOpenHelper extends SQLiteOpenHelper {
    /*
    *    日记表建表语句  ，保存日记  分别保存代表心情的表情代码 日期 描述文本 以及活动等
     */
    public static final String CREATE_DAIRY = "create table Dairy ("
            +"id integer primary key autoincrement, "
            +"date text, "
            +"emoji_mark integer, "
            +"activities text, "
            +"emoji_text integer,"
            +"descri text)";

    public DairyOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DAIRY);   //创建日记表

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
