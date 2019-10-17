/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program User Login berbasis object
 */
public class PBOULG10115557Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   user login = new user();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String user = scanner.next();
        System.out.println("Masukan Password: ");
        String password = scanner.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
    }
}
