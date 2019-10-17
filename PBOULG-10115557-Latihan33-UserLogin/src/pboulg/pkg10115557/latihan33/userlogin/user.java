/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan33.userlogin;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program User Login berbasis object
 */
class user {
    private final String username = "admin";
    private final String password = "admin";
    private boolean statusAkun;
    
    private boolean cekAkun(String userName,String password){
        if (userName.equals(username)){
            statusAkun = true;           
        }
        else if ( password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
       
}
    private void hasilLogin(boolean statusAkun, String userName){
        if(statusAkun){
            System.out.println("*****Hallo " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Oooppss,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String password){
        System.out.println(cekAkun(userName, password));
        hasilLogin(statusAkun, userName);
    }
}
