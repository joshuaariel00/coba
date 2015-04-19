/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customgitarbass;

/**
 *
 * @author HP
 */
public class Body {
    private String jenisKayuBody;
    private String bentukBody;
    
    void setJenisKayuBody(String jenisKayuBody)throws Exception{
        if(jenisKayuBody.equals("Ashwood")||
                jenisKayuBody.equals("mahogan")||
                jenisKayuBody.equals("alder")||
                jenisKayuBody.equals("poplar")){
            this.jenisKayuBody=jenisKayuBody;
        } else {
            throw new Exception("jenis kayu yang anda maksudkan belum tersedia");
        }
    }
    void setBentukBody(String bentukBody) throws Exception{
        if(bentukBody.equals("akustik")|| bentukBody.equals("elektrik")){
            this.bentukBody=bentukBody;
        } else{
            throw new Exception("jenis body yang anda masukan salah");
        }
    }
    
    public String getJenisKayuBody(){
        return  jenisKayuBody;
    }
    public String getBentukBody(){
        return bentukBody;
    }
}
