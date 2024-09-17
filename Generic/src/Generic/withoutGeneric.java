package Generic;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class withoutGeneric {

	private Object value;

	public Object getvalue() {
		return value;
	}

	public void setvalue(Object value) {
		this.value = value;
	}

	public static void main(String[] args) {

		withoutGeneric generic = new withoutGeneric();
		generic.setvalue("Rotha PLong");

		String st = (String) generic.getvalue();
		System.out.println(st);
	}
}
