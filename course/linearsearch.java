public class linearsearch {
    public static int items(String food[],String key){
        for(int i=0;i<food.length;i++){
            if(food[i].equals (key)){
                return i;
            }
        
        }
        return-1;
    }
    public static void main(String[] args) {
        String food[]={"dosa","panipuri","samosa","idly","kichidi"};
        String key="samosa";
        int index= items(food,key);
        System.out.println(index);
        if(index==-1)
        System.out.println("not found");
        else
        System.out.println(index);
        
    }
    
}
