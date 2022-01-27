package assignone;
public class AssignOne {
    public static void main(String[] args) {
        String[] MyArray = {"kdkfjdk dfkjdkfjdk [ John 1 ]", "kjkjkjkdjfkdj [ Jane ]", "kjkj[ Selim ]"};
        System.out.print("[");
        for( int i = 0; i < MyArray.length; i++){
             String subString = MyArray[i];
            int startingIdx = subString.indexOf("[");            
            int endIdx = subString.indexOf("]");            
            String john = subString.substring(startingIdx, endIdx + 1);
            john = john.substring(1, john.length() - 1).trim();
            if (i > 0)
                System.out.print(", ");
                System.out.print(john);
         }        
        System.out.print("]");
       
    }
}
