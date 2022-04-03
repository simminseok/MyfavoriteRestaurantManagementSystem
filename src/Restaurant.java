public class Restaurant {
    int[] favoliteranking = new int[50];
	String[] name = new String[50];
	String[] address = new String[50];
	String[] phone = new String[50];

	public Restaurant() {   
	}

	public Restaurant(int favoliteranking, String name, String address, String phone, int num) {
		super();
		this.favoliteranking[num] = favoliteranking;
		this.name[num] = name;
		this.address[num] = address;
		this.phone[num] = phone;
	}

	public void printInfo(int num) {
		System.out.println("favoliteranking: " + favoliteranking[num] + " name: " + name[num] + " address:" + address[num] + " phone:" + phone[num]);      
	}

}