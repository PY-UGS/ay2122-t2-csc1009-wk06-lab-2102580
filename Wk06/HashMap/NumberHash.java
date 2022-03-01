import java.util.HashMap;
import java.util.Random;


class NumberHash extends HashMap<Integer,Integer>{

    public HashMap<Integer,Integer> addAndSort(HashMap<Integer,Integer> hash,int value){

        hash.put(hash.size(),value);

        boolean sort = false;
        while(!sort){
            sort = true;
            for(int i = 1; i < hash.size(); i++){
                if(hash.get(i) < hash.get(i - 1)){
                    hash = swapValues(hash, i, i - 1);
                    sort = false;
                }
            }
        }
        
        return hash;
        
        

        
    }

    public HashMap<Integer,Integer> swapValues(HashMap<Integer,Integer> hash, int indexOne,int indexTwo)
    {

        int a = (int) hash.get(indexOne);
        int b = (int) hash.get(indexTwo);
        hash.replace(indexOne,b);
        hash.replace(indexTwo, a);

        return hash;

    }

    public int findValue(HashMap<Integer,Integer> hash)
    {

        Random rand = new Random();
        int a=0;
        
        for(int i = 0 ;i<500;i++)
        {
            int randomnum = rand.nextInt((9999-1000) +1 ) + 1000;
            hash.put(i, randomnum);
        }

        System.out.println("Random Generated hashmap: " + hash.toString());

        int randomno = rand.nextInt((9999-1000) +1 ) + 1000;

        System.out.println("Random chosen number: " + randomno);


        for(int i =0; i<500; i++)
        {
            int b = hash.get(i);
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