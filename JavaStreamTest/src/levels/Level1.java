package levels;

import models.Employee;
import utils.Data;

import java.util.List;

public class Level1 {
	public static void main(String[] args) {
		List<Employee> employees = Data.employees();
System.out.println("************************************************q1");
		/* TO DO 1: Afficher tous les employes */
		          employees.stream().forEach(e->System.out.println(e));

		/*
		 * TO DO 2: Afficher les employees dont le nom commence par la lettre n
		 */
                System.out.println("************************************************q2");
		employees.stream().filter(e->e.getName().startsWith("n")).forEach(e->System.out.println(e));
            System.out.println("****************************************************q3");
		/*
		 * TO DO 3: Afficher les employees dont le nom commence par la lettre n
		 * et le salaire> 1000
		 */
                //First Way
		employees.stream().filter((e->e.getName().startsWith("n")&&e.getSalary()>1000)).forEach(e->System.out.println(e));
             
                

		/*
		 * TO DO 4: Afficher les employees dont le nom commence par la lettre s
		 * tri�s par salaire
		 */
             
                //First Way
		System.out.println("****************************************************q4");
                employees.stream().filter(e->e.getName().startsWith("s")).sorted((e1,e2)->e1.getSalary()-e2.getSalary()).forEach(e->System.out.println(e));
             
               
	
		 /* TO DO 5: Afficher les noms des employees dont le salaire > 600 avec 2
		 * mani�res diff�rentes
		 */
                 System.out.println("****************************************************q5");
		employees.stream().filter(e->e.getSalary()>600).forEach(e->System.out.println(e.getName()));
                  
                        
		
System.out.println("****************************************************q6");
		/*
		 * TO DO 6: Ajouter 200 D pour les employees dont le nom commence avec m
		 * et les affich�s ensuite
		 */
                
		employees.stream().filter(e->e.getName().startsWith("m")).forEach(e->{e.setSalary(e.getSalary()+200);System.out.println(e);});
                
employees.stream().filter(e->e.getPost().startsWith("t")).forEach(e->System.out.println(e.getName()));
	}
}
