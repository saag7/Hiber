
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import entities.Salarié;
import java.util.List;
import model.Form1;
import org.hibernate.Query;
public class Ajouter_salarié extends org.apache.struts.action.Action {

     

   @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        try{
            Session session =HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Form1 frm=(Form1)form;
            //instanciation d'un objet de la class Salarié 
            Salarié s=new Salarié();
            //affecter les paramètres aux attributs de l'objet p
            s.setnomemp(frm.getnomemp());
            s.setvilleemp(frm.getvilleemp());
            s.setsexe(frm.getsexe());
            //ajouter cette instance p dans la table Salarié de la base de données data_base
            session.save(s);
            //confirmer l'opération avec commit de la transaction save (insert en sql)
            session.getTransaction().commit();
            session.close();            
            
        }catch(Exception ex){}
        //se connecter avec la table personne pour envoyer ses lignes vers la page "all_personne.jsp"
        // de forward  "listeperso"
        Session session1=HibernateUtil.getSessionFactory().openSession();
        session1.getTransaction().begin();
        Query query1=session1.createQuery("from Salarié");
        Query query2=session1.createQuery("select count(codeemp) from Salarié");
        List<Salarié> L=query1.list();
        int nbrepersonne=Integer.parseInt(query2.uniqueResult().toString());
        request.setAttribute("salarié", L);
        request.setAttribute("salr", nbrepersonne);
        session1.getTransaction().commit();
        
        return mapping.findForward("listesalar");
    }
}
