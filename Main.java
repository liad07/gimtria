package com.company;
import java.util.*;
public class Main {
    public static Scanner reader=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter sentence");
String str=reader.nextLine();
int sum=0,count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i==i){
            if (str.charAt(i)=='א'){
count=1;
            } if (str.charAt(i)=='ב'){
                count=2;

            } if (str.charAt(i)=='ג'){
count=3;
            } if (str.charAt(i)=='ד'){
count=4;
            } if (str.charAt(i)=='ה'){
count=5;
            } if (str.charAt(i)=='ו'){
count=6;
            } if (str.charAt(i)=='ז'){
count=7;
            } if (str.charAt(i)=='ח'){
count=8;
            } if (str.charAt(i)=='ט'){
count=9;
            } if (str.charAt(i)=='י'){
count=10;
            } if (str.charAt(i)=='כ'){
count=20;
            } if (str.charAt(i)=='ל'){
count=30;
            } if (str.charAt(i)=='מ'){
count=40;
            } if (str.charAt(i)=='נ'){
count=50;
            } if (str.charAt(i)=='ס'){
count=60;
            } if (str.charAt(i)=='ע'){
count=70;
            }if (str.charAt(i)=='פ'){
count=80;
            }if (str.charAt(i)=='צ'){
count=90;
            }if (str.charAt(i)=='ק'){
count=100;
            }if (str.charAt(i)=='ר'){
count=200;
            }if (str.charAt(i)=='ש'){
count=300;
            }
            if (str.charAt(i)=='ת'){
                count=400;
            }if (str.charAt(i)=='ך'){
count=20;
            }if (str.charAt(i)=='ם'){
count=40;
            }if (str.charAt(i)=='ן'){
count=50;
            }if (str.charAt(i)=='ף'){
count=80;
            }if (str.charAt(i)=='ץ'){
count=90;
            }
            }
            sum+=count;

        }
        System.out.println("your sentence: "+str);
        System.out.println("your gimetria: "+sum);
    }
}
