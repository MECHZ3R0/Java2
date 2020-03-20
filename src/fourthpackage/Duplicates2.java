package fourthpackage;

public class Duplicates2 {
    public static void dupl2(String[] arr) {
        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i].equalsIgnoreCase(arr[j])&&i!=j){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
