import java.util.ArrayList;

public class removeEven{
    public static void Remove(ArrayList<Integer>list){
            for(int i = list.size() - 1;i>=0;i--){
                if((list.get(i) % 2) == 0){
                    list.remove(i);
                }
            }
            System.out.print(list);
        }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(99);
        list.add(100);
        list.add(77);
        list.add(83);
        list.add(50);
        list.add(99);
        list.add(100);
        System.out.println(list);

        Remove(list);
        

    }
}