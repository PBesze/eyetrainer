package base;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="taSk")
@SessionScoped
public class TaSk{

	public String side;


	public String outcome(){

		

		return "Hoppá";
	}



	//getter and setter methods

}
