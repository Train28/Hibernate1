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

        System.out.println("Ingresar la accion a realizar");
        System.out.println("1. Insertar 2. Buscar 3. Listar");

        var = sc.nextInt();
        switch (var) {
            case 1:
                System.out.println("ingresar id");
                id = sc.nextInt();

                System.out.println("ingresar nombre");
                name = sc.next();

                System.out.println("ingresar apellido");
                apellido = sc.next();

                System.out.println("ingresar email");
                email = sc.next();

                System.out.println("ingresar telefono");
                telefono = sc.next();
                per.setIdPersona(id);
                per.setNombre(name);
                per.setApellido(apellido);
                per.setEmail(email);
                per.setTelefono(telefono);
                p.insertar(per);
                break;

            case 2:
                System.out.println("ingresar id");
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
