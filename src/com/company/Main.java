// Create an array to hold the numbers 1-10.


package com.company;

        public class Main {

            public static void main(String[] args) {



                int[] arrayNums;
                arrayNums = new int[10];


                arrayNums[0]=1;
                arrayNums[1]=2;
                arrayNums[2]=3;
                arrayNums[3]=4;
                arrayNums[4]=5;
                arrayNums[5]=6;
                arrayNums[6]=7;
                arrayNums[7]=8;
                arrayNums[8]=9;
                arrayNums[9]=10;

                int total=0;
                for(int index=0; index< arrayNums.length; index++){

                    System.out.println(arrayNums[index]);
                }


                }
            }
