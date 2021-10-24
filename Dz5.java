package com.company;

import java.util.Arrays;

public class Dz5 {
    public static void main(String[] args) {
        //Задача 1. Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова:
        //исключение: лесник, ключи.
        {
            String str = "исключение";
            System.out.println(str.substring(3, 4) + str.substring(6, 7) + str.substring(1, 2)+str.substring(7,9)+str.substring(2,3));
            System.out.println(str.substring(2, 6));
        }
        //Задача 2. Дано предложение.
        //6. Дано предложение. Заменить в нем все вхождения буквосочетания бит на рог.
        {
            String str = "Любит забить гол";
            String sStr = str.replace("бит","рог");
            System.out.println(sStr);
        }

    }
}