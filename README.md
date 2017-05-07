HTMLis form, mis saadab kontrollerisse andmed ja andmed liiguvad funktsiooni.
Testidega kontrollitakse funktsioonide tagastatud tulemusi, ning kas need sobivad mingite kriteeriumitega.
REST-teenus kasutab nelja operaatorit: PUT, GET, POST ja DELETE. PUT loob uue ressursi,
mida on võimalik kustutada DELETE-ga. GET võtab mingi ressursi hetkese oleku ja POST saadab uue oleku
ressursile. Ressursi kohta on ka saadaval metadata. Seda kasutatakse failide autentimiseks, kontrollimiseks
ning edastamise errorite tuvastamiseks.

@SpringBootApplication
@RestController
public class Application{
    @Autowired
	private ManageTable manager;

	@RequestMapping("/create")
	String create(String firstName, String lastName, Integer salary){
		manager.save(new Salary(firstName, lastName, salary));
		return "Salary saved!";
	
	public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }	
}
	

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormTest{


	@Autowired
	private ManageTable manager;

	@Test
	public void saveTest() {
		Salary salary = new Salary("M", "R", -1);
		manager.save(salary);
		Assert.assertNotNull(manager.findOne(salary.id));
	}
	@Test
	public void saveTest2(){
		Salary salary = new Salary("", "", 1000);
		manager.save(salary);
		Assert.assertNotNull(manager.findOne(salary.id));
		
	}

}