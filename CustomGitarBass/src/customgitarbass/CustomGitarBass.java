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
public class CustomGitarBass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gitar gitar1 = new Gitar();
        Neck neckgitar1 = new Neck();
        try{
            neckgitar1.setJenisKayuNeck("maple");
            neckgitar1.setJenisKayuFretboard("maple");
            neckgitar1.setJenisFretboard("fretted");
            neckgitar1.setFretboardLength("standar");
            neckgitar1.setBentukNeck("c shape");
        }catch (Exception e){
            System.out.println("Maaf gitar: "+e.getMessage());
        }
        Body bodygitar1 = new Body();
        try{
            bodygitar1.setBentukBody("akustik");
            bodygitar1.setJenisKayuBody("poplar");
        }catch (Exception error){
            System.out.println("maaf gitar: "+error);
        }
        Accesories accgitar1 = new Accesories();
        try{
            accgitar1.setBridge("wilkinson");
            accgitar1.setKnob("dome");
            accgitar1.setNut("graphite");
            accgitar1.setPickup("humbucker");
            accgitar1.setPickupCover("pearloid");
            accgitar1.setString("daddario");
            accgitar1.setTuningMachine("grover");
        } catch(Exception e){
            System.out.println("Maaf gitar: "+e);
        }
        gitar1.setAccGitar(accgitar1);
        gitar1.setBodyGitar(bodygitar1);
        gitar1.setNeckGitar(neckgitar1);
        
        Bass bass1 = new Bass ();
        Neck neckbass1 = new Neck();
        try{
            neckbass1.setBentukNeck("c shape");
            neckbass1.setFretboardLength("standar");
            neckbass1.setJenisFretboard("fretless");
            neckbass1.setJenisKayuFretboard("rosewood");
            neckbass1.setJenisKayuNeck("Maple");
        }catch(Exception e){
            System.out.println("Maaf bass: "+e);
        }
        Body bodybass1 = new Body();
        try{
            bodybass1.setBentukBody("akustik");
            bodybass1.setJenisKayuBody("ashwood");
        }catch(Exception e){
            System.out.println("Maaf bass: "+e);
        }
        Accesories accbass1 = new Accesories();
        try{
            accbass1.setBridge("germany");
            accbass1.setKnob("speed");
            accbass1.setNut("plastic");
            accbass1.setPickup("soapbar");
            accbass1.setPickupCover("mika");
            accbass1.setString("dorazio");
            accbass1.setTuningMachine("hipshot");
        }catch(Exception e){
            System.out.println("Maaf bass: "+e);
        }
        bass1.setAccBass(accbass1);
        bass1.setBodyBass(bodybass1);
        bass1.setNeckBass(neckbass1); 
        
        cetakCustomGitar(gitar1);
    }
    static void cetakCustomGitar(Gitar gitar){
        System.out.println(gitar.getAccGitar().getBridge());
    }
}
