
Andmete muutmine:

  Employee employee = em.find(Employee.class, 1);
 
  em.getTransaction().begin();
  employee.setNickname("Joe the Plumber");
  em.getTransaction().commit();
  
 Andmete lisamine:
 
   Employee employee = new Employee("Samuel", "Joseph", "Wurzelbacher");
  em.getTransaction().begin();
  em.persist(employee);
  em.getTransaction().commit();
  
 Primaarvõtme abil otsimine:
  
  Employee employee = em.find(Employee.class, 1);
  
  