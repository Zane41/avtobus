import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введи количество мостов");
        Scanner vvod = new Scanner(System.in);
        int N=vvod.nextInt(), min = 437;
        System.out.println("Введи высоту мостов");
        for(int i=1; i<=N; i++)
            if(vvod.nextInt()>min) {
                ;if (N == i) System.out.println("NO Crash ");
            }
            else {
                System.out.println("Crash " + i);
                break;
            }
        }
        }

