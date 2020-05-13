
package bt2;

public class MainBT2 {

   
    public static void main(String[] args) {
        MyStringBuilder myString = new MyStringBuilder.Builder()
                                       .addString("\nXin chào các bạn")
                                       .addString("\ntôi là Lê Thế Dũng")
                                       .addString("\nĐiểm môn toán:")
                                       .addFloat((float)8.9)
                                       .addString("\nGiới tính: ")
                                       .addBool(true)
                                       .build();
        System.out.println(myString.toString());
                
    }
    
}
