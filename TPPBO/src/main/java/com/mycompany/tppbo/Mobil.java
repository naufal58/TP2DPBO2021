/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tppbo;

/**
 *
 * @author NAUFAL
 */

public class Mobil {
    
    private String isi_merk;
    private String isi_plat;
    private String isi_warna;
    private String combobox_jenis;
    
    public Mobil(String merk, String plat, String warna, String jenis){
        this.isi_merk = merk;
        this.isi_plat = plat;
        this.isi_warna = warna;
        this.combobox_jenis = jenis;
    }
    
    public String getMerk(){
        return this.isi_merk;
    }
    
    public String getPlat(){
        return this.isi_plat;
    }
    
    public String getWarna(){
        return this.isi_warna;
    }
    public String getJenis(){
        return this.combobox_jenis;
    }
}
