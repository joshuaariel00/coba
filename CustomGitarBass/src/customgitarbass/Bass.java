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
public class Bass {
    private Body bodyBass;
    private Neck neckBass;
    private Accesories accBass;
    
    public Body getBodyBass(){
        return bodyBass;
    }
    public Neck getNeckBass(){
        return neckBass;
    }
    public Accesories getAccBass(){
        return accBass;
    }
    
    void setBodyBass(Body bodyBass){
        this.bodyBass=bodyBass;
    }
    void setNeckBass(Neck neckBass){
        this.neckBass=neckBass;
    }
    void setAccBass(Accesories accBass){
        this.accBass=accBass;
    }
}
