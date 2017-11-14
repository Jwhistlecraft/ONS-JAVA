package SingletonBanks;

public class BankClass {

	static BankClass xyz;

	private BankClass() {}

	public static BankClass create() {
		if (xyz == null) {
			xyz = new BankClass();
		}
		return xyz;
	}

}
