package base;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="taSk")
@SessionScoped
public class TaSk{
public static int stepcounter = 0;
    public int getSide() {
    	stepcounter++;
 //   	if (stepcounter%3 == 0 ) {return "Can you read it with your LEFT EYE?";}
 //   	if (stepcounter%3 == 1 ) {return "Can you read it with your RIGHT EYE?";}
 //   	else {return "Can you read it with your TWO EYES?";}
 return stepcounter;
    }





	//getter and setter methods

}
