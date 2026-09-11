package d0911;

public class Application {

	public static void main(String[] args) {

		Select.findAll();
		Delete.deleteByPhoneNum("");
		Update.updateMemoByPhoneNum("010-3333-3333", "just friend");
		Insert.add("010-0000-0000", "zeroMan", null);
		Select.findAll();
		
		Select.findByPhoneNum("010-0000-0000");
		Select.findByIncludedName("woman_");
	}

}
