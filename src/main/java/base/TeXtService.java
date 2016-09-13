package base;
 
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import base.TeXt;
 
@ManagedBean(name = "teXtService")
@ApplicationScoped
public class TeXtService {
     
    

    private final static String[] chaR;
     

     
    public List<TeXt> createTeXts(int maxsize) {
        List<TeXt> list = new ArrayList<TeXt>();
        for(int i = 2 ; i < maxsize ; i++) {
            list.add(new TeXt(i*4, getRandomChaR(), getRandomChaR(), getRandomChaR(), getRandomChaR()));
        }
         
        return list;
    }
     

     
    private Character getRandomChaR() {
       //return  (char)(Math.random() * 25 + 65);
       return  Character.toChars(65);
    }
     

}
