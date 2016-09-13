package base;
 
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import base.TeXt;
import base.TeXtService;
 
@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable {
     
    private List<TeXt> teXts;
     
    @ManagedProperty("#{TeXtService}")
    private TeXtService service;
 
    @PostConstruct
    public void init() {
        teXts = service.createTeXts(10);
    }
     
    public List<TeXt> getTeXts() {
        return teXts;
    }
 
    public void setService(TeXtService service) {
        this.service = service;
    }
}