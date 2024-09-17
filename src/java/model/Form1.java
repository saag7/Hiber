
package model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
public class Form1 extends org.apache.struts.action.ActionForm {
 private String nomemp,villeemp;   
 private int sexe;
 private int  codeemp;
    public Form1() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getnomemp() {
        return nomemp;
    }

    public void setnomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    public String getvilleemp() {
        return villeemp;
    }

    public void setvilleemp(String villeemp) {
        this.villeemp = villeemp;
    }

    public int getsexe() {
        return sexe;
    }

    public void setsexe(int sexe) {
        this.sexe = sexe;
    }

    public int getcodeemp() {
        return codeemp;
    }

    public void setcodeemp(int codeemp) {
        this.codeemp = codeemp;
    }

    
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
       
        return errors;
    }
}
