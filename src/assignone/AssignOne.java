package assignone;
public class AssignOne {
    public static void main(String[] args) {        
        String MySentence = "kdkfjdk dfkjdkfjdk [ John 1 ] kjkjkjkdjfkdj [ Jane ] kjkjkdjfd  [ Selim ]";        
        int endIdx = -1;
        String subString = MySentence.substring(endIdx + 1);        
        System.out.print("[");
        while(subString.contains("[")) {
            int startingIdx = subString.indexOf("[");
            endIdx = subString.indexOf("]");
            String john = subString.substring(startingIdx, endIdx + 1);
            john = john.substring(1, john.length() - 1).trim();
            String [] stringArray=john.split(" ");
            subString = subString.substring(endIdx + 1);
                System.out.print(john + ", "); 
           
        }
        System.out.print("]");
        /*
        String[] sentence = {"kdkfjdk dfkjdkfjdk [ John 1 ]", "kjkjkjkdjfkdj [ Jane ]", "kjkj[ Selim ]"};
        System.out.print("[");
        for( int i = 0; i < sentence.length; i++){
             String subString = sentence[i];
            int startingIdx = subString.indexOf("[");            
            int endIdx = subString.indexOf("]");            
            String john = subString.substring(startingIdx, endIdx + 1);
            john = john.substring(1, john.length() - 1).trim();
            if (i > 0)
            System.out.print(", ");
            System.out.print(john);
         }        
        System.out.print("]");
       */
    }
}
