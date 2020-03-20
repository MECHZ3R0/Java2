package fifthpackage;

public class Q10 {
    public static void main(String[] args) {
        char[] arr = {'H','e','l','l','0',' ','\0','f','o','l','k','s',',','\0',' ',' ',' ','H','o','w',' ','a', 'r', 'e',' ', 'y', 'o', 'u', ' ', ' ', 'a', 'l', 'l','\1'};
        System.out.println(characters(arr));
        System.out.println(words(arr));
        System.out.println(lines(arr));
    }
    public static int characters(char[] arr){
        int count=0;
        boolean check1, check2;
        for (int i=0;i<arr.length;i++){
            check1=arr[i]!='\1';
            check2=arr[i]!='\0';
            if (check1){
                if (check2) {
                    count += 1;
                }
            }
        }
        return count;
    }
    public static int words(char[] arr) {
        int count = 0;
        boolean check1, check2;
        for (int i = 0; i < arr.length - 1; i++) {
            check1 = arr[i] != '\1';
            check2 = arr[i] != '\0';
            if (check1) {
                if (check2) {
                    if (arr[i] == ' ' && arr[i + 1] != ' ')
                        count += 1;
                }
            }
        }
        return count+=1;
    }
    public static int lines(char[] arr){
        int count=0;
        boolean check;
        for (int i=0;i<arr.length;i++){
            check=arr[i]=='\0'&&arr[i]!='\1';
            if (check){
                count+=1;
            }
        }
        return count;
    }
}
