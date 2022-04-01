public class Restaurant {
    int favoliteranking;
	String name;
	String address;
	String phone;

	public Restaurant() {   
	}

	public Restaurant(String name) {
		this.name = name;
	}

	public Restaurant(int favoliteranking, String name, String address, String phone) {
		super();
		this.favoliteranking = favoliteranking;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public void printInfo() {
		System.out.println("favoliteranking: " + favoliteranking + " name: " + name + " address:" + address + " phone:" + phone);      
	}

}