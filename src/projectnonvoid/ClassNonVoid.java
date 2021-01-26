/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectnonvoid;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class ClassNonVoid {
    String nama, alamat, ttl,provinsi, kota,jeniskelamin, keldes, kecamatan, agama, statusperkawinan,
                pekerjaan, kewarganegaraan, berlakuhingga, nik, rt, rw;
    String judul = "KARTU TANDA PENDUDUK";
    String judul (){
        return judul;
    }
    void biodata(){
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan asal provinsi = ");
    provinsi = input.nextLine();
    System.out.println("Masukkan asal kota = ");
    kota = input.nextLine();
    System.out.println("Masukkan NIK = ");
    nik = input.nextLine();
    System.out.println("Masukkan nama = ");
    nama = input.nextLine();
    System.out.println("Masukkan tempat tanggal lahir = ");
    ttl = input.nextLine();
    System.out.println("Masukkan alamat = ");
    alamat = input.nextLine();
    System.out.println("Masukkan RT = ");
    rt = input.nextLine();
    System.out.println("Masukkan RW = ");
    rw = input.nextLine();
    System.out.println("Masukkan Kel/desa = ");
    keldes = input.nextLine();
    System.out.println("Masukkan kecamatan = ");
    kecamatan = input.nextLine();
    System.out.println("Masukkan agama = ");
    agama = input.nextLine();
    System.out.println("Masukkan Status perkawinan = ");
    statusperkawinan = input.nextLine();
    System.out.println("Masukkan Pekerjaan = ");
    pekerjaan = input.nextLine();
    System.out.println("Masukkan kewarganegaraan = ");
    kewarganegaraan = input.nextLine();  
    }
    String akhiran;
    String akhiran(){
        akhiran = "Trimakasih telah mengisi data diri anda";
        return akhiran;
        
    } //nonvoid
    String provinsi (){
        return provinsi;
    }
    String kota (){
        return kota;
    }
    String nik (){
        return nik;
    }
    String nama (){
        return nama;
    }
    String ttl (){
        return ttl;
    }
    String alamat (){
        return alamat;
    }
    String rt (){
        return rt;
    }
    String rw (){
        return rw;
    }
    String keldes (){
        return keldes;
    }
    String kecamatan (){
        return kecamatan;
    }
    String agama (){
        return agama;
    }
    String statusperkawinan (){
        return statusperkawinan;
    }
    String pekerjaan (){
        return pekerjaan;
    }
    String kewarganegaraan (){
        return kewarganegaraan;
    }
    String berlaku;
    String berlaku(){
        berlaku = "Berlaku Seumur Hidup";
                return berlaku;
    }
}
