

class Test {

    public static void main(String[] args){

        NumberList linkedList = new NumberList();

        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);
        linkedList.add(11);
        System.out.println("Default linked list: " + linkedList.toString());

        linkedList.addAndSort(linkedList,2);

        System.out.println("After adding: " + linkedList.toString());

        linkedList.swapValues(linkedList, 1, 5);

        System.out.println("After swapping: " + linkedList.toString());

        linkedList.clear();

        int a = linkedList.findValue(linkedList);

        System.out.println("Return value: " + a);




    }

    
}
