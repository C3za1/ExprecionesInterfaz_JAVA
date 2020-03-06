
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author cesar
 */
public class expreciones 
{
public boolean Vclave(String Eclave)
    {
     String Clave=Eclave;
  //La contraseña debe tener al entre 8 y 16 caracteres, al menos un dígito, al menos una minúscula y al menos una mayúscula
       Pattern jefe = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{5,16}$");
       Matcher comparar = jefe.matcher(Clave);
       if (comparar.matches())
       {
            System.out.println("Correcta");
            return true;
            
        }
        else
       {
            System.out.println("Error ");
            return false;
       }
    }

public boolean Vnombre(String Enombre)
    {
     String nombre=Enombre;
       Pattern jefe = Pattern.compile("[A-Z]\\w+");
       Matcher comparar = jefe.matcher(nombre);
       if (comparar.matches())
       {
            System.out.println("Correcta");
            return true;
            
        }
        else
       {
            System.out.println("Error ");
            return false;
       }
    }


public boolean Vcorreo(String Ecorreo)
    {
     String Correo=Ecorreo;
       Pattern jefe = Pattern.compile("[A-Za-z0-9-_]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
       Matcher comparar = jefe.matcher(Correo);
       if (comparar.matches())
       {
            System.out.println("Correcta");
            return true;
            
        }
        else
       {
            System.out.println("Error ");
            return false;
       }
    }

public boolean Vcp(String Ecp)
    {
     String cp=Ecp;
       Pattern jefe = Pattern.compile("72+([0-9]{3}$)");
       Matcher comparar = jefe.matcher(cp);
       if (comparar.matches())
       {
            System.out.println("Correcta");
            return true;
            
        }
        else
       {
            System.out.println("Error ");
            return false;
       }
    }

}
