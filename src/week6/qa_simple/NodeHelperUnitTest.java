package week6.qa_simple;

import week5.day1.MyList;

public class NodeHelperUnitTest {

    private MyList myList;

    public NodeHelperUnitTest(MyList myList) {
        this.myList = myList;
    }

    public void runAll(){
        testSimpleAdd();
        testRemove();
    }

    public void testSimpleAdd(){
        myList.add(23);
        Object res = myList.get(0);

        if(res.equals(23)){
            System.out.println("test passed!");
        } else {
            System.out.println("test failed!");
        }

    }

    public void testRemove(){
        myList.remove(0);

        if(myList.size() == 0){
            System.out.println("test passed!");
        } else {
            System.out.println("test failed!");
        }

    }


}
