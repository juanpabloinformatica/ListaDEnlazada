package com.JuanPablo;

import javax.swing.*;

public class Lista {
    Nodo cabeza =null;
    Nodo temp = null;

    void  crearLista(){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.num=Integer.parseInt(JOptionPane.showInputDialog("Digte un número:"));
        if(cabeza==null){
            cabeza= nuevoNodo;
            temp=cabeza;

        }else{
            temp.link=nuevoNodo;
            temp=nuevoNodo;
        }

    }
    void recorrerLista(){
        Nodo puntero = new Nodo();
        puntero = cabeza;
        while(puntero!=null){
            System.out.println(puntero.num);
            puntero=puntero.link;
        }
    }
    void ocurrencia(){
        Nodo puntero = cabeza;
        while(puntero!=null){

            Nodo temp = puntero.link;
            int cont = 0;
            while(temp!=null){
                if(puntero.num==temp.num && temp.check==false){
                    temp.check=true;
                    cont++;
                }
                temp=temp.link;
            }
            if(puntero.check==false){
                JOptionPane.showMessageDialog(null,"el numero: "+puntero.num+" se repite: "+cont);
            }
            puntero.check=true;
            puntero=puntero.link;
        }
    }
    void insertarEnPos(int elem){
        Nodo puntero = cabeza;
        while(puntero!=null){
            if(puntero.num==elem){
                Nodo nuevoNodo = new Nodo();
                nuevoNodo.num=0;
                nuevoNodo.link=puntero.link;
                puntero.link=nuevoNodo;
                puntero=nuevoNodo;
            }
            puntero=puntero.link;
        }

    }

    /*void igualRepetidos(){
        int aux,numero;
        Nodo puntero = cabeza;
        while(puntero!=null&&puntero.check==false){
            Nodo s = puntero.link;
            int cont=0;
            while(s!=null){
                if(s.num==puntero.num){
                    cont++;
                }
                s=s.link;
            }
            numero=puntero.num;
            aux=cont;
            if(aux!=0){
                cont=0;
                Nodo r = puntero.link;
                while(r!=null&&r.check==false){
                    int w=1;
                    int numerosRepetidosIgual [] = new int[10];
                    Nodo q=r.link;
                    while(q!=null&&q.check==false){
                        if(q.num==r.num){
                            cont++;
                        }
                        q=q.link;
                    }
                    if(cont==aux){

                        numerosRepetidosIgual [0] = numero;
                        numerosRepetidosIgual [w] =r.num;
                        w++;
                        puntero.check=true;
                        r.check=true;
                        s.check=true;
                    }
                    for (int i = 0; i < w; i++) {
                        System.out.println(numerosRepetidosIgual [i]+" Se repiten : "+aux);
                    }
                    r=r.link;
                }
            }
            puntero=puntero.link;

        }


    }*/
     Nodo intercambio(){
       Nodo puntero1 = cabeza;
       Nodo puntero2=cabeza.link;
       Nodo puntero3=puntero2.link;
       if(cabeza.link!=null){
           while(puntero3!=null){
               puntero2.link=puntero1;
               puntero1=puntero2;
               puntero2=puntero3;
               puntero3=puntero3.link;
           }
           puntero2.link=puntero1;
           cabeza.link=null;
           cabeza=puntero2;
       }
       return cabeza;
     }
     void llenar0(int cantidad){
         Nodo puntero = cabeza;
         while(puntero.link!=null){
             puntero=puntero.link;
         }
         int i=0;
         while(i<cantidad){
             Nodo ayuda = new Nodo();
             ayuda.num=0;
             puntero.link=ayuda;
             puntero=ayuda;
             i++;
         }
     }
     int numerodeNodos(){
         int cont=0;
         Nodo puntero = cabeza;
         while(puntero!=null){
             cont++;
             puntero=puntero.link;
         }
         return cont;
     }
}
