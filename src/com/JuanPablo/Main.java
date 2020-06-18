package com.JuanPablo;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
      /*  String palabra = "1234";
       int juanvalor= Integer.parseInt(palabra);
       juanvalor=juanvalor*2;
        System.out.println(juanvalor);*/
       /* char c='a';
        int c2=c;
        System.out.println(c2);*/
       /* Stack pila = new Stack();
        pila.push(1);
        pila.push(2);
        int x= (int) pila.get(1);
        int y= (int)  pila.get(0);
        System.out.println(x+y);*/

        /*pila.push(1);
        pila.pop();
        System.out.println(pila);*/
        Stack pila1= new Stack();
        Stack pila2= new Stack();
        Stack pila3= new Stack();
        pila1.push(3);
        pila1.push(2);
        pila1.push(1);
        pila2.push(3);
        pila2.push(4);
        pila2.push(6);
        int x=((int)pila1.get(2)+(int)pila2.get(2));
        pila3.push(((int)pila1.get(0)+(int)pila2.get(0)));
        pila3.push(((int)pila1.get(1)+(int)pila2.get(1)));
        pila3.push(((int)pila1.get(2)+(int)pila2.get(2)));
        System.out.println(pila1);
        System.out.println(pila2);
        System.out.println(pila3);
        Queue<Integer> cola = new ArrayDeque<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        System.out.println(cola);
   /*     byte x=  127;
        System.out.println(x);
        Nodo ptr1=null;
        Nodo ptr2 = null;
        Lista l = new Lista();
        Lista l2 = new Lista();*/
        //Creación de lista 1//
  /*      int i =2;
        while(i>0){
            l.crearLista();

            i--;
        }
        //Creación de lista 2//
         i =2;
        while(i>0){
            if(i==2){
                JOptionPane.showMessageDialog(null,"lista numero 2");
            }

            l2.crearLista();

            i--;
        }*/
      /*  ptr1=l.intercambio();
        ptr2=l2.intercambio();*/
        //LLenar de 0 la lista que tenga menos nodos//
       /* if(l.numerodeNodos()<l2.numerodeNodos()){
            l.llenar0(l2.numerodeNodos()-l.numerodeNodos());
        }else if(l.numerodeNodos()>l2.numerodeNodos()){
            l2.llenar0(l.numerodeNodos()-l2.numerodeNodos());
        }*/
        /*suma(ptr1,ptr2);*/
        /*l.recorrerLista();
        System.out.println("");
        System.out.println(l.numerodeNodos());
        System.out.println("\n");
        l2.recorrerLista();
        System.out.println("");
        System.out.println(l2.numerodeNodos());*/

        // Suma de dos listas//


       // l.ocurrencia();
        //l.insertarEnPos(3);
        /*l.igualRepetidos();*/
       /* l.intercambio();
        l.recorrerLista();*/


    }
  /* public static void suma(Nodo cabeza1,Nodo cabeza2){
        int temp;
        Nodo puntero1=cabeza1;
        Nodo puntero2=cabeza2;
        int agregar=0;
        while(puntero1.link!=null){
            puntero1.num=puntero1.num+puntero2.num+agregar;
            temp=puntero1.num;
            if(puntero1.num>=10){
                puntero1.num=puntero1.num%10;

            }
            agregar=temp/10;
            puntero1=puntero1.link;
            puntero2=puntero2.link;
        }

        puntero1.num=puntero1.num+puntero2.num+agregar;
        int div,res;
        if(puntero1.num>=10){
            Nodo nuevoNodo=new Nodo();
            puntero1.link=nuevoNodo;
            int x=puntero1.num;
            res=x%10;
            puntero1.num=res;
            div=x/10;
            nuevoNodo.num=div;

        }

        Nodo p = cabeza1;
        StringBuffer sb = new StringBuffer();
        sb.append("\n");
        int numerosal[]=new int[10];
        int r=0;
        while(p!=null){
            sb.append(p.num+",");
            numerosal[r]=p.num;
            r++;
            p=p.link;

        }
       for (int i = r-1; i >=0; i--) {
           System.out.println(numerosal[i]);
       }
       System.out.println(sb.toString());
    }*/
}
