package com.fatma.methotvesiniflar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    String ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("on creat çalıştı");
        testMethod();
        System.out.println(Math(3,5));
        music();
        casper();
    }

    public void casper(){
        casper pokaantas=new casper("pokaantas",23,"prenses");
        System.out.println(pokaantas.getName());
        pokaantas.setName("fatma");
        System.out.println(pokaantas.getName());

    }
    public void music(){
        Musiclas mashar= new Musiclas("mashar","gitar",65);
        System.out.println(mashar.yas);
    }

    public void testMethod(){
        ad="çarli";
        int x=4+4;
        System.out.println("x in değeri="+x);
    }
    public int Math(int a, int b){
        return a+b;
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("On Resume çalıştı");
        ad="boncuk";
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("On Stop çalıştı");
        ad="pamuk";
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("On Pause çalıştı");
        ad="prenses";
    }
}