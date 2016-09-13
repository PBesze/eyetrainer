
package base;

import java.io.Serializable;

public class TeXt implements Serializable {
	private static final long serialVersionUID = 1L;
	public String chaR;
	

    public TeXt(int size, String chaR1,  String chaR2,  String chaR3, String chaR4) {
		this.size = size;
		this.chaR1 = chaR1;
		this.chaR2 = chaR2;
		this.chaR3 = chaR3;
		this.chaR4 = chaR4;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

//    @Override
//    public String toString() {
//  	return "Car{" + "id=" + id + ", year=" + year + ", modul=" + modul + ", brand=" + brand + ", color=" + color +  '}';
    }
 

