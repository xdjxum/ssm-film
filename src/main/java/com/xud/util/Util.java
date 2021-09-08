package com.xud.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Random;

public class Util {
    public static String getSeat(String jsSeat,String ormSeat){
        ObjectMapper objectMapper=new ObjectMapper();
        String valueAsString = null;
        try {
            int[][] value=objectMapper.readValue(ormSeat,int[][].class);
            String[] s=jsSeat.split(";");
            for (int i=0;i<s.length;i++){
                String[] s2=s[i].split(",");
                value[Integer.parseInt(s2[0])][Integer.parseInt(s2[1])]=2;
            }
           valueAsString=objectMapper.writeValueAsString(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return valueAsString ;
    }
    public static  String getForderId(){
        String str="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm123456789";
        char[] chars=str.toCharArray();
        char[] chars1=new char[10];
        Random random=new Random();
        for (int i=0;i<10;i++){
            int num=random.nextInt(61);
            chars1[i]=chars[num];
        }
        return new String(chars1);
    }
    public static String getCntAndSeat(String jsSeat,int[] cnt){
        String s="";
        String[] sea1=jsSeat.split(";");
        cnt[0]= sea1.length;
        for (int i=0;i<sea1.length;i++){
            String str[]=sea1[i].split(",");
            int p=Integer.parseInt(str[0])+1;
            int z=Integer.parseInt(str[1])+1;
            s=s+p+"排"+z+"座,";
        }s=s.substring(0,s.length()-1);
        System.out.println(s);
        return s;
    }
}
