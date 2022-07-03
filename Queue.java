/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Yopi
 */
public class Queue {
    String name, necessity;
    int id;
    Queue next;
    static Scanner inputInt = new Scanner(System.in);
    static Scanner inputStr = new Scanner(System.in);

    public void input(){
        System.out.print("Masukkan id        : ");
        id = inputInt.nextInt();
        System.out.print("Masukkan nama      : ");
        name = inputStr.nextLine();
        System.out.print("Masukkan keperluan : ");
        necessity = inputStr.nextLine();
    }

    public void read(){
        System.out.println("|| " + id + "\t|| " + name + " \t|| " +necessity+" \t\t|| ");
    }

    public static void main(String[] args) {
        Linked queue = new Linked();
        int menu = 0;
        while(menu != 4){
            System.out.print("1. Pengambilan Nomer Antri\n2. Pemanggilan Nomer Antri\n3. Daftar Antrian\n4. Exit\npilih : ");
            menu = inputInt.nextInt();
            if (menu == 1){
                queue.add();
            } else if (menu == 2){
                queue.remove();
            } else if (menu == 3) {
                queue.peek();
            } else if (menu == 4) {
                System.out.println("Keluar");
            }else {
                System.out.println("Salah Menginput");
            }}}}
        
    

class Linked{
    Queue head, tail;
    public Linked(){
        head = null;
        tail = null;
    }
    public void add() {
        Queue baru = new Queue();
        baru.input();
        if(head == null){
            head = baru;
        }else {
            tail.next=baru;
        }
        tail=baru;
    }
    public void remove() {
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("Keluar Data Dengan Id : "+head.id);
            head=head.next;
        }
    }

    public void peek() {
        if(head==null)System.out.println("- Kosong -");
        else{
            System.out.println("|| Id \t|| Nama \t|| Keperluan \t||");
            for(Queue a=head; a!=null; a=a.next) a.read();
        }}}
    

    

