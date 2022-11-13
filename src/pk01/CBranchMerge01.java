package pk01;

public class CBranchMerge01 {

    private static void doMaster01(){
        System.out.println("first method in branch master");
    }
    private static void doMaster02(){
        System.out.println("second method in branch master");
    }
    private static void doMaster03(){
        System.out.println("change third method in branch b01 second time");
    }
    private static void doMaster04(){
        System.out.println("fourth method in branch b01 added");
    }
    public static void main(String[] args) {
        doMaster01();
    }
}
