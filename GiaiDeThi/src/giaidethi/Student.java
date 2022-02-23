/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaidethi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author at160
 */
public class Student extends Person{
    String maSV;
    String eMail;
    int diemTK;

    public Student() {
    }

    public Student(String maSV, String eMail, int diemTK) {
        this.maSV = maSV;
        this.eMail = eMail;
        this.diemTK = diemTK;
    }

    public Student(String maSV, String eMail, int diemTK, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSV = maSV;
        this.eMail = eMail;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(int diemTK) {
        this.diemTK = diemTK;
    }

    @Override
    public String toString() {
        return super.toString()+"-"+maSV+ "-" + eMail + "-" + diemTK ;
    }
    public void ghifile(){
        try{
        File f=new File("data.txt");
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);
         
        
        
        bw.write(this.toString());
        
        bw.close();
        fw.close();
        }catch(Exception e){
            
        }
    }
    

}
