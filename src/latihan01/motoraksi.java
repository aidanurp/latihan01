/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan01;

/**
 *
 * @author aidanurp
 */
public class motoraksi {
    private static void main(string[] args) {
        motor a = new motor();
        motor b = new motor();
        motor c = new motor();
        
        a.jenis_motor="vespa";
        a.thn_produksi="2018";
        a.jenis_transmisi="matic";
        a.harga_motor="40000000";
        a.warna_motor="black";
        
        b.jenis_motor="sport";
        b.thn_produksi="2017";
        b.jenis_transmisi="manual semi automatic";
        b.harga_motor="25000000";
        b.warna_motor="red";
        
        c.jenis_motor="scooter";
        c.thn_produksi="2017";
        c.jenis_transmisi="matic";
        c.harga_motor="14000000";
        c.warna_motor="white";
        
        a.cetakinfo();
        b.cetakinfo();
        c.cetakinfo();
        
        
        
        
        
        
    }
    
}
