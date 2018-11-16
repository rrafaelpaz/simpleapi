package au.com.simpleapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import au.com.simpleapi.model.Person;

@RestController
@RequestMapping(value = "person")
public class PersonController {

	@RequestMapping(value = "/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Person>> getAllPersons() {
		List<Person> response = getAll();
		return new ResponseEntity<List<Person>>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/first", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Person> getFirstPerson() {
		Person response = getAll().get(0);
		return new ResponseEntity<Person>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/last", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Person> getLastPerson() {
		Person response = getAll().get(9);
		return new ResponseEntity<Person>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/middle", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Person> getMiddlePerson() {
		Person response = getAll().get(4);
		return new ResponseEntity<Person>(response, HttpStatus.OK);
	}

	private List<Person> getAll() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Robert", "Swanson", 44));
		persons.add(new Person("Suzane", "Robert", 15));
		persons.add(new Person("Craig", "Thomas", 34));
		persons.add(new Person("Dave", "Steward", 29));
		persons.add(new Person("John", "Jones", 31));
		persons.add(new Person("Chris", "Weidman", 35));
		persons.add(new Person("George", "SaintPierre", 27));
		persons.add(new Person("Tony", "Fergunson", 27));
		persons.add(new Person("Luke", "Rockhold", 63));
		persons.add(new Person("Daniel", "Cormier", 41));

		return persons;
	}

}
