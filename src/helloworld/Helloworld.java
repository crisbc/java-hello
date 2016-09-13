/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import static kiss.API.*;
/**
 *
 * @author Cristina
 */
public class Helloworld {
    void testRun()
    {
        outExpect("Hello!");
        run();
        outClose();
    }

    void run()
    {
        println("Hello!");
        
        //println("How are you?");      
    }
  
    void testBooleans()
    {
        assert true != false;
        assert true == true;
        try(Close out = outExpect("true")) {println(true); }
        try(Close out =outExpect("false")) {println(false);}
        
        //not
        assert !true == false;
        assert !false ==true;
        
        //and
        assert (true && true == true);
        assert(true && false == false);
        assert(false && true == false);
        assert(false && false == false);
        
        // try of and
        assert (false && (random(0,1) ==1))==false;
        assert (false && (random(0,1) ==1))==false;
        assert (false && (random(0,1) ==1))==false;
        
        assert(false && (1/0 ==3))==false;
        
        //or
        assert(true||true)==true;
        assert(true||false)==true;
        assert(false||true)==true;
        assert(false||false)==false;
        
        assert(false && (random (0,1)==1)) ==false;
        assert(false && (random (0,1)==1)) ==false;
        assert(false && (random (0,1)==1)) ==false;
        
        assert(true || ((1/0)==3))==true;
        
    }
    void sideEffect(int y)
    {
        println(y);
    }
    void testInts()
    {
        assert Integer.MAX_VALUE == Math.pow(2,31)-1;
        println(Integer.MAX_VALUE);
        
       // assert Integer.MAX_VALUE == 0b1000_0000_0000_0000_0000_0000_0000_0000;
        
        int x =3;
        int y = 0xff__ff;
        int z = 0b10_01;
        
        assert x == 3;
        assert y == 65_535;
        assert z ==9;
        
        assert Integer.toString(x,10).equals ("3");
        assert Integer.toString(y, 16).equals("ffff");
        assert Integer.toString(z, 2).equals("1001");
        
        
       // assert Integer.MIN_VALUE == 
                
                
       //mero abajo de ints
  int a =1;
  //cala los incrementors
  //add antes
  ++a;
     try (Close out = outExpect ("2")) { println(a);}
     try (Close out = outExpect ("3")) { println(++a);}
     try (Close out = outExpect ("3")) { println(a);}
     
     //add depues
    // try(Close out = outExpect ("3")) { println(a++);}
     //try(Close out = outExpect ("3")) { println(a);}
     
     //bitwise not
    assert ~0b0000_0000_0000_0000_0000_0000_1111_0000
          == 0b0000_1111_1111_1111_1111_1111_0000_1111;
     
     //bitwise and
     assert (0b1111_0000 
             & 0b1010_1010) ==
             0b1010_0000;
     
     //bitwise or
     assert (0b1111_0000 
             | 0b1010_1010) ==
             0b1111_1010;
     
     //bit shift operator right
     
     assert (0b1010_1111_0000 >> 4) ==
             0b1010_1111;
     //bit shift left
     assert (0b1010_1111_0000 << 4) ==
             0b1010_1111_0000_0000;
     
     //random gives a random number between 0 to 1,000,000
     // el bit shift todavia
     int b = random(0,1_000_000);
     println(b);
     
     assert ((b >>1) == b/2);
     assert (((-b) >> 1) == -b/2);
     assert ((b << 1) == 2*b);
     assert(((-b) << 1)== 2* (-b));
     //
     int c = random(-1_000_000,1_000_000);
     assert ((~c)+1) == -c;
     
     assert -2 == 0b1111_1111_1111_1111_1111_1111_1111_1110;
     
     //right shifts shift the sign bit in (highest order bit)
     assert (-2 >> 1) == 0b1111_1111_1111_1111_1111_1111_1111_1110;
     
     println(Integer.toString(-2, 2));
     
    }
    //conversions
    void testConvert()
    {
        
        byte x =-1;
        assert x == (byte) 0b1111_1111;
        int y =x;
        assert y == -1;
        assert 0b1111_1111_1111_1111_1111_1111_1111_1111 ==
                               (int) (byte) 0b1111_1111;
        
    }
    
    void test
}
