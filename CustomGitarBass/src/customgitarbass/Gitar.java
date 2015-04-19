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
public class Gitar {
    private Body bodyGitar;
    private Neck neckGitar;
    private Accesories accGitar;
    
    public Body getBodyGitar(){
        return bodyGitar;
    }
    public Neck getNeckGitar(){
        return neckGitar;
    }
    public Accesories getAccGitar(){
        return accGitar;
    }
    
    void setBodyGitar(Body bodyGitar){
        this.bodyGitar=bodyGitar;
    }
    void setNeckGitar(Neck neckGitar){
        this.neckGitar=neckGitar;
    }
    void setAccGitar(Accesories accGitar){
        this.accGitar=accGitar;
    }
}
