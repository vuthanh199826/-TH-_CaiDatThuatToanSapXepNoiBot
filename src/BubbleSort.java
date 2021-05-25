public class BubbleSort {
    public static void main(String[] args) {
        bubleSort();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void bubleSort(){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass  = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[j]>list[j+1]){
                    int temp =list[j];
                        list[j] = list[j+1];
                        list[j+1]=temp;
                        needNextPass = true;
                }
            }
        }
    }
}
