
import java.util.LinkedList;
import java.util.Collections;
import java.util.Random;

class NumberList extends LinkedList<Integer>{

    


    public LinkedList<Integer> addAndSort(LinkedList<Integer> list, int value){
        
        list.add(value);
        Collections.sort(list);
        return list;

    }

    public LinkedList<Integer> swapValues(LinkedList<Integer> list, int indexOne, int indexTwo){

        int a = list.get(indexOne);
        int b = list.get(indexTwo);
        list.set(indexOne,b);
        list.set(indexTwo,a);


        return list;

    }

    public int findValue(LinkedList<Integer> list){

        Random rand = new Random();
        int a=0;
        
        for(int i = 0 ;i<500;i++)
        {
            int randomno = rand.nextInt((9999-1000) +1 ) + 1000;
            list.add(randomno);
        }

        System.out.println("Random Generated linked list: " + list.toString());

        int randomno = rand.nextInt((9999-1000) +1 ) + 1000;

        System.out.println("Random chosen number: " + randomno);


        for(int i =0; i<500; i++)
        {
            int b = list.get(i);
            if(b == randomno)
            {
                a = i;
                break;
            }
            else
            {
                a = -1;
            }
        }

        return a;

    }



}