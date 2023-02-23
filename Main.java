import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> array=new ArrayList<>();
        System.out.println("enter number of teams");
        int team_num=sc.nextInt();
        int s=0;
        while(s<team_num){
            array.add(sc.next());
            s++;
        }
        schedule sew=new schedule();
        winloss  win=new winloss();
        
        System.out.println(sew.scheduler(array,team_num));
        win.winnerlooser(array,team_num);



    }
    
}
class schedule{
    List scheduler(List<String> arr,int team_num){
        Scanner sc=new Scanner(System.in);
        
        ArrayList<String> matches=new ArrayList<>();
         for(int i=0;i<team_num;i++){
            for(int j=i+1;j<team_num;j++){
                matches.add(arr.get(i)+"vs"+arr.get(j));
            }
         }
         return matches;
    }
}
class winloss{
        void winnerlooser(List<String> arr,int team_num){
         ArrayList<Integer> nums=new ArrayList<Integer>();
         for(int i=0;i<10;i++)
         {
            nums.add(i);
         }
         for(int i=0;i<nums.size();i++){
            if(i<team_num){
                System.out.println(arr.get(i));
            }
            for(int j=0;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)==team_num-1){
                    System.out.println("win:"+nums.get(i));
                    System.out.println("loose:"+nums.get(j));
                    break;
                }

            }
        }    
    }                
    
    
}
