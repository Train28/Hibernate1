package test;

import java.util.Scanner;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id;
        String name, apellido, email, telefono;

        System.out.println("ingresar id");
        id = sc.nextInt();
        
//        System.out.println("ingresar nombre");
//        name = sc.next();
//
//        System.out.println("ingresar apellido");
//        apellido = sc.next();
//
//        System.out.println("ingresar email");
//        email = sc.next();
//
//        System.out.println("ingresar telefono");
//        telefono = sc.next();

        PersonaDAO p = new PersonaDAO();
        Persona per = new Persona();

        per.setIdPersona(id);
//        per.setNombre(name);
//        per.setApellido(apellido);
//        per.setEmail(email);
//        per.setTelefono(telefono);
        /*
        p.listar();*/

       /* p.insertar(per);*/
       
       
        System.out.println(p.buscarPersona(per.getIdPersona()));

    }
}
