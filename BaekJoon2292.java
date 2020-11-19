// 백준 2292번 
// https://www.acmicpc.net/problem/2292

import java.util.Scanner;

public class BaekJoon2292{
    public static void main(String[] args){
        int i =0;
        int j =0;
        Scanner sc = new Scanner(System.in);

        System.out.print("방 번호를 입력하세요: ");
        int roomnumber = sc.nextInt();

        while(roomnumber<1 || 1000000000<roomnumber){
            System.out.print("1 보다 크고 1,000,000,000 작은 수를 입력하세요: ");
            roomnumber = sc.nextInt();
        }
        
        while(true){
                if(roomnumber == 1){
                    j++;
                    break;
                }
                else if(roomnumber > 6*(i+j)+1){
                    i=i+j;
                    j++;
                }
                else{
                    break;
                }
        }

        System.out.println("최소 개수의 방: " +j);
        sc.close();
    }
}