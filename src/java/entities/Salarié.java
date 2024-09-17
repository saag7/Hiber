package entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="salarié"
    ,catalog="Sodisma"
)
public class Salarié  implements java.io.Serializable {


     private Integer codeemp;
     private String nomemp;
     private String villeemp;
     private int sexe;

    public Salarié() {
    }

    public Salarié(Integer codeemp,String nomeemp, String villeemp, int sexe) {
       this.codeemp = codeemp;
       this.nomemp = nomemp;
       this.villeemp = villeemp;
       this.sexe = sexe;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="codeemp", unique=true, nullable=false)
    public Integer getcodeemp() {
        return this.codeemp;
    }
    
    public void setcodeemp(Integer codeemp) {
        this.codeemp = codeemp;
    }

    
    @Column(name="nompemp", nullable=false, length=30)
    public String getnomemp() {
        return this.nomemp;
    }
    
    public void setnomemp(String nomemp) {
        this.nomemp = nomemp;
    }

    
    @Column(name="ville", nullable=false, length=30)
    public String getvilleemp() {
        return this.villeemp;
    }
    
    public void setvilleemp(String villeemp) {
        this.villeemp = villeemp;
    }

    
    @Column(name="sexe", nullable=false)
    public int getsexe() {
        return this.sexe;
    }
    
    public void setsexe(int sexe) {
        this.sexe = sexe;
    }




}


