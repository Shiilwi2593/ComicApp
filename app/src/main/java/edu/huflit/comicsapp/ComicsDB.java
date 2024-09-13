package edu.huflit.comicsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class ComicsDB {
    String dbName = "ComicsDB.db";
    Context context;
    SQLiteDatabase db;

    public ComicsDB(Context context) {
        this.context = context;
    }
    public SQLiteDatabase openDB(){
        return context.openOrCreateDatabase(dbName,Context.MODE_PRIVATE,null);
    }
    public void createTable(){
        String sql = "CREATE TABLE IF NOT EXISTS tblComics(" +
                                                            "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                                                            "NAME TEXT," +
                                                            "IMAGE TEXT," +
                                                            "CATEGORY TEXT," +
                                                            "LIKES INTEGER," +
                                                            "CHAPTER TEXT," +
                                                            "INFO TEXT,"+
                                                            "AUTHOR TEXT)";
        db = openDB();
        db.execSQL(sql);
        db.close();
    }


    public int countComics(){
        String sql = "SELECT * FROM tblComics";
        db = openDB();
        Cursor cursor = db.rawQuery(sql,null);
        int count = cursor.getCount();
        return count;
    }

    //Select *
    public ArrayList<Comics> getComics(){
        ArrayList<Comics> tmp = new ArrayList<>();
        String sql = "SELECT * FROM tblComics";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String image = cursor.getString(2);
            String category = cursor.getString(3);
            int likes = cursor.getInt(4);
            String chapter = cursor.getString(5);
            String info = cursor.getString(6);
            String author = cursor.getString(7);
            Comics student = new Comics(id, name,image,category,likes,chapter,info,author);
            tmp.add(student);
        }
        db.close();
        return tmp;
    }

    // Select * From Where
    public ArrayList<Comics> getComicsWhereName(String text){
        ArrayList<Comics> tmp = new ArrayList<>();
        String sql = "SELECT * FROM tblComics WHERE NAME LIKE " + "'"+ "%" + text + "%" + "'";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String image = cursor.getString(2);
            String category = cursor.getString(3);
            int likes = cursor.getInt(4);
            String chapter = cursor.getString(5);
            String info = cursor.getString(6);
            String author = cursor.getString(7);
            Comics student = new Comics(id, name,image,category,likes,chapter,info,author);
            tmp.add(student);
        }
        db.close();
        return tmp;
    }


    //Select Sort A-Z
    public ArrayList<Comics> sortAZ(){
        ArrayList<Comics> tmp = new ArrayList<>();
        String sql = "SELECT * FROM tblComics ORDER BY NAME";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String image = cursor.getString(2);
            String category = cursor.getString(3);
            int likes = cursor.getInt(4);
            String chapter = cursor.getString(5);
            String info = cursor.getString(6);
            String author = cursor.getString(7);
            Comics student = new Comics(id, name,image,category,likes,chapter,info,author);
            tmp.add(student);
        }
        db.close();
        return tmp;
    }

    //Select Sort Z-A
    public ArrayList<Comics> sortZA(){
        ArrayList<Comics> tmp = new ArrayList<>();
        String sql = "SELECT * FROM tblComics ORDER BY NAME DESC";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String image = cursor.getString(2);
            String category = cursor.getString(3);
            int likes = cursor.getInt(4);
            String chapter = cursor.getString(5);
            String info = cursor.getString(6);
            String author = cursor.getString(7);
            Comics student = new Comics(id, name,image,category,likes,chapter,info,author);
            tmp.add(student);
        }
        db.close();
        return tmp;
    }


    //



    //Insert
    public void insertComics(String name,String image, String category,int likes,String chapter,String info,String author){
        db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("NAME",name);
        cv.put("IMAGE",image);
        cv.put("CATEGORY",category);
        cv.put("LIKES",likes);
        cv.put("CHAPTER",chapter);
        cv.put("INFO",info);
        cv.put("AUTHOR",author);
        db.insert("tblComics",null,cv);
        db.close();
    }

    //Update
    public void updateComics(int id,String name,String image, String category,int likes,String chapter,String info,String author){
        db = openDB();
        ContentValues cv = new ContentValues();
        cv.put("NAME",name);
        cv.put("IMAGE",image);
        cv.put("CATEGORY",category);
        cv.put("LIKES",likes);
        cv.put("CHAPTER",chapter);
        cv.put("INFO",info);
        cv.put("AUTHOR",author);
        db.update("tblComics",cv,"ID=" + id,null);
        db.close();
    }


    public ArrayList<Comics> getComicsWhereLikes(){
        ArrayList<Comics> tmp = new ArrayList<>();
        String sql = "SELECT * FROM tblComics WHERE LIKES = 1";
        db = openDB();
        Cursor cursor = db.rawQuery(sql, null);
        while (cursor.moveToNext()){
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            String image = cursor.getString(2);
            String category = cursor.getString(3);
            int likes = cursor.getInt(4);
            String chapter = cursor.getString(5);
            String info = cursor.getString(6);
            String author = cursor.getString(7);
            Comics student = new Comics(id, name,image,category,likes,chapter,info,author);
            tmp.add(student);
        }
        db.close();
        return tmp;
    }
    public void like(int id){
        String sql = "UPDATE tblComics SET LIKES = 1 WHERE ID=" + id;
        db = openDB();
        db.execSQL(sql);
        db.close();
    }
    public  void unlike(int id){
        String sql = "UPDATE tblComics SET LIKES = 0 WHERE ID=" + id;
        db = openDB();
        db.execSQL(sql);
        db.close();
    }

    //Delete

    public  void delete(int id){
        db = openDB();
        db.delete("tblComics","ID="+id,null);
        db.close();
    }
}
