package com.example.thuvienphuongnam.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.thuvienphuongnam.database.DbHelper;

public class ThuThuDao {
    DbHelper dbHelper ;

    public ThuThuDao(Context context){
        dbHelper = new DbHelper(context);
    }
    //dang nhap
    public boolean CheckThuthu(String mtt, String matkhau){
        SQLiteDatabase sqLiteDatabase = dbHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM THUTHU WHERE matt =? AND matkhau =?",new String[]{mtt,matkhau});
        if(cursor.getCount()!=0){
           return true;
        }else {
            return false;
        }
    }
}
