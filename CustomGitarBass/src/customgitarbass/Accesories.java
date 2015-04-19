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
public class Accesories {
    private String pickup;
    private String bridge;
    private String tuningMachine;
    private String knob;
    private String string;
    private String nut;
    private String pickupCover;
    
    void setPickup(String pickup) throws Exception{
        if(pickup.equals("soapbar")||pickup.equals("singel coil")||pickup.equals("humbucker")||pickup.equals("split coil")){
            this.pickup=pickup;
        } else {
            throw new Exception("jenis pickup yang anda masukan salah");
        }
    }
    void setBridge(String bridge) throws Exception{
        if(bridge.equals("wilkinson")||bridge.equals("germany")){
            this.bridge=bridge;
        } else {
            throw new Exception("jenis bridge yang anda maksudkan belum tersedia");
        }
    }
    void setTuningMachine(String tuningMachine)throws Exception{
        if(tuningMachine.equals("grover")||
                tuningMachine.equals("gotoh")||
                tuningMachine.equals("kluson")||
                tuningMachine.equals("hipshot")){
            this.tuningMachine=tuningMachine;
        } else{
            throw new Exception("jenis tuning machine yang anda sebutkan belum tersedia");
        }
    }
    void setKnob(String knob) throws Exception{
        if(knob.equals("dome")||
                knob.equals("speed")||
                knob.equals("start style")||
                knob.equals("reflector")){
            this.knob=knob;
        } else {
            throw new Exception("jenis knob yang anda sebutkan belum tersedia");
        }
    }
    void setString(String string) throws Exception{
        if(string.equals("daddario")||string.equals("drstring")||string.equals("elixir")||string.equals("dorazio")){
            this.string=string;
        } else {
            throw new Exception("jenis string yang anda masukan salah");
        }
    }
    void setNut(String nut) throws Exception{
        if(nut.equals("graphite")||nut.equals("bone")||nut.equals("plastic")){
            this.nut=nut;
        } else {
            throw new Exception("jenis nut yang anda masukan salah");
        }
    }
    void setPickupCover(String pickupCover)throws Exception{
        if(pickupCover.equals("pearloid")||pickupCover.equals("steel")||pickupCover.equals("mika")){
            this.pickupCover=pickupCover;
        }
    }
    
    public String getPickup(){
        return pickup;
    }
    public String getBridge(){
        return bridge = "standar";
    }
    public String getTuningMachine(){
        return tuningMachine= "standar";
    }
    public String getKnob(){
        return knob = "standar";
    }
    public String getNut(){
        return nut;
    }
    public String getString(){
        return string;
    }
    public String getPickupCover(){
        return pickupCover = null;
    }
}
