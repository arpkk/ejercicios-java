/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

/**
 *
 * @author ginaozimisa
 */
public class Ejercicio31 {
    int n;
    
    public Ejercicio31(int n){
        this.n=n;
    }
    
    public int Primo(){ 
        int numeroIn=2,count=0,i,j;
        boolean primo;
        for(i=numeroIn;i<=n;i++){
            primo=true;
            for(j=2;j<i;j++){
                if(i%j==0)
                    primo=false;
            }
            if(primo)
                count++;
        }
        return count;
    }
}