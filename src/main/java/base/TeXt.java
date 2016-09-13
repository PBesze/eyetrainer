
package base;

import java.io.Serializable;

public class TeXt implements Serializable {
	private static final long serialVersionUID = 1L;
	public String chaR1,chaR2,chaR3,chaR4 ;
	public int size;
	

    public TeXt(int size, String chaR1,  String chaR2,  String chaR3, String chaR4) {
		this.size = size;
		this.chaR1 = chaR1;
		this.chaR2 = chaR2;
		this.chaR3 = chaR3;
		this.chaR4 = chaR4;
		
	}
	
	public int getSize() {
		return size;
	}

	public void setId(int size) {
		this.id = size;
	}

	public String getChaR1() {
		return chaR1;
	}

	public void setChaR1(String chaR1) {
		this.chaR1 = chaR1;
	}

//    @Override
//    public String toString() {
//  	return "Car{" + "id=" + id + ", year=" + year + ", modul=" + modul + ", brand=" + brand + ", color=" + color +  '}';
    }
 

