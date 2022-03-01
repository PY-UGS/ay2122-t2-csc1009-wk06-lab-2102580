

class Test {

    public static void main(String[] args){

        NumberHash hashmap = new NumberHash();

        hashmap.put(0,1);
        hashmap.put(1,3);
        hashmap.put(2,5);
        hashmap.put(3,7);
        hashmap.put(4,9);
        hashmap.put(5,11);

        System.out.println("Default hashmap: " + hashmap.toString());

        hashmap.addAndSort(hashmap, 2);

        System.out.println("After adding: " + hashmap.toString());

        hashmap.swapValues(hashmap, 1,5);

        System.out.println("After swapping: " + hashmap.toString());

        hashmap.clear();

        int a = hashmap.findValue(hashmap);

        System.out.println("Return value: " + a);

    }
    
}
