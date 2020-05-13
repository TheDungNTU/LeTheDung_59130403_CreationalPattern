
package bt1;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader HDH;
    ArrayList<CTHD> DSCTHD = new ArrayList<>();

    public HoaDon(Builder builder) {
        this.HDH = builder.HDH;
        this.DSCTHD = builder.DSCTHD;
    }

    public static class Builder{
        HoaDonHeader HDH;
        ArrayList<CTHD> DSCTHD = new ArrayList<>();

        public Builder() {
        }
        
        public Builder addHoaDonHeader(HoaDonHeader HDH){
            this.HDH = HDH;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
            this.DSCTHD.add(cthd);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }

    @Override
    public String toString() {
        String s = HDH.toString();
        for(int i=0; i<DSCTHD.size(); i++){
            s += "\n"+DSCTHD.get(i).toString();
        }
        return s;
    }
    
    
}
