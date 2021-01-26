/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectnonvoid;

/**
 *
 * @author MOKLET-2
 */
public class ProjectNonVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassNonVoid biodata = new ClassNonVoid();
        System.out.println(biodata.judul());
        System.out.println("================================================");
        biodata.biodata();
        System.out.println(biodata.akhiran());
        System.out.println("================================================");
        System.out.println(biodata.judul());
        System.out.println("Provinsi = "+biodata.provinsi());
        System.out.println("Kota = "+biodata.kota());
        System.out.println("NIK = "+biodata.nik());
        System.out.println("Nama = "+biodata.nama());
        System.out.println("Tempat tanggal lahir = "+biodata.ttl());
        System.out.println("Alamat = "+biodata.alamat());
        System.out.println("RT / RW = "+biodata.rt+"/"+biodata.rw());
        System.out.println("Kelurahan / Desa = "+biodata.keldes());
        System.out.println("Kecamatan = "+biodata.kecamatan());
        System.out.println("Agama = "+biodata.agama());
        System.out.println("Status Perkawinan = "+biodata.statusperkawinan());
        System.out.println("Pekerjaan = "+biodata.pekerjaan());
        System.out.println("Kewarganegaraan = "+biodata.kewarganegaraan());
        System.out.println(biodata.berlaku());
    }
    
}
