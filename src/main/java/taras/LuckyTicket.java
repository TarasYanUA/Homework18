package taras;

import java.util.Arrays;

public class LuckyTicket {
    private int[] ticket;

    public LuckyTicket(){
        this.ticket = new int[] {3,8,3,3,3,8};
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

    public static void main(String[] args) {
        int[] ticket = {3,8,3,3,3,8};

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<ticket.length; i++){
            if(i<ticket.length/2){
                sum1 += ticket[i];
            }
            else{
                sum2+= ticket[i];
            }
        }
        if (sum1 == sum2) {
            System.out.println("Билет счастливый: true");
        } else{
            System.out.println("Good luck next time!");
        }
    }
}
