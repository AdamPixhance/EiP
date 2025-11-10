public class BankApplication {
	public static void main(String[] args) {
		Person p1 = new Person("Max", "Mustermann");
		Person p2 = new Person("Erwin", "Huber");
		//Person p3 = new Person(); // geht nicht, weil Default-Konstruktor überschrieben

		Account[] accounts = new Account[2];
		accounts[0] = new Account("123456", p1);
		accounts[0].deposit(200);
		accounts[1] = new Account("654321", p2);
		accounts[1].deposit(500);

		/* balanceInCents is private, also können wir nicht direkt darauf zugreifen */
		// account1.balanceInCents += 100000000;
		System.out.println("Guthaben account1: " + accounts[0].getBalanceInCents());
		System.out.println("Guthaben account2: " + accounts[1].getBalanceInCents());

		System.out.println();

		if (!accounts[0].withdraw(300)) {
			System.out.println("Abheben nicht möglich, nicht genug Guthaben!");
		}
		System.out.println("Guthaben account1: " + accounts[0].getBalanceInCents());
		System.out.println("Guthaben account2: " + accounts[1].getBalanceInCents());

		System.out.println();

		accounts[0].transferTo(accounts[1], 400);
		System.out.println("Guthaben account1: " + accounts[0].getBalanceInCents());
		System.out.println("Guthaben account2: " + accounts[1].getBalanceInCents());

		// TODO: alle Accounts ausgeben, die negatives Guthaben haben
	}
}
