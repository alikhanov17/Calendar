package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.in;
public  class Main
{

    public static void main(String[] args) {


        Date d = new Date();
        SimpleDateFormat format1;
        SimpleDateFormat format2;
        format1 = new SimpleDateFormat(
                "dd.MM.yyyy hh:mm");
        format2 = new SimpleDateFormat(
                "'Day' dd 'Month' MM 'Year' yyyy 'Time' hh:mm");
        System.out.println(
                format1.format(d)  // 25.02.2013 09:03
        );
        System.out.println(
                format2.format(d)
                // День 25 Месяц 02 Год 2013 Время 09:03
        );
    }
}



