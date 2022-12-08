import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // se crean los 5 objetos de tipo persona

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();

        // se setean nombre y apelledo al objeto persona1

        persona1.setNombre("paulina");
        persona1.setApellido("lopez");
        // se setean nombre y apelledo al objeto persona2
        persona2.setNombre("andres");
        persona2.setApellido("mejia");
        // se setean nombre y apelledo al objeto persona3
        persona3.setNombre("filomena");
        persona3.setApellido("mendez");
        // se setean nombre y apelledo al objeto persona4
        persona4.setNombre("jose");
        persona4.setApellido("tellez");
        // se setean nombre y apelledo al objeto persona5
        persona5.setNombre("maria");
        persona5.setApellido("gonzalez");
        //se agregan los objetos persona a la lista
        List<Persona> listaPer = new ArrayList<Persona>();
        listaPer.add(persona1);
        listaPer.add(persona2);
        listaPer.add(persona3);
        listaPer.add(persona4);
        listaPer.add(persona5);

        // recorremos la lista de objetos persona
        /*for (Persona persona:listaPer ){
            System.out.println("nombre: " + persona.getNombre());
            System.out.println("apellido: " + persona.getApellido());

        }
      */

        for (int i= 0; i<=listaPer.size()-1; i++){
            Persona pers = new Persona();
            pers = listaPer.get(i);
            System.out.println("nombre: " + pers.getNombre());
            System.out.println("apellido: " + pers.getApellido());

        }
    }
}