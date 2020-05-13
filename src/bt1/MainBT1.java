
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainBT1 {

    public static void main(String[] args) throws ParseException {
        HoaDonHeader HDH = new HoaDonHeader("HD01",new SimpleDateFormat("dd/mm/yyyy").parse("09/06/2020"),"Lê Thế Dũng");
        CTHD CTHD1 = new CTHD("Cà chua",20,5000,0.2);
        CTHD CTHD2 = new CTHD("Táo",10,8000,0.1);
        
        HoaDon HD = new HoaDon.Builder()
                .addHoaDonHeader(HDH)
                .addCTHD(CTHD1)
                .addCTHD(CTHD2)
                .build();
       System.out.println(HD.toString());
    }
    
}
