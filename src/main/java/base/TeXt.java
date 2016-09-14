
package base;

import java.io.Serializable;

public class TeXt implements Serializable {
	private static final long serialVersionUID = 1L;
	public Character chaR1,chaR2,chaR3,chaR4;
	public String fontsizeStyle;
	public int fontsize;
	

    public TeXt(int fontsize, String  fontsizeStyle, Character chaR1,  Character chaR2,  Character chaR3, Character chaR4) {
		this.fontsize = fontsize;
		this.fontsizeStyle = fontsizeStyle;
		this.chaR1 = chaR1;
		this.chaR2 = chaR2;
		this.chaR3 = chaR3;
		this.chaR4 = chaR4;
		
	}
	
	public int getFontsize() {
		return fontsize;
	}

	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}
	
		public String getFontsizeStyle() {
		return fontsizeStyle;
	}

	public void setFontsizeStyle(String fontsizeStyle) {
		this.fontsizeStyle = fontsizeStyle;
	}

	public Character getChaR1() {
		return chaR1;
	}

	public void setChaR1(Character chaR1) {
		this.chaR1 = chaR1;
	}
	
		public Character getChaR2() {
		return chaR2;
	}

	public void setChaR2(Character chaR2) {
		this.chaR2 = chaR2;
	}
	
		public Character getChaR3() {
		return chaR3;
	}

	public void setChaR3(Character chaR3) {
		this.chaR1 = chaR3;
	}
		public Character getChaR4() {
		return chaR4;
	}

	public void setChaR4(Character chaR4) {
		this.chaR1 = chaR4;
	}



