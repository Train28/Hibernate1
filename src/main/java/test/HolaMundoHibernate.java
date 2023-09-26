package test;

import java.util.Scanner;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {

    public static void main(String[] args) {

        PersonaDAO p = new PersonaDAO();
        Persona per = new Persona();
        Scanner sc = new Scanner(System.in);
        int id, var;
        String name, apellido, email, telefono;

        System.out.println("wHAT ACTION U WANT TO DO");
        System.out.println("1. INSERT 2. SEARCH BY ID 3. SHOW ALL PEOPLE");

        var = sc.nextInt();
        switch (var) {
            case 1:
                System.out.println("insert id");
                id = sc.nextInt();

                System.out.println("insert name");
                name = sc.next();

                System.out.println("insert last name");
                apellido = sc.next();

                System.out.println("insert email");
                email = sc.next();

                System.out.println("insert phone number");
                telefono = sc.next();
                per.setIdPersona(id);
                per.setNombre(name);
                per.setApellido(apellido);
                per.setEmail(email);
                per.setTelefono(telefono);
                p.insertar(per);
                break;

            case 2:
                System.out.println("insert id");
                id = sc.nextInt();
                System.out.println(p.buscarPersona(id));                               
                break;
                
                case 3:
                    p.listar();
                break;

            default:
                throw new AssertionError();
        }


    }
}
