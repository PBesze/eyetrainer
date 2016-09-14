package base;
 
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.lang.*;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
 
@ManagedBean(name = "teXtService")
@ApplicationScoped
public class TeXtService implements Serializable{
 
    public List<TeXt> createTeXts(int maxsize) {
        List<TeXt> list = new ArrayList<TeXt>();
        for(int i = 1 ; i < maxsize+1 ; i++) {
         
            list.add(new TeXt(getStyle(i), getRandomChaR(), getRandomChaR(), getRandomChaR(), getRandomChaR()));
        }
         
        return list;
    }
     
    private String getStyle(int i) {
       return  "font-size:" + Integer.toString(i*5) + "px";
       
    }
     
    private Character getRandomChaR() {
       return  (char)(Math.random() * 25 + 65);
       //return  'A';
    }
     

}
