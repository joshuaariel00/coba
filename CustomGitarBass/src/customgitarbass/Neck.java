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
public class Neck {
    private String jenisKayuNeck;
    private String jenisKayuFretboard;
    private String jenisFretboard;
    private String bentukNeck;
    private String fretboardLength;
    
    void setJenisKayuNeck(String jenisKayuNeck)throws Exception{
        if (jenisKayuNeck.equals ("maple") || jenisKayuNeck.equals("mahogany")){
            this.jenisKayuNeck = jenisKayuNeck;
        } else{
            throw new Exception ("Kayu yang anda sebutkan belum tersedia");
        }
    }
    void setJenisKayuFretboard (String jenisKayuFretboard) throws Exception{
        switch (jenisKayuFretboard) {
            case "maple":
            case "rosewood":
                this.jenisKayuFretboard = jenisKayuFretboard;
                break;
            case "mahogany":
                throw new Exception ("Kayu yang anda sebutkan belum tersedia");
        }
    }
    void setJenisFretboard(String jenisFretboard)throws Exception{
        if(jenisFretboard.equals("fretted")||jenisFretboard.equals("fretless")){
            this.jenisFretboard=jenisFretboard;
        } else{
            throw new Exception ("Jenis neck yang anda masukan salah");
        }
    }
    void setBentukNeck(String bentukNeck)throws Exception{
        if(bentukNeck.equals("c shape")||bentukNeck.equals("d shape")||bentukNeck.equals("u shape")){
            this.bentukNeck=bentukNeck;
        } else{
            throw new Exception ("Jenis neck yang anda sebutkan belum tersedia");
        }
    }
    void setFretboardLength (String fretboardLength)throws Exception{
        if(fretboardLength.equals("standar")||fretboardLength.equals("short")||fretboardLength.equals("long")){
            this.fretboardLength=fretboardLength;        
        } else{
            throw new Exception("jenis panjang fretboard tidak tersedia");
        }
    }
    
    public String getJenisFretboard(){
        return jenisFretboard;
    }
    public String getBentukNeck(){
        return bentukNeck;
    }
    public String getFretboardLength(){
        return fretboardLength;
    }
    public String getJenisKayuNeck(){
        return jenisKayuNeck;
    }
    public String getJenisKayuFretboard(){
        return jenisKayuFretboard;
    }
}
