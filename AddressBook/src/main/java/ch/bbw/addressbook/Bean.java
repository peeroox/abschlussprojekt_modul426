package ch.bbw.addressbook;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named
@RequestScoped
public class Bean {

	  @ManagedProperty(value = "#{param.id}")
	  private String id;

	  public void init(){
		  id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
	  }
	  
	  
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	  
	 
}
		