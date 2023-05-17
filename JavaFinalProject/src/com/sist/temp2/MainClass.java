package com.sist.temp2;

import java.util.*;


public class MainClass {
	

	public static int[] solution(String[] park, String[] routes) {
        
        int r = 0, c = 0;
        List<Integer> br = new ArrayList<Integer>();
        List<Integer> bc = new ArrayList<Integer>();
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[i].length();j++){
                if(String.valueOf(park[i].charAt(j)).equals("S") ){
                    r=i;
                    c=j;
                } else if(String.valueOf(park[i].charAt(j)).equals("X")){
                    br.add(i);
                    bc.add(j);
                }
                
                
            }
        }
        
        for(int i=0;i<routes.length;i++){
            int go = routes[i].charAt(routes[i].length()-1) - '0';
            
            switch(String.valueOf(routes[i].charAt(0))){
                case "N":{
                    if(r-go < 0){
                        continue;
                    } else {
                    	boolean bCheck=false;
                        for(int j=0;j<br.size();j++){
                            if(r-go==br.get(j) && c==bc.get(j)){
                                bCheck=true;
                                break;
                            }
                        }
                        if(bCheck) continue;
                        r = r-go;
                    }
                    
                } break;
                case "S":{
                    if(r+go > routes.length-1){
                        continue;
                    } else {
                        boolean bCheck=false;
                        for(int j=0;j<br.size();j++){
                            if(r+go==br.get(j) && c==bc.get(j)){
                                bCheck=true;
                                break;
                            }
                        }
                        if(bCheck) continue;
                        r = r+go;
                    }
                    
                } break;
                case "E":{
                    if(c+go > routes[i].length()-1){
                        continue;
                    } else {
                        boolean bCheck=false;
                        for(int j=0;j<br.size();j++){
                            if(c+go==bc.get(j) && r==br.get(j)){
                                bCheck=true;
                                break;
                            }
                        }
                        if(bCheck) continue;
                        c = c+go;
                    }
                    
                } break;
                case "W":{
                    if(c-go < 0){
                        continue;
                    } else {
                        boolean bCheck=false;
                        for(int j=0;j<br.size();j++){
                            if(c-go<=bc.get(j) && r==br.get(j)){
                                bCheck=true;
                                break;
                            }
                        }
                        if(bCheck) continue;
                        c = c-go;
                    }
                    
                } break;
            }
            System.out.println("r="+r+", c=" + c);
        }
        int[] answer = {r,c};
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] park = {"SOO", "OXX", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		
		System.out.println(Arrays.toString(solution(park, routes)));
		
		
	}
}
