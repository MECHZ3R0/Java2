package fourthpackage;

public class Duplicates {
    public static void main(String[] args) {
        String[] arr={"aa","bb","cc","dd","aa","cc"};
        //dupl(arr);
        Duplicates2.dupl2(arr);
    }
    public static void dupl(String[] arr){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i!=j) {
                    if (arr[i].equalsIgnoreCase(arr[j])) {
                        System.out.println(arr[j]);
                    }
                }
            }
        }
    }
}
