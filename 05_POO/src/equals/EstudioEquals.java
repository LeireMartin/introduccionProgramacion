package equals;

import excepciones.CampoVacioException;
import excepciones.DniException;
import modelo.Persona1;

public class EstudioEquals {


    public EstudioEquals(){
        try {
            Persona1 p1=new Persona1("Ale","Lopez","32088831J");
            Persona1 p2=new Persona1("Ale", "Lopez","32088831J");
        } catch (DniException | CampoVacioException e) {

            // TODO: handle exception
        }
   


    }
}
