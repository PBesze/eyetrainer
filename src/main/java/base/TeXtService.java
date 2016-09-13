package base;
 
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

 
@ManagedBean(name = "teXtService")
@ApplicationScoped
public class TeXtService {
 
    public List<TeXt> createTeXts(int maxsize) {
        List<TeXt> list = new ArrayList<TeXt>();
        for(int i = 2 ; i < maxsize ; i++) {
         
            list.add(new TeXt(getStyle, getRandomChaR(), getRandomChaR(), getRandomChaR(), getRandomChaR()));
        }
         
        return list;
    }
     
    private String getStyle() {
       return  'font-size:' + '20' + 'px';
       
    }
     
    private Character getRandomChaR() {
       return  (char)(Math.random() * 25 + 65);
       //return  'A';
    }
     

}
