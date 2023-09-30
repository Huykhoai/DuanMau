package com.example.thuvienphuongnam.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.thuvienphuongnam.database.DbHelper;
import com.example.thuvienphuongnam.model.PhieuMuon;

import java.util.ArrayList;

public class PhieuMuonDao {
    DbHelper dbHelper;
    SQLiteDatabase db;
    public PhieuMuonDao(Context context){
        dbHelper = new DbHelper(context);
        db =dbHelper.getWritableDatabase();
    }
    public ArrayList<PhieuMuon> getDanhsachPhieumuon(){
        String sql ="SELECT pm.mapm, pm.matt, pm.masach, pm.ngay,pm.trasach, pm.tienthue, pm.matv  FROM PHIEUMUON pm,THUTHU tt, SACH sc, THANHVIEN tv WHERE pm.matt = tt.matt AND pm.masach = sc.masach and pm.matv = tv.matv";
        return getData(sql);
    }
    public ArrayList<PhieuMuon> getData(String sql, String...selectionArgs){
       ArrayList<PhieuMuon> list = new ArrayList<>();
       Cursor cursor = db.rawQuery(sql,selectionArgs);
       while (cursor.moveToNext()){
            list.add(new PhieuMuon(cursor.getInt(0),cursor.getString(1),cursor.getInt(2), cursor.getInt(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6) ));

       }
       return list;
    }
}
