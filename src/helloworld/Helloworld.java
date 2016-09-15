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
    
    void testLoop()
    {
        try(Close out =outExpect(0,EOL,1,EOL,2,EOL,3,EOL)){
        int n =4;
        int i =0;
        while (i<n) 
            {
                println(i);
                ++i;
             }
        }
         try(Close out =outExpect(0,EOL,1,EOL,2,EOL,3,EOL)){
        int n =4;
        int i =0;
        while (i<n) 
            {
                println(i);
                if (i == 2) { ++i; continue;}
                println(i);
                ++i;
             }
        }
        
        try(Close out =outExpect(0,EOL,1,EOL,2,EOL,3,EOL)) {
        int n=4;
        for(int i = 0; i <n; ++i)
            {
                println(i);
        
            }
        }
    }
     try(Close out =outExpect(0,EOL,1,EOL,2,EOL,3,EOL)) {
        int n=4;
        for(int i = 0; i <n; ++i)
            {
                if (i==2) break;
                println(i);
        
            }
        
 
        }
     String [] words = new String[] { "this","that","other"};
     assert words[0].equals("this");
     assert words[1].equals("that");
     assert words[2].equals("other");
     assert.words.length ==3;
     
     String [] nouns = new String[3];
     assert nouns[0] == null;
     assert nouns[1]== null;
     assert nouns.length ==2;
     
     try(Close out =outExpect("this",EOL, "that",EOL,"other",EOL))
     for (int i=0; i<words.length; ++i)
     {
         println(words(i));
     }
     try(Close out =outExpect("this",EOL, "that",EOL,"other",EOL))
     for (string word: words)
     {
         println(words(i));
     }
     
     int instanceValue =0;
     
     void methodExample()
     {
     int localValue =0;
     ++instanceValue;
     ++localValue;
     println("I", instanceValue, "L", localValue);
     
     }
     
     long factorial (int n)
     {
         if (n>1)
         {
             return n*factorial(n-1);
         }
         else {
         return 1;
         }
     }
     void testFunction()
     {
         try(Close out = outExpect 
                                    ("1",1,"L",1,EOL,
                                    "1",2,"L",1, EOL,
                                    "I",3, "L",1))
                                    {
         methodExample();
         methodExample();
         methodExample();
                                    }
                                    
          assert factorial(1) == 1;
          assert factorial(5) == 120;
     }
     
     void testString()
     {
         String hi ="hello";
         assert hi.length() == 5;
         assert hi.substring(1,3).equals("el");
         
         hi = hi + "world";
         
         StringBuilder sb = new StringBuilder();
         sb.append("hello");
         sb.append("world");
         sb.append("#");
         sb.append(13);
         String hw = sb.toString();
         
         println(hw);
         
         
     }
     
     void testClock(){
         Clock clock =  untest(new Clock());
     }

}

