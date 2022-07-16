package taras;

import java.util.ArrayList;
import java.util.Arrays;

public class LuckyTicket {
    private int[] ticket;

    public LuckyTicket() {
        this.ticket = new int[]{3, 8, 3, 3, 3, 8};
    }

    public int[] getTicket() {
        return ticket;
    }

    public void setTicket(int[] ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return Arrays.toString(ticket);
    }

    public static int[] resultArray (int[] tickets) {
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i < tickets.length / 2) {
                num1 += tickets[i];
            } else {
                num2 += tickets[i];
            }
        }

        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        for (int i : tickets) {
            int length = 7;
            if (length < num1) {
                resultArray.add(i);
            }
        }

        //вернуть переменную нужного формата
        int[] array = new int[resultArray.size()];
        for (int i=0; i < array.length; i++){
            array[i] = Integer.parseInt(String.valueOf(resultArray.get(i)));
        }
        return array;
    }


        public static void main (String[]args){
            int[] ticket = {3, 8, 3, 3, 3, 8};

            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < ticket.length; i++) {
                if (i < ticket.length / 2) {
                    sum1 += ticket[i];
                } else {
                    sum2 += ticket[i];
                }
            }
            if (sum1 == sum2) {
                System.out.println("Билет счастливый: true");
            } else {
                System.out.println("Good luck next time!");
            }
        }
    }
